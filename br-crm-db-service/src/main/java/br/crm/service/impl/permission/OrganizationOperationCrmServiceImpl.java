package br.crm.service.impl.permission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.permission.OrganizationOperationMapper;
import br.crm.mapper.permission.OrganizationPermissionOperationMapper;
import br.crm.pojo.org.Organization;
import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationOperationExample;
import br.crm.pojo.permission.OrganizationOperationExample.Criteria;
import br.crm.pojo.permission.OrganizationPermissionOperation;
import br.crm.pojo.permission.OrganizationPermissionOperationExample;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.service.permission.OrganizationOperationCrmService;

@Service
public class OrganizationOperationCrmServiceImpl implements OrganizationOperationCrmService {
	
	@Autowired
	private OrganizationOperationMapper mapper;
	
	@Autowired
	private OrganizationPermissionOperationMapper poMapper;

	@Override
	public List<OrganizationOperation> getListByEntity(OrganizationOperation entity) {
		OrganizationOperationExample example = new OrganizationOperationExample();
		if (null != entity) {
			Criteria criteria = example.createCriteria();
			if (null != entity.getPermissionId()) {
				criteria.andPermissionIdEqualTo(entity.getPermissionId());
			}
			if (null != entity.getOperationId()) {
				criteria.andOperationIdEqualTo(entity.getOperationId());
			}
		}
		
		return mapper.selectByExample(example);
	}

	@Override
	public List<OrganizationOperation> getListByRole(OrganizationRolePermission rolePermission) {
		List<OrganizationOperation> operationList = new ArrayList<OrganizationOperation>();
		OrganizationPermissionOperationExample opoExample = new OrganizationPermissionOperationExample();
		if (null != rolePermission) {
			br.crm.pojo.permission.OrganizationPermissionOperationExample.Criteria opoCriteria = opoExample.createCriteria();
			if (null != rolePermission.getRolePermissionId()) {
				opoCriteria.andRolePermissionIdEqualTo(rolePermission.getRolePermissionId());
			}
			List<OrganizationPermissionOperation> poList = poMapper.selectByExample(opoExample);
			for (OrganizationPermissionOperation organizationPermissionOperation : poList) {
				operationList.add(mapper.selectByPrimaryKey(organizationPermissionOperation.getOperationId()));
			}
		}
		
		return operationList;
	}

}
