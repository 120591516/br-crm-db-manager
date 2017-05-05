package br.crm.pojo.customer.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerOrderReceipt implements Serializable{
    private String patientReceiptId;

    private Long idReceipttype;

    private Integer patientReceiptType;

    private String enterpriseId;

    private String customerInfoId;

    private String orgId;

    private String orderNo;

    private String examSuiteId;

    private String patientReceiptName;

    private String patientReceiptContent;

    private BigDecimal patientReceiptPrice;

    private String patientReceiptStatus;

    private Date patientReceiptCreateTime;

    private Date patientReceiptEditTime;

    public String getPatientReceiptId() {
        return patientReceiptId;
    }

    public void setPatientReceiptId(String patientReceiptId) {
        this.patientReceiptId = patientReceiptId == null ? null : patientReceiptId.trim();
    }

    public Long getIdReceipttype() {
        return idReceipttype;
    }

    public void setIdReceipttype(Long idReceipttype) {
        this.idReceipttype = idReceipttype;
    }

    public Integer getPatientReceiptType() {
        return patientReceiptType;
    }

    public void setPatientReceiptType(Integer patientReceiptType) {
        this.patientReceiptType = patientReceiptType;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getPatientReceiptName() {
        return patientReceiptName;
    }

    public void setPatientReceiptName(String patientReceiptName) {
        this.patientReceiptName = patientReceiptName == null ? null : patientReceiptName.trim();
    }

    public String getPatientReceiptContent() {
        return patientReceiptContent;
    }

    public void setPatientReceiptContent(String patientReceiptContent) {
        this.patientReceiptContent = patientReceiptContent == null ? null : patientReceiptContent.trim();
    }

    public BigDecimal getPatientReceiptPrice() {
        return patientReceiptPrice;
    }

    public void setPatientReceiptPrice(BigDecimal patientReceiptPrice) {
        this.patientReceiptPrice = patientReceiptPrice;
    }

    public String getPatientReceiptStatus() {
        return patientReceiptStatus;
    }

    public void setPatientReceiptStatus(String patientReceiptStatus) {
        this.patientReceiptStatus = patientReceiptStatus == null ? null : patientReceiptStatus.trim();
    }

    public Date getPatientReceiptCreateTime() {
        return patientReceiptCreateTime;
    }

    public void setPatientReceiptCreateTime(Date patientReceiptCreateTime) {
        this.patientReceiptCreateTime = patientReceiptCreateTime;
    }

    public Date getPatientReceiptEditTime() {
        return patientReceiptEditTime;
    }

    public void setPatientReceiptEditTime(Date patientReceiptEditTime) {
        this.patientReceiptEditTime = patientReceiptEditTime;
    }
}