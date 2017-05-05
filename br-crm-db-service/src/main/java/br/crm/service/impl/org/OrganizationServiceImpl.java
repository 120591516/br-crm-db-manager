package br.crm.service.impl.org;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.dict.DictAreaMapper;
import br.crm.mapper.org.OrganizationConnMapper;
import br.crm.mapper.org.OrganizationCooperationMapper;
import br.crm.mapper.org.OrganizationEmailMapper;
import br.crm.mapper.org.OrganizationIncomeMapper;
import br.crm.mapper.org.OrganizationInvestMapper;
import br.crm.mapper.org.OrganizationLevelMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.org.OrganizationReviewMapper;
import br.crm.mapper.org.OrganizationSaleMapper;
import br.crm.mapper.org.OrganizationSoftMapper;
import br.crm.mapper.org.OrganizationVisitMapper;
import br.crm.mapper.org.OrganizationWebMapper;
import br.crm.mapper.org.self.OrganizationSelfMapper;
import br.crm.mapper.permission.OrganizationOperationMapper;
import br.crm.mapper.permission.OrganizationPermissionMapper;
import br.crm.mapper.permission.OrganizationPermissionOperationMapper;
import br.crm.mapper.permission.OrganizationRoleMapper;
import br.crm.mapper.permission.OrganizationRolePermissionMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.mapper.permission.OrganizationUserRoleMapper;
import br.crm.pojo.dict.DictArea;
import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationConn;
import br.crm.pojo.org.OrganizationConnExample;
import br.crm.pojo.org.OrganizationCooperation;
import br.crm.pojo.org.OrganizationCooperationExample;
import br.crm.pojo.org.OrganizationEmail;
import br.crm.pojo.org.OrganizationExample;
import br.crm.pojo.org.OrganizationExample.Criteria;
import br.crm.pojo.org.OrganizationIncome;
import br.crm.pojo.org.OrganizationIncomeExample;
import br.crm.pojo.org.OrganizationInvest;
import br.crm.pojo.org.OrganizationInvestExample;
import br.crm.pojo.org.OrganizationLevel;
import br.crm.pojo.org.OrganizationReview;
import br.crm.pojo.org.OrganizationReviewExample;
import br.crm.pojo.org.OrganizationSale;
import br.crm.pojo.org.OrganizationSaleExample;
import br.crm.pojo.org.OrganizationSoft;
import br.crm.pojo.org.OrganizationSoftExample;
import br.crm.pojo.org.OrganizationVisit;
import br.crm.pojo.org.OrganizationVisitExample;
import br.crm.pojo.org.OrganizationWeb;
import br.crm.pojo.org.OrganizationWebExample;
import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationOperationExample;
import br.crm.pojo.permission.OrganizationPermission;
import br.crm.pojo.permission.OrganizationPermissionExample;
import br.crm.pojo.permission.OrganizationPermissionOperation;
import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationRoleExample;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import br.crm.pojo.permission.OrganizationUserRole;
import br.crm.service.org.OrganizationService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.org.OrganizationAllInfoVo;
import br.crm.vo.org.OrganizationQu;
import br.crm.vo.org.OrganizationVo;
import br.crm.vo.org.RegistOrgInfoVo;
import br.order.redis.dict.DictAreaRedis;
import br.order.redis.org.OrgLevelRedis;
import br.order.redis.org.OrgRedis;

