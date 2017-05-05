package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationWeb;

public interface OrgWebService {

    int insertOrgWeb(OrganizationWeb organizationWeb);

    List<OrganizationWeb> getOrgWebByOrgId(String orgId);

    int updateOrgWeb(OrganizationWeb organizationWeb);

    int deleteOrgWeb(Long orgWebId);

    List<OrganizationWeb> getAll();

}
