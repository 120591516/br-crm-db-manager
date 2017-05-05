package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationSale;

public interface OrgSaleService {

    int insertOrgSale(OrganizationSale organizationSale);

    List<OrganizationSale> getOrgSaleByOrgId(String orgId);

    int updateOrgSale(OrganizationSale organizationSale);

    OrganizationSale getOrgSaleBySaleId(Long orgSaleId);

    List<OrganizationSale> getAll();

}
