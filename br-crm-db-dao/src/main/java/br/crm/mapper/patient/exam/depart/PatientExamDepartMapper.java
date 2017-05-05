package br.crm.mapper.patient.exam.depart;

import br.crm.pojo.patient.exam.depart.PatientExamDepart;
import br.crm.pojo.patient.exam.depart.PatientExamDepartExample;
import br.crm.pojo.patient.exam.depart.PatientExamDepartWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientExamDepartMapper {
    int countByExample(PatientExamDepartExample example);

    int deleteByExample(PatientExamDepartExample example);

    int deleteByPrimaryKey(String patientExamDepartId);

    int insert(PatientExamDepartWithBLOBs record);

    int insertSelective(PatientExamDepartWithBLOBs record);

    List<PatientExamDepartWithBLOBs> selectByExampleWithBLOBs(PatientExamDepartExample example);

    List<PatientExamDepart> selectByExample(PatientExamDepartExample example);

    PatientExamDepartWithBLOBs selectByPrimaryKey(String patientExamDepartId);

    int updateByExampleSelective(@Param("record") PatientExamDepartWithBLOBs record, @Param("example") PatientExamDepartExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientExamDepartWithBLOBs record, @Param("example") PatientExamDepartExample example);

    int updateByExample(@Param("record") PatientExamDepart record, @Param("example") PatientExamDepartExample example);

    int updateByPrimaryKeySelective(PatientExamDepartWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatientExamDepartWithBLOBs record);

    int updateByPrimaryKey(PatientExamDepart record);
}