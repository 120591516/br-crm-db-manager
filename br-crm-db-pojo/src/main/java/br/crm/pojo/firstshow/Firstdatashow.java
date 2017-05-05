package br.crm.pojo.firstshow;

import java.io.Serializable;
import java.util.Date;

public class Firstdatashow implements Serializable{
    private String firstdatashowId;

    private Integer firstdatashowDataType;

    private String firstdatashowDataId;

    private Long firstdatashowDataImageId;

    private String firstdatashowDataName;

    private String firstdatashowDataDescribe;

    private Integer firstdatashowDataStatus;

    private Date firstdatashowCreateTime;

    private Date firstdatashowEditTime;

    private String firstdatashowOrgId;

    public String getFirstdatashowId() {
        return firstdatashowId;
    }

    public void setFirstdatashowId(String firstdatashowId) {
        this.firstdatashowId = firstdatashowId == null ? null : firstdatashowId.trim();
    }

    public Integer getFirstdatashowDataType() {
        return firstdatashowDataType;
    }

    public void setFirstdatashowDataType(Integer firstdatashowDataType) {
        this.firstdatashowDataType = firstdatashowDataType;
    }

    public String getFirstdatashowDataId() {
        return firstdatashowDataId;
    }

    public void setFirstdatashowDataId(String firstdatashowDataId) {
        this.firstdatashowDataId = firstdatashowDataId == null ? null : firstdatashowDataId.trim();
    }

    public Long getFirstdatashowDataImageId() {
        return firstdatashowDataImageId;
    }

    public void setFirstdatashowDataImageId(Long firstdatashowDataImageId) {
        this.firstdatashowDataImageId = firstdatashowDataImageId;
    }

    public String getFirstdatashowDataName() {
        return firstdatashowDataName;
    }

    public void setFirstdatashowDataName(String firstdatashowDataName) {
        this.firstdatashowDataName = firstdatashowDataName == null ? null : firstdatashowDataName.trim();
    }

    public String getFirstdatashowDataDescribe() {
        return firstdatashowDataDescribe;
    }

    public void setFirstdatashowDataDescribe(String firstdatashowDataDescribe) {
        this.firstdatashowDataDescribe = firstdatashowDataDescribe == null ? null : firstdatashowDataDescribe.trim();
    }

    public Integer getFirstdatashowDataStatus() {
        return firstdatashowDataStatus;
    }

    public void setFirstdatashowDataStatus(Integer firstdatashowDataStatus) {
        this.firstdatashowDataStatus = firstdatashowDataStatus;
    }

    public Date getFirstdatashowCreateTime() {
        return firstdatashowCreateTime;
    }

    public void setFirstdatashowCreateTime(Date firstdatashowCreateTime) {
        this.firstdatashowCreateTime = firstdatashowCreateTime;
    }

    public Date getFirstdatashowEditTime() {
        return firstdatashowEditTime;
    }

    public void setFirstdatashowEditTime(Date firstdatashowEditTime) {
        this.firstdatashowEditTime = firstdatashowEditTime;
    }

    public String getFirstdatashowOrgId() {
        return firstdatashowOrgId;
    }

    public void setFirstdatashowOrgId(String firstdatashowOrgId) {
        this.firstdatashowOrgId = firstdatashowOrgId == null ? null : firstdatashowOrgId.trim();
    }
}