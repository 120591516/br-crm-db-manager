package br.crm.service.impl.customer.cart;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.pool.GetConnectionTimeoutException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.cart.CustomerCartFeeItemMapper;
import br.crm.pojo.customer.cart.CustomerCartExample;
import br.crm.pojo.customer.cart.CustomerCartFeeItem;
import br.crm.pojo.customer.cart.CustomerCartFeeItemExample;
import br.crm.pojo.customer.cart.CustomerCartFeeItemExample.Criteria;
import br.crm.service.customer.cart.CustomerCartFeeItemService;

/**
 * @ClassName: CustomerCartFeeItemServiceImpl
 * @Description: TODO
 * @author server
 * @date 2016年11月1日 下午4:31:04
 */
@Service
public class CustomerCartFeeItemServiceImpl implements CustomerCartFeeItemService {
	
	@Autowired
	private CustomerCartFeeItemMapper  customerCartFeeItemMapper;

	/**
		 * <p>Title:getCustomerCartFeeItemByPage</p> 
		 * <p>Description：分页列表 </p> 
		 * @param page
		 * @param rows
		 * @param customerCartFeeItem
		 * @return
	     * @see br.crm.service.customer.cart.CustomerCartFeeItemService#getCustomerCartFeeItemByPage(java.lang.Integer, java.lang.Integer, br.crm.pojo.customer.cart.CustomerCartFeeItem)
		 */
	@Override
	public PageInfo<CustomerCartFeeItem> getCustomerCartFeeItemByPage(Integer page, Integer rows,
			CustomerCartFeeItem customerCartFeeItem) {
		PageHelper.startPage(page, rows);
		CustomerCartFeeItemExample example = new CustomerCartFeeItemExample();
		example.createCriteria().andCustomerCartFeeItemStatusEqualTo(0);
		List<CustomerCartFeeItem> list = customerCartFeeItemMapper.selectByExample(example );
		PageInfo<CustomerCartFeeItem>pageInfo = new PageInfo<CustomerCartFeeItem>(list);
		return pageInfo;
	}

	@Override
	public List<CustomerCartFeeItem> getAllCustomerCartFeeItem() {
		CustomerCartFeeItemExample example = new CustomerCartFeeItemExample();
		example.createCriteria().andCustomerCartFeeItemStatusEqualTo(0);
		return customerCartFeeItemMapper.selectByExample(example );
		
	}

	@Override
	public CustomerCartFeeItem getCustomerCartFeeItemById(String customerCartFeeItemId) {
		return customerCartFeeItemMapper.selectByPrimaryKey(customerCartFeeItemId);
	}

	@Override
	public int insertCustomerCartFeeItem(CustomerCartFeeItem customerCartFeeItem) {
		customerCartFeeItem.setCustomerCartFeeItemId(UUIDUtils.getId());    
		customerCartFeeItem.setCustomerCartFeeItemStatus(0);
		customerCartFeeItem.setCustomerCartFeeItemCreateTime(new Date());
		customerCartFeeItem.setCustomerCartFeeItemEditTime(customerCartFeeItem.getCustomerCartFeeItemCreateTime());		
		return customerCartFeeItemMapper.insertSelective(customerCartFeeItem);
	}

	@Override
	public int updateCustomerCartFeeItem(CustomerCartFeeItem customerCartFeeItem) {
		customerCartFeeItem.setCustomerCartFeeItemEditTime(new Date());
		return customerCartFeeItemMapper.updateByPrimaryKeySelective(customerCartFeeItem);
	}

	@Override
	public List<CustomerCartFeeItem> getCustomerCartFeeItemBycartId(String cartId) {
		CustomerCartFeeItemExample example = new CustomerCartFeeItemExample();
		Criteria criteria=example.createCriteria();
		criteria.andCustomerCartFeeItemStatusEqualTo(0);
		if(cartId!=null){			
			criteria.andCartIdEqualTo(cartId);
		}
		example.setOrderByClause("customer_cart_fee_item_create_time desc"); 
		 List<CustomerCartFeeItem> selectByExample = customerCartFeeItemMapper.selectByExample(example);
		 return selectByExample;
		
		
	}

}
