package br.crm.vo.branch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchRest;
import br.crm.pojo.dict.DictArea;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.org.Organization;
import br.crm.pojo.suite.OrganizationExamSuite;

public class OrganizationBranchVo extends OrganizationBranch implements Serializable {

	private static long serialVersionUID = 1L;

	private String imgId;// 图片Id

	private String orgShortName;// 机构名称

	private String imgURL;// 图片路径

	private String orgType;// 机构

	private String restType;// 休息类型

	private String restvalue;// 休息具体值

	private Integer limitPeopleStart;// 阀值范围查找开始

	private String imgNote;// 图片描述

	private List<DictImg> imgList = new ArrayList<DictImg>();// 图片对象集合

	private List<OrganizationExamSuite> suiteList = new ArrayList<OrganizationExamSuite>();// 套餐对象集合
	
	private List<OrganizationBranchRest> restList;

	private Organization organization;// 机构

	private String suiteCount;// 套餐数量

	private String suiteType;// 套餐类型
	
	private String orgLevel;//医院等级
	
	private DictArea  dictArea;//
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	} 

	public DictArea getDictArea() {
		return dictArea;
	}

	public void setDictArea(DictArea dictArea) {
		this.dictArea = dictArea;
	}

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}
	

	public List<OrganizationBranchRest> getRestList() {
		return restList;
	}

	public void setRestList(List<OrganizationBranchRest> restList) {
		this.restList = restList;
	}

	public String getSuiteType() {
		return suiteType;
	}

	public void setSuiteType(String suiteType) {
		this.suiteType = suiteType;
	}

	public String getSuiteCount() {
		return suiteCount;
	}

	public void setSuiteCount(String suiteCount) {
		this.suiteCount = suiteCount;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<OrganizationExamSuite> getSuiteList() {
		return suiteList;
	}

	public void setSuiteList(List<OrganizationExamSuite> suiteList) {
		this.suiteList = suiteList;
	}

	public List<DictImg> getImgList() {
		return imgList;
	}

	public void setImgList(List<DictImg> imgList) {
		this.imgList = imgList;
	}

	public String getImgNote() {
		return imgNote;
	}

	public void setImgNote(String imgNote) {
		this.imgNote = imgNote;
	}

	public String getRestType() {
		return restType;
	}

	public void setRestType(String restType) {
		this.restType = restType;
	}

	public String getRestvalue() {
		return restvalue;
	}

	public void setRestvalue(String restvalue) {
		this.restvalue = restvalue;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getOrgShortName() {
		return orgShortName;
	}

	public void setOrgShortName(String orgShortName) {
		this.orgShortName = orgShortName;
	}

	private List<DictImg> img = new ArrayList<DictImg>();

	public List<DictImg> getImg() {
		return img;
	}

	public void setImg(List<DictImg> img) {
		this.img = img;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public Integer getLimitPeopleStart() {
		return limitPeopleStart;
	}

	public void setLimitPeopleStart(Integer limitPeopleStart) {
		this.limitPeopleStart = limitPeopleStart;
	}

}
