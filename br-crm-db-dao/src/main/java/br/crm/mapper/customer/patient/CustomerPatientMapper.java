package br.crm.mapper.customer.patient;

import br.crm.pojo.customer.patient.CustomerPatient;
import br.crm.pojo.customer.patient.CustomerPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerPatientMapper {
    int countByExample(CustomerPatientExample example);

    int deleteByExample(CustomerPatientExample example);

    int deleteByPrimaryKey(String customerPatientId);

    int insert(CustomerPatient record);

    int insertSelective(CustomerPatient record);

    List<CustomerPatient> selectByExample(CustomerPatientExample example);

    CustomerPatient selectByPrimaryKey(String customerPatientId);

    int updateByExampleSelective(@Param("record") CustomerPatient record, @Param("example") CustomerPatientExample example);

    int updateByExample(@Param("record") CustomerPatient record, @Param("example") CustomerPatientExample example);

    int updateByPrimaryKeySelective(CustomerPatient record);

    int updateByPrimaryKey(CustomerPatient record);
}