package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationLevel;
import br.crm.pojo.org.OrganizationLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationLevelMapper {
    int countByExample(OrganizationLevelExample example);

    int deleteByExample(OrganizationLevelExample example);

    int deleteByPrimaryKey(Integer orgLevelId);

    int insert(OrganizationLevel record);

    int insertSelective(OrganizationLevel record);

    List<OrganizationLevel> selectByExample(OrganizationLevelExample example);

    OrganizationLevel selectByPrimaryKey(Integer orgLevelId);

    int updateByExampleSelective(@Param("record") OrganizationLevel record, @Param("example") OrganizationLevelExample example);

    int updateByExample(@Param("record") OrganizationLevel record, @Param("example") OrganizationLevelExample example);

    int updateByPrimaryKeySelective(OrganizationLevel record);

    int updateByPrimaryKey(OrganizationLevel record);
}