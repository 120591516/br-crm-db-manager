package br.crm.mapper.examitem;

import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemMapper {
    int countByExample(OrganizationExamItemExample example);

    int deleteByExample(OrganizationExamItemExample example);

    int deleteByPrimaryKey(String examItemId);

    int insert(OrganizationExamItem record);

    int insertSelective(OrganizationExamItem record);

    List<OrganizationExamItem> selectByExampleWithBLOBs(OrganizationExamItemExample example);

    List<OrganizationExamItem> selectByExample(OrganizationExamItemExample example);

    OrganizationExamItem selectByPrimaryKey(String examItemId);

    int updateByExampleSelective(@Param("record") OrganizationExamItem record, @Param("example") OrganizationExamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") OrganizationExamItem record, @Param("example") OrganizationExamItemExample example);

    int updateByExample(@Param("record") OrganizationExamItem record, @Param("example") OrganizationExamItemExample example);

    int updateByPrimaryKeySelective(OrganizationExamItem record);

    int updateByPrimaryKeyWithBLOBs(OrganizationExamItem record);

    int updateByPrimaryKey(OrganizationExamItem record);
}