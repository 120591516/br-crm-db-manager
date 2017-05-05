package br.crm.service.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.PatientConclusion;
import br.crm.pojo.patient.PatientConclusionWithBLOBs;

public interface PatientConclusionService {
	PageInfo<PatientConclusionWithBLOBs> gePatientConclusionByPage(Integer page,Integer rows,PatientConclusionWithBLOBs patientConclusion);
	
	List<PatientConclusionWithBLOBs> getAllPatientConclusion();
	
	PatientConclusionWithBLOBs getPatientConclusionById(String patientConclusionId);
	
	int insertPatientConclusion(PatientConclusionWithBLOBs patientConclusion);
	
	int updatePatientConclusion(PatientConclusionWithBLOBs patientConclusion);

}
