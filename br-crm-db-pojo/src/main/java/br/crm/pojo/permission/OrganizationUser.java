package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.Date;

public class OrganizationUser implements Serializable{
    private String userId;

    private String userLoginName;

    private String orgId;

    private String orgBranchId;

    private String orgBranchDeptId;

    private String userName;

    private String userPhone;

    private String userEmail;

    private String userIdcard;

    private String userPassword;

    private Integer userStatus;

    private Date userCreateTime;

    private Date userEditTime;

    private String userEditId;

    private String userEditName;

    private Date userLoginTime;

    private Date userLastTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgBranchId() {
        return orgBranchId;
    }

    public void setOrgBranchId(String orgBranchId) {
        this.orgBranchId = orgBranchId == null ? null : orgBranchId.trim();
    }

    public String getOrgBranchDeptId() {
        return orgBranchDeptId;
    }

    public void setOrgBranchDeptId(String orgBranchDeptId) {
        this.orgBranchDeptId = orgBranchDeptId == null ? null : orgBranchDeptId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
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

    public String getUserEditId() {
        return userEditId;
    }

    public void setUserEditId(String userEditId) {
        this.userEditId = userEditId == null ? null : userEditId.trim();
    }

    public String getUserEditName() {
        return userEditName;
    }

    public void setUserEditName(String userEditName) {
        this.userEditName = userEditName == null ? null : userEditName.trim();
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
}