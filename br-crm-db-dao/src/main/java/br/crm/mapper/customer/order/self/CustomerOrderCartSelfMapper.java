package br.crm.mapper.customer.order.self;

import org.apache.ibatis.annotations.Param;

/** 
* 订单购物车中间表selfMapper
* @ClassName: CustomerOrderCartSelfMapper 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年12月21日 下午4:30:52 
*/
public interface CustomerOrderCartSelfMapper {
    Integer sumSuiteNum(@Param("examSuiteId") String examSuiteId);
}
