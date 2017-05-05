package br.crm.pojo.patient.registerSheet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PatientRegisterSheet implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String regId;

    private String regNo;

    private String regChainId;

    private String patientCardNo;

    private String patientCardNoType;

    private String patientArchiveNo;

    private String patientNo;

    private String patientId;

    private String patientName;

    private Boolean regIsReturn;

    private Boolean regIsWholeReturn;

    private String regWholeReturnId;

    private String payWayId;

    private Boolean regTransfered;

    private Boolean regConfirmed;

    private Boolean regFeeCharged;

    private BigDecimal regMoneyAmount;

    private String regExecDepartCode;

    private String regOpenDoctorCode;

    private String regOpenDoctorName;

    private String regOperRegisterId;

    private Date regOperRegisterTime;

    private String regChargerId;

    private Date regChargerTime;

    private Boolean regWorkInnerModify;

    private Long regCreateTime;

    private Long regEditTime;

    private Integer regStatus;

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId == null ? null : regId.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getRegChainId() {
        return regChainId;
    }

    public void setRegChainId(String regChainId) {
        this.regChainId = regChainId == null ? null : regChainId.trim();
    }

    public String getPatientCardNo() {
        return patientCardNo;
    }

    public void setPatientCardNo(String patientCardNo) {
        this.patientCardNo = patientCardNo == null ? null : patientCardNo.trim();
    }

    public String getPatientCardNoType() {
        return patientCardNoType;
    }

    public void setPatientCardNoType(String patientCardNoType) {
        this.patientCardNoType = patientCardNoType == null ? null : patientCardNoType.trim();
    }

    public String getPatientArchiveNo() {
        return patientArchiveNo;
    }

    public void setPatientArchiveNo(String patientArchiveNo) {
        this.patientArchiveNo = patientArchiveNo == null ? null : patientArchiveNo.trim();
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo == null ? null : patientNo.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Boolean getRegIsReturn() {
        return regIsReturn;
    }

    public void setRegIsReturn(Boolean regIsReturn) {
        this.regIsReturn = regIsReturn;
    }

    public Boolean getRegIsWholeReturn() {
        return regIsWholeReturn;
    }

    public void setRegIsWholeReturn(Boolean regIsWholeReturn) {
        this.regIsWholeReturn = regIsWholeReturn;
    }

    public String getRegWholeReturnId() {
        return regWholeReturnId;
    }

    public void setRegWholeReturnId(String regWholeReturnId) {
        this.regWholeReturnId = regWholeReturnId == null ? null : regWholeReturnId.trim();
    }

    public String getPayWayId() {
        return payWayId;
    }

    public void setPayWayId(String payWayId) {
        this.payWayId = payWayId == null ? null : payWayId.trim();
    }

    public Boolean getRegTransfered() {
        return regTransfered;
    }

    public void setRegTransfered(Boolean regTransfered) {
        this.regTransfered = regTransfered;
    }

    public Boolean getRegConfirmed() {
        return regConfirmed;
    }

    public void setRegConfirmed(Boolean regConfirmed) {
        this.regConfirmed = regConfirmed;
    }

    public Boolean getRegFeeCharged() {
        return regFeeCharged;
    }

    public void setRegFeeCharged(Boolean regFeeCharged) {
        this.regFeeCharged = regFeeCharged;
    }

    public BigDecimal getRegMoneyAmount() {
        return regMoneyAmount;
    }

    public void setRegMoneyAmount(BigDecimal regMoneyAmount) {
        this.regMoneyAmount = regMoneyAmount;
    }

    public String getRegExecDepartCode() {
        return regExecDepartCode;
    }

    public void setRegExecDepartCode(String regExecDepartCode) {
        this.regExecDepartCode = regExecDepartCode == null ? null : regExecDepartCode.trim();
    }

    public String getRegOpenDoctorCode() {
        return regOpenDoctorCode;
    }

    public void setRegOpenDoctorCode(String regOpenDoctorCode) {
        this.regOpenDoctorCode = regOpenDoctorCode == null ? null : regOpenDoctorCode.trim();
    }

    public String getRegOpenDoctorName() {
        return regOpenDoctorName;
    }

    public void setRegOpenDoctorName(String regOpenDoctorName) {
        this.regOpenDoctorName = regOpenDoctorName == null ? null : regOpenDoctorName.trim();
    }

    public String getRegOperRegisterId() {
        return regOperRegisterId;
    }

    public void setRegOperRegisterId(String regOperRegisterId) {
        this.regOperRegisterId = regOperRegisterId == null ? null : regOperRegisterId.trim();
    }

    public Date getRegOperRegisterTime() {
        return regOperRegisterTime;
    }

    public void setRegOperRegisterTime(Date regOperRegisterTime) {
        this.regOperRegisterTime = regOperRegisterTime;
    }

    public String getRegChargerId() {
        return regChargerId;
    }

    public void setRegChargerId(String regChargerId) {
        this.regChargerId = regChargerId == null ? null : regChargerId.trim();
    }

    public Date getRegChargerTime() {
        return regChargerTime;
    }

    public void setRegChargerTime(Date regChargerTime) {
        this.regChargerTime = regChargerTime;
    }

    public Boolean getRegWorkInnerModify() {
        return regWorkInnerModify;
    }

    public void setRegWorkInnerModify(Boolean regWorkInnerModify) {
        this.regWorkInnerModify = regWorkInnerModify;
    }

    public Long getRegCreateTime() {
        return regCreateTime;
    }

    public void setRegCreateTime(Long regCreateTime) {
        this.regCreateTime = regCreateTime;
    }

    public Long getRegEditTime() {
        return regEditTime;
    }

    public void setRegEditTime(Long regEditTime) {
        this.regEditTime = regEditTime;
    }

    public Integer getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(Integer regStatus) {
        this.regStatus = regStatus;
    }
}