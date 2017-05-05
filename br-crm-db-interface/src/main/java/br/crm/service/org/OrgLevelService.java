package br.crm.service.org;

import java.util.List;
import java.util.Map;

import br.crm.pojo.org.OrganizationLevel;

public interface OrgLevelService {

	int insertOrgLevel(OrganizationLevel organizationLevel);

	List<OrganizationLevel> getAllOrgLevel();
	
	List<Map<String,String>> getOrgAll();

	OrganizationLevel geOrgLevelById(String parseInt);

	int updateOrgLevel(OrganizationLevel organizationLevel);
}
