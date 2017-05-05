package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamItemType implements Serializable{
    private String examItemTypeId;

    private String examItemTypeName;

    private String examItemTypeNameEng;

    private String examItemTypeCode;

    private String deptId;

    private String deptName;

    private String examItemTypeNote;

    private Integer examItemTypeStatus;

    private Date examItemTypeCreateTime;

    private Date examItemTypeEditTime;

    public String getExamItemTypeId() {
        return examItemTypeId;
    }

    public void setExamItemTypeId(String examItemTypeId) {
        this.examItemTypeId = examItemTypeId == null ? null : examItemTypeId.trim();
    }

    public String getExamItemTypeName() {
        return examItemTypeName;
    }

    public void setExamItemTypeName(String examItemTypeName) {
        this.examItemTypeName = examItemTypeName == null ? null : examItemTypeName.trim();
    }

    public String getExamItemTypeNameEng() {
        return examItemTypeNameEng;
    }

    public void setExamItemTypeNameEng(String examItemTypeNameEng) {
        this.examItemTypeNameEng = examItemTypeNameEng == null ? null : examItemTypeNameEng.trim();
    }

    public String getExamItemTypeCode() {
        return examItemTypeCode;
    }

    public void setExamItemTypeCode(String examItemTypeCode) {
        this.examItemTypeCode = examItemTypeCode == null ? null : examItemTypeCode.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getExamItemTypeNote() {
        return examItemTypeNote;
    }

    public void setExamItemTypeNote(String examItemTypeNote) {
        this.examItemTypeNote = examItemTypeNote == null ? null : examItemTypeNote.trim();
    }

    public Integer getExamItemTypeStatus() {
        return examItemTypeStatus;
    }

    public void setExamItemTypeStatus(Integer examItemTypeStatus) {
        this.examItemTypeStatus = examItemTypeStatus;
    }

    public Date getExamItemTypeCreateTime() {
        return examItemTypeCreateTime;
    }

    public void setExamItemTypeCreateTime(Date examItemTypeCreateTime) {
        this.examItemTypeCreateTime = examItemTypeCreateTime;
    }

    public Date getExamItemTypeEditTime() {
        return examItemTypeEditTime;
    }

    public void setExamItemTypeEditTime(Date examItemTypeEditTime) {
        this.examItemTypeEditTime = examItemTypeEditTime;
    }
}