package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationIncome;
import br.crm.pojo.org.OrganizationIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationIncomeMapper {
    int countByExample(OrganizationIncomeExample example);

    int deleteByExample(OrganizationIncomeExample example);

    int deleteByPrimaryKey(Long orgIncomeId);

    int insert(OrganizationIncome record);

    Long insertSelective(OrganizationIncome record);

    List<OrganizationIncome> selectByExample(OrganizationIncomeExample example);

    OrganizationIncome selectByPrimaryKey(Long orgIncomeId);

    int updateByExampleSelective(@Param("record") OrganizationIncome record, @Param("example") OrganizationIncomeExample example);

    int updateByExample(@Param("record") OrganizationIncome record, @Param("example") OrganizationIncomeExample example);

    int updateByPrimaryKeySelective(OrganizationIncome record);

    int updateByPrimaryKey(OrganizationIncome record);
}