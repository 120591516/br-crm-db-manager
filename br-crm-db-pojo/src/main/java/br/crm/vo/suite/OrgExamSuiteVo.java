package br.crm.vo.suite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.org.Organization;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;

public class OrgExamSuiteVo extends OrganizationExamSuite implements Serializable {

	private String orgName;
	private Integer orgExamSuiteSexId;
	private String orgExamSuiteSex;
	private List<OrgExamSuiteTypeVo> orgExamSuiteTypeVo;
	private List<OrgExamSuiteHidVo> orgExamSuiteHidVo;
	private List<OrgExamSuiteImgVo> orgExamSuiteImgVo;
	private String typeNameList;
	private List<String> typeList;
	private List<String> highIncidenceDiseaseList;
	private String branchSuiteId;
	private String orgSuiteImgs;
	private List<OrgExamFeeItemVo> orgExamFeeItems=new ArrayList<OrgExamFeeItemVo>(); //收费项
	private String imgId; // 图片的id

	private List<String> suiteTypeName = new ArrayList<String>();// 套餐类型名称

	private String orgLevelName;// 机构名称

	private List<String> hidName = new ArrayList<String>();// 高发疾病名称

	private List<DictImg> imgList = new ArrayList<DictImg>();// 图片对象集合

	private List<OrganizationBranch> branList = new ArrayList<OrganizationBranch>();// 门店对象集合
	
	private  Organization organization;//机构

	private String sale_account_sum;//已售数量
	

	public String getSale_account_sum() {
		return sale_account_sum;
	}

	public void setSale_account_sum(String sale_account_sum) {
		this.sale_account_sum = sale_account_sum;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<OrganizationBranch> getBranList() {
		return branList;
	}

	public void setBranList(List<OrganizationBranch> branList) {
		this.branList = branList;
	}

	public List<DictImg> getImgList() {
		return imgList;
	}

	public void setImgList(List<DictImg> imgList) {
		this.imgList = imgList;
	}

	public List<String> getHidName() {
		return hidName;
	}

	public void setHidName(List<String> hidName) {
		this.hidName = hidName;
	}

	public String getOrgLevelName() {
		return orgLevelName;
	}

	public void setOrgLevelName(String orgLevelName) {
		this.orgLevelName = orgLevelName;
	}

	public List<String> getSuiteTypeName() {
		return suiteTypeName;
	}

	public void setSuiteTypeName(List<String> suiteTypeName) {
		this.suiteTypeName = suiteTypeName;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getOrgExamSuiteSex() {
		if (orgExamSuiteSexId != null) {
			if (orgExamSuiteSexId == 0) {
				return "通用";
			}
			if (orgExamSuiteSexId == 1) {
				return "男";
			}
			if (orgExamSuiteSexId == 2) {
				return "女";
			}
		}
		return orgExamSuiteSex;
	}

	public void setOrgExamSuiteSex(String orgExamSuiteSex) {
		this.orgExamSuiteSex = orgExamSuiteSex;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getOrgExamSuiteSexId() {
		return orgExamSuiteSexId;
	}

	public void setOrgExamSuiteSexId(Integer orgExamSuiteSexId) {
		this.orgExamSuiteSexId = orgExamSuiteSexId;
	}

	public List<OrgExamSuiteTypeVo> getOrgExamSuiteTypeVo() {
		return orgExamSuiteTypeVo;
	}

	public void setOrgExamSuiteTypeVo(List<OrgExamSuiteTypeVo> orgExamSuiteTypeVo) {
		this.orgExamSuiteTypeVo = orgExamSuiteTypeVo;
	}

	public List<OrgExamSuiteHidVo> getOrgExamSuiteHidVo() {
		return orgExamSuiteHidVo;
	}

	public void setOrgExamSuiteHidVo(List<OrgExamSuiteHidVo> orgExamSuiteHidVo) {
		this.orgExamSuiteHidVo = orgExamSuiteHidVo;
	}

	public String getTypeNameList() {
		return typeNameList;
	}

	public void setTypeNameList(String typeNameList) {
		this.typeNameList = typeNameList;
	}

	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	public List<String> getHighIncidenceDiseaseList() {
		return highIncidenceDiseaseList;
	}

	public void setHighIncidenceDiseaseList(List<String> highIncidenceDiseaseList) {
		this.highIncidenceDiseaseList = highIncidenceDiseaseList;
	}

	public String getBranchSuiteId() {
		return branchSuiteId;
	}

	public void setBranchSuiteId(String branchSuiteId) {
		this.branchSuiteId = branchSuiteId;
	}

	public String getOrgSuiteImgs() {
		return orgSuiteImgs;
	}

	public void setOrgSuiteImgs(String orgSuiteImgs) {
		this.orgSuiteImgs = orgSuiteImgs;
	}

	public List<OrgExamSuiteImgVo> getOrgExamSuiteImgVo() {
		return orgExamSuiteImgVo;
	}

	public void setOrgExamSuiteImgVo(List<OrgExamSuiteImgVo> orgExamSuiteImgVo) {
		this.orgExamSuiteImgVo = orgExamSuiteImgVo;
	}

	public List<OrgExamFeeItemVo> getOrgExamFeeItems() {
		return orgExamFeeItems;
	}

	public void setOrgExamFeeItems(List<OrgExamFeeItemVo> orgExamFeeItems) {
		this.orgExamFeeItems = orgExamFeeItems;
	}

	
	

}
