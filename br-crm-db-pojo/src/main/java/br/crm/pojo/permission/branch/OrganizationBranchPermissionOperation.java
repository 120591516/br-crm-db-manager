package br.crm.pojo.permission.branch;

import java.util.Date;

public class OrganizationBranchPermissionOperation {
    private Long id;

    private Long branchRolePermissionId;

    private Long branchOperationId;

    private String editUserId;

    private String editUserName;

    private Date edittime;

    private Integer status;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBranchRolePermissionId() {
        return branchRolePermissionId;
    }

    public void setBranchRolePermissionId(Long branchRolePermissionId) {
        this.branchRolePermissionId = branchRolePermissionId;
    }

    public Long getBranchOperationId() {
        return branchOperationId;
    }

    public void setBranchOperationId(Long branchOperationId) {
        this.branchOperationId = branchOperationId;
    }

    public String getEditUserId() {
        return editUserId;
    }

    public void setEditUserId(String editUserId) {
        this.editUserId = editUserId == null ? null : editUserId.trim();
    }

    public String getEditUserName() {
        return editUserName;
    }

    public void setEditUserName(String editUserName) {
        this.editUserName = editUserName == null ? null : editUserName.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}