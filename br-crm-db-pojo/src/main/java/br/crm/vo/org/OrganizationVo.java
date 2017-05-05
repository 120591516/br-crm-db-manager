package br.crm.vo.org;

import br.crm.pojo.org.Organization;

public class OrganizationVo extends Organization {

	private String orgLevelName;

	private String orgNatureName;

	public String getOrgNatureName() {
		return orgNatureName;
	}

	public void setOrgNatureName(String orgNatureName) {
		this.orgNatureName = orgNatureName;
	}

	public String getOrgLevelName() {
		return orgLevelName;
	}

	public void setOrgLevelName(String orgLevelName) {
		this.orgLevelName = orgLevelName;
	}

}
