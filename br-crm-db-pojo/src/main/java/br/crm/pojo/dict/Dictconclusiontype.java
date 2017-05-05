package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusiontype implements Serializable{
    private String idConclusionType;

    private String conclusionTypeName;

    private String conclusionTypeNameEng;

    private String inputCode;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionType() {
        return idConclusionType;
    }

    public void setIdConclusionType(String idConclusionType) {
        this.idConclusionType = idConclusionType == null ? null : idConclusionType.trim();
    }

    public String getConclusionTypeName() {
        return conclusionTypeName;
    }

    public void setConclusionTypeName(String conclusionTypeName) {
        this.conclusionTypeName = conclusionTypeName == null ? null : conclusionTypeName.trim();
    }

    public String getConclusionTypeNameEng() {
        return conclusionTypeNameEng;
    }

    public void setConclusionTypeNameEng(String conclusionTypeNameEng) {
        this.conclusionTypeNameEng = conclusionTypeNameEng == null ? null : conclusionTypeNameEng.trim();
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