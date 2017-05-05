package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamItem implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String examItemId;

    private String examItemName;

    private String examItemNameAbr;

    private String examItemNamePrn;

    private String examItemNameEng;

    private String examItemNameEngAbr;

    private String examItemCode;

    private String examItemTypeId;

    private String examItemValueType;

    private String examItemValueUnit;

    private Integer examItemConclusionLevel;

    private String examItemConclusionTitle;

    private Float examItemIncrement;

    private Integer examItemNumPrecision;

    private Integer fUseAppMaxMin;

    private Integer fIncludeMin;

    private Integer fIncludeMax;

    private Integer fMale;

    private String maleValueDef;

    private Float maleValueMin;

    private Float maleValueMax;

    private Float maleValueSeverUp;

    private Float maleValueServerDown;

    private Integer fFemale;

    private String femaleValueDef;

    private Float femaleValueMin;

    private Float femaleValueMax;

    private Float femaleValueServerUp;

    private Float femaleValueServerDown;

    private String examItemNote;

    private Integer examItemDispOrder;

    private Integer examItemCreatePlat;

    private String examItemCreaterId;

    private Integer examItemStatus;

    private Date examItemCreateTime;

    private Date examItemEditTime;

    private String examItemExpression;

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName == null ? null : examItemName.trim();
    }

    public String getExamItemNameAbr() {
        return examItemNameAbr;
    }

    public void setExamItemNameAbr(String examItemNameAbr) {
        this.examItemNameAbr = examItemNameAbr == null ? null : examItemNameAbr.trim();
    }

    public String getExamItemNamePrn() {
        return examItemNamePrn;
    }

    public void setExamItemNamePrn(String examItemNamePrn) {
        this.examItemNamePrn = examItemNamePrn == null ? null : examItemNamePrn.trim();
    }

    public String getExamItemNameEng() {
        return examItemNameEng;
    }

    public void setExamItemNameEng(String examItemNameEng) {
        this.examItemNameEng = examItemNameEng == null ? null : examItemNameEng.trim();
    }

    public String getExamItemNameEngAbr() {
        return examItemNameEngAbr;
    }

    public void setExamItemNameEngAbr(String examItemNameEngAbr) {
        this.examItemNameEngAbr = examItemNameEngAbr == null ? null : examItemNameEngAbr.trim();
    }

    public String getExamItemCode() {
        return examItemCode;
    }

    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode == null ? null : examItemCode.trim();
    }

    public String getExamItemTypeId() {
        return examItemTypeId;
    }

    public void setExamItemTypeId(String examItemTypeId) {
        this.examItemTypeId = examItemTypeId == null ? null : examItemTypeId.trim();
    }

    public String getExamItemValueType() {
        return examItemValueType;
    }

    public void setExamItemValueType(String examItemValueType) {
        this.examItemValueType = examItemValueType == null ? null : examItemValueType.trim();
    }

    public String getExamItemValueUnit() {
        return examItemValueUnit;
    }

    public void setExamItemValueUnit(String examItemValueUnit) {
        this.examItemValueUnit = examItemValueUnit == null ? null : examItemValueUnit.trim();
    }

    public Integer getExamItemConclusionLevel() {
        return examItemConclusionLevel;
    }

    public void setExamItemConclusionLevel(Integer examItemConclusionLevel) {
        this.examItemConclusionLevel = examItemConclusionLevel;
    }

    public String getExamItemConclusionTitle() {
        return examItemConclusionTitle;
    }

    public void setExamItemConclusionTitle(String examItemConclusionTitle) {
        this.examItemConclusionTitle = examItemConclusionTitle == null ? null : examItemConclusionTitle.trim();
    }

    public Float getExamItemIncrement() {
        return examItemIncrement;
    }

    public void setExamItemIncrement(Float examItemIncrement) {
        this.examItemIncrement = examItemIncrement;
    }

    public Integer getExamItemNumPrecision() {
        return examItemNumPrecision;
    }

    public void setExamItemNumPrecision(Integer examItemNumPrecision) {
        this.examItemNumPrecision = examItemNumPrecision;
    }

    public Integer getfUseAppMaxMin() {
        return fUseAppMaxMin;
    }

    public void setfUseAppMaxMin(Integer fUseAppMaxMin) {
        this.fUseAppMaxMin = fUseAppMaxMin;
    }

    public Integer getfIncludeMin() {
        return fIncludeMin;
    }

    public void setfIncludeMin(Integer fIncludeMin) {
        this.fIncludeMin = fIncludeMin;
    }

    public Integer getfIncludeMax() {
        return fIncludeMax;
    }

    public void setfIncludeMax(Integer fIncludeMax) {
        this.fIncludeMax = fIncludeMax;
    }

    public Integer getfMale() {
        return fMale;
    }

    public void setfMale(Integer fMale) {
        this.fMale = fMale;
    }

    public String getMaleValueDef() {
        return maleValueDef;
    }

    public void setMaleValueDef(String maleValueDef) {
        this.maleValueDef = maleValueDef == null ? null : maleValueDef.trim();
    }

    public Float getMaleValueMin() {
        return maleValueMin;
    }

    public void setMaleValueMin(Float maleValueMin) {
        this.maleValueMin = maleValueMin;
    }

    public Float getMaleValueMax() {
        return maleValueMax;
    }

    public void setMaleValueMax(Float maleValueMax) {
        this.maleValueMax = maleValueMax;
    }

    public Float getMaleValueSeverUp() {
        return maleValueSeverUp;
    }

    public void setMaleValueSeverUp(Float maleValueSeverUp) {
        this.maleValueSeverUp = maleValueSeverUp;
    }

    public Float getMaleValueServerDown() {
        return maleValueServerDown;
    }

    public void setMaleValueServerDown(Float maleValueServerDown) {
        this.maleValueServerDown = maleValueServerDown;
    }

    public Integer getfFemale() {
        return fFemale;
    }

    public void setfFemale(Integer fFemale) {
        this.fFemale = fFemale;
    }

    public String getFemaleValueDef() {
        return femaleValueDef;
    }

    public void setFemaleValueDef(String femaleValueDef) {
        this.femaleValueDef = femaleValueDef == null ? null : femaleValueDef.trim();
    }

    public Float getFemaleValueMin() {
        return femaleValueMin;
    }

    public void setFemaleValueMin(Float femaleValueMin) {
        this.femaleValueMin = femaleValueMin;
    }

    public Float getFemaleValueMax() {
        return femaleValueMax;
    }

    public void setFemaleValueMax(Float femaleValueMax) {
        this.femaleValueMax = femaleValueMax;
    }

    public Float getFemaleValueServerUp() {
        return femaleValueServerUp;
    }

    public void setFemaleValueServerUp(Float femaleValueServerUp) {
        this.femaleValueServerUp = femaleValueServerUp;
    }

    public Float getFemaleValueServerDown() {
        return femaleValueServerDown;
    }

    public void setFemaleValueServerDown(Float femaleValueServerDown) {
        this.femaleValueServerDown = femaleValueServerDown;
    }

    public String getExamItemNote() {
        return examItemNote;
    }

    public void setExamItemNote(String examItemNote) {
        this.examItemNote = examItemNote == null ? null : examItemNote.trim();
    }

    public Integer getExamItemDispOrder() {
        return examItemDispOrder;
    }

    public void setExamItemDispOrder(Integer examItemDispOrder) {
        this.examItemDispOrder = examItemDispOrder;
    }

    public Integer getExamItemCreatePlat() {
        return examItemCreatePlat;
    }

    public void setExamItemCreatePlat(Integer examItemCreatePlat) {
        this.examItemCreatePlat = examItemCreatePlat;
    }

    public String getExamItemCreaterId() {
        return examItemCreaterId;
    }

    public void setExamItemCreaterId(String examItemCreaterId) {
        this.examItemCreaterId = examItemCreaterId == null ? null : examItemCreaterId.trim();
    }

    public Integer getExamItemStatus() {
        return examItemStatus;
    }

    public void setExamItemStatus(Integer examItemStatus) {
        this.examItemStatus = examItemStatus;
    }

    public Date getExamItemCreateTime() {
        return examItemCreateTime;
    }

    public void setExamItemCreateTime(Date examItemCreateTime) {
        this.examItemCreateTime = examItemCreateTime;
    }

    public Date getExamItemEditTime() {
        return examItemEditTime;
    }

    public void setExamItemEditTime(Date examItemEditTime) {
        this.examItemEditTime = examItemEditTime;
    }

    public String getExamItemExpression() {
        return examItemExpression;
    }

    public void setExamItemExpression(String examItemExpression) {
        this.examItemExpression = examItemExpression == null ? null : examItemExpression.trim();
    }
}