package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationInvest;

public interface OrgInvestService {

    int insertOrgInvest(OrganizationInvest organizationInvest);

    List<OrganizationInvest> getOrgInvestByOrgId(String orgId);

    int updateOrgInvest(OrganizationInvest organizationInvest);

    int deleteOrgInvest(Long orgInvestId);

    OrganizationInvest getOrgInvestByInvestId(Long orgInvestId);

    List<OrganizationInvest> getAll();

}
