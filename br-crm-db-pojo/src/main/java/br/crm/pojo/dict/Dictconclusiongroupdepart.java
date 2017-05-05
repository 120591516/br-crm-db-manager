package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusiongroupdepart implements Serializable{
    private String idConclusiongroupdepart;

    private String keyconclusiongroupid;

    private String orgDeptId;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusiongroupdepart() {
        return idConclusiongroupdepart;
    }

    public void setIdConclusiongroupdepart(String idConclusiongroupdepart) {
        this.idConclusiongroupdepart = idConclusiongroupdepart == null ? null : idConclusiongroupdepart.trim();
    }

    public String getKeyconclusiongroupid() {
        return keyconclusiongroupid;
    }

    public void setKeyconclusiongroupid(String keyconclusiongroupid) {
        this.keyconclusiongroupid = keyconclusiongroupid == null ? null : keyconclusiongroupid.trim();
    }

    public String getOrgDeptId() {
        return orgDeptId;
    }

    public void setOrgDeptId(String orgDeptId) {
        this.orgDeptId = orgDeptId == null ? null : orgDeptId.trim();
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