package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerOrderPayInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerOrderPayInfoId;

    private String orderNo;

    private Integer payType;

    private Integer payWayId;

    private String payWayName;

    private BigDecimal orderPayAmount;

    private String orderPayCallback;

    private String orderPayNotify;

    private Integer orderPayResult;

    private String orderPayOrderNo;

    private String enterpriseId;

    private String customerId;

    private Date customerOrderPayInfoCreateTime;

    private Date customerOrderPayInfoEditTime;

    public String getCustomerOrderPayInfoId() {
        return customerOrderPayInfoId;
    }

    public void setCustomerOrderPayInfoId(String customerOrderPayInfoId) {
        this.customerOrderPayInfoId = customerOrderPayInfoId == null ? null : customerOrderPayInfoId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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

    public BigDecimal getOrderPayAmount() {
        return orderPayAmount;
    }

    public void setOrderPayAmount(BigDecimal orderPayAmount) {
        this.orderPayAmount = orderPayAmount;
    }

    public String getOrderPayCallback() {
        return orderPayCallback;
    }

    public void setOrderPayCallback(String orderPayCallback) {
        this.orderPayCallback = orderPayCallback == null ? null : orderPayCallback.trim();
    }

    public String getOrderPayNotify() {
        return orderPayNotify;
    }

    public void setOrderPayNotify(String orderPayNotify) {
        this.orderPayNotify = orderPayNotify == null ? null : orderPayNotify.trim();
    }

    public Integer getOrderPayResult() {
        return orderPayResult;
    }

    public void setOrderPayResult(Integer orderPayResult) {
        this.orderPayResult = orderPayResult;
    }

    public String getOrderPayOrderNo() {
        return orderPayOrderNo;
    }

    public void setOrderPayOrderNo(String orderPayOrderNo) {
        this.orderPayOrderNo = orderPayOrderNo == null ? null : orderPayOrderNo.trim();
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

    public Date getCustomerOrderPayInfoCreateTime() {
        return customerOrderPayInfoCreateTime;
    }

    public void setCustomerOrderPayInfoCreateTime(Date customerOrderPayInfoCreateTime) {
        this.customerOrderPayInfoCreateTime = customerOrderPayInfoCreateTime;
    }

    public Date getCustomerOrderPayInfoEditTime() {
        return customerOrderPayInfoEditTime;
    }

    public void setCustomerOrderPayInfoEditTime(Date customerOrderPayInfoEditTime) {
        this.customerOrderPayInfoEditTime = customerOrderPayInfoEditTime;
    }
}