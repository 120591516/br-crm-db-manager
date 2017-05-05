package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *婚姻
 */
public class Dictmarriage implements Serializable {
    private Integer idMarriage;

    private String marriageName;

    private String marriageCode;

    private String inputCode;

    private String note;

    private String marriagecodex;

    private Boolean fHasmarried;

    private Date marriageCreatetime;

    private Date marriageUpdatetime;

    private Integer marriageStatus;

    public Integer getIdMarriage() {
        return idMarriage;
    }

    public void setIdMarriage(Integer idMarriage) {
        this.idMarriage = idMarriage;
    }

    public String getMarriageName() {
        return marriageName;
    }

    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
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

    public String getMarriagecodex() {
        return marriagecodex;
    }

    public void setMarriagecodex(String marriagecodex) {
        this.marriagecodex = marriagecodex == null ? null : marriagecodex.trim();
    }

    public Boolean getfHasmarried() {
        return fHasmarried;
    }

    public void setfHasmarried(Boolean fHasmarried) {
        this.fHasmarried = fHasmarried;
    }

    public Date getMarriageCreatetime() {
        return marriageCreatetime;
    }

    public void setMarriageCreatetime(Date marriageCreatetime) {
        this.marriageCreatetime = marriageCreatetime;
    }

    public Date getMarriageUpdatetime() {
        return marriageUpdatetime;
    }

    public void setMarriageUpdatetime(Date marriageUpdatetime) {
        this.marriageUpdatetime = marriageUpdatetime;
    }

    public Integer getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(Integer marriageStatus) {
        this.marriageStatus = marriageStatus;
    }
}