package br.crm.mapper.permission.branch;

import br.crm.pojo.permission.branch.OrganizationBranchPermission;
import br.crm.pojo.permission.branch.OrganizationBranchPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchPermissionMapper {
    int countByExample(OrganizationBranchPermissionExample example);

    int deleteByExample(OrganizationBranchPermissionExample example);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(OrganizationBranchPermission record);

    int insertSelective(OrganizationBranchPermission record);

    List<OrganizationBranchPermission> selectByExample(OrganizationBranchPermissionExample example);

    OrganizationBranchPermission selectByPrimaryKey(Integer permissionId);

    int updateByExampleSelective(@Param("record") OrganizationBranchPermission record, @Param("example") OrganizationBranchPermissionExample example);

    int updateByExample(@Param("record") OrganizationBranchPermission record, @Param("example") OrganizationBranchPermissionExample example);

    int updateByPrimaryKeySelective(OrganizationBranchPermission record);

    int updateByPrimaryKey(OrganizationBranchPermission record);
}