package br.crm.vo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.permission.OrganizationPermission;


public class UserPermissionVo extends OrganizationPermission implements Serializable{

    /**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 1L;
	
	
	private List<UserPermissionVo> childrens = new ArrayList<UserPermissionVo>();

	public List<UserPermissionVo> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<UserPermissionVo> childrens) {
		this.childrens = childrens;
	}



}
