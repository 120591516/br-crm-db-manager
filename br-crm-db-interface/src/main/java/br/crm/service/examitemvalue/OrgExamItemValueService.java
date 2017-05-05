package br.crm.service.examitemvalue;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.examitemvalue.OrganizationExamItemValue;
import br.crm.vo.examitemvalue.OrgExamItemValueVo;

public interface OrgExamItemValueService {

	PageInfo<OrgExamItemValueVo> getOrgExamItemValueByPage(OrgExamItemValueVo orgExamItemValue,Integer page, Integer rows);

	int insertOrgExamItemValue(OrganizationExamItemValue orgExamItemValue);

	OrgExamItemValueVo getOrgExamItemValueById(String orgExamItemValueId);

	int updateOrgExamItemValue(OrganizationExamItemValue orgExamItemValue);
	
	List<OrganizationExamItemValue> getAllOrganizationExamItemValue();
	
    List<OrganizationExamItemValue> getAllOrgExamItemValue(String examItemId);

	List<Map<String, String>> getExamItemName();

}
