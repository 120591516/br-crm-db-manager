package br.crm.service.impl.patient.feeItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.patient.feeItem.PatientFeeItemMapper;
import br.crm.pojo.patient.feeItem.PatientFeeItem;
import br.crm.pojo.patient.feeItem.PatientFeeItemExample;
import br.crm.service.patient.feeItem.PatientFeeItemService;
@Service
public class PatientFeeItemServiceImpl implements PatientFeeItemService {
	@Autowired
	private PatientFeeItemMapper patientFeeItemMapper;

	@Override
	public PageInfo<PatientFeeItem> getPatientFeeItemByPage(Integer page, Integer rows, PatientFeeItem patientFeeItem) {
		PageHelper.startPage(page, rows);		
		PatientFeeItemExample example = new PatientFeeItemExample();
		example.createCriteria().andPatientFeeItemStatusEqualTo(0);
		List<PatientFeeItem> list = patientFeeItemMapper.selectByExample(example );
		PageInfo<PatientFeeItem> pageInfo = new PageInfo<PatientFeeItem>(list);
		return pageInfo;
	}

	@Override
	public List<PatientFeeItem> getAllPatientFeeItem() {
		PatientFeeItemExample example = new PatientFeeItemExample();
		example.createCriteria().andPatientFeeItemStatusEqualTo(0);
		return patientFeeItemMapper.selectByExample(example );
	}

	@Override
	public PatientFeeItem getPatientFeeItemById(String patientFeeItemId) {
		return patientFeeItemMapper.selectByPrimaryKey(patientFeeItemId);
	}

	@Override
	public int insertPatientFeeItem(PatientFeeItem patientFeeItem) {
		return patientFeeItemMapper.insertSelective(patientFeeItem);
	}

	@Override
	public int updatePatientFeeItem(PatientFeeItem patientFeeItem) {
		return patientFeeItemMapper.updateByPrimaryKeySelective(patientFeeItem);
	}

}
