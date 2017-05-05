package br.crm.service.patient.feeItem;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.patient.feeItem.PatientFeeItem;

public interface PatientFeeItemService {
	
	PageInfo<PatientFeeItem> getPatientFeeItemByPage(Integer page,Integer rows,PatientFeeItem patientFeeItem);
	
	List<PatientFeeItem> getAllPatientFeeItem();
	
	PatientFeeItem getPatientFeeItemById(String patientFeeItemId);
	
	int insertPatientFeeItem(PatientFeeItem patientFeeItem);
	
	int updatePatientFeeItem(PatientFeeItem patientFeeItem);

}
