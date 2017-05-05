package br.crm.mapper.permission.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.permission.OrganizationUserRole;
import br.crm.vo.permission.OrganizationRoleVo;
import br.crm.vo.permission.RoleModel;
import br.crm.vo.permission.UserPermissionVo;

public interface BrUserRoleSelfMapper {

	List<UserPermissionVo> getUserPermission(String userId);

	OrganizationRoleVo getUserRoleById(String userId);

	List<OrganizationRoleVo> getUserVoByPage();

	List<RoleModel> getAllRoles(@Param("orgid")String orgId);

	List<RoleModel> getRolesByUserId(String userId);

}
