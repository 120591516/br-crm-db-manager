package br.crm.service.impl.customer.order;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.order.CustomerOrderMapper;
import br.crm.mapper.customer.order.CustomerOrderPayInfoMapper;
import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.order.CustomerOrderExample;
import br.crm.pojo.customer.order.CustomerOrderPayInfo;
import br.crm.service.customer.order.CustomerOrderPayNoticeService;
@Service
public class CustomerOrderPayNoticeServiceImpl implements CustomerOrderPayNoticeService {
	@Autowired
	private CustomerOrderMapper customerOrderMapper;
	@Autowired
	private CustomerOrderPayInfoMapper customerOrderPayInfoMapper;
	/**
		 * <p>Title:updateCustomerPayNotice</p> 
		 * <p>Description:支付完成通知接口 </p> 
		 * @param customerOrder
		 * @param customerOrderPayInfo
		 * @return
	     * @see br.crm.service.customer.order.CustomerOrderPayNoticeService#updateCustomerPayNotice(br.crm.pojo.customer.order.CustomerOrder, br.crm.pojo.customer.order.CustomerOrderPayInfo)
		 */
	@Override
	public int updateCustomerPayNotice(CustomerOrder customerOrder, CustomerOrderPayInfo customerOrderPayInfo) {
		//修改订单状态
		customerOrder.setCustomerOrderStatus(2);
		customerOrder.setCustomerOrderEditTime(new Date());
		int i = customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
		if(i>0){
			customerOrderPayInfo.setCustomerOrderPayInfoId(UUIDUtils.getId());
			customerOrderPayInfo.setOrderNo(customerOrder.getOrderNo());
			/*customerOrderPayInfo.setPayType(payType);//支付类型？
			customerOrderPayInfo.setPayWayId(payWayId);//支付方式
			customerOrderPayInfo.setPayWayName(payWayName);//支付名称
			customerOrderPayInfo.setOrderPayAmount(orderPayAmount);//支付金额
			customerOrderPayInfo.setOrderPayCallback(orderPayCallback);//线上支付回调
			customerOrderPayInfo.setOrderPayNotify(orderPayNotify);//线上支付回复消息
*/		
			customerOrderPayInfo.setOrderPayResult(2);
			customerOrderPayInfo.setOrderPayOrderNo(customerOrder.getOrderNo());
			customerOrderPayInfo.setCustomerId(customerOrder.getCustomerId());
			customerOrderPayInfo.setEnterpriseId(customerOrder.getEnterpriseId());
			customerOrderPayInfo.setCustomerOrderPayInfoCreateTime(new Date());
			customerOrderPayInfo.setCustomerOrderPayInfoEditTime(customerOrderPayInfo.getCustomerOrderPayInfoCreateTime());
			int j= customerOrderPayInfoMapper.insertSelective(customerOrderPayInfo);
			if(j>0){
				return j;
			}			
		}
		
		return 0;
	}
	@Transactional
	@Override
	public int updateCustomerOrderPayInfo(CustomerOrderPayInfo customerOrderPayInfo){
		CustomerOrderExample example = new CustomerOrderExample();
		example.createCriteria().andOrderNoEqualTo(customerOrderPayInfo.getOrderNo());
		CustomerOrder customerOrder = customerOrderMapper.selectByExample(example).get(0);
		
		customerOrderPayInfo.setCustomerOrderPayInfoId(UUIDUtils.getId());		
		customerOrderPayInfo.setCustomerOrderPayInfoCreateTime(new Date());
		customerOrderPayInfo.setCustomerOrderPayInfoEditTime(customerOrderPayInfo.getCustomerOrderPayInfoCreateTime());
		if(customerOrder!=null){
			customerOrderPayInfo.setOrderPayAmount(customerOrder.getOrderPayAmount());
			customerOrderPayInfo.setEnterpriseId(customerOrder.getEnterpriseId());
			customerOrderPayInfo.setCustomerId(customerOrder.getCustomerId());
		}
		int insertSelective = customerOrderPayInfoMapper.insertSelective(customerOrderPayInfo);
		if(insertSelective>0){
			customerOrder.setPayWayId(customerOrderPayInfo.getPayWayId());
			customerOrder.setPayWayName(customerOrderPayInfo.getPayWayName());  
			customerOrder.setOrderStatus(40);
			customerOrder.setCustomerOrderEditTime(new Date());
			int i = customerOrderMapper.updateByPrimaryKeySelective(customerOrder);
			if(i>0){
				return i;
			}
		}
		return 0;
	}

}
