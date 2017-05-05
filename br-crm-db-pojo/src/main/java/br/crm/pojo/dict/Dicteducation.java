package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *教育
 */
public class Dicteducation implements Serializable{
    private Integer idEducation;

    private String keyeducation;

    private String educationName;

    private String educationCode;

    private String inputCode;

    private String note;

    private String educationcodex;

    private Date educationCreatetime;

    private Date educationUpdatetime;

    private Integer educationStatus;

    public Integer getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Integer idEducation) {
        this.idEducation = idEducation;
    }

    public String getKeyeducation() {
        return keyeducation;
    }

    public void setKeyeducation(String keyeducation) {
        this.keyeducation = keyeducation == null ? null : keyeducation.trim();
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode == null ? null : educationCode.trim();
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

    public String getEducationcodex() {
        return educationcodex;
    }

    public void setEducationcodex(String educationcodex) {
        this.educationcodex = educationcodex == null ? null : educationcodex.trim();
    }

    public Date getEducationCreatetime() {
        return educationCreatetime;
    }

    public void setEducationCreatetime(Date educationCreatetime) {
        this.educationCreatetime = educationCreatetime;
    }

    public Date getEducationUpdatetime() {
        return educationUpdatetime;
    }

    public void setEducationUpdatetime(Date educationUpdatetime) {
        this.educationUpdatetime = educationUpdatetime;
    }

    public Integer getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(Integer educationStatus) {
        this.educationStatus = educationStatus;
    }
}