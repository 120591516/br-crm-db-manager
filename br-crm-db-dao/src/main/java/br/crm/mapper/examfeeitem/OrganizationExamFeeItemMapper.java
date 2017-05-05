package br.crm.mapper.examfeeitem;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamFeeItemMapper {
	
    int countByExample(OrganizationExamFeeItemExample example);

    int deleteByExample(OrganizationExamFeeItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrganizationExamFeeItem record);

    int insertSelective(OrganizationExamFeeItem record);

    List<OrganizationExamFeeItem> selectByExample(OrganizationExamFeeItemExample example);

    OrganizationExamFeeItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrganizationExamFeeItem record, @Param("example") OrganizationExamFeeItemExample example);

    int updateByExample(@Param("record") OrganizationExamFeeItem record, @Param("example") OrganizationExamFeeItemExample example);

    int updateByPrimaryKeySelective(OrganizationExamFeeItem record);

    int updateByPrimaryKey(OrganizationExamFeeItem record);
}