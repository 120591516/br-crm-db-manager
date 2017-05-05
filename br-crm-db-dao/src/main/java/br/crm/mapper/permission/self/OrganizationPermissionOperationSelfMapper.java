package br.crm.mapper.permission.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.permission.OrganizationPermissionOperation;

public interface OrganizationPermissionOperationSelfMapper {

	List<OrganizationPermissionOperation> getBrPer_OpeListByPerId(Long permissionId);

	int insertOption(@Param("permissionId") Integer permissionId, @Param("operationId") Integer operationId);

}
