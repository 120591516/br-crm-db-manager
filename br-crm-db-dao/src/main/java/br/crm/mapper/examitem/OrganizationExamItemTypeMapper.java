package br.crm.mapper.examitem;

import br.crm.pojo.examitem.OrganizationExamItemType;
import br.crm.pojo.examitem.OrganizationExamItemTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemTypeMapper {
    int countByExample(OrganizationExamItemTypeExample example);

    int deleteByExample(OrganizationExamItemTypeExample example);

    int deleteByPrimaryKey(String examItemTypeId);

    int insert(OrganizationExamItemType record);

    int insertSelective(OrganizationExamItemType record);

    List<OrganizationExamItemType> selectByExample(OrganizationExamItemTypeExample example);

    OrganizationExamItemType selectByPrimaryKey(String examItemTypeId);

    int updateByExampleSelective(@Param("record") OrganizationExamItemType record, @Param("example") OrganizationExamItemTypeExample example);

    int updateByExample(@Param("record") OrganizationExamItemType record, @Param("example") OrganizationExamItemTypeExample example);

    int updateByPrimaryKeySelective(OrganizationExamItemType record);

    int updateByPrimaryKey(OrganizationExamItemType record);
}