package br.crm.service.group;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.group.EnterpriseGroup;

public interface EnterpriseGroupService {
		
	PageInfo<EnterpriseGroup> getCustomerOrderPayInfoByPage(Integer page,Integer rows, EnterpriseGroup enterpriseGroup);
	
	List<EnterpriseGroup> getAllenterpriseGroup();
	
	EnterpriseGroup getEnterpriseGroupById(String enterpriseGroupId);
	
	int insertEnterpriseGroup(EnterpriseGroup enterpriseGroup);
	
	int updateEnterpriseGroup(EnterpriseGroup enterpriseGroup);

}
