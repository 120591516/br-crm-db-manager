package br.crm.service.impl.customer.cart;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.customer.cart.CustomerCartMapper;
import br.crm.mapper.customer.patient.CustomerPatientMapper;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.suite.OrganizationBranchSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.pojo.customer.cart.CustomerCartExample;
import br.crm.pojo.customer.cart.CustomerCartExample.Criteria;
import br.crm.pojo.customer.patient.CustomerPatient;
import br.crm.pojo.customer.patient.CustomerPatientExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.service.customer.cart.CustomerCartService;
import br.crm.service.customer.patient.CustomerPatientService;
import br.order.redis.redis.RedisService;
import br.crm.vo.customer.cart.CustomerCartVo;
import br.order.user.service.empCom.EnterpriseService;
import br.order.user.vo.empUser.CustomerRegistVo;

@Service
public class CustomerCartServiceImpl implements CustomerCartService {

	@Autowired
	private CustomerCartMapper customerCartMapper;

	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;

	@Autowired
	private DictImgMapper dictImgMapper;
	@Autowired
	private OrganizationMapper organizationMapper;

	@Autowired
	private CustomerPatientMapper customerPatientMapper;

	@Autowired
	private OrganizationExamSuiteMapper organizationExamSuiteMapper;

	@Autowired
	private EnterpriseService enterpriseService;

	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;

	@Autowired
	private RedisService redisService;


