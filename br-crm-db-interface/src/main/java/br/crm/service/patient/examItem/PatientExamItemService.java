package br.crm.service.patient.examItem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.examItem.PatientExamItemWithBLOBs;

public interface PatientExamItemService {
	PageInfo<PatientExamItemWithBLOBs> gePatientExamItemByPage(Integer page,Integer rows,PatientExamItemWithBLOBs patientExamItem);
	
	List<PatientExamItemWithBLOBs> getAllPatientExamItem();
	
	PatientExamItemWithBLOBs getPatientExamItemById(String patientExamItemId);
	
	int insertPatientExamItem(PatientExamItemWithBLOBs patientExamItem);
	
	int updatePatientExamItem(PatientExamItemWithBLOBs patientExamItem);
}
