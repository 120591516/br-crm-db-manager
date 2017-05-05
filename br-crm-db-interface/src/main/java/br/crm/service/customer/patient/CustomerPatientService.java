package br.crm.service.customer.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.customer.patient.CustomerPatient;


public interface CustomerPatientService {
	PageInfo<CustomerPatient> getCustomerOrderPayInfoByPage(Integer page,Integer rows,  CustomerPatient customerPatient);
	
	List<CustomerPatient> getAllCustomerPatient();
	
	CustomerPatient getCustomerPatientById(String customerPatientId);
	
	int insertCustomerPatient(CustomerPatient customerPatient);
	
	int updateCustomerPatient(CustomerPatient customerPatient);
	
	List<CustomerPatient> getCustomerPatientByCartId (String cartId);

}
