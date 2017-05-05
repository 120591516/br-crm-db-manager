package br.crm.service.impl.customer.order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.cart.CustomerCartMapper;
import br.crm.mapper.customer.order.CustomerOrderMapper;
import br.crm.mapper.customer.order.CustomerOrderPayInfoMapper;
import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.pojo.customer.cart.CustomerCartExample;
import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderExample;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.pojo.customer.order.CustomerOrderPayInfoExample;
import br.crm.pojo.customer.order.CustomerOrderPayInfoExample.Criteria;
import br.crm.service.customer.order.CustomerOrderPayInfoService;
import br.order.redis.redis.RedisService;
import br.crm.vo.order.CustomerOrderPayInfoVo;

/**
 * @ClassName: CustomerOrderPayInfoServiceImpl
 * @Description: TODO
 * @author server
 * @date 2016年11月1日 下午4:41:35
 */
@Service
public class CustomerOrderPayInfoServiceImpl implements CustomerOrderPayInfoService {
	@Autowired
	private CustomerOrderPayInfoMapper customerOrderPayInfoMapper;
	@Autowired
	private CustomerOrderMapper customerOrderMapper;
	@Autowired
	private CustomerCartMapper customerCartMapper;

	@Autowired
	private RedisService redisService;	


	@Override
	public PageInfo<CustomerOrderPayInfoVo> getCustomerOrderPayInfoByPage(Integer page, Integer rows,
			CustomerOrderPayInfoVo customerOrderPayInfoVo) {
		PageHelper.startPage(page, rows);
		CustomerOrderPayInfoExample emample = new CustomerOrderPayInfoExample();
		Criteria createCriteria = emample.createCriteria();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		if(customerOrderPayInfoVo.getEnterpriseId() != null){
			createCriteria.andEnterpriseIdEqualTo(customerOrderPayInfoVo.getEnterpriseId());
		}
		if(customerOrderPayInfoVo.getCustomerId() != null){
			createCriteria.andCustomerIdEqualTo(customerOrderPayInfoVo.getCustomerId());
		}
		if(!"".equals(customerOrderPayInfoVo.getOrderNo())&&customerOrderPayInfoVo.getOrderNo()!=null){			
  			createCriteria.andOrderNoEqualTo(customerOrderPayInfoVo.getOrderNo());
		}
		if(!"".equals(customerOrderPayInfoVo.getStartTime())&&customerOrderPayInfoVo.getStartTime()!=null){
			try {
				customerOrderPayInfoVo.setStartTime(customerOrderPayInfoVo.getStartTime().concat(" 00:00:00"));
				createCriteria.andCustomerOrderPayInfoCreateTimeGreaterThanOrEqualTo(format.parse(customerOrderPayInfoVo.getStartTime()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(!"".equals(customerOrderPayInfoVo.getEndTime())&&customerOrderPayInfoVo.getEndTime()!=null){
			try {
				customerOrderPayInfoVo.setEndTime(customerOrderPayInfoVo.getEndTime().concat(" 23:59:59"));
				createCriteria.andCustomerOrderPayInfoCreateTimeLessThanOrEqualTo(format.parse(customerOrderPayInfoVo.getEndTime()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		List<CustomerOrderPayInfo> list = customerOrderPayInfoMapper.selectByExample(emample);
		List<CustomerOrderPayInfoVo> listVo =new ArrayList<CustomerOrderPayInfoVo>();
		CustomerOrderPayInfoVo vo =null;
		try {			
			if(CollectionUtils.isNotEmpty(list)){	
				for (CustomerOrderPayInfo customerOrderPayInfo : list) {
					vo = new CustomerOrderPayInfoVo();
					BeanUtils.copyProperties(vo, customerOrderPayInfo);
					listVo.add(vo);
				}
		}  	  		  
	}		
	    catch (Exception e) {
			e.printStackTrace();
		} 
		PageInfo<CustomerOrderPayInfoVo> pageInfo = new PageInfo<CustomerOrderPayInfoVo>(listVo);
		return pageInfo;
	}

	@Override
	public List<CustomerOrderPayInfo> getAllCustomerOrderPayInfo() {
		return  customerOrderPayInfoMapper.selectByExample(null);
	}

	@Override
	public CustomerOrderPayInfoVo getCustomerOrderPayInfoById(String customerOrderPayInfoId) {
		 CustomerOrderPayInfoExample example = new CustomerOrderPayInfoExample();
		 example.createCriteria().andCustomerOrderPayInfoIdEqualTo(customerOrderPayInfoId);
		 CustomerOrderPayInfo customerOrderPayInfo = customerOrderPayInfoMapper.selectByExample(example).get(0);
		 CustomerOrderPayInfoVo vo =new CustomerOrderPayInfoVo();
		 try {
			BeanUtils.copyProperties(vo, customerOrderPayInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int insertCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo) {
		
		return customerOrderPayInfoMapper.insertSelective(customerOrderPayInfo);
	}

	@Override
	public int updateCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo) {
		return customerOrderPayInfoMapper.updateByPrimaryKeySelective(customerOrderPayInfo);
	}

	@Override
	public PageInfo<CustomerOrderPayInfoVo> getCustomerOrderPayInfo(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		CustomerOrderPayInfoExample example = new CustomerOrderPayInfoExample();
		example.createCriteria().andOrderPayResultEqualTo(2);
		List<CustomerOrderPayInfo> list = customerOrderPayInfoMapper.selectByExample(example);
		List<CustomerOrderPayInfoVo> vo = new ArrayList<CustomerOrderPayInfoVo>();
		List<String>cartList = null;	
		try {
			for (CustomerOrderPayInfo customerOrderPayInfo : list) {
				CustomerOrderExample example2 = new CustomerOrderExample();	
				example2.createCriteria().andOrderNoEqualTo(customerOrderPayInfo.getOrderNo());			
				CustomerOrder customerOrder = customerOrderMapper.selectByExample(example2).get(0);
				cartList = JSONObject.parseArray(redisService.get(RedisConstant.br_customer_orderCart_customerOrderNo.concat(customerOrder.getOrderNo())), 
						String.class);
				if(CollectionUtils.isNotEmpty(cartList)){
					for (String cartId : cartList) {
						CustomerCart cusCart = customerCartMapper.selectByPrimaryKey(cartId);
						CustomerCartExample example1 = new CustomerCartExample();
						example1.createCriteria().andOrgIdEqualTo(cusCart.getOrgId());
						CustomerCart customerCart = customerCartMapper.selectByExample(example1 ).get(0);
						BeanUtils.copyProperties(vo, list);
						BeanUtils.copyProperties(vo, customerCart);
					}
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		PageInfo<CustomerOrderPayInfoVo> pageInfo = new PageInfo<CustomerOrderPayInfoVo>(vo);
		return pageInfo;
	}

	@Override
	public CustomerOrderPayInfo getCustomerOrderPayInfo(String orderNo) {
		
		CustomerOrderPayInfoExample example = new CustomerOrderPayInfoExample();
		example.createCriteria().andOrderNoEqualTo(orderNo);
		return customerOrderPayInfoMapper.selectByExample(example).get(0);
		
	}

	@Override
	public List<CustomerOrderPayInfo> getCusOrderPayInfo(String orderNo) {
		CustomerOrderPayInfoExample example = new CustomerOrderPayInfoExample();
		example.createCriteria().andOrderNoEqualTo(orderNo);
		return customerOrderPayInfoMapper.selectByExample(example);
	}

	
}
