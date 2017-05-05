package br.crm.service.examitem;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.examitem.OrganizationExamItemUserVo;
public interface OrgExamItemUserService {
	
	PageInfo<OrganizationExamItemUserVo> getOrganizationExamItemUser(Integer page,Integer rows,
			String userId,String examId,String feeItemId,String orgId,String branchId,String deptId);
	
	OrganizationExamItemUser selectOrgExamItemUserById(String examItemUserId);
	
	OrganizationExamItemUser selectOrgExamItemUserByParam(String organizationUserId,String organizationExamItemId);
	
	int updateOrgExamItemUser(OrganizationExamItemUser organizationExamItemUser);
	
	int deleteOrgExamItemUser(String organizationExamItemUserId);
	
	int saveUser(String itemId, OrganizationUser orgUser);
	
	void initData();
}
