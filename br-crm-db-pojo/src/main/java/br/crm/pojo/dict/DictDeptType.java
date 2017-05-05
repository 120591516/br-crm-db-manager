package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class DictDeptType implements Serializable{
    private String dictDeptTypeId;

    private String dictDeptTypeName;

    private Integer dictDeptTypeStatus;

    private Date dictDeptTypeCreateTime;

    private Date dictDeptTypeEditTime;

    public String getDictDeptTypeId() {
        return dictDeptTypeId;
    }

    public void setDictDeptTypeId(String dictDeptTypeId) {
        this.dictDeptTypeId = dictDeptTypeId == null ? null : dictDeptTypeId.trim();
    }

    public String getDictDeptTypeName() {
        return dictDeptTypeName;
    }

    public void setDictDeptTypeName(String dictDeptTypeName) {
        this.dictDeptTypeName = dictDeptTypeName == null ? null : dictDeptTypeName.trim();
    }

    public Integer getDictDeptTypeStatus() {
        return dictDeptTypeStatus;
    }

    public void setDictDeptTypeStatus(Integer dictDeptTypeStatus) {
        this.dictDeptTypeStatus = dictDeptTypeStatus;
    }

    public Date getDictDeptTypeCreateTime() {
        return dictDeptTypeCreateTime;
    }

    public void setDictDeptTypeCreateTime(Date dictDeptTypeCreateTime) {
        this.dictDeptTypeCreateTime = dictDeptTypeCreateTime;
    }

    public Date getDictDeptTypeEditTime() {
        return dictDeptTypeEditTime;
    }

    public void setDictDeptTypeEditTime(Date dictDeptTypeEditTime) {
        this.dictDeptTypeEditTime = dictDeptTypeEditTime;
    }
}