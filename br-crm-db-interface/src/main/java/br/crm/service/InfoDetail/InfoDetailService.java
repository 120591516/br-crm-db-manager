package br.crm.service.InfoDetail;

import br.crm.vo.branch.OrganizationBranchVo;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface InfoDetailService {

	OrgExamSuiteVo showSuiteInfoDetail(String suiteId);

	OrganizationBranchVo showBranchInfoDetail(String branchId);

}
