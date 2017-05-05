package br.crm.pojo.firstshow;

import java.io.Serializable;
import java.util.Date;

public class Firstimgshow implements Serializable{
    private String firstimgshowId;

    private String firstimgshowTitle;

    private String firstimgshowTitleDesc;

    private String firstimgshowImgId;

    private String firstimgshowImgUrl;

    private String firstimgshowDataId;

    private Integer firstimgshowDataType;

    private String firstimgshowDataOrgId;

    private Integer firstimgshowIndex;

    private Integer firstimgshowStatus;

    private Date firstimgshowCreated;

    private Date firstimgshowUpdated;

    private String firstimgshowContent;

    public String getFirstimgshowId() {
        return firstimgshowId;
    }

    public void setFirstimgshowId(String firstimgshowId) {
        this.firstimgshowId = firstimgshowId == null ? null : firstimgshowId.trim();
    }

    public String getFirstimgshowTitle() {
        return firstimgshowTitle;
    }

    public void setFirstimgshowTitle(String firstimgshowTitle) {
        this.firstimgshowTitle = firstimgshowTitle == null ? null : firstimgshowTitle.trim();
    }

    public String getFirstimgshowTitleDesc() {
        return firstimgshowTitleDesc;
    }

    public void setFirstimgshowTitleDesc(String firstimgshowTitleDesc) {
        this.firstimgshowTitleDesc = firstimgshowTitleDesc == null ? null : firstimgshowTitleDesc.trim();
    }

    public String getFirstimgshowImgId() {
        return firstimgshowImgId;
    }

    public void setFirstimgshowImgId(String firstimgshowImgId) {
        this.firstimgshowImgId = firstimgshowImgId == null ? null : firstimgshowImgId.trim();
    }

    public String getFirstimgshowImgUrl() {
        return firstimgshowImgUrl;
    }

    public void setFirstimgshowImgUrl(String firstimgshowImgUrl) {
        this.firstimgshowImgUrl = firstimgshowImgUrl == null ? null : firstimgshowImgUrl.trim();
    }

    public String getFirstimgshowDataId() {
        return firstimgshowDataId;
    }

    public void setFirstimgshowDataId(String firstimgshowDataId) {
        this.firstimgshowDataId = firstimgshowDataId == null ? null : firstimgshowDataId.trim();
    }

    public Integer getFirstimgshowDataType() {
        return firstimgshowDataType;
    }

    public void setFirstimgshowDataType(Integer firstimgshowDataType) {
        this.firstimgshowDataType = firstimgshowDataType;
    }

    public String getFirstimgshowDataOrgId() {
        return firstimgshowDataOrgId;
    }

    public void setFirstimgshowDataOrgId(String firstimgshowDataOrgId) {
        this.firstimgshowDataOrgId = firstimgshowDataOrgId == null ? null : firstimgshowDataOrgId.trim();
    }

    public Integer getFirstimgshowIndex() {
        return firstimgshowIndex;
    }

    public void setFirstimgshowIndex(Integer firstimgshowIndex) {
        this.firstimgshowIndex = firstimgshowIndex;
    }

    public Integer getFirstimgshowStatus() {
        return firstimgshowStatus;
    }

    public void setFirstimgshowStatus(Integer firstimgshowStatus) {
        this.firstimgshowStatus = firstimgshowStatus;
    }

    public Date getFirstimgshowCreated() {
        return firstimgshowCreated;
    }

    public void setFirstimgshowCreated(Date firstimgshowCreated) {
        this.firstimgshowCreated = firstimgshowCreated;
    }

    public Date getFirstimgshowUpdated() {
        return firstimgshowUpdated;
    }

    public void setFirstimgshowUpdated(Date firstimgshowUpdated) {
        this.firstimgshowUpdated = firstimgshowUpdated;
    }

    public String getFirstimgshowContent() {
        return firstimgshowContent;
    }

    public void setFirstimgshowContent(String firstimgshowContent) {
        this.firstimgshowContent = firstimgshowContent == null ? null : firstimgshowContent.trim();
    }
}