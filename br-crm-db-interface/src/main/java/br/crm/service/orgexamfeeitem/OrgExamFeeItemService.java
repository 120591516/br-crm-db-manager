package br.crm.service.orgexamfeeitem;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.vo.examfeeitem.OrgExamFeeItemQu;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;

public interface OrgExamFeeItemService {
    PageInfo<OrganizationExamFeeItem> getOrgExamItemByPage(OrgExamFeeItemQu orgExamFeeItem,Integer page, Integer rows);

    int insertOrganizationExamFeeItem(OrganizationExamFeeItem organizationExamFeeItem);

    OrganizationExamFeeItem getOrganizationExamFeeItemById(String id);

    int updateOrganizationExamFeeItemById(OrganizationExamFeeItem organizationExamFeeItem);
    
    OrgExamFeeItemVo getOrganizationExamFeeItemByPrimaryKey(String id);

    List<OrganizationExamFeeItem> getAllOrgExamFeeItem();
  
	
    
}
