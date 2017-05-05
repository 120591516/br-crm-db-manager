package br.crm.service.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.PatientCharge;

public interface PatientChargeService {
	PageInfo<PatientCharge> gePatientChargeByPage(Integer page,Integer rows,PatientCharge patientCharge);
	
	List<PatientCharge> getAllPatientCharge();
	
	PatientCharge getPatientChargeById(String patientChargeId);
	
	int insertPatientCharge(PatientCharge patientCharge);
	
	int updatePatientCharge(PatientCharge patientCharge);
}
