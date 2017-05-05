package br.crm.service.customer.cart;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.vo.customer.cart.CustomerCartVo;
import br.order.user.vo.empUser.CustomerRegistVo;


public interface CustomerCartService {	
	
	List<CustomerCartVo> getCustomerCartByPage(String customerInfoId);
	
	List<CustomerCart> getAllCustomerCart();
	
	int insertCustomerCart (CustomerRegistVo customer, CustomerCartVo customerCartVo);
	
	int updateCustomerCart(CustomerCart customerCart);
	
	List<CustomerCart> getCustomerCart(String customerId);

	int delectCustomerCart(List<String> cartId);

	CustomerCartVo getCustomerCartById(String customerInfoId, String cartId);
    
    int getBranchSuiteCount(String suiteId, String branchId, String date);

	int getOrderState(String orderNo);
	
	CustomerCart getCustomerCartByCartId(String cartId);
    

}
