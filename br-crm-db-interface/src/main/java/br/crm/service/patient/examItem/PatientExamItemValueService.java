package br.crm.service.patient.examItem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.examItem.PatientExamItemValue;

public interface PatientExamItemValueService {
	PageInfo<PatientExamItemValue> gePatientExamItemValueByPage(Integer page,Integer rows,PatientExamItemValue patientExamItemValue);
	
	List<PatientExamItemValue> getAllPatientExamItemValue();
	
	PatientExamItemValue getPatientExamItemValueById(String patientExamItemValueId);
	
	int insertPatientExamItemValue(PatientExamItemValue patientExamItemValue);
	
	int updatePatientExamItemValue(PatientExamItemValue patientExamItemValue);
}
