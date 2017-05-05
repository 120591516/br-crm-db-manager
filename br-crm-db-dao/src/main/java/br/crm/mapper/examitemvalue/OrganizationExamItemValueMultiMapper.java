package br.crm.mapper.examitemvalue;

import br.crm.pojo.examitemvalue.OrganizationExamItemValueMulti;
import br.crm.pojo.examitemvalue.OrganizationExamItemValueMultiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemValueMultiMapper {
    int countByExample(OrganizationExamItemValueMultiExample example);

    int deleteByExample(OrganizationExamItemValueMultiExample example);

    int deleteByPrimaryKey(String examItemValueMultiId);

    int insert(OrganizationExamItemValueMulti record);

    int insertSelective(OrganizationExamItemValueMulti record);

    List<OrganizationExamItemValueMulti> selectByExample(OrganizationExamItemValueMultiExample example);

    OrganizationExamItemValueMulti selectByPrimaryKey(String examItemValueMultiId);

    int updateByExampleSelective(@Param("record") OrganizationExamItemValueMulti record, @Param("example") OrganizationExamItemValueMultiExample example);

    int updateByExample(@Param("record") OrganizationExamItemValueMulti record, @Param("example") OrganizationExamItemValueMultiExample example);

    int updateByPrimaryKeySelective(OrganizationExamItemValueMulti record);

    int updateByPrimaryKey(OrganizationExamItemValueMulti record);
}