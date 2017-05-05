package br.crm.pojo.branch;

import java.io.Serializable;
import java.util.Date;

public class OrganizationBranchRest implements Serializable{
    private String branchRestId;

    private String branchId;

    private Integer branchRestType;

    private String branchRestValue;

    private Integer branchRestStatus;

    private Date branchRestCreateTime;

    private Date branchRestEditTime;

    public String getBranchRestId() {
        return branchRestId;
    }

    public void setBranchRestId(String branchRestId) {
        this.branchRestId = branchRestId == null ? null : branchRestId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public Integer getBranchRestType() {
        return branchRestType;
    }

    public void setBranchRestType(Integer branchRestType) {
        this.branchRestType = branchRestType;
    }

    public String getBranchRestValue() {
        return branchRestValue;
    }

    public void setBranchRestValue(String branchRestValue) {
        this.branchRestValue = branchRestValue == null ? null : branchRestValue.trim();
    }

    public Integer getBranchRestStatus() {
        return branchRestStatus;
    }

    public void setBranchRestStatus(Integer branchRestStatus) {
        this.branchRestStatus = branchRestStatus;
    }

    public Date getBranchRestCreateTime() {
        return branchRestCreateTime;
    }

    public void setBranchRestCreateTime(Date branchRestCreateTime) {
        this.branchRestCreateTime = branchRestCreateTime;
    }

    public Date getBranchRestEditTime() {
        return branchRestEditTime;
    }

    public void setBranchRestEditTime(Date branchRestEditTime) {
        this.branchRestEditTime = branchRestEditTime;
    }
}