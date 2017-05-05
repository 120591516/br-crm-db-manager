package br.crm.pojo.branch;

import java.io.Serializable;
import java.util.Date;

public class OrganizationBranchImg implements Serializable{
    private String orgBranchImgId;

    private String orgId;

    private String orgBranchId;

    private Long dictImgId;

    private Date createTime;

    private Date editTime;

    private Integer orgBranchImgType;

    private String orgBranchImgNote;

    public String getOrgBranchImgId() {
        return orgBranchImgId;
    }

    public void setOrgBranchImgId(String orgBranchImgId) {
        this.orgBranchImgId = orgBranchImgId == null ? null : orgBranchImgId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgBranchId() {
        return orgBranchId;
    }

    public void setOrgBranchId(String orgBranchId) {
        this.orgBranchId = orgBranchId == null ? null : orgBranchId.trim();
    }

    public Long getDictImgId() {
        return dictImgId;
    }

    public void setDictImgId(Long dictImgId) {
        this.dictImgId = dictImgId;
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

    public Integer getOrgBranchImgType() {
        return orgBranchImgType;
    }

    public void setOrgBranchImgType(Integer orgBranchImgType) {
        this.orgBranchImgType = orgBranchImgType;
    }

    public String getOrgBranchImgNote() {
        return orgBranchImgNote;
    }

    public void setOrgBranchImgNote(String orgBranchImgNote) {
        this.orgBranchImgNote = orgBranchImgNote == null ? null : orgBranchImgNote.trim();
    }
}