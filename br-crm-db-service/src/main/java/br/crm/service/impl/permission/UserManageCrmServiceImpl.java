package br.crm.service.impl.permission;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.dept.OrganizationDeptMapper;
import br.crm.mapper.org.OrganizationBranchUserMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.permission.OrganizationRoleMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.mapper.permission.OrganizationUserRoleMapper;
import br.crm.mapper.permission.self.BrUserRoleSelfMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationBranchUser;
import br.crm.pojo.org.OrganizationBranchUserExample;
import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import br.crm.pojo.permission.OrganizationUserRole;
import br.crm.pojo.permission.OrganizationUserRoleExample;
import br.crm.pojo.permission.OrganizationUserRoleExample.Criteria;
import br.crm.service.permission.UserManageCrmService;
import br.crm.vo.permission.OrgUserVo;
import br.crm.vo.permission.OrganizationRoleVo;
import br.crm.vo.permission.RoleModel;

/**
 * 
 * @ClassName: UserManageCrmServiceImpl
 * @Description: 用户管理接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:19:10
 *
 */
@Service
public class UserManageCrmServiceImpl implements UserManageCrmService {

	@Autowired
	private BrUserRoleSelfMapper brUserRoleSelfMapper;

	@Autowired
	private OrganizationUserMapper organizationUserMapper;

	@Autowired
	private OrganizationUserRoleMapper organizationUserRoleMapper;

	@Autowired
	private OrganizationUserMapper brUserMappe;

	@Autowired
	private OrganizationBranchUserMapper organizationBranchUserMapper;

	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;

	@Autowired
	private OrganizationMapper organizationMapper;
	
	@Autowired
	private OrganizationRoleMapper organizationRoleMapper;
	
