package br.crm.mapper.suite;

import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.crm.pojo.suite.OrganizationExamSuiteTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamSuiteTypeMapper {
    int countByExample(OrganizationExamSuiteTypeExample example);

    int deleteByExample(OrganizationExamSuiteTypeExample example);

    int deleteByPrimaryKey(Long examSuiteTypeId);

    int insert(OrganizationExamSuiteType record);

    int insertSelective(OrganizationExamSuiteType record);

    List<OrganizationExamSuiteType> selectByExample(OrganizationExamSuiteTypeExample example);

    OrganizationExamSuiteType selectByPrimaryKey(String examSuiteTypeId);

    int updateByExampleSelective(@Param("record") OrganizationExamSuiteType record, @Param("example") OrganizationExamSuiteTypeExample example);

    int updateByExample(@Param("record") OrganizationExamSuiteType record, @Param("example") OrganizationExamSuiteTypeExample example);

    int updateByPrimaryKeySelective(OrganizationExamSuiteType record);

    int updateByPrimaryKey(OrganizationExamSuiteType record);
}