package br.crm.service.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.Patient;

public interface PatientService {
	PageInfo<Patient> gePatientByPage(Integer page,Integer rows,Patient patient);
	
	List<Patient> getAllPatient();
	
	Patient getPatientById(String patientId);
	
	int insertPatient(Patient patient);
	
	int updatePatient(Patient patient);

}
