package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerOrder implements Serializable{
    private String customerOrderId;

    private String orderNo;

    private Integer orderNumber;

    private BigDecimal orderAmount;

    private BigDecimal orderPayAmount;

    private String orderLinkman;

    private String orderPhone;

    private String orderSnapshot;

    private Integer payWayId;

    private String payWayName;

    private Integer orderStatus;

    private Integer orderRefundStatus;

    private Boolean orderInstallment;

    private String orderInstallmentStatus;

    private String customerId;

    private String customerName;

    private String enterpriseId;

    private Integer receiptStatus;

    private String enterpriseName;

    private Integer customerOrderStatus;

    private Date customerOrderCreateTime;

    private Date customerOrderEditTime;   
    
    

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getOrderPayAmount() {
        return orderPayAmount;
    }

    public void setOrderPayAmount(BigDecimal orderPayAmount) {
        this.orderPayAmount = orderPayAmount;
    }

    public String getOrderLinkman() {
        return orderLinkman;
    }

    public void setOrderLinkman(String orderLinkman) {
        this.orderLinkman = orderLinkman == null ? null : orderLinkman.trim();
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    public String getOrderSnapshot() {
        return orderSnapshot;
    }

    public void setOrderSnapshot(String orderSnapshot) {
        this.orderSnapshot = orderSnapshot == null ? null : orderSnapshot.trim();
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderRefundStatus() {
        return orderRefundStatus;
    }

    public void setOrderRefundStatus(Integer orderRefundStatus) {
        this.orderRefundStatus = orderRefundStatus;
    }

    public Boolean getOrderInstallment() {
        return orderInstallment;
    }

    public void setOrderInstallment(Boolean orderInstallment) {
        this.orderInstallment = orderInstallment;
    }

    public String getOrderInstallmentStatus() {
        return orderInstallmentStatus;
    }

    public void setOrderInstallmentStatus(String orderInstallmentStatus) {
        this.orderInstallmentStatus = orderInstallmentStatus == null ? null : orderInstallmentStatus.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Integer receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Integer getCustomerOrderStatus() {
        return customerOrderStatus;
    }

    public void setCustomerOrderStatus(Integer customerOrderStatus) {
        this.customerOrderStatus = customerOrderStatus;
    }

    public Date getCustomerOrderCreateTime() {
        return customerOrderCreateTime;
    }

    public void setCustomerOrderCreateTime(Date customerOrderCreateTime) {
        this.customerOrderCreateTime = customerOrderCreateTime;
    }

    public Date getCustomerOrderEditTime() {
        return customerOrderEditTime;
    }

    public void setCustomerOrderEditTime(Date customerOrderEditTime) {
        this.customerOrderEditTime = customerOrderEditTime;
    }
}