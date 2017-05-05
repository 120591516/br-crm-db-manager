package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationEmail;
import br.crm.pojo.org.OrganizationEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationEmailMapper {
    int countByExample(OrganizationEmailExample example);

    int deleteByExample(OrganizationEmailExample example);

    int deleteByPrimaryKey(Long orgEmailId);

    int insert(OrganizationEmail record);

    int insertSelective(OrganizationEmail record);

    List<OrganizationEmail> selectByExample(OrganizationEmailExample example);

    OrganizationEmail selectByPrimaryKey(Long orgEmailId);

    int updateByExampleSelective(@Param("record") OrganizationEmail record, @Param("example") OrganizationEmailExample example);

    int updateByExample(@Param("record") OrganizationEmail record, @Param("example") OrganizationEmailExample example);

    int updateByPrimaryKeySelective(OrganizationEmail record);

    int updateByPrimaryKey(OrganizationEmail record);
}