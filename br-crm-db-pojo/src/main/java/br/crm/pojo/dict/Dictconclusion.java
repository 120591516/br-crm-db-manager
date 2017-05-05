package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusion implements Serializable{
    private String idConclusion;

    private String conclusionName;

    private String conclusionNameeng;

    private String idConclusionType;

    private String idConclusionDeptType;

    private String keyconclusiongroupid;

    private String inputCode;

    private String disporder;

    private String idConclusionresultclass;

    private Integer fMaledisease;

    private Integer fFemaledisease;

    private Integer status;

    private Date createtime;

    private Date edittime;

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

    public String getConclusionNameeng() {
        return conclusionNameeng;
    }

    public void setConclusionNameeng(String conclusionNameeng) {
        this.conclusionNameeng = conclusionNameeng == null ? null : conclusionNameeng.trim();
    }

    public String getIdConclusionType() {
        return idConclusionType;
    }

    public void setIdConclusionType(String idConclusionType) {
        this.idConclusionType = idConclusionType == null ? null : idConclusionType.trim();
    }

    public String getIdConclusionDeptType() {
        return idConclusionDeptType;
    }

    public void setIdConclusionDeptType(String idConclusionDeptType) {
        this.idConclusionDeptType = idConclusionDeptType == null ? null : idConclusionDeptType.trim();
    }

    public String getKeyconclusiongroupid() {
        return keyconclusiongroupid;
    }

    public void setKeyconclusiongroupid(String keyconclusiongroupid) {
        this.keyconclusiongroupid = keyconclusiongroupid == null ? null : keyconclusiongroupid.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getDisporder() {
        return disporder;
    }

    public void setDisporder(String disporder) {
        this.disporder = disporder == null ? null : disporder.trim();
    }

    public String getIdConclusionresultclass() {
        return idConclusionresultclass;
    }

    public void setIdConclusionresultclass(String idConclusionresultclass) {
        this.idConclusionresultclass = idConclusionresultclass == null ? null : idConclusionresultclass.trim();
    }

    public Integer getfMaledisease() {
        return fMaledisease;
    }

    public void setfMaledisease(Integer fMaledisease) {
        this.fMaledisease = fMaledisease;
    }

    public Integer getfFemaledisease() {
        return fFemaledisease;
    }

    public void setfFemaledisease(Integer fFemaledisease) {
        this.fFemaledisease = fFemaledisease;
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