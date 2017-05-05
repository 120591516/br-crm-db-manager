package br.crm.vo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.org.Organization;
import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.pojo.permission.OrganizationUser;


/**
 * 医生的实体类
 * 
 * @author zxy
 *
 */
public class OrgUserVo extends OrganizationUser implements Serializable {
	private String departName ="";// 科室名称
	private String organizationName ="";// 机构名称
	private String branchName ="";// 门店名称
	private List<OrganizationRoleVo> roles = new ArrayList<OrganizationRoleVo>();
	private List<UserPermissionVo> userPermissionVos;
	private Organization organization;
	private List<OrganizationBranch> branchs;
	
	private String roleName = new String();

		
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<OrganizationRoleVo> getRoles() {
		return roles;
	}

	public void setRoles(List<OrganizationRoleVo> roles) {
		this.roles = roles;
	}

	public List<UserPermissionVo> getUserPermissionVos() {
		return userPermissionVos;
	}

	public void setUserPermissionVos(List<UserPermissionVo> userPermissionVos) {
		this.userPermissionVos = userPermissionVos;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<OrganizationBranch> getBranchs() {
		return branchs;
	}

	public void setBranchs(List<OrganizationBranch> branchs) {
		this.branchs = branchs;
	}
	

}
