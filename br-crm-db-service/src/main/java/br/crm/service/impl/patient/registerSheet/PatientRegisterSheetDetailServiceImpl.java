package br.crm.service.impl.patient.registerSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.registerSheet.PatientRegisterSheetDetailMapper;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheetDetail;
import br.crm.pojo.patient.registerSheet.PatientRegisterSheetDetailExample;
import br.crm.service.patient.registerSheet.PatientRegisterSheetDetailService;
@Service
public class PatientRegisterSheetDetailServiceImpl implements PatientRegisterSheetDetailService {
	@Autowired
	private PatientRegisterSheetDetailMapper patientRegisterSheetDetailMapper;

	@Override
	public PageInfo<PatientRegisterSheetDetail> getPatientRegisterSheetDetailByPage(Integer page, Integer rows,
			PatientRegisterSheetDetail patientRegisterSheetDetail) {
		PageHelper.startPage(page, rows);
		PatientRegisterSheetDetailExample example = new PatientRegisterSheetDetailExample();
		example.createCriteria().andRegDetailStatusEqualTo(0);
		List<PatientRegisterSheetDetail> list = patientRegisterSheetDetailMapper.selectByExample(example );
		PageInfo<PatientRegisterSheetDetail> pageInfo = new PageInfo<PatientRegisterSheetDetail>(list);
		return pageInfo;
	}

	@Override
	public List<PatientRegisterSheetDetail> getAllPatientRegisterSheetDetail() {
		PatientRegisterSheetDetailExample example = new PatientRegisterSheetDetailExample();
		example.createCriteria().andRegDetailStatusEqualTo(0);
		return patientRegisterSheetDetailMapper.selectByExample(example);
	}

	@Override
	public PatientRegisterSheetDetail getPatientRegisterSheetDetailById(String patientRegisterSheetDetailId) {
		return patientRegisterSheetDetailMapper.selectByPrimaryKey(patientRegisterSheetDetailId);
	}

	@Override
	public int insertPatientRegisterSheetDetail(PatientRegisterSheetDetail patientRegisterSheetDetail) {
		return patientRegisterSheetDetailMapper.insertSelective(patientRegisterSheetDetail);
	}

	@Override
	public int updatePatientRegisterSheetDetail(PatientRegisterSheetDetail patientRegisterSheetDetail) {
		return patientRegisterSheetDetailMapper.updateByPrimaryKeySelective(patientRegisterSheetDetail);
	}

}
