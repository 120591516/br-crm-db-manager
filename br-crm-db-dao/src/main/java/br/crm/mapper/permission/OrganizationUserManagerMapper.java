package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationUserManager;
import br.crm.pojo.permission.OrganizationUserManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUserManagerMapper {
    int countByExample(OrganizationUserManagerExample example);

    int deleteByExample(OrganizationUserManagerExample example);

    int deleteByPrimaryKey(String userManagerId);

    int insert(OrganizationUserManager record);

    int insertSelective(OrganizationUserManager record);

    List<OrganizationUserManager> selectByExample(OrganizationUserManagerExample example);

    OrganizationUserManager selectByPrimaryKey(String userManagerId);

    int updateByExampleSelective(@Param("record") OrganizationUserManager record, @Param("example") OrganizationUserManagerExample example);

    int updateByExample(@Param("record") OrganizationUserManager record, @Param("example") OrganizationUserManagerExample example);

    int updateByPrimaryKeySelective(OrganizationUserManager record);

    int updateByPrimaryKey(OrganizationUserManager record);
}