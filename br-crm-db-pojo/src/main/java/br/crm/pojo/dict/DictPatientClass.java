package br.crm.pojo.dict;

import java.util.Date;

public class DictPatientClass {
    private String customerClassId;

    private String customerClassName;

    private String customerClassNameEng;

    private String customerClassCode;

    private String customerClassInputCode;

    private String customerClassNote;

    private Integer customerClassStatus;

    private Date customerClassCreateTime;

    private Date customerClassEditTime;

    public String getCustomerClassId() {
        return customerClassId;
    }

    public void setCustomerClassId(String customerClassId) {
        this.customerClassId = customerClassId == null ? null : customerClassId.trim();
    }

    public String getCustomerClassName() {
        return customerClassName;
    }

    public void setCustomerClassName(String customerClassName) {
        this.customerClassName = customerClassName == null ? null : customerClassName.trim();
    }

    public String getCustomerClassNameEng() {
        return customerClassNameEng;
    }

    public void setCustomerClassNameEng(String customerClassNameEng) {
        this.customerClassNameEng = customerClassNameEng == null ? null : customerClassNameEng.trim();
    }

    public String getCustomerClassCode() {
        return customerClassCode;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode == null ? null : customerClassCode.trim();
    }

    public String getCustomerClassInputCode() {
        return customerClassInputCode;
    }

    public void setCustomerClassInputCode(String customerClassInputCode) {
        this.customerClassInputCode = customerClassInputCode == null ? null : customerClassInputCode.trim();
    }

    public String getCustomerClassNote() {
        return customerClassNote;
    }

    public void setCustomerClassNote(String customerClassNote) {
        this.customerClassNote = customerClassNote == null ? null : customerClassNote.trim();
    }

    public Integer getCustomerClassStatus() {
        return customerClassStatus;
    }

    public void setCustomerClassStatus(Integer customerClassStatus) {
        this.customerClassStatus = customerClassStatus;
    }

    public Date getCustomerClassCreateTime() {
        return customerClassCreateTime;
    }

    public void setCustomerClassCreateTime(Date customerClassCreateTime) {
        this.customerClassCreateTime = customerClassCreateTime;
    }

    public Date getCustomerClassEditTime() {
        return customerClassEditTime;
    }

    public void setCustomerClassEditTime(Date customerClassEditTime) {
        this.customerClassEditTime = customerClassEditTime;
    }
}