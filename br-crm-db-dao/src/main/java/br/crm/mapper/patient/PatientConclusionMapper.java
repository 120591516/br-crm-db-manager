package br.crm.mapper.patient;

import br.crm.pojo.patient.PatientConclusion;
import br.crm.pojo.patient.PatientConclusionExample;
import br.crm.pojo.patient.PatientConclusionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientConclusionMapper {
    int countByExample(PatientConclusionExample example);

    int deleteByExample(PatientConclusionExample example);

    int deleteByPrimaryKey(String patientConclusionId);

    int insert(PatientConclusionWithBLOBs record);

    int insertSelective(PatientConclusionWithBLOBs record);

    List<PatientConclusionWithBLOBs> selectByExampleWithBLOBs(PatientConclusionExample example);

    List<PatientConclusion> selectByExample(PatientConclusionExample example);

    PatientConclusionWithBLOBs selectByPrimaryKey(String patientConclusionId);

    int updateByExampleSelective(@Param("record") PatientConclusionWithBLOBs record, @Param("example") PatientConclusionExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientConclusionWithBLOBs record, @Param("example") PatientConclusionExample example);

    int updateByExample(@Param("record") PatientConclusion record, @Param("example") PatientConclusionExample example);

    int updateByPrimaryKeySelective(PatientConclusionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PatientConclusionWithBLOBs record);

    int updateByPrimaryKey(PatientConclusion record);
}