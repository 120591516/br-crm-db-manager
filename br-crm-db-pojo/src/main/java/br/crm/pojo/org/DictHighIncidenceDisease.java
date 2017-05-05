package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class DictHighIncidenceDisease implements Serializable {
    private String highIncidenceDiseaseId;

    private String highIncidenceDiseaseName;

    private String highIncidenceDiseaseNameEng;

    private String highIncidenceDiseaseCode;

    private Integer highIncidenceDiseaseStatus;

    private String highIncidenceDiseaseNote;

    private Date highIncidenceDiseaseCreateTime;

    private Date highIncidenceDiseaseEditTime;

    public String getHighIncidenceDiseaseId() {
        return highIncidenceDiseaseId;
    }

    public void setHighIncidenceDiseaseId(String highIncidenceDiseaseId) {
        this.highIncidenceDiseaseId = highIncidenceDiseaseId == null ? null : highIncidenceDiseaseId.trim();
    }

    public String getHighIncidenceDiseaseName() {
        return highIncidenceDiseaseName;
    }

    public void setHighIncidenceDiseaseName(String highIncidenceDiseaseName) {
        this.highIncidenceDiseaseName = highIncidenceDiseaseName == null ? null : highIncidenceDiseaseName.trim();
    }

    public String getHighIncidenceDiseaseNameEng() {
        return highIncidenceDiseaseNameEng;
    }

    public void setHighIncidenceDiseaseNameEng(String highIncidenceDiseaseNameEng) {
        this.highIncidenceDiseaseNameEng = highIncidenceDiseaseNameEng == null ? null : highIncidenceDiseaseNameEng.trim();
    }

    public String getHighIncidenceDiseaseCode() {
        return highIncidenceDiseaseCode;
    }

    public void setHighIncidenceDiseaseCode(String highIncidenceDiseaseCode) {
        this.highIncidenceDiseaseCode = highIncidenceDiseaseCode == null ? null : highIncidenceDiseaseCode.trim();
    }

    public Integer getHighIncidenceDiseaseStatus() {
        return highIncidenceDiseaseStatus;
    }

    public void setHighIncidenceDiseaseStatus(Integer highIncidenceDiseaseStatus) {
        this.highIncidenceDiseaseStatus = highIncidenceDiseaseStatus;
    }

    public String getHighIncidenceDiseaseNote() {
        return highIncidenceDiseaseNote;
    }

    public void setHighIncidenceDiseaseNote(String highIncidenceDiseaseNote) {
        this.highIncidenceDiseaseNote = highIncidenceDiseaseNote == null ? null : highIncidenceDiseaseNote.trim();
    }

    public Date getHighIncidenceDiseaseCreateTime() {
        return highIncidenceDiseaseCreateTime;
    }

    public void setHighIncidenceDiseaseCreateTime(Date highIncidenceDiseaseCreateTime) {
        this.highIncidenceDiseaseCreateTime = highIncidenceDiseaseCreateTime;
    }

    public Date getHighIncidenceDiseaseEditTime() {
        return highIncidenceDiseaseEditTime;
    }

    public void setHighIncidenceDiseaseEditTime(Date highIncidenceDiseaseEditTime) {
        this.highIncidenceDiseaseEditTime = highIncidenceDiseaseEditTime;
    }
}