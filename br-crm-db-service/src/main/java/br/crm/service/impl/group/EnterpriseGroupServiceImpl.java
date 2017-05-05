package br.crm.service.impl.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.group.EnterpriseGroupMapper;
import br.crm.pojo.group.EnterpriseGroup;
import br.crm.pojo.group.EnterpriseGroupExample;
import br.crm.service.group.EnterpriseGroupService;

public class EnterpriseGroupServiceImpl implements EnterpriseGroupService {
	@Autowired
	private EnterpriseGroupMapper enterpriseGroupMapper;

	@Override
	public PageInfo<EnterpriseGroup> getCustomerOrderPayInfoByPage(Integer page, Integer rows,
			EnterpriseGroup enterpriseGroup) {
		PageHelper.startPage(page, rows);
		EnterpriseGroupExample example = new EnterpriseGroupExample();
		example.createCriteria().andEnterpriseGroupStatusEqualTo(0);
		List<EnterpriseGroup> list = enterpriseGroupMapper.selectByExample(example );
		PageInfo<EnterpriseGroup> pageInfo = new PageInfo<EnterpriseGroup>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseGroup> getAllenterpriseGroup() {
		EnterpriseGroupExample example = new EnterpriseGroupExample();
		example.createCriteria().andEnterpriseGroupStatusEqualTo(0);
		return enterpriseGroupMapper.selectByExample(example );
			
	}

	@Override
	public EnterpriseGroup getEnterpriseGroupById(String enterpriseGroupId) {
		return enterpriseGroupMapper.selectByPrimaryKey(enterpriseGroupId);
	}

	@Override
	public int insertEnterpriseGroup(EnterpriseGroup enterpriseGroup) {
		return enterpriseGroupMapper.insertSelective(enterpriseGroup);
	}

	@Override
	public int updateEnterpriseGroup(EnterpriseGroup enterpriseGroup) {
		return enterpriseGroupMapper.updateByPrimaryKeySelective(enterpriseGroup);
	}

}
