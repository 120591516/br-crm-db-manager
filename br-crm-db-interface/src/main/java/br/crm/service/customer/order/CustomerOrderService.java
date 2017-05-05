package br.crm.service.customer.order;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.vo.customer.order.CustomerOrderVo;
import br.order.user.vo.empUser.CustomerRegistVo;

public interface CustomerOrderService {
	
	PageInfo<CustomerOrderVo> getCustomerOrderByPage(Integer page,Integer rows,CustomerOrderVo customerOrderVo);
	
	
	List<CustomerOrder> getAllCustomerOrder();
	
	CustomerOrderVo getCustomerOrderById(String customerPatientName,String examSuiteId,String examTime);
	
	int insertCustomerOrder(CustomerOrder customerOrder);
	
	int updateCustomerOrder(CustomerOrder customerOrder);
	
	CustomerOrder getCustomerOrder(String orderNo);
	
	CustomerOrder getCustomerOrderById(String customerOrderId);

	List<Map<String,String>> addCustomerOrder(CustomerOrderVo customerOrderVo, CustomerRegistVo customer);
	
	int refundCustomerOrder(CustomerOrder customerOrder);
	
	void initData();
   
	void updateOrderStatu(String out_trade_no);


	PageInfo<CustomerOrderVo> getOrderByBranchId(String branchId, Integer page, Integer rows);

	
	
}
