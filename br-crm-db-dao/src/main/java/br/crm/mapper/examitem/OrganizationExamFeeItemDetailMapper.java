package br.crm.mapper.examitem;

import br.crm.pojo.examitem.OrganizationExamFeeItemDetail;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamFeeItemDetailMapper {
    int countByExample(OrganizationExamFeeItemDetailExample example);

    int deleteByExample(OrganizationExamFeeItemDetailExample example);

    int deleteByPrimaryKey(String examFeeItemDetailId);

    int insert(OrganizationExamFeeItemDetail record);

    int insertSelective(OrganizationExamFeeItemDetail record);

    List<OrganizationExamFeeItemDetail> selectByExample(OrganizationExamFeeItemDetailExample example);

    OrganizationExamFeeItemDetail selectByPrimaryKey(String examFeeItemDetailId);

    int updateByExampleSelective(@Param("record") OrganizationExamFeeItemDetail record, @Param("example") OrganizationExamFeeItemDetailExample example);

    int updateByExample(@Param("record") OrganizationExamFeeItemDetail record, @Param("example") OrganizationExamFeeItemDetailExample example);

    int updateByPrimaryKeySelective(OrganizationExamFeeItemDetail record);

    int updateByPrimaryKey(OrganizationExamFeeItemDetail record);
}