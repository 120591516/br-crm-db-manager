package br.crm.service.impl.InfoDetail;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.branch.OrganizationBranchImgMapper;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.branch.OrganizationBranchRestMapper;
import br.crm.mapper.customer.order.CustomerOrderMapper;
import br.crm.mapper.customer.order.self.CustomerOrderCartSelfMapper;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.suite.OrganizationBranchSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.branch.OrganizationBranchImgExample;
import br.crm.pojo.branch.OrganizationBranchRest;
import br.crm.pojo.branch.OrganizationBranchRestExample;
import br.crm.pojo.branch.OrganizationBranchRestExample.Criteria;
import br.crm.pojo.customer.order.CustomerOrderExample;
import br.crm.pojo.dict.DictArea;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.org.Organization;
import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.service.InfoDetail.InfoDetailService;
import br.order.redis.redis.RedisService;
import br.crm.vo.branch.OrganizationBranchVo;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.crm.vo.examitem.OrganizationExamItemVo;
import br.crm.vo.suite.OrgExamSuiteVo;

@Service
public class InfoDetailServiceImpl implements InfoDetailService {

	@Autowired
	private OrganizationExamSuiteMapper orgExamSuiteMapper;// 套餐

	@Autowired
	private OrganizationBranchRestMapper organizationBranchRestMapper;

	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;// 套餐-图片

	@Autowired
	private DictImgMapper dictImgMapper;

	@Autowired
	private OrganizationBranchSuiteMapper OrganizationBranchSuiteMapper;// 套餐-门店

	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;// 门店

	@Autowired
	private OrganizationBranchImgMapper organizationBranchImgMapper;// 门店-图片

	
	
