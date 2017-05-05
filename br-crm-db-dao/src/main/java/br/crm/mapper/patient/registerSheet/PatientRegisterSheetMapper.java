package br.crm.mapper.patient.registerSheet;

import br.crm.pojo.patient.registerSheet.PatientRegisterSheet;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientRegisterSheetMapper {
    int countByExample(PatientRegisterSheetExample example);

    int deleteByExample(PatientRegisterSheetExample example);

    int deleteByPrimaryKey(String regId);

    int insert(PatientRegisterSheet record);

    int insertSelective(PatientRegisterSheet record);

    List<PatientRegisterSheet> selectByExample(PatientRegisterSheetExample example);

    PatientRegisterSheet selectByPrimaryKey(String regId);

    int updateByExampleSelective(@Param("record") PatientRegisterSheet record, @Param("example") PatientRegisterSheetExample example);

    int updateByExample(@Param("record") PatientRegisterSheet record, @Param("example") PatientRegisterSheetExample example);

    int updateByPrimaryKeySelective(PatientRegisterSheet record);

    int updateByPrimaryKey(PatientRegisterSheet record);
}