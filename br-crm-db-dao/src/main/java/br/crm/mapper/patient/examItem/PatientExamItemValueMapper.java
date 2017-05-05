package br.crm.mapper.patient.examItem;

import br.crm.pojo.patient.examItem.PatientExamItemValue;
import br.crm.pojo.patient.examItem.PatientExamItemValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientExamItemValueMapper {
    int countByExample(PatientExamItemValueExample example);

    int deleteByExample(PatientExamItemValueExample example);

    int deleteByPrimaryKey(String patientExamItemValueId);

    int insert(PatientExamItemValue record);

    int insertSelective(PatientExamItemValue record);

    List<PatientExamItemValue> selectByExampleWithBLOBs(PatientExamItemValueExample example);

    List<PatientExamItemValue> selectByExample(PatientExamItemValueExample example);

    PatientExamItemValue selectByPrimaryKey(String patientExamItemValueId);

    int updateByExampleSelective(@Param("record") PatientExamItemValue record, @Param("example") PatientExamItemValueExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientExamItemValue record, @Param("example") PatientExamItemValueExample example);

    int updateByExample(@Param("record") PatientExamItemValue record, @Param("example") PatientExamItemValueExample example);

    int updateByPrimaryKeySelective(PatientExamItemValue record);

    int updateByPrimaryKeyWithBLOBs(PatientExamItemValue record);

    int updateByPrimaryKey(PatientExamItemValue record);
}