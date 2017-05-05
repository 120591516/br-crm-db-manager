package br.crm.service.patient.examItem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.examItem.PatientExamItemPicture;

public interface PatientExamItemPictureService {
	PageInfo<PatientExamItemPicture> gePatientExamItemPictureByPage(Integer page,Integer rows,PatientExamItemPicture patientExamItemPicture);
	
	List<PatientExamItemPicture> getAllPatientExamItemPicture();
	
	PatientExamItemPicture getPatientExamItemPictureById(String patientExamItemPictureId);
	
	int insertPatientExamItemPicture(PatientExamItemPicture patientExamItemPicture);
	
	int updatePatientExamItemPicture(PatientExamItemPicture patientExamItemPicture);

}
