package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.pojo.permission.OrganizationRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationRolePermissionMapper {
    int countByExample(OrganizationRolePermissionExample example);

    int deleteByExample(OrganizationRolePermissionExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(OrganizationRolePermission record);

    int insertSelective(OrganizationRolePermission record);

    List<OrganizationRolePermission> selectByExample(OrganizationRolePermissionExample example);

    OrganizationRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") OrganizationRolePermission record, @Param("example") OrganizationRolePermissionExample example);

    int updateByExample(@Param("record") OrganizationRolePermission record, @Param("example") OrganizationRolePermissionExample example);

    int updateByPrimaryKeySelective(OrganizationRolePermission record);

    int updateByPrimaryKey(OrganizationRolePermission record);
}