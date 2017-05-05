package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.Date;

public class OrganizationRolePermission implements Serializable{
    private Long rolePermissionId;

    private Long roleId;

    private Long permissionId;

    private Integer rolePermissionStatus;

    private Date rolePermissionCreateTime;

    private Date rolePermissionEditTime;

    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRolePermissionStatus() {
        return rolePermissionStatus;
    }

    public void setRolePermissionStatus(Integer rolePermissionStatus) {
        this.rolePermissionStatus = rolePermissionStatus;
    }

    public Date getRolePermissionCreateTime() {
        return rolePermissionCreateTime;
    }

    public void setRolePermissionCreateTime(Date rolePermissionCreateTime) {
        this.rolePermissionCreateTime = rolePermissionCreateTime;
    }

    public Date getRolePermissionEditTime() {
        return rolePermissionEditTime;
    }

    public void setRolePermissionEditTime(Date rolePermissionEditTime) {
        this.rolePermissionEditTime = rolePermissionEditTime;
    }
}