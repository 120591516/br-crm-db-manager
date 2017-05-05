package br.crm.service.impl.org;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.org.OrganizationConnMapper;
import br.crm.pojo.org.OrganizationConn;
import br.crm.pojo.org.OrganizationConnExample;
import br.crm.service.org.OrgConnService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.org.OrgConnRedis;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: OrgConnServiceImpl
 * @Description: 体检机构联系人接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:07:34
 *
 */
@Service
public class OrgConnServiceImpl implements OrgConnService {

    @Autowired
    private OrganizationConnMapper organizationConnMapper;

    @Autowired
    private OrgConnRedis orgConnRedis;
    
    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * <p>
     * Title:insertOrganizationConn
     * </p>
     * <p>
     * Description:新增体检机构联系人
     * </p>
     * 
     * @param organizationConn
     * @return
     * @see br.crm.service.org.OrgConnService#insertOrganizationConn(br.crm.pojo.org.OrganizationConn)
     */
    @Override
    public int insertOrganizationConn(OrganizationConn organizationConn) {
        Long orgConnId = organizationConnMapper.insertSelective(organizationConn);
        if(systemConfigService.getRedis()){
            orgConnRedis.setOrganizationConn(organizationConn);
        }
        return 1;
    }

    /**
     * <p>
     * Title:getOrgConnByOrgId
     * </p>
     * <p>
     * Description:根据机构id查询机构联系人信息
     * </p>
     * 
     * @param orgId
     * @return
     * @see br.crm.service.org.OrgConnService#getOrgConnByOrgId(java.lang.Long)
     */
    @Override
    public List<OrganizationConn> getOrgConnByOrgId(String orgId) {
        OrganizationConnExample example = new OrganizationConnExample();
        example.createCriteria().andOrgIdEqualTo(orgId).andOrgConnStatusEqualTo(0);
        example.setOrderByClause("org_conn_id asc");
        return organizationConnMapper.selectByExample(example);
    }

    /**
     * <p>
     * Title:updateOrgConn
     * </p>
     * <p>
     * Description:修改机构联系人信息
     * </p>
     * 
     * @param organizationConn
     * @return
     * @see br.crm.service.org.OrgConnService#updateOrgConn(br.crm.pojo.org.OrganizationConn)
     */
    @Override
    public int updateOrgConn(OrganizationConn organizationConn) {
        int updateByPrimaryKeySelective = organizationConnMapper.updateByPrimaryKeySelective(organizationConn);
        if(systemConfigService.getRedis()){
            orgConnRedis.setOrganizationConn(organizationConn);
        }
        return updateByPrimaryKeySelective;
    }

    /**
     * <p>
     * Title:getOrgConnByOrgConnId
     * </p>
     * <p>
     * Description:根据联系人id获取联系人信息
     * </p>
     * 
     * @param orgConnId
     * @return
     * @see br.crm.service.org.OrgConnService#getOrgConnByOrgConnId(java.lang.Long)
     */
    @Override
    public OrganizationConn getOrgConnByOrgConnId(Long orgConnId) {
        OrganizationConn organizationConn = null;
        if(systemConfigService.getRedis()){
            organizationConn = orgConnRedis.getOrganizationConn(orgConnId);
        }else{
            organizationConn = organizationConnMapper.selectByPrimaryKey(orgConnId);
        }
        return organizationConn;
    }

    /**
     * <p>Title:getAllConn</p> 
     * <p>Description:获取所有联系人 </p> 
     * @return
     * @see br.crm.service.org.OrgConnService#getAllConn()
     */
    @Override
    public List<OrganizationConn> getAllConn() {
        List<OrganizationConn> list = organizationConnMapper.selectByExample(null);
        return list;
    }
}
