package br.crm.pojo.group;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EnterpriseGroup implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseGroupId;

    private String enterpriseReservationId;

    private String enterpriseId;

    private String enterpriseFullName;

    private String enterpriseGroupTypeId;

    private String enterpriseGroupName;

    private Date enterpriseGroupPlannedTime;

    private String enterpriseGroupInstruction;

    private String patientClassId;

    private Integer sexId;

    private Integer enterpriseGroupMinAge;

    private Integer enterpriseGroupMaxAge;

    private Integer enterpriseGroupCountCustomer;

    private Integer payWayId;

    private String payWayName;

    private Integer enterpriseGroupOffPercent;

    private BigDecimal enterpriseGroupPriceLimit;

    private Integer confidentialLevelId;

    private String enterpriseGroupNote;

    private String enterpriseGroupInputCode;

    private Integer enterpriseGroupOrder;

    private Integer enterpriseGroupStatus;

    private Date enterpriseGroupEditTime;

    private Date enterpriseGroupCreateTime;

    public String getEnterpriseGroupId() {
        return enterpriseGroupId;
    }

    public void setEnterpriseGroupId(String enterpriseGroupId) {
        this.enterpriseGroupId = enterpriseGroupId == null ? null : enterpriseGroupId.trim();
    }

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

    public String getEnterpriseFullName() {
        return enterpriseFullName;
    }

    public void setEnterpriseFullName(String enterpriseFullName) {
        this.enterpriseFullName = enterpriseFullName == null ? null : enterpriseFullName.trim();
    }

    public String getEnterpriseGroupTypeId() {
        return enterpriseGroupTypeId;
    }

    public void setEnterpriseGroupTypeId(String enterpriseGroupTypeId) {
        this.enterpriseGroupTypeId = enterpriseGroupTypeId == null ? null : enterpriseGroupTypeId.trim();
    }

    public String getEnterpriseGroupName() {
        return enterpriseGroupName;
    }

    public void setEnterpriseGroupName(String enterpriseGroupName) {
        this.enterpriseGroupName = enterpriseGroupName == null ? null : enterpriseGroupName.trim();
    }

    public Date getEnterpriseGroupPlannedTime() {
        return enterpriseGroupPlannedTime;
    }

    public void setEnterpriseGroupPlannedTime(Date enterpriseGroupPlannedTime) {
        this.enterpriseGroupPlannedTime = enterpriseGroupPlannedTime;
    }

    public String getEnterpriseGroupInstruction() {
        return enterpriseGroupInstruction;
    }

    public void setEnterpriseGroupInstruction(String enterpriseGroupInstruction) {
        this.enterpriseGroupInstruction = enterpriseGroupInstruction == null ? null : enterpriseGroupInstruction.trim();
    }

    public String getPatientClassId() {
        return patientClassId;
    }

    public void setPatientClassId(String patientClassId) {
        this.patientClassId = patientClassId == null ? null : patientClassId.trim();
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public Integer getEnterpriseGroupMinAge() {
        return enterpriseGroupMinAge;
    }

    public void setEnterpriseGroupMinAge(Integer enterpriseGroupMinAge) {
        this.enterpriseGroupMinAge = enterpriseGroupMinAge;
    }

    public Integer getEnterpriseGroupMaxAge() {
        return enterpriseGroupMaxAge;
    }

    public void setEnterpriseGroupMaxAge(Integer enterpriseGroupMaxAge) {
        this.enterpriseGroupMaxAge = enterpriseGroupMaxAge;
    }

    public Integer getEnterpriseGroupCountCustomer() {
        return enterpriseGroupCountCustomer;
    }

    public void setEnterpriseGroupCountCustomer(Integer enterpriseGroupCountCustomer) {
        this.enterpriseGroupCountCustomer = enterpriseGroupCountCustomer;
    }

    public Integer getPayWayId() {
        return payWayId;
    }

    public void setPayWayId(Integer payWayId) {
        this.payWayId = payWayId;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName == null ? null : payWayName.trim();
    }

    public Integer getEnterpriseGroupOffPercent() {
        return enterpriseGroupOffPercent;
    }

    public void setEnterpriseGroupOffPercent(Integer enterpriseGroupOffPercent) {
        this.enterpriseGroupOffPercent = enterpriseGroupOffPercent;
    }

    public BigDecimal getEnterpriseGroupPriceLimit() {
        return enterpriseGroupPriceLimit;
    }

    public void setEnterpriseGroupPriceLimit(BigDecimal enterpriseGroupPriceLimit) {
        this.enterpriseGroupPriceLimit = enterpriseGroupPriceLimit;
    }

    public Integer getConfidentialLevelId() {
        return confidentialLevelId;
    }

    public void setConfidentialLevelId(Integer confidentialLevelId) {
        this.confidentialLevelId = confidentialLevelId;
    }

    public String getEnterpriseGroupNote() {
        return enterpriseGroupNote;
    }

    public void setEnterpriseGroupNote(String enterpriseGroupNote) {
        this.enterpriseGroupNote = enterpriseGroupNote == null ? null : enterpriseGroupNote.trim();
    }

    public String getEnterpriseGroupInputCode() {
        return enterpriseGroupInputCode;
    }

    public void setEnterpriseGroupInputCode(String enterpriseGroupInputCode) {
        this.enterpriseGroupInputCode = enterpriseGroupInputCode == null ? null : enterpriseGroupInputCode.trim();
    }

    public Integer getEnterpriseGroupOrder() {
        return enterpriseGroupOrder;
    }

    public void setEnterpriseGroupOrder(Integer enterpriseGroupOrder) {
        this.enterpriseGroupOrder = enterpriseGroupOrder;
    }

    public Integer getEnterpriseGroupStatus() {
        return enterpriseGroupStatus;
    }

    public void setEnterpriseGroupStatus(Integer enterpriseGroupStatus) {
        this.enterpriseGroupStatus = enterpriseGroupStatus;
    }

    public Date getEnterpriseGroupEditTime() {
        return enterpriseGroupEditTime;
    }

    public void setEnterpriseGroupEditTime(Date enterpriseGroupEditTime) {
        this.enterpriseGroupEditTime = enterpriseGroupEditTime;
    }

    public Date getEnterpriseGroupCreateTime() {
        return enterpriseGroupCreateTime;
    }

    public void setEnterpriseGroupCreateTime(Date enterpriseGroupCreateTime) {
        this.enterpriseGroupCreateTime = enterpriseGroupCreateTime;
    }
}