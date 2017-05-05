package br.crm.pojo.branch;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrganizationBranch implements Serializable {
    private String branchId;

    private String branchName;

    private String orgId;

    private String branchCode;
    				
    private Integer branchProvinceId;

    private Integer branchCityId;

    private Integer branchAreaId;

    private String branchAddress;

    private String examStartTime;

    private String examEndTime;

    private Integer splitSuite;

    private Integer warnPeople;

    private Integer limitPeople;

    private BigDecimal warnAmount;

    private BigDecimal limitAmount;

    private String note;

    private String summary;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }

    public Integer getBranchProvinceId() {
        return branchProvinceId;
    }

    public void setBranchProvinceId(Integer branchProvinceId) {
        this.branchProvinceId = branchProvinceId;
    }

    public Integer getBranchCityId() {
        return branchCityId;
    }

    public void setBranchCityId(Integer branchCityId) {
        this.branchCityId = branchCityId;
    }

    public Integer getBranchAreaId() {
        return branchAreaId;
    }

    public void setBranchAreaId(Integer branchAreaId) {
        this.branchAreaId = branchAreaId;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress == null ? null : branchAddress.trim();
    }

    public String getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(String examStartTime) {
        this.examStartTime = examStartTime == null ? null : examStartTime.trim();
    }

    public String getExamEndTime() {
        return examEndTime;
    }

    public void setExamEndTime(String examEndTime) {
        this.examEndTime = examEndTime == null ? null : examEndTime.trim();
    }

    public Integer getSplitSuite() {
        return splitSuite;
    }

    public void setSplitSuite(Integer splitSuite) {
        this.splitSuite = splitSuite;
    }

    public Integer getWarnPeople() {
        return warnPeople;
    }

    public void setWarnPeople(Integer warnPeople) {
        this.warnPeople = warnPeople;
    }

    public Integer getLimitPeople() {
        return limitPeople;
    }

    public void setLimitPeople(Integer limitPeople) {
        this.limitPeople = limitPeople;
    }

    public BigDecimal getWarnAmount() {
        return warnAmount;
    }

    public void setWarnAmount(BigDecimal warnAmount) {
        this.warnAmount = warnAmount;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}