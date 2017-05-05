package br.crm.service.impl.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.MyPredicate;
import br.crm.mapper.permission.OrganizationOperationMapper;
import br.crm.mapper.permission.OrganizationPermissionOperationMapper;
import br.crm.mapper.permission.OrganizationRoleMapper;
import br.crm.mapper.permission.OrganizationRolePermissionMapper;
import br.crm.mapper.permission.OrganizationUserRoleMapper;
import br.crm.mapper.permission.self.OrganizationPermissionOperationSelfMapper;
import br.crm.mapper.permission.self.OrganizationRolePermissionSelfMapper;
import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationOperationExample;
import br.crm.pojo.permission.OrganizationPermissionOperation;
import br.crm.pojo.permission.OrganizationPermissionOperationExample;
import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationRoleExample;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.pojo.permission.OrganizationRolePermissionExample;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserRole;
import br.crm.pojo.permission.OrganizationUserRoleExample;
import br.crm.service.permission.RoleManageCrmService;
import br.crm.vo.permission.OperationVo;
import br.crm.vo.permission.OrganizationRoleVo;
import br.crm.vo.permission.PermissionResult;
import br.crm.vo.permission.PermissionVo;
import br.crm.vo.permission.RoleResult;

/**
 * 
 * @ClassName: RoleManageCrmServiceImpl
 * @Description: 权限管理接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:14:27
 *
 */
@Service
public class RoleManageCrmServiceImpl implements RoleManageCrmService {

	@Autowired
	private OrganizationRoleMapper brRoleMapper;

	@Autowired
	private OrganizationRolePermissionSelfMapper brRolePermissionSelfMapper;

	@Autowired
	private OrganizationRolePermissionMapper brRolePermissionMapper;

	@Autowired
	private OrganizationOperationMapper brOperationMapper;
	
	@Autowired
	private OrganizationPermissionOperationMapper brPermissionOperationMapper;
	
