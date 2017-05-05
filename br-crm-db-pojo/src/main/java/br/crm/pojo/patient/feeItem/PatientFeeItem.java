package br.crm.pojo.patient.feeItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PatientFeeItem implements Serializable{
    private String patientFeeItemId;

    private String patientId;

    private String examFeeItemId;

    private String examFeeItemName;

    private BigDecimal patientFeeItemPrice;

    private BigDecimal patientFeeItemFactPrice;

    private BigDecimal patientFeeItemSettlePrice;

    private String payWayId;

    private Boolean patientFeeItemRegistered;

    private String patientFeeItemRegDoctorId;

    private String patientFeeItemRegDoctorName;

    private Date patientFeeItemRegisterTime;

    private String patientRegisterSheetId;

    private Boolean patientFeeItemRegReturned;

    private Boolean patientFeeItemCharged;

    private String patientFeeItemChargerId;

    private String patientFeeItemChargerName;

    private Date patientFeeItemChargerTime;

    private String patientFeeItemDiscounterId;

    private Integer patientFeeItemBatchNumber;

    private Integer patientFeeItemTubePosition;

    private Integer patientFeeItemSampleNumber;

    private Long patientFeeItemLabSampled;

    private String patientFeeItemLabSamplerId;

    private String patientFeeItemLabSamplerName;

    private Date patientFeeItemLabSamplerTime;

    private Boolean patientFeeItemLabSendLis;

    private Date patientFeeItemLabSendLisTime;

    private Boolean patientFeeItemLabRcvdFromLis;

    private Date patientFeeItemLabRcvdFromLisTime;

    private Boolean patientFeeItemGiveUp;

    private Boolean patientFeeItemExaminated;

    private String patientExamDepartId;

    private String examDoctorId;

    private String examDoctorName;

    private Date patientFeeItemExaminateTime;

    private Boolean patientFeeItemMarkFeeReturn;

    private Boolean patientFeeItemWorkInnerModify;

    private String patientFeeItemSevereDegree;

    private String patientFeeItemInterfaceMarks;

    private String patientFeeItemUrlResult;

    private Date patientFeeItemCreateTime;

    private Date patientFeeItemEditTime;

    private Integer patientFeeItemStatus;

    private String patientFeeItemPositiveSummary;

    public String getPatientFeeItemId() {
        return patientFeeItemId;
    }

    public void setPatientFeeItemId(String patientFeeItemId) {
        this.patientFeeItemId = patientFeeItemId == null ? null : patientFeeItemId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
    }

    public String getExamFeeItemName() {
        return examFeeItemName;
    }

    public void setExamFeeItemName(String examFeeItemName) {
        this.examFeeItemName = examFeeItemName == null ? null : examFeeItemName.trim();
    }

    public BigDecimal getPatientFeeItemPrice() {
        return patientFeeItemPrice;
    }

    public void setPatientFeeItemPrice(BigDecimal patientFeeItemPrice) {
        this.patientFeeItemPrice = patientFeeItemPrice;
    }

    public BigDecimal getPatientFeeItemFactPrice() {
        return patientFeeItemFactPrice;
    }

    public void setPatientFeeItemFactPrice(BigDecimal patientFeeItemFactPrice) {
        this.patientFeeItemFactPrice = patientFeeItemFactPrice;
    }

    public BigDecimal getPatientFeeItemSettlePrice() {
        return patientFeeItemSettlePrice;
    }

    public void setPatientFeeItemSettlePrice(BigDecimal patientFeeItemSettlePrice) {
        this.patientFeeItemSettlePrice = patientFeeItemSettlePrice;
    }

    public String getPayWayId() {
        return payWayId;
    }

    public void setPayWayId(String payWayId) {
        this.payWayId = payWayId == null ? null : payWayId.trim();
    }

    public Boolean getPatientFeeItemRegistered() {
        return patientFeeItemRegistered;
    }

    public void setPatientFeeItemRegistered(Boolean patientFeeItemRegistered) {
        this.patientFeeItemRegistered = patientFeeItemRegistered;
    }

    public String getPatientFeeItemRegDoctorId() {
        return patientFeeItemRegDoctorId;
    }

    public void setPatientFeeItemRegDoctorId(String patientFeeItemRegDoctorId) {
        this.patientFeeItemRegDoctorId = patientFeeItemRegDoctorId == null ? null : patientFeeItemRegDoctorId.trim();
    }

    public String getPatientFeeItemRegDoctorName() {
        return patientFeeItemRegDoctorName;
    }

    public void setPatientFeeItemRegDoctorName(String patientFeeItemRegDoctorName) {
        this.patientFeeItemRegDoctorName = patientFeeItemRegDoctorName == null ? null : patientFeeItemRegDoctorName.trim();
    }

    public Date getPatientFeeItemRegisterTime() {
        return patientFeeItemRegisterTime;
    }

    public void setPatientFeeItemRegisterTime(Date patientFeeItemRegisterTime) {
        this.patientFeeItemRegisterTime = patientFeeItemRegisterTime;
    }

    public String getPatientRegisterSheetId() {
        return patientRegisterSheetId;
    }

    public void setPatientRegisterSheetId(String patientRegisterSheetId) {
        this.patientRegisterSheetId = patientRegisterSheetId == null ? null : patientRegisterSheetId.trim();
    }

    public Boolean getPatientFeeItemRegReturned() {
        return patientFeeItemRegReturned;
    }

    public void setPatientFeeItemRegReturned(Boolean patientFeeItemRegReturned) {
        this.patientFeeItemRegReturned = patientFeeItemRegReturned;
    }

    public Boolean getPatientFeeItemCharged() {
        return patientFeeItemCharged;
    }

    public void setPatientFeeItemCharged(Boolean patientFeeItemCharged) {
        this.patientFeeItemCharged = patientFeeItemCharged;
    }

    public String getPatientFeeItemChargerId() {
        return patientFeeItemChargerId;
    }

    public void setPatientFeeItemChargerId(String patientFeeItemChargerId) {
        this.patientFeeItemChargerId = patientFeeItemChargerId == null ? null : patientFeeItemChargerId.trim();
    }

    public String getPatientFeeItemChargerName() {
        return patientFeeItemChargerName;
    }

    public void setPatientFeeItemChargerName(String patientFeeItemChargerName) {
        this.patientFeeItemChargerName = patientFeeItemChargerName == null ? null : patientFeeItemChargerName.trim();
    }

    public Date getPatientFeeItemChargerTime() {
        return patientFeeItemChargerTime;
    }

    public void setPatientFeeItemChargerTime(Date patientFeeItemChargerTime) {
        this.patientFeeItemChargerTime = patientFeeItemChargerTime;
    }

    public String getPatientFeeItemDiscounterId() {
        return patientFeeItemDiscounterId;
    }

    public void setPatientFeeItemDiscounterId(String patientFeeItemDiscounterId) {
        this.patientFeeItemDiscounterId = patientFeeItemDiscounterId == null ? null : patientFeeItemDiscounterId.trim();
    }

    public Integer getPatientFeeItemBatchNumber() {
        return patientFeeItemBatchNumber;
    }

    public void setPatientFeeItemBatchNumber(Integer patientFeeItemBatchNumber) {
        this.patientFeeItemBatchNumber = patientFeeItemBatchNumber;
    }

    public Integer getPatientFeeItemTubePosition() {
        return patientFeeItemTubePosition;
    }

    public void setPatientFeeItemTubePosition(Integer patientFeeItemTubePosition) {
        this.patientFeeItemTubePosition = patientFeeItemTubePosition;
    }

    public Integer getPatientFeeItemSampleNumber() {
        return patientFeeItemSampleNumber;
    }

    public void setPatientFeeItemSampleNumber(Integer patientFeeItemSampleNumber) {
        this.patientFeeItemSampleNumber = patientFeeItemSampleNumber;
    }

    public Long getPatientFeeItemLabSampled() {
        return patientFeeItemLabSampled;
    }

    public void setPatientFeeItemLabSampled(Long patientFeeItemLabSampled) {
        this.patientFeeItemLabSampled = patientFeeItemLabSampled;
    }

    public String getPatientFeeItemLabSamplerId() {
        return patientFeeItemLabSamplerId;
    }

    public void setPatientFeeItemLabSamplerId(String patientFeeItemLabSamplerId) {
        this.patientFeeItemLabSamplerId = patientFeeItemLabSamplerId == null ? null : patientFeeItemLabSamplerId.trim();
    }

    public String getPatientFeeItemLabSamplerName() {
        return patientFeeItemLabSamplerName;
    }

    public void setPatientFeeItemLabSamplerName(String patientFeeItemLabSamplerName) {
        this.patientFeeItemLabSamplerName = patientFeeItemLabSamplerName == null ? null : patientFeeItemLabSamplerName.trim();
    }

    public Date getPatientFeeItemLabSamplerTime() {
        return patientFeeItemLabSamplerTime;
    }

    public void setPatientFeeItemLabSamplerTime(Date patientFeeItemLabSamplerTime) {
        this.patientFeeItemLabSamplerTime = patientFeeItemLabSamplerTime;
    }

    public Boolean getPatientFeeItemLabSendLis() {
        return patientFeeItemLabSendLis;
    }

    public void setPatientFeeItemLabSendLis(Boolean patientFeeItemLabSendLis) {
        this.patientFeeItemLabSendLis = patientFeeItemLabSendLis;
    }

    public Date getPatientFeeItemLabSendLisTime() {
        return patientFeeItemLabSendLisTime;
    }

    public void setPatientFeeItemLabSendLisTime(Date patientFeeItemLabSendLisTime) {
        this.patientFeeItemLabSendLisTime = patientFeeItemLabSendLisTime;
    }

    public Boolean getPatientFeeItemLabRcvdFromLis() {
        return patientFeeItemLabRcvdFromLis;
    }

    public void setPatientFeeItemLabRcvdFromLis(Boolean patientFeeItemLabRcvdFromLis) {
        this.patientFeeItemLabRcvdFromLis = patientFeeItemLabRcvdFromLis;
    }

    public Date getPatientFeeItemLabRcvdFromLisTime() {
        return patientFeeItemLabRcvdFromLisTime;
    }

    public void setPatientFeeItemLabRcvdFromLisTime(Date patientFeeItemLabRcvdFromLisTime) {
        this.patientFeeItemLabRcvdFromLisTime = patientFeeItemLabRcvdFromLisTime;
    }

    public Boolean getPatientFeeItemGiveUp() {
        return patientFeeItemGiveUp;
    }

    public void setPatientFeeItemGiveUp(Boolean patientFeeItemGiveUp) {
        this.patientFeeItemGiveUp = patientFeeItemGiveUp;
    }

    public Boolean getPatientFeeItemExaminated() {
        return patientFeeItemExaminated;
    }

    public void setPatientFeeItemExaminated(Boolean patientFeeItemExaminated) {
        this.patientFeeItemExaminated = patientFeeItemExaminated;
    }

    public String getPatientExamDepartId() {
        return patientExamDepartId;
    }

    public void setPatientExamDepartId(String patientExamDepartId) {
        this.patientExamDepartId = patientExamDepartId == null ? null : patientExamDepartId.trim();
    }

    public String getExamDoctorId() {
        return examDoctorId;
    }

    public void setExamDoctorId(String examDoctorId) {
        this.examDoctorId = examDoctorId == null ? null : examDoctorId.trim();
    }

    public String getExamDoctorName() {
        return examDoctorName;
    }

    public void setExamDoctorName(String examDoctorName) {
        this.examDoctorName = examDoctorName == null ? null : examDoctorName.trim();
    }

    public Date getPatientFeeItemExaminateTime() {
        return patientFeeItemExaminateTime;
    }

    public void setPatientFeeItemExaminateTime(Date patientFeeItemExaminateTime) {
        this.patientFeeItemExaminateTime = patientFeeItemExaminateTime;
    }

    public Boolean getPatientFeeItemMarkFeeReturn() {
        return patientFeeItemMarkFeeReturn;
    }

    public void setPatientFeeItemMarkFeeReturn(Boolean patientFeeItemMarkFeeReturn) {
        this.patientFeeItemMarkFeeReturn = patientFeeItemMarkFeeReturn;
    }

    public Boolean getPatientFeeItemWorkInnerModify() {
        return patientFeeItemWorkInnerModify;
    }

    public void setPatientFeeItemWorkInnerModify(Boolean patientFeeItemWorkInnerModify) {
        this.patientFeeItemWorkInnerModify = patientFeeItemWorkInnerModify;
    }

    public String getPatientFeeItemSevereDegree() {
        return patientFeeItemSevereDegree;
    }

    public void setPatientFeeItemSevereDegree(String patientFeeItemSevereDegree) {
        this.patientFeeItemSevereDegree = patientFeeItemSevereDegree == null ? null : patientFeeItemSevereDegree.trim();
    }

    public String getPatientFeeItemInterfaceMarks() {
        return patientFeeItemInterfaceMarks;
    }

    public void setPatientFeeItemInterfaceMarks(String patientFeeItemInterfaceMarks) {
        this.patientFeeItemInterfaceMarks = patientFeeItemInterfaceMarks == null ? null : patientFeeItemInterfaceMarks.trim();
    }

    public String getPatientFeeItemUrlResult() {
        return patientFeeItemUrlResult;
    }

    public void setPatientFeeItemUrlResult(String patientFeeItemUrlResult) {
        this.patientFeeItemUrlResult = patientFeeItemUrlResult == null ? null : patientFeeItemUrlResult.trim();
    }

    public Date getPatientFeeItemCreateTime() {
        return patientFeeItemCreateTime;
    }

    public void setPatientFeeItemCreateTime(Date patientFeeItemCreateTime) {
        this.patientFeeItemCreateTime = patientFeeItemCreateTime;
    }

    public Date getPatientFeeItemEditTime() {
        return patientFeeItemEditTime;
    }

    public void setPatientFeeItemEditTime(Date patientFeeItemEditTime) {
        this.patientFeeItemEditTime = patientFeeItemEditTime;
    }

    public Integer getPatientFeeItemStatus() {
        return patientFeeItemStatus;
    }

    public void setPatientFeeItemStatus(Integer patientFeeItemStatus) {
        this.patientFeeItemStatus = patientFeeItemStatus;
    }

    public String getPatientFeeItemPositiveSummary() {
        return patientFeeItemPositiveSummary;
    }

    public void setPatientFeeItemPositiveSummary(String patientFeeItemPositiveSummary) {
        this.patientFeeItemPositiveSummary = patientFeeItemPositiveSummary == null ? null : patientFeeItemPositiveSummary.trim();
    }
}