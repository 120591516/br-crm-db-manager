package br.crm.mapper.dept;

import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.dept.OrganizationDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationDeptMapper {
    int countByExample(OrganizationDeptExample example);

    int deleteByExample(OrganizationDeptExample example);

    int deleteByPrimaryKey(String orgDeptId);

    int insert(OrganizationDept record);

    int insertSelective(OrganizationDept record);

    List<OrganizationDept> selectByExample(OrganizationDeptExample example);

    OrganizationDept selectByPrimaryKey(String orgDeptId);

    int updateByExampleSelective(@Param("record") OrganizationDept record, @Param("example") OrganizationDeptExample example);

    int updateByExample(@Param("record") OrganizationDept record, @Param("example") OrganizationDeptExample example);

    int updateByPrimaryKeySelective(OrganizationDept record);

    int updateByPrimaryKey(OrganizationDept record);
}