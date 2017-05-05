package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusionspecialist implements Serializable{
    private String idConclusionspecialist;

    private String keyconclusionspecialist;

    private String idConclusion;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionspecialist() {
        return idConclusionspecialist;
    }

    public void setIdConclusionspecialist(String idConclusionspecialist) {
        this.idConclusionspecialist = idConclusionspecialist == null ? null : idConclusionspecialist.trim();
    }

    public String getKeyconclusionspecialist() {
        return keyconclusionspecialist;
    }

    public void setKeyconclusionspecialist(String keyconclusionspecialist) {
        this.keyconclusionspecialist = keyconclusionspecialist == null ? null : keyconclusionspecialist.trim();
    }

    public String getIdConclusion() {
        return idConclusion;
    }

    public void setIdConclusion(String idConclusion) {
        this.idConclusion = idConclusion == null ? null : idConclusion.trim();
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