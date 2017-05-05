package br.crm.service.customer.order;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.vo.order.CustomerOrderPayInfoVo;

public interface CustomerOrderPayInfoService {
	
	PageInfo<CustomerOrderPayInfoVo> getCustomerOrderPayInfoByPage(Integer page,Integer rows,CustomerOrderPayInfoVo customerOrderPayInfoVo);
	
	List<CustomerOrderPayInfo> getAllCustomerOrderPayInfo();
	
	CustomerOrderPayInfoVo getCustomerOrderPayInfoById(String customerOrderPayInfoId);
	
	int insertCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo);
	
	int updateCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo);
	
	PageInfo<CustomerOrderPayInfoVo> getCustomerOrderPayInfo(Integer page,Integer rows);
	
	CustomerOrderPayInfo getCustomerOrderPayInfo(String orderNo);
	
	List<CustomerOrderPayInfo> getCusOrderPayInfo(String orderNo);
	
	
	
}
