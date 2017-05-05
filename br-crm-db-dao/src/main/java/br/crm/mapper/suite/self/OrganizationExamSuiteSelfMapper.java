package br.crm.mapper.suite.self;

import java.util.List;









import org.apache.ibatis.annotations.Param;

import br.crm.vo.suite.OrgExamSuiteHidVo;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteTypeVo;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface OrganizationExamSuiteSelfMapper {

	
	List<OrgExamSuiteVo> selectByParam(OrgExamSuiteQu orgExamSuiteQu);
	
	OrgExamSuiteVo selectByPrimaryKey(@Param("idOrgExamSuite")String idOrgExamSuite);

	List<OrgExamSuiteTypeVo> getOrgExamSuiteTypeBySuiteId(@Param("examSuiteId")String examSuiteId);

	List<OrgExamSuiteHidVo> getOrgExamSuiteHidBySuiteId(@Param("examSuiteId")String examSuiteId);

	int insert(OrgExamSuiteVo orgExamSuiteVo);

	List<OrgExamSuiteVo> searchSuite(OrgExamSuiteQu orgExamSuiteQu);
	 

	

}
