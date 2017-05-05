package br.crm.service.impl.patient.registerSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.registerSheet.PatientRegisterSheetMapper;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheet;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheetExample;
import br.crm.service.patient.registerSheet.PatientRegisterSheetService;
@Service
public class PatientRegisterSheetServiceImpl implements PatientRegisterSheetService {
	@Autowired
	private PatientRegisterSheetMapper patientRegisterSheetMapper;
	@Override
	public PageInfo<PatientRegisterSheet> getPatientRegisterSheetByPage(Integer page, Integer rows,
			PatientRegisterSheet patientRegisterSheet) {
		PageHelper.startPage(page, rows);
		PatientRegisterSheetExample example = new PatientRegisterSheetExample();
		example.createCriteria().andRegStatusEqualTo(0);
		List<PatientRegisterSheet> list = patientRegisterSheetMapper.selectByExample(example );
		PageInfo<PatientRegisterSheet> pageInfo = new PageInfo<PatientRegisterSheet>(list);
		return pageInfo;
	}

	@Override
	public List<PatientRegisterSheet> getAllPatientRegisterSheet() {
		PatientRegisterSheetExample example = new PatientRegisterSheetExample();
		example.createCriteria().andRegStatusEqualTo(0);
		return patientRegisterSheetMapper.selectByExample(example );
	}

	@Override
	public PatientRegisterSheet getPatientRegisterSheetById(String patientRegisterSheetId) {
		return patientRegisterSheetMapper.selectByPrimaryKey(patientRegisterSheetId);
	}

	@Override
	public int insertPatientRegisterSheet(PatientRegisterSheet patientRegisterSheet) {
		return patientRegisterSheetMapper.insertSelective(patientRegisterSheet);
	}

	@Override
	public int updatePatientRegisterSheet(PatientRegisterSheet patientRegisterSheet) {
		return patientRegisterSheetMapper.updateByPrimaryKeySelective(patientRegisterSheet);
	}

}
