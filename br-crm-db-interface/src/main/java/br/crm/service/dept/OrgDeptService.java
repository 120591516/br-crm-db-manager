package br.crm.service.dept;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dept.OrganizationDept;
import br.crm.vo.dept.OrganizationDeptVo;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;

public interface OrgDeptService {
    PageInfo<OrganizationDeptVo> getOrgDeptByCondition(int page, int rows, OrganizationDeptVo organizationDeptVo);

    int addOrgDept(OrganizationDept dept);

    int updateOrgDept(OrganizationDeptVo dept);

    OrganizationDeptVo getOrgDeptByPid(String pid);

    List<OrganizationDept> getOrgDeptByOrgid(String orgid);

    List<OrganizationDept> getOrgDeptByBranid(String branid);

    List<OrganizationDept> getOrgDeptAll();

    List<OrgExamFeeItemVo> getItemByDeptid(String deptId);

    List<Map<String, String>> getDeptNameByBranchId(String branchId);

    List<OrganizationDept> getDeptNameByBranid(String branid);

    OrganizationDept getOrganizationDeptByDeptId(String deptId);

}
