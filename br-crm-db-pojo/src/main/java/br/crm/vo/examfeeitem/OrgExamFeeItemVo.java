package br.crm.vo.examfeeitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.vo.examitem.OrganizationExamItemVo;

public class OrgExamFeeItemVo extends OrganizationExamFeeItem implements Serializable{
    private boolean checked = false;
    private String feeItemExamItemUserId;
    private String examFeeItemDetailId;
    private String examFisId;
    private List<OrganizationExamItemVo> examItems=new ArrayList<OrganizationExamItemVo>();

    private int pId =0;
    
    public String getExamFeeItemDetailId() {
        return examFeeItemDetailId;
    }

    public void setExamFeeItemDetailId(String examFeeItemDetailId) {
        this.examFeeItemDetailId = examFeeItemDetailId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

	public String getExamFisId() {
		return examFisId;
	}

	public void setExamFisId(String examFisId) {
		this.examFisId = examFisId;
	}

	public List<OrganizationExamItemVo> getExamItems() {
		return examItems;
	}

	public void setExamItems(List<OrganizationExamItemVo> examItems) {
		this.examItems = examItems;
	}

	public String getFeeItemExamItemUserId() {
		return feeItemExamItemUserId;
	}

	public void setFeeItemExamItemUserId(String feeItemExamItemUserId) {
		this.feeItemExamItemUserId = feeItemExamItemUserId;
	} 
    
    
}
