package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationCooperation implements Serializable {
    private Long orgCooperationId;

    private String orgId;

    private Integer orgCooperationVal;

    private String orgCooperationOpinion;

    private Date orgCooperationCreateTime;

    private Date orgCooperationEditTime;

    public Long getOrgCooperationId() {
        return orgCooperationId;
    }

    public void setOrgCooperationId(Long orgCooperationId) {
        this.orgCooperationId = orgCooperationId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Integer getOrgCooperationVal() {
        return orgCooperationVal;
    }

    public void setOrgCooperationVal(Integer orgCooperationVal) {
        this.orgCooperationVal = orgCooperationVal;
    }

    public String getOrgCooperationOpinion() {
        return orgCooperationOpinion;
    }

    public void setOrgCooperationOpinion(String orgCooperationOpinion) {
        this.orgCooperationOpinion = orgCooperationOpinion == null ? null : orgCooperationOpinion.trim();
    }

    public Date getOrgCooperationCreateTime() {
        return orgCooperationCreateTime;
    }

    public void setOrgCooperationCreateTime(Date orgCooperationCreateTime) {
        this.orgCooperationCreateTime = orgCooperationCreateTime;
    }

    public Date getOrgCooperationEditTime() {
        return orgCooperationEditTime;
    }

    public void setOrgCooperationEditTime(Date orgCooperationEditTime) {
        this.orgCooperationEditTime = orgCooperationEditTime;
    }
}