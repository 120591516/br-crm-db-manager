package br.crm.mapper.customer.order;

import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.pojo.customer.order.CustomerOrderPayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderPayInfoMapper {
    int countByExample(CustomerOrderPayInfoExample example);

    int deleteByExample(CustomerOrderPayInfoExample example);

    int deleteByPrimaryKey(String customerOrderPayInfoId);

    int insert(CustomerOrderPayInfo record);

    int insertSelective(CustomerOrderPayInfo record);

    List<CustomerOrderPayInfo> selectByExample(CustomerOrderPayInfoExample example);

    CustomerOrderPayInfo selectByPrimaryKey(String customerOrderPayInfoId);

    int updateByExampleSelective(@Param("record") CustomerOrderPayInfo record, @Param("example") CustomerOrderPayInfoExample example);

    int updateByExample(@Param("record") CustomerOrderPayInfo record, @Param("example") CustomerOrderPayInfoExample example);

    int updateByPrimaryKeySelective(CustomerOrderPayInfo record);

    int updateByPrimaryKey(CustomerOrderPayInfo record);
}