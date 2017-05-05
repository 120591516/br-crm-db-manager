package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationReview;

public interface OrgReviewService {

	List<OrganizationReview> getOrganizationReviewByOrgId(String orgId);

}
