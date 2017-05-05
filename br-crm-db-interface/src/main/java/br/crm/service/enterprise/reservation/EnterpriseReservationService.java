package br.crm.service.enterprise.reservation;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.enterprise.reservation.EnterpriseReservation;

public interface EnterpriseReservationService {
	
	PageInfo<EnterpriseReservation> getEnterpriseReservationByPage(Integer page,Integer rows, EnterpriseReservation enterpriseReservation);
	
	List<EnterpriseReservation> getAllEnterpriseReservation();
	
	EnterpriseReservation getEnterpriseReservationById(String enterpriseReservationId);
	
	int insertEnterpriseReservation(EnterpriseReservation enterpriseReservation);
	
	int updateEnterpriseReservation(EnterpriseReservation enterpriseReservation);

}
