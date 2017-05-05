package br.crm.service.customer.order;

import java.util.List;

public interface CustomerOrderCartService {
	void initData();
	
	List<String> getCartIdByCustomerOrderId(String customerOrderNo);
	
	List<String> getCustomerOrderNoByBranchId(String orgBranchId);
}
