package br.crm.mapper.group;

import br.crm.pojo.group.EnterpriseGroupSuite;
import br.crm.pojo.group.EnterpriseGroupSuiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseGroupSuiteMapper {
    int countByExample(EnterpriseGroupSuiteExample example);

    int deleteByExample(EnterpriseGroupSuiteExample example);

    int deleteByPrimaryKey(String enterpriseGroupSuiteId);

    int insert(EnterpriseGroupSuite record);

    int insertSelective(EnterpriseGroupSuite record);

    List<EnterpriseGroupSuite> selectByExample(EnterpriseGroupSuiteExample example);

    EnterpriseGroupSuite selectByPrimaryKey(String enterpriseGroupSuiteId);

    int updateByExampleSelective(@Param("record") EnterpriseGroupSuite record, @Param("example") EnterpriseGroupSuiteExample example);

    int updateByExample(@Param("record") EnterpriseGroupSuite record, @Param("example") EnterpriseGroupSuiteExample example);

    int updateByPrimaryKeySelective(EnterpriseGroupSuite record);

    int updateByPrimaryKey(EnterpriseGroupSuite record);
}