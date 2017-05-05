package br.crm.service.customer.order;

import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;

public interface CustomerOrderPayNoticeService {
	int updateCustomerPayNotice(CustomerOrder customerOrder,CustomerOrderPayInfo customerOrderPayInfo);
	int updateCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo);

}
