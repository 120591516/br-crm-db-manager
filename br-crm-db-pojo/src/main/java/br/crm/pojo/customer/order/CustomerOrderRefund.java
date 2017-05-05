package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.util.Date;

public class CustomerOrderRefund implements Serializable{
    private String customerOrderRefundId;

    private String orderNo;

    private String customerOrderPayInfoId;

    private String customerOrderPayInfoNo;

    private Integer customerOrderPayWayId;

    private String orderRefundOrderNo;

    private String orderRefundDetails;

    private Integer orderRefundResult;

    private String enterpriseId;

    private String customerId;

    private Date customerOrderRefundCreateTime;

    private Date customerOrderRefundEditTime;

    public String getCustomerOrderRefundId() {
        return customerOrderRefundId;
    }

    public void setCustomerOrderRefundId(String customerOrderRefundId) {
        this.customerOrderRefundId = customerOrderRefundId == null ? null : customerOrderRefundId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getCustomerOrderPayInfoId() {
        return customerOrderPayInfoId;
    }

    public void setCustomerOrderPayInfoId(String customerOrderPayInfoId) {
        this.customerOrderPayInfoId = customerOrderPayInfoId == null ? null : customerOrderPayInfoId.trim();
    }

    public String getCustomerOrderPayInfoNo() {
        return customerOrderPayInfoNo;
    }

    public void setCustomerOrderPayInfoNo(String customerOrderPayInfoNo) {
        this.customerOrderPayInfoNo = customerOrderPayInfoNo == null ? null : customerOrderPayInfoNo.trim();
    }

    public Integer getCustomerOrderPayWayId() {
        return customerOrderPayWayId;
    }

    public void setCustomerOrderPayWayId(Integer customerOrderPayWayId) {
        this.customerOrderPayWayId = customerOrderPayWayId;
    }

    public String getOrderRefundOrderNo() {
        return orderRefundOrderNo;
    }

    public void setOrderRefundOrderNo(String orderRefundOrderNo) {
        this.orderRefundOrderNo = orderRefundOrderNo == null ? null : orderRefundOrderNo.trim();
    }

    public String getOrderRefundDetails() {
        return orderRefundDetails;
    }

    public void setOrderRefundDetails(String orderRefundDetails) {
        this.orderRefundDetails = orderRefundDetails == null ? null : orderRefundDetails.trim();
    }

    public Integer getOrderRefundResult() {
        return orderRefundResult;
    }

    public void setOrderRefundResult(Integer orderRefundResult) {
        this.orderRefundResult = orderRefundResult;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Date getCustomerOrderRefundCreateTime() {
        return customerOrderRefundCreateTime;
    }

    public void setCustomerOrderRefundCreateTime(Date customerOrderRefundCreateTime) {
        this.customerOrderRefundCreateTime = customerOrderRefundCreateTime;
    }

    public Date getCustomerOrderRefundEditTime() {
        return customerOrderRefundEditTime;
    }

    public void setCustomerOrderRefundEditTime(Date customerOrderRefundEditTime) {
        this.customerOrderRefundEditTime = customerOrderRefundEditTime;
    }
}