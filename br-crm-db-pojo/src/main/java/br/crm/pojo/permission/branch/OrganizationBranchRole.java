package br.crm.pojo.permission.branch;

import java.util.Date;

public class OrganizationBranchRole {
    private Long branchRoleId;

    private String orgId;

    private String orgBranchId;

    private String roleName;

    private String roleDescribe;

    private Integer roleStatus;

    private Date roleCreateTime;

    public Long getBranchRoleId() {
        return branchRoleId;
    }

    public void setBranchRoleId(Long branchRoleId) {
        this.branchRoleId = branchRoleId;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }
}