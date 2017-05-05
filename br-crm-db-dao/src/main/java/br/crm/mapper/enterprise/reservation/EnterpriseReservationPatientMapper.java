package br.crm.mapper.enterprise.reservation;

import br.crm.pojo.enterprise.reservation.EnterpriseReservationPatient;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseReservationPatientMapper {
    int countByExample(EnterpriseReservationPatientExample example);

    int deleteByExample(EnterpriseReservationPatientExample example);

    int deleteByPrimaryKey(String enterpriseReservationPatientId);

    int insert(EnterpriseReservationPatient record);

    int insertSelective(EnterpriseReservationPatient record);

    List<EnterpriseReservationPatient> selectByExample(EnterpriseReservationPatientExample example);

    EnterpriseReservationPatient selectByPrimaryKey(String enterpriseReservationPatientId);

    int updateByExampleSelective(@Param("record") EnterpriseReservationPatient record, @Param("example") EnterpriseReservationPatientExample example);

    int updateByExample(@Param("record") EnterpriseReservationPatient record, @Param("example") EnterpriseReservationPatientExample example);

    int updateByPrimaryKeySelective(EnterpriseReservationPatient record);

    int updateByPrimaryKey(EnterpriseReservationPatient record);
}