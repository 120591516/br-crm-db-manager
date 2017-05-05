package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationPermission;
import br.crm.pojo.permission.OrganizationPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationPermissionMapper {
    int countByExample(OrganizationPermissionExample example);

    int deleteByExample(OrganizationPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(OrganizationPermission record);

    int insertSelective(OrganizationPermission record);

    List<OrganizationPermission> selectByExample(OrganizationPermissionExample example);

    OrganizationPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") OrganizationPermission record, @Param("example") OrganizationPermissionExample example);

    int updateByExample(@Param("record") OrganizationPermission record, @Param("example") OrganizationPermissionExample example);

    int updateByPrimaryKeySelective(OrganizationPermission record);

    int updateByPrimaryKey(OrganizationPermission record);
}