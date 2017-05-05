package br.crm.pojo.enterprise.org;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseOrgContract implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseOrgContractId;

    private String enterpriseOrgId;

    private String enterpriseReservationId;

    private String enterpriseOrgContractName;

    private String enterpriseId;

    private String enterpriseFullName;

    private String orgId;

    private String orgName;

    private String enterpriseOrgContractImg;

    private Date enterpriseOrgContractStartTime;

    private Date enterpriseOrgContractEndTime;

    private Integer enterpriseOrgContractStatus;

    private Date enterpriseOrgContractEditTime;

    private Date enterpriseOrgContractCreateTime;

    public String getEnterpriseOrgContractId() {
        return enterpriseOrgContractId;
    }

    public void setEnterpriseOrgContractId(String enterpriseOrgContractId) {
        this.enterpriseOrgContractId = enterpriseOrgContractId == null ? null : enterpriseOrgContractId.trim();
    }

    public String getEnterpriseOrgId() {
        return enterpriseOrgId;
    }

    public void setEnterpriseOrgId(String enterpriseOrgId) {
        this.enterpriseOrgId = enterpriseOrgId == null ? null : enterpriseOrgId.trim();
    }

    public String getEnterpriseReservationId() {
        return enterpriseReservationId;
    }

    public void setEnterpriseReservationId(String enterpriseReservationId) {
        this.enterpriseReservationId = enterpriseReservationId == null ? null : enterpriseReservationId.trim();
    }

    public String getEnterpriseOrgContractName() {
        return enterpriseOrgContractName;
    }

    public void setEnterpriseOrgContractName(String enterpriseOrgContractName) {
        this.enterpriseOrgContractName = enterpriseOrgContractName == null ? null : enterpriseOrgContractName.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getEnterpriseFullName() {
        return enterpriseFullName;
    }

    public void setEnterpriseFullName(String enterpriseFullName) {
        this.enterpriseFullName = enterpriseFullName == null ? null : enterpriseFullName.trim();
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

    public String getEnterpriseOrgContractImg() {
        return enterpriseOrgContractImg;
    }

    public void setEnterpriseOrgContractImg(String enterpriseOrgContractImg) {
        this.enterpriseOrgContractImg = enterpriseOrgContractImg == null ? null : enterpriseOrgContractImg.trim();
    }

    public Date getEnterpriseOrgContractStartTime() {
        return enterpriseOrgContractStartTime;
    }

    public void setEnterpriseOrgContractStartTime(Date enterpriseOrgContractStartTime) {
        this.enterpriseOrgContractStartTime = enterpriseOrgContractStartTime;
    }

    public Date getEnterpriseOrgContractEndTime() {
        return enterpriseOrgContractEndTime;
    }

    public void setEnterpriseOrgContractEndTime(Date enterpriseOrgContractEndTime) {
        this.enterpriseOrgContractEndTime = enterpriseOrgContractEndTime;
    }

    public Integer getEnterpriseOrgContractStatus() {
        return enterpriseOrgContractStatus;
    }

    public void setEnterpriseOrgContractStatus(Integer enterpriseOrgContractStatus) {
        this.enterpriseOrgContractStatus = enterpriseOrgContractStatus;
    }

    public Date getEnterpriseOrgContractEditTime() {
        return enterpriseOrgContractEditTime;
    }

    public void setEnterpriseOrgContractEditTime(Date enterpriseOrgContractEditTime) {
        this.enterpriseOrgContractEditTime = enterpriseOrgContractEditTime;
    }

    public Date getEnterpriseOrgContractCreateTime() {
        return enterpriseOrgContractCreateTime;
    }

    public void setEnterpriseOrgContractCreateTime(Date enterpriseOrgContractCreateTime) {
        this.enterpriseOrgContractCreateTime = enterpriseOrgContractCreateTime;
    }
}