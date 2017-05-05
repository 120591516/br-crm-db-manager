package br.crm.pojo.suite;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrganizationExamSuite implements Serializable {
    private String examSuiteId;

    private String orgId;

    private String examSuiteName;

    private String examSuiteNameEng;

    private String examSuiteCode;

    private BigDecimal examSuitePrice;

    private BigDecimal examSuiteDiscountPrice;

    private BigDecimal examSuiteInPrice;

    private Integer examSuiteMale;

    private Integer examSuiteFemale;

    private Integer examSuiteWarnPeople;

    private Integer examSuiteLimitPeople;

    private BigDecimal examSuiteWarnAmount;

    private BigDecimal examSuiteLimitAmount;

    private String examSuiteImgUrl;

    private String examSuiteInputCode;

    private Integer examSuiteDispOrder;

    private String examSuiteNote;

    private Integer examSuiteStatus;

    private Date examSuiteCreateTime;

    private Date examSuiteEditTime;

    private String examSuiteSummary;

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getExamSuiteName() {
        return examSuiteName;
    }

    public void setExamSuiteName(String examSuiteName) {
        this.examSuiteName = examSuiteName == null ? null : examSuiteName.trim();
    }

    public String getExamSuiteNameEng() {
        return examSuiteNameEng;
    }

    public void setExamSuiteNameEng(String examSuiteNameEng) {
        this.examSuiteNameEng = examSuiteNameEng == null ? null : examSuiteNameEng.trim();
    }

    public String getExamSuiteCode() {
        return examSuiteCode;
    }

    public void setExamSuiteCode(String examSuiteCode) {
        this.examSuiteCode = examSuiteCode == null ? null : examSuiteCode.trim();
    }

    public BigDecimal getExamSuitePrice() {
        return examSuitePrice;
    }

    public void setExamSuitePrice(BigDecimal examSuitePrice) {
        this.examSuitePrice = examSuitePrice;
    }

    public BigDecimal getExamSuiteDiscountPrice() {
        return examSuiteDiscountPrice;
    }

    public void setExamSuiteDiscountPrice(BigDecimal examSuiteDiscountPrice) {
        this.examSuiteDiscountPrice = examSuiteDiscountPrice;
    }

    public BigDecimal getExamSuiteInPrice() {
        return examSuiteInPrice;
    }

    public void setExamSuiteInPrice(BigDecimal examSuiteInPrice) {
        this.examSuiteInPrice = examSuiteInPrice;
    }

    public Integer getExamSuiteMale() {
        return examSuiteMale;
    }

    public void setExamSuiteMale(Integer examSuiteMale) {
        this.examSuiteMale = examSuiteMale;
    }

    public Integer getExamSuiteFemale() {
        return examSuiteFemale;
    }

    public void setExamSuiteFemale(Integer examSuiteFemale) {
        this.examSuiteFemale = examSuiteFemale;
    }

    public Integer getExamSuiteWarnPeople() {
        return examSuiteWarnPeople;
    }

    public void setExamSuiteWarnPeople(Integer examSuiteWarnPeople) {
        this.examSuiteWarnPeople = examSuiteWarnPeople;
    }

    public Integer getExamSuiteLimitPeople() {
        return examSuiteLimitPeople;
    }

    public void setExamSuiteLimitPeople(Integer examSuiteLimitPeople) {
        this.examSuiteLimitPeople = examSuiteLimitPeople;
    }

    public BigDecimal getExamSuiteWarnAmount() {
        return examSuiteWarnAmount;
    }

    public void setExamSuiteWarnAmount(BigDecimal examSuiteWarnAmount) {
        this.examSuiteWarnAmount = examSuiteWarnAmount;
    }

    public BigDecimal getExamSuiteLimitAmount() {
        return examSuiteLimitAmount;
    }

    public void setExamSuiteLimitAmount(BigDecimal examSuiteLimitAmount) {
        this.examSuiteLimitAmount = examSuiteLimitAmount;
    }

    public String getExamSuiteImgUrl() {
        return examSuiteImgUrl;
    }

    public void setExamSuiteImgUrl(String examSuiteImgUrl) {
        this.examSuiteImgUrl = examSuiteImgUrl == null ? null : examSuiteImgUrl.trim();
    }

    public String getExamSuiteInputCode() {
        return examSuiteInputCode;
    }

    public void setExamSuiteInputCode(String examSuiteInputCode) {
        this.examSuiteInputCode = examSuiteInputCode == null ? null : examSuiteInputCode.trim();
    }

    public Integer getExamSuiteDispOrder() {
        return examSuiteDispOrder;
    }

    public void setExamSuiteDispOrder(Integer examSuiteDispOrder) {
        this.examSuiteDispOrder = examSuiteDispOrder;
    }

    public String getExamSuiteNote() {
        return examSuiteNote;
    }

    public void setExamSuiteNote(String examSuiteNote) {
        this.examSuiteNote = examSuiteNote == null ? null : examSuiteNote.trim();
    }

    public Integer getExamSuiteStatus() {
        return examSuiteStatus;
    }

    public void setExamSuiteStatus(Integer examSuiteStatus) {
        this.examSuiteStatus = examSuiteStatus;
    }

    public Date getExamSuiteCreateTime() {
        return examSuiteCreateTime;
    }

    public void setExamSuiteCreateTime(Date examSuiteCreateTime) {
        this.examSuiteCreateTime = examSuiteCreateTime;
    }

    public Date getExamSuiteEditTime() {
        return examSuiteEditTime;
    }

    public void setExamSuiteEditTime(Date examSuiteEditTime) {
        this.examSuiteEditTime = examSuiteEditTime;
    }

    public String getExamSuiteSummary() {
        return examSuiteSummary;
    }

    public void setExamSuiteSummary(String examSuiteSummary) {
        this.examSuiteSummary = examSuiteSummary == null ? null : examSuiteSummary.trim();
    }
}