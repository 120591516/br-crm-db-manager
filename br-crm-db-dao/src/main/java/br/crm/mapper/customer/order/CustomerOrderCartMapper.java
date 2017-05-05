package br.crm.mapper.customer.order;

import br.crm.pojo.customer.order.CustomerOrderCart;
import br.crm.pojo.customer.order.CustomerOrderCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderCartMapper {
    int countByExample(CustomerOrderCartExample example);

    int deleteByExample(CustomerOrderCartExample example);

    int deleteByPrimaryKey(String customerOrderCartId);

    int insert(CustomerOrderCart record);

    int insertSelective(CustomerOrderCart record);

    List<CustomerOrderCart> selectByExample(CustomerOrderCartExample example);

    CustomerOrderCart selectByPrimaryKey(String customerOrderCartId);

    int updateByExampleSelective(@Param("record") CustomerOrderCart record, @Param("example") CustomerOrderCartExample example);

    int updateByExample(@Param("record") CustomerOrderCart record, @Param("example") CustomerOrderCartExample example);

    int updateByPrimaryKeySelective(CustomerOrderCart record);

    int updateByPrimaryKey(CustomerOrderCart record);
}