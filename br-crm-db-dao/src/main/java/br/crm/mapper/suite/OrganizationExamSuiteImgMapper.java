package br.crm.mapper.suite;

import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamSuiteImgMapper {
    int countByExample(OrganizationExamSuiteImgExample example);

    int deleteByExample(OrganizationExamSuiteImgExample example);

    int deleteByPrimaryKey(String orgExamSuiteImgId);

    int insert(OrganizationExamSuiteImg record);

    int insertSelective(OrganizationExamSuiteImg record);

    List<OrganizationExamSuiteImg> selectByExample(OrganizationExamSuiteImgExample example);

    OrganizationExamSuiteImg selectByPrimaryKey(String orgExamSuiteImgId);

    int updateByExampleSelective(@Param("record") OrganizationExamSuiteImg record, @Param("example") OrganizationExamSuiteImgExample example);

    int updateByExample(@Param("record") OrganizationExamSuiteImg record, @Param("example") OrganizationExamSuiteImgExample example);

    int updateByPrimaryKeySelective(OrganizationExamSuiteImg record);

    int updateByPrimaryKey(OrganizationExamSuiteImg record);
}