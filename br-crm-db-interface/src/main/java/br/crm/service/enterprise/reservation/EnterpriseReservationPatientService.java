package br.crm.service.enterprise.reservation;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.enterprise.reservation.EnterpriseReservationPatient;

public interface EnterpriseReservationPatientService {
	PageInfo<EnterpriseReservationPatient> getEnterpriseReservationPatientByPage(Integer page,Integer rows,
			EnterpriseReservationPatient enterpriseReservationPatient);
	
	List<EnterpriseReservationPatient> getAllEnterpriseReservationPatient();
	
	EnterpriseReservationPatient getEnterpriseReservationPatientById(String enterpriseReservationPatientId);
	
	int insertEnterpriseReservationPatient(EnterpriseReservationPatient enterpriseReservationPatient);
	
	int updateEnterpriseReservationPatient(EnterpriseReservationPatient enterpriseReservationPatient);

}
