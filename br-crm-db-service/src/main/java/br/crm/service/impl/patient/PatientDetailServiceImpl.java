package br.crm.service.impl.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.PatientDetailMapper;
import br.crm.pojo.patient.PatientDetail;
import br.crm.pojo.patient.PatientDetailExample;
import br.crm.pojo.patient.PatientDetailWithBLOBs;
import br.crm.service.patient.PatientDetailService;
@Service
public class PatientDetailServiceImpl implements PatientDetailService {
	@Autowired
	private PatientDetailMapper patientDetailMapper;

	@Override
	public PageInfo<PatientDetailWithBLOBs> gePatientDetailByPage(Integer page, Integer rows, PatientDetailWithBLOBs patientDetail) {
		PageHelper.startPage(page, rows);
		PatientDetailExample example = new PatientDetailExample();
		example.createCriteria().andPatientDetailStatusEqualTo(0);
		List<PatientDetailWithBLOBs> list = patientDetailMapper.selectByExampleWithBLOBs(example );
		PageInfo<PatientDetailWithBLOBs> pageInfo = new PageInfo<PatientDetailWithBLOBs>(list);		
		return pageInfo;
	}

	@Override
	public List<PatientDetailWithBLOBs> getAllPatientDetail() {
		PatientDetailExample example = new PatientDetailExample();
		example.createCriteria().andPatientDetailStatusEqualTo(0);
		return patientDetailMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public PatientDetailWithBLOBs  getPatientDetailById(String patientDetailId) {
		
		return patientDetailMapper.selectByPrimaryKey(patientDetailId);
	}

	@Override
	public int insertPatientDetail(PatientDetailWithBLOBs patientDetail) {
		return patientDetailMapper.insertSelective(patientDetail);
	}

	@Override
	public int updatePatientDetail(PatientDetailWithBLOBs patientDetail) {
		return patientDetailMapper.updateByPrimaryKeySelective(patientDetail);
	}

}
