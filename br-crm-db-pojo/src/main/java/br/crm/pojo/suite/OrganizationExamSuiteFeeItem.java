package br.crm.pojo.suite;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrganizationExamSuiteFeeItem implements Serializable{
    private String examFisId;

    private String organizationId;

    private String organizationBranchId;

    private String examFeeItemId;

    private String examSuiteId;

    private BigDecimal examFisPrice;

    private Integer examFisDispOrder;

    private String examFisNote;

    private Integer examFisStatus;

    private Date examFisCreateTime;

    private Date examFisEditTime;

    public String getExamFisId() {
        return examFisId;
    }

    public void setExamFisId(String examFisId) {
        this.examFisId = examFisId == null ? null : examFisId.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationBranchId() {
        return organizationBranchId;
    }

    public void setOrganizationBranchId(String organizationBranchId) {
        this.organizationBranchId = organizationBranchId == null ? null : organizationBranchId.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public BigDecimal getExamFisPrice() {
        return examFisPrice;
    }

    public void setExamFisPrice(BigDecimal examFisPrice) {
        this.examFisPrice = examFisPrice;
    }

    public Integer getExamFisDispOrder() {
        return examFisDispOrder;
    }

    public void setExamFisDispOrder(Integer examFisDispOrder) {
        this.examFisDispOrder = examFisDispOrder;
    }

    public String getExamFisNote() {
        return examFisNote;
    }

    public void setExamFisNote(String examFisNote) {
        this.examFisNote = examFisNote == null ? null : examFisNote.trim();
    }

    public Integer getExamFisStatus() {
        return examFisStatus;
    }

    public void setExamFisStatus(Integer examFisStatus) {
        this.examFisStatus = examFisStatus;
    }

    public Date getExamFisCreateTime() {
        return examFisCreateTime;
    }

    public void setExamFisCreateTime(Date examFisCreateTime) {
        this.examFisCreateTime = examFisCreateTime;
    }

    public Date getExamFisEditTime() {
        return examFisEditTime;
    }

    public void setExamFisEditTime(Date examFisEditTime) {
        this.examFisEditTime = examFisEditTime;
    }
}