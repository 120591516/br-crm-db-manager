package br.crm.mapper.permission.self;

import java.util.List;

import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationPermission;



public interface BrOperationMapperQu {

	List<OrganizationOperation> getBrOperationList(int intValue);

	List<OrganizationOperation> getBrOperationListByIdAndOpen(int longValue);

	List<OrganizationPermission>getPermissionListByRoleId(Long roleId);

}
