package br.crm.mapper.customer.order;

import br.crm.pojo.customer.order.CustomerOrderRefund;
import br.crm.pojo.customer.order.CustomerOrderRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderRefundMapper {
    int countByExample(CustomerOrderRefundExample example);

    int deleteByExample(CustomerOrderRefundExample example);

    int deleteByPrimaryKey(String customerOrderRefundId);

    int insert(CustomerOrderRefund record);

    int insertSelective(CustomerOrderRefund record);

    List<CustomerOrderRefund> selectByExample(CustomerOrderRefundExample example);

    CustomerOrderRefund selectByPrimaryKey(String customerOrderRefundId);

    int updateByExampleSelective(@Param("record") CustomerOrderRefund record, @Param("example") CustomerOrderRefundExample example);

    int updateByExample(@Param("record") CustomerOrderRefund record, @Param("example") CustomerOrderRefundExample example);

    int updateByPrimaryKeySelective(CustomerOrderRefund record);

    int updateByPrimaryKey(CustomerOrderRefund record);
}