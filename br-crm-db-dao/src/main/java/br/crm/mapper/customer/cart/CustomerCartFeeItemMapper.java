package br.crm.mapper.customer.cart;

import br.crm.pojo.customer.cart.CustomerCartFeeItem;
import br.crm.pojo.customer.cart.CustomerCartFeeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCartFeeItemMapper {
    int countByExample(CustomerCartFeeItemExample example);

    int deleteByExample(CustomerCartFeeItemExample example);

    int deleteByPrimaryKey(String customerCartFeeItemId);

    int insert(CustomerCartFeeItem record);

    int insertSelective(CustomerCartFeeItem record);

    List<CustomerCartFeeItem> selectByExample(CustomerCartFeeItemExample example);

    CustomerCartFeeItem selectByPrimaryKey(String customerCartFeeItemId);

    int updateByExampleSelective(@Param("record") CustomerCartFeeItem record, @Param("example") CustomerCartFeeItemExample example);

    int updateByExample(@Param("record") CustomerCartFeeItem record, @Param("example") CustomerCartFeeItemExample example);

    int updateByPrimaryKeySelective(CustomerCartFeeItem record);

    int updateByPrimaryKey(CustomerCartFeeItem record);
}