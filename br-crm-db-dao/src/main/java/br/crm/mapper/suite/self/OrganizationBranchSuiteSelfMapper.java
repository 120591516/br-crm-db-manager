package br.crm.mapper.suite.self;

import java.util.List;







import org.apache.ibatis.annotations.Param;

import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface OrganizationBranchSuiteSelfMapper {

	
	List<OrgExamSuiteVo> selectByParam(OrgExamSuiteQu orgExamSuiteQu);
	
	OrgExamSuiteVo selectByPrimaryKey(@Param("orgBranchSuiteId")String orgBranchSuiteId);

	int addBranchSuite(@Param("orgBranchSuite")OrganizationBranchSuite orgBranchSuite, @Param("suiteId")List<String> suiteId);

	List<String> getSelectSuiteByBranchId(@Param("branchId")String  branchId);


}
