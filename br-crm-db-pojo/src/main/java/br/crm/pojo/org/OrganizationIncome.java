package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationIncome implements Serializable {
    private Long orgIncomeId;

    private String orgId;

    private String orgIncomeYear;

    private Integer orgIncomeCount;

    private Double orgIncomeTurnover;

    private Double orgIncomeProfit;

    private Date orgIncomeCreateTime;

    private Date orgIncomeEditTime;

    public Long getOrgIncomeId() {
        return orgIncomeId;
    }

    public void setOrgIncomeId(Long orgIncomeId) {
        this.orgIncomeId = orgIncomeId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgIncomeYear() {
        return orgIncomeYear;
    }

    public void setOrgIncomeYear(String orgIncomeYear) {
        this.orgIncomeYear = orgIncomeYear == null ? null : orgIncomeYear.trim();
    }

    public Integer getOrgIncomeCount() {
        return orgIncomeCount;
    }

    public void setOrgIncomeCount(Integer orgIncomeCount) {
        this.orgIncomeCount = orgIncomeCount;
    }

    public Double getOrgIncomeTurnover() {
        return orgIncomeTurnover;
    }

    public void setOrgIncomeTurnover(Double orgIncomeTurnover) {
        this.orgIncomeTurnover = orgIncomeTurnover;
    }

    public Double getOrgIncomeProfit() {
        return orgIncomeProfit;
    }

    public void setOrgIncomeProfit(Double orgIncomeProfit) {
        this.orgIncomeProfit = orgIncomeProfit;
    }

    public Date getOrgIncomeCreateTime() {
        return orgIncomeCreateTime;
    }

    public void setOrgIncomeCreateTime(Date orgIncomeCreateTime) {
        this.orgIncomeCreateTime = orgIncomeCreateTime;
    }

    public Date getOrgIncomeEditTime() {
        return orgIncomeEditTime;
    }

    public void setOrgIncomeEditTime(Date orgIncomeEditTime) {
        this.orgIncomeEditTime = orgIncomeEditTime;
    }
}