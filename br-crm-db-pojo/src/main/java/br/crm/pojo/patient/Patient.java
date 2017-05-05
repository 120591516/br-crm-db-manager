package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientId;

    private String customerOrderId;

    private String customerOrderCurtId;

    private String patientArchiveId;

    private String patientArchiveCode;

    private String patientCode;

    private String patientCodePrn;

    private String patientCardNo;

    private String patientBizNo;

    private String patientIdCardNo;

    private Integer patientEnterNum;

    private Integer patientResvNum;

    private String enterpriseId;

    private String enterpriseName;

    private String enterpriseDep;

    private String enterpriseDepName;

    private String enterpriseReservationId;

    private String enterpriseGroupId;

    private String patientName;

    private String patientInputCode;

    private Integer sexId;

    private String sexName;

    private Date positionBirthDate;

    private Integer positionAge;

    private Integer ageUnitId;

    private String ageUnitName;

    private Integer marriageId;

    private String marriageName;

    private Integer nationId;

    private String nationName;

    private String positionAddress;

    private String positionPhone;

    private String positionEmail;

    private Integer informWayId;

    private String informWayName;

    private String positionPicture;

    private String positionSignature;

    private Integer educationId;

    private String educationName;

    private Integer occupationId;

    private String occupationName;

    private Integer areaId;

    private String areaName;

    private Date positionInEnterpriseTime;

    private Boolean positionIsForPrepare;

    private Boolean positionIsForReserve;

    private Boolean positionIsRegistered;

    private Date positionRegisterTime;

    private String positionPositionCode;

    private String positionJobTypeCode;

    private Integer confidentialLevelId;

    private String patientNote;

    private Date patientCreateTime;

    private Date patientEditTime;

    private Integer patientStatus;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public String getCustomerOrderCurtId() {
        return customerOrderCurtId;
    }

    public void setCustomerOrderCurtId(String customerOrderCurtId) {
        this.customerOrderCurtId = customerOrderCurtId == null ? null : customerOrderCurtId.trim();
    }

    public String getPatientArchiveId() {
        return patientArchiveId;
    }

    public void setPatientArchiveId(String patientArchiveId) {
        this.patientArchiveId = patientArchiveId == null ? null : patientArchiveId.trim();
    }

    public String getPatientArchiveCode() {
        return patientArchiveCode;
    }

    public void setPatientArchiveCode(String patientArchiveCode) {
        this.patientArchiveCode = patientArchiveCode == null ? null : patientArchiveCode.trim();
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode == null ? null : patientCode.trim();
    }

    public String getPatientCodePrn() {
        return patientCodePrn;
    }

    public void setPatientCodePrn(String patientCodePrn) {
        this.patientCodePrn = patientCodePrn == null ? null : patientCodePrn.trim();
    }

    public String getPatientCardNo() {
        return patientCardNo;
    }

    public void setPatientCardNo(String patientCardNo) {
        this.patientCardNo = patientCardNo == null ? null : patientCardNo.trim();
    }

    public String getPatientBizNo() {
        return patientBizNo;
    }

    public void setPatientBizNo(String patientBizNo) {
        this.patientBizNo = patientBizNo == null ? null : patientBizNo.trim();
    }

    public String getPatientIdCardNo() {
        return patientIdCardNo;
    }

    public void setPatientIdCardNo(String patientIdCardNo) {
        this.patientIdCardNo = patientIdCardNo == null ? null : patientIdCardNo.trim();
    }

    public Integer getPatientEnterNum() {
        return patientEnterNum;
    }

    public void setPatientEnterNum(Integer patientEnterNum) {
        this.patientEnterNum = patientEnterNum;
    }

    public Integer getPatientResvNum() {
        return patientResvNum;
    }

    public void setPatientResvNum(Integer patientResvNum) {
        this.patientResvNum = patientResvNum;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseDep() {
        return enterpriseDep;
    }

    public void setEnterpriseDep(String enterpriseDep) {
        this.enterpriseDep = enterpriseDep == null ? null : enterpriseDep.trim();
    }

    public String getEnterpriseDepName() {
        return enterpriseDepName;
    }

    public void setEnterpriseDepName(String enterpriseDepName) {
        this.enterpriseDepName = enterpriseDepName == null ? null : enterpriseDepName.trim();
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientInputCode() {
        return patientInputCode;
    }

    public void setPatientInputCode(String patientInputCode) {
        this.patientInputCode = patientInputCode == null ? null : patientInputCode.trim();
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

    public Date getPositionBirthDate() {
        return positionBirthDate;
    }

    public void setPositionBirthDate(Date positionBirthDate) {
        this.positionBirthDate = positionBirthDate;
    }

    public Integer getPositionAge() {
        return positionAge;
    }

    public void setPositionAge(Integer positionAge) {
        this.positionAge = positionAge;
    }

    public Integer getAgeUnitId() {
        return ageUnitId;
    }

    public void setAgeUnitId(Integer ageUnitId) {
        this.ageUnitId = ageUnitId;
    }

    public String getAgeUnitName() {
        return ageUnitName;
    }

    public void setAgeUnitName(String ageUnitName) {
        this.ageUnitName = ageUnitName == null ? null : ageUnitName.trim();
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

    public String getPositionAddress() {
        return positionAddress;
    }

    public void setPositionAddress(String positionAddress) {
        this.positionAddress = positionAddress == null ? null : positionAddress.trim();
    }

    public String getPositionPhone() {
        return positionPhone;
    }

    public void setPositionPhone(String positionPhone) {
        this.positionPhone = positionPhone == null ? null : positionPhone.trim();
    }

    public String getPositionEmail() {
        return positionEmail;
    }

    public void setPositionEmail(String positionEmail) {
        this.positionEmail = positionEmail == null ? null : positionEmail.trim();
    }

    public Integer getInformWayId() {
        return informWayId;
    }

    public void setInformWayId(Integer informWayId) {
        this.informWayId = informWayId;
    }

    public String getInformWayName() {
        return informWayName;
    }

    public void setInformWayName(String informWayName) {
        this.informWayName = informWayName == null ? null : informWayName.trim();
    }

    public String getPositionPicture() {
        return positionPicture;
    }

    public void setPositionPicture(String positionPicture) {
        this.positionPicture = positionPicture == null ? null : positionPicture.trim();
    }

    public String getPositionSignature() {
        return positionSignature;
    }

    public void setPositionSignature(String positionSignature) {
        this.positionSignature = positionSignature == null ? null : positionSignature.trim();
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

    public Date getPositionInEnterpriseTime() {
        return positionInEnterpriseTime;
    }

    public void setPositionInEnterpriseTime(Date positionInEnterpriseTime) {
        this.positionInEnterpriseTime = positionInEnterpriseTime;
    }

    public Boolean getPositionIsForPrepare() {
        return positionIsForPrepare;
    }

    public void setPositionIsForPrepare(Boolean positionIsForPrepare) {
        this.positionIsForPrepare = positionIsForPrepare;
    }

    public Boolean getPositionIsForReserve() {
        return positionIsForReserve;
    }

    public void setPositionIsForReserve(Boolean positionIsForReserve) {
        this.positionIsForReserve = positionIsForReserve;
    }

    public Boolean getPositionIsRegistered() {
        return positionIsRegistered;
    }

    public void setPositionIsRegistered(Boolean positionIsRegistered) {
        this.positionIsRegistered = positionIsRegistered;
    }

    public Date getPositionRegisterTime() {
        return positionRegisterTime;
    }

    public void setPositionRegisterTime(Date positionRegisterTime) {
        this.positionRegisterTime = positionRegisterTime;
    }

    public String getPositionPositionCode() {
        return positionPositionCode;
    }

    public void setPositionPositionCode(String positionPositionCode) {
        this.positionPositionCode = positionPositionCode == null ? null : positionPositionCode.trim();
    }

    public String getPositionJobTypeCode() {
        return positionJobTypeCode;
    }

    public void setPositionJobTypeCode(String positionJobTypeCode) {
        this.positionJobTypeCode = positionJobTypeCode == null ? null : positionJobTypeCode.trim();
    }

    public Integer getConfidentialLevelId() {
        return confidentialLevelId;
    }

    public void setConfidentialLevelId(Integer confidentialLevelId) {
        this.confidentialLevelId = confidentialLevelId;
    }

    public String getPatientNote() {
        return patientNote;
    }

    public void setPatientNote(String patientNote) {
        this.patientNote = patientNote == null ? null : patientNote.trim();
    }

    public Date getPatientCreateTime() {
        return patientCreateTime;
    }

    public void setPatientCreateTime(Date patientCreateTime) {
        this.patientCreateTime = patientCreateTime;
    }

    public Date getPatientEditTime() {
        return patientEditTime;
    }

    public void setPatientEditTime(Date patientEditTime) {
        this.patientEditTime = patientEditTime;
    }

    public Integer getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(Integer patientStatus) {
        this.patientStatus = patientStatus;
    }
}