package br.crm.vo.org;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrgExamSuiteQu implements Serializable{
	 
	private String examSuiteName; 
	private String examSuiteCode;
	private Integer examSuiteSex;
	private BigDecimal priceStart;
	private BigDecimal priceEnd;
	private String inputCode;
	private String  orgId;
	private String orgName;
	private Long suiteTypeId;
	private Long branchId;
	private String selectSuite;
	public String getExamSuiteName() {
		return examSuiteName;
	}
	public void setExamSuiteName(String examSuiteName) {
		this.examSuiteName = examSuiteName;
	}
	public String getExamSuiteCode() {
		return examSuiteCode;
	}
	public void setExamSuiteCode(String examSuiteCode) {
		this.examSuiteCode = examSuiteCode;
	}
	public Integer getExamSuiteSex() {
		return examSuiteSex;
	}
	public void setExamSuiteSex(Integer examSuiteSex) {
		this.examSuiteSex = examSuiteSex;
	}
	public BigDecimal getPriceStart() {
		return priceStart;
	}
	public void setPriceStart(BigDecimal priceStart) {
		this.priceStart = priceStart;
	}
	public BigDecimal getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(BigDecimal priceEnd) {
		this.priceEnd = priceEnd;
	}
	
	public String getInputCode() {
		return inputCode;
	}
	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}
	
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Long getSuiteTypeId() {
		return suiteTypeId;
	}
	public void setSuiteTypeId(Long suiteTypeId) {
		this.suiteTypeId = suiteTypeId;
	}
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}
	public String getSelectSuite() {
		return selectSuite;
	}
	public void setSelectSuite(String selectSuite) {
		this.selectSuite = selectSuite;
	}
}
