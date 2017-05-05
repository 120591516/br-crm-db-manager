package br.crm.service.customer.order;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.order.CustomerOrderRefund;

public interface CustomerOrderRefundService {
	
	PageInfo<CustomerOrderRefund> getCustomerOrderRefundByPage(Integer page,Integer rows, CustomerOrderRefund customerOrderRefund);
	
	List<CustomerOrderRefund> getAllCustomerOrderRefund();
	
	CustomerOrderRefund getCustomerOrderRefundById(String customerOrderRefundId);
	
	CustomerOrderRefund getCustomerOrderRefundByOrderNO(String OrderNO);
	
	int insertCustomerOrderRefund(CustomerOrderRefund customerOrderRefund);
	
	int updateCustomerOrderRefund(CustomerOrderRefund customerOrderRefund);
	
	int updateRefundInfo(CustomerOrderRefund customerOrderRefund);
	
	int insertRefundInfo(CustomerOrderRefund customerOrderRefund);
	
	

}
