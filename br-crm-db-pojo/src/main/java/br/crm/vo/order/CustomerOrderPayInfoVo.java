package br.crm.vo.order;

import java.io.Serializable;
import java.util.Date;

import br.crm.pojo.customer.order.CustomerOrderPayInfo;

public class CustomerOrderPayInfoVo extends CustomerOrderPayInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String StartTime;//开始时间
	
	private String EndTime;//结束时间
	
	private String orgId;//体检机构id
	
	private String orgName;//体检机构名称
	
	
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

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	

}
