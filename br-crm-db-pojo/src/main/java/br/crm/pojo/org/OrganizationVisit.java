package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationVisit implements Serializable {
    private Long orgVisitId;

    private String orgId;

    private Date orgVisitTime;

    private String orgVisitOpinion;

    private Long orgVisitPersonId;

    private String orgVisitPersonName;

    private Date orgVisitNextTime;

    private Date orgVisitCreateTime;

    private Date orgVisitEditTime;

    public Long getOrgVisitId() {
        return orgVisitId;
    }

    public void setOrgVisitId(Long orgVisitId) {
        this.orgVisitId = orgVisitId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Date getOrgVisitTime() {
        return orgVisitTime;
    }

    public void setOrgVisitTime(Date orgVisitTime) {
        this.orgVisitTime = orgVisitTime;
    }

    public String getOrgVisitOpinion() {
        return orgVisitOpinion;
    }

    public void setOrgVisitOpinion(String orgVisitOpinion) {
        this.orgVisitOpinion = orgVisitOpinion == null ? null : orgVisitOpinion.trim();
    }

    public Long getOrgVisitPersonId() {
        return orgVisitPersonId;
    }

    public void setOrgVisitPersonId(Long orgVisitPersonId) {
        this.orgVisitPersonId = orgVisitPersonId;
    }

    public String getOrgVisitPersonName() {
        return orgVisitPersonName;
    }

    public void setOrgVisitPersonName(String orgVisitPersonName) {
        this.orgVisitPersonName = orgVisitPersonName == null ? null : orgVisitPersonName.trim();
    }

    public Date getOrgVisitNextTime() {
        return orgVisitNextTime;
    }

    public void setOrgVisitNextTime(Date orgVisitNextTime) {
        this.orgVisitNextTime = orgVisitNextTime;
    }

    public Date getOrgVisitCreateTime() {
        return orgVisitCreateTime;
    }

    public void setOrgVisitCreateTime(Date orgVisitCreateTime) {
        this.orgVisitCreateTime = orgVisitCreateTime;
    }

    public Date getOrgVisitEditTime() {
        return orgVisitEditTime;
    }

    public void setOrgVisitEditTime(Date orgVisitEditTime) {
        this.orgVisitEditTime = orgVisitEditTime;
    }
}