package br.crm.vo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.crm.pojo.permission.OrganizationRole;
public class OrganizationRoleVo extends OrganizationRole implements Serializable{
	/**
	 * 
	 */
	private String userId,userEditId;
	private String userLoginName,userName,userPhone,userEmail,userPassword,userEditName,rolesForm;
	private Integer userStatus;
	private Date userCreateTime,userEditTime,userLoginTime,userLastTime;
	private List<OrganizationRole> roles ;
	
	
	
	private static final long serialVersionUID = 1L;
	private List<PermissionVo> permissionList = new ArrayList<PermissionVo>();

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserEditId() {
		return userEditId;
	}

	public void setUserEditId(String userEditId) {
		this.userEditId = userEditId;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEditName() {
		return userEditName;
	}

	public void setUserEditName(String userEditName) {
		this.userEditName = userEditName;
	}

	public String getRolesForm() {
		return rolesForm;
	}

	public void setRolesForm(String rolesForm) {
		this.rolesForm = rolesForm;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Date getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Date getUserEditTime() {
		return userEditTime;
	}

	public void setUserEditTime(Date userEditTime) {
		this.userEditTime = userEditTime;
	}

	public Date getUserLoginTime() {
		return userLoginTime;
	}

	public void setUserLoginTime(Date userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	public Date getUserLastTime() {
		return userLastTime;
	}

	public void setUserLastTime(Date userLastTime) {
		this.userLastTime = userLastTime;
	}

	public List<OrganizationRole> getRoles() {
		return roles;
	}

	public void setRoles(List<OrganizationRole> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<PermissionVo> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<PermissionVo> permissionList) {
		this.permissionList = permissionList;
	}
	
	

}
