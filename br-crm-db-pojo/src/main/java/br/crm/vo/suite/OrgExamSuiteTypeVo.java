package br.crm.vo.suite;

import java.io.Serializable;

public class OrgExamSuiteTypeVo implements Serializable{
	private String examSuiteTypeId;
	private String examTypeName;
	private String examTypeId;
	
 
	public String getExamSuiteTypeId() {
		return examSuiteTypeId;
	}
	public void setExamSuiteTypeId(String examSuiteTypeId) {
		this.examSuiteTypeId = examSuiteTypeId;
	}
	public String getExamTypeName() {
		return examTypeName;
	}
	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}
	public String getExamTypeId() {
		return examTypeId;
	}
	public void setExamTypeId(String examTypeId) {
		this.examTypeId = examTypeId;
	}

	
	
}
