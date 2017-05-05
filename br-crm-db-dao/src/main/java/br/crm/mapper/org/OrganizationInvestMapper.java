package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationInvest;
import br.crm.pojo.org.OrganizationInvestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationInvestMapper {
    int countByExample(OrganizationInvestExample example);

    int deleteByExample(OrganizationInvestExample example);

    int deleteByPrimaryKey(Long orgInvestId);

    int insert(OrganizationInvest record);

    Long insertSelective(OrganizationInvest record);

    List<OrganizationInvest> selectByExample(OrganizationInvestExample example);

    OrganizationInvest selectByPrimaryKey(Long orgInvestId);

    int updateByExampleSelective(@Param("record") OrganizationInvest record, @Param("example") OrganizationInvestExample example);

    int updateByExample(@Param("record") OrganizationInvest record, @Param("example") OrganizationInvestExample example);

    int updateByPrimaryKeySelective(OrganizationInvest record);

    int updateByPrimaryKey(OrganizationInvest record);
}