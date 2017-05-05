package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationSoft;
import br.crm.pojo.org.OrganizationSoftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationSoftMapper {
    int countByExample(OrganizationSoftExample example);

    int deleteByExample(OrganizationSoftExample example);

    int deleteByPrimaryKey(Long orgSoftId);

    int insert(OrganizationSoft record);

    Long insertSelective(OrganizationSoft record);

    List<OrganizationSoft> selectByExample(OrganizationSoftExample example);

    OrganizationSoft selectByPrimaryKey(Long orgSoftId);

    int updateByExampleSelective(@Param("record") OrganizationSoft record, @Param("example") OrganizationSoftExample example);

    int updateByExample(@Param("record") OrganizationSoft record, @Param("example") OrganizationSoftExample example);

    int updateByPrimaryKeySelective(OrganizationSoft record);

    int updateByPrimaryKey(OrganizationSoft record);
}