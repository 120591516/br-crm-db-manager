package br.crm.mapper.customer.order.self;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.vo.customer.order.CustomerOrderVo;

public interface CustomerOrderSelfMapper {
	List<CustomerOrderVo> selectByParam(@Param("customerOrderVo")CustomerOrderVo CustomerOrderVo);
	
	CustomerOrderVo selectByPrimaryKey(@Param("customerPatientName") String customerPatientName,@Param("examSuiteId") String examSuiteId,@Param("examTime") String examTime);
}
