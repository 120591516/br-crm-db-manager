package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusionresultclass implements Serializable{
    private String idConclusionresultclass;

    private String conclusionresultclassName;

    private String conclusionresultclassNameEng;

    private String inputCode;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionresultclass() {
        return idConclusionresultclass;
    }

    public void setIdConclusionresultclass(String idConclusionresultclass) {
        this.idConclusionresultclass = idConclusionresultclass == null ? null : idConclusionresultclass.trim();
    }

    public String getConclusionresultclassName() {
        return conclusionresultclassName;
    }

    public void setConclusionresultclassName(String conclusionresultclassName) {
        this.conclusionresultclassName = conclusionresultclassName == null ? null : conclusionresultclassName.trim();
    }

    public String getConclusionresultclassNameEng() {
        return conclusionresultclassNameEng;
    }

    public void setConclusionresultclassNameEng(String conclusionresultclassNameEng) {
        this.conclusionresultclassNameEng = conclusionresultclassNameEng == null ? null : conclusionresultclassNameEng.trim();
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