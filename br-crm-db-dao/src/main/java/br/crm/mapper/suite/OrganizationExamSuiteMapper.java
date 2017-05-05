package br.crm.mapper.suite;

import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamSuiteMapper {
    int countByExample(OrganizationExamSuiteExample example);

    int deleteByExample(OrganizationExamSuiteExample example);

    int deleteByPrimaryKey(String examSuiteId);

    int insert(OrganizationExamSuite record);

    int insertSelective(OrganizationExamSuite record);

    List<OrganizationExamSuite> selectByExampleWithBLOBs(OrganizationExamSuiteExample example);

    List<OrganizationExamSuite> selectByExample(OrganizationExamSuiteExample example);

    OrganizationExamSuite selectByPrimaryKey(String examSuiteId);

    int updateByExampleSelective(@Param("record") OrganizationExamSuite record, @Param("example") OrganizationExamSuiteExample example);

    int updateByExampleWithBLOBs(@Param("record") OrganizationExamSuite record, @Param("example") OrganizationExamSuiteExample example);

    int updateByExample(@Param("record") OrganizationExamSuite record, @Param("example") OrganizationExamSuiteExample example);

    int updateByPrimaryKeySelective(OrganizationExamSuite record);

    int updateByPrimaryKeyWithBLOBs(OrganizationExamSuite record);

    int updateByPrimaryKey(OrganizationExamSuite record);
}