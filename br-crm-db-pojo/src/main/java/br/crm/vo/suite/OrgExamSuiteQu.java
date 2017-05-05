package br.crm.vo.suite;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrgExamSuiteQu implements Serializable {

	private String examSuiteName;
	private String examSuiteCode;

	private Integer examSuiteSex; // 性别

	private String suiteTypeId; // 套餐类型

	private String Keyword;// 关键字

	private String highDisease;// 高发疾病

	private String hospitalType;// 机构类型

	private String area; // 区域

	private BigDecimal priceStart; // 开始价位

	private BigDecimal priceEnd; // 结束价位

	private String orgLevel;// 医院等级

	private String inputCode;

	private String orgId;

	private String orgName;

	private String branchId;
	private String selectSuite;
	private Integer limitPeopleStart;
	private Integer limitPeopleEnd;

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHospitalType() {
		return hospitalType;
	}

	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}

	public String getKeyword() {
		return Keyword;
	}

	public void setKeyword(String keyword) {
		Keyword = keyword;
	}

	public String getHighDisease() {
		return highDisease;
	}

	public void setHighDisease(String highDisease) {
		this.highDisease = highDisease;
	}

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

	public String getSuiteTypeId() {
		return suiteTypeId;
	}

	public void setSuiteTypeId(String suiteTypeId) {
		this.suiteTypeId = suiteTypeId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getSelectSuite() {
		return selectSuite;
	}

	public void setSelectSuite(String selectSuite) {
		this.selectSuite = selectSuite;
	}

	public Integer getLimitPeopleStart() {
		return limitPeopleStart;
	}

	public void setLimitPeopleStart(Integer limitPeopleStart) {
		this.limitPeopleStart = limitPeopleStart;
	}

	public Integer getLimitPeopleEnd() {
		return limitPeopleEnd;
	}

	public void setLimitPeopleEnd(Integer limitPeopleEnd) {
		this.limitPeopleEnd = limitPeopleEnd;
	}

}
