package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class DictEmailRecord implements Serializable {
    private Long dictEmailId;

    private String dictEmailTitle;

    private String dictEmailContent;

    private String dictEmailTo;

    private String dictEmailAttachment;

    private Date dictEmailCreateTime;

    private Integer dictEmailStatus;

    public Long getDictEmailId() {
        return dictEmailId;
    }

    public void setDictEmailId(Long dictEmailId) {
        this.dictEmailId = dictEmailId;
    }

    public String getDictEmailTitle() {
        return dictEmailTitle;
    }

    public void setDictEmailTitle(String dictEmailTitle) {
        this.dictEmailTitle = dictEmailTitle == null ? null : dictEmailTitle.trim();
    }

    public String getDictEmailContent() {
        return dictEmailContent;
    }

    public void setDictEmailContent(String dictEmailContent) {
        this.dictEmailContent = dictEmailContent == null ? null : dictEmailContent.trim();
    }

    public String getDictEmailTo() {
        return dictEmailTo;
    }

    public void setDictEmailTo(String dictEmailTo) {
        this.dictEmailTo = dictEmailTo == null ? null : dictEmailTo.trim();
    }

    public String getDictEmailAttachment() {
        return dictEmailAttachment;
    }

    public void setDictEmailAttachment(String dictEmailAttachment) {
        this.dictEmailAttachment = dictEmailAttachment == null ? null : dictEmailAttachment.trim();
    }

    public Date getDictEmailCreateTime() {
        return dictEmailCreateTime;
    }

    public void setDictEmailCreateTime(Date dictEmailCreateTime) {
        this.dictEmailCreateTime = dictEmailCreateTime;
    }

    public Integer getDictEmailStatus() {
        return dictEmailStatus;
    }

    public void setDictEmailStatus(Integer dictEmailStatus) {
        this.dictEmailStatus = dictEmailStatus;
    }
}