	@Autowired
	private OrganizationUserRoleMapper brUserRoleMapper;

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getListBrRole
	 * </p>
	 * <p>
	 * Description:获取对象列表
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getListBrRole(java.lang.Integer, java.lang.Integer)
	 */
	public RoleResult getListBrRole(Integer page, Integer rows, String OrgId) {
		// 分页处理
		PageHelper.startPage(page, rows);
		// 执行查询
		OrganizationRoleExample example = new OrganizationRoleExample();
		example.setOrderByClause("role_status");
		example.createCriteria().andOrgIdEqualTo(OrgId);
		List<OrganizationRole> list = brRoleMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			// 取总记录数
			PageInfo<OrganizationRole> pageInfo = new PageInfo<OrganizationRole>(list);
			// 返回的结果
			RoleResult result = new RoleResult();
			result.setList(list);
			result.setTotal(pageInfo.getTotal());
			result.setStatus(200);
			result.setData(null);
			result.setMsg("查询成功");
			return result;
		}
		return null;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBrRoleByRoleId
	 * </p>
	 * <p>
	 * Description:根据roleid获取对象信息
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getBrRoleByRoleId(java.lang.Long)
	 */
	public OrganizationRole getBrRoleByRoleId(Long id) {

		OrganizationRole brRole = brRoleMapper.selectByPrimaryKey(id);

		return brRole;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getRoleIdByName
	 * </p>
	 * <p>
	 * Description:根据角色名称获取id
	 * </p>
	 * 
	 * @param name
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getRoleIdByName(java.lang.String)
	 */
	public int getRoleIdByName(String name, String orgid) {
		OrganizationRoleExample example = new OrganizationRoleExample();
		example.createCriteria().andRoleNameEqualTo(name).andOrgIdEqualTo(orgid);
		int roleId = brRoleMapper.selectByExample(example).get(0).getRoleId().intValue();
		return roleId;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addBrRole
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param brRole
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#addBrRole(br.crm.pojo.permission.OrganizationRole)
	 */
	public int addBrRole(OrganizationRole brRole) {

		return brRoleMapper.insertSelective(brRole);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateBrRoleByRoleId
	 * </p>
	 * <p>
	 * Description:根据roleid修改对象信息
	 * </p>
	 * 
	 * @param brRole
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#updateBrRoleByRoleId(br.crm.pojo.permission.OrganizationRole)
	 */
	public int updateBrRoleByRoleId(OrganizationRole brRole) {

		return brRoleMapper.updateByPrimaryKeySelective(brRole);
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
	 * @param brRolePermission
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#insertUserRole(java.util.List)
	 */
	public int insertUserRole(List<OrganizationRolePermission> brRolePermission) {

		return brRolePermissionSelfMapper.insertRolePermission(brRolePermission);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getRolePermissionById
	 * </p>
	 * <p>
	 * Description:根据id获取对象列表
	 * </p>
	 * 
	 * @param roleId
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getRolePermissionById(java.lang.Long)
	 */
	public List<PermissionResult> getRolePermissionById(Long roleId) {
		// 1.查询所有的权限
		List<PermissionResult> list = brRolePermissionSelfMapper.selectAllPermission();
		// 2.查询出该角色所拥有的权限
		List<PermissionResult> RoleList = brRolePermissionSelfMapper.selectPermissionByRoleId(roleId);

		List<PermissionResult> listResult = new ArrayList<PermissionResult>();

		for (PermissionResult p : list) {
			for (PermissionResult permissionResult : RoleList) {
				if (p.getId().longValue() == permissionResult.getId().longValue()) {
					p.setChecked(true);
					break;
				}
			}
		}
		for (PermissionResult p : list) {

			if (p.getpId() == 0) {

				PermissionResult per = new PermissionResult();

				per.setId(p.getId());

				per.setName(p.getName());

				per.setChecked(p.isChecked());

				per.setpId(p.getpId());
				for (PermissionResult p3 : list) {
					if (p3.getpId().longValue() == p.getId().longValue()) {
						per.getChildren().add(p3);
					}
				}
				listResult.add(per);
			}

		}

		return listResult;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updategetRolePermission
	 * </p>
	 * <p>
	 * Description:修改对象
	 * </p>
	 * 
	 * @param rolePermissonList
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#updategetRolePermission(java.util.List)
	 */
	public int updategetRolePermission(List<OrganizationRolePermission> rolePermissonList) {

		Long id = rolePermissonList.get(0).getRolePermissionId();
		// 先删除。在插入
		brRolePermissionMapper.deleteByPrimaryKey(id);

		return brRolePermissionSelfMapper.insertRolePermission(rolePermissonList);

	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getPermissionAndOperationByIdAndOpen
	 * </p>
	 * <p>
	 * Description:根据idandopen获取对象列表
	 * </p>
	 * 
	 * @param roleId
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getPermissionAndOperationByIdAndOpen(java.lang.Long)
	 */
	public List<PermissionVo> getPermissionAndOperationByIdAndOpen(Long roleId) {

		List<PermissionVo> result = new ArrayList<PermissionVo>();
		// 查询所有可用权限
		List<PermissionVo> permissionList = brRolePermissionSelfMapper.getPermissionListAndOpen();
		// 查询中间表(角色与权限)标记为true的
		List<PermissionVo> permission_select_list = brRolePermissionSelfMapper.getPermissionListByRoleId(roleId);

		for (PermissionVo brPermission : permissionList) {
			if (brPermission.getPermissionLevel().intValue() == 1) {
				// 初始化权限的子节点
				Predicate pre_child_permission = new MyPredicate("permissionParentId", brPermission.getPermissionId());
				List<PermissionVo> permissionChildList = (List<PermissionVo>) CollectionUtils.select(permissionList, pre_child_permission);
				brPermission.setChildrens(permissionChildList);
				result.add(brPermission);
			}

			// 初始化选中的权限
			Predicate pre_permission = new MyPredicate("permissionId", brPermission.getPermissionId());
			List<PermissionVo> permissionSelectList = (List<PermissionVo>) CollectionUtils.select(permission_select_list, pre_permission);
			if (CollectionUtils.isNotEmpty(permissionSelectList)) {
				brPermission.setPermissionFlag(true);
			}

			// 查询权限下所有操作功能
			List<OperationVo> operation_list = brRolePermissionSelfMapper.getBrOperationListByPermissionId(brPermission.getPermissionId());
			// 查询角色权限中间表
			OrganizationRolePermissionExample example = new OrganizationRolePermissionExample();
			example.createCriteria().andRoleIdEqualTo(roleId).andPermissionIdEqualTo(brPermission.getPermissionId());
			List<OrganizationRolePermission> rolePermissionList = brRolePermissionMapper.selectByExample(example);
			for (OrganizationRolePermission organizationRolePermission : rolePermissionList) {
				// 查询权限操作中间表
				OrganizationPermissionOperationExample oexample = new OrganizationPermissionOperationExample();
				oexample.createCriteria().andRolePermissionIdEqualTo(organizationRolePermission.getRolePermissionId()).andStatusEqualTo(0);
				List<OrganizationPermissionOperation> per_operation_list = brPermissionOperationMapper.selectByExample(oexample);
				for (OperationVo operationVo : operation_list) {
					for (OrganizationPermissionOperation brPermissionOperation : per_operation_list) {
						if (operationVo.getOperationId().equals(brPermissionOperation.getOperationId())) {
							operationVo.setOperationFlag(true);
						}
					}
				}
			}
			brPermission.setList(operation_list);
		}
		return result;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: savePermission
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param roleId
	 * @param firstIndex
	 * @param opeIndex
	 * @param user
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#savePermission(java.lang.Long, java.util.List, java.util.List, br.crm.pojo.permission.OrganizationUser)
	 */
	public int savePermission(Long roleId, List<Long> firstIndex, List<Long> opeIndex, OrganizationUser user) {

		try {
			// 1.根据角色的ID查询出该角色所有的权限ID
			List<PermissionVo> permission_select_list = brRolePermissionSelfMapper.getPermissionListByRoleId(roleId);
			// 根据角色权限删除绑定的操作
			if (CollectionUtils.isNotEmpty(permission_select_list)) {
				for (PermissionVo permission : permission_select_list) {
					// 2.根据权限的ID查询出该操作ID
					OrganizationRolePermissionExample example = new OrganizationRolePermissionExample();
					example.createCriteria().andPermissionIdEqualTo(permission.getPermissionId()).andRoleIdEqualTo(roleId);
					List<OrganizationRolePermission> list = brRolePermissionMapper.selectByExample(example);
					if (CollectionUtils.isNotEmpty(list)) {
						for (OrganizationRolePermission organizationRolePermission : list) {
							// 3.根据中间表权限的ID删除所有的操作ID
							// 根据角色权限删除原先绑定操作关联
							OrganizationPermissionOperationExample permissionOperationExample = new OrganizationPermissionOperationExample();
							permissionOperationExample.createCriteria().andRolePermissionIdEqualTo(organizationRolePermission.getRolePermissionId());
							brPermissionOperationMapper.deleteByExample(permissionOperationExample);
						}
					}
					// 4.根据角色的ID删除中间表所有的权限ID
					// 根据角色和权限id删除角色权限关联
					brRolePermissionMapper.deleteByExample(example);
				}
			}
			
			
			
			// 5.添加中间表权限与角色ID(根据角色的id添加)
			for (Long permissionId : firstIndex) {
				OrganizationRolePermission rolePermission = new OrganizationRolePermission();
				rolePermission.setPermissionId(permissionId);
				rolePermission.setRoleId(roleId);
				rolePermission.setRolePermissionStatus(0);
				rolePermission.setRolePermissionCreateTime(new Date());
				rolePermission.setRolePermissionEditTime(rolePermission.getRolePermissionCreateTime());
				brRolePermissionMapper.insertSelective(rolePermission);

				OrganizationOperationExample opExample = new OrganizationOperationExample();
				opExample.createCriteria().andPermissionIdEqualTo(permissionId).andOperationStatusEqualTo(0);
				List<OrganizationOperation> operationList = brOperationMapper.selectByExample(opExample);
				for (OrganizationOperation organizationOperation : operationList) {
					if (opeIndex.contains(organizationOperation.getOperationId())) {
						OrganizationPermissionOperation bo = new OrganizationPermissionOperation();
						bo.setOperationId(organizationOperation.getOperationId());
						bo.setRolePermissionId(rolePermission.getRolePermissionId());
						bo.setCreatetime(new Date());
						bo.setStatus(0);
						bo.setEditUserId(user.getUserId());
						bo.setEditUserName(user.getUserLoginName());
						bo.setEdittime(bo.getCreatetime());
						brPermissionOperationMapper.insert(bo);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return 1;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getRoleListByUserId
	 * </p>
	 * <p>
	 * Description:根据id获取对象列表
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.RoleManageCrmService#getRoleListByUserId(java.lang.String)
	 */
	@Override
	public List<OrganizationRoleVo> getRoleListByUserId(String userId) {
		List<OrganizationRoleVo> result = new ArrayList<OrganizationRoleVo>();
		// 根据用户的Id查询角色的id
		OrganizationUserRoleExample example = new OrganizationUserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<OrganizationUserRole> userRoleList = brUserRoleMapper.selectByExample(example);
		for (OrganizationUserRole brUserRole : userRoleList) {
			OrganizationRole brRole = brRoleMapper.selectByPrimaryKey(brUserRole.getRoleId());
			OrganizationRoleVo roleVo = new OrganizationRoleVo();
			roleVo.setRoleId(brRole.getRoleId());
			roleVo.setRoleName(brRole.getRoleName());
			result.add(roleVo);
		}
		return result;
	}

}
