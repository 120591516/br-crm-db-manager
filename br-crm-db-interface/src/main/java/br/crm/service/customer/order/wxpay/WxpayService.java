package br.crm.service.customer.order.wxpay;

import java.util.Map;

import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;

public interface WxpayService{

	
	//付款接口
	public String createOrderInfo(CustomerOrder customerOrder);
	//退款方法
	public Map<String,String> refund(CustomerOrder customerOrder,CustomerOrderPayInfo customerOrderPayInfo,String orderRefundId);
	
}
