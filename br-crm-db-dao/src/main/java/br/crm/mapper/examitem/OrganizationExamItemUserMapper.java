package br.crm.mapper.examitem;

import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.examitem.OrganizationExamItemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationExamItemUserMapper {
    int countByExample(OrganizationExamItemUserExample example);

    int deleteByExample(OrganizationExamItemUserExample example);

    int deleteByPrimaryKey(String organizationExamItemUserId);

    int insert(OrganizationExamItemUser record);

    int insertSelective(OrganizationExamItemUser record);

    List<OrganizationExamItemUser> selectByExample(OrganizationExamItemUserExample example);

    OrganizationExamItemUser selectByPrimaryKey(String organizationExamItemUserId);

    int updateByExampleSelective(@Param("record") OrganizationExamItemUser record, @Param("example") OrganizationExamItemUserExample example);

    int updateByExample(@Param("record") OrganizationExamItemUser record, @Param("example") OrganizationExamItemUserExample example);

    int updateByPrimaryKeySelective(OrganizationExamItemUser record);

    int updateByPrimaryKey(OrganizationExamItemUser record);
}