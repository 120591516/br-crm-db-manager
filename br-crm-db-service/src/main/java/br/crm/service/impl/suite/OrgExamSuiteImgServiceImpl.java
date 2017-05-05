package br.crm.service.impl.suite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.service.suite.OrgExamSuiteImgService;
@Service
public class OrgExamSuiteImgServiceImpl implements OrgExamSuiteImgService {
	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;

	@Override
	public List<OrganizationExamSuiteImg> getAllOrgExamSuiteImg() {
		return organizationExamSuiteImgMapper.selectByExample(null);
	}

}
