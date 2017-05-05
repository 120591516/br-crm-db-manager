package br.crm.service.suite;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.suite.OrganizationExamSuiteFeeItem;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface OrgExamFeeItemSuiteService {
    PageInfo<OrganizationExamSuiteFeeItem> getOrgExamFeeItemSuiteByPage(Integer page, Integer rows);

    int insertOrgExamFeeItemSuite(OrganizationExamSuiteFeeItem orgExamFeeItemSuite);
    
    int updateOrgExamFeeItemSuite(OrganizationExamSuiteFeeItem orgExamFeeItemSuite);
    
    int insertOrgExamFeeItemSuite(String examSuiteId,String examFeeItemDetailId);

    OrganizationExamSuiteFeeItem getOrgExamFeeItemSuiteById(String examFisId); 
    
    List<Map<String, String>> getSuiteListByOrgId(String orgId);
    
    PageInfo<OrgExamFeeItemVo> getOrgExamFeeItemBySuitId(String orgId, String orgExamSuiteId, Integer page, Integer rows);
    
    PageInfo<OrgExamFeeItemVo> getOrgExamFeeItemBySId(String orgId, String orgExamSuiteId, Integer page, Integer rows);
    
    List<OrganizationExamSuiteFeeItem> getAllOrgExamFeeItemSuite();
    
    int countExamFeeItemRelation(String id);
    
    
}
