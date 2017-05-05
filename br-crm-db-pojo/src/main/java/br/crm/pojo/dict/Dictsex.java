package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictsex implements Serializable {
    private Integer idSex;

    private String sexName;

    private String sexCode;

    private String sexcodex;

    private Integer sextype;

    private String inputCode;

    private String note;

    private Date sexCreatetime;

    private Date sexUpdatetime;

    private Integer sexStatus;

    public Integer getIdSex() {
        return idSex;
    }

    public void setIdSex(Integer idSex) {
        this.idSex = idSex;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSexcodex() {
        return sexcodex;
    }

    public void setSexcodex(String sexcodex) {
        this.sexcodex = sexcodex == null ? null : sexcodex.trim();
    }

    public Integer getSextype() {
        return sextype;
    }

    public void setSextype(Integer sextype) {
        this.sextype = sextype;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getSexCreatetime() {
        return sexCreatetime;
    }

    public void setSexCreatetime(Date sexCreatetime) {
        this.sexCreatetime = sexCreatetime;
    }

    public Date getSexUpdatetime() {
        return sexUpdatetime;
    }

    public void setSexUpdatetime(Date sexUpdatetime) {
        this.sexUpdatetime = sexUpdatetime;
    }

    public Integer getSexStatus() {
        return sexStatus;
    }

    public void setSexStatus(Integer sexStatus) {
        this.sexStatus = sexStatus;
    }
}