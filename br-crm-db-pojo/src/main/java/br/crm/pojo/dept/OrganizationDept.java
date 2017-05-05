package br.crm.pojo.dept;

import java.io.Serializable;
import java.util.Date;

public class OrganizationDept implements Serializable {
    private String orgDeptId;

    private String orgId;

    private String branchId;

    private String departName;

    private String departNameAbr;

    private String departNameEng;

    private String departNameEngAbr;

    private String departCode;

    private String departType;

    private String departHisType;

    private String departManagerId;

    private String departParentId;

    private Integer fUnList;

    private Integer fGuideDepartOnly;

    private Long queueSiteId;

    private String pacsType;

    private Integer dispOrder;

    private String directionGuide;

    private String note;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getOrgDeptId() {
        return orgDeptId;
    }

    public void setOrgDeptId(String orgDeptId) {
        this.orgDeptId = orgDeptId == null ? null : orgDeptId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartNameAbr() {
        return departNameAbr;
    }

    public void setDepartNameAbr(String departNameAbr) {
        this.departNameAbr = departNameAbr == null ? null : departNameAbr.trim();
    }

    public String getDepartNameEng() {
        return departNameEng;
    }

    public void setDepartNameEng(String departNameEng) {
        this.departNameEng = departNameEng == null ? null : departNameEng.trim();
    }

    public String getDepartNameEngAbr() {
        return departNameEngAbr;
    }

    public void setDepartNameEngAbr(String departNameEngAbr) {
        this.departNameEngAbr = departNameEngAbr == null ? null : departNameEngAbr.trim();
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    public String getDepartType() {
        return departType;
    }

    public void setDepartType(String departType) {
        this.departType = departType == null ? null : departType.trim();
    }

    public String getDepartHisType() {
        return departHisType;
    }

    public void setDepartHisType(String departHisType) {
        this.departHisType = departHisType == null ? null : departHisType.trim();
    }

    public String getDepartManagerId() {
        return departManagerId;
    }

    public void setDepartManagerId(String departManagerId) {
        this.departManagerId = departManagerId == null ? null : departManagerId.trim();
    }

    public String getDepartParentId() {
        return departParentId;
    }

    public void setDepartParentId(String departParentId) {
        this.departParentId = departParentId == null ? null : departParentId.trim();
    }

    public Integer getfUnList() {
        return fUnList;
    }

    public void setfUnList(Integer fUnList) {
        this.fUnList = fUnList;
    }

    public Integer getfGuideDepartOnly() {
        return fGuideDepartOnly;
    }

    public void setfGuideDepartOnly(Integer fGuideDepartOnly) {
        this.fGuideDepartOnly = fGuideDepartOnly;
    }

    public Long getQueueSiteId() {
        return queueSiteId;
    }

    public void setQueueSiteId(Long queueSiteId) {
        this.queueSiteId = queueSiteId;
    }

    public String getPacsType() {
        return pacsType;
    }

    public void setPacsType(String pacsType) {
        this.pacsType = pacsType == null ? null : pacsType.trim();
    }

    public Integer getDispOrder() {
        return dispOrder;
    }

    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    public String getDirectionGuide() {
        return directionGuide;
    }

    public void setDirectionGuide(String directionGuide) {
        this.directionGuide = directionGuide == null ? null : directionGuide.trim();
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
}