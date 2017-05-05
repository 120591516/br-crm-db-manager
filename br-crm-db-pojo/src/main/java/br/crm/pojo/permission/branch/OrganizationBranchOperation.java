package br.crm.pojo.permission.branch;

import java.util.Date;

public class OrganizationBranchOperation {
    private Long operationId;

    private String operationName;

    private String operationDescribe;

    private Long permissionId;

    private Integer operationStatus;

    private Date operationCreatetime;

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getOperationDescribe() {
        return operationDescribe;
    }

    public void setOperationDescribe(String operationDescribe) {
        this.operationDescribe = operationDescribe == null ? null : operationDescribe.trim();
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Date getOperationCreatetime() {
        return operationCreatetime;
    }

    public void setOperationCreatetime(Date operationCreatetime) {
        this.operationCreatetime = operationCreatetime;
    }
}