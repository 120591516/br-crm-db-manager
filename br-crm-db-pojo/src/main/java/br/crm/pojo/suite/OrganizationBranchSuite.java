package br.crm.pojo.suite;

import java.io.Serializable;
import java.util.Date;

public class OrganizationBranchSuite implements Serializable {
    private String branchSuiteId;

    private String branchId;

    private String suiteId;

    private Integer status;

    private Date createtime;

    private Date edittime;

    private Long editPersonId;

    private String editPersonName;

    private Integer editPersonPlat;

    public String getBranchSuiteId() {
        return branchSuiteId;
    }

    public void setBranchSuiteId(String branchSuiteId) {
        this.branchSuiteId = branchSuiteId == null ? null : branchSuiteId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(String suiteId) {
        this.suiteId = suiteId == null ? null : suiteId.trim();
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

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Long getEditPersonId() {
        return editPersonId;
    }

    public void setEditPersonId(Long editPersonId) {
        this.editPersonId = editPersonId;
    }

    public String getEditPersonName() {
        return editPersonName;
    }

    public void setEditPersonName(String editPersonName) {
        this.editPersonName = editPersonName == null ? null : editPersonName.trim();
    }

    public Integer getEditPersonPlat() {
        return editPersonPlat;
    }

    public void setEditPersonPlat(Integer editPersonPlat) {
        this.editPersonPlat = editPersonPlat;
    }
}