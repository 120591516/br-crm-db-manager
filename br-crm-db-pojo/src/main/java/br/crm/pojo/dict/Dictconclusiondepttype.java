package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusiondepttype implements Serializable{
    private String idConclusionDeptType;

    private String conclusionTypeDeptName;

    private String conclusionTypeDeptNameEng;

    private String inputCode;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getIdConclusionDeptType() {
        return idConclusionDeptType;
    }

    public void setIdConclusionDeptType(String idConclusionDeptType) {
        this.idConclusionDeptType = idConclusionDeptType == null ? null : idConclusionDeptType.trim();
    }

    public String getConclusionTypeDeptName() {
        return conclusionTypeDeptName;
    }

    public void setConclusionTypeDeptName(String conclusionTypeDeptName) {
        this.conclusionTypeDeptName = conclusionTypeDeptName == null ? null : conclusionTypeDeptName.trim();
    }

    public String getConclusionTypeDeptNameEng() {
        return conclusionTypeDeptNameEng;
    }

    public void setConclusionTypeDeptNameEng(String conclusionTypeDeptNameEng) {
        this.conclusionTypeDeptNameEng = conclusionTypeDeptNameEng == null ? null : conclusionTypeDeptNameEng.trim();
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