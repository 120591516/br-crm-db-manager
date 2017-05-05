package br.crm.service.patient.registerSheet;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.registerSheet.PatientRegisterSheet;

public interface PatientRegisterSheetService {
	PageInfo<PatientRegisterSheet> getPatientRegisterSheetByPage(Integer page,Integer rows,PatientRegisterSheet patientRegisterSheet);
	
	List<PatientRegisterSheet> getAllPatientRegisterSheet();
	
	PatientRegisterSheet getPatientRegisterSheetById(String patientRegisterSheetId);
	
	int insertPatientRegisterSheet(PatientRegisterSheet patientRegisterSheet);
	
	int updatePatientRegisterSheet(PatientRegisterSheet patientRegisterSheet);
}
