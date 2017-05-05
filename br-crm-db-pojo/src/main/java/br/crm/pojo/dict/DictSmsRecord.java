package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class DictSmsRecord implements Serializable {
    private Long smsId;

    private String smsPhone;

    private String smsContent;

    private Integer smsStatus;

    private Date smsCreate;

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public String getSmsPhone() {
        return smsPhone;
    }

    public void setSmsPhone(String smsPhone) {
        this.smsPhone = smsPhone == null ? null : smsPhone.trim();
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent == null ? null : smsContent.trim();
    }

    public Integer getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
    }

    public Date getSmsCreate() {
        return smsCreate;
    }

    public void setSmsCreate(Date smsCreate) {
        this.smsCreate = smsCreate;
    }
}