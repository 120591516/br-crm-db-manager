package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable{
    private String orgId;

    private String orgShortName;

    private String orgTotalName;

    private String orgCode;

    private Integer orgNature;

    private Integer orgLevelId;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private String orgAddress;

    private Double orgSize;

    private Integer orgStatus;

    private Date orgCreateTime;

    private Date orgEditTime;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgShortName() {
        return orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName == null ? null : orgShortName.trim();
    }

    public String getOrgTotalName() {
        return orgTotalName;
    }

    public void setOrgTotalName(String orgTotalName) {
        this.orgTotalName = orgTotalName == null ? null : orgTotalName.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getOrgNature() {
        return orgNature;
    }

    public void setOrgNature(Integer orgNature) {
        this.orgNature = orgNature;
    }

    public Integer getOrgLevelId() {
        return orgLevelId;
    }

    public void setOrgLevelId(Integer orgLevelId) {
        this.orgLevelId = orgLevelId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public Double getOrgSize() {
        return orgSize;
    }

    public void setOrgSize(Double orgSize) {
        this.orgSize = orgSize;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Date getOrgCreateTime() {
        return orgCreateTime;
    }

    public void setOrgCreateTime(Date orgCreateTime) {
        this.orgCreateTime = orgCreateTime;
    }

    public Date getOrgEditTime() {
        return orgEditTime;
    }

    public void setOrgEditTime(Date orgEditTime) {
        this.orgEditTime = orgEditTime;
    }
}