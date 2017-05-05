package br.crm.service.impl.patient.examItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.examItem.PatientExamItemPictureMapper;
import br.crm.pojo.patient.examItem.PatientExamItemPicture;
import br.crm.pojo.patient.examItem.PatientExamItemPictureExample;
import br.crm.service.patient.examItem.PatientExamItemPictureService;
@Service
public class PatientExamItemPictureServiceImpl implements PatientExamItemPictureService {
	@Autowired
	private PatientExamItemPictureMapper patientExamItemPictureMapper;

	@Override
	public PageInfo<PatientExamItemPicture> gePatientExamItemPictureByPage(Integer page, Integer rows,
			PatientExamItemPicture patientExamItemPicture) {
		PageHelper.startPage(page, rows);
		PatientExamItemPictureExample example = new PatientExamItemPictureExample();
		example.createCriteria().andPatientExamItemPictureStatusEqualTo(0);
		List<PatientExamItemPicture> list = patientExamItemPictureMapper.selectByExample(example );
		PageInfo<PatientExamItemPicture> pageInfo = new PageInfo<PatientExamItemPicture>(list);
		return pageInfo;
	}

	@Override
	public List<PatientExamItemPicture> getAllPatientExamItemPicture() {
		PatientExamItemPictureExample example = new PatientExamItemPictureExample();
		example.createCriteria().andPatientExamItemPictureStatusEqualTo(0);
		return  patientExamItemPictureMapper.selectByExample(example);
	}

	@Override
	public PatientExamItemPicture getPatientExamItemPictureById(String patientExamItemPictureId) {
		return patientExamItemPictureMapper.selectByPrimaryKey(patientExamItemPictureId);
	}

	@Override
	public int insertPatientExamItemPicture(PatientExamItemPicture patientExamItemPicture) {
		return patientExamItemPictureMapper.insertSelective(patientExamItemPicture);
	}

	@Override
	public int updatePatientExamItemPicture(PatientExamItemPicture patientExamItemPicture) {
		return patientExamItemPictureMapper.updateByPrimaryKeySelective(patientExamItemPicture);
	}

}
