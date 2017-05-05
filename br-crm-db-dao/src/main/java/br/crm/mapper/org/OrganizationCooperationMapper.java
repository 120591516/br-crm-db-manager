package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationCooperation;
import br.crm.pojo.org.OrganizationCooperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationCooperationMapper {
    int countByExample(OrganizationCooperationExample example);

    int deleteByExample(OrganizationCooperationExample example);

    int deleteByPrimaryKey(Long orgCooperationId);

    int insert(OrganizationCooperation record);

    Long insertSelective(OrganizationCooperation record);

    List<OrganizationCooperation> selectByExample(OrganizationCooperationExample example);

    OrganizationCooperation selectByPrimaryKey(Long orgCooperationId);

    int updateByExampleSelective(@Param("record") OrganizationCooperation record, @Param("example") OrganizationCooperationExample example);

    int updateByExample(@Param("record") OrganizationCooperation record, @Param("example") OrganizationCooperationExample example);

    int updateByPrimaryKeySelective(OrganizationCooperation record);

    int updateByPrimaryKey(OrganizationCooperation record);
}