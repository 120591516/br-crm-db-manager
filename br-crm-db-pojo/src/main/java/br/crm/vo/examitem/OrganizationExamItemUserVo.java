package br.crm.vo.examitem;

import java.io.Serializable;

import br.crm.pojo.examitem.OrganizationExamItemUser;

public class OrganizationExamItemUserVo extends OrganizationExamItemUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		String orgId;//机构id
		String orgName;//机构名称
		String branchId;//门店id
		String branchName;//门店名称
		String deptId;//科室id
		String deptName;//科室名称
		String userId;//医生id
		String userName; //医生名称
		String examItemName;//检查项名称
		Integer fMale;//用于男性  0是，1否
		Integer fFemale;//用于女性  0是 ，1否 
		private boolean checked =false;
		
		public boolean isChecked() {
            return checked;
        }
        public void setChecked(boolean checked) {
            this.checked = checked;
        }
        public String getUserId() {
            return userId;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
        public Integer getfMale() {
			return fMale;
		}
		public void setfMale(Integer fMale) {
			this.fMale = fMale;
		}
		public Integer getfFemale() {
			return fFemale;
		}
		public void setfFemale(Integer fFemale) {
			this.fFemale = fFemale;
		}
		public String getOrgId() {
			return orgId;
		}
		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}
		public String getOrgName() {
			return orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public String getBranchId() {
			return branchId;
		}
		public void setBranchId(String branchId) {
			this.branchId = branchId;
		}
		public String getBranchName() {
			return branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public String getDeptId() {
			return deptId;
		}
		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getExamItemName() {
			return examItemName;
		}
		public void setExamItemName(String examItemName) {
			this.examItemName = examItemName;
		}
	
	
	
	
	

}
