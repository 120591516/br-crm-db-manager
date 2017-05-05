package br.crm.pojo.patient.registerSheet;

import java.io.Serializable;
import java.util.Date;

public class PatientRegisterSheetDetail implements Serializable {
   

	private static final long serialVersionUID = 1L;

	private String regDetailId;

    private String regId;

    private Boolean regVirtualItem;

    private String patientFeeItemId;

    private String patientExamItemId;

    private String examFeeItemCode;

    private String examFeeItemName;

    private Long regUnitPrice;

    private Integer regQty;

    private Boolean regWorkInnerModify;

    private Date regDetailCreateTime;

    private Date regDetailEditTime;

    private Integer regDetailStatus;

    public String getRegDetailId() {
        return regDetailId;
    }

    public void setRegDetailId(String regDetailId) {
        this.regDetailId = regDetailId == null ? null : regDetailId.trim();
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId == null ? null : regId.trim();
    }

    public Boolean getRegVirtualItem() {
        return regVirtualItem;
    }

    public void setRegVirtualItem(Boolean regVirtualItem) {
        this.regVirtualItem = regVirtualItem;
    }

    public String getPatientFeeItemId() {
        return patientFeeItemId;
    }

    public void setPatientFeeItemId(String patientFeeItemId) {
        this.patientFeeItemId = patientFeeItemId == null ? null : patientFeeItemId.trim();
    }

    public String getPatientExamItemId() {
        return patientExamItemId;
    }

    public void setPatientExamItemId(String patientExamItemId) {
        this.patientExamItemId = patientExamItemId == null ? null : patientExamItemId.trim();
    }

    public String getExamFeeItemCode() {
        return examFeeItemCode;
    }

    public void setExamFeeItemCode(String examFeeItemCode) {
        this.examFeeItemCode = examFeeItemCode == null ? null : examFeeItemCode.trim();
    }

    public String getExamFeeItemName() {
        return examFeeItemName;
    }

    public void setExamFeeItemName(String examFeeItemName) {
        this.examFeeItemName = examFeeItemName == null ? null : examFeeItemName.trim();
    }

    public Long getRegUnitPrice() {
        return regUnitPrice;
    }

    public void setRegUnitPrice(Long regUnitPrice) {
        this.regUnitPrice = regUnitPrice;
    }

    public Integer getRegQty() {
        return regQty;
    }

    public void setRegQty(Integer regQty) {
        this.regQty = regQty;
    }

    public Boolean getRegWorkInnerModify() {
        return regWorkInnerModify;
    }

    public void setRegWorkInnerModify(Boolean regWorkInnerModify) {
        this.regWorkInnerModify = regWorkInnerModify;
    }

    public Date getRegDetailCreateTime() {
        return regDetailCreateTime;
    }

    public void setRegDetailCreateTime(Date regDetailCreateTime) {
        this.regDetailCreateTime = regDetailCreateTime;
    }

    public Date getRegDetailEditTime() {
        return regDetailEditTime;
    }

    public void setRegDetailEditTime(Date regDetailEditTime) {
        this.regDetailEditTime = regDetailEditTime;
    }

    public Integer getRegDetailStatus() {
        return regDetailStatus;
    }

    public void setRegDetailStatus(Integer regDetailStatus) {
        this.regDetailStatus = regDetailStatus;
    }
}