package br.crm.pojo.dept;

import java.io.Serializable;
import java.util.Date;

public class OrganizationDeptUser implements Serializable {
    private String id;

    private String deptId;

    private String userId;

    private Integer fRead;

    private Integer fWrite;

    private Integer status;

    private Date createTime;

    private Date editTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getfRead() {
        return fRead;
    }

    public void setfRead(Integer fRead) {
        this.fRead = fRead;
    }

    public Integer getfWrite() {
        return fWrite;
    }

    public void setfWrite(Integer fWrite) {
        this.fWrite = fWrite;
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