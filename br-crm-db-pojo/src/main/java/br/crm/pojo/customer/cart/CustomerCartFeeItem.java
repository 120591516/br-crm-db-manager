package br.crm.pojo.customer.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerCartFeeItem implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerCartFeeItemId;

    private String cartId;

    private String orgId;

    private String orgName;

    private Boolean examSuiteSplit;

    private String examSuiteId;

    private String examSuiteName;

    private String examFeeItemIdOld;

    private String examFeeItemId;

    private String examFeeItemName;

    private BigDecimal price;

    private BigDecimal examSuitePrice;

    private String customerId;

    private String enterpriseId;

    private String enterpriseName;

    private Integer customerCartFeeItemStatus;

    private Date customerCartFeeItemCreateTime;

    private Date customerCartFeeItemEditTime;

    public String getCustomerCartFeeItemId() {
        return customerCartFeeItemId;
    }

    public void setCustomerCartFeeItemId(String customerCartFeeItemId) {
        this.customerCartFeeItemId = customerCartFeeItemId == null ? null : customerCartFeeItemId.trim();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Boolean getExamSuiteSplit() {
        return examSuiteSplit;
    }

    public void setExamSuiteSplit(Boolean examSuiteSplit) {
        this.examSuiteSplit = examSuiteSplit;
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getExamSuiteName() {
        return examSuiteName;
    }

    public void setExamSuiteName(String examSuiteName) {
        this.examSuiteName = examSuiteName == null ? null : examSuiteName.trim();
    }

    public String getExamFeeItemIdOld() {
        return examFeeItemIdOld;
    }

    public void setExamFeeItemIdOld(String examFeeItemIdOld) {
        this.examFeeItemIdOld = examFeeItemIdOld == null ? null : examFeeItemIdOld.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
    }

    public String getExamFeeItemName() {
        return examFeeItemName;
    }

    public void setExamFeeItemName(String examFeeItemName) {
        this.examFeeItemName = examFeeItemName == null ? null : examFeeItemName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getExamSuitePrice() {
        return examSuitePrice;
    }

    public void setExamSuitePrice(BigDecimal examSuitePrice) {
        this.examSuitePrice = examSuitePrice;
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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Integer getCustomerCartFeeItemStatus() {
        return customerCartFeeItemStatus;
    }

    public void setCustomerCartFeeItemStatus(Integer customerCartFeeItemStatus) {
        this.customerCartFeeItemStatus = customerCartFeeItemStatus;
    }

    public Date getCustomerCartFeeItemCreateTime() {
        return customerCartFeeItemCreateTime;
    }

    public void setCustomerCartFeeItemCreateTime(Date customerCartFeeItemCreateTime) {
        this.customerCartFeeItemCreateTime = customerCartFeeItemCreateTime;
    }

    public Date getCustomerCartFeeItemEditTime() {
        return customerCartFeeItemEditTime;
    }

    public void setCustomerCartFeeItemEditTime(Date customerCartFeeItemEditTime) {
        this.customerCartFeeItemEditTime = customerCartFeeItemEditTime;
    }
}