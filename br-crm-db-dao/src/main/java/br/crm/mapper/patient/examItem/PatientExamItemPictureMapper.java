package br.crm.mapper.patient.examItem;

import br.crm.pojo.patient.examItem.PatientExamItemPicture;
import br.crm.pojo.patient.examItem.PatientExamItemPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientExamItemPictureMapper {
    int countByExample(PatientExamItemPictureExample example);

    int deleteByExample(PatientExamItemPictureExample example);

    int deleteByPrimaryKey(String patientExamItemPictureId);

    int insert(PatientExamItemPicture record);

    int insertSelective(PatientExamItemPicture record);

    List<PatientExamItemPicture> selectByExampleWithBLOBs(PatientExamItemPictureExample example);

    List<PatientExamItemPicture> selectByExample(PatientExamItemPictureExample example);

    PatientExamItemPicture selectByPrimaryKey(String patientExamItemPictureId);

    int updateByExampleSelective(@Param("record") PatientExamItemPicture record, @Param("example") PatientExamItemPictureExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientExamItemPicture record, @Param("example") PatientExamItemPictureExample example);

    int updateByExample(@Param("record") PatientExamItemPicture record, @Param("example") PatientExamItemPictureExample example);

    int updateByPrimaryKeySelective(PatientExamItemPicture record);

    int updateByPrimaryKeyWithBLOBs(PatientExamItemPicture record);

    int updateByPrimaryKey(PatientExamItemPicture record);
}