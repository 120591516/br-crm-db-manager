package br.crm.service.impl.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.PatientArchiveMapper;
import br.crm.pojo.patient.PatientArchive;
import br.crm.pojo.patient.PatientArchiveExample;
import br.crm.service.patient.PatientArchiveService;
@Service
public class PatientArchiveServiceImpl implements PatientArchiveService {
	@Autowired
	private PatientArchiveMapper patientArchiveMapper;
	@Override
	public PageInfo<PatientArchive> gePatientArchiveByPage(Integer page, Integer rows, PatientArchive patientArchive) {
		PageHelper.startPage(page, rows);
		PatientArchiveExample example = new PatientArchiveExample();
		example.createCriteria().andPatientArchiveStatusEqualTo(0);
		List<PatientArchive> list = patientArchiveMapper.selectByExample(example );
		PageInfo<PatientArchive> pageInfo = new PageInfo<PatientArchive>(list);
		return pageInfo;
	}

	@Override
	public List<PatientArchive> getAllPatientArchive() {
		PatientArchiveExample example = new PatientArchiveExample();
		example.createCriteria().andPatientArchiveStatusEqualTo(0);
		return patientArchiveMapper.selectByExample(example );
	}

	@Override
	public PatientArchive getPatientArchiveById(String patientArchiveId) {
		return patientArchiveMapper.selectByPrimaryKey(patientArchiveId);
	}

	@Override
	public int insertPatientArchive(PatientArchive patientArchive) {
		return patientArchiveMapper.insertSelective(patientArchive);
	}

	@Override
	public int updatePatientArchive(PatientArchive patientArchive) {
		return patientArchiveMapper.updateByPrimaryKeySelective(patientArchive);
	}

}
