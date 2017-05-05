package br.crm.pojo.org;

import java.io.Serializable;
import java.util.Date;

public class OrganizationLicense implements Serializable {
    private Long orgLicenseId;

    private String orgId;

    private String orgLicenseNo;

    private Long orgLicenseImgId;

    private String orgLicenseImgUrl;

    private Long orgLicenseOpenId;

    private String orgLicenseOpenUrl;

    private String orgLicensePersonName;

    private Date orgLicenseCreateTime;

    private Date orgLicenseEditTime;

    public Long getOrgLicenseId() {
        return orgLicenseId;
    }

    public void setOrgLicenseId(Long orgLicenseId) {
        this.orgLicenseId = orgLicenseId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgLicenseNo() {
        return orgLicenseNo;
    }

    public void setOrgLicenseNo(String orgLicenseNo) {
        this.orgLicenseNo = orgLicenseNo == null ? null : orgLicenseNo.trim();
    }

    public Long getOrgLicenseImgId() {
        return orgLicenseImgId;
    }

    public void setOrgLicenseImgId(Long orgLicenseImgId) {
        this.orgLicenseImgId = orgLicenseImgId;
    }

    public String getOrgLicenseImgUrl() {
        return orgLicenseImgUrl;
    }

    public void setOrgLicenseImgUrl(String orgLicenseImgUrl) {
        this.orgLicenseImgUrl = orgLicenseImgUrl == null ? null : orgLicenseImgUrl.trim();
    }

    public Long getOrgLicenseOpenId() {
        return orgLicenseOpenId;
    }

    public void setOrgLicenseOpenId(Long orgLicenseOpenId) {
        this.orgLicenseOpenId = orgLicenseOpenId;
    }

    public String getOrgLicenseOpenUrl() {
        return orgLicenseOpenUrl;
    }

    public void setOrgLicenseOpenUrl(String orgLicenseOpenUrl) {
        this.orgLicenseOpenUrl = orgLicenseOpenUrl == null ? null : orgLicenseOpenUrl.trim();
    }

    public String getOrgLicensePersonName() {
        return orgLicensePersonName;
    }

    public void setOrgLicensePersonName(String orgLicensePersonName) {
        this.orgLicensePersonName = orgLicensePersonName == null ? null : orgLicensePersonName.trim();
    }

    public Date getOrgLicenseCreateTime() {
        return orgLicenseCreateTime;
    }

    public void setOrgLicenseCreateTime(Date orgLicenseCreateTime) {
        this.orgLicenseCreateTime = orgLicenseCreateTime;
    }

    public Date getOrgLicenseEditTime() {
        return orgLicenseEditTime;
    }

    public void setOrgLicenseEditTime(Date orgLicenseEditTime) {
        this.orgLicenseEditTime = orgLicenseEditTime;
    }
}