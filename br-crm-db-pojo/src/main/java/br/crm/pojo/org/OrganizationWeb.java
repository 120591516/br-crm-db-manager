package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationWeb implements Serializable {
    private Long orgWebId;

    private String orgId;

    private Integer orgWebWechat;

    private Integer orgWebWebsite;

    private Integer orgWebApp;

    private Date orgWebCreateTime;

    private Date orgWebEditTime;

    public Long getOrgWebId() {
        return orgWebId;
    }

    public void setOrgWebId(Long orgWebId) {
        this.orgWebId = orgWebId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Integer getOrgWebWechat() {
        return orgWebWechat;
    }

    public void setOrgWebWechat(Integer orgWebWechat) {
        this.orgWebWechat = orgWebWechat;
    }

    public Integer getOrgWebWebsite() {
        return orgWebWebsite;
    }

    public void setOrgWebWebsite(Integer orgWebWebsite) {
        this.orgWebWebsite = orgWebWebsite;
    }

    public Integer getOrgWebApp() {
        return orgWebApp;
    }

    public void setOrgWebApp(Integer orgWebApp) {
        this.orgWebApp = orgWebApp;
    }

    public Date getOrgWebCreateTime() {
        return orgWebCreateTime;
    }

    public void setOrgWebCreateTime(Date orgWebCreateTime) {
        this.orgWebCreateTime = orgWebCreateTime;
    }

    public Date getOrgWebEditTime() {
        return orgWebEditTime;
    }

    public void setOrgWebEditTime(Date orgWebEditTime) {
        this.orgWebEditTime = orgWebEditTime;
    }
}