	@Autowired
	private OrganizationDeptMapper organizationDeptMapper;
	
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserByPage
	 * </p>
	 * <p>
	 * Description: 分页获取用户列表
	 * </p>
	 * 
	 * @param page
	 *            当前页码
	 * @param rows
	 *            每页显示条数
	 * @param user
	 *            查询条件
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getUserByPage(java.lang.Integer,
	 *      java.lang.Integer, br.crm.vo.permission.OrgUserVo)
	 */
	@Override
	public PageInfo<OrgUserVo> getUserByPage(Integer page, Integer rows, OrgUserVo user) {
		PageHelper.startPage(page, rows);
		OrganizationUserExample example = new OrganizationUserExample();
		example.setOrderByClause(" user_create_time asc");
		example.createCriteria().andOrgIdEqualTo(user.getOrgId());
		List<OrganizationUser> list = organizationUserMapper.selectByExample(example);
		PageInfo<OrganizationUser> userPageInfo = new PageInfo<OrganizationUser>(list);
		PageInfo<OrgUserVo> result = new PageInfo<OrgUserVo>();
		result.setTotal(userPageInfo.getTotal());
		result.setPageSize(userPageInfo.getPageSize());
		result.setPageNum(userPageInfo.getPageNum());
		
		if (CollectionUtils.isNotEmpty(list)) {
			List<OrgUserVo> voList = new ArrayList<OrgUserVo>();
			for (OrganizationUser organizationUser : list) {
				OrgUserVo userVo = new OrgUserVo();
				try {
					BeanUtils.copyProperties(userVo, organizationUser);
					userVo.setBranchName(organizationBranchMapper.selectByPrimaryKey(userVo.getOrgBranchId()).getBranchName());
					userVo.setDepartName(organizationDeptMapper.selectByPrimaryKey(userVo.getOrgBranchDeptId()).getDepartName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				List<OrganizationUserRole> userRoleList = new ArrayList<OrganizationUserRole>();
				OrganizationUserRoleExample userRoleExample = new OrganizationUserRoleExample();
				userRoleExample.createCriteria().andUserIdEqualTo(organizationUser.getUserId()).andUserRoleStatusEqualTo(0);
				userRoleList = organizationUserRoleMapper.selectByExample(userRoleExample);
				if (CollectionUtils.isNotEmpty(userRoleList)) {
					for (OrganizationUserRole organizationUserRole : userRoleList) {
						OrganizationRole role = organizationRoleMapper.selectByPrimaryKey(organizationUserRole.getRoleId());
						if (null != role) {
							userVo.setRoleName(userVo.getRoleName().concat(role.getRoleName()).concat("、"));
						}
					}
				}
				voList.add(userVo);
			}
			result.setList(voList);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserByUserName
	 * </p>
	 * <p>
	 * Description:根据username获取对象信息
	 * </p>
	 * 
	 * @param userName
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getUserByUserName(java.lang.String)
	 */
	@Override
	public OrganizationUser getUserByUserName(String userName) {
		if (StringUtils.isBlank(userName)) {
			return null;
		}
		OrganizationUserExample example = new OrganizationUserExample();
		example.createCriteria().andUserStatusEqualTo(0).andUserLoginNameEqualTo(userName);
		List<OrganizationUser> list = brUserMappe.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: login
	 * </p>
	 * <p>
	 * Description:登陆
	 * </p>
	 * 
	 * @param userName
	 * @param password
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#login(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public OrganizationUser login(String userName, String password) {
		System.out.println(userName);
		OrganizationUserExample example = new OrganizationUserExample();
		example.createCriteria().andUserLoginNameEqualTo(userName).andUserPasswordEqualTo(password);
		List<OrganizationUser> list = brUserMappe.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: insertBrUser
	 * </p>
	 * <p>
	 * Description: 添加对象
	 * </p>
	 * 
	 * @param brUser
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#insertBrUser(br.crm.pojo.permission.OrganizationUser)
	 */
	@Override
	public int insertBrUser(OrganizationUser brUser) {

		return organizationUserMapper.insertSelective(brUser);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateBrUser
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param brUser
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#updateBrUser(br.crm.pojo.permission.OrganizationUser)
	 */
	@Override
	public int updateBrUser(OrganizationUser brUser) {

		return organizationUserMapper.updateByPrimaryKeySelective(brUser);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: insertUserRole
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param strRolesId
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#insertUserRole(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public int insertUserRole(String strRolesId, String userId, OrgUserVo user) {
		int i = 0;
		String[] roleIds = strRolesId.split(",");
		for (String roleId : roleIds) {
			OrganizationUserRole brUserRole = new OrganizationUserRole();
			brUserRole.setUserId(userId);
			brUserRole.setRoleId(Long.valueOf(roleId));
			brUserRole.setUserRoleCreateTime(new Date());
			brUserRole.setUserRoleEditTime(new Date());
			brUserRole.setUserRoleStatus(0);
			i += organizationUserRoleMapper.insertSelective(brUserRole);
			/*OrganizationRolePermissionExample orpExample = new OrganizationRolePermissionExample();
			orpExample.createCriteria().andRoleIdEqualTo(Long.valueOf(roleId)).andRolePermissionStatusEqualTo(0);
			List<OrganizationRolePermission> orpList = organizationRolePermissionMapper.selectByExample(orpExample);
			if (CollectionUtils.isNotEmpty(orpList)) {
				for (OrganizationRolePermission organizationRolePermission : orpList) {
					OrganizationOperationExample ooExample = new OrganizationOperationExample();
					ooExample.createCriteria().andPermissionIdEqualTo(organizationRolePermission.getPermissionId()).andOperationStatusEqualTo(0);
					List<OrganizationOperation> ooList = organizationOperationMapper.selectByExample(ooExample);
					if (CollectionUtils.isNotEmpty(ooList)) {
						for (OrganizationOperation organizationOperation : ooList) {
							OrganizationPermissionOperation opo = new OrganizationPermissionOperation();
							opo.setCreatetime(new Date());
							opo.setEdittime(new Date());
							opo.setOperationId(organizationOperation.getOperationId());
							opo.setRolePermissionId(organizationRolePermission.getRolePermissionId());
							opo.setStatus(0);
							opo.setEditUserId(user.getUserId());
							opo.setEditUserName(user.getUserName());
							organizationPermissionOperationMapper.insertSelective(opo);
						}
					}
				}
			}*/
		}
		return i;
	}

	@Override
	public int insertUserRoleOne(int RoleId, String userId) {

		OrganizationUserRole record = new OrganizationUserRole();
		record.setRoleId((long) RoleId);
		record.setUserId(userId);
		record.setUserRoleCreateTime(new Date());
		record.setUserRoleStatus(0);
		return organizationUserRoleMapper.insertSelective(record);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateUserRole
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param strRolesId
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#updateUserRole(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public int updateUserRole(String strRolesId, String userId, OrgUserVo user) {
		int i = 0;
		//清空数据
		OrganizationUserRoleExample example = new OrganizationUserRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<OrganizationUserRole> urList = organizationUserRoleMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(urList)) {
			for (OrganizationUserRole organizationUserRole : urList) {
				organizationUserRoleMapper.deleteByPrimaryKey(organizationUserRole.getUserRoleId());
			}
		}

		//加载数据
		String[] roleIds = strRolesId.split(",");
		for (String roleId : roleIds) {
			OrganizationUserRole brUserRole = new OrganizationUserRole();
			brUserRole.setUserId(userId);
			brUserRole.setRoleId(Long.valueOf(roleId));
			brUserRole.setUserRoleCreateTime(new Date());
			brUserRole.setUserRoleEditTime(new Date());
			brUserRole.setUserRoleStatus(0);
			
			i += organizationUserRoleMapper.insertSelective(brUserRole);
			/*OrganizationRolePermissionExample orpExample = new OrganizationRolePermissionExample();
			orpExample.createCriteria().andRoleIdEqualTo(Long.valueOf(roleId)).andRolePermissionStatusEqualTo(0);
			List<OrganizationRolePermission> orpList = organizationRolePermissionMapper.selectByExample(orpExample);
			if (CollectionUtils.isNotEmpty(orpList)) {
				for (OrganizationRolePermission organizationRolePermission : orpList) {
					OrganizationOperationExample ooExample = new OrganizationOperationExample();
					ooExample.createCriteria().andPermissionIdEqualTo(organizationRolePermission.getPermissionId()).andOperationStatusEqualTo(0);
					List<OrganizationOperation> ooList = organizationOperationMapper.selectByExample(ooExample);
					if (CollectionUtils.isNotEmpty(ooList)) {
						for (OrganizationOperation organizationOperation : ooList) {
							OrganizationPermissionOperation opo = new OrganizationPermissionOperation();
							opo.setCreatetime(new Date());
							opo.setEdittime(new Date());
							opo.setOperationId(organizationOperation.getOperationId());
							opo.setRolePermissionId(organizationRolePermission.getRolePermissionId());
							opo.setStatus(0);
							opo.setEditUserId(user.getUserId());
							opo.setEditUserName(user.getUserName());
							i += organizationPermissionOperationMapper.insertSelective(opo);
						}
					}
				}
			}*/
		}
		return i;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserRoleById
	 * </p>
	 * <p>
	 * Description:根据id获取对象
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getUserRoleById(java.lang.String)
	 */
	@Override
	public OrganizationRoleVo getUserRoleById(String userId) {

		return brUserRoleSelfMapper.getUserRoleById(userId);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBrUserById
	 * </p>
	 * <p>
	 * Description:根据id获取对象
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getBrUserById(java.lang.String)
	 */
	@Override
	public OrganizationUser getBrUserById(String userId) {

		OrganizationUser organizationUser = organizationUserMapper.selectByPrimaryKey(userId);
		return organizationUser;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getCountByUserName
	 * </p>
	 * <p>
	 * Description:根据username获取对象
	 * </p>
	 * 
	 * @param userName
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getCountByUserName(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public int getCountByUserName(String userName, String userId) {
		int i = 0;
		OrganizationUserExample example = new OrganizationUserExample();
		br.crm.pojo.permission.OrganizationUserExample.Criteria criteria = example.createCriteria();
		if (userId != null && !userId.equals("")) {
			// 更新
			criteria.andUserStatusEqualTo(0);
			criteria.andUserLoginNameEqualTo(userName);
			criteria.andUserIdNotEqualTo(userId.toString());
			i = organizationUserMapper.countByExample(example);
		} else {
			// 新增
			criteria.andUserStatusEqualTo(0);
			criteria.andUserLoginNameEqualTo(userName);
			i = organizationUserMapper.countByExample(example);
		}
		return i;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getRolesByUserId
	 * </p>
	 * <p>
	 * Description:根据userid获取对象列表
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getRolesByUserId(java.lang.String)
	 */
	@Override
	public List<RoleModel> getRolesByUserId(String orgId,String userId) {
		// 查询出所有角色
//		OrganizationRoleExample roleExample = new OrganizationRoleExample();
//		roleExample.createCriteria().andRoleStatusEqualTo(0).andOrgIdEqualTo(orgId);
//		List<OrganizationRole> rolesList = organizationRoleMapper.selectByExample(roleExample);
		List<RoleModel> rolesList = brUserRoleSelfMapper.getAllRoles(orgId);
		// 查询出该用户id所属角色
		List<RoleModel> roles = brUserRoleSelfMapper.getRolesByUserId(userId);
		for (RoleModel roleModel1 : rolesList) {
			for (RoleModel roleModel2 : roles) {
				if (roleModel1.getId() == roleModel2.getId()) {
					roleModel1.setChecked(true);
					break;
				}
			}
		}
		return rolesList;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBranchAndOrgbyUserId
	 * </p>
	 * <p>
	 * Description:根据userid获取map集合
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserManageCrmService#getBranchAndOrgbyUserId(java.lang.String)
	 */
	public Map<String, Object> getBranchAndOrgbyUserId(String userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrganizationBranch> branchs = new ArrayList<OrganizationBranch>();
		// 根据用户的id查询出门店的ID
		OrganizationBranchUserExample example = new OrganizationBranchUserExample();
		example.createCriteria().andOrgUserIdEqualTo(userId);
		List<OrganizationBranchUser> list = organizationBranchUserMapper.selectByExample(example);
		// 根据门店的ID查询出门店的详细信息
		if (list.size() > 0) {
			for (OrganizationBranchUser branchUser : list) {
				// 根据门店的id查询门店信息
				OrganizationBranch branch = organizationBranchMapper.selectByPrimaryKey((branchUser.getOrgBranchId()));
				branchs.add(branch);
			}
			// 根据机构的ID查询机构信息
			OrganizationBranchUser user = list.get(0);
			Organization org = organizationMapper.selectByPrimaryKey(user.getOrgId().toString());
			map.put("org", org);
		}
		map.put("branchs", branchs);
		return map;
	}

}
