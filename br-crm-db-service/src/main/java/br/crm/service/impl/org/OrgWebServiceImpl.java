package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationWebMapper;
import br.crm.pojo.org.OrganizationWeb;
import br.crm.pojo.org.OrganizationWebExample;
import br.crm.service.org.OrgWebService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgWebRedis;

/**
 * 
 * @ClassName: OrgWebServiceImpl
 * @Description:体检机构web服务接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:13:50
 *
 */
@Service
public class OrgWebServiceImpl implements OrgWebService {
    @Autowired
    private OrganizationWebMapper organizationWebMapper;

    @Autowired
    private OrgWebRedis orgWebRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgWeb
     * </p>
     * <p>
     * Description: 新增体检机构web服务
     * </p>
     * 
     * @param organizationWeb
     * @return
     * @see br.crm.service.org.OrgWebService#insertOrgWeb(br.crm.pojo.org.OrganizationWeb)
     */
    @Override
    public int insertOrgWeb(OrganizationWeb organizationWeb) {
        Long orgWebId = organizationWebMapper.insertSelective(organizationWeb);
        if (systemConfigService.getRedis()) {
            orgWebRedis.setOrgWeb(organizationWeb);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgWebByOrgId
     * </p>
     * <p>
     * Description: 根据机构id查询机构web服务
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgWebService#getOrgWebByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationWeb> getOrgWebByOrgId(String orgId) {
        OrganizationWebExample example8 = new OrganizationWebExample();
        br.crm.pojo.org.OrganizationWebExample.Criteria criteria8 = example8.createCriteria();
        criteria8.andOrgIdEqualTo(orgId);
        List<OrganizationWeb> list8 = organizationWebMapper.selectByExample(example8);
        return list8;
    }

    /**
     * <p>
     * Title:updateOrgWeb
     * </p>
     * <p>
     * Description: 修改机构web服务
     * </p>
     * 
     * @param organizationWeb
     * @return
     * @see br.crm.service.org.OrgWebService#updateOrgWeb(br.crm.pojo.org.OrganizationWeb)
     */
    @Override
    public int updateOrgWeb(OrganizationWeb organizationWeb) {
        int updateByPrimaryKeySelective = organizationWebMapper.updateByPrimaryKeySelective(organizationWeb);
        if (systemConfigService.getRedis()) {
            orgWebRedis.setOrgWeb(organizationWeb);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:deleteOrgWeb
     * </p>
     * <p>
     * Description: 删除机构web服务
     * </p>
     * 
     * @param orgWebId
     * @return
     * @see br.crm.service.org.OrgWebService#deleteOrgWeb(java.lang.Long)
     */
    @Override
    public int deleteOrgWeb(Long orgWebId) {
        if (systemConfigService.getRedis()) {
            orgWebRedis.deleteOrgWeb(orgWebId);
        }
        return organizationWebMapper.deleteByPrimaryKey(orgWebId);
    }

    @Override
    public List<OrganizationWeb> getAll() {
        List<OrganizationWeb> list = organizationWebMapper.selectByExample(null);
        return list;
    }

}
