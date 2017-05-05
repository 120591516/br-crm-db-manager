package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationIncomeMapper;
import br.crm.pojo.org.OrganizationIncome;
import br.crm.pojo.org.OrganizationIncomeExample;
import br.crm.service.org.OrgIncomeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgIncomeRedis;

/**
 * 
 * @ClassName: OrgIncomeServiceImpl
 * @Description: 体检机构收入接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:08:11
 *
 */
@Service
public class OrgIncomeServiceImpl implements OrgIncomeService {

    @Autowired
    private OrganizationIncomeMapper organizationIncomeMapper;

    @Autowired
    private OrgIncomeRedis orgIncomeRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgIncome
     * </p>
     * <p>
     * Description:新增体检机构收入
     * </p>
     * 
     * @param organizationIncome
     * @return
     * @see br.crm.service.org.OrgIncomeService#insertOrgIncome(br.crm.pojo.org.OrganizationIncome)
     */
    @Override
    public int insertOrgIncome(OrganizationIncome organizationIncome) {
        Long insertSelective = organizationIncomeMapper.insertSelective(organizationIncome);
        if (systemConfigService.getRedis()) {
            orgIncomeRedis.setOrgIncome(organizationIncome);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgIncomeByOrgId
     * </p>
     * <p>
     * Description: 根据机构id查询收入
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgIncomeService#getOrgIncomeByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationIncome> getOrgIncomeByOrgId(String orgId) {
        // 收入
        OrganizationIncomeExample example3 = new OrganizationIncomeExample();
        br.crm.pojo.org.OrganizationIncomeExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andOrgIdEqualTo(orgId);
        List<OrganizationIncome> list3 = organizationIncomeMapper.selectByExample(example3);
        return list3;
    }

    /**
     * <p>
     * Title:updateOrgIncome
     * </p>
     * <p>
     * Description:修改机构收入
     * </p>
     * 
     * @param organizationIncome
     * @return
     * @see br.crm.service.org.OrgIncomeService#updateOrgIncome(br.crm.pojo.org.OrganizationIncome)
     */
    @Override
    public int updateOrgIncome(OrganizationIncome organizationIncome) {
        int updateByPrimaryKeySelective = organizationIncomeMapper.updateByPrimaryKeySelective(organizationIncome);
        if (systemConfigService.getRedis()) {
            orgIncomeRedis.setOrgIncome(organizationIncome);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:deleteOrgIncome
     * </p>
     * <p>
     * Description:删除机构收入
     * </p>
     * 
     * @param orgIncomeId
     * @return
     * @see br.crm.service.org.OrgIncomeService#deleteOrgIncome(java.lang.Long)
     */
    @Override
    public int deleteOrgIncome(long orgIncomeId) {
        if (systemConfigService.getRedis()) {
            orgIncomeRedis.deleteOrgIncome(orgIncomeId);
        }
        return organizationIncomeMapper.deleteByPrimaryKey(orgIncomeId);
    }

    /**
     * <p>
     * Title:getOrgIncomeByIncomeId
     * </p>
     * <p>
     * Description:根据收入id查询收入
     * </p>
     * 
     * @param orgIncomeId
     * @return
     * @see br.crm.service.org.OrgIncomeService#getOrgIncomeByIncomeId(java.lang.Long)
     */
    @Override
    public OrganizationIncome getOrgIncomeByIncomeId(Long orgIncomeId) {
        OrganizationIncome organizationIncome = null;
        if (systemConfigService.getRedis()) {
            organizationIncome = orgIncomeRedis.getOrgIncome(orgIncomeId);
        }
        else {
            organizationIncome = organizationIncomeMapper.selectByPrimaryKey(orgIncomeId);
        }
        return organizationIncome;
    }

    /**
     * <p>Title:getAll</p> 
     * <p>Description: 获取所有体检信息</p> 
     * @return
     * @see br.crm.service.org.OrgIncomeService#getAll()
     */
    @Override
    public List<OrganizationIncome> getAll() {
        List<OrganizationIncome> list = organizationIncomeMapper.selectByExample(null);
        return list;
    }

}
