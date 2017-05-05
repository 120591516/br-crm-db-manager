package br.crm.service.impl.customer.order;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.RedisConstant;
import br.crm.mapper.customer.order.CustomerOrderCartMapper;
import br.crm.pojo.customer.order.CustomerOrderCart;
import br.crm.pojo.customer.order.CustomerOrderCartExample;
import br.crm.pojo.customer.order.CustomerOrderCartExample.Criteria;
import br.crm.service.customer.order.CustomerOrderCartService;
import br.order.redis.redis.RedisService;
@Service
public class CustomerOrderCartServiceImpl implements CustomerOrderCartService {
	@Autowired
	private CustomerOrderCartMapper customerOrderCartMapper;
	
	@Autowired
	private RedisService redisService;	


	@Override
	public void initData() {
		
		List<CustomerOrderCart> list = customerOrderCartMapper.selectByExample(null);
		if(CollectionUtils.isNotEmpty(list)){
			for (CustomerOrderCart customerOrderCart : list) {
				//缓存用户预约中间表id
				if(!redisService.exists(RedisConstant.br_customer_orderCart_id.concat(customerOrderCart.getCustomerCartId()))){
					redisService.set(RedisConstant.br_customer_orderCart_id.concat(customerOrderCart.getCustomerCartId()),
							JSONObject.toJSONString(customerOrderCart));
				}
				//缓存购物车的id
				List<String>cartList = new ArrayList<String>();
				if(redisService.exists(RedisConstant.br_customer_orderCart_customerOrderNo.concat(customerOrderCart.getCustomerOrderNo()))){
					cartList =JSONObject.parseArray(redisService.get(RedisConstant.br_customer_orderCart_customerOrderNo.concat(customerOrderCart.getCustomerOrderNo())),
							String.class) ;
				}
				if(!cartList.contains(customerOrderCart.getCustomerCartId())){
					cartList.add(customerOrderCart.getCustomerCartId());
				}
				redisService.set(RedisConstant.br_customer_orderCart_customerOrderNo.concat(customerOrderCart.getCustomerOrderNo()),
						JSONObject.toJSONString(cartList));
			}
		}
		
		
	}

	@Override
	public List<String> getCartIdByCustomerOrderId(String customerOrderNo) {
		CustomerOrderCartExample example = new CustomerOrderCartExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCustomerOrderNoEqualTo(customerOrderNo);
		List<CustomerOrderCart> list = customerOrderCartMapper.selectByExample(example );
		List<String> cartIdList = null;
		if(CollectionUtils.isNotEmpty(list)){
			for (CustomerOrderCart customerOrderCart : list) {
				cartIdList = new ArrayList<String>();
				cartIdList.add(customerOrderCart.getCustomerCartId());
			}
		}
		return cartIdList;
	}

	@Override
	public List<String> getCustomerOrderNoByBranchId(String orgBranchId) {
		CustomerOrderCartExample example = new CustomerOrderCartExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andOrgBranchIdEqualTo(orgBranchId);
		List<CustomerOrderCart> list = customerOrderCartMapper.selectByExample(example);
		List<String> customerOrderNoList = null;
		if(CollectionUtils.isNotEmpty(list)){
			for (CustomerOrderCart customerOrderCart : list) {
				customerOrderNoList = new ArrayList<String>();
				customerOrderNoList.add(customerOrderCart.getCustomerOrderNo());
			}
		}
		return customerOrderNoList;
		
	}

}
