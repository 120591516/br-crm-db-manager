package br.crm.pojo.customer.order;

import java.util.Date;

public class CustomerOrderCart {
    private String customerOrderCartId;

    private String customerOrderNo;

    private String customerCartId;

    private String orgId;

    private String orgName;

    private String orgBranchId;

    private String orgBranchName;

    private Integer customerOrderCartStatus;

    private Date customerOrderCartCreateTime;

    private Date customerOrderCartEditTime;

    public String getCustomerOrderCartId() {
        return customerOrderCartId;
    }

    public void setCustomerOrderCartId(String customerOrderCartId) {
        this.customerOrderCartId = customerOrderCartId == null ? null : customerOrderCartId.trim();
    }

    public String getCustomerOrderNo() {
        return customerOrderNo;
    }

    public void setCustomerOrderNo(String customerOrderNo) {
        this.customerOrderNo = customerOrderNo == null ? null : customerOrderNo.trim();
    }

    public String getCustomerCartId() {
        return customerCartId;
    }

    public void setCustomerCartId(String customerCartId) {
        this.customerCartId = customerCartId == null ? null : customerCartId.trim();
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

    public String getOrgBranchId() {
        return orgBranchId;
    }

    public void setOrgBranchId(String orgBranchId) {
        this.orgBranchId = orgBranchId == null ? null : orgBranchId.trim();
    }

    public String getOrgBranchName() {
        return orgBranchName;
    }

    public void setOrgBranchName(String orgBranchName) {
        this.orgBranchName = orgBranchName == null ? null : orgBranchName.trim();
    }

    public Integer getCustomerOrderCartStatus() {
        return customerOrderCartStatus;
    }

    public void setCustomerOrderCartStatus(Integer customerOrderCartStatus) {
        this.customerOrderCartStatus = customerOrderCartStatus;
    }

    public Date getCustomerOrderCartCreateTime() {
        return customerOrderCartCreateTime;
    }

    public void setCustomerOrderCartCreateTime(Date customerOrderCartCreateTime) {
        this.customerOrderCartCreateTime = customerOrderCartCreateTime;
    }

    public Date getCustomerOrderCartEditTime() {
        return customerOrderCartEditTime;
    }

    public void setCustomerOrderCartEditTime(Date customerOrderCartEditTime) {
        this.customerOrderCartEditTime = customerOrderCartEditTime;
    }
}