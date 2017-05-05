package br.crm.service.impl.customer.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.OrderIDUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.cart.CustomerCartMapper;
import br.crm.mapper.customer.order.CustomerOrderCartMapper;
import br.crm.mapper.customer.order.CustomerOrderMapper;
import br.crm.mapper.customer.order.CustomerOrderPayInfoMapper;
import br.crm.mapper.customer.order.CustomerOrderRefundMapper;
import br.crm.mapper.customer.order.self.CustomerOrderSelfMapper;
import br.crm.mapper.customer.patient.CustomerOrderReceiptMapper;
import br.crm.mapper.customer.patient.CustomerPatientMapper;
import br.crm.mapper.dept.OrganizationDeptMapper;
import br.crm.mapper.patient.PatientMapper;
import br.crm.mapper.patient.exam.depart.PatientExamDepartMapper;
import br.crm.mapper.patient.examItem.PatientExamItemMapper;
import br.crm.mapper.patient.feeItem.PatientFeeItemMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderCart;
import br.crm.pojo.customer.order.CustomerOrderCartExample;
import br.crm.pojo.customer.order.CustomerOrderExample;
import br.crm.pojo.customer.order.CustomerOrderExample.Criteria;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.pojo.customer.order.CustomerOrderPayInfoExample;
import br.crm.pojo.customer.order.CustomerOrderRefund;
import br.crm.pojo.customer.order.CustomerOrderRefundExample;
import br.crm.pojo.customer.patient.CustomerOrderReceipt;
import br.crm.pojo.customer.patient.CustomerPatient;
import br.crm.pojo.customer.patient.CustomerPatientExample;
import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.patient.Patient;
import br.crm.pojo.patient.exam.depart.PatientExamDepartWithBLOBs;
import br.crm.pojo.patient.examItem.PatientExamItemWithBLOBs;
import br.crm.pojo.patient.feeItem.PatientFeeItem;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.service.customer.order.CustomerOrderService;
import br.crm.service.customer.order.wxpay.WxpayService;
import br.crm.vo.customer.order.CustomerOrderVo;
import br.order.redis.redis.RedisService;
import br.order.user.pojo.empCom.Enterprise;
import br.order.user.pojo.empComUser.EnterpriseEmp;
import br.order.user.service.empCom.EnterpriseService;
import br.order.user.service.empComDept.EnterpriseDepService;
import br.order.user.service.empComUser.EnterpriseEmpService;
import br.order.user.vo.empUser.CustomerRegistVo;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

	@Autowired
	private CustomerOrderMapper customerOrderMapper;

	@Autowired
	private CustomerCartMapper customerCartMapper;

	@Autowired
	private CustomerOrderCartMapper customerOrderCartMapper;

	@Autowired
	private EnterpriseService enterpriseService;

	@Autowired
	private PatientMapper patientMapper;

	@Autowired
	private CustomerOrderSelfMapper customerOrderSelfMapper;
	@Autowired
	private CustomerPatientMapper customerPatientMapper;

	@Autowired
	private EnterpriseEmpService enterpriseEmpService;

	@Autowired
	private EnterpriseDepService enterpriseDepService;

	@Autowired
	private OrganizationExamSuiteMapper organizationExamSuiteMapper;// 套餐

	@Autowired
	private OrganizationUserMapper organizationUserMapper;// 医生

	@Autowired
	private OrganizationDeptMapper organizationDeptMapper;// 科室

	@Autowired
	private PatientFeeItemMapper patientFeeItemMapper;// 病人收费项

	@Autowired
	private PatientExamDepartMapper patientExamDepartMapper;// 病人检查项科室表

	@Autowired
	private PatientExamItemMapper patientExamItemMapper;// 体检者检查项目

	@Autowired
	private CustomerOrderReceiptMapper customerOrderReceiptMapper;// 发票

	@Autowired
	private CustomerOrderRefundMapper customerOrderRefundMapper;// 退款表

	@Autowired
	private CustomerOrderPayInfoMapper customerOrderPayInfoMapper;// 支付明細表表

	@Autowired
	private WxpayService wxpayService;// 微信接口

	@Autowired
	private RedisService redisService;


	@Override
	public PageInfo<CustomerOrderVo> getCustomerOrderByPage(Integer page, Integer rows, CustomerOrderVo customerOrderVo) {
		PageHelper.startPage(page, rows);
		List<CustomerOrderVo> list = customerOrderSelfMapper.selectByParam(customerOrderVo);
		for (CustomerOrderVo customerOrderVo2 : list) {
			if (customerOrderVo2.getCustomerName() == null) {
				customerOrderVo2.setCustomerName("");
			}
		}
		PageInfo<CustomerOrderVo> pageInfo = new PageInfo<CustomerOrderVo>(list);
		return pageInfo;
	}

	@Override
	public List<CustomerOrder> getAllCustomerOrder() {
		CustomerOrderExample example = new CustomerOrderExample();
		example.createCriteria().andCustomerOrderStatusEqualTo(0);
		return customerOrderMapper.selectByExample(example);

	}

	@Override
	public CustomerOrderVo getCustomerOrderById(String customerPatientName, String examSuiteId, String examTime) {
		return customerOrderSelfMapper.selectByPrimaryKey(customerPatientName, examSuiteId, examTime);
	}

	@Override
	public int insertCustomerOrder(CustomerOrder customerOrder) {
		customerOrder.setCustomerOrderId(UUIDUtils.getId());
		customerOrder.setCustomerOrderCreateTime(new Date());
		customerOrder.setCustomerOrderEditTime(customerOrder.getCustomerOrderEditTime());
		customerOrder.setOrderStatus(0);
		return customerOrderMapper.insertSelective(customerOrder);
	}

	@Override
	public int updateCustomerOrder(CustomerOrder customerOrder) {
		return customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
	}

	@Override
	public CustomerOrder getCustomerOrder(String orderNo) {

		CustomerOrderExample example = new CustomerOrderExample();
		Criteria createCriteria = example.createCriteria();
		if (orderNo != null) {
			createCriteria.andOrderNoEqualTo(orderNo);
		}
		List<CustomerOrder> list = customerOrderMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addCustomerOrder
	 * </p>
	 * <p>
	 * Description: 提交订单
	 * </p>
	 * 
	 * @param ids
	 * @return
	 * @see br.crm.service.customer.order.CustomerOrderService#addCustomerOrder(java.util.List)
	 */
	@Override
	public List<Map<String, String>> addCustomerOrder(CustomerOrderVo customerOrderVo, CustomerRegistVo customer) {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		// 订单表
		CustomerOrder customerOrder = new CustomerOrder();
		try {
			BeanUtils.copyProperties(customerOrder, customerOrderVo);
			customerOrder.setCustomerOrderId(UUIDUtils.getId());// 订单ID
			customerOrder.setOrderNo(OrderIDUtils.genOrderId() + "");// 订单号
			customerOrder.setOrderStatus(1);// 提交订单状态
			List<String> cartids = new ArrayList<String>();
			String ids = customerOrderVo.getCartIds();
			if (ids.contains(",")) {
				String[] str = ids.split(",");
				for (String s : str) {
					cartids.add(s);
				}
			} else {
				cartids.add(ids);
			}
			Double price = 0D;
			for (String cartId : cartids) {
				CustomerCart customerCart = customerCartMapper.selectByPrimaryKey(cartId);
				BigDecimal bigDecimal = customerCart.getPrice();
				Double i = new Double(bigDecimal.toString());
				price += i;
				customerCart.setCartStatus(1);// 购物车里面商品状态改变
				customerCartMapper.updateByPrimaryKeySelective(customerCart);
				customerOrder.setCustomerId(customerCart.getCustomerId());// 订单表加入用户ID
				// 加入订单与购物车中间表
				CustomerOrderCart customerOrderCart = new CustomerOrderCart();
				customerOrderCart.setCustomerOrderCartId(UUIDUtils.getId());
				customerOrderCart.setCustomerOrderNo(customerOrder.getOrderNo());// 订单号
				customerOrderCart.setCustomerCartId(customerCart.getCartId());// 购物车
				customerOrderCart.setOrgId(customerCart.getOrgId());//机构ID
				customerOrderCart.setOrgName(customerCart.getOrgName());//机构名称
				customerOrderCart.setOrgBranchId(customerCart.getBranchId());//门店id
				customerOrderCart.setOrgBranchName(customerCart.getBranchName());//门店名称
				customerOrderCart.setCustomerOrderCartStatus(0);
				customerOrderCart.setCustomerOrderCartCreateTime(new Date());
				customerOrderCart.setCustomerOrderCartEditTime(new Date());
				customerOrderCartMapper.insertSelective(customerOrderCart);

			}
			customerOrder.setOrderAmount(new BigDecimal(price.toString()));// 价格
			customerOrder.setOrderPayAmount(new BigDecimal(price.toString()));
			customerOrder.setCustomerOrderStatus(0);
			customerOrder.setCustomerOrderCreateTime(new Date());
			customerOrder.setCustomerOrderEditTime(new Date());
			customerOrder.setOrderLinkman(customer.getCustomerInfoName());// 联系人
			customerOrder.setOrderPhone(customer.getCustomerInfoPhone());// 电话
			customerOrder.setOrderNumber(cartids.size());// 数量
			if (customer.getCustomerCompany().intValue() == 1) {
				Enterprise enterprise = enterpriseService.getEnterpriseById(customer.getCustomerCompanyId());
				if (null != enterprise) {
					customerOrder.setEnterpriseId(enterprise.getEnterpriseId());
					customerOrder.setEnterpriseName(enterprise.getEnterpriseFullName());
				}
			}
			// 加入发票
			if (null != customerOrderVo.getReceiptStatus() && customerOrderVo.getReceiptStatus().intValue() == 1) {
				customerOrder.setReceiptStatus(1);
				// 加入发票表中
				CustomerOrderReceipt customerOrderReceipt = new CustomerOrderReceipt();
				customerOrderReceipt.setPatientReceiptId(UUIDUtils.getId());// 主键ID
				customerOrderReceipt.setIdReceipttype(customerOrderVo.getCustomerOrderReceipt().getIdReceipttype());// 发票类型表ID
				customerOrderReceipt.setPatientReceiptType(customerOrderVo.getCustomerOrderReceipt().getPatientReceiptType());// 抬头类型
				if (customerOrderVo.getCustomerOrderReceipt().getPatientReceiptType().intValue() == 1) {
					// 个人ID
					customerOrderReceipt.setCustomerInfoId(customer.getCustomerInfoId());
				} else {
					// 企业ID
					Enterprise enterprise = enterpriseService.getEnterpriseById(customer.getCustomerCompanyId());
					if (null != enterprise) {
						customerOrderReceipt.setEnterpriseId(enterprise.getEnterpriseId());
					}
				}
				// customerOrderReceipt.setOrgId(customerOrderVo.getCustomerOrderReceipt().getOrgId());//
				// 机构id
				// customerOrderReceipt.setExamSuiteId(customerOrderVo.getCustomerOrderReceipt().getExamSuiteId());//
				// 套餐id
				customerOrderReceipt.setPatientReceiptName(customerOrderVo.getCustomerOrderReceipt().getPatientReceiptName());
				customerOrderReceipt.setPatientReceiptContent(customerOrderVo.getCustomerOrderReceipt().getPatientReceiptContent());
				customerOrderReceipt.setPatientReceiptPrice(new BigDecimal(price.toString()));// 发票金额
				// 订单号
				customerOrderReceipt.setOrderNo(customerOrder.getOrderNo());
				customerOrderReceipt.setPatientReceiptStatus(0 + "");// 未打印
				customerOrderReceipt.setPatientReceiptCreateTime(new Date());
				customerOrderReceipt.setPatientReceiptEditTime(new Date());
				customerOrderReceiptMapper.insertSelective(customerOrderReceipt);
			}
			// 1.1 加入订单表
			redisService.set(RedisConstant.br_order_status.concat(customerOrder.getOrderNo().toString()), "1");// 加入Redis中订单状态状态
			customerOrderMapper.insertSelective(customerOrder);
			CustomerPatientExample customerPatientExample = new CustomerPatientExample();
			customerPatientExample.createCriteria().andCustomerPatientStatusEqualTo(0).andCustomerIdEqualTo(customer.getCustomerInfoId());
			List<CustomerPatient> customerPatientList = customerPatientMapper.selectByExample(customerPatientExample);
			if (CollectionUtils.isNotEmpty(customerPatientList)) {
				for (CustomerPatient customerPatient : customerPatientList) {
					// 1.2加入病人表patient
					Patient patient = new Patient();
					patient.setPatientId(UUIDUtils.getId());// 主键ID
					patient.setCustomerOrderId(customerOrder.getCustomerOrderId());// 订单ID
					patient.setCustomerOrderCurtId(customerPatient.getCartId());// 购物车id
					// 身份证号
					if (customerPatient.getCustomerCertificateType() == 1) {
						patient.setPatientIdCardNo(customerPatient.getCustomerPatientIdCard());
					}
					// 是否开通企业
					if (customer.getCustomerCompany().intValue() == 1) {
						patient.setEnterpriseId(customer.getCustomerCompanyId());// 单位ID
						Enterprise enterprise = enterpriseService.getEnterpriseById(customer.getCustomerCompanyId());
						if (null != enterprise) {
							patient.setEnterpriseName(customer.getEnterpriseFullName());// 单位名称
						}
						EnterpriseEmp emp = enterpriseEmpService.getEnterpriseEmpByInfoId(customer.getCustomerInfoId());// 根据用户的id查询员工信息
						if (null != emp) {
							patient.setEnterpriseDep(emp.getEnterpriseDepId());// 部门ID
							patient.setEnterpriseDepName(enterpriseDepService.getEnterpriseDepById(emp.getEnterpriseDepId()).getEnterpriseDepName());
						}
					}
					patient.setPatientName(customerPatient.getCustomerPatientName());// 姓名
					patient.setSexId(customerPatient.getSexId());// 性别id
					patient.setSexName(customerPatient.getSexName());// 性别名称
					patient.setPositionPhone(customerPatient.getCustomerPatientPhone());// 电话
					patient.setPatientCreateTime(new Date());
					patient.setPatientEditTime(new Date());
					patient.setPatientStatus(0);
					// 添加到病人表中
					patientMapper.insertSelective(patient);
					// 病人检查项科室表
					PatientExamDepartWithBLOBs pxdwb = new PatientExamDepartWithBLOBs();
					// 病人ID
					pxdwb.setPatientId(patient.getPatientId());
					// 病人姓名
					pxdwb.setPatientName(patient.getPatientName());
					// 根据病人ID查询套餐---查询科室列表
					Patient pat = patientMapper.selectByPrimaryKey(patient.getPatientId());
					if (null != pat) {
						CustomerCart cart = customerCartMapper.selectByPrimaryKey(pat.getCustomerOrderCurtId());
						if (null != cart) {
							OrganizationExamSuite suite = organizationExamSuiteMapper.selectByPrimaryKey(cart.getExamSuiteId());
							if (null != suite) {
								String str = redisService.get(RedisConstant.br_order_orgExamFeeItemSuite_examSuiteId.concat(suite.getExamSuiteId()));
								if (StringUtils.isNotEmpty(str)) {
									List<String> array = JSONObject.parseArray(str, String.class);
									if (CollectionUtils.isNotEmpty(array)) {
										for (String feeiId : array) {// 收费项目ID
																		// 5,7,8,9
											// 病人收费项
											PatientFeeItem pfi = new PatientFeeItem();
											pfi.setPatientFeeItemId(UUIDUtils.getId());// 主键ID
											pfi.setPatientId(patient.getPatientId());// 病人ID
											pfi.setExamFeeItemId(feeiId);// 收费项id
											String examFeeItemId = redisService.get(RedisConstant.br_order_orgExamFeeItem_id.concat(feeiId));
											if (StringUtils.isNotEmpty(examFeeItemId)) {
												OrganizationExamFeeItem feeItem = JsonUtils.jsonToPojo(examFeeItemId, OrganizationExamFeeItem.class);
												if (null != feeItem) {
													pfi.setExamFeeItemName(feeItem.getExamFeeItemName());// 收费项名称
												}
											}
											pfi.setPatientFeeItemCreateTime(new Date());
											pfi.setPatientFeeItemEditTime(new Date());
											pfi.setPatientFeeItemStatus(0);
											patientFeeItemMapper.insertSelective(pfi);
											// 查找检查项
											String ss = redisService.get(RedisConstant.br_order_orgExamFeeItemDetail_feeItemId.concat(feeiId));
											if (StringUtils.isNotEmpty(ss)) {
												List<String> itemArray = JSONObject.parseArray(ss, String.class);
												if (CollectionUtils.isNotEmpty(itemArray)) {
													for (String itemUserId : itemArray) {// 医生与检查项主键id
														String user = redisService.get(RedisConstant.br_order_orgExamItemUser_id.concat(itemUserId));
														if (StringUtils.isNotEmpty(user)) {
															OrganizationExamItemUser itemUser = JsonUtils.jsonToPojo(user, OrganizationExamItemUser.class);
															if (null != itemUser) {
																OrganizationUser doctor = organizationUserMapper.selectByPrimaryKey(itemUser.getOrganizationUserId());
																if (null != doctor) {
																	OrganizationDept dept = organizationDeptMapper.selectByPrimaryKey(doctor.getOrgBranchDeptId());
																	if (null != dept) {
																		// 主键ID
																		pxdwb.setPatientExamDepartId(UUIDUtils.getId());
																		pxdwb.setDepartId(dept.getOrgDeptId());// 科室ID
																		pxdwb.setPatientName(dept.getDepartName());// 科室名称
																		pxdwb.setConsultDoctorId(doctor.getUserId());// 医生ID
																		pxdwb.setConsultDoctorName(doctor.getUserName());// 医生名称
																		pxdwb.setPatientExamDepartCreateTime(new Date());
																		pxdwb.setPatientExamDepartEditTime(new Date());
																		pxdwb.setPatientExamDepartStatus(0);
																		patientExamDepartMapper.insertSelective(pxdwb);
																		// 插入检查项
																		PatientExamItemWithBLOBs peiwb = new PatientExamItemWithBLOBs();
																		peiwb.setPatientExamItemId(UUIDUtils.getId());// 主键ID
																		peiwb.setPatientExamDepartId(dept.getOrgDeptId());// 检验科室ID
																		peiwb.setPatientFeeItemId(feeiId);
																		;// 体检者收费项ID
																		String examItem = redisService.get(RedisConstant.br_order_orgExamItem_id.concat(itemUser.getOrganizationExamItemId()));
																		if (StringUtils.isNotEmpty(examItem)) {
																			OrganizationExamItem item = JsonUtils.jsonToPojo(examItem, OrganizationExamItem.class);
																			if (null != item) {
																				peiwb.setExamItemId(item.getExamItemId());// 检查项ID
																				peiwb.setExamItemName(item.getExamItemName());
																				;// 检查项名称
																				peiwb.setPatientExamItemCreateTime(new Date());
																				peiwb.setPatientExamItemEditTime(new Date());
																				peiwb.setPatientExamItemStatus(0);
																				patientExamItemMapper.insertSelective(peiwb);
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					// 体检者检查项目表
				}
			}

			// 返回页面
			Map<String, String> map = new HashMap<String, String>();
			map.put("orderNo", customerOrder.getOrderNo());// 订单号
			map.put("orderMoney", customerOrder.getOrderAmount() + "");// 金额
			map.put("orderId", customerOrder.getCustomerId());// 订单Id
			result.add(map);
			return result;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * <p>
	 * Title:initData
	 * </p>
	 * <p>
	 * Description:redis缓存
	 * </p>
	 * 
	 * @see br.crm.service.customer.order.CustomerOrderService#initData()
	 */
	@Override
	public void initData() {
		// 缓存订单表id

		List<CustomerOrder> list = customerOrderMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			for (CustomerOrder customerOrder : list) {
				if (!redisService.exists(RedisConstant.br_customer_order_orderNo.concat(customerOrder.getOrderNo()))) {
					redisService.set(RedisConstant.br_customer_order_orderNo.concat(customerOrder.getOrderNo()), JSONObject.toJSONString(customerOrder));
				}
			}
		}
	}

	/**
	 * <p>
	 * Title:getCustomerOrderById
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 根据订单id获取订单对象
	 * 
	 * @param customerOrderId
	 * @return
	 * @see br.crm.service.customer.order.CustomerOrderService#getCustomerOrderById(java.lang.String)
	 */
	@Override
	public CustomerOrder getCustomerOrderById(String customerOrderId) {
		return customerOrderMapper.selectByPrimaryKey(customerOrderId);
	}

	@Override
	public void updateOrderStatu(String out_trade_no) {
		redisService.set(RedisConstant.br_order_status.concat(out_trade_no), "40");// 修改Redis中订单状态状态
	}

	@Override
	public int refundCustomerOrder(CustomerOrder customerOrder) {
		
		try {
			CustomerOrderPayInfo payInfo =null;
			CustomerOrderPayInfoExample customerOrderPayInfoExample = new CustomerOrderPayInfoExample();
			customerOrderPayInfoExample.createCriteria().andOrderNoEqualTo(customerOrder.getOrderNo());
			List<CustomerOrderPayInfo> list = customerOrderPayInfoMapper.selectByExample(customerOrderPayInfoExample);
			payInfo = list.get(0);//bb20
			
			//1.1根据订单号先查询退款数据库有没有此记录
			CustomerOrderRefundExample customerOrderRefundExample =new CustomerOrderRefundExample();
			customerOrderRefundExample.createCriteria().andOrderNoEqualTo(customerOrder.getOrderNo());
			List<CustomerOrderRefund> customerOrederRefundList = customerOrderRefundMapper.selectByExample(customerOrderRefundExample);
			CustomerOrderRefund customerOrderRefund =null;
			//2.1没有的话插入退款表中
			if(CollectionUtils.isEmpty(customerOrederRefundList)){
				 customerOrderRefund = new CustomerOrderRefund();
				// 插入退款订单表
				customerOrderRefund.setCustomerOrderRefundId(UUIDUtils.getId());// 主鍵id
				customerOrderRefund.setOrderNo(customerOrder.getOrderNo());// 訂單號
				if (CollectionUtils.isNotEmpty(list)) {
					customerOrderRefund.setCustomerOrderPayInfoId(payInfo.getCustomerOrderPayInfoId()); // 支付表ID
					customerOrderRefund.setCustomerOrderPayInfoNo(payInfo.getOrderPayOrderNo());// 第三方支付交易号
				}
				customerOrderRefund.setCustomerOrderPayWayId(customerOrder.getPayWayId());// 支付渠道
				customerOrderRefund.setOrderRefundResult(0);// 退款结果 0 --正在處理
				customerOrderRefund.setCustomerId(customerOrder.getCustomerId());// 用戶id
				customerOrderRefund.setCustomerOrderRefundCreateTime(new Date());
				customerOrderRefund.setCustomerOrderRefundEditTime(new Date());
				customerOrderRefundMapper.insertSelective(customerOrderRefund);
			}else{
				//2.2有的话直接退款
				 customerOrderRefund = customerOrederRefundList.get(0);
			}
			// 2.修改订单状态
			customerOrder.setOrderStatus(33);// 33----退款申请
			customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
			// 1.1判断订单支付方式
			if (customerOrder.getPayWayId().intValue() == 1) {// 1 微信支付
				// 1.1.1调用微信退款  
				//参数(订单,订单支付明细,退款单号) 
				Map<String, String> map = wxpayService.refund(customerOrder, payInfo, customerOrderRefund.getCustomerOrderRefundId());
				System.out.println(map.get("result_code"));
				// 1.1.2修改订单状态
				if ("SUCCESS".equals(map.get("result_code"))) {
					customerOrder.setOrderStatus(35);
					customerOrder.setOrderRefundStatus(3);// 3成功
					customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
					// 1.1.3更新退款表
					customerOrderRefund.setOrderRefundOrderNo(map.get("refund_id"));// 微信退款交易号
					customerOrderRefund.setOrderRefundResult(1);// 退款结果 1 --成功
					customerOrderRefund.setOrderRefundDetails("&" + map.get("result_code") + "&" + map.get("appid") + "&" + map.get("mch_id") + "&" + map.get("nonce_str") + "&" + map.get("sign") + "&" + map.get("transaction_id") + "&" + map.get("out_trade_no") + "&" + map.get("out_refund_no") + "&" + map.get("refund_id") + "&" + map.get("refund_fee") + "&" + map.get("total_fee") + "&" + map.get("cash_fee"));// 退款详情
					int flag = customerOrderRefundMapper.updateByPrimaryKeySelective(customerOrderRefund);
					return flag;
				} else {
					customerOrder.setOrderStatus(40);// 40----退款失败
					customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
				}
			} else if (customerOrder.getPayWayId().intValue() == 2) {
				// 1.1.2等待财务操作支付宝退款
				customerOrderRefund.setOrderRefundOrderNo(OrderIDUtils.getOrderRefundId());// 微信退款交易号
				customerOrderRefundMapper.updateByPrimaryKeySelective(customerOrderRefund);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	//查询门店下的所有订单
	@Override
	public PageInfo<CustomerOrderVo> getOrderByBranchId(String branchId, Integer page, Integer rows) {
		try {
			List<CustomerOrderVo> result = new ArrayList<CustomerOrderVo>();
			List<CustomerOrder> customerOrderList = new ArrayList<CustomerOrder>();
			PageHelper.startPage(page, rows);//分页
			CustomerOrderCartExample customerOrderCartExample = new CustomerOrderCartExample();
			customerOrderCartExample.createCriteria().andOrgBranchIdEqualTo(branchId).andCustomerOrderCartStatusEqualTo(0);
			List<CustomerOrderCart> list = customerOrderCartMapper.selectByExample(customerOrderCartExample);
			if(CollectionUtils.isNotEmpty(list)){
				for (CustomerOrderCart customerOrderCart : list) {
					CustomerOrderExample customerOrderExample =new CustomerOrderExample();
					customerOrderExample.createCriteria().andCustomerOrderStatusEqualTo(0).andOrderStatusGreaterThanOrEqualTo(40).andOrderNoEqualTo(customerOrderCart.getCustomerOrderNo());
						customerOrderList = customerOrderMapper.selectByExample(customerOrderExample);
					for (CustomerOrder customerOrder : customerOrderList) {
						CustomerOrderVo customerOrderVo = new CustomerOrderVo();
						BeanUtils.copyProperties(customerOrderVo, customerOrder);
						result.add(customerOrderVo);
					}
				}
				
			}
			PageInfo<CustomerOrder> pageInfo = new PageInfo<CustomerOrder>(customerOrderList);
			PageInfo<CustomerOrderVo> pageInfoResult = new PageInfo<CustomerOrderVo>(result);
			pageInfoResult.setPages(pageInfo.getPages());
			pageInfoResult.setTotal(pageInfo.getTotal());
			pageInfoResult.setPageSize(pageInfo.getPageSize());
			return pageInfoResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
