package br.crm.service.suite;


import java.util.List;


import com.github.pagehelper.PageInfo;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface  OrgExamSuiteService {

	PageInfo<OrgExamSuiteVo> getOrgExamSuite(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu);

	int updateOrgExamSuite(OrgExamSuiteVo orgExamSuiteVo);

	int insertOrgExamSuite(OrgExamSuiteVo orgExamSuiteVo);

	OrgExamSuiteVo getOrgExamSuiteById(String idOrgExamSuite);

	int delectOrgExamSuite(String idOrgExamSuite); 

	PageInfo<OrgExamSuiteVo> searchSuite(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu);

	/** 
	* @Title: getOrgExamSuiteLimitPeople 
	* @Description: TODO
	* @param @param page
	* @param @param rows
	* @param @param orgExamSuiteQu
	* @param @return    
	* @return PageInfo<OrganizationExamSuite>    
	* @throws 
	*/
	PageInfo<OrganizationExamSuite> getOrgExamSuiteLimitPeople(Integer page,
			Integer rows, OrgExamSuiteQu orgExamSuiteQu);

	/**
	 * @param warnPeople  
	* @Title: updateOrgExamSuiteLimitPeople 
	* @Description: TODO
	* @param @param suiteId
	* @param @param limitPeople
	* @param @return    
	* @return int    
	* @throws 
	*/
	int updateOrgExamSuiteLimitPeople(String suiteId, Integer limitPeople, Integer warnPeople);
	
	List<OrganizationExamSuite> getAllOrgExamSuite();
	
	Integer sumSuiteNum(String examSuiteId);
	
	}
