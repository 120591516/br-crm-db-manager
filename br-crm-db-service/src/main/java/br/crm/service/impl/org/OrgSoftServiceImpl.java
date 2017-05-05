package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationSoftMapper;
import br.crm.pojo.org.OrganizationSoft;
import br.crm.pojo.org.OrganizationSoftExample;
import br.crm.service.org.OrgSoftService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgSoftRedis;

/**
 * 
 * @ClassName: OrgSoftServiceImpl
 * @Description: 体检机构软件接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:13:27
 *
 */
@Service
public class OrgSoftServiceImpl implements OrgSoftService {

    @Autowired
    private OrganizationSoftMapper organizationSoftMapper;

    @Autowired
    private OrgSoftRedis orgSoftRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgSoft
     * </p>
     * <p>
     * Description:新增体检机构软件
     * </p>
     * 
     * @param organizationSoft
     * @return
     * @see br.crm.service.org.OrgSoftService#insertOrgSoft(br.crm.pojo.org.OrganizationSoft)
     */
    @Override
    public int insertOrgSoft(OrganizationSoft organizationSoft) {
        Long orgSoftId = organizationSoftMapper.insertSelective(organizationSoft);
        if (systemConfigService.getRedis()) {
            orgSoftRedis.setOrgSoft(organizationSoft);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgSoftByOrgId
     * </p>
     * <p>
     * Description: 根据机构id查询机构软件
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgSoftService#getOrgSoftByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationSoft> getOrgSoftByOrgId(String orgId) {
        OrganizationSoftExample example6 = new OrganizationSoftExample();
        br.crm.pojo.org.OrganizationSoftExample.Criteria criteria6 = example6.createCriteria();
        criteria6.andOrgIdEqualTo(orgId);
        criteria6.andOrgSoftstatusEqualTo(0);
        List<OrganizationSoft> list6 = organizationSoftMapper.selectByExample(example6);
        return list6;
    }

    /**
     * <p>
     * Title:updateOrgSoft
     * </p>
     * <p>
     * Description: 修改机构软件
     * </p>
     * 
     * @param organizationSoft
     * @return
     * @see br.crm.service.org.OrgSoftService#updateOrgSoft(br.crm.pojo.org.OrganizationSoft)
     */
    @Override
    public int updateOrgSoft(OrganizationSoft organizationSoft) {
        int updateByPrimaryKeySelective = organizationSoftMapper.updateByPrimaryKeySelective(organizationSoft);
        if (systemConfigService.getRedis()) {
            orgSoftRedis.setOrgSoft(organizationSoft);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:getOrgSoftBySoftId
     * </p>
     * <p>
     * Description: 根据软件id查询机构软件
     * </p>
     * 
     * @param orgSoftId
     * @return
     * @see br.crm.service.org.OrgSoftService#getOrgSoftBySoftId(java.lang.Long)
     */
    @Override
    public OrganizationSoft getOrgSoftBySoftId(Long orgSoftId) {
        OrganizationSoft organizationSoft = null;
        if (systemConfigService.getRedis()) {
            organizationSoft = orgSoftRedis.getOrgSoft(orgSoftId);
        }
        else {
            organizationSoft = organizationSoftMapper.selectByPrimaryKey(orgSoftId);
        }
        return organizationSoft;
    }

    @Override
    public List<OrganizationSoft> getAll() {
        List<OrganizationSoft> list = organizationSoftMapper.selectByExample(null);
        return list;
    }

}
