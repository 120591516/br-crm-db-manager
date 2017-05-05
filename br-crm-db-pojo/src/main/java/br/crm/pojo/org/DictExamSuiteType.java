package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class DictExamSuiteType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String examTypeId;

    private String examTypeName;

    private String examTypeNameEng;

    private String examTypeCode;

    private String examTypeNote;

    private Integer examTypeStatus;

    private Date examTypeCreateTime;

    private Date examTypeEditTime;

    public String getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(String examTypeId) {
        this.examTypeId = examTypeId == null ? null : examTypeId.trim();
    }

    public String getExamTypeName() {
        return examTypeName;
    }

    public void setExamTypeName(String examTypeName) {
        this.examTypeName = examTypeName == null ? null : examTypeName.trim();
    }

    public String getExamTypeNameEng() {
        return examTypeNameEng;
    }

    public void setExamTypeNameEng(String examTypeNameEng) {
        this.examTypeNameEng = examTypeNameEng == null ? null : examTypeNameEng.trim();
    }

    public String getExamTypeCode() {
        return examTypeCode;
    }

    public void setExamTypeCode(String examTypeCode) {
        this.examTypeCode = examTypeCode == null ? null : examTypeCode.trim();
    }

    public String getExamTypeNote() {
        return examTypeNote;
    }

    public void setExamTypeNote(String examTypeNote) {
        this.examTypeNote = examTypeNote == null ? null : examTypeNote.trim();
    }

    public Integer getExamTypeStatus() {
        return examTypeStatus;
    }

    public void setExamTypeStatus(Integer examTypeStatus) {
        this.examTypeStatus = examTypeStatus;
    }

    public Date getExamTypeCreateTime() {
        return examTypeCreateTime;
    }

    public void setExamTypeCreateTime(Date examTypeCreateTime) {
        this.examTypeCreateTime = examTypeCreateTime;
    }

    public Date getExamTypeEditTime() {
        return examTypeEditTime;
    }

    public void setExamTypeEditTime(Date examTypeEditTime) {
        this.examTypeEditTime = examTypeEditTime;
    }
}