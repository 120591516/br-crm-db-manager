package br.crm.mapper.permission.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.permission.OrganizationPermission;
import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.vo.permission.OperationVo;
import br.crm.vo.permission.PermissionResult;
import br.crm.vo.permission.PermissionVo;


public interface OrganizationRolePermissionSelfMapper {


	int insertRolePermission(List<OrganizationRolePermission> permission);

	List<PermissionResult> selectAllPermission();
	
	List<PermissionResult> selectPermissionByRoleId(Long id);

	List<PermissionVo> getPermissionListAndOpen();

	List<PermissionVo> getPermissionListByRoleId(Long roleId);

	List<OperationVo> getBrOperationListByPermissionId(Long permissionId);

	int insertPermission(@Param("roleId")Long roleId,@Param("firstIndex") List firstIndex);

	int insertTwoPermission(@Param("roleId")Long roleId,@Param("secIndex") List secIndex);
	
}
