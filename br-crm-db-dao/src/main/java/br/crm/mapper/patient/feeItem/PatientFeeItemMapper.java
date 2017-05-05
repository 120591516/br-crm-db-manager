package br.crm.mapper.patient.feeItem;

import br.crm.pojo.patient.feeItem.PatientFeeItem;
import br.crm.pojo.patient.feeItem.PatientFeeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientFeeItemMapper {
    int countByExample(PatientFeeItemExample example);

    int deleteByExample(PatientFeeItemExample example);

    int deleteByPrimaryKey(String patientFeeItemId);

    int insert(PatientFeeItem record);

    int insertSelective(PatientFeeItem record);

    List<PatientFeeItem> selectByExampleWithBLOBs(PatientFeeItemExample example);

    List<PatientFeeItem> selectByExample(PatientFeeItemExample example);

    PatientFeeItem selectByPrimaryKey(String patientFeeItemId);

    int updateByExampleSelective(@Param("record") PatientFeeItem record, @Param("example") PatientFeeItemExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientFeeItem record, @Param("example") PatientFeeItemExample example);

    int updateByExample(@Param("record") PatientFeeItem record, @Param("example") PatientFeeItemExample example);

    int updateByPrimaryKeySelective(PatientFeeItem record);

    int updateByPrimaryKeyWithBLOBs(PatientFeeItem record);

    int updateByPrimaryKey(PatientFeeItem record);
}