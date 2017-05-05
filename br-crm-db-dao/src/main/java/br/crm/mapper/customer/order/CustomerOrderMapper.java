package br.crm.mapper.customer.order;

import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderMapper {
    int countByExample(CustomerOrderExample example);

    int deleteByExample(CustomerOrderExample example);

    int deleteByPrimaryKey(String customerOrderId);

    int insert(CustomerOrder record);

    int insertSelective(CustomerOrder record);

    List<CustomerOrder> selectByExample(CustomerOrderExample example);

    CustomerOrder selectByPrimaryKey(String customerOrderId);

    int updateByExampleSelective(@Param("record") CustomerOrder record, @Param("example") CustomerOrderExample example);

    int updateByExample(@Param("record") CustomerOrder record, @Param("example") CustomerOrderExample example);

    int updateByPrimaryKeySelective(CustomerOrder record);

    int updateByPrimaryKey(CustomerOrder record);
}