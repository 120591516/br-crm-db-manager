package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationConn implements Serializable {
    private Long orgConnId;

    private String orgId;

    private String orgConnName;

    private String orgConnPost;

    private String orgConnPhone;

    private String orgConnEmail;

    private String orgConnCall;

    private Integer orgConnStatus;

    private Date orgConnCreateTime;

    private Date orgConnEditTime;

    public Long getOrgConnId() {
        return orgConnId;
    }

    public void setOrgConnId(Long orgConnId) {
        this.orgConnId = orgConnId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgConnName() {
        return orgConnName;
    }

    public void setOrgConnName(String orgConnName) {
        this.orgConnName = orgConnName == null ? null : orgConnName.trim();
    }

    public String getOrgConnPost() {
        return orgConnPost;
    }

    public void setOrgConnPost(String orgConnPost) {
        this.orgConnPost = orgConnPost == null ? null : orgConnPost.trim();
    }

    public String getOrgConnPhone() {
        return orgConnPhone;
    }

    public void setOrgConnPhone(String orgConnPhone) {
        this.orgConnPhone = orgConnPhone == null ? null : orgConnPhone.trim();
    }

    public String getOrgConnEmail() {
        return orgConnEmail;
    }

    public void setOrgConnEmail(String orgConnEmail) {
        this.orgConnEmail = orgConnEmail == null ? null : orgConnEmail.trim();
    }

    public String getOrgConnCall() {
        return orgConnCall;
    }

    public void setOrgConnCall(String orgConnCall) {
        this.orgConnCall = orgConnCall == null ? null : orgConnCall.trim();
    }

    public Integer getOrgConnStatus() {
        return orgConnStatus;
    }

    public void setOrgConnStatus(Integer orgConnStatus) {
        this.orgConnStatus = orgConnStatus;
    }

    public Date getOrgConnCreateTime() {
        return orgConnCreateTime;
    }

    public void setOrgConnCreateTime(Date orgConnCreateTime) {
        this.orgConnCreateTime = orgConnCreateTime;
    }

    public Date getOrgConnEditTime() {
        return orgConnEditTime;
    }

    public void setOrgConnEditTime(Date orgConnEditTime) {
        this.orgConnEditTime = orgConnEditTime;
    }
}