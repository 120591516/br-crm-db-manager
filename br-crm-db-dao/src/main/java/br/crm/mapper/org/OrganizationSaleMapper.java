package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationSale;
import br.crm.pojo.org.OrganizationSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationSaleMapper {
    int countByExample(OrganizationSaleExample example);

    int deleteByExample(OrganizationSaleExample example);

    int deleteByPrimaryKey(Long orgSaleId);

    int insert(OrganizationSale record);

    Long insertSelective(OrganizationSale record);

    List<OrganizationSale> selectByExample(OrganizationSaleExample example);

    OrganizationSale selectByPrimaryKey(Long orgSaleId);

    int updateByExampleSelective(@Param("record") OrganizationSale record, @Param("example") OrganizationSaleExample example);

    int updateByExample(@Param("record") OrganizationSale record, @Param("example") OrganizationSaleExample example);

    int updateByPrimaryKeySelective(OrganizationSale record);

    int updateByPrimaryKey(OrganizationSale record);
}