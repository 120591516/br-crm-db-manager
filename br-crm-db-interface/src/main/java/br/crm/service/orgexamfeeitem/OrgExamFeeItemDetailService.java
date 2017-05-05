package br.crm.service.orgexamfeeitem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetail;
import br.crm.vo.examitem.OrganizationExamFeeItemDetailVo;

public interface OrgExamFeeItemDetailService {
    int batchInsertOrgExamFeeItemDetail(OrganizationExamFeeItem orgExamFeeItem,String examItemId);
    
    int deleteOrgExamFeeItemDetail(String examFeeItemId);
    
    int updateOrgExamFeeItemDetail(OrganizationExamFeeItemDetail organizationExamFeeItemDetail);
    
    OrganizationExamFeeItemDetail SelectOrgExamFeeItemDetailByPrimaryKey(String examFeeItemDetailId);
    
    PageInfo<OrganizationExamFeeItemDetailVo> getOrgExamFeeItemDetailByPage(Integer page,Integer rows,
    		String feeItemId,String orgId,String branchId );
    
    List<OrganizationExamFeeItemDetail> getAllOrgExamFeeItemDetail();
    
}
