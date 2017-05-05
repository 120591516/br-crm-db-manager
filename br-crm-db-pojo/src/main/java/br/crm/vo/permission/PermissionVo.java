package br.crm.vo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.permission.OrganizationPermission;

public class PermissionVo extends OrganizationPermission implements Serializable{

	private List<OperationVo> list;

	// 是否选中
	private Boolean permissionFlag;

	// 子节点
	private List<PermissionVo> childrens = new ArrayList<PermissionVo>();

	public List<PermissionVo> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<PermissionVo> childrens) {
		this.childrens = childrens;
	}

	public List<OperationVo> getList() {
		return list;
	}

	public void setList(List<OperationVo> list) {
		this.list = list;
	}

	public Boolean getPermissionFlag() {
		return permissionFlag;
	}

	public void setPermissionFlag(Boolean permissionFlag) {
		this.permissionFlag = permissionFlag;
	}

}
