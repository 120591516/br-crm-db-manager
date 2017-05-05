package br.crm.service.impl.customer.patient;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.patient.CustomerPatientMapper;
import br.crm.pojo.customer.patient.CustomerPatient;
import br.crm.pojo.customer.patient.CustomerPatientExample;
import br.crm.pojo.customer.patient.CustomerPatientExample.Criteria;
import br.crm.service.customer.patient.CustomerPatientService;

/**
 * @ClassName: CustomerPatientServiceImpl
 * @Description: TODO
 * @author server
 * @date 2016年11月1日 下午5:02:15
 */
@Service
public class CustomerPatientServiceImpl implements CustomerPatientService {
	@Autowired
	private CustomerPatientMapper customerPatientMapper;

	@Override
	public PageInfo<CustomerPatient> getCustomerOrderPayInfoByPage(Integer page, Integer rows,
			CustomerPatient customerPatient) {
		PageHelper.startPage(page, rows);
		CustomerPatientExample example = new CustomerPatientExample();
		example.createCriteria().andCustomerPatientStatusEqualTo(0);
		List<CustomerPatient> list = customerPatientMapper.selectByExample(example );
		PageInfo<CustomerPatient> pageInfo = new PageInfo<CustomerPatient>(list);
		return pageInfo;
	}

	@Override
	public List<CustomerPatient> getAllCustomerPatient() {
		CustomerPatientExample example = new CustomerPatientExample();
		example.createCriteria().andCustomerPatientStatusEqualTo(0);
		return customerPatientMapper.selectByExample(example );
		
	}

	@Override
	public CustomerPatient getCustomerPatientById(String customerPatientId) {
		return customerPatientMapper.selectByPrimaryKey(customerPatientId);
	}

	@Override
	public int insertCustomerPatient(CustomerPatient customerPatient) {
		
		return customerPatientMapper.insertSelective(customerPatient);
	}

	@Override
	public int updateCustomerPatient(CustomerPatient customerPatient) {
		return customerPatientMapper.updateByPrimaryKeySelective(customerPatient);
	}

	@Override
	public List<CustomerPatient> getCustomerPatientByCartId(String cartId) {
		CustomerPatientExample example = new CustomerPatientExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCustomerPatientStatusEqualTo(0);
		if(cartId!=null){			
			createCriteria.andCartIdEqualTo(cartId);
		}
		example.setOrderByClause("cart_create_time desc"); 
		return customerPatientMapper.selectByExample(example);
	}

}
