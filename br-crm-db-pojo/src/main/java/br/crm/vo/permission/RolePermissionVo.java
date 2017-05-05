package br.crm.vo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.crm.pojo.permission.OrganizationPermission;

public class RolePermissionVo implements Serializable{
	private Long roleId;

    private String roleName;

    private String roleDescribe;

    private List<OrganizationPermission> permissions;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescribe() {
		return roleDescribe;
	}

	public void setRoleDescribe(String roleDescribe) {
		this.roleDescribe = roleDescribe;
	}


	public List<OrganizationPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<OrganizationPermission> permissions) {
		this.permissions = permissions;
	}
    
    

}
