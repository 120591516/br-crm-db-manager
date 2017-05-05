package br.crm.mapper.patient;

import br.crm.pojo.patient.PatientArchive;
import br.crm.pojo.patient.PatientArchiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientArchiveMapper {
    int countByExample(PatientArchiveExample example);

    int deleteByExample(PatientArchiveExample example);

    int deleteByPrimaryKey(String patientArchiveId);

    int insert(PatientArchive record);

    int insertSelective(PatientArchive record);

    List<PatientArchive> selectByExample(PatientArchiveExample example);

    PatientArchive selectByPrimaryKey(String patientArchiveId);

    int updateByExampleSelective(@Param("record") PatientArchive record, @Param("example") PatientArchiveExample example);

    int updateByExample(@Param("record") PatientArchive record, @Param("example") PatientArchiveExample example);

    int updateByPrimaryKeySelective(PatientArchive record);

    int updateByPrimaryKey(PatientArchive record);
}