package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.Date;

public class OrganizationUserRole implements Serializable{
    private Long userRoleId;

    private String userId;

    private Long roleId;

    private Integer userRoleStatus;

    private Date userRoleCreateTime;

    private Date userRoleEditTime;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getUserRoleStatus() {
        return userRoleStatus;
    }

    public void setUserRoleStatus(Integer userRoleStatus) {
        this.userRoleStatus = userRoleStatus;
    }

    public Date getUserRoleCreateTime() {
        return userRoleCreateTime;
    }

    public void setUserRoleCreateTime(Date userRoleCreateTime) {
        this.userRoleCreateTime = userRoleCreateTime;
    }

    public Date getUserRoleEditTime() {
        return userRoleEditTime;
    }

    public void setUserRoleEditTime(Date userRoleEditTime) {
        this.userRoleEditTime = userRoleEditTime;
    }
}