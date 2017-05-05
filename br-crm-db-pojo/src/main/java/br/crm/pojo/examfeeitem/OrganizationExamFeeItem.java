package br.crm.pojo.examfeeitem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date; 
public class OrganizationExamFeeItem implements Serializable{
    private String id;

    private String orgId;

    private String organizationBranchId;

    private String departmentId;

    private String departmentName;

    private String examFeeItemName;

    private String examFeeItemNameAbr;

    private String examFeeItemNameEng;

    private String examFeeItemNameEngAbr;

    private String examFeeItemCode;

    private String examFeeItemFeeCode;

    private String examFeeItemHisName;

    private BigDecimal examFeeItemUnitPrice;

    private BigDecimal examFeeItemSuitePrice;

    private BigDecimal examFeeItemMaterialPrice;

    private BigDecimal examFeeItemCostPrice;

    private BigDecimal examFeeItemCoopPrice;

    private String coopOrgId;

    private String examDetail;

    private Integer fMale;

    private Integer fFemale;

    private Integer fAlert;

    private String warningMsg;

    private Integer breakfastOrder;

    private Integer dispOrder;

    private String note;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrganizationBranchId() {
        return organizationBranchId;
    }

    public void setOrganizationBranchId(String organizationBranchId) {
        this.organizationBranchId = organizationBranchId == null ? null : organizationBranchId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getExamFeeItemName() {
        return examFeeItemName;
    }

    public void setExamFeeItemName(String examFeeItemName) {
        this.examFeeItemName = examFeeItemName == null ? null : examFeeItemName.trim();
    }

    public String getExamFeeItemNameAbr() {
        return examFeeItemNameAbr;
    }

    public void setExamFeeItemNameAbr(String examFeeItemNameAbr) {
        this.examFeeItemNameAbr = examFeeItemNameAbr == null ? null : examFeeItemNameAbr.trim();
    }

    public String getExamFeeItemNameEng() {
        return examFeeItemNameEng;
    }

    public void setExamFeeItemNameEng(String examFeeItemNameEng) {
        this.examFeeItemNameEng = examFeeItemNameEng == null ? null : examFeeItemNameEng.trim();
    }

    public String getExamFeeItemNameEngAbr() {
        return examFeeItemNameEngAbr;
    }

    public void setExamFeeItemNameEngAbr(String examFeeItemNameEngAbr) {
        this.examFeeItemNameEngAbr = examFeeItemNameEngAbr == null ? null : examFeeItemNameEngAbr.trim();
    }

    public String getExamFeeItemCode() {
        return examFeeItemCode;
    }

    public void setExamFeeItemCode(String examFeeItemCode) {
        this.examFeeItemCode = examFeeItemCode == null ? null : examFeeItemCode.trim();
    }

    public String getExamFeeItemFeeCode() {
        return examFeeItemFeeCode;
    }

    public void setExamFeeItemFeeCode(String examFeeItemFeeCode) {
        this.examFeeItemFeeCode = examFeeItemFeeCode == null ? null : examFeeItemFeeCode.trim();
    }

    public String getExamFeeItemHisName() {
        return examFeeItemHisName;
    }

    public void setExamFeeItemHisName(String examFeeItemHisName) {
        this.examFeeItemHisName = examFeeItemHisName == null ? null : examFeeItemHisName.trim();
    }

    public BigDecimal getExamFeeItemUnitPrice() {
        return examFeeItemUnitPrice;
    }

    public void setExamFeeItemUnitPrice(BigDecimal examFeeItemUnitPrice) {
        this.examFeeItemUnitPrice = examFeeItemUnitPrice;
    }

    public BigDecimal getExamFeeItemSuitePrice() {
        return examFeeItemSuitePrice;
    }

    public void setExamFeeItemSuitePrice(BigDecimal examFeeItemSuitePrice) {
        this.examFeeItemSuitePrice = examFeeItemSuitePrice;
    }

    public BigDecimal getExamFeeItemMaterialPrice() {
        return examFeeItemMaterialPrice;
    }

    public void setExamFeeItemMaterialPrice(BigDecimal examFeeItemMaterialPrice) {
        this.examFeeItemMaterialPrice = examFeeItemMaterialPrice;
    }

    public BigDecimal getExamFeeItemCostPrice() {
        return examFeeItemCostPrice;
    }

    public void setExamFeeItemCostPrice(BigDecimal examFeeItemCostPrice) {
        this.examFeeItemCostPrice = examFeeItemCostPrice;
    }

    public BigDecimal getExamFeeItemCoopPrice() {
        return examFeeItemCoopPrice;
    }

    public void setExamFeeItemCoopPrice(BigDecimal examFeeItemCoopPrice) {
        this.examFeeItemCoopPrice = examFeeItemCoopPrice;
    }

    public String getCoopOrgId() {
        return coopOrgId;
    }

    public void setCoopOrgId(String coopOrgId) {
        this.coopOrgId = coopOrgId == null ? null : coopOrgId.trim();
    }

    public String getExamDetail() {
        return examDetail;
    }

    public void setExamDetail(String examDetail) {
        this.examDetail = examDetail == null ? null : examDetail.trim();
    }

    public Integer getfMale() {
        return fMale;
    }

    public void setfMale(Integer fMale) {
        this.fMale = fMale;
    }

    public Integer getfFemale() {
        return fFemale;
    }

    public void setfFemale(Integer fFemale) {
        this.fFemale = fFemale;
    }

    public Integer getfAlert() {
        return fAlert;
    }

    public void setfAlert(Integer fAlert) {
        this.fAlert = fAlert;
    }

    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg == null ? null : warningMsg.trim();
    }

    public Integer getBreakfastOrder() {
        return breakfastOrder;
    }

    public void setBreakfastOrder(Integer breakfastOrder) {
        this.breakfastOrder = breakfastOrder;
    }

    public Integer getDispOrder() {
        return dispOrder;
    }

    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}