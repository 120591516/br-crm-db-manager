package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationInvestMapper;
import br.crm.pojo.org.OrganizationInvest;
import br.crm.pojo.org.OrganizationInvestExample;
import br.crm.service.org.OrgInvestService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgInvestRedis;

/**
 * 
 * @ClassName: OrgInvestServiceImpl
 * @Description: 体检机构投资人接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:12:43
 *
 */
@Service
public class OrgInvestServiceImpl implements OrgInvestService {

    @Autowired
    private OrganizationInvestMapper organizationInvestMapper;

    @Autowired
    private OrgInvestRedis orgInvestRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgInvest
     * </p>
     * <p>
     * Description: 新增体检机构投资人
     * </p>
     * 
     * @param organizationInvest
     * @return
     * @see br.crm.service.org.OrgInvestService#insertOrgInvest(br.crm.pojo.org.OrganizationInvest)
     */
    @Override
    public int insertOrgInvest(OrganizationInvest organizationInvest) {
        Long orgInvestId = organizationInvestMapper.insertSelective(organizationInvest);
        if (systemConfigService.getRedis()) {
            orgInvestRedis.setOrgInvest(organizationInvest);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgInvestByOrgId
     * </p>
     * <p>
     * Description: 根据机构id查询机构投资人
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgInvestService#getOrgInvestByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationInvest> getOrgInvestByOrgId(String orgId) {
        OrganizationInvestExample example4 = new OrganizationInvestExample();
        br.crm.pojo.org.OrganizationInvestExample.Criteria criteria4 = example4.createCriteria();
        criteria4.andOrgIdEqualTo(orgId);
        List<OrganizationInvest> list4 = organizationInvestMapper.selectByExample(example4);
        return list4;
    }

    /**
     * <p>
     * Title:updateOrgInvest
     * </p>
     * <p>
     * Description: 修改机构投资人信息
     * </p>
     * 
     * @param organizationInvest
     * @return
     * @see br.crm.service.org.OrgInvestService#updateOrgInvest(br.crm.pojo.org.OrganizationInvest)
     */
    @Override
    public int updateOrgInvest(OrganizationInvest organizationInvest) {
        int updateByPrimaryKeySelective = organizationInvestMapper.updateByPrimaryKeySelective(organizationInvest);
        if (systemConfigService.getRedis()) {
            orgInvestRedis.setOrgInvest(organizationInvest);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:deleteOrgInvest
     * </p>
     * <p>
     * Description: 删除机构投资人
     * </p>
     * 
     * @param orgInvestId
     * @return
     * @see br.crm.service.org.OrgInvestService#deleteOrgInvest(java.lang.Long)
     */
    @Override
    public int deleteOrgInvest(Long orgInvestId) {
        if (systemConfigService.getRedis()) {
            orgInvestRedis.deleteOrgInvest(orgInvestId);
        }
        return organizationInvestMapper.deleteByPrimaryKey(orgInvestId);
    }

    /**
     * <p>
     * Title:getOrgInvestByInvestId
     * </p>
     * <p>
     * Description: 根据投资人id查询机构投资人
     * </p>
     * 
     * @param orgInvestId
     * @return
     * @see br.crm.service.org.OrgInvestService#getOrgInvestByInvestId(java.lang.Long)
     */
    @Override
    public OrganizationInvest getOrgInvestByInvestId(Long orgInvestId) {
        OrganizationInvest organizationInvest = null;
        if (systemConfigService.getRedis()) {
            organizationInvest = orgInvestRedis.getOrgInvest(orgInvestId);
        }
        else {
            organizationInvest = organizationInvestMapper.selectByPrimaryKey(orgInvestId);
        }
        return organizationInvest;
    }

    /**
     * <p>Title:getAll</p> 
     * <p>Description: 获取所有投资人</p> 
     * @return
     * @see br.crm.service.org.OrgInvestService#getAll()
     */
    @Override
    public List<OrganizationInvest> getAll() {
        List<OrganizationInvest> list = organizationInvestMapper.selectByExample(null);
        return list;
    }

}
