package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class DictExamItemValue implements Serializable {
    private String examItemValueId;

    private String examItemId;

    private String examItemValueName;

    private String examItemValueCode;

    private String examItemValueInputCode;

    private Integer examItemValueServerDegree;

    private Integer examItemValueAskscore;

    private Long dictConclusionId;

    private String examItemValueOper;

    private Float examItemValueOperandMale;

    private Float examItemValueOperandFemale;

    private Integer examItemValueDispOrder;

    private String examItemValueText;

    private Integer examItemValueStatus;

    private Date examItemValueCreateTime;

    private Date examItemValueEditTime;

    public String getExamItemValueId() {
        return examItemValueId;
    }

    public void setExamItemValueId(String examItemValueId) {
        this.examItemValueId = examItemValueId == null ? null : examItemValueId.trim();
    }

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getExamItemValueName() {
        return examItemValueName;
    }

    public void setExamItemValueName(String examItemValueName) {
        this.examItemValueName = examItemValueName == null ? null : examItemValueName.trim();
    }

    public String getExamItemValueCode() {
        return examItemValueCode;
    }

    public void setExamItemValueCode(String examItemValueCode) {
        this.examItemValueCode = examItemValueCode == null ? null : examItemValueCode.trim();
    }

    public String getExamItemValueInputCode() {
        return examItemValueInputCode;
    }

    public void setExamItemValueInputCode(String examItemValueInputCode) {
        this.examItemValueInputCode = examItemValueInputCode == null ? null : examItemValueInputCode.trim();
    }

    public Integer getExamItemValueServerDegree() {
        return examItemValueServerDegree;
    }

    public void setExamItemValueServerDegree(Integer examItemValueServerDegree) {
        this.examItemValueServerDegree = examItemValueServerDegree;
    }

    public Integer getExamItemValueAskscore() {
        return examItemValueAskscore;
    }

    public void setExamItemValueAskscore(Integer examItemValueAskscore) {
        this.examItemValueAskscore = examItemValueAskscore;
    }

    public Long getDictConclusionId() {
        return dictConclusionId;
    }

    public void setDictConclusionId(Long dictConclusionId) {
        this.dictConclusionId = dictConclusionId;
    }

    public String getExamItemValueOper() {
        return examItemValueOper;
    }

    public void setExamItemValueOper(String examItemValueOper) {
        this.examItemValueOper = examItemValueOper == null ? null : examItemValueOper.trim();
    }

    public Float getExamItemValueOperandMale() {
        return examItemValueOperandMale;
    }

    public void setExamItemValueOperandMale(Float examItemValueOperandMale) {
        this.examItemValueOperandMale = examItemValueOperandMale;
    }

    public Float getExamItemValueOperandFemale() {
        return examItemValueOperandFemale;
    }

    public void setExamItemValueOperandFemale(Float examItemValueOperandFemale) {
        this.examItemValueOperandFemale = examItemValueOperandFemale;
    }

    public Integer getExamItemValueDispOrder() {
        return examItemValueDispOrder;
    }

    public void setExamItemValueDispOrder(Integer examItemValueDispOrder) {
        this.examItemValueDispOrder = examItemValueDispOrder;
    }

    public String getExamItemValueText() {
        return examItemValueText;
    }

    public void setExamItemValueText(String examItemValueText) {
        this.examItemValueText = examItemValueText == null ? null : examItemValueText.trim();
    }

    public Integer getExamItemValueStatus() {
        return examItemValueStatus;
    }

    public void setExamItemValueStatus(Integer examItemValueStatus) {
        this.examItemValueStatus = examItemValueStatus;
    }

    public Date getExamItemValueCreateTime() {
        return examItemValueCreateTime;
    }

    public void setExamItemValueCreateTime(Date examItemValueCreateTime) {
        this.examItemValueCreateTime = examItemValueCreateTime;
    }

    public Date getExamItemValueEditTime() {
        return examItemValueEditTime;
    }

    public void setExamItemValueEditTime(Date examItemValueEditTime) {
        this.examItemValueEditTime = examItemValueEditTime;
    }
}