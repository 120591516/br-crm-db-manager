package br.crm.mapper.dept;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import br.crm.pojo.dept.OrganizationDeptUser;
import br.crm.pojo.dept.OrganizationDeptUserExample;

public interface OrganizationDeptUserMapper {
    int countByExample(OrganizationDeptUserExample example);

    int deleteByExample(OrganizationDeptUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrganizationDeptUser record);

    int insertSelective(OrganizationDeptUser record);

    List<OrganizationDeptUser> selectByExample(OrganizationDeptUserExample example);

    OrganizationDeptUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrganizationDeptUser record, @Param("example") OrganizationDeptUserExample example);

    int updateByExample(@Param("record") OrganizationDeptUser record, @Param("example") OrganizationDeptUserExample example);

    int updateByPrimaryKeySelective(OrganizationDeptUser record);

    int updateByPrimaryKey(OrganizationDeptUser record);
}