package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationInvest implements Serializable {
    private Long orgInvestId;

    private String orgId;

    private String orgInvestInvestment;

    private Date orgInvestTime;

    private Double orgInvestMoney;

    private String orgInvestWheel;

    private Date orgInvestCreateTime;

    private Date orgInvestEditTime;

    public Long getOrgInvestId() {
        return orgInvestId;
    }

    public void setOrgInvestId(Long orgInvestId) {
        this.orgInvestId = orgInvestId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgInvestInvestment() {
        return orgInvestInvestment;
    }

    public void setOrgInvestInvestment(String orgInvestInvestment) {
        this.orgInvestInvestment = orgInvestInvestment == null ? null : orgInvestInvestment.trim();
    }

    public Date getOrgInvestTime() {
        return orgInvestTime;
    }

    public void setOrgInvestTime(Date orgInvestTime) {
        this.orgInvestTime = orgInvestTime;
    }

    public Double getOrgInvestMoney() {
        return orgInvestMoney;
    }

    public void setOrgInvestMoney(Double orgInvestMoney) {
        this.orgInvestMoney = orgInvestMoney;
    }

    public String getOrgInvestWheel() {
        return orgInvestWheel;
    }

    public void setOrgInvestWheel(String orgInvestWheel) {
        this.orgInvestWheel = orgInvestWheel == null ? null : orgInvestWheel.trim();
    }

    public Date getOrgInvestCreateTime() {
        return orgInvestCreateTime;
    }

    public void setOrgInvestCreateTime(Date orgInvestCreateTime) {
        this.orgInvestCreateTime = orgInvestCreateTime;
    }

    public Date getOrgInvestEditTime() {
        return orgInvestEditTime;
    }

    public void setOrgInvestEditTime(Date orgInvestEditTime) {
        this.orgInvestEditTime = orgInvestEditTime;
    }
}