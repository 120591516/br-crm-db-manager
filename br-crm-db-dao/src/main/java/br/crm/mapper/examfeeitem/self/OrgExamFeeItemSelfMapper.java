package br.crm.mapper.examfeeitem.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.vo.examfeeitem.OrgExamFeeItemQu;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;

public interface OrgExamFeeItemSelfMapper {
    
    List<OrganizationExamFeeItem> selectByLike(@Param("orgExamFeeItemQu")OrgExamFeeItemQu orgExamFeeItemQu);
    
    OrgExamFeeItemVo selectById(String id);
    
    List<OrgExamFeeItemVo> getOrgExamFeeItemBySId(String orgExamSuiteId);
}
