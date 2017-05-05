package br.crm.mapper.permission.branch;

import br.crm.pojo.permission.branch.OrganizationBranchRolePermission;
import br.crm.pojo.permission.branch.OrganizationBranchRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchRolePermissionMapper {
    int countByExample(OrganizationBranchRolePermissionExample example);

    int deleteByExample(OrganizationBranchRolePermissionExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(OrganizationBranchRolePermission record);

    int insertSelective(OrganizationBranchRolePermission record);

    List<OrganizationBranchRolePermission> selectByExample(OrganizationBranchRolePermissionExample example);

    OrganizationBranchRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") OrganizationBranchRolePermission record, @Param("example") OrganizationBranchRolePermissionExample example);

    int updateByExample(@Param("record") OrganizationBranchRolePermission record, @Param("example") OrganizationBranchRolePermissionExample example);

    int updateByPrimaryKeySelective(OrganizationBranchRolePermission record);

    int updateByPrimaryKey(OrganizationBranchRolePermission record);
}