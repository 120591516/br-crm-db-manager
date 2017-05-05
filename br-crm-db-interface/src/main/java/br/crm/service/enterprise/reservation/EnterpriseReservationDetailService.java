package br.crm.service.enterprise.reservation;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.enterprise.reservation.EnterpriseReservationDetail;

public interface EnterpriseReservationDetailService {
	PageInfo<EnterpriseReservationDetail> getEnterpriseReservationDetailByPage(Integer page,Integer rows,
			EnterpriseReservationDetail enterpriseReservationDetail);
	
	List<EnterpriseReservationDetail> getAllEnterpriseReservationDetail();
	
	EnterpriseReservationDetail getEnterpriseReservationDetailById(String enterpriseReservationDetailId);
	
	int insertEnterpriseReservationDetail(EnterpriseReservationDetail enterpriseReservationDetail);
	
	int updateEnterpriseReservationDetail(EnterpriseReservationDetail enterpriseReservationDetail);

}
