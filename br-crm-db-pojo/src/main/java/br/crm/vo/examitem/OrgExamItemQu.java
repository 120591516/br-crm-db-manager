package br.crm.vo.examitem;

import java.io.Serializable;

public class OrgExamItemQu implements Serializable{
    private String examItemName;//检查项目名称
    private String examItemNameEng;//检查项英文名称
    private String examItemCode;//检查项目代码
    private String examItemTypeId;//项目类型ID
    private Integer sex;//性别0-男1-女2-通用
    private String userId;//医生id
    
    public String getExamItemTypeId() {
		return examItemTypeId;
	}
	public void setExamItemTypeId(String examItemTypeId) {
		this.examItemTypeId = examItemTypeId;
	}
	public String getExamItemName() {
        return examItemName;
    }
    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName;
    }
    public String getExamItemNameEng() {
        return examItemNameEng;
    }
    public void setExamItemNameEng(String examItemNameEng) {
        this.examItemNameEng = examItemNameEng;
    }
    public String getExamItemCode() {
        return examItemCode;
    }
    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode;
    }
   
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    
}
