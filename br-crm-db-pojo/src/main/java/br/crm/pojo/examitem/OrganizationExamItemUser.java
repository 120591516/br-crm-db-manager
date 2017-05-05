package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamItemUser implements Serializable{
    private String organizationExamItemUserId;

    private String organizationExamItemId;

    private String organizationId;

    private String organizationBranchId;

    private String organizationBranchDeptId;

    private String organizationUserId;

    private Integer organizationExamItemStatus;

    private Date organizationExamItemCreateTime;

    private Date organizationExamItemEditTime;

    public String getOrganizationExamItemUserId() {
        return organizationExamItemUserId;
    }

    public void setOrganizationExamItemUserId(String organizationExamItemUserId) {
        this.organizationExamItemUserId = organizationExamItemUserId == null ? null : organizationExamItemUserId.trim();
    }

    public String getOrganizationExamItemId() {
        return organizationExamItemId;
    }

    public void setOrganizationExamItemId(String organizationExamItemId) {
        this.organizationExamItemId = organizationExamItemId == null ? null : organizationExamItemId.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationBranchId() {
        return organizationBranchId;
    }

    public void setOrganizationBranchId(String organizationBranchId) {
        this.organizationBranchId = organizationBranchId == null ? null : organizationBranchId.trim();
    }

    public String getOrganizationBranchDeptId() {
        return organizationBranchDeptId;
    }

    public void setOrganizationBranchDeptId(String organizationBranchDeptId) {
        this.organizationBranchDeptId = organizationBranchDeptId == null ? null : organizationBranchDeptId.trim();
    }

    public String getOrganizationUserId() {
        return organizationUserId;
    }

    public void setOrganizationUserId(String organizationUserId) {
        this.organizationUserId = organizationUserId == null ? null : organizationUserId.trim();
    }

    public Integer getOrganizationExamItemStatus() {
        return organizationExamItemStatus;
    }

    public void setOrganizationExamItemStatus(Integer organizationExamItemStatus) {
        this.organizationExamItemStatus = organizationExamItemStatus;
    }

    public Date getOrganizationExamItemCreateTime() {
        return organizationExamItemCreateTime;
    }

    public void setOrganizationExamItemCreateTime(Date organizationExamItemCreateTime) {
        this.organizationExamItemCreateTime = organizationExamItemCreateTime;
    }

    public Date getOrganizationExamItemEditTime() {
        return organizationExamItemEditTime;
    }

    public void setOrganizationExamItemEditTime(Date organizationExamItemEditTime) {
        this.organizationExamItemEditTime = organizationExamItemEditTime;
    }
}