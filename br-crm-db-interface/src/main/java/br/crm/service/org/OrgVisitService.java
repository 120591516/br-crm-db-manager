package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationVisit;

public interface OrgVisitService {

    int insertOrgVisit(OrganizationVisit organizationVisit);

    List<OrganizationVisit> getOrgVisitByOrgId(String orgId);

    int updateOrgVisit(OrganizationVisit organizationVisit);

    int deleteOrgVisit(Long orgVisitId);

    OrganizationVisit getOrgVisitByVisitId(Long orgVisitId);

    List<OrganizationVisit> getAll();

}
