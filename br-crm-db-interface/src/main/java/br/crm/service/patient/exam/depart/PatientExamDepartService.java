package br.crm.service.patient.exam.depart;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.exam.depart.PatientExamDepartWithBLOBs;

public interface PatientExamDepartService {
	PageInfo<PatientExamDepartWithBLOBs> gePatientExamDepartByPage(Integer page,Integer rows,PatientExamDepartWithBLOBs patientExamDepart);
	
	List<PatientExamDepartWithBLOBs> getAllPatientExamDepart();
	
	PatientExamDepartWithBLOBs getPatientExamDepartById(String patientExamDepartId);
	
	int insertPatientExamDepart(PatientExamDepartWithBLOBs patientExamDepart);
	
	int updatePatientExamDepart(PatientExamDepartWithBLOBs patientExamDepart);
}
