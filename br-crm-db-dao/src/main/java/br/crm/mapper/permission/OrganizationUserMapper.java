package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUserMapper {
    int countByExample(OrganizationUserExample example);

    int deleteByExample(OrganizationUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(OrganizationUser record);

    int insertSelective(OrganizationUser record);

    List<OrganizationUser> selectByExample(OrganizationUserExample example);

    OrganizationUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") OrganizationUser record, @Param("example") OrganizationUserExample example);

    int updateByExample(@Param("record") OrganizationUser record, @Param("example") OrganizationUserExample example);

    int updateByPrimaryKeySelective(OrganizationUser record);

    int updateByPrimaryKey(OrganizationUser record);
}