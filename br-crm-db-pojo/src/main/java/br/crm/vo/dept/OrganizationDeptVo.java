package br.crm.vo.dept;

import java.io.Serializable;

import br.crm.pojo.dept.OrganizationDept;


/**
 * 科室的实体类
 * @author zxy
 *
 */
public class OrganizationDeptVo extends OrganizationDept implements Serializable {
	private String orgTotalName;// 机构名称
	
	private String branchName;// 门店名称
	
	private String userName;// 负责人名字
	
	private String departParentName;// 上级科室名称
	
	private String dictDeptTypeName ;//类型名称
	
	private String orgShortName;//机构简称
	
	
	public String getOrgShortName() {
		return orgShortName;
	}
	public void setOrgShortName(String orgShortName) {
		this.orgShortName = orgShortName;
	}
	public String getDictDeptTypeName() {
		return dictDeptTypeName;
	}
	public void setDictDeptTypeName(String dictDeptTypeName) {
		this.dictDeptTypeName = dictDeptTypeName;
	}
	public String getOrgTotalName() {
		return orgTotalName;
	}
	public void setOrgTotalName(String orgTotalName) {
		this.orgTotalName = orgTotalName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    public String getDepartParentName() {
        return departParentName;
    }
    public void setDepartParentName(String departParentName) {
        this.departParentName = departParentName;
    }
	
	
	

}
