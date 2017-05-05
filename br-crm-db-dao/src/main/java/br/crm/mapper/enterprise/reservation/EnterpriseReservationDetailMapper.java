package br.crm.mapper.enterprise.reservation;

import br.crm.pojo.enterprise.reservation.EnterpriseReservationDetail;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseReservationDetailMapper {
    int countByExample(EnterpriseReservationDetailExample example);

    int deleteByExample(EnterpriseReservationDetailExample example);

    int deleteByPrimaryKey(String enterpriseReservationDetailId);

    int insert(EnterpriseReservationDetail record);

    int insertSelective(EnterpriseReservationDetail record);

    List<EnterpriseReservationDetail> selectByExample(EnterpriseReservationDetailExample example);

    EnterpriseReservationDetail selectByPrimaryKey(String enterpriseReservationDetailId);

    int updateByExampleSelective(@Param("record") EnterpriseReservationDetail record, @Param("example") EnterpriseReservationDetailExample example);

    int updateByExample(@Param("record") EnterpriseReservationDetail record, @Param("example") EnterpriseReservationDetailExample example);

    int updateByPrimaryKeySelective(EnterpriseReservationDetail record);

    int updateByPrimaryKey(EnterpriseReservationDetail record);
}