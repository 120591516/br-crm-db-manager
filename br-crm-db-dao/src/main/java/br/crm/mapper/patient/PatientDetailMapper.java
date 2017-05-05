package br.crm.mapper.patient;

import br.crm.pojo.patient.PatientDetail;
import br.crm.pojo.patient.PatientDetailExample;
import br.crm.pojo.patient.PatientDetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientDetailMapper {
    int countByExample(PatientDetailExample example);

    int deleteByExample(PatientDetailExample example);

    int deleteByPrimaryKey(String patientDetailId);

    int insert(PatientDetailWithBLOBs record);

    int insertSelective(PatientDetailWithBLOBs record);

    List<PatientDetailWithBLOBs> selectByExampleWithBLOBs(PatientDetailExample example);

    List<PatientDetail> selectByExample(PatientDetailExample example);

    PatientDetailWithBLOBs selectByPrimaryKey(String patientDetailId);

    int updateByExampleSelective(@Param("record") PatientDetailWithBLOBs record, @Param("example") PatientDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientDetailWithBLOBs record, @Param("example") PatientDetailExample example);

    int updateByExample(@Param("record") PatientDetail record, @Param("example") PatientDetailExample example);

    int updateByPrimaryKeySelective(PatientDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatientDetailWithBLOBs record);

    int updateByPrimaryKey(PatientDetail record);
}