package br.crm.mapper.suite;

import br.crm.pojo.suite.OrganizationExamSuiteFeeItem;
import br.crm.pojo.suite.OrganizationExamSuiteFeeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamSuiteFeeItemMapper {
    int countByExample(OrganizationExamSuiteFeeItemExample example);

    int deleteByExample(OrganizationExamSuiteFeeItemExample example);

    int deleteByPrimaryKey(String examFisId);

    int insert(OrganizationExamSuiteFeeItem record);

    int insertSelective(OrganizationExamSuiteFeeItem record);

    List<OrganizationExamSuiteFeeItem> selectByExample(OrganizationExamSuiteFeeItemExample example);

    OrganizationExamSuiteFeeItem selectByPrimaryKey(String examFisId);

    int updateByExampleSelective(@Param("record") OrganizationExamSuiteFeeItem record, @Param("example") OrganizationExamSuiteFeeItemExample example);

    int updateByExample(@Param("record") OrganizationExamSuiteFeeItem record, @Param("example") OrganizationExamSuiteFeeItemExample example);

    int updateByPrimaryKeySelective(OrganizationExamSuiteFeeItem record);

    int updateByPrimaryKey(OrganizationExamSuiteFeeItem record);
}