	/**
	 * <p>
	 * Title:getCustomerCartByPage
	 * </p>
	 * <p>
	 * Description:购物车分页列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @param customerCart
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#getCustomerCartByPage(java.lang.Integer,
	 *      java.lang.Integer, br.crm.pojo.customer.cart.CustomerCart)
	 */
	@Override
	public List<CustomerCartVo> getCustomerCartByPage(String customerId) {
		List<CustomerCartVo> result = new ArrayList<CustomerCartVo>();
		CustomerCartExample example = new CustomerCartExample();
		example.createCriteria().andCartStatusEqualTo(0).andCustomerIdEqualTo(customerId);
		example.setOrderByClause(" cart_create_time desc");
		List<CustomerCart> list = customerCartMapper.selectByExample(example);
		try {
			for (CustomerCart customerCart : list) {
				CustomerCartVo CustomerCartVo = new CustomerCartVo();
				BeanUtils.copyProperties(CustomerCartVo, customerCart);
				result.add(CustomerCartVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * <p>
	 * Title:getAllCustomerCart
	 * </p>
	 * <p>
	 * Description:购物车列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#getAllCustomerCart()
	 */
	@Override
	public List<CustomerCart> getAllCustomerCart() {
		CustomerCartExample example = new CustomerCartExample();
		example.createCriteria().andCartStatusEqualTo(0);
		return customerCartMapper.selectByExample(example);
	}

	/**
	 * <p>
	 * Title:insertCustomerCart
	 * </p>
	 * <p>
	 * Description: 增加购物车
	 * </p>
	 * 
	 * @param customerCart
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#insertCustomerCart(br.crm.pojo.customer.cart.CustomerCart)
	 */
	@Override
	public int insertCustomerCart(CustomerRegistVo customer, CustomerCartVo customerCartVo) {
		// 购物车ID
		customerCartVo.setCartId(UUIDUtils.getId());
		// 机构ID
		customerCartVo.setOrgId(organizationExamSuiteMapper.selectByPrimaryKey(customerCartVo.getExamSuiteId()).getOrgId());
		// 机构名称
		customerCartVo.setOrgName(organizationMapper.selectByPrimaryKey(customerCartVo.getOrgId()).getOrgShortName());
		// 门店名称
		customerCartVo.setBranchName(organizationBranchMapper.selectByPrimaryKey(customerCartVo.getBranchId()).getBranchName());
		// 图片ID与URL
		OrganizationExamSuiteImgExample organizationExamSuiteImgExample = new OrganizationExamSuiteImgExample();
		organizationExamSuiteImgExample.createCriteria().andOrgExamSuiteIdEqualTo(customerCartVo.getExamSuiteId()).andOrgExamSuiteStatusEqualTo(0).andOrgExamSuiteImgTypeEqualTo(0);
		List<OrganizationExamSuiteImg> suiteImg = organizationExamSuiteImgMapper.selectByExample(organizationExamSuiteImgExample);
		if (CollectionUtils.isNotEmpty(suiteImg)) {
			OrganizationExamSuiteImg examSuiteImg = suiteImg.get(0);
			customerCartVo.setCustomerCartImgId(examSuiteImg.getDictImgId().toString());
			customerCartVo.setCustomerCartImgUrl(dictImgMapper.selectByPrimaryKey(suiteImg.get(0).getDictImgId()).getImgLocation());
		}
		// 单价
		customerCartVo.setSinglePrice(organizationExamSuiteMapper.selectByPrimaryKey(customerCartVo.getExamSuiteId()).getExamSuiteDiscountPrice());
		BigDecimal number = new BigDecimal(customerCartVo.getCartNumber());
		// 总价
		customerCartVo.setPrice(number.multiply(customerCartVo.getSinglePrice()));
		customerCartVo.setCartStatus(0);
		//原价
		customerCartVo.setExamSuitePrice(organizationExamSuiteMapper.selectByPrimaryKey(customerCartVo.getExamSuiteId()).getExamSuiteInPrice());
		// 企业id与名称
		if (customer.getCustomerCompany().intValue() == 1) {
			customerCartVo.setEnterpriseId(customer.getCustomerCompanyId());
			customerCartVo.setEnterpriseName(enterpriseService.getEnterpriseById(customer.getCustomerCompanyId()).getEnterpriseSimpleName());
		}
		customerCartVo.setCartCreateTime(new Date());
		customerCartVo.setCartEditTime(new Date());
		// 预约时间
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(customerCartVo.getExamTimeStr());
			customerCartVo.setExamTime(date);
			int flag = customerCartMapper.insertSelective(customerCartVo);
			// 添加到购物车
			if (flag > 0) {// 添加成功添加到体检人信息
				if (CollectionUtils.isNotEmpty(customerCartVo.getCustomerList())) {
					for (CustomerPatient customerPatient : customerCartVo.getCustomerList()) {
						customerPatient.setCustomerPatientId(UUIDUtils.getId());// 主键
						customerPatient.setCartId(customerCartVo.getCartId());// 购物车ID
						customerPatient.setCustomerId(customer.getCustomerInfoId());// 用户ID
						if (customer.getCustomerCompany().intValue() == 1) {
							customerPatient.setEnterpriseId(customer.getCustomerCompanyId());
						}
						customerPatient.setCustomerPatientStatus(0);
						customerPatient.setCustomerPatientCreateTime(new Date());
						customerPatient.setCustomerPatientEditTime(new Date());
						customerPatient.setCustomerPatientExamTime(date);
						flag = customerPatientMapper.insertSelective(customerPatient);
					}
				}
			}

			return flag;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * <p>
	 * Title:updateCustomerCart
	 * </p>
	 * <p>
	 * Description:修改购物车
	 * </p>
	 * 
	 * @param customerCart
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#updateCustomerCart(br.crm.pojo.customer.cart.CustomerCart)
	 */
	@Override
	public int updateCustomerCart(CustomerCart customerCart) {
		customerCart.setCartEditTime(new Date());
		return customerCartMapper.updateByPrimaryKeySelective(customerCart);
	}

	/**
	 * <p>
	 * Title:getCustomerCart
	 * </p>
	 * <p>
	 * Description: 根据用户id获取够购物车信息
	 * </p>
	 * 
	 * @param customerId
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#getCustomerCart(java.lang.String)
	 */
	@Override
	public List<CustomerCart> getCustomerCart(String customerId) {
		CustomerCartExample example = new CustomerCartExample();
		Criteria criteria = example.createCriteria();
		criteria.andCartStatusEqualTo(0);
		if (customerId != null) {
			criteria.andCustomerIdEqualTo(customerId);
		}
		example.setOrderByClause("cart_create_time desc");
		return customerCartMapper.selectByExample(example);
	}

	@Override
	public int delectCustomerCart(List<String> cartId) {
		int i = 0;
		if (CollectionUtils.isNotEmpty(cartId)) {
			for (String id : cartId) {
				i = customerCartMapper.deleteByPrimaryKey(id);
			}
		}
		return i;
	}

	@Override
	public CustomerCartVo getCustomerCartById(String customerInfoId, String cartId) {
		CustomerCartVo customerCartVo = new CustomerCartVo();
		CustomerCartExample customerCartExample = new CustomerCartExample();
		customerCartExample.createCriteria().andCartIdEqualTo(cartId).andCustomerIdEqualTo(customerInfoId);
		List<CustomerCart> list = customerCartMapper.selectByExample(customerCartExample);
		if (CollectionUtils.isNotEmpty(list)) {
			CustomerCart cart = list.get(0);
			try {
				BeanUtils.copyProperties(customerCartVo, cart);
				CustomerPatientExample customerPatientExample = new CustomerPatientExample();
				customerPatientExample.createCriteria().andCartIdEqualTo(cartId);
				List<CustomerPatient> customerList = customerPatientMapper.selectByExample(customerPatientExample);
				if (CollectionUtils.isNotEmpty(customerList)) {
					for (CustomerPatient customerPatient : customerList) {
						customerCartVo.setCustomerPatientId(customerPatient.getCustomerPatientId());
						customerCartVo.setSex(customerPatient.getSexName());
						customerCartVo.setCustomerPatientName(customerPatient.getCustomerPatientName());
						customerCartVo.setCustomerPatientPhone(customerPatient.getCustomerPatientPhone());
						customerCartVo.setIdCard(customerPatient.getCustomerPatientIdCard());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return customerCartVo;
	}

	/**
	 * 获取门店/套餐剩余份数
	 * <p>
	 * Title: getBranchSuiteCount
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param suiteId
	 *            套餐id
	 * @param branchId
	 *            门店id
	 * @param date
	 *            预约时间
	 * @return
	 * @see br.crm.service.customer.cart.CustomerCartService#getBranchSuiteCount(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public int getBranchSuiteCount(String suiteId, String branchId, String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		CustomerCartExample example = null;
		int result = 0;
		// 获取套餐预约数量
		try {
			if (StringUtils.isNotEmpty(suiteId)) {
				example = new CustomerCartExample();
				Criteria criteria = example.createCriteria();
				criteria.andCartStatusEqualTo(0);
				criteria.andExamSuiteIdEqualTo(suiteId);
				criteria.andExamTimeEqualTo(sdf.parse(date));
				int suiteNum = customerCartMapper.countByExample(example);
				System.out.println("套餐预定的数量为"+suiteNum);
				OrganizationExamSuite suite = organizationExamSuiteMapper.selectByPrimaryKey(suiteId);
				System.out.println("套餐限制人数"+suite.getExamSuiteLimitPeople());
				// 套餐剩余数量
				result = suite.getExamSuiteLimitPeople() - suiteNum;
			}
			// 获取门店预约数量
			if (StringUtils.isNotEmpty(branchId)) {
				example = new CustomerCartExample();
				Criteria criteria = example.createCriteria();
				criteria.andCartStatusEqualTo(0);
				criteria.andBranchIdEqualTo(branchId);
				criteria.andExamTimeEqualTo(sdf.parse(date));
				int branchNum = customerCartMapper.countByExample(example);
				OrganizationBranch branch = organizationBranchMapper.selectByPrimaryKey(branchId);
				System.out.println(branch.getLimitPeople());
				if (result > branch.getLimitPeople() - branchNum) {
					result = branch.getLimitPeople() - branchNum;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int getOrderState(String orderNo) {
		String flag = redisService.get(RedisConstant.br_order_status.concat(orderNo));
		return new Integer(flag);
	}

	@Override
	public CustomerCart getCustomerCartByCartId(String cartId) {
		
		return customerCartMapper.selectByPrimaryKey(cartId);
	}


}
