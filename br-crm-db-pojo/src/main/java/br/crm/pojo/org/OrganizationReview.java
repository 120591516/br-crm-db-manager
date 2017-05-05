package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationReview implements Serializable {
    private Long orgReviewId;

    private String orgId;

    private Integer orgReviewResult;

    private String orgReviewMessage;

    private Long orgReviewPersonId;

    private Date orgReviewCreateTime;

    public Long getOrgReviewId() {
        return orgReviewId;
    }

    public void setOrgReviewId(Long orgReviewId) {
        this.orgReviewId = orgReviewId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Integer getOrgReviewResult() {
        return orgReviewResult;
    }

    public void setOrgReviewResult(Integer orgReviewResult) {
        this.orgReviewResult = orgReviewResult;
    }

    public String getOrgReviewMessage() {
        return orgReviewMessage;
    }

    public void setOrgReviewMessage(String orgReviewMessage) {
        this.orgReviewMessage = orgReviewMessage == null ? null : orgReviewMessage.trim();
    }

    public Long getOrgReviewPersonId() {
        return orgReviewPersonId;
    }

    public void setOrgReviewPersonId(Long orgReviewPersonId) {
        this.orgReviewPersonId = orgReviewPersonId;
    }

    public Date getOrgReviewCreateTime() {
        return orgReviewCreateTime;
    }

    public void setOrgReviewCreateTime(Date orgReviewCreateTime) {
        this.orgReviewCreateTime = orgReviewCreateTime;
    }
}