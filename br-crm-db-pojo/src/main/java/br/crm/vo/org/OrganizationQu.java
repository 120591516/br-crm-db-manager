package br.crm.vo.org;

import java.io.Serializable;

public class OrganizationQu implements Serializable {

    private String orgShortName;

    private Integer orgNature;

    private Integer orgLevelId;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private Integer orgStatus;

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

    public String getOrgShortName() {
        return orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName;
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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

}
