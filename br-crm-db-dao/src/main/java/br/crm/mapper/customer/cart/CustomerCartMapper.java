package br.crm.mapper.customer.cart;

import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.pojo.customer.cart.CustomerCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCartMapper {
    int countByExample(CustomerCartExample example);

    int deleteByExample(CustomerCartExample example);

    int deleteByPrimaryKey(String cartId);

    int insert(CustomerCart record);

    int insertSelective(CustomerCart record);

    List<CustomerCart> selectByExample(CustomerCartExample example);

    CustomerCart selectByPrimaryKey(String cartId);

    int updateByExampleSelective(@Param("record") CustomerCart record, @Param("example") CustomerCartExample example);

    int updateByExample(@Param("record") CustomerCart record, @Param("example") CustomerCartExample example);

    int updateByPrimaryKeySelective(CustomerCart record);

    int updateByPrimaryKey(CustomerCart record);
}