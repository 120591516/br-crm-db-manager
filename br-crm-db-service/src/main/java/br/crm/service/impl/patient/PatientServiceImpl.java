package br.crm.service.impl.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.PatientMapper;
import br.crm.pojo.patient.Patient;
import br.crm.pojo.patient.PatientExample;
import br.crm.service.patient.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientMapper patientMapper;

	@Override
	public PageInfo<Patient> gePatientByPage(Integer page, Integer rows, Patient patient) {
		PageHelper.startPage(page, rows);
		PatientExample example = new PatientExample();
		example.createCriteria().andPatientStatusEqualTo(0);
		List<Patient> list = patientMapper.selectByExample(example );
		PageInfo<Patient> pageInfo = new PageInfo<Patient>(list);		
		return pageInfo;
	}

	@Override
	public List<Patient> getAllPatient() {
		PatientExample example = new PatientExample();
		example.createCriteria().andPatientStatusEqualTo(0);
		return patientMapper.selectByExample(example );
	}

	@Override
	public Patient getPatientById(String patientId) {
		return patientMapper.selectByPrimaryKey(patientId);
	}

	@Override
	public int insertPatient(Patient patient) {
		return patientMapper.insertSelective(patient);
	}

	@Override
	public int updatePatient(Patient patient) {
		return patientMapper.updateByPrimaryKeySelective(patient);
	}

}
