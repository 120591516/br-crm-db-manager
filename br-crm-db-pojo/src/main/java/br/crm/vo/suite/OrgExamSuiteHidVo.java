package br.crm.vo.suite;

import java.io.Serializable;

public class OrgExamSuiteHidVo implements Serializable{
	private String oesHidId;
	private String highIncidenceDiseaseId; 
	private String highIncidenceDiseaseName;
	public String getOesHidId() {
		return oesHidId;
	}
	public void setOesHidId(String oesHidId) {
		this.oesHidId = oesHidId;
	}
	public String getHighIncidenceDiseaseId() {
		return highIncidenceDiseaseId;
	}
	public void setHighIncidenceDiseaseId(String highIncidenceDiseaseId) {
		this.highIncidenceDiseaseId = highIncidenceDiseaseId;
	}
	public String getHighIncidenceDiseaseName() {
		return highIncidenceDiseaseName;
	}
	public void setHighIncidenceDiseaseName(String highIncidenceDiseaseName) {
		this.highIncidenceDiseaseName = highIncidenceDiseaseName;
	}
	
	
	

}
