package br.crm.mapper.examfeeitem;

import br.crm.pojo.examfeeitem.OrganizationExamFeeItemSubject;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamFeeItemSubjectMapper {
    int countByExample(OrganizationExamFeeItemSubjectExample example);

    int deleteByExample(OrganizationExamFeeItemSubjectExample example);

    int deleteByPrimaryKey(String examFeeItemSubjectId);

    int insert(OrganizationExamFeeItemSubject record);

    int insertSelective(OrganizationExamFeeItemSubject record);

    List<OrganizationExamFeeItemSubject> selectByExample(OrganizationExamFeeItemSubjectExample example);

    OrganizationExamFeeItemSubject selectByPrimaryKey(String examFeeItemSubjectId);

    int updateByExampleSelective(@Param("record") OrganizationExamFeeItemSubject record, @Param("example") OrganizationExamFeeItemSubjectExample example);

    int updateByExample(@Param("record") OrganizationExamFeeItemSubject record, @Param("example") OrganizationExamFeeItemSubjectExample example);

    int updateByPrimaryKeySelective(OrganizationExamFeeItemSubject record);

    int updateByPrimaryKey(OrganizationExamFeeItemSubject record);
}