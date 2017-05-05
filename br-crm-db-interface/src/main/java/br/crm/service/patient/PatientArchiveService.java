package br.crm.service.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.PatientArchive;

public interface PatientArchiveService {
	
	PageInfo<PatientArchive> gePatientArchiveByPage(Integer page,Integer rows,PatientArchive patientArchive);
	
	List<PatientArchive> getAllPatientArchive();
	
	PatientArchive getPatientArchiveById(String patientArchiveId);
	
	int insertPatientArchive(PatientArchive patientArchive);
	
	int updatePatientArchive(PatientArchive patientArchive);

}
