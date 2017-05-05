package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictconclusiongroup implements Serializable{
    private String keyconclusiongroupid;

    private String conclusiongroupName;

    private String keyconclusiongroupNameEng;

    private String inputCode;

    private String disporder;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getKeyconclusiongroupid() {
        return keyconclusiongroupid;
    }

    public void setKeyconclusiongroupid(String keyconclusiongroupid) {
        this.keyconclusiongroupid = keyconclusiongroupid == null ? null : keyconclusiongroupid.trim();
    }

    public String getConclusiongroupName() {
        return conclusiongroupName;
    }

    public void setConclusiongroupName(String conclusiongroupName) {
        this.conclusiongroupName = conclusiongroupName == null ? null : conclusiongroupName.trim();
    }

    public String getKeyconclusiongroupNameEng() {
        return keyconclusiongroupNameEng;
    }

    public void setKeyconclusiongroupNameEng(String keyconclusiongroupNameEng) {
        this.keyconclusiongroupNameEng = keyconclusiongroupNameEng == null ? null : keyconclusiongroupNameEng.trim();
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