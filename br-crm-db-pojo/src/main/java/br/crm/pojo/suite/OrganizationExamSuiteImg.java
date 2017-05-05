package br.crm.pojo.suite;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamSuiteImg implements Serializable{
    private String orgExamSuiteImgId;

    private String orgId;

    private String orgExamSuiteId;

    private Long dictImgId;

    private Date orgExamSuiteCreateTime;

    private Date orgExamSuiteEditTime;

    private Integer orgExamSuiteStatus;

    private Integer orgExamSuiteImgType;

    private String orgExamSuiteImgNode;

    public String getOrgExamSuiteImgId() {
        return orgExamSuiteImgId;
    }

    public void setOrgExamSuiteImgId(String orgExamSuiteImgId) {
        this.orgExamSuiteImgId = orgExamSuiteImgId == null ? null : orgExamSuiteImgId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgExamSuiteId() {
        return orgExamSuiteId;
    }

    public void setOrgExamSuiteId(String orgExamSuiteId) {
        this.orgExamSuiteId = orgExamSuiteId == null ? null : orgExamSuiteId.trim();
    }

    public Long getDictImgId() {
        return dictImgId;
    }

    public void setDictImgId(Long dictImgId) {
        this.dictImgId = dictImgId;
    }

    public Date getOrgExamSuiteCreateTime() {
        return orgExamSuiteCreateTime;
    }

    public void setOrgExamSuiteCreateTime(Date orgExamSuiteCreateTime) {
        this.orgExamSuiteCreateTime = orgExamSuiteCreateTime;
    }

    public Date getOrgExamSuiteEditTime() {
        return orgExamSuiteEditTime;
    }

    public void setOrgExamSuiteEditTime(Date orgExamSuiteEditTime) {
        this.orgExamSuiteEditTime = orgExamSuiteEditTime;
    }

    public Integer getOrgExamSuiteStatus() {
        return orgExamSuiteStatus;
    }

    public void setOrgExamSuiteStatus(Integer orgExamSuiteStatus) {
        this.orgExamSuiteStatus = orgExamSuiteStatus;
    }

    public Integer getOrgExamSuiteImgType() {
        return orgExamSuiteImgType;
    }

    public void setOrgExamSuiteImgType(Integer orgExamSuiteImgType) {
        this.orgExamSuiteImgType = orgExamSuiteImgType;
    }

    public String getOrgExamSuiteImgNode() {
        return orgExamSuiteImgNode;
    }

    public void setOrgExamSuiteImgNode(String orgExamSuiteImgNode) {
        this.orgExamSuiteImgNode = orgExamSuiteImgNode == null ? null : orgExamSuiteImgNode.trim();
    }
}