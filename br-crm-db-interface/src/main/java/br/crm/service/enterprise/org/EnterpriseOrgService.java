package br.crm.service.enterprise.org;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.enterprise.org.EnterpriseOrg;

public interface EnterpriseOrgService {
	
	PageInfo<EnterpriseOrg> getEnterpriseOrgByPage(Integer page,Integer rows, EnterpriseOrg enterpriseOrg);
	
	List<EnterpriseOrg> getAllEnterpriseOrg();
	
	EnterpriseOrg getEnterpriseOrgById(String enterpriseOrgId);
	
	int insertEnterpriseOrg(EnterpriseOrg enterpriseOrg);
	
	int updateEnterpriseOrg(EnterpriseOrg enterpriseOrg);

}
