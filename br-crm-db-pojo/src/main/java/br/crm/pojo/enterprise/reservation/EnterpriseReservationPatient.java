package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EnterpriseReservationPatient implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseReservationPatientId;

    private String enterpriseReservationId;

    private String enterpriseGroupId;

    private String enterpriseDep;

    private String patientArchiveId;

    private String patientArchiveNo;

    private String patientCardNo;

    private String patientIdCardNo;

    private String patientId;

    private String patientCode;

    private String patientName;

    private String enterpriseReservationPatientInputCode;

    private Integer sexId;

    private String sexName;

    private String patientPhone;

    private String patientAddress;

    private Integer patientAge;

    private Integer ageUnitId;

    private BigDecimal ageOfReal;

    private String groupType;

    private Date patientAgeBaseTime;

    private Date patientBirthTime;

    private Integer marriageId;

    private String marriageName;

    private String nationId;

    private String nationName;

    private Integer educationId;

    private String educationName;

    private String occupationId;

    private String occupationName;

    private Integer areaId;

    private String areaName;

    private Long enterpriseReservationPatientPrepared;

    private String enterpriseReservationPatientNote;

    private Date enterpriseReservationPatientCreateTime;

    private Date enterpriseReservationPatientEditTime;

    private Integer enterpriseReservationPatientStatus;

    public String getEnterpriseReservationPatientId() {
        return enterpriseReservationPatientId;
    }

    public void setEnterpriseReservationPatientId(String enterpriseReservationPatientId) {
        this.enterpriseReservationPatientId = enterpriseReservationPatientId == null ? null : enterpriseReservationPatientId.trim();
    }

    public String getEnterpriseReservationId() {
        return enterpriseReservationId;
    }

    public void setEnterpriseReservationId(String enterpriseReservationId) {
        this.enterpriseReservationId = enterpriseReservationId == null ? null : enterpriseReservationId.trim();
    }

    public String getEnterpriseGroupId() {
        return enterpriseGroupId;
    }

    public void setEnterpriseGroupId(String enterpriseGroupId) {
        this.enterpriseGroupId = enterpriseGroupId == null ? null : enterpriseGroupId.trim();
    }

    public String getEnterpriseDep() {
        return enterpriseDep;
    }

    public void setEnterpriseDep(String enterpriseDep) {
        this.enterpriseDep = enterpriseDep == null ? null : enterpriseDep.trim();
    }

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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode == null ? null : patientCode.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getEnterpriseReservationPatientInputCode() {
        return enterpriseReservationPatientInputCode;
    }

    public void setEnterpriseReservationPatientInputCode(String enterpriseReservationPatientInputCode) {
        this.enterpriseReservationPatientInputCode = enterpriseReservationPatientInputCode == null ? null : enterpriseReservationPatientInputCode.trim();
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

    public Integer getAgeUnitId() {
        return ageUnitId;
    }

    public void setAgeUnitId(Integer ageUnitId) {
        this.ageUnitId = ageUnitId;
    }

    public BigDecimal getAgeOfReal() {
        return ageOfReal;
    }

    public void setAgeOfReal(BigDecimal ageOfReal) {
        this.ageOfReal = ageOfReal;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
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

    public String getNationId() {
        return nationId;
    }

    public void setNationId(String nationId) {
        this.nationId = nationId == null ? null : nationId.trim();
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

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId == null ? null : occupationId.trim();
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

    public Long getEnterpriseReservationPatientPrepared() {
        return enterpriseReservationPatientPrepared;
    }

    public void setEnterpriseReservationPatientPrepared(Long enterpriseReservationPatientPrepared) {
        this.enterpriseReservationPatientPrepared = enterpriseReservationPatientPrepared;
    }

    public String getEnterpriseReservationPatientNote() {
        return enterpriseReservationPatientNote;
    }

    public void setEnterpriseReservationPatientNote(String enterpriseReservationPatientNote) {
        this.enterpriseReservationPatientNote = enterpriseReservationPatientNote == null ? null : enterpriseReservationPatientNote.trim();
    }

    public Date getEnterpriseReservationPatientCreateTime() {
        return enterpriseReservationPatientCreateTime;
    }

    public void setEnterpriseReservationPatientCreateTime(Date enterpriseReservationPatientCreateTime) {
        this.enterpriseReservationPatientCreateTime = enterpriseReservationPatientCreateTime;
    }

    public Date getEnterpriseReservationPatientEditTime() {
        return enterpriseReservationPatientEditTime;
    }

    public void setEnterpriseReservationPatientEditTime(Date enterpriseReservationPatientEditTime) {
        this.enterpriseReservationPatientEditTime = enterpriseReservationPatientEditTime;
    }

    public Integer getEnterpriseReservationPatientStatus() {
        return enterpriseReservationPatientStatus;
    }

    public void setEnterpriseReservationPatientStatus(Integer enterpriseReservationPatientStatus) {
        this.enterpriseReservationPatientStatus = enterpriseReservationPatientStatus;
    }
}