package br.crm.mapper.suite.self;

import java.util.List;

import br.crm.pojo.suite.OrganizationExamSuiteFeeItem;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.crm.vo.suite.OrgExamSuiteVo;

public interface OrgExamFeeItemSuiteSelfMapper {

	OrgExamSuiteVo getFeeItemBySuite(String orgExamSuiteId);

    List<OrgExamFeeItemVo> getOrgExamFeeItemBySuitId(String orgExamSuiteId);
    
    List<OrgExamFeeItemVo> getAllOrgExamFeeItem();
    
    int batchInsertSelectiveOrgExamFeeItemSuite(List<OrganizationExamSuiteFeeItem> list); 
}
