package br.crm.mapper.enterprise.reservation;

import br.crm.pojo.enterprise.reservation.EnterpriseReservation;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseReservationMapper {
    int countByExample(EnterpriseReservationExample example);

    int deleteByExample(EnterpriseReservationExample example);

    int deleteByPrimaryKey(String enterpriseReservationId);

    int insert(EnterpriseReservation record);

    int insertSelective(EnterpriseReservation record);

    List<EnterpriseReservation> selectByExample(EnterpriseReservationExample example);

    EnterpriseReservation selectByPrimaryKey(String enterpriseReservationId);

    int updateByExampleSelective(@Param("record") EnterpriseReservation record, @Param("example") EnterpriseReservationExample example);

    int updateByExample(@Param("record") EnterpriseReservation record, @Param("example") EnterpriseReservationExample example);

    int updateByPrimaryKeySelective(EnterpriseReservation record);

    int updateByPrimaryKey(EnterpriseReservation record);
}