	@Autowired
	private RedisService redisService;


	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: showSuiteInfoDetail
	 * </p>
	 * <p>
	 * Description:套餐详情
	 * </p>
	 * 
	 * @param suiteId
	 *            套餐ID
	 * @return
	 * @see br.crm.service.InfoDetail.InfoDetailService#showSuiteInfoDetail(java.lang.String)
	 */
	@Override
	public OrgExamSuiteVo showSuiteInfoDetail(String suiteId) {

		OrgExamSuiteVo result = new OrgExamSuiteVo();

		OrganizationExamSuite organizationExamSuite = orgExamSuiteMapper.selectByPrimaryKey(suiteId);

		OrganizationExamSuiteImgExample example = new OrganizationExamSuiteImgExample();
		example.createCriteria().andOrgExamSuiteStatusEqualTo(0).andOrgExamSuiteIdEqualTo(suiteId);
		example.setOrderByClause(" org_exam_suite_img_type asc");
		List<OrganizationExamSuiteImg> imgList = organizationExamSuiteImgMapper.selectByExample(example);
		if (null != organizationExamSuite) {
			try {
				BeanUtils.copyProperties(result, organizationExamSuite);
				// 图片
				if (CollectionUtils.isNotEmpty(imgList)) {
					for (OrganizationExamSuiteImg imgSuite : imgList) {
						DictImg dictImg = dictImgMapper.selectByPrimaryKey(imgSuite.getDictImgId());
						if (null != dictImg) {
							result.getImgList().add(dictImg);
						}
					}
				}

				// 查询项收费项
				//根据套餐ID查询套餐绑定收费项集合
				if (redisService.exists(RedisConstant.br_order_orgExamFeeItemSuite_examSuiteId + suiteId)) {
					//获取收费项集合
					String feeItemListStr = redisService.get(RedisConstant.br_order_orgExamFeeItemSuite_examSuiteId + suiteId);
					if (feeItemListStr != null) {
						List<String> feeItemList = JSONObject.parseArray(feeItemListStr, String.class);
						if (CollectionUtils.isNotEmpty(feeItemList)) {
							List<OrgExamFeeItemVo> examFeeItems = result.getOrgExamFeeItems();
							for (int i = 0; i < feeItemList.size(); i++) {// 5,7,8,9
								//根据收费项ID获取收费项信息
								String feeItemStr = redisService.get(RedisConstant.br_order_orgExamFeeItem_id + feeItemList.get(i));
								if (StringUtils.isNotBlank(feeItemStr)) {
									//转换Redis为程序对象
									OrgExamFeeItemVo orgFeeItem = JSONObject.parseObject(feeItemStr, OrgExamFeeItemVo.class);
									if (null != orgFeeItem) {// 5,7,8,9
										examFeeItems.add(orgFeeItem);
										// 根据收费项ID判断检查项-医生中间表集合信息
										if (redisService.exists(RedisConstant.br_order_orgExamFeeItemDetail_feeItemId + feeItemList.get(i))) {
											List<OrganizationExamItemVo> examItems = orgFeeItem.getExamItems();
											//根据收费项ID获取检查项-医生中间表集合信息
											String examItemUserIDListStr = redisService.get(RedisConstant.br_order_orgExamFeeItemDetail_feeItemId + feeItemList.get(i));// 49A
											if (examItemUserIDListStr != null) {
												List<String> examItemUserIDList = JSONObject.parseArray(examItemUserIDListStr, String.class);
												// 中间表
												if (CollectionUtils.isNotEmpty(examItemUserIDList)) {
													for (String examItemUserIDStr : examItemUserIDList) {
														//根据检查项-医生中间表ID判断信息
														if (redisService.exists(RedisConstant.br_order_orgExamItemUser_id + examItemUserIDStr)) {
															//获取检查项-医生中间表
															String examItemUserStr = redisService.get(RedisConstant.br_order_orgExamItemUser_id + examItemUserIDStr);
															if (examItemUserStr != null) {
																OrganizationExamItemUser examItemUser = JSONObject.parseObject(examItemUserStr, OrganizationExamItemUser.class);
																if (redisService.exists(RedisConstant.br_order_orgExamItem_id + examItemUser.getOrganizationExamItemId())) {
																	OrganizationExamItemVo examItem = JSONObject.parseObject(redisService.get(RedisConstant.br_order_orgExamItem_id + examItemUser.getOrganizationExamItemId()), OrganizationExamItemVo.class);
																	examItems.add(examItem);
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
				
				// 查询门店
				OrganizationBranchSuiteExample organizationBranchSuiteExample = new OrganizationBranchSuiteExample();
				organizationBranchSuiteExample.createCriteria().andSuiteIdEqualTo(suiteId).andStatusEqualTo(0);
				List<OrganizationBranchSuite> list = OrganizationBranchSuiteMapper.selectByExample(organizationBranchSuiteExample);
				if (CollectionUtils.isNotEmpty(list)) {
					for (OrganizationBranchSuite organizationBranchSuite : list) {
						// 从Redis中获取门店
						if (redisService.exists(RedisConstant.br_order_orgBranchSuite_suiteId + organizationBranchSuite.getSuiteId())) {
							String str = redisService.get(RedisConstant.br_order_orgBranchSuite_suiteId + organizationBranchSuite.getSuiteId());
							if (StringUtils.isNotEmpty(str)) {
								List<String> array = JSONObject.parseArray(str, String.class);
								if (CollectionUtils.isNotEmpty(array)) {
									for (String branchId : array) {
										String branch = redisService.get(RedisConstant.br_order_orgbranch_orgBranchId + branchId);
										if (StringUtils.isNotBlank(branch)) {
											OrganizationBranch organizationBranch = JSONObject.parseObject(branch, OrganizationBranch.class);
											if (null != organizationBranch) {
												result.getBranList().add(organizationBranch);
											}
										}
									}
								}
							}
						}
					}
				}
				// 查询机构
				if (StringUtils.isNotEmpty(organizationExamSuite.getOrgId())) {
					String str = redisService.get(RedisConstant.br_order_organization_id + organizationExamSuite.getOrgId());
					if (StringUtils.isNotEmpty(str)) {
						Organization organization = JSONObject.parseObject(str, Organization.class);
						if (null != organization) {
							result.setOrganization(organization);
						}
					}
				}
				// 查询订单量
				
				String sum = (String)JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgExamSuite_suiteId.concat(suiteId)), OrgExamSuiteVo.class).getSale_account_sum();
				result.setSale_account_sum(sum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: showBranchInfoDetail
	 * </p>
	 * <p>
	 * Description: 门店详情
	 * </p>
	 * 
	 * @param branchId
	 *            门店ID
	 * @return
	 * @see br.crm.service.InfoDetail.InfoDetailService#showBranchInfoDetail(java.lang.String)
	 */
	@Override
	public OrganizationBranchVo showBranchInfoDetail(String branchId) {

		OrganizationBranchVo result = new OrganizationBranchVo();
		OrganizationBranch organizationBranch = organizationBranchMapper.selectByPrimaryKey(branchId);
		OrganizationBranchImgExample example = new OrganizationBranchImgExample();
		example.createCriteria().andOrgBranchIdEqualTo(branchId);
		example.setOrderByClause(" org_branch_img_type asc");
		List<OrganizationBranchImg> imgList = organizationBranchImgMapper.selectByExample(example);
		OrganizationBranchRestExample exampleRest = new OrganizationBranchRestExample();
		Criteria criteria = exampleRest.createCriteria();
		criteria.andBranchIdEqualTo(branchId);
		criteria.andBranchRestStatusEqualTo(0);
		List<OrganizationBranchRest> restList = organizationBranchRestMapper.selectByExample(exampleRest);

		if (null != organizationBranch) {
			try {
				BeanUtils.copyProperties(result, organizationBranch);
				// 地址显示
				String dictArea = redisService.get(RedisConstant.br_order_dict_area_id + organizationBranch.getBranchAreaId());
				if (dictArea != null) {
					result.setDictArea(JSONObject.parseObject(dictArea, DictArea.class));
				}
				// 门店图片
				if (CollectionUtils.isNotEmpty(imgList)) {
					for (OrganizationBranchImg organizationBranchImg : imgList) {
						DictImg img = dictImgMapper.selectByPrimaryKey(organizationBranchImg.getDictImgId());
						if (null != img) {
							result.getImgList().add(img);
						}
					}
				}
				// 门店休息日
				if (CollectionUtils.isNotEmpty(restList)) {
					result.setRestList(restList);
				}
				// 查询套餐
				if (redisService.exists(RedisConstant.br_order_orgBranchSuite_branchId + branchId)) {
					String str = redisService.get(RedisConstant.br_order_orgBranchSuite_branchId + branchId);
					if (StringUtils.isNotEmpty(str)) {
						List<String> suiteIdList = JSONObject.parseArray(str, String.class);
						if (CollectionUtils.isNotEmpty(suiteIdList)) {
							for (String suiteId : suiteIdList) {
								String suite = redisService.get(RedisConstant.br_order_orgExamSuite_suiteId + suiteId);
								if (StringUtils.isNotBlank(suite)) {
									OrgExamSuiteVo organizationExamSuite = JSONObject.parseObject(suite, OrgExamSuiteVo.class);
									if (null != organizationExamSuite) {
										String suiteTypeStr = redisService.get(RedisConstant.br_order_orgExamSuiteType_suiteId + organizationExamSuite.getExamSuiteId());
										if (suiteTypeStr != null) {
											List<String> typeIds = JSONObject.parseArray(suiteTypeStr, String.class);
											if (CollectionUtils.isNotEmpty(typeIds)) {
												for (String typeid : typeIds) {
													String type = redisService.get(RedisConstant.br_order_dict_examSuiteType_id + typeid);
													if (type != null) {
														organizationExamSuite.setTypeNameList(organizationExamSuite.getTypeNameList() != null ? organizationExamSuite.getTypeNameList() : "" + " " + JSONObject.parseObject(type, DictExamSuiteType.class).getExamTypeName() + " ");
													}
												}
											}
										}

										result.getSuiteList().add(organizationExamSuite);
									}
								}
							}
						}
					}
				}
				// 查询机构
				if (StringUtils.isNotEmpty(organizationBranch.getOrgId())) {
					String org = redisService.get(RedisConstant.br_order_organization_id + organizationBranch.getOrgId());
					if (StringUtils.isNotEmpty(org)) {
						Organization organization = JSONObject.parseObject(org, Organization.class);
						if (null != organization) {
							result.setOrganization(organization);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
