package br.crm.service.impl.org;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationReviewMapper;
import br.crm.pojo.org.OrganizationReview;
import br.crm.pojo.org.OrganizationReviewExample;
import br.crm.service.org.OrgReviewService;

@Service
public class OrgReviewServiceImpl implements OrgReviewService {

	@Autowired
	private OrganizationReviewMapper organizationReviewMapper;

	@Override
	public List<OrganizationReview> getOrganizationReviewByOrgId(String orgId) {

		OrganizationReviewExample example = new OrganizationReviewExample();

		example.createCriteria().andOrgIdEqualTo(orgId);
		example.setOrderByClause(" org_review_create_time desc");
		List<OrganizationReview> list = organizationReviewMapper.selectByExample(example);
		return list;
	}
}
