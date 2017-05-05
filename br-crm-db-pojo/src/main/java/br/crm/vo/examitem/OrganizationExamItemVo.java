package br.crm.vo.examitem;

import java.io.Serializable;

import br.crm.pojo.examitem.OrganizationExamItem;

/** 
* 
* @ClassName: OrganizationExamItemVo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年10月18日 上午10:52:03 
*/
public class OrganizationExamItemVo extends OrganizationExamItem implements Serializable{
    private String examItemTypeName;
    private String examFeeItemDetailId;

    public String getExamItemTypeName() {
        return examItemTypeName;
    }

    public void setExamItemTypeName(String examItemTypeName) {
        this.examItemTypeName = examItemTypeName;
    }

	public String getExamFeeItemDetailId() {
		return examFeeItemDetailId;
	}

	public void setExamFeeItemDetailId(String examFeeItemDetailId) {
		this.examFeeItemDetailId = examFeeItemDetailId;
	}
    
    
}
