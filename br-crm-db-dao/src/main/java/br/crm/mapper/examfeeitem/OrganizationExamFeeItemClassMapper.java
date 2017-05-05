package br.crm.mapper.examfeeitem;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClass;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamFeeItemClassMapper {
    int countByExample(OrganizationExamFeeItemClassExample example);

    int deleteByExample(OrganizationExamFeeItemClassExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrganizationExamFeeItemClass record);

    int insertSelective(OrganizationExamFeeItemClass record);

    List<OrganizationExamFeeItemClass> selectByExample(OrganizationExamFeeItemClassExample example);

    OrganizationExamFeeItemClass selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrganizationExamFeeItemClass record, @Param("example") OrganizationExamFeeItemClassExample example);

    int updateByExample(@Param("record") OrganizationExamFeeItemClass record, @Param("example") OrganizationExamFeeItemClassExample example);

    int updateByPrimaryKeySelective(OrganizationExamFeeItemClass record);

    int updateByPrimaryKey(OrganizationExamFeeItemClass record);
}