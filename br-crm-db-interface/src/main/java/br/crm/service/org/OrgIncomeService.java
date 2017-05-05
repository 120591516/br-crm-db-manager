package br.crm.service.org;

import java.util.List;

import br.crm.pojo.org.OrganizationIncome;

public interface OrgIncomeService {

    int insertOrgIncome(OrganizationIncome organizationIncome);

    List<OrganizationIncome> getOrgIncomeByOrgId(String orgId);

    int updateOrgIncome(OrganizationIncome organizationIncome);

    int deleteOrgIncome(long orgIncomeId);

    OrganizationIncome getOrgIncomeByIncomeId(Long orgIncomeId);

    List<OrganizationIncome> getAll();

}
