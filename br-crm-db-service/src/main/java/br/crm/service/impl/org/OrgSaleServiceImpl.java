package br.crm.service.impl.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.org.OrganizationSaleMapper;
import br.crm.pojo.org.OrganizationSale;
import br.crm.pojo.org.OrganizationSaleExample;
import br.crm.service.org.OrgSaleService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgSaleRedis;

/**
 * 
 * @ClassName: OrgSaleServiceImpl
 * @Description: 体检机构销售信息接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:13:15
 *
 */
@Service
public class OrgSaleServiceImpl implements OrgSaleService {
    @Autowired
    private OrganizationSaleMapper organizationSaleMapper;

    @Autowired
    private OrgSaleRedis orgSaleRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrgSale
     * </p>
     * <p>
     * Description: 新增体检机构销售信息
     * </p>
     * 
     * @param organizationSale
     * @return
     * @see br.crm.service.org.OrgSaleService#insertOrgSale(br.crm.pojo.org.OrganizationSale)
     */
    @Override
    public int insertOrgSale(OrganizationSale organizationSale) {
        Long orgSaleId = organizationSaleMapper.insertSelective(organizationSale);
        if (systemConfigService.getRedis()) {
            orgSaleRedis.setOrganizationSale(organizationSale);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgSaleByOrgId
     * </p>
     * <p>
     * Description: 根据机构id查询机构销售信息
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgSaleService#getOrgSaleByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationSale> getOrgSaleByOrgId(String orgId) {
        OrganizationSaleExample example5 = new OrganizationSaleExample();
        br.crm.pojo.org.OrganizationSaleExample.Criteria criteria5 = example5.createCriteria();
        criteria5.andOrgIdEqualTo(orgId);
        criteria5.andOrgSaleStatusEqualTo(0);
        List<OrganizationSale> list5 = organizationSaleMapper.selectByExample(example5);
        return list5;
    }

    /**
     * <p>
     * Title:updateOrgSale
     * </p>
     * <p>
     * Description:修改机构销售信息
     * </p>
     * 
     * @param organizationSale
     * @return
     * @see br.crm.service.org.OrgSaleService#updateOrgSale(br.crm.pojo.org.OrganizationSale)
     */
    @Override
    public int updateOrgSale(OrganizationSale organizationSale) {
        int updateByPrimaryKeySelective = organizationSaleMapper.updateByPrimaryKeySelective(organizationSale);
        if (systemConfigService.getRedis()) {
            orgSaleRedis.setOrganizationSale(organizationSale);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:getOrgSaleBySaleId
     * </p>
     * <p>
     * Description: 根据销售id查询机构销售信息
     * </p>
     * 
     * @param orgSaleId
     * @return
     * @see br.crm.service.org.OrgSaleService#getOrgSaleBySaleId(java.lang.Long)
     */
    @Override
    public OrganizationSale getOrgSaleBySaleId(Long orgSaleId) {
        OrganizationSale organizationSale = null;
        if (systemConfigService.getRedis()) {
            organizationSale = orgSaleRedis.getOrganizationSale(orgSaleId);
        }
        else {
            organizationSale = organizationSaleMapper.selectByPrimaryKey(orgSaleId);
        }
        return organizationSale;
    }

    /**
     * <p>Title:getAll</p> 
     * <p>Description:获取所有体检机构销售信息 </p> 
     * @return
     * @see br.crm.service.org.OrgSaleService#getAll()
     */
    @Override
    public List<OrganizationSale> getAll() {
        List<OrganizationSale> list = organizationSaleMapper.selectByExample(null);
        return list;
    }

}
