package br.crm.pojo.permission.branch;

import java.util.Date;

public class OrganizationBranchRolePermission {
    private Long rolePermissionId;

    private Long branchRoleId;

    private Long branchPermissionId;

    private Integer rolePermissionStatus;

    private Date rolePermissionCreateTime;

    private Date rolePermissionEditTime;

    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Long getBranchRoleId() {
        return branchRoleId;
    }

    public void setBranchRoleId(Long branchRoleId) {
        this.branchRoleId = branchRoleId;
    }

    public Long getBranchPermissionId() {
        return branchPermissionId;
    }

    public void setBranchPermissionId(Long branchPermissionId) {
        this.branchPermissionId = branchPermissionId;
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