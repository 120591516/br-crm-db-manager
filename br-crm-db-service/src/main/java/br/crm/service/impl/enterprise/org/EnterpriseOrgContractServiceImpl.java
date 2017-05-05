package br.crm.service.impl.enterprise.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.enterprise.org.EnterpriseOrgContractMapper;
import br.crm.pojo.enterprise.org.EnterpriseOrgContract;
import br.crm.pojo.enterprise.org.EnterpriseOrgContractExample;
import br.crm.service.enterprise.org.EnterpriseOrgContractService;

public class EnterpriseOrgContractServiceImpl implements EnterpriseOrgContractService {
	@Autowired
	private EnterpriseOrgContractMapper  enterpriseOrgContractMapper;

	@Override
	public PageInfo<EnterpriseOrgContract> getEnterpriseOrgContractByPage(Integer page, Integer rows,
			EnterpriseOrgContract enterpriseOrgContract) {
		PageHelper.startPage(page, rows);
		EnterpriseOrgContractExample example = new EnterpriseOrgContractExample();
		example.createCriteria().andEnterpriseOrgContractStatusEqualTo(0);
		List<EnterpriseOrgContract> list = enterpriseOrgContractMapper.selectByExample(example );
		PageInfo<EnterpriseOrgContract> pageInfo = new PageInfo<EnterpriseOrgContract>(list);
		return pageInfo;
	}

	@Override
	public List<EnterpriseOrgContract> getAllEnterpriseOrgContract() {
		EnterpriseOrgContractExample example = new EnterpriseOrgContractExample();
		example.createCriteria().andEnterpriseOrgContractStatusEqualTo(0);
		return enterpriseOrgContractMapper.selectByExample(example);
	}

	@Override
	public EnterpriseOrgContract getEnterpriseOrgContractById(String enterpriseOrgContractId) {
		return enterpriseOrgContractMapper.selectByPrimaryKey(enterpriseOrgContractId);
	}

	@Override
	public int insertEnterpriseOrgContract(EnterpriseOrgContract enterpriseOrgContract) {
		return enterpriseOrgContractMapper.insertSelective(enterpriseOrgContract);
	}

	@Override
	public int updateEnterpriseOrgContract(EnterpriseOrgContract enterpriseOrgContract) {
		return enterpriseOrgContractMapper.updateByPrimaryKeySelective(enterpriseOrgContract);
	}

}
