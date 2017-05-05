package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationCooperation;

public interface OrgCooperationService {

    int insertOrgCooperation(OrganizationCooperation orgCooperation);

    List<OrganizationCooperation> getOrgCooperationByOrgId(String orgId);

    int updateOrgCooperation(OrganizationCooperation organizationCooperation);

    int deleteOrgCooperation(Long orgCooperationId);

    List<OrganizationCooperation> getAll();

}
