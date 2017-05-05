package br.crm.mapper.suite;

import br.crm.pojo.suite.*; 
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamSuiteHidMapper {
    int countByExample(OrganizationExamSuiteHidExample example);

    int deleteByExample(OrganizationExamSuiteHidExample example);

    int deleteByPrimaryKey(String oesHidId);

    int insert(OrganizationExamSuiteHid record);

    int insertSelective(OrganizationExamSuiteHid record);

    List<OrganizationExamSuiteHid> selectByExample(OrganizationExamSuiteHidExample example);

    OrganizationExamSuiteHid selectByPrimaryKey(String oesHidId);

    int updateByExampleSelective(@Param("record") OrganizationExamSuiteHid record, @Param("example") OrganizationExamSuiteHidExample example);

    int updateByExample(@Param("record") OrganizationExamSuiteHid record, @Param("example") OrganizationExamSuiteHidExample example);

    int updateByPrimaryKeySelective(OrganizationExamSuiteHid record);

    int updateByPrimaryKey(OrganizationExamSuiteHid record);
}