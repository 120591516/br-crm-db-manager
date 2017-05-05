package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationSale implements Serializable {
    private Long orgSaleId;

    private String orgId;

    private Long orgSalePersonId;

    private String orgSalePersonName;

    private Integer orgSaleStatus;

    private Date orgSaleCreateTime;

    private Date orgSaleEditTime;

    public Long getOrgSaleId() {
        return orgSaleId;
    }

    public void setOrgSaleId(Long orgSaleId) {
        this.orgSaleId = orgSaleId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Long getOrgSalePersonId() {
        return orgSalePersonId;
    }

    public void setOrgSalePersonId(Long orgSalePersonId) {
        this.orgSalePersonId = orgSalePersonId;
    }

    public String getOrgSalePersonName() {
        return orgSalePersonName;
    }

    public void setOrgSalePersonName(String orgSalePersonName) {
        this.orgSalePersonName = orgSalePersonName == null ? null : orgSalePersonName.trim();
    }

    public Integer getOrgSaleStatus() {
        return orgSaleStatus;
    }

    public void setOrgSaleStatus(Integer orgSaleStatus) {
        this.orgSaleStatus = orgSaleStatus;
    }

    public Date getOrgSaleCreateTime() {
        return orgSaleCreateTime;
    }

    public void setOrgSaleCreateTime(Date orgSaleCreateTime) {
        this.orgSaleCreateTime = orgSaleCreateTime;
    }

    public Date getOrgSaleEditTime() {
        return orgSaleEditTime;
    }

    public void setOrgSaleEditTime(Date orgSaleEditTime) {
        this.orgSaleEditTime = orgSaleEditTime;
    }
}