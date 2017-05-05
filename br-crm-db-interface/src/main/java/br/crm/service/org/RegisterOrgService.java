package br.crm.service.org;

import br.crm.vo.org.RegistOrgInfoVo;

public interface RegisterOrgService {

	int insertOrgInfo(RegistOrgInfoVo registOrgInfoVo);

	int getCountByUserName(String userName);
	
	int getCountByOrganizationTotalName(String totalName);

}
