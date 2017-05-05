package br.crm.service.group;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.group.EnterpriseGroupSuite;

public interface EnterpriseGroupSuiteService {
	
	PageInfo<EnterpriseGroupSuite> getEnterpriseGroupSuiteByPage(Integer page,Integer rows, EnterpriseGroupSuite enterpriseGroupSuite);
	
	List<EnterpriseGroupSuite> getAllCEnterpriseGroupSuite();
	
	EnterpriseGroupSuite getEnterpriseGroupSuiteById(String enterpriseGroupSuiteId);
	
	int insertEnterpriseGroupSuite(EnterpriseGroupSuite enterpriseGroupSuite);
	
	int updateEnterpriseGroupSuite(EnterpriseGroupSuite enterpriseGroupSuite);

}
