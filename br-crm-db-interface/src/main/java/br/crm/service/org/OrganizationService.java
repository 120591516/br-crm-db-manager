package br.crm.service.org;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationEmail;
import br.crm.pojo.org.OrganizationLevel;
import br.crm.pojo.org.OrganizationReview;
import br.crm.vo.org.OrganizationAllInfoVo;
import br.crm.vo.org.OrganizationQu;
import br.crm.vo.org.OrganizationVo;
import br.crm.vo.org.RegistOrgInfoVo;

public interface OrganizationService {
	
	PageInfo<OrganizationVo> getOrganizationByPage(OrganizationQu organizationQu,int page,int rows);

	String insertOrganization(RegistOrgInfoVo organization);

	OrganizationVo getOrganizationById(String orgId);

	int updateOrganization(Organization organization);

	List<OrganizationLevel> getOrganizationLevel();

	OrganizationAllInfoVo getOrgAllInfoById(String orgId);

	int reviewOrganization(Organization organization,OrganizationReview orgReview);

	List<Organization> getAvailableOrgs();

	int insertOrgEmail(OrganizationEmail orgEmail);

	List<OrganizationReview> getreviewOrganizationListById(String orgId);

}
