package br.crm.pojo.enterprise.org;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseOrg implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseOrgId;

    private String enterpriseId;

    private String orgId;

    private String orgName;

    private String orgLinkman;

    private String orgPhone;

    private String enterpriseOrgContractId;

    private String enterpriseOrgContractName;

    private Integer enterpriseOrgStatus;

    private Date enterpriseOrgEditTime;

    private Date enterpriseOrgCreateTime;

    public String getEnterpriseOrgId() {
        return enterpriseOrgId;
    }

    public void setEnterpriseOrgId(String enterpriseOrgId) {
        this.enterpriseOrgId = enterpriseOrgId == null ? null : enterpriseOrgId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgLinkman() {
        return orgLinkman;
    }

    public void setOrgLinkman(String orgLinkman) {
        this.orgLinkman = orgLinkman == null ? null : orgLinkman.trim();
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone == null ? null : orgPhone.trim();
    }

    public String getEnterpriseOrgContractId() {
        return enterpriseOrgContractId;
    }

    public void setEnterpriseOrgContractId(String enterpriseOrgContractId) {
        this.enterpriseOrgContractId = enterpriseOrgContractId == null ? null : enterpriseOrgContractId.trim();
    }

    public String getEnterpriseOrgContractName() {
        return enterpriseOrgContractName;
    }

    public void setEnterpriseOrgContractName(String enterpriseOrgContractName) {
        this.enterpriseOrgContractName = enterpriseOrgContractName == null ? null : enterpriseOrgContractName.trim();
    }

    public Integer getEnterpriseOrgStatus() {
        return enterpriseOrgStatus;
    }

    public void setEnterpriseOrgStatus(Integer enterpriseOrgStatus) {
        this.enterpriseOrgStatus = enterpriseOrgStatus;
    }

    public Date getEnterpriseOrgEditTime() {
        return enterpriseOrgEditTime;
    }

    public void setEnterpriseOrgEditTime(Date enterpriseOrgEditTime) {
        this.enterpriseOrgEditTime = enterpriseOrgEditTime;
    }

    public Date getEnterpriseOrgCreateTime() {
        return enterpriseOrgCreateTime;
    }

    public void setEnterpriseOrgCreateTime(Date enterpriseOrgCreateTime) {
        this.enterpriseOrgCreateTime = enterpriseOrgCreateTime;
    }
}