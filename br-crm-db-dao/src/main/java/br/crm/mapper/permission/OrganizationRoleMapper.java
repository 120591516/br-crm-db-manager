package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationRole;
import br.crm.pojo.permission.OrganizationRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationRoleMapper {
    int countByExample(OrganizationRoleExample example);

    int deleteByExample(OrganizationRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(OrganizationRole record);

    int insertSelective(OrganizationRole record);

    List<OrganizationRole> selectByExample(OrganizationRoleExample example);

    OrganizationRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") OrganizationRole record, @Param("example") OrganizationRoleExample example);

    int updateByExample(@Param("record") OrganizationRole record, @Param("example") OrganizationRoleExample example);

    int updateByPrimaryKeySelective(OrganizationRole record);

    int updateByPrimaryKey(OrganizationRole record);
}