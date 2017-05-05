package br.crm.vo.examitemvalue;

import java.io.Serializable;

import br.crm.pojo.examitem.OrganizationExamItem;

public class OrgExamItemVo extends OrganizationExamItem implements Serializable{
    
    private String examItemTypeName;
    
    //医生ID
    private String userId;
    //医生姓名
    private String userName;
    private boolean checked = false;
    
    public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getExamItemTypeName() {
        return examItemTypeName;
    }

    public void setExamItemTypeName(String examItemTypeName) {
        this.examItemTypeName = examItemTypeName;
    }
    
}
