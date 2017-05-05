package br.crm.service.impl.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.group.EnterpriseGroupSuiteMapper;
import br.crm.pojo.group.EnterpriseGroupSuite;
import br.crm.pojo.group.EnterpriseGroupSuiteExample;
import br.crm.service.group.EnterpriseGroupSuiteService;

public class EnterpriseGroupSuiteServiceImpl implements EnterpriseGroupSuiteService {
	@Autowired
	private EnterpriseGroupSuiteMapper enterpriseGroupSuiteMapper;

	@Override
	public PageInfo<EnterpriseGroupSuite> getEnterpriseGroupSuiteByPage(Integer page, Integer rows,
			EnterpriseGroupSuite enterpriseGroupSuite) {
		PageHelper.startPage(page, rows);
		EnterpriseGroupSuiteExample example = new EnterpriseGroupSuiteExample();
		example.createCriteria().andEnterpriseGroupSuiteStatusEqualTo(0);
		List<EnterpriseGroupSuite> list = enterpriseGroupSuiteMapper.selectByExample(example );
		PageInfo<EnterpriseGroupSuite> pageInfo = new PageInfo<EnterpriseGroupSuite>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseGroupSuite> getAllCEnterpriseGroupSuite() {
		EnterpriseGroupSuiteExample example = new EnterpriseGroupSuiteExample();
		example.createCriteria().andEnterpriseGroupSuiteStatusEqualTo(0);
		return enterpriseGroupSuiteMapper.selectByExample(example );
	}

	@Override
	public EnterpriseGroupSuite getEnterpriseGroupSuiteById(String enterpriseGroupSuiteId) {
		return enterpriseGroupSuiteMapper.selectByPrimaryKey(enterpriseGroupSuiteId);
	}

	@Override
	public int insertEnterpriseGroupSuite(EnterpriseGroupSuite enterpriseGroupSuite) {
		return enterpriseGroupSuiteMapper.insertSelective(enterpriseGroupSuite);
	}

	@Override
	public int updateEnterpriseGroupSuite(EnterpriseGroupSuite enterpriseGroupSuite) {
		return enterpriseGroupSuiteMapper.updateByPrimaryKeySelective(enterpriseGroupSuite);
	}

}
