package br.crm.service.orgexamfeeitem;

import java.util.List;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClass;

public interface OrgExamFeeItemClassService {
    
    List<OrganizationExamFeeItemClass> getAllOrgExamItemClass();
    
    int insertOrgExamFeeItemClass(OrganizationExamFeeItemClass orgExamFeeItemClass);
    
    OrganizationExamFeeItemClass getOrgExamFeeItemClassById(String id);
    
    int updateOrgExamFeeItemClass(OrganizationExamFeeItemClass orgExamFeeItemClass);
    
    void initData();
}
