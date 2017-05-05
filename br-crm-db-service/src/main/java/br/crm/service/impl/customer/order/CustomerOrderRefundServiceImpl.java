package br.crm.service.impl.customer.order;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo; 

import br.crm.common.utils.OrderIDUtils;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.order.CustomerOrderMapper;
import br.crm.mapper.customer.order.CustomerOrderRefundMapper;
import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderExample;
import br.crm.pojo.customer.order.CustomerOrderRefund;
import br.crm.pojo.customer.order.CustomerOrderRefundExample;
import br.crm.service.customer.order.CustomerOrderRefundService;

@Service
public class CustomerOrderRefundServiceImpl implements CustomerOrderRefundService {
	@Autowired
	private CustomerOrderRefundMapper customerOrderRefundMapper;
	
	@Autowired
	private CustomerOrderMapper customerOrderMapper;

	@Override
	public PageInfo<CustomerOrderRefund> getCustomerOrderRefundByPage(Integer page, Integer rows,
			CustomerOrderRefund customerOrderRefund) {
		PageHelper.startPage(page, rows);
		List<CustomerOrderRefund> list = customerOrderRefundMapper.selectByExample(null);
		 PageInfo<CustomerOrderRefund> pageInfo = new  PageInfo<CustomerOrderRefund>(list);
		return pageInfo;
	}

	@Override
	public List<CustomerOrderRefund> getAllCustomerOrderRefund() {
		return customerOrderRefundMapper.selectByExample(null);
	}

	@Override
	public CustomerOrderRefund getCustomerOrderRefundById(String customerOrderRefundId) {
		return customerOrderRefundMapper.selectByPrimaryKey(customerOrderRefundId);
	}
	
	@Override
	public CustomerOrderRefund getCustomerOrderRefundByOrderNO(String OrderNO) {
		CustomerOrderRefundExample example=new CustomerOrderRefundExample();
		example.createCriteria().andOrderNoEqualTo(OrderNO);
		List<CustomerOrderRefund> list = customerOrderRefundMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public int insertCustomerOrderRefund(CustomerOrderRefund customerOrderRefund) { 
		return customerOrderRefundMapper.insertSelective(customerOrderRefund);
	}
	
	
	
	@Override
	public int updateCustomerOrderRefund(CustomerOrderRefund customerOrderRefund) {
		return customerOrderRefundMapper.updateByPrimaryKeySelective(customerOrderRefund);
	} 
	
	
	@Override
	@Transactional
	public int insertRefundInfo(CustomerOrderRefund customerOrderRefund) { 
		customerOrderRefund.setCustomerOrderRefundId(UUIDUtils.getId());
		customerOrderRefund.setCustomerOrderRefundCreateTime(new Date());
		customerOrderRefund.setCustomerOrderRefundEditTime(customerOrderRefund.getCustomerOrderRefundCreateTime());
		customerOrderRefund.setOrderRefundResult(0);
		customerOrderRefund.setOrderRefundOrderNo(OrderIDUtils.getOrderRefundId()); 
		int r= customerOrderRefundMapper.insertSelective(customerOrderRefund);
		if(r>0){
			CustomerOrderExample exampleOder = new CustomerOrderExample();
			exampleOder.createCriteria().andOrderNoEqualTo(customerOrderRefund.getOrderNo());
			CustomerOrder customerOrder = customerOrderMapper.selectByExample(exampleOder).get(0);
			customerOrder.setOrderStatus(30);
			customerOrder.setCustomerOrderEditTime(new Date());
			return  customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
		} 
		return 0;
	}
	
 
	@Override
	@Transactional
	public int updateRefundInfo(CustomerOrderRefund suCustomerOrderRefund) {
		suCustomerOrderRefund.setOrderRefundResult(1);
		suCustomerOrderRefund.setCustomerOrderRefundEditTime(new Date());
		int r =customerOrderRefundMapper.updateByPrimaryKeySelective(suCustomerOrderRefund);
		if(r>0){
			CustomerOrderRefundExample example=new CustomerOrderRefundExample();
			example.createCriteria().andOrderRefundOrderNoEqualTo(suCustomerOrderRefund.getOrderRefundOrderNo());
			CustomerOrderRefund refundInfo=customerOrderRefundMapper.selectByExample(example).get(0);
			if(refundInfo!=null&&refundInfo.getOrderNo()!=null){
				CustomerOrderExample exampleOder = new CustomerOrderExample();
				exampleOder.createCriteria().andOrderNoEqualTo(refundInfo.getOrderNo());
				CustomerOrder customerOrder = customerOrderMapper.selectByExample(exampleOder).get(0);
				customerOrder.setOrderStatus(35);
				customerOrder.setCustomerOrderEditTime(new Date());
				return  customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
			}
		}
		return 0;
	} 
	
	
	


}
