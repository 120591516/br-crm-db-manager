package br.crm.service.impl.patient.exam.depart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.exam.depart.PatientExamDepartMapper;
import br.crm.pojo.patient.exam.depart.PatientExamDepartExample;
import br.crm.pojo.patient.exam.depart.PatientExamDepartWithBLOBs;
import br.crm.service.patient.exam.depart.PatientExamDepartService;
@Service
public class PatientExamDepartServiceImpl implements PatientExamDepartService {
	@Autowired
	private PatientExamDepartMapper patientExamDepartMapper;

	@Override
	public PageInfo<PatientExamDepartWithBLOBs> gePatientExamDepartByPage(Integer page, Integer rows,
			PatientExamDepartWithBLOBs patientExamDepart) {
		PageHelper.startPage(page, rows);		
		PatientExamDepartExample example = new PatientExamDepartExample();
		example.createCriteria().andPatientExamDepartStatusEqualTo(0);
		List<PatientExamDepartWithBLOBs> list = patientExamDepartMapper.selectByExampleWithBLOBs(example );
		PageInfo<PatientExamDepartWithBLOBs> pageInfo = new PageInfo<PatientExamDepartWithBLOBs>(list);
		return pageInfo;
	}

	@Override
	public List<PatientExamDepartWithBLOBs> getAllPatientExamDepart() {
		PatientExamDepartExample example = new PatientExamDepartExample();
		example.createCriteria().andPatientExamDepartStatusEqualTo(0);
		return patientExamDepartMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public PatientExamDepartWithBLOBs getPatientExamDepartById(String patientExamDepartId) {
		return patientExamDepartMapper.selectByPrimaryKey(patientExamDepartId);
	}

	@Override
	public int insertPatientExamDepart(PatientExamDepartWithBLOBs patientExamDepart) {
		return patientExamDepartMapper.insertSelective(patientExamDepart);
	}

	@Override
	public int updatePatientExamDepart(PatientExamDepartWithBLOBs patientExamDepart) {
		return patientExamDepartMapper.updateByPrimaryKeySelective(patientExamDepart);
	}

}
