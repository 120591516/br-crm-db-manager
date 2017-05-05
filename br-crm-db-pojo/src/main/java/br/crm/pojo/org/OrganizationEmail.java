package br.crm.pojo.org;

import java.io.Serializable;

public class OrganizationEmail implements Serializable {
    private Long orgEmailId;

    private String orgId;

    private Long dictEmailId;

    public Long getOrgEmailId() {
        return orgEmailId;
    }

    public void setOrgEmailId(Long orgEmailId) {
        this.orgEmailId = orgEmailId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Long getDictEmailId() {
        return dictEmailId;
    }

    public void setDictEmailId(Long dictEmailId) {
        this.dictEmailId = dictEmailId;
    }
}