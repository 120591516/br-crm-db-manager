package br.crm.vo.examitem;

import java.io.Serializable;


public class OrganizationExamFeeItemDetailVo extends OrganizationExamItemUserVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String examFeeItemDetailId;//收费项与检查项关联表主键Id
	String examFeeItemId;//收费项Id
	String examFeeItemName;//收费项名称
	public String getExamFeeItemDetailId() {
		return examFeeItemDetailId;
	}
	public void setExamFeeItemDetailId(String examFeeItemDetailId) {
		this.examFeeItemDetailId = examFeeItemDetailId;
	}
	public String getExamFeeItemId() {
		return examFeeItemId;
	}
	public void setExamFeeItemId(String examFeeItemId) {
		this.examFeeItemId = examFeeItemId;
	}
	public String getExamFeeItemName() {
		return examFeeItemName;
	}
	public void setExamFeeItemName(String examFeeItemName) {
		this.examFeeItemName = examFeeItemName;
	}
	
	

}
