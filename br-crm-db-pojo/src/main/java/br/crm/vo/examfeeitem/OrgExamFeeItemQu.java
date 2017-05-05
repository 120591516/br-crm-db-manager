package br.crm.vo.examfeeitem;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrgExamFeeItemQu implements Serializable{
    private String examFeeItemName;
    private String examFeeItemNameEng;
    private String departmentId;
    private BigDecimal examFeeItemUnitPriceStart;
    private BigDecimal examFeeItemUnitPriceEnd;
    private Integer sex;
    private String orgId;
    
    public String getExamFeeItemName() {
        return examFeeItemName;
    }
    public void setExamFeeItemName(String examFeeItemName) {
        this.examFeeItemName = examFeeItemName;
    }
    public String getExamFeeItemNameEng() {
        return examFeeItemNameEng;
    }
    public void setExamFeeItemNameEng(String examFeeItemNameEng) {
        this.examFeeItemNameEng = examFeeItemNameEng;
    }
     
    public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public BigDecimal getExamFeeItemUnitPriceStart() {
        return examFeeItemUnitPriceStart;
    }
    public void setExamFeeItemUnitPriceStart(BigDecimal examFeeItemUnitPriceStart) {
        this.examFeeItemUnitPriceStart = examFeeItemUnitPriceStart;
    }
    public BigDecimal getExamFeeItemUnitPriceEnd() {
        return examFeeItemUnitPriceEnd;
    }
    public void setExamFeeItemUnitPriceEnd(BigDecimal examFeeItemUnitPriceEnd) {
        this.examFeeItemUnitPriceEnd = examFeeItemUnitPriceEnd;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
    
  
    
}
