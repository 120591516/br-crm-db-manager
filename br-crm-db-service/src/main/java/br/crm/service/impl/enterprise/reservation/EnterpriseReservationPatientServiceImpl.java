package br.crm.service.impl.enterprise.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.enterprise.reservation.EnterpriseReservationPatientMapper;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationPatient;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationPatientExample;
import br.crm.service.enterprise.reservation.EnterpriseReservationPatientService;

public class EnterpriseReservationPatientServiceImpl implements EnterpriseReservationPatientService {
	@Autowired
	private EnterpriseReservationPatientMapper enterpriseReservationPatientMapper;

	@Override
	public PageInfo<EnterpriseReservationPatient> getEnterpriseReservationPatientByPage(Integer page, Integer rows,
			EnterpriseReservationPatient enterpriseReservationPatient) {
		PageHelper.startPage(page, rows);
		EnterpriseReservationPatientExample example = new EnterpriseReservationPatientExample();
		example.createCriteria().andEnterpriseReservationPatientStatusEqualTo(0);		
		List<EnterpriseReservationPatient> list = enterpriseReservationPatientMapper.selectByExample(example );
		PageInfo<EnterpriseReservationPatient> pageInfo = new PageInfo<EnterpriseReservationPatient>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseReservationPatient> getAllEnterpriseReservationPatient() {
		EnterpriseReservationPatientExample example = new EnterpriseReservationPatientExample();
		example.createCriteria().andEnterpriseReservationPatientStatusEqualTo(0);	
		return  enterpriseReservationPatientMapper.selectByExample(example );
	}

	@Override
	public EnterpriseReservationPatient getEnterpriseReservationPatientById(String enterpriseReservationPatientId) {
		return enterpriseReservationPatientMapper.selectByPrimaryKey(enterpriseReservationPatientId);
	}

	@Override
	public int insertEnterpriseReservationPatient(EnterpriseReservationPatient enterpriseReservationPatient) {
		return enterpriseReservationPatientMapper.insertSelective(enterpriseReservationPatient);
	}

	@Override
	public int updateEnterpriseReservationPatient(EnterpriseReservationPatient enterpriseReservationPatient) {
		return enterpriseReservationPatientMapper.updateByPrimaryKeySelective(enterpriseReservationPatient);
	}

}
