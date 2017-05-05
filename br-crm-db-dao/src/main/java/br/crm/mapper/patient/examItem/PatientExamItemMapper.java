package br.crm.mapper.patient.examItem;

import br.crm.pojo.patient.examItem.PatientExamItem;
import br.crm.pojo.patient.examItem.PatientExamItemExample;
import br.crm.pojo.patient.examItem.PatientExamItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientExamItemMapper {
    int countByExample(PatientExamItemExample example);

    int deleteByExample(PatientExamItemExample example);

    int deleteByPrimaryKey(String patientExamItemId);

    int insert(PatientExamItemWithBLOBs record);

    int insertSelective(PatientExamItemWithBLOBs record);

    List<PatientExamItemWithBLOBs> selectByExampleWithBLOBs(PatientExamItemExample example);

    List<PatientExamItem> selectByExample(PatientExamItemExample example);

    PatientExamItemWithBLOBs selectByPrimaryKey(String patientExamItemId);

    int updateByExampleSelective(@Param("record") PatientExamItemWithBLOBs record, @Param("example") PatientExamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientExamItemWithBLOBs record, @Param("example") PatientExamItemExample example);

    int updateByExample(@Param("record") PatientExamItem record, @Param("example") PatientExamItemExample example);

    int updateByPrimaryKeySelective(PatientExamItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatientExamItemWithBLOBs record);

    int updateByPrimaryKey(PatientExamItem record);
}