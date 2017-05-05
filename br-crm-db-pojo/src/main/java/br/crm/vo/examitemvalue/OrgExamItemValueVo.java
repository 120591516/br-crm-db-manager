package br.crm.vo.examitemvalue;

import java.io.Serializable;

import br.crm.pojo.examitemvalue.OrganizationExamItemValue;

public class OrgExamItemValueVo extends OrganizationExamItemValue implements Serializable{
    private String examItemName;

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName;
    }
}
