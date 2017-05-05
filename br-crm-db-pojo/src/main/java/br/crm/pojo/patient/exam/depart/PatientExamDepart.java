package br.crm.pojo.patient.exam.depart;

import java.io.Serializable;
import java.util.Date;

public class PatientExamDepart implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientExamDepartId;

    private String patientId;

    private String patientName;

    private String departId;

    private String departName;

    private Date departDailyNoTime;

    private Integer departDailyNo;

    private String departSummaryNaming;

    private String departDoctorId;

    private String departDoctorName;

    private String typist;

    private String typistName;

    private Date typistTime;

    private Boolean giveUp;

    private Boolean approved;

    private String departApprovedById;

    private String departApprovedByName;

    private Date departApprovedByTime;

    private String consultDoctorId;

    private String consultDoctorName;

    private Integer severeDegreeId;

    private Boolean approvedAux;

    private Date patientExamDepartCreateTime;

    private Date patientExamDepartEditTime;

    private Integer patientExamDepartStatus;

    public String getPatientExamDepartId() {
        return patientExamDepartId;
    }

    public void setPatientExamDepartId(String patientExamDepartId) {
        this.patientExamDepartId = patientExamDepartId == null ? null : patientExamDepartId.trim();
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

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public Date getDepartDailyNoTime() {
        return departDailyNoTime;
    }

    public void setDepartDailyNoTime(Date departDailyNoTime) {
        this.departDailyNoTime = departDailyNoTime;
    }

    public Integer getDepartDailyNo() {
        return departDailyNo;
    }

    public void setDepartDailyNo(Integer departDailyNo) {
        this.departDailyNo = departDailyNo;
    }

    public String getDepartSummaryNaming() {
        return departSummaryNaming;
    }

    public void setDepartSummaryNaming(String departSummaryNaming) {
        this.departSummaryNaming = departSummaryNaming == null ? null : departSummaryNaming.trim();
    }

    public String getDepartDoctorId() {
        return departDoctorId;
    }

    public void setDepartDoctorId(String departDoctorId) {
        this.departDoctorId = departDoctorId == null ? null : departDoctorId.trim();
    }

    public String getDepartDoctorName() {
        return departDoctorName;
    }

    public void setDepartDoctorName(String departDoctorName) {
        this.departDoctorName = departDoctorName == null ? null : departDoctorName.trim();
    }

    public String getTypist() {
        return typist;
    }

    public void setTypist(String typist) {
        this.typist = typist == null ? null : typist.trim();
    }

    public String getTypistName() {
        return typistName;
    }

    public void setTypistName(String typistName) {
        this.typistName = typistName == null ? null : typistName.trim();
    }

    public Date getTypistTime() {
        return typistTime;
    }

    public void setTypistTime(Date typistTime) {
        this.typistTime = typistTime;
    }

    public Boolean getGiveUp() {
        return giveUp;
    }

    public void setGiveUp(Boolean giveUp) {
        this.giveUp = giveUp;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getDepartApprovedById() {
        return departApprovedById;
    }

    public void setDepartApprovedById(String departApprovedById) {
        this.departApprovedById = departApprovedById == null ? null : departApprovedById.trim();
    }

    public String getDepartApprovedByName() {
        return departApprovedByName;
    }

    public void setDepartApprovedByName(String departApprovedByName) {
        this.departApprovedByName = departApprovedByName == null ? null : departApprovedByName.trim();
    }

    public Date getDepartApprovedByTime() {
        return departApprovedByTime;
    }

    public void setDepartApprovedByTime(Date departApprovedByTime) {
        this.departApprovedByTime = departApprovedByTime;
    }

    public String getConsultDoctorId() {
        return consultDoctorId;
    }

    public void setConsultDoctorId(String consultDoctorId) {
        this.consultDoctorId = consultDoctorId == null ? null : consultDoctorId.trim();
    }

    public String getConsultDoctorName() {
        return consultDoctorName;
    }

    public void setConsultDoctorName(String consultDoctorName) {
        this.consultDoctorName = consultDoctorName == null ? null : consultDoctorName.trim();
    }

    public Integer getSevereDegreeId() {
        return severeDegreeId;
    }

    public void setSevereDegreeId(Integer severeDegreeId) {
        this.severeDegreeId = severeDegreeId;
    }

    public Boolean getApprovedAux() {
        return approvedAux;
    }

    public void setApprovedAux(Boolean approvedAux) {
        this.approvedAux = approvedAux;
    }

    public Date getPatientExamDepartCreateTime() {
        return patientExamDepartCreateTime;
    }

    public void setPatientExamDepartCreateTime(Date patientExamDepartCreateTime) {
        this.patientExamDepartCreateTime = patientExamDepartCreateTime;
    }

    public Date getPatientExamDepartEditTime() {
        return patientExamDepartEditTime;
    }

    public void setPatientExamDepartEditTime(Date patientExamDepartEditTime) {
        this.patientExamDepartEditTime = patientExamDepartEditTime;
    }

    public Integer getPatientExamDepartStatus() {
        return patientExamDepartStatus;
    }

    public void setPatientExamDepartStatus(Integer patientExamDepartStatus) {
        this.patientExamDepartStatus = patientExamDepartStatus;
    }
}