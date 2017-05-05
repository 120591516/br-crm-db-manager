package br.crm.vo.examitem;

import java.io.Serializable;

import br.crm.pojo.examitem.OrganizationExamItem;

public class OrgExamItemDetailVo extends OrganizationExamItem implements Serializable {
    private boolean checked = false;

    private int pId =0; 

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

}
