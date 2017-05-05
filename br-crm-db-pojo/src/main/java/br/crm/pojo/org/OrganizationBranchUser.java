package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationBranchUser implements Serializable {
    /**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 1L;

	private String orgBranchUserId;

    private String orgId;

    private String orgBranchId;

    private String orgUserId;

    private Integer orgBranchUserStatus;

    private Date orgBranchUserCreateTime;

    private Date orgBranchUserEditTime;

    public String getOrgBranchUserId() {
        return orgBranchUserId;
    }

    public void setOrgBranchUserId(String orgBranchUserId) {
        this.orgBranchUserId = orgBranchUserId == null ? null : orgBranchUserId.trim();
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

    public String getOrgUserId() {
        return orgUserId;
    }

    public void setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId == null ? null : orgUserId.trim();
    }

    public Integer getOrgBranchUserStatus() {
        return orgBranchUserStatus;
    }

    public void setOrgBranchUserStatus(Integer orgBranchUserStatus) {
        this.orgBranchUserStatus = orgBranchUserStatus;
    }

    public Date getOrgBranchUserCreateTime() {
        return orgBranchUserCreateTime;
    }

    public void setOrgBranchUserCreateTime(Date orgBranchUserCreateTime) {
        this.orgBranchUserCreateTime = orgBranchUserCreateTime;
    }

    public Date getOrgBranchUserEditTime() {
        return orgBranchUserEditTime;
    }

    public void setOrgBranchUserEditTime(Date orgBranchUserEditTime) {
        this.orgBranchUserEditTime = orgBranchUserEditTime;
    }
}