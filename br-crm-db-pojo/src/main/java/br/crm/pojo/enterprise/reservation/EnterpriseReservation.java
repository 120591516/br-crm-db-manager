package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseReservation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseReservationId;

    private String enterpriseId;

    private String enterpriseName;

    private String enterpriseOrgId;

    private String orgName;

    private String enterpriseReservationAddress;

    private String enterpriseReservationContact;

    private Integer enterpriseReservationCountCustomer;

    private Date enterpriseReservationTime;

    private Date enterpriseReservationFinalTime;

    private Boolean enterpriseReservationHided;

    private Boolean enterpriseReservationSelectable;

    private Integer confidentialLevelId;

    private String enterpriseReservationNote;

    private String enterpriseReservationCode;

    private Integer enterpriseReservationInputCode;

    private Integer enterpriseReservationOrder;

    private Integer enterpriseReservationStatus;

    private Date enterpriseReservationCreateTime;

    private Date enterpriseReservationEditTime;

    public String getEnterpriseReservationId() {
        return enterpriseReservationId;
    }

    public void setEnterpriseReservationId(String enterpriseReservationId) {
        this.enterpriseReservationId = enterpriseReservationId == null ? null : enterpriseReservationId.trim();
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

    public String getEnterpriseOrgId() {
        return enterpriseOrgId;
    }

    public void setEnterpriseOrgId(String enterpriseOrgId) {
        this.enterpriseOrgId = enterpriseOrgId == null ? null : enterpriseOrgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getEnterpriseReservationAddress() {
        return enterpriseReservationAddress;
    }

    public void setEnterpriseReservationAddress(String enterpriseReservationAddress) {
        this.enterpriseReservationAddress = enterpriseReservationAddress == null ? null : enterpriseReservationAddress.trim();
    }

    public String getEnterpriseReservationContact() {
        return enterpriseReservationContact;
    }

    public void setEnterpriseReservationContact(String enterpriseReservationContact) {
        this.enterpriseReservationContact = enterpriseReservationContact == null ? null : enterpriseReservationContact.trim();
    }

    public Integer getEnterpriseReservationCountCustomer() {
        return enterpriseReservationCountCustomer;
    }

    public void setEnterpriseReservationCountCustomer(Integer enterpriseReservationCountCustomer) {
        this.enterpriseReservationCountCustomer = enterpriseReservationCountCustomer;
    }

    public Date getEnterpriseReservationTime() {
        return enterpriseReservationTime;
    }

    public void setEnterpriseReservationTime(Date enterpriseReservationTime) {
        this.enterpriseReservationTime = enterpriseReservationTime;
    }

    public Date getEnterpriseReservationFinalTime() {
        return enterpriseReservationFinalTime;
    }

    public void setEnterpriseReservationFinalTime(Date enterpriseReservationFinalTime) {
        this.enterpriseReservationFinalTime = enterpriseReservationFinalTime;
    }

    public Boolean getEnterpriseReservationHided() {
        return enterpriseReservationHided;
    }

    public void setEnterpriseReservationHided(Boolean enterpriseReservationHided) {
        this.enterpriseReservationHided = enterpriseReservationHided;
    }

    public Boolean getEnterpriseReservationSelectable() {
        return enterpriseReservationSelectable;
    }

    public void setEnterpriseReservationSelectable(Boolean enterpriseReservationSelectable) {
        this.enterpriseReservationSelectable = enterpriseReservationSelectable;
    }

    public Integer getConfidentialLevelId() {
        return confidentialLevelId;
    }

    public void setConfidentialLevelId(Integer confidentialLevelId) {
        this.confidentialLevelId = confidentialLevelId;
    }

    public String getEnterpriseReservationNote() {
        return enterpriseReservationNote;
    }

    public void setEnterpriseReservationNote(String enterpriseReservationNote) {
        this.enterpriseReservationNote = enterpriseReservationNote == null ? null : enterpriseReservationNote.trim();
    }

    public String getEnterpriseReservationCode() {
        return enterpriseReservationCode;
    }

    public void setEnterpriseReservationCode(String enterpriseReservationCode) {
        this.enterpriseReservationCode = enterpriseReservationCode == null ? null : enterpriseReservationCode.trim();
    }

    public Integer getEnterpriseReservationInputCode() {
        return enterpriseReservationInputCode;
    }

    public void setEnterpriseReservationInputCode(Integer enterpriseReservationInputCode) {
        this.enterpriseReservationInputCode = enterpriseReservationInputCode;
    }

    public Integer getEnterpriseReservationOrder() {
        return enterpriseReservationOrder;
    }

    public void setEnterpriseReservationOrder(Integer enterpriseReservationOrder) {
        this.enterpriseReservationOrder = enterpriseReservationOrder;
    }

    public Integer getEnterpriseReservationStatus() {
        return enterpriseReservationStatus;
    }

    public void setEnterpriseReservationStatus(Integer enterpriseReservationStatus) {
        this.enterpriseReservationStatus = enterpriseReservationStatus;
    }

    public Date getEnterpriseReservationCreateTime() {
        return enterpriseReservationCreateTime;
    }

    public void setEnterpriseReservationCreateTime(Date enterpriseReservationCreateTime) {
        this.enterpriseReservationCreateTime = enterpriseReservationCreateTime;
    }

    public Date getEnterpriseReservationEditTime() {
        return enterpriseReservationEditTime;
    }

    public void setEnterpriseReservationEditTime(Date enterpriseReservationEditTime) {
        this.enterpriseReservationEditTime = enterpriseReservationEditTime;
    }
}