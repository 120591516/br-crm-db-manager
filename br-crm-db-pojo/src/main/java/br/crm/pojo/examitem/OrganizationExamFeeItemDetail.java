package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamFeeItemDetail implements Serializable{
    private String examFeeItemDetailId;

    private String examFeeItemId;

    private String organizationId;

    private String organizationBranchId;

    private String organizationDeptId;

    private String examItemUserId;

    private Integer dispOrder;

    private String note;

    private Integer status;

    private Date createTime;

    private Date editTime;

    public String getExamFeeItemDetailId() {
        return examFeeItemDetailId;
    }

    public void setExamFeeItemDetailId(String examFeeItemDetailId) {
        this.examFeeItemDetailId = examFeeItemDetailId == null ? null : examFeeItemDetailId.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
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

    public String getOrganizationDeptId() {
        return organizationDeptId;
    }

    public void setOrganizationDeptId(String organizationDeptId) {
        this.organizationDeptId = organizationDeptId == null ? null : organizationDeptId.trim();
    }

    public String getExamItemUserId() {
        return examItemUserId;
    }

    public void setExamItemUserId(String examItemUserId) {
        this.examItemUserId = examItemUserId == null ? null : examItemUserId.trim();
    }

    public Integer getDispOrder() {
        return dispOrder;
    }

    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}