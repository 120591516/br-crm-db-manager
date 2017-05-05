package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationSoft;

public interface OrgSoftService {

    int insertOrgSoft(OrganizationSoft organizationSoft);

    List<OrganizationSoft> getOrgSoftByOrgId(String orgId);

    int updateOrgSoft(OrganizationSoft organizationSoft);

    OrganizationSoft getOrgSoftBySoftId(Long orgSoftId);

    List<OrganizationSoft> getAll();

}
