package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationUserRole;
import br.crm.pojo.permission.OrganizationUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUserRoleMapper {
    int countByExample(OrganizationUserRoleExample example);

    int deleteByExample(OrganizationUserRoleExample example);

    int deleteByPrimaryKey(Long userRoleId);

    int insert(OrganizationUserRole record);

    int insertSelective(OrganizationUserRole record);

    List<OrganizationUserRole> selectByExample(OrganizationUserRoleExample example);

    OrganizationUserRole selectByPrimaryKey(Long userRoleId);

    int updateByExampleSelective(@Param("record") OrganizationUserRole record, @Param("example") OrganizationUserRoleExample example);

    int updateByExample(@Param("record") OrganizationUserRole record, @Param("example") OrganizationUserRoleExample example);

    int updateByPrimaryKeySelective(OrganizationUserRole record);

    int updateByPrimaryKey(OrganizationUserRole record);
}