package br.crm.pojo.suite;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamSuiteHid implements Serializable {
    private String oesHidId;

    private String examSuiteId;

    private String highIncidenceDiseaseId;

    private String oesHidNote;

    private Integer oesHidStatus;

    private Date oesHidCreateTime;

    private Date oesHidEditTime;

    public String getOesHidId() {
        return oesHidId;
    }

    public void setOesHidId(String oesHidId) {
        this.oesHidId = oesHidId == null ? null : oesHidId.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getHighIncidenceDiseaseId() {
        return highIncidenceDiseaseId;
    }

    public void setHighIncidenceDiseaseId(String highIncidenceDiseaseId) {
        this.highIncidenceDiseaseId = highIncidenceDiseaseId == null ? null : highIncidenceDiseaseId.trim();
    }

    public String getOesHidNote() {
        return oesHidNote;
    }

    public void setOesHidNote(String oesHidNote) {
        this.oesHidNote = oesHidNote == null ? null : oesHidNote.trim();
    }

    public Integer getOesHidStatus() {
        return oesHidStatus;
    }

    public void setOesHidStatus(Integer oesHidStatus) {
        this.oesHidStatus = oesHidStatus;
    }

    public Date getOesHidCreateTime() {
        return oesHidCreateTime;
    }

    public void setOesHidCreateTime(Date oesHidCreateTime) {
        this.oesHidCreateTime = oesHidCreateTime;
    }

    public Date getOesHidEditTime() {
        return oesHidEditTime;
    }

    public void setOesHidEditTime(Date oesHidEditTime) {
        this.oesHidEditTime = oesHidEditTime;
    }
}