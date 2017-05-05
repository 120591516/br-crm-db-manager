package br.crm.pojo.suite;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamSuiteType implements Serializable {
    private String examSuiteTypeId;

    private String examSuiteId;

    private String examTypeId;

    private String examSuiteTypeNote;

    private Integer examSuiteTypeStatus;

    private Date examSuiteTypeCreateTime;

    private Date examSuiteTypeEditTime;

    public String getExamSuiteTypeId() {
        return examSuiteTypeId;
    }

    public void setExamSuiteTypeId(String examSuiteTypeId) {
        this.examSuiteTypeId = examSuiteTypeId == null ? null : examSuiteTypeId.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(String examTypeId) {
        this.examTypeId = examTypeId == null ? null : examTypeId.trim();
    }

    public String getExamSuiteTypeNote() {
        return examSuiteTypeNote;
    }

    public void setExamSuiteTypeNote(String examSuiteTypeNote) {
        this.examSuiteTypeNote = examSuiteTypeNote == null ? null : examSuiteTypeNote.trim();
    }

    public Integer getExamSuiteTypeStatus() {
        return examSuiteTypeStatus;
    }

    public void setExamSuiteTypeStatus(Integer examSuiteTypeStatus) {
        this.examSuiteTypeStatus = examSuiteTypeStatus;
    }

    public Date getExamSuiteTypeCreateTime() {
        return examSuiteTypeCreateTime;
    }

    public void setExamSuiteTypeCreateTime(Date examSuiteTypeCreateTime) {
        this.examSuiteTypeCreateTime = examSuiteTypeCreateTime;
    }

    public Date getExamSuiteTypeEditTime() {
        return examSuiteTypeEditTime;
    }

    public void setExamSuiteTypeEditTime(Date examSuiteTypeEditTime) {
        this.examSuiteTypeEditTime = examSuiteTypeEditTime;
    }
}