package br.crm.mapper.patient.registerSheet;

import br.crm.pojo.patient.registerSheet.PatientRegisterSheetDetail;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheetDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientRegisterSheetDetailMapper {
    int countByExample(PatientRegisterSheetDetailExample example);

    int deleteByExample(PatientRegisterSheetDetailExample example);

    int deleteByPrimaryKey(String regDetailId);

    int insert(PatientRegisterSheetDetail record);

    int insertSelective(PatientRegisterSheetDetail record);

    List<PatientRegisterSheetDetail> selectByExample(PatientRegisterSheetDetailExample example);

    PatientRegisterSheetDetail selectByPrimaryKey(String regDetailId);

    int updateByExampleSelective(@Param("record") PatientRegisterSheetDetail record, @Param("example") PatientRegisterSheetDetailExample example);

    int updateByExample(@Param("record") PatientRegisterSheetDetail record, @Param("example") PatientRegisterSheetDetailExample example);

    int updateByPrimaryKeySelective(PatientRegisterSheetDetail record);

    int updateByPrimaryKey(PatientRegisterSheetDetail record);
}