package br.crm.service.impl.enterprise.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.enterprise.org.EnterpriseOrgMapper;
import br.crm.pojo.enterprise.org.EnterpriseOrg;
import br.crm.pojo.enterprise.org.EnterpriseOrgExample;
import br.crm.service.enterprise.org.EnterpriseOrgService;

public class EnterpriseOrgServiceImpl implements EnterpriseOrgService {
	@Autowired
	private EnterpriseOrgMapper enterpriseOrgMapper;

	@Override
	public PageInfo<EnterpriseOrg> getEnterpriseOrgByPage(Integer page, Integer rows, EnterpriseOrg enterpriseOrg) {
		PageHelper.startPage(page, rows);
		EnterpriseOrgExample example = new EnterpriseOrgExample();
		example.createCriteria().andEnterpriseOrgStatusEqualTo(0);		
		List<EnterpriseOrg> list = enterpriseOrgMapper.selectByExample(example);
		PageInfo<EnterpriseOrg> pegeInfo = new PageInfo<EnterpriseOrg>(list);
		return pegeInfo;
	}

	@Override
	public List<EnterpriseOrg> getAllEnterpriseOrg() {
		EnterpriseOrgExample example = new EnterpriseOrgExample();
		example.createCriteria().andEnterpriseOrgStatusEqualTo(0);	
		return enterpriseOrgMapper.selectByExample(example);
	}

	@Override
	public EnterpriseOrg getEnterpriseOrgById(String enterpriseOrgId) {
		return enterpriseOrgMapper.selectByPrimaryKey(enterpriseOrgId);
	}

	@Override
	public int insertEnterpriseOrg(EnterpriseOrg enterpriseOrg) {
		return enterpriseOrgMapper.insertSelective(enterpriseOrg);
	}

	@Override
	public int updateEnterpriseOrg(EnterpriseOrg enterpriseOrg) {
		return enterpriseOrgMapper.updateByPrimaryKeySelective(enterpriseOrg);
	}

}
