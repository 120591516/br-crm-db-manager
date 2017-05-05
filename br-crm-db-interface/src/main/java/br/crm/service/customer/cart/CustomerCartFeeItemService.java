package br.crm.service.customer.cart;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.cart.CustomerCartFeeItem;

public interface CustomerCartFeeItemService {
	
	PageInfo<CustomerCartFeeItem> getCustomerCartFeeItemByPage(Integer page, Integer rows,CustomerCartFeeItem customerCartFeeItem);
	
	List<CustomerCartFeeItem> getAllCustomerCartFeeItem();
	
	CustomerCartFeeItem getCustomerCartFeeItemById(String customerCartFeeItemId);
	
	int insertCustomerCartFeeItem(CustomerCartFeeItem customerCartFeeItem);
	
	int updateCustomerCartFeeItem(CustomerCartFeeItem customerCartFeeItem);
	
	List<CustomerCartFeeItem> getCustomerCartFeeItemBycartId(String cartId);
}
