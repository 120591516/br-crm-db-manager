package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.Date;

public class OrganizationUserManager implements Serializable{
    private String userManagerId;

    private String orgId;

    private String branchId;

    private String userId;

    private String userManagerObjId;

    private String userManagerObjName;

    private Integer userManagerType;

    private Integer userManagerStatus;

    private Date userManagerCreateTime;

    private Date userManagerEditTime;

    private Integer userManagerEditPlat;

    private String userManagerEditPersonId;

    public String getUserManagerId() {
        return userManagerId;
    }

    public void setUserManagerId(String userManagerId) {
        this.userManagerId = userManagerId == null ? null : userManagerId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserManagerObjId() {
        return userManagerObjId;
    }

    public void setUserManagerObjId(String userManagerObjId) {
        this.userManagerObjId = userManagerObjId == null ? null : userManagerObjId.trim();
    }

    public String getUserManagerObjName() {
        return userManagerObjName;
    }

    public void setUserManagerObjName(String userManagerObjName) {
        this.userManagerObjName = userManagerObjName == null ? null : userManagerObjName.trim();
    }

    public Integer getUserManagerType() {
        return userManagerType;
    }

    public void setUserManagerType(Integer userManagerType) {
        this.userManagerType = userManagerType;
    }

    public Integer getUserManagerStatus() {
        return userManagerStatus;
    }

    public void setUserManagerStatus(Integer userManagerStatus) {
        this.userManagerStatus = userManagerStatus;
    }

    public Date getUserManagerCreateTime() {
        return userManagerCreateTime;
    }

    public void setUserManagerCreateTime(Date userManagerCreateTime) {
        this.userManagerCreateTime = userManagerCreateTime;
    }

    public Date getUserManagerEditTime() {
        return userManagerEditTime;
    }

    public void setUserManagerEditTime(Date userManagerEditTime) {
        this.userManagerEditTime = userManagerEditTime;
    }

    public Integer getUserManagerEditPlat() {
        return userManagerEditPlat;
    }

    public void setUserManagerEditPlat(Integer userManagerEditPlat) {
        this.userManagerEditPlat = userManagerEditPlat;
    }

    public String getUserManagerEditPersonId() {
        return userManagerEditPersonId;
    }

    public void setUserManagerEditPersonId(String userManagerEditPersonId) {
        this.userManagerEditPersonId = userManagerEditPersonId == null ? null : userManagerEditPersonId.trim();
    }
}