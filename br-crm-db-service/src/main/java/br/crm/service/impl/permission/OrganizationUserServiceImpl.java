package br.crm.service.impl.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.dept.OrganizationDeptMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.mapper.permission.self.OrgUserDeptSelfMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.org.Organization;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import br.crm.pojo.permission.OrganizationUserExample.Criteria;
import br.crm.service.permission.OrganizationUserService;
import br.order.redis.redis.RedisService;
import br.crm.vo.dept.OrganizationDeptVo;
import br.crm.vo.permission.OrgUserVo;

/**
 * 
 * @ClassName: OrganizationUserServiceImpl
 * @Description: 医生信息的相关接口实现
 * @author zxy
 * @date 2016年9月12日 上午10:59:10
 *
 */
@Service
public class OrganizationUserServiceImpl implements OrganizationUserService {

	@Autowired
	private OrganizationUserMapper organizationUserMapper;

	@Autowired
	private OrgUserDeptSelfMapper orgUserDeptSelfMapper;
	
	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;
	
	@Autowired
	private OrganizationDeptMapper organizationDeptMapper;

	@Autowired
	private RedisService redisService;


	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUserByCondition
	 * </p>
	 * <p>
	 * Description:根据condition分页获取对象列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @param orgUserQu
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUserByCondition(int,
	 *      int, br.crm.vo.permission.OrgUserQu)
	 */
	@Override
	public PageInfo<OrgUserVo> getOrgUserByCondition(int page, int rows, OrgUserVo orgUserVo) {
		List<OrgUserVo> result = new ArrayList<OrgUserVo>();
		PageHelper.startPage(page, rows);
		OrganizationUserExample example = new OrganizationUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserStatusEqualTo(0);
		if (orgUserVo != null) {
			if (orgUserVo.getOrgId() != null) {
				criteria.andOrgIdEqualTo(orgUserVo.getOrgId());
			}
			if (orgUserVo.getOrgBranchId() != null) {
				criteria.andOrgBranchIdEqualTo(orgUserVo.getOrgBranchId());
			}
			if (orgUserVo.getOrgBranchDeptId() != null) {
				criteria.andOrgBranchDeptIdEqualTo(orgUserVo.getOrgBranchDeptId());
			}
			if (orgUserVo.getUserName() != null) {
				criteria.andUserNameLike("%" + orgUserVo.getUserName() + "%");
			}
			if (orgUserVo.getUserEmail() != null) {
				criteria.andUserEmailLike("%" + orgUserVo.getUserEmail() + "%");
			}
			if (orgUserVo.getUserPhone() != null) {
				criteria.andUserPhoneLike("%" + orgUserVo.getUserPhone() + "%");
			}
		}
		example.setOrderByClause(" user_create_time asc");
		List<OrganizationUser> user = organizationUserMapper.selectByExample(example);
		PageInfo<OrganizationUser> pageInfo = new PageInfo<OrganizationUser>(user);
		for (OrganizationUser orgUser : user) {
			OrgUserVo resultVo = new OrgUserVo();
			resultVo.setOrgBranchId(orgUser.getOrgBranchId());
			resultVo.setOrgBranchDeptId(orgUser.getOrgBranchDeptId());
			if (orgUser.getOrgId() != null) {
				if (redisService.get(RedisConstant.br_order_organization_id.concat(orgUser.getOrgId())) != null) {
					Organization organization = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_organization_id.concat(orgUser.getOrgId())), Organization.class);
					resultVo.setOrgId(orgUser.getOrgId());
					resultVo.setOrganizationName(organization.getOrgTotalName());
				}
			}
			if (orgUser.getOrgBranchId() != null) {
				if (redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(orgUser.getOrgBranchId())) != null) {
					OrganizationBranch orgBranch = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(orgUser.getOrgBranchId())), OrganizationBranch.class);
					resultVo.setOrgBranchId(orgBranch.getBranchId());
					resultVo.setBranchName(orgBranch.getBranchName());
				}
			}
			if (!orgUser.getOrgBranchDeptId().equals("0")) {
				if (redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(orgUser.getOrgBranchDeptId())) != null) {
					OrganizationDept organizationDept = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(orgUser.getOrgBranchDeptId())), OrganizationDept.class);
					resultVo.setDepartName(organizationDept.getDepartName());
				}
			}
			resultVo.setOrgBranchDeptId(orgUser.getOrgBranchDeptId());
			resultVo.setUserId(orgUser.getUserId());
			resultVo.setUserName(orgUser.getUserName());
			resultVo.setUserLoginName(orgUser.getUserLoginName());
			resultVo.setUserPhone(orgUser.getUserPhone());
			resultVo.setUserEmail(orgUser.getUserEmail());
			resultVo.setUserCreateTime(orgUser.getUserCreateTime());
			resultVo.setUserStatus(orgUser.getUserStatus());
			result.add(resultVo);
		}
		
		PageInfo<OrgUserVo> resultPageInfo = new PageInfo<OrgUserVo>(result);
        resultPageInfo.setLastPage(pageInfo.getLastPage());
        resultPageInfo.setTotal(pageInfo.getTotal());
        resultPageInfo.setIsFirstPage(pageInfo.isIsFirstPage());
        resultPageInfo.setIsLastPage(pageInfo.isIsLastPage());
        resultPageInfo.setNextPage(pageInfo.getNextPage());
        resultPageInfo.setStartRow(pageInfo.getStartRow());
        resultPageInfo.setEndRow(pageInfo.getEndRow());
        resultPageInfo.setNavigatepageNums(pageInfo.getNavigatepageNums());
		return resultPageInfo;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addOrgUser
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#addOrgUser(br.crm.pojo.permission.OrganizationUser)
	 */
	@Override
	public String addOrgUser(OrganizationUser user) {
		user.setUserId(UUIDUtils.getId());
		Md5Hash hash = new Md5Hash("88888888");
		user.setUserPassword(hash.toString());
		user.setUserCreateTime(new Date());
		user.setUserEditTime(new Date());
		user.setUserStatus(0);
		organizationUserMapper.insertSelective(user);
		redisService.set(RedisConstant.br_order_orgUser_userId.concat(user.getUserId()), JSONObject.toJSONString(user));
		return user.getUserId();
	}

	@Override
	public int addOrgUserByOrg(OrganizationUser organizationUser) {
	    organizationUserMapper.insertSelective(organizationUser);
	    if(organizationUser.getUserId()!=null){
	        redisService.set(RedisConstant.br_order_orgUser_userId.concat(organizationUser.getUserId()), JSONObject.toJSONString(organizationUser));
	    }
		return 1;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateOrgUser
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#updateOrgUser(br.crm.pojo.permission.OrganizationUser)
	 */
	@Override
	public int updateOrgUser(OrganizationUser user) {
	    redisService.set(RedisConstant.br_order_orgUser_userId.concat(user.getUserId()), JSONObject.toJSONString(user));
		return organizationUserMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUserByPid
	 * </p>
	 * <p>
	 * Description:根据pid获取对象信息
	 * </p>
	 * 
	 * @param pid
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUserByPid(java.lang.String)
	 */
	@Override
	public OrgUserVo getOrgUserByPid(String doctorId) {
		OrgUserVo result = new OrgUserVo();
		OrganizationUser user = organizationUserMapper.selectByPrimaryKey(doctorId);
		try {
			BeanUtils.copyProperties(result, user);
			if(StringUtils.isNotEmpty(result.getOrgBranchId())){
				result.setBranchName(organizationBranchMapper.selectByPrimaryKey(result.getOrgBranchId()).getBranchName());	
			}
			if(StringUtils.isNotEmpty(result.getOrgBranchDeptId())){	
				result.setDepartName(organizationDeptMapper.selectByPrimaryKey(result.getOrgBranchDeptId()).getDepartName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUserByFid
	 * </p>
	 * <p>
	 * Description:根据fid获取对象列表
	 * </p>
	 * 
	 * @param fid
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUserByFid(java.lang.String)
	 */
	@Override
	public List<OrganizationUser> getOrgUserByFid(String fid) {
		return orgUserDeptSelfMapper.getOrgUserByFid(fid);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUserAll
	 * </p>
	 * <p>
	 * Description:获取所有列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUserAll()
	 */
	@Override
	public List<OrganizationUser> getOrgUserAll() {
		return organizationUserMapper.selectByExample(null);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUser
	 * </p>
	 * <p>
	 * Description:根据pid获取对象信息
	 * </p>
	 * 
	 * @param pid
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUser(java.lang.String)
	 */
	@Override
	public OrganizationUser getOrgUser(String doctorId) {

		return JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(doctorId)), OrganizationUser.class);
	}

	@Override
	public OrganizationUser getOrgUserByOrgId(String orgId) {
		OrganizationUserExample example = new OrganizationUserExample();
		example.createCriteria().andOrgIdEqualTo(orgId);
		List<OrganizationUser> list = organizationUserMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		return list.get(0);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getOrgUserAllByOrgId
	 * </p>
	 * <p>
	 * Description: 根据机构的ID获取医生列表
	 * </p>
	 * 
	 * @param orgId
	 * @return
	 * @see br.crm.service.permission.OrganizationUserService#getOrgUserAllByOrgId(java.lang.String)
	 */
	@Override
	public List<OrganizationUser> getOrgUserAllByOrgId(String orgId) {
		return null;
	}

	@Override
	public void initData() {

		List<OrganizationUser> list = organizationUserMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			for (OrganizationUser organizationUser : list) {
				// 缓存用户表的主键id
				redisService.set(RedisConstant.br_order_orgUser_userId.concat(organizationUser.getUserId()), JSONObject.toJSONString(organizationUser));
				// 缓存体检机构id
				List<String> userList = new ArrayList<String>();
				if (redisService.exists(RedisConstant.br_order_orgUser_orgId.concat(organizationUser.getOrgId()))) {
					userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgId.concat(organizationUser.getOrgId())), String.class);
				}
				if (!userList.contains(organizationUser.getUserId())) {
					userList.add(organizationUser.getUserId());
				}
				redisService.set(RedisConstant.br_order_orgUser_orgId.concat(organizationUser.getOrgId()), JSONObject.toJSONString(userList));

				// 缓存门店id
				if (redisService.exists(RedisConstant.br_order_orgUser_orgBranchId.concat(organizationUser.getOrgBranchId()))) {
					userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgBranchId.concat(organizationUser.getOrgBranchId())), String.class);
				}
				if (!userList.contains(organizationUser.getUserId())) {
					userList.add(organizationUser.getUserId());
				}
				redisService.set(RedisConstant.br_order_orgUser_orgBranchId.concat(organizationUser.getOrgBranchId()), JSONObject.toJSONString(userList));
				//缓存科室id
				// 缓存门店id
				if (redisService.exists(RedisConstant.br_order_orgUser_orgDeptId.concat(organizationUser.getOrgBranchDeptId()))) {
					userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgDeptId.concat(organizationUser.getOrgBranchDeptId())), String.class);
				}
				if (!userList.contains(organizationUser.getUserId())) {
					userList.add(organizationUser.getUserId());
				}
				redisService.set(RedisConstant.br_order_orgUser_orgDeptId.concat(organizationUser.getOrgBranchDeptId()), JSONObject.toJSONString(userList));
			}
		}

	}

    /** 
    *  获取机构门店科室下的用户
    * <p>Title: getOrgUserByDept</p> 
    * <p>Description: </p> 
    * @param orgBranchDeptId 机构门店科室id
    * @return
    * @see br.crm.service.permission.OrganizationUserService#getOrgUserByDept(java.lang.String) 
    */
    @Override
    public List<OrganizationUser> getOrgUserByDept(String orgBranchDeptId) {
        List<String> userList = new ArrayList<String>();
        if (redisService.exists(RedisConstant.br_order_orgUser_orgDeptId.concat(orgBranchDeptId))) {
            userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgDeptId.concat(orgBranchDeptId)), String.class);
        }
        List<OrganizationUser> result = new ArrayList<OrganizationUser>();
        OrganizationUser organizationUser= null;
        for (String userId : userList) {
            organizationUser =new OrganizationUser();
            if (redisService.exists(RedisConstant.br_order_orgUser_userId.concat(userId))) {
                organizationUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(userId)), OrganizationUser.class);
            }
            result.add(organizationUser);
        }
        return result;
    }

    /** 
    *  机构员工重置密码
    * <p>Title: resetOrgUserPwd</p> 
    * <p>Description: </p> 
    * @param userId 医生id
    * @return
    * @see br.crm.service.permission.OrganizationUserService#resetOrgUserPwd(java.lang.String) 
    */
    @Override
    public int resetOrgUserPwd(String userId) {
        OrganizationUser organizationUser=null;
        int result=0;
        if (redisService.exists(RedisConstant.br_order_orgUser_userId.concat(userId))) {
            organizationUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(userId)), OrganizationUser.class);
            //密码加密：1.加盐，2:两次散列算法
            String salt = organizationUser.getUserLoginName();
            Md5Hash md5 = new Md5Hash("88888888", salt, 2);
            organizationUser.setUserPassword(md5.toString());
            result=organizationUserMapper.updateByPrimaryKeySelective(organizationUser);
            redisService.set(RedisConstant.br_order_orgUser_userId.concat(userId),JSONObject.toJSONString(organizationUser));
        }
        
        return result;
    }
	
}
