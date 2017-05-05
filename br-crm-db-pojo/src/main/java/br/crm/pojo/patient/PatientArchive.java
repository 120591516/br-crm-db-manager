package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.Date;

public class PatientArchive implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientArchiveId;

    private String patientArchiveNo;

    private String patientCardNo;

    private String patientIdCardNo;

    private String patientName;

    private String patientArchiveInputCode;

    private Integer sexId;

    private String sexName;

    private String patientPhone;

    private String patientAddress;

    private Integer patientAge;

    private Date patientAgeBaseTime;

    private Date patientBirthTime;

    private Integer marriageId;

    private String marriageName;

    private Integer nationId;

    private String nationName;

    private Integer educationId;

    private String educationName;

    private Integer occupationId;

    private String occupationName;

    private Integer areaId;

    private String areaName;

    private String patientArchiveNote;

    private Date patientArchiveCreateTime;

    private Date patientArchiveEditTime;

    private Integer patientArchiveStatus;

    public String getPatientArchiveId() {
        return patientArchiveId;
    }

    public void setPatientArchiveId(String patientArchiveId) {
        this.patientArchiveId = patientArchiveId == null ? null : patientArchiveId.trim();
    }

    public String getPatientArchiveNo() {
        return patientArchiveNo;
    }

    public void setPatientArchiveNo(String patientArchiveNo) {
        this.patientArchiveNo = patientArchiveNo == null ? null : patientArchiveNo.trim();
    }

    public String getPatientCardNo() {
        return patientCardNo;
    }

    public void setPatientCardNo(String patientCardNo) {
        this.patientCardNo = patientCardNo == null ? null : patientCardNo.trim();
    }

    public String getPatientIdCardNo() {
        return patientIdCardNo;
    }

    public void setPatientIdCardNo(String patientIdCardNo) {
        this.patientIdCardNo = patientIdCardNo == null ? null : patientIdCardNo.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientArchiveInputCode() {
        return patientArchiveInputCode;
    }

    public void setPatientArchiveInputCode(String patientArchiveInputCode) {
        this.patientArchiveInputCode = patientArchiveInputCode == null ? null : patientArchiveInputCode.trim();
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone == null ? null : patientPhone.trim();
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress == null ? null : patientAddress.trim();
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public Date getPatientAgeBaseTime() {
        return patientAgeBaseTime;
    }

    public void setPatientAgeBaseTime(Date patientAgeBaseTime) {
        this.patientAgeBaseTime = patientAgeBaseTime;
    }

    public Date getPatientBirthTime() {
        return patientBirthTime;
    }

    public void setPatientBirthTime(Date patientBirthTime) {
        this.patientBirthTime = patientBirthTime;
    }

    public Integer getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Integer marriageId) {
        this.marriageId = marriageId;
    }

    public String getMarriageName() {
        return marriageName;
    }

    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName == null ? null : occupationName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getPatientArchiveNote() {
        return patientArchiveNote;
    }

    public void setPatientArchiveNote(String patientArchiveNote) {
        this.patientArchiveNote = patientArchiveNote == null ? null : patientArchiveNote.trim();
    }

    public Date getPatientArchiveCreateTime() {
        return patientArchiveCreateTime;
    }

    public void setPatientArchiveCreateTime(Date patientArchiveCreateTime) {
        this.patientArchiveCreateTime = patientArchiveCreateTime;
    }

    public Date getPatientArchiveEditTime() {
        return patientArchiveEditTime;
    }

    public void setPatientArchiveEditTime(Date patientArchiveEditTime) {
        this.patientArchiveEditTime = patientArchiveEditTime;
    }

    public Integer getPatientArchiveStatus() {
        return patientArchiveStatus;
    }

    public void setPatientArchiveStatus(Integer patientArchiveStatus) {
        this.patientArchiveStatus = patientArchiveStatus;
    }
}