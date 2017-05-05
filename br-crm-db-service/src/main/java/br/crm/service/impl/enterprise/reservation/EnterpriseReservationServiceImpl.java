package br.crm.service.impl.enterprise.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.enterprise.reservation.EnterpriseReservationMapper;
import br.crm.pojo.enterprise.reservation.EnterpriseReservation;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationExample;
import br.crm.service.enterprise.reservation.EnterpriseReservationService;

public class EnterpriseReservationServiceImpl implements EnterpriseReservationService {
	@Autowired
	private EnterpriseReservationMapper enterpriseReservationMapper;

	@Override
	public PageInfo<EnterpriseReservation> getEnterpriseReservationByPage(Integer page, Integer rows,
			EnterpriseReservation enterpriseReservation) {
		PageHelper.startPage(page, rows);
		
		EnterpriseReservationExample example = new EnterpriseReservationExample();
		example.createCriteria().andEnterpriseReservationStatusEqualTo(0);
		
		List<EnterpriseReservation> list = enterpriseReservationMapper.selectByExample(example );
		PageInfo<EnterpriseReservation> pageInfo = new PageInfo<EnterpriseReservation>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseReservation> getAllEnterpriseReservation() {
		EnterpriseReservationExample example = new EnterpriseReservationExample();
		example.createCriteria().andEnterpriseReservationStatusEqualTo(0);
		return  enterpriseReservationMapper.selectByExample(example );
	}

	@Override
	public EnterpriseReservation getEnterpriseReservationById(String enterpriseReservationId) {
		return enterpriseReservationMapper.selectByPrimaryKey(enterpriseReservationId);
	}

	@Override
	public int insertEnterpriseReservation(EnterpriseReservation enterpriseReservation) {
		return enterpriseReservationMapper.insertSelective(enterpriseReservation);
	}

	@Override
	public int updateEnterpriseReservation(EnterpriseReservation enterpriseReservation) {
		return enterpriseReservationMapper.updateByPrimaryKeySelective(enterpriseReservation);
	}

	
	

}
