package br.crm.mapper.customer.patient;

import br.crm.pojo.customer.patient.CustomerOrderReceipt;
import br.crm.pojo.customer.patient.CustomerOrderReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrderReceiptMapper {
    int countByExample(CustomerOrderReceiptExample example);

    int deleteByExample(CustomerOrderReceiptExample example);

    int deleteByPrimaryKey(String patientReceiptId);

    int insert(CustomerOrderReceipt record);

    int insertSelective(CustomerOrderReceipt record);

    List<CustomerOrderReceipt> selectByExample(CustomerOrderReceiptExample example);

    CustomerOrderReceipt selectByPrimaryKey(String patientReceiptId);

    int updateByExampleSelective(@Param("record") CustomerOrderReceipt record, @Param("example") CustomerOrderReceiptExample example);

    int updateByExample(@Param("record") CustomerOrderReceipt record, @Param("example") CustomerOrderReceiptExample example);

    int updateByPrimaryKeySelective(CustomerOrderReceipt record);

    int updateByPrimaryKey(CustomerOrderReceipt record);
}