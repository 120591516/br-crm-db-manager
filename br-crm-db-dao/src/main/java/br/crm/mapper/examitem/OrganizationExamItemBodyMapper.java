package br.crm.mapper.examitem;

import br.crm.pojo.examitem.OrganizationExamItemBody;
import br.crm.pojo.examitem.OrganizationExamItemBodyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemBodyMapper {
    int countByExample(OrganizationExamItemBodyExample example);

    int deleteByExample(OrganizationExamItemBodyExample example);

    int deleteByPrimaryKey(String examItemBodyId);

    int insert(OrganizationExamItemBody record);

    int insertSelective(OrganizationExamItemBody record);

    List<OrganizationExamItemBody> selectByExample(OrganizationExamItemBodyExample example);

    OrganizationExamItemBody selectByPrimaryKey(String examItemBodyId);

    int updateByExampleSelective(@Param("record") OrganizationExamItemBody record, @Param("example") OrganizationExamItemBodyExample example);

    int updateByExample(@Param("record") OrganizationExamItemBody record, @Param("example") OrganizationExamItemBodyExample example);

    int updateByPrimaryKeySelective(OrganizationExamItemBody record);

    int updateByPrimaryKey(OrganizationExamItemBody record);
}