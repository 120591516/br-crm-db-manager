package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationSoft implements Serializable {
    private Long orgSoftId;

    private String orgId;

    private String orgSoftName;

    private Double orgSoftPrice;

    private String orgSoftCompany;

    private String orgSoftFunc;

    private Integer orgSoftstatus;

    private Date orgSoftCreateTime;

    private Date orgSoftEditTime;

    public Long getOrgSoftId() {
        return orgSoftId;
    }

    public void setOrgSoftId(Long orgSoftId) {
        this.orgSoftId = orgSoftId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgSoftName() {
        return orgSoftName;
    }

    public void setOrgSoftName(String orgSoftName) {
        this.orgSoftName = orgSoftName == null ? null : orgSoftName.trim();
    }

    public Double getOrgSoftPrice() {
        return orgSoftPrice;
    }

    public void setOrgSoftPrice(Double orgSoftPrice) {
        this.orgSoftPrice = orgSoftPrice;
    }

    public String getOrgSoftCompany() {
        return orgSoftCompany;
    }

    public void setOrgSoftCompany(String orgSoftCompany) {
        this.orgSoftCompany = orgSoftCompany == null ? null : orgSoftCompany.trim();
    }

    public String getOrgSoftFunc() {
        return orgSoftFunc;
    }

    public void setOrgSoftFunc(String orgSoftFunc) {
        this.orgSoftFunc = orgSoftFunc == null ? null : orgSoftFunc.trim();
    }

    public Integer getOrgSoftstatus() {
        return orgSoftstatus;
    }

    public void setOrgSoftstatus(Integer orgSoftstatus) {
        this.orgSoftstatus = orgSoftstatus;
    }

    public Date getOrgSoftCreateTime() {
        return orgSoftCreateTime;
    }

    public void setOrgSoftCreateTime(Date orgSoftCreateTime) {
        this.orgSoftCreateTime = orgSoftCreateTime;
    }

    public Date getOrgSoftEditTime() {
        return orgSoftEditTime;
    }

    public void setOrgSoftEditTime(Date orgSoftEditTime) {
        this.orgSoftEditTime = orgSoftEditTime;
    }
}