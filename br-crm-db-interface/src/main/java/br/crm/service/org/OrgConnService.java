package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationConn;

public interface OrgConnService {
    int insertOrganizationConn(OrganizationConn organizationConn);

    List<OrganizationConn> getOrgConnByOrgId(String orgId);

    int updateOrgConn(OrganizationConn organizationConn);

    OrganizationConn getOrgConnByOrgConnId(Long orgConnId);

    List<OrganizationConn> getAllConn();

}
