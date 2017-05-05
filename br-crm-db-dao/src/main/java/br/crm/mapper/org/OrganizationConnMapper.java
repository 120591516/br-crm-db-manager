package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationConn;
import br.crm.pojo.org.OrganizationConnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationConnMapper {
    int countByExample(OrganizationConnExample example);

    int deleteByExample(OrganizationConnExample example);

    int deleteByPrimaryKey(Long orgConnId);

    int insert(OrganizationConn record);

    Long insertSelective(OrganizationConn record);

    List<OrganizationConn> selectByExample(OrganizationConnExample example);

    OrganizationConn selectByPrimaryKey(Long orgConnId);

    int updateByExampleSelective(@Param("record") OrganizationConn record, @Param("example") OrganizationConnExample example);

    int updateByExample(@Param("record") OrganizationConn record, @Param("example") OrganizationConnExample example);

    int updateByPrimaryKeySelective(OrganizationConn record);

    int updateByPrimaryKey(OrganizationConn record);
}