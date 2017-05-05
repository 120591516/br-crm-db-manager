package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *总检科室
 */
public class Dictsection implements Serializable{
    private Integer idSection;

    private String sectionName;

    private String sectionCode;

    private String sectionType;

    private String inputCode;

    private String disporder;

    private String note;

    private String sectioncodex;

    private Date sectionCreatetime;

    private Date sectionUpdatetime;

    private Integer sectionStatus;

    public Integer getIdSection() {
        return idSection;
    }

    public void setIdSection(Integer idSection) {
        this.idSection = idSection;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode == null ? null : sectionCode.trim();
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType == null ? null : sectionType.trim();
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getSectioncodex() {
        return sectioncodex;
    }

    public void setSectioncodex(String sectioncodex) {
        this.sectioncodex = sectioncodex == null ? null : sectioncodex.trim();
    }

    public Date getSectionCreatetime() {
        return sectionCreatetime;
    }

    public void setSectionCreatetime(Date sectionCreatetime) {
        this.sectionCreatetime = sectionCreatetime;
    }

    public Date getSectionUpdatetime() {
        return sectionUpdatetime;
    }

    public void setSectionUpdatetime(Date sectionUpdatetime) {
        this.sectionUpdatetime = sectionUpdatetime;
    }

    public Integer getSectionStatus() {
        return sectionStatus;
    }

    public void setSectionStatus(Integer sectionStatus) {
        this.sectionStatus = sectionStatus;
    }
}