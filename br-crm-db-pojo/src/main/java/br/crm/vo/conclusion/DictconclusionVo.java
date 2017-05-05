package br.crm.vo.conclusion;

import java.io.Serializable;

import br.crm.pojo.dict.DictconclusionWithBLOBs;

public class DictconclusionVo extends DictconclusionWithBLOBs implements Serializable {

	private String conclusionTypeName;// 结论词类型名称

	private String conclusionDeptTypeName;// 结论词部门类型名称

	private String conclusionGroupName;// 结论词分组名称

	private String conclusionResultName; // 结果分类

	private String sexName;// 性别
	
	private String sexId;//性别id
	
	public String getSexId() {
		return sexId;
	}

	public void setSexId(String sexId) {
		this.sexId = sexId;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public String getConclusionTypeName() {
		return conclusionTypeName;
	}

	public void setConclusionTypeName(String conclusionTypeName) {
		this.conclusionTypeName = conclusionTypeName;
	}

	public String getConclusionDeptTypeName() {
		return conclusionDeptTypeName;
	}

	public void setConclusionDeptTypeName(String conclusionDeptTypeName) {
		this.conclusionDeptTypeName = conclusionDeptTypeName;
	}

	public String getConclusionGroupName() {
		return conclusionGroupName;
	}

	public void setConclusionGroupName(String conclusionGroupName) {
		this.conclusionGroupName = conclusionGroupName;
	}

	public String getConclusionResultName() {
		return conclusionResultName;
	}

	public void setConclusionResultName(String conclusionResultName) {
		this.conclusionResultName = conclusionResultName;
	}

}
