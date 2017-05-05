package br.crm.service.permission;

import java.util.List;

import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationRolePermission;

public interface OrganizationOperationCrmService {
	
	public List<OrganizationOperation> getListByEntity(OrganizationOperation entity);
	
	public List<OrganizationOperation> getListByRole(OrganizationRolePermission rolePermission);

}