/**
 * 
 * @ClassName: OrganizationServiceImpl
 * @Description: 机构接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:35:03
 *
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private OrganizationSelfMapper organizationSelfMapper;
	@Autowired
	private OrganizationLevelMapper organizationLevelMapper;
	@Autowired
	private OrganizationConnMapper organizationConnMapper;
	@Autowired
	private OrganizationCooperationMapper organizationCooperationMapper;
	@Autowired
	private OrganizationIncomeMapper organizationIncomeMapper;
	@Autowired
	private OrganizationInvestMapper organizationInvestMapper;
	@Autowired
	private OrganizationSaleMapper organizationSaleMapper;
	@Autowired
	private OrganizationSoftMapper organizationSoftMapper;
	@Autowired
	private OrganizationVisitMapper organizationVisitMapper;
	@Autowired
	private OrganizationWebMapper organizationWebMapper;
	@Autowired
	private OrganizationReviewMapper organizationReviewMapper;
	@Autowired
	private OrganizationEmailMapper organizationEmailMapper;
	@Autowired
	private OrganizationRolePermissionMapper organizationRolePermissionMapper;
	@Autowired
	private OrganizationRoleMapper organizationRoleMapper;
	@Autowired
	private OrganizationPermissionMapper organizationPermissionMapper;
	@Autowired
	private OrganizationOperationMapper organizationOperationMapper;
	@Autowired
	private OrganizationPermissionOperationMapper organizationPermissionOperationMapper;
	@Autowired
	private OrganizationUserMapper organizationUserMapper;
	@Autowired
	private OrganizationUserRoleMapper organizationUserRoleMapper;
	
	@Autowired
	private DictAreaMapper dictAreaMapper;
	/**
	 * 系统配置service
	 */
	@Autowired
    private SystemConfigService systemConfigService;
	
	/**
	 * 体检机构缓存
	 */
	@Autowired
	private OrgRedis orgRedis;
	
	@Autowired
	private OrgLevelRedis orgLevelRedis;
	
	@Autowired
	private DictAreaRedis dictAreaRedis;
	/**
	 * <p>
	 * Title:getOrganizationByPage
	 * </p>
	 * <p>
	 * Description:分页获取体检机构列表
	 * </p>
	 * 
	 * @param organizationQu
	 * @param page
	 * @param rows
	 * @return
	 * @see br.crm.service.org.OrganizationService#getOrganizationByPage(br.crm.vo.org.OrganizationQu,
	 *      int, int)
	 */
	@Override
	public PageInfo<OrganizationVo> getOrganizationByPage(OrganizationQu organizationQu, int page, int rows) {
	    boolean redis = systemConfigService.getRedis();
		List<OrganizationVo> organization_all_list = null;
		try {
			PageHelper.startPage(page, rows);
			organization_all_list = organizationSelfMapper.getOrganizationByPage(organizationQu);
			if(redis){
			    if (CollectionUtils.isNotEmpty(organization_all_list)) {
	                for (OrganizationVo organizationVo : organization_all_list) {
	                    if (!orgRedis.redisExists(organizationVo.getOrgId())) {
                                orgRedis.setOrganization(organizationVo);
                           }
                     }
	            }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		PageInfo<OrganizationVo> pageInfo = new PageInfo<>(organization_all_list);

		if (CollectionUtils.isNotEmpty(pageInfo.getList())) {
			for (OrganizationVo organizationVo : pageInfo.getList()) {
				if (null == organizationVo.getOrgLevelName() || "".equals(organizationVo.getOrgLevelName())) {
					organizationVo.setOrgLevelName("无");
				}
			}
		}
		return pageInfo;

	}

	/**
	 * <p>
	 * Title:insertOrganization
	 * </p>
	 * <p>
	 * Description: 新增体检机构基本信息
	 * </p>
	 * 
	 * @param organization
	 * @return
	 * @see br.crm.service.org.OrganizationService#insertOrganization(br.crm.pojo.org.Organization)
	 */
	@Override
	public String insertOrganization(RegistOrgInfoVo organization) {
		organizationMapper.insertSelective(organization);
		boolean redis = systemConfigService.getRedis();
		if(redis){
		    orgRedis.setOrganization(organization);
		}
		return organization.getOrgId();
	}

	/**
	 * <p>
	 * Title:getOrganizationById
	 * </p>
	 * <p>
	 * Description:根据机构id查询机构基本信息
	 * </p>
	 * 
	 * @param orgId
	 * @return
	 * @see br.crm.service.org.OrganizationService#getOrganizationById(java.lang.Long)
	 */
	@Override
	public OrganizationVo getOrganizationById(String orgId) {
		OrganizationVo result = new OrganizationVo();
		Organization organization = organizationMapper.selectByPrimaryKey(orgId);
		if (null != organization) {
			try {
				BeanUtils.copyProperties(result, organization);
				if (null != result.getOrgLevelId()&&result.getOrgLevelId()!=0) {
					result.setOrgLevelName(organizationLevelMapper.selectByPrimaryKey(result.getOrgLevelId()).getOrgLevelName());
				}
				if (result.getOrgNature().intValue() == 0) {
					result.setOrgNatureName("医院");
				} else {
					result.setOrgNatureName("体检机构");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * <p>
	 * Title:updateOrganization
	 * </p>
	 * <p>
	 * Description: 修改机构基本信息
	 * </p>
	 * 
	 * @param organization
	 * @return
	 * @see br.crm.service.org.OrganizationService#updateOrganization(br.crm.pojo.org.Organization)
	 */
	@Override
	public int updateOrganization(Organization organization) {
		int updateByPrimaryKeySelective = organizationMapper.updateByPrimaryKeySelective(organization);
		boolean redis = systemConfigService.getRedis();
		if(redis){
		    orgRedis.setOrganization(organization);
		}
		return updateByPrimaryKeySelective;
	}

	/**
	 * <p>
	 * Title:getOrganizationLevel
	 * </p>
	 * <p>
	 * Description: 获取所有体检机构等级
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<OrganizationLevel> getOrganizationLevel() {
		return organizationLevelMapper.selectByExample(null);
	}

	/**
	 * <p>
	 * Title:getOrgAllInfoById
	 * </p>
	 * <p>
	 * Description: 根据机构id查询机构所有信息
	 * </p>
	 * 
	 * @param orgId
	 * @return
	 */
	@Override
	public OrganizationAllInfoVo getOrgAllInfoById(String orgId) {
		OrganizationAllInfoVo organizationAllInfo = new OrganizationAllInfoVo();
		// 基本信息
		OrganizationVo organizationVo = new OrganizationVo();
		Organization organization = organizationMapper.selectByPrimaryKey(orgId);
		if (null != organization) {
			try {
				BeanUtils.copyProperties(organizationVo, organization);
			} catch (Exception e) {
				e.printStackTrace();
			}
			DictArea dictArea = null;
			OrganizationLevel organizationLevel =null;
			if(systemConfigService.getRedis()){
			    organizationLevel = orgLevelRedis.getOrganizationLevel(organization.getOrgLevelId().toString());
			    dictArea = dictAreaRedis.getDictAreaByAreaId(organization.getAreaId());
			}else{
			    organizationLevel =organizationLevelMapper.selectByPrimaryKey(organization.getOrgLevelId());
			    dictArea = dictAreaMapper.selectByPrimaryKey(organization.getAreaId());
			}
			organizationVo.setOrgLevelName(organizationLevel.getOrgLevelName());
			organizationVo.setProvinceId(dictArea.getProvinceId());
			organizationVo.setCityId(dictArea.getCityId());
			organizationAllInfo.setOrganizationVo(organizationVo);
			// 联系人
			OrganizationConnExample example1 = new OrganizationConnExample();
			br.crm.pojo.org.OrganizationConnExample.Criteria criteria = example1.createCriteria();
			criteria.andOrgIdEqualTo(orgId);
			criteria.andOrgConnStatusEqualTo(0);
			List<OrganizationConn> list1 = organizationConnMapper.selectByExample(example1);
			organizationAllInfo.setOrganizationConns(list1);
			// 合作意向
			OrganizationCooperationExample example2 = new OrganizationCooperationExample();
			br.crm.pojo.org.OrganizationCooperationExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andOrgIdEqualTo(orgId);
			List<OrganizationCooperation> list2 = organizationCooperationMapper.selectByExample(example2);
			organizationAllInfo.setOrganizationCooperations(list2);
			// 收入
			OrganizationIncomeExample example3 = new OrganizationIncomeExample();
			br.crm.pojo.org.OrganizationIncomeExample.Criteria criteria3 = example3.createCriteria();
			criteria3.andOrgIdEqualTo(orgId);
			List<OrganizationIncome> list3 = organizationIncomeMapper.selectByExample(example3);
			organizationAllInfo.setOrganizationIncomes(list3);
			// 投资人
			OrganizationInvestExample example4 = new OrganizationInvestExample();
			br.crm.pojo.org.OrganizationInvestExample.Criteria criteria4 = example4.createCriteria();
			criteria4.andOrgIdEqualTo(orgId);
			List<OrganizationInvest> list4 = organizationInvestMapper.selectByExample(example4);
			organizationAllInfo.setOrganizationInvests(list4);
			// 销售
			OrganizationSaleExample example5 = new OrganizationSaleExample();
			br.crm.pojo.org.OrganizationSaleExample.Criteria criteria5 = example5.createCriteria();
			criteria5.andOrgIdEqualTo(orgId);
			criteria5.andOrgSaleStatusEqualTo(0);
			List<OrganizationSale> list5 = organizationSaleMapper.selectByExample(example5);
			organizationAllInfo.setOrganizationSales(list5);
			// 软件
			OrganizationSoftExample example6 = new OrganizationSoftExample();
			br.crm.pojo.org.OrganizationSoftExample.Criteria criteria6 = example6.createCriteria();
			criteria6.andOrgIdEqualTo(orgId);
			criteria6.andOrgSoftstatusEqualTo(0);
			List<OrganizationSoft> list6 = organizationSoftMapper.selectByExample(example6);
			organizationAllInfo.setOrganizationSofts(list6);
			// 拜访
			OrganizationVisitExample example7 = new OrganizationVisitExample();
			br.crm.pojo.org.OrganizationVisitExample.Criteria criteria7 = example7.createCriteria();
			criteria7.andOrgIdEqualTo(orgId);
			List<OrganizationVisit> list7 = organizationVisitMapper.selectByExample(example7);
			organizationAllInfo.setOrganizationVisits(list7);
			// web
			OrganizationWebExample example8 = new OrganizationWebExample();
			br.crm.pojo.org.OrganizationWebExample.Criteria criteria8 = example8.createCriteria();
			criteria8.andOrgIdEqualTo(orgId);
			List<OrganizationWeb> list8 = organizationWebMapper.selectByExample(example8);
			organizationAllInfo.setOrganizationWebs(list8);
		}
		return organizationAllInfo;
	}

	/**
	 * <p>
	 * Title:reviewOrganization
	 * </p>
	 * <p>
	 * Description:审核体检机构
	 * </p>
	 * 
	 * @param organization
	 * @param orgReview
	 * @return
	 * @see br.crm.service.org.OrganizationService#reviewOrganization(br.crm.pojo.org.Organization,
	 *      br.crm.pojo.org.OrganizationReview)
	 */
	@Override
	public int reviewOrganization(Organization organization, OrganizationReview orgReview) {
		int i = updateOrganization(organization);

		if (i > 0) {
			// 审核通过
			if (orgReview.getOrgReviewResult().equals(0)) {
				OrganizationRoleExample roleExample = new OrganizationRoleExample();
				roleExample.createCriteria().andOrgIdEqualTo(organization.getOrgId());
				int roleCount = organizationRoleMapper.countByExample(roleExample);
				if (roleCount < 1) {
					// 添加该机构超级管理员角色及分配权限
					OrganizationRole role = new OrganizationRole();
					role.setOrgId(organization.getOrgId());
					role.setRoleCreateTime(new Date());
					role.setRoleDescribe(null);
					role.setRoleName("超级管理员");
					role.setRoleStatus(0);
					organizationRoleMapper.insertSelective(role);
					// 添加用户-角色
					OrganizationUserRole userRole = new OrganizationUserRole();
					OrganizationUserExample userExample = new OrganizationUserExample();
					userExample.createCriteria().andOrgIdEqualTo(organization.getOrgId());
					List<OrganizationUser> list = organizationUserMapper.selectByExample(userExample);
					if (CollectionUtils.isNotEmpty(list)) {
						OrganizationUser user = list.get(0);
						userRole.setUserId(user.getUserId());
					}
					if (null != role.getRoleId()) {
						userRole.setRoleId(role.getRoleId());
					}
					userRole.setUserRoleStatus(0);
					userRole.setUserRoleCreateTime(new Date());
					userRole.setUserRoleEditTime(userRole.getUserRoleCreateTime());
					organizationUserRoleMapper.insertSelective(userRole);
					// 查询有效权限
					OrganizationPermissionExample example = new OrganizationPermissionExample();
					example.createCriteria().andPermissionStatusEqualTo(0);
					List<OrganizationPermission> permissionList = organizationPermissionMapper.selectByExample(example);
					// 遍历权限，把权限ID和角色ID添加到中间表
					if (CollectionUtils.isNotEmpty(permissionList)) {
						for (OrganizationPermission organizationPermission : permissionList) {
							OrganizationRolePermission orp = new OrganizationRolePermission();
							orp.setPermissionId(organizationPermission.getPermissionId());
							orp.setRoleId(role.getRoleId());
							orp.setRolePermissionCreateTime(new Date());
							orp.setRolePermissionEditTime(orp.getRolePermissionCreateTime());
							orp.setRolePermissionStatus(0);
							organizationRolePermissionMapper.insertSelective(orp);
							OrganizationOperationExample oExample = new OrganizationOperationExample();
							oExample.createCriteria().andPermissionIdEqualTo(organizationPermission.getPermissionId());
							List<OrganizationOperation> oList = organizationOperationMapper.selectByExample(oExample);
							if (CollectionUtils.isNotEmpty(oList)) {
								for (OrganizationOperation organizationOperation : oList) {
									OrganizationPermissionOperation po = new OrganizationPermissionOperation();
									po.setOperationId(organizationOperation.getOperationId());
									po.setRolePermissionId(orp.getRolePermissionId());
									po.setCreatetime(new Date());
									po.setEdittime(new Date());
									po.setStatus(0);
									po.setEditUserId("1");
									po.setEditUserName("system");
									organizationPermissionOperationMapper.insertSelective(po);
								}
							}
						}

					}
				}
			}
			// 新增审核记录
			return organizationReviewMapper.insertSelective(orgReview);
		}
		return 0;
	}

	/**
	 * <p>
	 * Title:getAvailableOrgs
	 * </p>
	 * <p>
	 * Description: 获取所有可用体检机构
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.org.OrganizationService#getAvailableOrgs()
	 */
	@Override
	public List<Organization> getAvailableOrgs() {
		OrganizationExample example = new OrganizationExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrgStatusEqualTo(0);
		return organizationMapper.selectByExample(example);
	}

	/**
	 * <p>
	 * Title:insertOrgEmail
	 * </p>
	 * <p>
	 * Description: 添加邮件
	 * </p>
	 * 
	 * @param orgEmail
	 * @return
	 * @see br.crm.service.org.OrganizationService#insertOrgEmail(br.crm.pojo.org.OrganizationEmail)
	 */
	@Override
	public int insertOrgEmail(OrganizationEmail orgEmail) {
		return organizationEmailMapper.insertSelective(orgEmail);
	}

	@Override
	public List<OrganizationReview> getreviewOrganizationListById(String orgId) {
		OrganizationReviewExample example = new OrganizationReviewExample();
		example.createCriteria().andOrgIdEqualTo(orgId);
		return organizationReviewMapper.selectByExample(example);

	}

}
