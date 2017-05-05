package br.crm.service.customer.patient;

import java.util.List;

import br.crm.pojo.customer.patient.CustomerOrderReceipt;

/** 
* 
* @ClassName: CustomerOrderReceiptService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年12月9日 下午2:02:31 
*/
public interface CustomerOrderReceiptService {
    CustomerOrderReceipt getPatientReceiptById(String patientReceiptId);

    List<CustomerOrderReceipt> getCustomerPatientReceiptByOrderNo(String orderNo);

    int insertPatientReceipt(CustomerOrderReceipt patientReceipt);
}
