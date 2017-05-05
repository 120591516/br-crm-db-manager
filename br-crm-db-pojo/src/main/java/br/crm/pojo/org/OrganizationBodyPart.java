package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationBodyPart implements Serializable {
    private String bodyPartId;

    private String bodyPartName;

    private String bodyPartCode;

    private Integer bodyPartDispOrder;

    private Integer bodyPartStatus;

    private Date bodyPartCreateTime;

    private Date bodyPartEditTime;

    public String getBodyPartId() {
        return bodyPartId;
    }

    public void setBodyPartId(String bodyPartId) {
        this.bodyPartId = bodyPartId == null ? null : bodyPartId.trim();
    }

    public String getBodyPartName() {
        return bodyPartName;
    }

    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName == null ? null : bodyPartName.trim();
    }

    public String getBodyPartCode() {
        return bodyPartCode;
    }

    public void setBodyPartCode(String bodyPartCode) {
        this.bodyPartCode = bodyPartCode == null ? null : bodyPartCode.trim();
    }

    public Integer getBodyPartDispOrder() {
        return bodyPartDispOrder;
    }

    public void setBodyPartDispOrder(Integer bodyPartDispOrder) {
        this.bodyPartDispOrder = bodyPartDispOrder;
    }

    public Integer getBodyPartStatus() {
        return bodyPartStatus;
    }

    public void setBodyPartStatus(Integer bodyPartStatus) {
        this.bodyPartStatus = bodyPartStatus;
    }

    public Date getBodyPartCreateTime() {
        return bodyPartCreateTime;
    }

    public void setBodyPartCreateTime(Date bodyPartCreateTime) {
        this.bodyPartCreateTime = bodyPartCreateTime;
    }

    public Date getBodyPartEditTime() {
        return bodyPartEditTime;
    }

    public void setBodyPartEditTime(Date bodyPartEditTime) {
        this.bodyPartEditTime = bodyPartEditTime;
    }
}