package br.crm.service.permission;

import java.util.List;

import br.crm.pojo.org.Organization;
import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationPermission;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.vo.permission.PermissionResult;
import br.crm.vo.permission.PermissionVo;
import br.crm.vo.permission.UserPermissionVo;
public interface RolePermissionCrmService {

	List<PermissionResult> getPermissionList();

	List<OrganizationPermission> getMenuList();

	int insertPermission(OrganizationPermission brPermission);

	List<OrganizationOperation> getBrOperationList(Long permissionId);

	int addBrOperationByPermissionId(OrganizationOperation brOperation);

	int deletePermissionById(Long permissionId);

	int updatePermissionById(OrganizationPermission brPermission);

	OrganizationPermission getBrPermissionById(Long id);

	OrganizationOperation selectBrOperationById(Long operationId);

	int updateBrOperationById(OrganizationOperation brOperation);

	List<OrganizationOperation> getBrOperationListByIdAndOpen(Long permissionId);

	List<UserPermissionVo> getPermissionsByRoleId(List<Long> rolelist);

	List<OrganizationRolePermission> getRolePermissionsByRoleId(List<Long> rolelist);

	int deleteOperationById(Long id);

	OrganizationOperation getBrOperationById(Long operationId);

	int updateBrOperation(OrganizationOperation organizationOperation);


}
