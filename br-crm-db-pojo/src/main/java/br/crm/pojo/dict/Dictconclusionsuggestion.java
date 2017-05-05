package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusionsuggestion implements Serializable{
    private String idConclusionsuggestion;

    private String idConclusion;

    private String inputCode;

    private String disporder;

    private String conclusionsuggestionText;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionsuggestion() {
        return idConclusionsuggestion;
    }

    public void setIdConclusionsuggestion(String idConclusionsuggestion) {
        this.idConclusionsuggestion = idConclusionsuggestion == null ? null : idConclusionsuggestion.trim();
    }

    public String getIdConclusion() {
        return idConclusion;
    }

    public void setIdConclusion(String idConclusion) {
        this.idConclusion = idConclusion == null ? null : idConclusion.trim();
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

    public String getConclusionsuggestionText() {
        return conclusionsuggestionText;
    }

    public void setConclusionsuggestionText(String conclusionsuggestionText) {
        this.conclusionsuggestionText = conclusionsuggestionText == null ? null : conclusionsuggestionText.trim();
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