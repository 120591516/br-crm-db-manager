package br.crm.mapper.patient;

import br.crm.pojo.patient.PatientCharge;
import br.crm.pojo.patient.PatientChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientChargeMapper {
    int countByExample(PatientChargeExample example);

    int deleteByExample(PatientChargeExample example);

    int deleteByPrimaryKey(String patientChargeId);

    int insert(PatientCharge record);

    int insertSelective(PatientCharge record);

    List<PatientCharge> selectByExampleWithBLOBs(PatientChargeExample example);

    List<PatientCharge> selectByExample(PatientChargeExample example);

    PatientCharge selectByPrimaryKey(String patientChargeId);

    int updateByExampleSelective(@Param("record") PatientCharge record, @Param("example") PatientChargeExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientCharge record, @Param("example") PatientChargeExample example);

    int updateByExample(@Param("record") PatientCharge record, @Param("example") PatientChargeExample example);

    int updateByPrimaryKeySelective(PatientCharge record);

    int updateByPrimaryKeyWithBLOBs(PatientCharge record);

    int updateByPrimaryKey(PatientCharge record);
}