package br.crm.service.impl.customer.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import br.crm.mapper.customer.patient.CustomerOrderReceiptMapper;
import br.crm.pojo.customer.patient.CustomerOrderReceipt;
import br.crm.pojo.customer.patient.CustomerOrderReceiptExample;
import br.crm.pojo.customer.patient.CustomerOrderReceiptExample.Criteria;
import br.crm.service.customer.patient.CustomerOrderReceiptService;

/** 
* 发票的service
* @ClassName: CustomerOrderReceiptServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年12月9日 下午2:03:27 
*/
@Service
public class CustomerOrderReceiptServiceImpl implements CustomerOrderReceiptService {
    @Autowired
    private CustomerOrderReceiptMapper customerOrderReceiptMapper;
    /** 
     *  
     * <p>Title: getPatientReceiptById</p> 
     * <p>Description: </p> 
     * @param id 主键id
     * @return
     * @see br.crm.service.patient.receipt.PatientReceiptService#getPatientReceiptById(java.lang.String) 
     */
     @Override
     public CustomerOrderReceipt getPatientReceiptById(String patientReceiptId) {
         return customerOrderReceiptMapper.selectByPrimaryKey(patientReceiptId);
     }

     /** 
     *  添加发票信息
     * <p>Title: insertPatientReceipt</p> 
     * <p>Description: </p> 
     * @param patientReceipt 发票对象
     * @return
     * @see br.crm.service.patient.receipt.PatientReceiptService#insertPatientReceipt(br.crm.pojo.patient.receipt.PatientReceipt) 
     */
     @Override
     public int insertPatientReceipt(CustomerOrderReceipt customerOrderReceipt) {
         return customerOrderReceiptMapper.insertSelective(customerOrderReceipt);
     }

     /** 
     *  根据订单号查找发票信息
     * <p>Title: getPatientReceiptByOrderNo</p> 
     * <p>Description: </p> 
     * @param orderNo 订单号id
     * @return
     * @see br.crm.service.patient.receipt.PatientReceiptService#getCustomerPatientReceiptByOrderNo(java.lang.String) 
     */
     @Override
     public List<CustomerOrderReceipt> getCustomerPatientReceiptByOrderNo(String orderNo) {
         CustomerOrderReceiptExample example=new CustomerOrderReceiptExample();
         Criteria criteria = example.createCriteria();
         criteria.andOrderNoEqualTo(orderNo);
         List<CustomerOrderReceipt> list=customerOrderReceiptMapper.selectByExample(example);
         return list;
     }
}
