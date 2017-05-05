package br.crm.vo.permission;

import java.io.Serializable;
import java.util.Date;

public class UserPermission implements Serializable{
	private Long permissionId;

	private String permissionName;

	private Integer permissionStatus;

	private String permissionUrl;

	private String permissionDescribe;

	private Integer permissionLevel;

	private Long permissionParentId;

	private Date permissionCreateTime;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public Integer getPermissionStatus() {
		return permissionStatus;
	}

	public void setPermissionStatus(Integer permissionStatus) {
		this.permissionStatus = permissionStatus;
	}

	public String getPermissionUrl() {
		return permissionUrl;
	}

	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}

	public String getPermissionDescribe() {
		return permissionDescribe;
	}

	public void setPermissionDescribe(String permissionDescribe) {
		this.permissionDescribe = permissionDescribe;
	}

	public Integer getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(Integer permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public Long getPermissionParentId() {
		return permissionParentId;
	}

	public void setPermissionParentId(Long permissionParentId) {
		this.permissionParentId = permissionParentId;
	}

	public Date getPermissionCreateTime() {
		return permissionCreateTime;
	}

	public void setPermissionCreateTime(Date permissionCreateTime) {
		this.permissionCreateTime = permissionCreateTime;
	}
	

}
