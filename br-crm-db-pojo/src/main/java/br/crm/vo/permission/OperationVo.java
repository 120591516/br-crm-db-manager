package br.crm.vo.permission;

import java.io.Serializable;

import br.crm.pojo.permission.OrganizationOperation;

public class OperationVo extends OrganizationOperation implements Serializable {

	//是否选中
	private Boolean operationFlag;

	public Boolean getOperationFlag() {
		return operationFlag;
	}

	public void setOperationFlag(Boolean operationFlag) {
		this.operationFlag = operationFlag;
	}

}
