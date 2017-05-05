package br.crm.service.impl.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.PatientChargeMapper;
import br.crm.pojo.patient.PatientCharge;
import br.crm.pojo.patient.PatientChargeExample;
import br.crm.service.patient.PatientChargeService;
@Service
public class PatientChargeServiceImpl implements PatientChargeService {
	@Autowired
	private PatientChargeMapper patientChargeMapper;

	@Override
	public PageInfo<PatientCharge> gePatientChargeByPage(Integer page, Integer rows, PatientCharge patientCharge) {
		PageHelper.startPage(page, rows);
		PatientChargeExample example = new PatientChargeExample();
		example.createCriteria().andPatientChargeStatusEqualTo(0);
		List<PatientCharge> list = patientChargeMapper.selectByExample(example);
		PageInfo<PatientCharge> pageInfo = new PageInfo<PatientCharge>(list);
		return pageInfo;
	}

	@Override
	public List<PatientCharge> getAllPatientCharge() {
		PatientChargeExample example = new PatientChargeExample();
		example.createCriteria().andPatientChargeStatusEqualTo(0);
		return patientChargeMapper.selectByExample(example);
	}

	@Override
	public PatientCharge getPatientChargeById(String patientChargeId) {
		return patientChargeMapper.selectByPrimaryKey(patientChargeId);
	}

	@Override
	public int insertPatientCharge(PatientCharge patientCharge) {
		return patientChargeMapper.insertSelective(patientCharge);
	}

	@Override
	public int updatePatientCharge(PatientCharge patientCharge) {
		return patientChargeMapper.updateByPrimaryKeySelective(patientCharge);
	}

}
