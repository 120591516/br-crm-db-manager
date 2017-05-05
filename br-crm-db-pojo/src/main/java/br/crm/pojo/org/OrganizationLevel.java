package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationLevel implements Serializable{
    private Integer orgLevelId;

    private String orgLevelName;

    private Integer orgLevelStatus;

    private Date orgLevelCreatetime;

    private Date orgLevelEdittime;

    public Integer getOrgLevelId() {
        return orgLevelId;
    }

    public void setOrgLevelId(Integer orgLevelId) {
        this.orgLevelId = orgLevelId;
    }

    public String getOrgLevelName() {
        return orgLevelName;
    }

    public void setOrgLevelName(String orgLevelName) {
        this.orgLevelName = orgLevelName == null ? null : orgLevelName.trim();
    }

    public Integer getOrgLevelStatus() {
        return orgLevelStatus;
    }

    public void setOrgLevelStatus(Integer orgLevelStatus) {
        this.orgLevelStatus = orgLevelStatus;
    }

    public Date getOrgLevelCreatetime() {
        return orgLevelCreatetime;
    }

    public void setOrgLevelCreatetime(Date orgLevelCreatetime) {
        this.orgLevelCreatetime = orgLevelCreatetime;
    }

    public Date getOrgLevelEdittime() {
        return orgLevelEdittime;
    }

    public void setOrgLevelEdittime(Date orgLevelEdittime) {
        this.orgLevelEdittime = orgLevelEdittime;
    }
}