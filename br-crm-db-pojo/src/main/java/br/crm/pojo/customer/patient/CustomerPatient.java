package br.crm.pojo.customer.patient;

import java.io.Serializable;
import java.util.Date;

public class CustomerPatient implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerPatientId;

    private String cartId;

    private Integer sexId;

    private String sexName;

    private String customerPatientName;

    private String customerPatientPhone;

    private Integer customerCertificateType;

    private String customerPatientIdCard;

    private Date customerPatientExamTime;

    private String customerId;

    private String enterpriseId;

    private Integer customerPatientStatus;

    private Date customerPatientCreateTime;

    private Date customerPatientEditTime;

    public String getCustomerPatientId() {
        return customerPatientId;
    }

    public void setCustomerPatientId(String customerPatientId) {
        this.customerPatientId = customerPatientId == null ? null : customerPatientId.trim();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
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

    public String getCustomerPatientName() {
        return customerPatientName;
    }

    public void setCustomerPatientName(String customerPatientName) {
        this.customerPatientName = customerPatientName == null ? null : customerPatientName.trim();
    }

    public String getCustomerPatientPhone() {
        return customerPatientPhone;
    }

    public void setCustomerPatientPhone(String customerPatientPhone) {
        this.customerPatientPhone = customerPatientPhone == null ? null : customerPatientPhone.trim();
    }

    public Integer getCustomerCertificateType() {
        return customerCertificateType;
    }

    public void setCustomerCertificateType(Integer customerCertificateType) {
        this.customerCertificateType = customerCertificateType;
    }

    public String getCustomerPatientIdCard() {
        return customerPatientIdCard;
    }

    public void setCustomerPatientIdCard(String customerPatientIdCard) {
        this.customerPatientIdCard = customerPatientIdCard == null ? null : customerPatientIdCard.trim();
    }

    public Date getCustomerPatientExamTime() {
        return customerPatientExamTime;
    }

    public void setCustomerPatientExamTime(Date customerPatientExamTime) {
        this.customerPatientExamTime = customerPatientExamTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public Integer getCustomerPatientStatus() {
        return customerPatientStatus;
    }

    public void setCustomerPatientStatus(Integer customerPatientStatus) {
        this.customerPatientStatus = customerPatientStatus;
    }

    public Date getCustomerPatientCreateTime() {
        return customerPatientCreateTime;
    }

    public void setCustomerPatientCreateTime(Date customerPatientCreateTime) {
        this.customerPatientCreateTime = customerPatientCreateTime;
    }

    public Date getCustomerPatientEditTime() {
        return customerPatientEditTime;
    }

    public void setCustomerPatientEditTime(Date customerPatientEditTime) {
        this.customerPatientEditTime = customerPatientEditTime;
    }
}