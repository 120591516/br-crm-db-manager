package br.crm.service.permission;

import java.util.List;

import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.permission.OrganizationRoleVo;
import br.crm.vo.permission.PermissionResult;
import br.crm.vo.permission.PermissionVo;
import br.crm.vo.permission.RoleResult;

public interface RoleManageCrmService {

	// 查询所有角色
	RoleResult getListBrRole(Integer page, Integer rows,String OrgId);

	OrganizationRole getBrRoleByRoleId(Long id);
	
	int getRoleIdByName(String name,String orgid);

	int addBrRole(OrganizationRole brRole);

	int updateBrRoleByRoleId(OrganizationRole brRole);

	int insertUserRole(List<OrganizationRolePermission> brRolePermission);

	List<PermissionResult> getRolePermissionById(Long roleId);

	int updategetRolePermission(List<OrganizationRolePermission> rolePermissonList);

	List<PermissionVo> getPermissionAndOperationByIdAndOpen(Long roleId);

	int savePermission(Long roleId, List<Long> firstIndex, List<Long> opeIndex, OrganizationUser brUser);

	public List<OrganizationRoleVo> getRoleListByUserId(String userId);

}
