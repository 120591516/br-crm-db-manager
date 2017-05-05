package br.crm.mapper.examitemvalue;

import br.crm.pojo.examitemvalue.OrganizationExamItemValue;
import br.crm.pojo.examitemvalue.OrganizationExamItemValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemValueMapper {
    int countByExample(OrganizationExamItemValueExample example);

    int deleteByExample(OrganizationExamItemValueExample example);

    int deleteByPrimaryKey(String examItemValueId);

    int insert(OrganizationExamItemValue record);

    int insertSelective(OrganizationExamItemValue record);

    List<OrganizationExamItemValue> selectByExample(OrganizationExamItemValueExample example);

    OrganizationExamItemValue selectByPrimaryKey(String examItemValueId);

    int updateByExampleSelective(@Param("record") OrganizationExamItemValue record, @Param("example") OrganizationExamItemValueExample example);

    int updateByExample(@Param("record") OrganizationExamItemValue record, @Param("example") OrganizationExamItemValueExample example);

    int updateByPrimaryKeySelective(OrganizationExamItemValue record);

    int updateByPrimaryKey(OrganizationExamItemValue record);
}