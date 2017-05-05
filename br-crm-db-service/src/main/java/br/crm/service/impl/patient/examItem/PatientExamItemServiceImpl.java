package br.crm.service.impl.patient.examItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.examItem.PatientExamItemMapper;
import br.crm.pojo.patient.examItem.PatientExamItemExample;
import br.crm.pojo.patient.examItem.PatientExamItemWithBLOBs;
import br.crm.service.patient.examItem.PatientExamItemService;
@Service
public class PatientExamItemServiceImpl implements PatientExamItemService {
	@Autowired
	private PatientExamItemMapper patientExamItemMapper;

	@Override
	public PageInfo<PatientExamItemWithBLOBs> gePatientExamItemByPage(Integer page, Integer rows,
			PatientExamItemWithBLOBs patientExamItem) {
		PatientExamItemExample example = new PatientExamItemExample();
		example.createCriteria().andPatientExamItemStatusEqualTo(0);
		List<PatientExamItemWithBLOBs> list = patientExamItemMapper.selectByExampleWithBLOBs(example);
		PageInfo<PatientExamItemWithBLOBs> pageInfo = new PageInfo<PatientExamItemWithBLOBs>(list);
		return pageInfo;
	}

	@Override
	public List<PatientExamItemWithBLOBs> getAllPatientExamItem() {
		PatientExamItemExample example = new PatientExamItemExample();
		example.createCriteria().andPatientExamItemStatusEqualTo(0);
		return patientExamItemMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public PatientExamItemWithBLOBs getPatientExamItemById(String patientExamItemId) {
		return patientExamItemMapper.selectByPrimaryKey(patientExamItemId);
	}

	@Override
	public int insertPatientExamItem(PatientExamItemWithBLOBs patientExamItem) {
		return patientExamItemMapper.insertSelective(patientExamItem);
	}

	@Override
	public int updatePatientExamItem(PatientExamItemWithBLOBs patientExamItem) {
		return patientExamItemMapper.updateByPrimaryKeySelective(patientExamItem);
	}

}
