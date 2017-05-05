package br.crm.pojo.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PatientDetail implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientDetailId;

    private String patientId;

    private String patientClassId;

    private Integer patientOffPercent;

    private Integer patientMaxOffPercent;

    private BigDecimal patientPriceLimit;

    private BigDecimal patientMoneyAmount;

    private BigDecimal patientMoneyAmountPaid;

    private String openDoctorId;

    private String patientWorkNo;

    private String doctorRegId;

    private String doctorRegName;

    private String examSuiteId;

    private String examSuiteName;

    private String doctorApplyId;

    private String doctorApplyName;

    private Long patientGuidancePrinted;

    private Long patientFeeCharged;

    private Long patientExamStarted;

    private Long patientReadyToFinal;

    private String doctorFeeId;

    private String doctorFeeName;

    private Long patientPaused;

    private Long patientFinalLocked;

    private Long patientFinalExamed;

    private Long patientFinalApproved;

    private String doctorFinalId;

    private String doctorFinalName;

    private Date patientFinalExamedTime;

    private String doctorFinalApprovedId;

    private String doctorFinalApprovedName;

    private Date doctorFinalApprovedTime;

    private Long patientCardIssued;

    private Long patientCardReturned;

    private Long patientCoverPrinted;

    private Long patientReportPrinted;

    private String reportPrintedById;

    private Date reportPrintedByTime;

    private Long reportInFormed;

    private Date reportInFormedTime;

    private Long patientIsSevere;

    private Long patientClosed;

    private Date patientClosedTime;

    private Long patientNeedTraced;

    private Long patientDiffPerson;

    private Long patientSettleAll;

    private Long patientInnerOper;

    private String examItemValueServerDegree;

    private String patientServerDegreeNote;

    private Long patientSevereInformed;

    private Date patientSevereInformedTime;

    private String patientSevereInformedTimeBy;

    private String patientInterfaceMarks;

    private String patientFlag;

    private Date patientStartAtTime;

    private Date patientResultLastChangeTime;

    private Date patientResultLastArchiveTime;

    private Date patientResultLastOlapTime;

    private String patientHospitalCode;

    private String patientHospitalName;

    private Integer patientDetailStatus;

    private Date patientDetailCrateTime;

    private Date patientDetailEditTime;

    public String getPatientDetailId() {
        return patientDetailId;
    }

    public void setPatientDetailId(String patientDetailId) {
        this.patientDetailId = patientDetailId == null ? null : patientDetailId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientClassId() {
        return patientClassId;
    }

    public void setPatientClassId(String patientClassId) {
        this.patientClassId = patientClassId == null ? null : patientClassId.trim();
    }

    public Integer getPatientOffPercent() {
        return patientOffPercent;
    }

    public void setPatientOffPercent(Integer patientOffPercent) {
        this.patientOffPercent = patientOffPercent;
    }

    public Integer getPatientMaxOffPercent() {
        return patientMaxOffPercent;
    }

    public void setPatientMaxOffPercent(Integer patientMaxOffPercent) {
        this.patientMaxOffPercent = patientMaxOffPercent;
    }

    public BigDecimal getPatientPriceLimit() {
        return patientPriceLimit;
    }

    public void setPatientPriceLimit(BigDecimal patientPriceLimit) {
        this.patientPriceLimit = patientPriceLimit;
    }

    public BigDecimal getPatientMoneyAmount() {
        return patientMoneyAmount;
    }

    public void setPatientMoneyAmount(BigDecimal patientMoneyAmount) {
        this.patientMoneyAmount = patientMoneyAmount;
    }

    public BigDecimal getPatientMoneyAmountPaid() {
        return patientMoneyAmountPaid;
    }

    public void setPatientMoneyAmountPaid(BigDecimal patientMoneyAmountPaid) {
        this.patientMoneyAmountPaid = patientMoneyAmountPaid;
    }

    public String getOpenDoctorId() {
        return openDoctorId;
    }

    public void setOpenDoctorId(String openDoctorId) {
        this.openDoctorId = openDoctorId == null ? null : openDoctorId.trim();
    }

    public String getPatientWorkNo() {
        return patientWorkNo;
    }

    public void setPatientWorkNo(String patientWorkNo) {
        this.patientWorkNo = patientWorkNo == null ? null : patientWorkNo.trim();
    }

    public String getDoctorRegId() {
        return doctorRegId;
    }

    public void setDoctorRegId(String doctorRegId) {
        this.doctorRegId = doctorRegId == null ? null : doctorRegId.trim();
    }

    public String getDoctorRegName() {
        return doctorRegName;
    }

    public void setDoctorRegName(String doctorRegName) {
        this.doctorRegName = doctorRegName == null ? null : doctorRegName.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getExamSuiteName() {
        return examSuiteName;
    }

    public void setExamSuiteName(String examSuiteName) {
        this.examSuiteName = examSuiteName == null ? null : examSuiteName.trim();
    }

    public String getDoctorApplyId() {
        return doctorApplyId;
    }

    public void setDoctorApplyId(String doctorApplyId) {
        this.doctorApplyId = doctorApplyId == null ? null : doctorApplyId.trim();
    }

    public String getDoctorApplyName() {
        return doctorApplyName;
    }

    public void setDoctorApplyName(String doctorApplyName) {
        this.doctorApplyName = doctorApplyName == null ? null : doctorApplyName.trim();
    }

    public Long getPatientGuidancePrinted() {
        return patientGuidancePrinted;
    }

    public void setPatientGuidancePrinted(Long patientGuidancePrinted) {
        this.patientGuidancePrinted = patientGuidancePrinted;
    }

    public Long getPatientFeeCharged() {
        return patientFeeCharged;
    }

    public void setPatientFeeCharged(Long patientFeeCharged) {
        this.patientFeeCharged = patientFeeCharged;
    }

    public Long getPatientExamStarted() {
        return patientExamStarted;
    }

    public void setPatientExamStarted(Long patientExamStarted) {
        this.patientExamStarted = patientExamStarted;
    }

    public Long getPatientReadyToFinal() {
        return patientReadyToFinal;
    }

    public void setPatientReadyToFinal(Long patientReadyToFinal) {
        this.patientReadyToFinal = patientReadyToFinal;
    }

    public String getDoctorFeeId() {
        return doctorFeeId;
    }

    public void setDoctorFeeId(String doctorFeeId) {
        this.doctorFeeId = doctorFeeId == null ? null : doctorFeeId.trim();
    }

    public String getDoctorFeeName() {
        return doctorFeeName;
    }

    public void setDoctorFeeName(String doctorFeeName) {
        this.doctorFeeName = doctorFeeName == null ? null : doctorFeeName.trim();
    }

    public Long getPatientPaused() {
        return patientPaused;
    }

    public void setPatientPaused(Long patientPaused) {
        this.patientPaused = patientPaused;
    }

    public Long getPatientFinalLocked() {
        return patientFinalLocked;
    }

    public void setPatientFinalLocked(Long patientFinalLocked) {
        this.patientFinalLocked = patientFinalLocked;
    }

    public Long getPatientFinalExamed() {
        return patientFinalExamed;
    }

    public void setPatientFinalExamed(Long patientFinalExamed) {
        this.patientFinalExamed = patientFinalExamed;
    }

    public Long getPatientFinalApproved() {
        return patientFinalApproved;
    }

    public void setPatientFinalApproved(Long patientFinalApproved) {
        this.patientFinalApproved = patientFinalApproved;
    }

    public String getDoctorFinalId() {
        return doctorFinalId;
    }

    public void setDoctorFinalId(String doctorFinalId) {
        this.doctorFinalId = doctorFinalId == null ? null : doctorFinalId.trim();
    }

    public String getDoctorFinalName() {
        return doctorFinalName;
    }

    public void setDoctorFinalName(String doctorFinalName) {
        this.doctorFinalName = doctorFinalName == null ? null : doctorFinalName.trim();
    }

    public Date getPatientFinalExamedTime() {
        return patientFinalExamedTime;
    }

    public void setPatientFinalExamedTime(Date patientFinalExamedTime) {
        this.patientFinalExamedTime = patientFinalExamedTime;
    }

    public String getDoctorFinalApprovedId() {
        return doctorFinalApprovedId;
    }

    public void setDoctorFinalApprovedId(String doctorFinalApprovedId) {
        this.doctorFinalApprovedId = doctorFinalApprovedId == null ? null : doctorFinalApprovedId.trim();
    }

    public String getDoctorFinalApprovedName() {
        return doctorFinalApprovedName;
    }

    public void setDoctorFinalApprovedName(String doctorFinalApprovedName) {
        this.doctorFinalApprovedName = doctorFinalApprovedName == null ? null : doctorFinalApprovedName.trim();
    }

    public Date getDoctorFinalApprovedTime() {
        return doctorFinalApprovedTime;
    }

    public void setDoctorFinalApprovedTime(Date doctorFinalApprovedTime) {
        this.doctorFinalApprovedTime = doctorFinalApprovedTime;
    }

    public Long getPatientCardIssued() {
        return patientCardIssued;
    }

    public void setPatientCardIssued(Long patientCardIssued) {
        this.patientCardIssued = patientCardIssued;
    }

    public Long getPatientCardReturned() {
        return patientCardReturned;
    }

    public void setPatientCardReturned(Long patientCardReturned) {
        this.patientCardReturned = patientCardReturned;
    }

    public Long getPatientCoverPrinted() {
        return patientCoverPrinted;
    }

    public void setPatientCoverPrinted(Long patientCoverPrinted) {
        this.patientCoverPrinted = patientCoverPrinted;
    }

    public Long getPatientReportPrinted() {
        return patientReportPrinted;
    }

    public void setPatientReportPrinted(Long patientReportPrinted) {
        this.patientReportPrinted = patientReportPrinted;
    }

    public String getReportPrintedById() {
        return reportPrintedById;
    }

    public void setReportPrintedById(String reportPrintedById) {
        this.reportPrintedById = reportPrintedById == null ? null : reportPrintedById.trim();
    }

    public Date getReportPrintedByTime() {
        return reportPrintedByTime;
    }

    public void setReportPrintedByTime(Date reportPrintedByTime) {
        this.reportPrintedByTime = reportPrintedByTime;
    }

    public Long getReportInFormed() {
        return reportInFormed;
    }

    public void setReportInFormed(Long reportInFormed) {
        this.reportInFormed = reportInFormed;
    }

    public Date getReportInFormedTime() {
        return reportInFormedTime;
    }

    public void setReportInFormedTime(Date reportInFormedTime) {
        this.reportInFormedTime = reportInFormedTime;
    }

    public Long getPatientIsSevere() {
        return patientIsSevere;
    }

    public void setPatientIsSevere(Long patientIsSevere) {
        this.patientIsSevere = patientIsSevere;
    }

    public Long getPatientClosed() {
        return patientClosed;
    }

    public void setPatientClosed(Long patientClosed) {
        this.patientClosed = patientClosed;
    }

    public Date getPatientClosedTime() {
        return patientClosedTime;
    }

    public void setPatientClosedTime(Date patientClosedTime) {
        this.patientClosedTime = patientClosedTime;
    }

    public Long getPatientNeedTraced() {
        return patientNeedTraced;
    }

    public void setPatientNeedTraced(Long patientNeedTraced) {
        this.patientNeedTraced = patientNeedTraced;
    }

    public Long getPatientDiffPerson() {
        return patientDiffPerson;
    }

    public void setPatientDiffPerson(Long patientDiffPerson) {
        this.patientDiffPerson = patientDiffPerson;
    }

    public Long getPatientSettleAll() {
        return patientSettleAll;
    }

    public void setPatientSettleAll(Long patientSettleAll) {
        this.patientSettleAll = patientSettleAll;
    }

    public Long getPatientInnerOper() {
        return patientInnerOper;
    }

    public void setPatientInnerOper(Long patientInnerOper) {
        this.patientInnerOper = patientInnerOper;
    }

    public String getExamItemValueServerDegree() {
        return examItemValueServerDegree;
    }

    public void setExamItemValueServerDegree(String examItemValueServerDegree) {
        this.examItemValueServerDegree = examItemValueServerDegree == null ? null : examItemValueServerDegree.trim();
    }

    public String getPatientServerDegreeNote() {
        return patientServerDegreeNote;
    }

    public void setPatientServerDegreeNote(String patientServerDegreeNote) {
        this.patientServerDegreeNote = patientServerDegreeNote == null ? null : patientServerDegreeNote.trim();
    }

    public Long getPatientSevereInformed() {
        return patientSevereInformed;
    }

    public void setPatientSevereInformed(Long patientSevereInformed) {
        this.patientSevereInformed = patientSevereInformed;
    }

    public Date getPatientSevereInformedTime() {
        return patientSevereInformedTime;
    }

    public void setPatientSevereInformedTime(Date patientSevereInformedTime) {
        this.patientSevereInformedTime = patientSevereInformedTime;
    }

    public String getPatientSevereInformedTimeBy() {
        return patientSevereInformedTimeBy;
    }

    public void setPatientSevereInformedTimeBy(String patientSevereInformedTimeBy) {
        this.patientSevereInformedTimeBy = patientSevereInformedTimeBy == null ? null : patientSevereInformedTimeBy.trim();
    }

    public String getPatientInterfaceMarks() {
        return patientInterfaceMarks;
    }

    public void setPatientInterfaceMarks(String patientInterfaceMarks) {
        this.patientInterfaceMarks = patientInterfaceMarks == null ? null : patientInterfaceMarks.trim();
    }

    public String getPatientFlag() {
        return patientFlag;
    }

    public void setPatientFlag(String patientFlag) {
        this.patientFlag = patientFlag == null ? null : patientFlag.trim();
    }

    public Date getPatientStartAtTime() {
        return patientStartAtTime;
    }

    public void setPatientStartAtTime(Date patientStartAtTime) {
        this.patientStartAtTime = patientStartAtTime;
    }

    public Date getPatientResultLastChangeTime() {
        return patientResultLastChangeTime;
    }

    public void setPatientResultLastChangeTime(Date patientResultLastChangeTime) {
        this.patientResultLastChangeTime = patientResultLastChangeTime;
    }

    public Date getPatientResultLastArchiveTime() {
        return patientResultLastArchiveTime;
    }

    public void setPatientResultLastArchiveTime(Date patientResultLastArchiveTime) {
        this.patientResultLastArchiveTime = patientResultLastArchiveTime;
    }

    public Date getPatientResultLastOlapTime() {
        return patientResultLastOlapTime;
    }

    public void setPatientResultLastOlapTime(Date patientResultLastOlapTime) {
        this.patientResultLastOlapTime = patientResultLastOlapTime;
    }

    public String getPatientHospitalCode() {
        return patientHospitalCode;
    }

    public void setPatientHospitalCode(String patientHospitalCode) {
        this.patientHospitalCode = patientHospitalCode == null ? null : patientHospitalCode.trim();
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName == null ? null : patientHospitalName.trim();
    }

    public Integer getPatientDetailStatus() {
        return patientDetailStatus;
    }

    public void setPatientDetailStatus(Integer patientDetailStatus) {
        this.patientDetailStatus = patientDetailStatus;
    }

    public Date getPatientDetailCrateTime() {
        return patientDetailCrateTime;
    }

    public void setPatientDetailCrateTime(Date patientDetailCrateTime) {
        this.patientDetailCrateTime = patientDetailCrateTime;
    }

    public Date getPatientDetailEditTime() {
        return patientDetailEditTime;
    }

    public void setPatientDetailEditTime(Date patientDetailEditTime) {
        this.patientDetailEditTime = patientDetailEditTime;
    }
}