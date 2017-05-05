package br.crm.service.patient;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.PatientDetail;
import br.crm.pojo.patient.PatientDetailWithBLOBs;

public interface PatientDetailService {
	PageInfo<PatientDetailWithBLOBs> gePatientDetailByPage(Integer page,Integer rows,PatientDetailWithBLOBs patientDetail);
	
	List<PatientDetailWithBLOBs> getAllPatientDetail();
	
	PatientDetailWithBLOBs getPatientDetailById(String patientDetailId);
	
	int insertPatientDetail(PatientDetailWithBLOBs patientDetail);
	
	int updatePatientDetail(PatientDetailWithBLOBs patientDetail);
}
