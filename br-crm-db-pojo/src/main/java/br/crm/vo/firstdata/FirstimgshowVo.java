package br.crm.vo.firstdata;

import java.util.List;

import br.crm.pojo.firstshow.Firstimgshow;

public class FirstimgshowVo extends Firstimgshow {

	private String orgName;// 机构名称

	private String dataTypeName;// 门店或者套餐的名称

	private List<String> indexs;// 图片位置

	public List<String> getIndexs() {
		return indexs;
	}

	public void setIndexs(List<String> indexs) {
		this.indexs = indexs;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDataTypeName() {
		return dataTypeName;
	}

	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

}
