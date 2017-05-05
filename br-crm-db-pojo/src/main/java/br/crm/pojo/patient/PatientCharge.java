package br.crm.pojo.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PatientCharge implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientChargeId;

    private String patientId;

    private String payWay;

    private String payWayName;

    private BigDecimal patientChargeMoneyAmount;

    private BigDecimal patientChargeMoneyAmountPaid;

    private Boolean patientChargeFeeconfirmed;

    private Boolean patientChargeWorkByOrgDelta;

    private Boolean patientChargeFeeTransfered;

    private Boolean patientChargeFeeCharged;

    private Boolean patientChargeFeeChargedOnCredit;

    private Boolean patientChargeIsReturn;

    private Boolean patientChargeReceiptPrinted;

    private String patientChargeChargerId;

    private Date patientChargeChargeTime;

    private Integer patientChargeVerThisRecord;

    private Boolean patientChargeWorkInnerModify;

    private Date patientChargeCreateTime;

    private Date patientChargeEditTime;

    private Integer patientChargeStatus;

    private String patientChargeNote;

    public String getPatientChargeId() {
        return patientChargeId;
    }

    public void setPatientChargeId(String patientChargeId) {
        this.patientChargeId = patientChargeId == null ? null : patientChargeId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName == null ? null : payWayName.trim();
    }

    public BigDecimal getPatientChargeMoneyAmount() {
        return patientChargeMoneyAmount;
    }

    public void setPatientChargeMoneyAmount(BigDecimal patientChargeMoneyAmount) {
        this.patientChargeMoneyAmount = patientChargeMoneyAmount;
    }

    public BigDecimal getPatientChargeMoneyAmountPaid() {
        return patientChargeMoneyAmountPaid;
    }

    public void setPatientChargeMoneyAmountPaid(BigDecimal patientChargeMoneyAmountPaid) {
        this.patientChargeMoneyAmountPaid = patientChargeMoneyAmountPaid;
    }

    public Boolean getPatientChargeFeeconfirmed() {
        return patientChargeFeeconfirmed;
    }

    public void setPatientChargeFeeconfirmed(Boolean patientChargeFeeconfirmed) {
        this.patientChargeFeeconfirmed = patientChargeFeeconfirmed;
    }

    public Boolean getPatientChargeWorkByOrgDelta() {
        return patientChargeWorkByOrgDelta;
    }

    public void setPatientChargeWorkByOrgDelta(Boolean patientChargeWorkByOrgDelta) {
        this.patientChargeWorkByOrgDelta = patientChargeWorkByOrgDelta;
    }

    public Boolean getPatientChargeFeeTransfered() {
        return patientChargeFeeTransfered;
    }

    public void setPatientChargeFeeTransfered(Boolean patientChargeFeeTransfered) {
        this.patientChargeFeeTransfered = patientChargeFeeTransfered;
    }

    public Boolean getPatientChargeFeeCharged() {
        return patientChargeFeeCharged;
    }

    public void setPatientChargeFeeCharged(Boolean patientChargeFeeCharged) {
        this.patientChargeFeeCharged = patientChargeFeeCharged;
    }

    public Boolean getPatientChargeFeeChargedOnCredit() {
        return patientChargeFeeChargedOnCredit;
    }

    public void setPatientChargeFeeChargedOnCredit(Boolean patientChargeFeeChargedOnCredit) {
        this.patientChargeFeeChargedOnCredit = patientChargeFeeChargedOnCredit;
    }

    public Boolean getPatientChargeIsReturn() {
        return patientChargeIsReturn;
    }

    public void setPatientChargeIsReturn(Boolean patientChargeIsReturn) {
        this.patientChargeIsReturn = patientChargeIsReturn;
    }

    public Boolean getPatientChargeReceiptPrinted() {
        return patientChargeReceiptPrinted;
    }

    public void setPatientChargeReceiptPrinted(Boolean patientChargeReceiptPrinted) {
        this.patientChargeReceiptPrinted = patientChargeReceiptPrinted;
    }

    public String getPatientChargeChargerId() {
        return patientChargeChargerId;
    }

    public void setPatientChargeChargerId(String patientChargeChargerId) {
        this.patientChargeChargerId = patientChargeChargerId == null ? null : patientChargeChargerId.trim();
    }

    public Date getPatientChargeChargeTime() {
        return patientChargeChargeTime;
    }

    public void setPatientChargeChargeTime(Date patientChargeChargeTime) {
        this.patientChargeChargeTime = patientChargeChargeTime;
    }

    public Integer getPatientChargeVerThisRecord() {
        return patientChargeVerThisRecord;
    }

    public void setPatientChargeVerThisRecord(Integer patientChargeVerThisRecord) {
        this.patientChargeVerThisRecord = patientChargeVerThisRecord;
    }

    public Boolean getPatientChargeWorkInnerModify() {
        return patientChargeWorkInnerModify;
    }

    public void setPatientChargeWorkInnerModify(Boolean patientChargeWorkInnerModify) {
        this.patientChargeWorkInnerModify = patientChargeWorkInnerModify;
    }

    public Date getPatientChargeCreateTime() {
        return patientChargeCreateTime;
    }

    public void setPatientChargeCreateTime(Date patientChargeCreateTime) {
        this.patientChargeCreateTime = patientChargeCreateTime;
    }

    public Date getPatientChargeEditTime() {
        return patientChargeEditTime;
    }

    public void setPatientChargeEditTime(Date patientChargeEditTime) {
        this.patientChargeEditTime = patientChargeEditTime;
    }

    public Integer getPatientChargeStatus() {
        return patientChargeStatus;
    }

    public void setPatientChargeStatus(Integer patientChargeStatus) {
        this.patientChargeStatus = patientChargeStatus;
    }

    public String getPatientChargeNote() {
        return patientChargeNote;
    }

    public void setPatientChargeNote(String patientChargeNote) {
        this.patientChargeNote = patientChargeNote == null ? null : patientChargeNote.trim();
    }
}