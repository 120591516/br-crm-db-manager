package br.crm.service.dept;

import java.util.List;

import br.crm.pojo.dept.OrganizationDeptUser;

public interface OrganizationDeptUserService {
    int addOrganizationDeptUser(OrganizationDeptUser deptUser);

    int updateOrganizationDeptUser(OrganizationDeptUser deptUser);

    int deleteOrganizationDeptUser(String pid);

    OrganizationDeptUser getOrganizationDeptUserByDeptId(String deptId);

    List<OrganizationDeptUser> getAll();

}
