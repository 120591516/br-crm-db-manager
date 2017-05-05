package br.crm.pojo.customer.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerCart implements Serializable {
    private String cartId;

    private String orgId;

    private String orgName;

    private String branchId;

    private String branchName;

    private String customerCartImgId;

    private String customerCartImgUrl;

    private Boolean examSuiteSplit;

    private String examSuiteId;

    private String examSuiteName;

    private BigDecimal examSuitePrice;

    private BigDecimal examSuiteDiscountPrice;

    private Integer cartNumber;

    private BigDecimal price;

    private BigDecimal payPrice;

    private BigDecimal singlePrice;

    private Integer cartStatus;

    private String customerId;

    private String enterpriseId;

    private String enterpriseName;

    private Date examTime;

    private Date cartCreateTime;

    private Date cartEditTime;

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

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getCustomerCartImgId() {
        return customerCartImgId;
    }

    public void setCustomerCartImgId(String customerCartImgId) {
        this.customerCartImgId = customerCartImgId == null ? null : customerCartImgId.trim();
    }

    public String getCustomerCartImgUrl() {
        return customerCartImgUrl;
    }

    public void setCustomerCartImgUrl(String customerCartImgUrl) {
        this.customerCartImgUrl = customerCartImgUrl == null ? null : customerCartImgUrl.trim();
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

    public BigDecimal getExamSuitePrice() {
        return examSuitePrice;
    }

    public void setExamSuitePrice(BigDecimal examSuitePrice) {
        this.examSuitePrice = examSuitePrice;
    }

    public BigDecimal getExamSuiteDiscountPrice() {
        return examSuiteDiscountPrice;
    }

    public void setExamSuiteDiscountPrice(BigDecimal examSuiteDiscountPrice) {
        this.examSuiteDiscountPrice = examSuiteDiscountPrice;
    }

    public Integer getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(Integer cartNumber) {
        this.cartNumber = cartNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }

    public Integer getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(Integer cartStatus) {
        this.cartStatus = cartStatus;
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

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public Date getCartCreateTime() {
        return cartCreateTime;
    }

    public void setCartCreateTime(Date cartCreateTime) {
        this.cartCreateTime = cartCreateTime;
    }

    public Date getCartEditTime() {
        return cartEditTime;
    }

    public void setCartEditTime(Date cartEditTime) {
        this.cartEditTime = cartEditTime;
    }
}