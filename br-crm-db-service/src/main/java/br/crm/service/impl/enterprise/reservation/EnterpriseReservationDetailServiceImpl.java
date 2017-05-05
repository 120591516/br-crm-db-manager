package br.crm.service.impl.enterprise.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.enterprise.reservation.EnterpriseReservationDetailMapper;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationDetail;
import br.crm.pojo.enterprise.reservation.EnterpriseReservationDetailExample;
import br.crm.service.enterprise.reservation.EnterpriseReservationDetailService;

public class EnterpriseReservationDetailServiceImpl implements EnterpriseReservationDetailService {
	@Autowired
	private EnterpriseReservationDetailMapper enterpriseReservationDetailMapper;

	@Override
	public PageInfo<EnterpriseReservationDetail> getEnterpriseReservationDetailByPage(Integer page, Integer rows,
			EnterpriseReservationDetail enterpriseReservationDetail) {
		PageHelper.startPage(page, rows);
		EnterpriseReservationDetailExample example = new EnterpriseReservationDetailExample();
		example.createCriteria().andEnterpriseReservationDetailStatusEqualTo(0);
		List<EnterpriseReservationDetail> list = enterpriseReservationDetailMapper.selectByExample(example);
		PageInfo<EnterpriseReservationDetail> pageInfo = new PageInfo<EnterpriseReservationDetail>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseReservationDetail> getAllEnterpriseReservationDetail() {
		EnterpriseReservationDetailExample example = new EnterpriseReservationDetailExample();
		example.createCriteria().andEnterpriseReservationDetailStatusEqualTo(0);
		return  enterpriseReservationDetailMapper.selectByExample(example);
	}

	@Override
	public EnterpriseReservationDetail getEnterpriseReservationDetailById(String enterpriseReservationDetailId) {
		return enterpriseReservationDetailMapper.selectByPrimaryKey(enterpriseReservationDetailId);
	}

	@Override
	public int insertEnterpriseReservationDetail(EnterpriseReservationDetail enterpriseReservationDetail) {
		return enterpriseReservationDetailMapper.insertSelective(enterpriseReservationDetail);
	}

	@Override
	public int updateEnterpriseReservationDetail(EnterpriseReservationDetail enterpriseReservationDetail) {
		return enterpriseReservationDetailMapper.updateByPrimaryKeySelective(enterpriseReservationDetail);
	}
	
	

}
