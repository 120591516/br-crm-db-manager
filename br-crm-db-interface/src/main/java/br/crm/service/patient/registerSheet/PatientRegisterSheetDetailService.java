package br.crm.service.patient.registerSheet;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.registerSheet.PatientRegisterSheetDetail;

public interface PatientRegisterSheetDetailService {
	
	PageInfo<PatientRegisterSheetDetail> getPatientRegisterSheetDetailByPage(Integer page,Integer rows,
			PatientRegisterSheetDetail patientRegisterSheetDetail);
	
	List<PatientRegisterSheetDetail> getAllPatientRegisterSheetDetail();
	
	PatientRegisterSheetDetail getPatientRegisterSheetDetailById(String patientRegisterSheetDetailId);
	
	int insertPatientRegisterSheetDetail(PatientRegisterSheetDetail patientRegisterSheetDetail);
	
	int updatePatientRegisterSheetDetail(PatientRegisterSheetDetail patientRegisterSheetDetail);

}
