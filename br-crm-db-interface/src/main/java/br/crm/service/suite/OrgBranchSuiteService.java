package br.crm.service.suite;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import br.crm.vo.branch.OrganizationBranchVo;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface OrgBranchSuiteService {
 
	PageInfo<OrgExamSuiteVo> getOrgBranchSuite(Integer page, Integer rows,
			OrgExamSuiteQu orgExamSuiteQu);
	
	OrgExamSuiteVo getBranchSuiteById(String orgBranchSuiteId);

	int updateOrgBranchSuite(OrganizationBranchSuite orgBranchSuite); 
	
	int insertBranchSuite(OrganizationBranchSuite orgBranchSuite, String suiteIds); 

	List<OrganizationBranchVo> getOrgBranchBySuiteId(String examSuiteId);
	
	List<OrgExamSuiteVo> getOrgBranchSuiteByBranchId(String branchId);

	List<OrganizationBranchSuite> getAllOrgBranchSuiteByExample();
	
	

}
