package br.crm.service.impl.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.PatientConclusionMapper;
import br.crm.pojo.patient.PatientConclusion;
import br.crm.pojo.patient.PatientConclusionExample;
import br.crm.pojo.patient.PatientConclusionWithBLOBs;
import br.crm.service.patient.PatientConclusionService;
@Service
public class PatientConclusionServiceImpl implements PatientConclusionService{
	@Autowired
	private PatientConclusionMapper patientConclusionMapper;

	@Override
	public PageInfo<PatientConclusionWithBLOBs> gePatientConclusionByPage(Integer page, Integer rows,
			PatientConclusionWithBLOBs patientConclusion) {
		PageHelper.startPage(page, rows);
		PatientConclusionExample example = new PatientConclusionExample();
		example.createCriteria().andPatientConclusionStatusEqualTo(0);
		List<PatientConclusionWithBLOBs> list = patientConclusionMapper.selectByExampleWithBLOBs(example);
		PageInfo<PatientConclusionWithBLOBs> pageInfo = new PageInfo<PatientConclusionWithBLOBs>(list);
		return pageInfo;
	}

	@Override
	public List<PatientConclusionWithBLOBs> getAllPatientConclusion() {
		PatientConclusionExample example = new PatientConclusionExample();
		example.createCriteria().andPatientConclusionStatusEqualTo(0);
		return patientConclusionMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public PatientConclusionWithBLOBs getPatientConclusionById(String patientConclusionId) {
		return patientConclusionMapper.selectByPrimaryKey(patientConclusionId);
	}

	@Override
	public int insertPatientConclusion(PatientConclusionWithBLOBs patientConclusion) {
		return patientConclusionMapper.insertSelective(patientConclusion);
	}

	@Override
	public int updatePatientConclusion(PatientConclusionWithBLOBs patientConclusion) {
		return patientConclusionMapper.updateByPrimaryKeySelective(patientConclusion);
	}

}
