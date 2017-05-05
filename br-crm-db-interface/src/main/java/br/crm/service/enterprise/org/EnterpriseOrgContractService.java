package br.crm.service.enterprise.org;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.enterprise.org.EnterpriseOrgContract;

public interface EnterpriseOrgContractService {
	
	PageInfo<EnterpriseOrgContract> getEnterpriseOrgContractByPage(Integer page,Integer rows, EnterpriseOrgContract enterpriseOrgContract);
	
	List<EnterpriseOrgContract> getAllEnterpriseOrgContract();
	
	EnterpriseOrgContract getEnterpriseOrgContractById(String enterpriseOrgContractId);
	
	int insertEnterpriseOrgContract(EnterpriseOrgContract enterpriseOrgContract);
	
	int updateEnterpriseOrgContract(EnterpriseOrgContract enterpriseOrgContract);
}
