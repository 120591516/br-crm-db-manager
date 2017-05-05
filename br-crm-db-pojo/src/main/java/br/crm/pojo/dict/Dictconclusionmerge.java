package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusionmerge implements Serializable{
    private String idConclusionmerge;

    private String keyconclusiongroupid;

    private String conclusionMergeName;

    private String idConclusion;

    private String conclusionName;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionmerge() {
        return idConclusionmerge;
    }

    public void setIdConclusionmerge(String idConclusionmerge) {
        this.idConclusionmerge = idConclusionmerge == null ? null : idConclusionmerge.trim();
    }

    public String getKeyconclusiongroupid() {
        return keyconclusiongroupid;
    }

    public void setKeyconclusiongroupid(String keyconclusiongroupid) {
        this.keyconclusiongroupid = keyconclusiongroupid == null ? null : keyconclusiongroupid.trim();
    }

    public String getConclusionMergeName() {
        return conclusionMergeName;
    }

    public void setConclusionMergeName(String conclusionMergeName) {
        this.conclusionMergeName = conclusionMergeName == null ? null : conclusionMergeName.trim();
    }

    public String getIdConclusion() {
        return idConclusion;
    }

    public void setIdConclusion(String idConclusion) {
        this.idConclusion = idConclusion == null ? null : idConclusion.trim();
    }

    public String getConclusionName() {
        return conclusionName;
    }

    public void setConclusionName(String conclusionName) {
        this.conclusionName = conclusionName == null ? null : conclusionName.trim();
    }

    public String getDisporder() {
        return disporder;
    }

    public void setDisporder(String disporder) {
        this.disporder = disporder == null ? null : disporder.trim();
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