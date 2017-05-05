package br.crm.service.impl.customer.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.customer.order.CustomerOrderStatusMapper;
import br.crm.pojo.customer.order.CustomerOrderStatus;
import br.crm.service.customer.order.CustomerOrderStatusService;
@Service
public class CustomerOrderStatusServiceImpl implements CustomerOrderStatusService {
	
	@Autowired
	private CustomerOrderStatusMapper customerOrderStatusMapper;

	@Override
	public List<Map<String, String>> getCustomerOrderStatusList() {
		List<Map<String, String>> result = new ArrayList<>();
		List<CustomerOrderStatus> list = customerOrderStatusMapper.selectByExample(null);
		if(CollectionUtils.isNotEmpty(list)){
			for (CustomerOrderStatus customerOrderStatus : list) {
				Map<String,String> map = new HashMap<String,String>();
				map.put("statusId", customerOrderStatus.getCustomerOrderStatusId()+"");
				map.put("statusName", customerOrderStatus.getCustomerOrderStatusName());
				result.add(map);
			}
		}
		return result;
	}

}
