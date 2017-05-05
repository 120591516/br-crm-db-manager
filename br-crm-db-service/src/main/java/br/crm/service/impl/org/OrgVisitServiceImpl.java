package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationVisitMapper;
import br.crm.pojo.org.OrganizationVisit;
import br.crm.pojo.org.OrganizationVisitExample;
import br.crm.service.org.OrgVisitService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgVisitRedis;

/**
 * 
 * @ClassName: OrgVisitServiceImpl
 * @Description: 体检机构拜访信息接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:13:39
 *
 */
@Service
public class OrgVisitServiceImpl implements OrgVisitService {

    @Autowired
    private OrganizationVisitMapper organizationVisitMapper;

    @Autowired
    private OrgVisitRedis orgVisitRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgVisit
     * </p>
     * <p>
     * Description:新增体检机构拜访信息
     * </p>
     * 
     * @param organizationVisit
     * @return
     * @see br.crm.service.org.OrgVisitService#insertOrgVisit(br.crm.pojo.org.OrganizationVisit)
     */
    @Override
    public int insertOrgVisit(OrganizationVisit organizationVisit) {
        Long orgVisitId = organizationVisitMapper.insertSelective(organizationVisit);
        if (systemConfigService.getRedis()) {
            orgVisitRedis.setOrgVisit(organizationVisit);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgVisitByOrgId
     * </p>
     * <p>
     * Description:根据机构id查询机构拜访信息
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgVisitService#getOrgVisitByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationVisit> getOrgVisitByOrgId(String orgId) {
        OrganizationVisitExample example7 = new OrganizationVisitExample();
        br.crm.pojo.org.OrganizationVisitExample.Criteria criteria7 = example7.createCriteria();
        criteria7.andOrgIdEqualTo(orgId);
        List<OrganizationVisit> list7 = organizationVisitMapper.selectByExample(example7);
        return list7;
    }

    /**
     * <p>
     * Title:updateOrgVisit
     * </p>
     * <p>
     * Description: 修改机构拜访信息
     * </p>
     * 
     * @param organizationVisit
     * @return
     * @see br.crm.service.org.OrgVisitService#updateOrgVisit(br.crm.pojo.org.OrganizationVisit)
     */
    @Override
    public int updateOrgVisit(OrganizationVisit organizationVisit) {
        int updateByPrimaryKeySelective = organizationVisitMapper.updateByPrimaryKeySelective(organizationVisit);
        if (systemConfigService.getRedis()) {
            orgVisitRedis.setOrgVisit(organizationVisit);
        }
        return updateByPrimaryKeySelective;

    }

    /**
     * <p>
     * Title:deleteOrgVisit
     * </p>
     * <p>
     * Description: 删除机构拜访信息
     * </p>
     * 
     * @param orgVisitId
     * @return
     * @see br.crm.service.org.OrgVisitService#deleteOrgVisit(java.lang.Long)
     */
    @Override
    public int deleteOrgVisit(Long orgVisitId) {
        if (systemConfigService.getRedis()) {
            orgVisitRedis.deleteOrgVisit(orgVisitId);
        }
        return organizationVisitMapper.deleteByPrimaryKey(orgVisitId);
    }

    /**
     * <p>
     * Title:getOrgVisitByVisitId
     * </p>
     * <p>
     * Description: 根据拜访id查询机构拜访信息
     * </p>
     * 
     * @param orgVisitId
     * @return
     * @see br.crm.service.org.OrgVisitService#getOrgVisitByVisitId(java.lang.Long)
     */
    @Override
    public OrganizationVisit getOrgVisitByVisitId(Long orgVisitId) {
        OrganizationVisit organizationVisit = null;
        if (systemConfigService.getRedis()) {
            organizationVisit = orgVisitRedis.getOrgVisit(orgVisitId);
        }
        else {
            organizationVisit = organizationVisitMapper.selectByPrimaryKey(orgVisitId);
        }
        return organizationVisit;
    }

    @Override
    public List<OrganizationVisit> getAll() {
        List<OrganizationVisit> list = organizationVisitMapper.selectByExample(null);
        return list;
    }

}
