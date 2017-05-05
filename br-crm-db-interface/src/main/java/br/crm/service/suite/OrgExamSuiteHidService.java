package br.crm.service.suite;

 

import br.crm.pojo.suite.OrganizationExamSuiteHid;

import com.github.pagehelper.PageInfo;

public interface OrgExamSuiteHidService {

	PageInfo<OrganizationExamSuiteHid> getOrgExamSuiteHidList(Integer page,
			Integer rows);


	int insetOrgExamSuiteHid(OrganizationExamSuiteHid orgExamSuiteHid);


	int updateOrgExamSuiteHid(OrganizationExamSuiteHid orgExamSuiteHid);
	
	//套餐-高发疾病redis缓存
	void initData();
	
}
