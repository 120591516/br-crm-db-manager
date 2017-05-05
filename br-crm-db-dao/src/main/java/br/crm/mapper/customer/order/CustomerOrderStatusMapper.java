package br.crm.mapper.customer.order;

import br.crm.pojo.customer.order.CustomerOrderStatus;
import br.crm.pojo.customer.order.CustomerOrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderStatusMapper {
    int countByExample(CustomerOrderStatusExample example);

    int deleteByExample(CustomerOrderStatusExample example);

    int deleteByPrimaryKey(Integer customerOrderStatusId);

    int insert(CustomerOrderStatus record);

    int insertSelective(CustomerOrderStatus record);

    List<CustomerOrderStatus> selectByExample(CustomerOrderStatusExample example);

    CustomerOrderStatus selectByPrimaryKey(Integer customerOrderStatusId);

    int updateByExampleSelective(@Param("record") CustomerOrderStatus record, @Param("example") CustomerOrderStatusExample example);

    int updateByExample(@Param("record") CustomerOrderStatus record, @Param("example") CustomerOrderStatusExample example);

    int updateByPrimaryKeySelective(CustomerOrderStatus record);

    int updateByPrimaryKey(CustomerOrderStatus record);
}