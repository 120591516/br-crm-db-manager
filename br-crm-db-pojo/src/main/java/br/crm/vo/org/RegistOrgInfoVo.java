package br.crm.vo.org;

import java.io.Serializable;
import java.util.Date;

import br.crm.pojo.org.Organization;

public class RegistOrgInfoVo extends Organization implements Serializable {

	private String userId;
	private String orgBranchUserId;

	private String userLoginName;

	private String userPassword;

	private String orgConnName;

	private String orgConnPost;

	private String orgConnPhone;

	private String orgConnEmail;

	private String orgConnCall;

	private Integer orgConnStatus;

	private Date orgConnCreateTime;

	private Date orgConnEditTime;

	private String orgLicenseNo;

	private Long orgLicenseImgId;

	private String orgLicenseImgUrl;

	private Long orgLicenseOpenId;

	private String orgLicenseOpenUrl;

	private String orgLicensePersonName;

	private Date orgLicenseCreateTime;

	private Date orgLicenseEditTime;

	
	public String getOrgBranchUserId() {
		return orgBranchUserId;
	}

	public void setOrgBranchUserId(String orgBranchUserId) {
		this.orgBranchUserId = orgBranchUserId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getOrgConnName() {
		return orgConnName;
	}

	public void setOrgConnName(String orgConnName) {
		this.orgConnName = orgConnName;
	}

	public String getOrgConnPost() {
		return orgConnPost;
	}

	public void setOrgConnPost(String orgConnPost) {
		this.orgConnPost = orgConnPost;
	}

	public String getOrgConnPhone() {
		return orgConnPhone;
	}

	public void setOrgConnPhone(String orgConnPhone) {
		this.orgConnPhone = orgConnPhone;
	}

	public String getOrgConnEmail() {
		return orgConnEmail;
	}

	public void setOrgConnEmail(String orgConnEmail) {
		this.orgConnEmail = orgConnEmail;
	}

	public String getOrgConnCall() {
		return orgConnCall;
	}

	public void setOrgConnCall(String orgConnCall) {
		this.orgConnCall = orgConnCall;
	}

	public Integer getOrgConnStatus() {
		return orgConnStatus;
	}

	public void setOrgConnStatus(Integer orgConnStatus) {
		this.orgConnStatus = orgConnStatus;
	}

	public Date getOrgConnCreateTime() {
		return orgConnCreateTime;
	}

	public void setOrgConnCreateTime(Date orgConnCreateTime) {
		this.orgConnCreateTime = orgConnCreateTime;
	}

	public Date getOrgConnEditTime() {
		return orgConnEditTime;
	}

	public void setOrgConnEditTime(Date orgConnEditTime) {
		this.orgConnEditTime = orgConnEditTime;
	}

	public String getOrgLicenseNo() {
		return orgLicenseNo;
	}

	public void setOrgLicenseNo(String orgLicenseNo) {
		this.orgLicenseNo = orgLicenseNo;
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
		this.orgLicenseImgUrl = orgLicenseImgUrl;
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
		this.orgLicenseOpenUrl = orgLicenseOpenUrl;
	}

	public String getOrgLicensePersonName() {
		return orgLicensePersonName;
	}

	public void setOrgLicensePersonName(String orgLicensePersonName) {
		this.orgLicensePersonName = orgLicensePersonName;
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
