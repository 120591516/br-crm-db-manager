package br.crm.service.impl.patient.examItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.examItem.PatientExamItemValueMapper;
import br.crm.pojo.patient.examItem.PatientExamItemValue;
import br.crm.pojo.patient.examItem.PatientExamItemValueExample;
import br.crm.service.patient.examItem.PatientExamItemValueService;
@Service
public class PatientExamItemValueServiceImpl implements PatientExamItemValueService {
	@Autowired
	private PatientExamItemValueMapper patientExamItemValueMapper;

	@Override
	public PageInfo<PatientExamItemValue> gePatientExamItemValueByPage(Integer page, Integer rows,
			PatientExamItemValue patientExamItemValue) {
		PageHelper.startPage(page, rows);
		PatientExamItemValueExample example = new PatientExamItemValueExample();
		example.createCriteria().andPatientExamItemValueStatusEqualTo(0);
		List<PatientExamItemValue> list = patientExamItemValueMapper.selectByExample(example );
		PageInfo<PatientExamItemValue> pageInfo = new PageInfo<PatientExamItemValue>(list);
		return pageInfo;
	}

	@Override
	public List<PatientExamItemValue> getAllPatientExamItemValue() {
		PatientExamItemValueExample example = new PatientExamItemValueExample();
		example.createCriteria().andPatientExamItemValueStatusEqualTo(0);
		return patientExamItemValueMapper.selectByExample(example );
	}

	@Override
	public PatientExamItemValue getPatientExamItemValueById(String patientExamItemValueId) {
		return patientExamItemValueMapper.selectByPrimaryKey(patientExamItemValueId);
	}

	@Override
	public int insertPatientExamItemValue(PatientExamItemValue patientExamItemValue) {
		return patientExamItemValueMapper.insertSelective(patientExamItemValue);
	}

	@Override
	public int updatePatientExamItemValue(PatientExamItemValue patientExamItemValue) {
		return patientExamItemValueMapper.updateByPrimaryKeySelective(patientExamItemValue);
	}

}
