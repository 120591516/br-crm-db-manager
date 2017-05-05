package br.crm.service.impl.branch;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.branch.OrganizationBranchRestMapper;
import br.crm.pojo.branch.OrganizationBranchRest;
import br.crm.pojo.branch.OrganizationBranchRestExample;
import br.crm.pojo.branch.OrganizationBranchRestExample.Criteria;
import br.crm.service.branch.OrgRestService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.branch.OrgBranchRestRedis;

/**
 * 休息日ServiceImpl
 * 
 * @ClassName: OrgRestServiceImpl
 * @Description: TODO(休息日ServiceImpl)
 * @author adminis
 * @date 2016年9月12日 下午2:01:22
 *
 */
@Service
public class OrgRestServiceImpl implements OrgRestService {

    /**
     * 休息日-DAO
     */
    @Autowired
    private OrganizationBranchRestMapper organizationBranchRestMapper;

    @Autowired
    private OrgBranchRestRedis orgBranchRestRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * (添加休息日)
     * <p>
     * Title: insertOrganizationRest
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationBranchRest
     *            休息日对象
     * @return
     * @see br.crm.service.branch.OrgRestService#insertOrganizationRest(br.crm.pojo.org.OrganizationBranchRest)
     */
    @Override
    public int insertOrganizationRest(OrganizationBranchRest organizationBranchRest) {
        int result = organizationBranchRestMapper.insertSelective(organizationBranchRest);
        if (systemConfigService.getRedis()) {
            orgBranchRestRedis.setOrgBranchRest(organizationBranchRest);
        }
        return result;
    }

    /**
     * (根据门店的ID查询休息日星期)
     * <p>
     * Title: getOrganizationRestById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            门店ID
     * @return
     * @see br.crm.service.branch.OrgRestService#getOrganizationRestById(java.lang.Long)
     */
    @Override
    public List<OrganizationBranchRest> getOrganizationRestById(String id) {

        OrganizationBranchRestExample example = new OrganizationBranchRestExample();
        Criteria criteria = example.createCriteria();
        criteria.andBranchIdEqualTo(id);
        criteria.andBranchRestTypeEqualTo(1);
        criteria.andBranchRestStatusEqualTo(0);
        List<OrganizationBranchRest> list = organizationBranchRestMapper.selectByExample(example);
        return list;
    }

    /**
     * (更新休息日)
     * <p>
     * Title: updateOrganizationRest
     * </p>
     * <p>
     * Description:更新休息日
     * </p>
     * 
     * @param branchRest
     *            休息日对象
     * @return
     * @see br.crm.service.branch.OrgRestService#updateOrganizationRest(br.crm.pojo.org.OrganizationBranchRest)
     */
    @Override
    public int updateOrganizationRest(OrganizationBranchRest branchRest) {
        branchRest.setBranchRestEditTime(new Date());
        int result = organizationBranchRestMapper.updateByPrimaryKeySelective(branchRest);
        if (systemConfigService.getRedis()) {
            orgBranchRestRedis.setOrgBranchRest(branchRest);
        }
        return result;
    }

    /**
    * <p>Title: getOrganizationRestDayById</p> 
    * <p>Description: </p> 
    * @param id
    * @param page
    * @param rows
    * @return 
    * @see br.crm.service.branch.OrgRestService#getOrganizationRestDayById(java.lang.String, java.lang.Integer, java.lang.Integer) 
    */
    @Override
    public PageInfo<OrganizationBranchRest> getOrganizationRestDayById(String id, Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        OrganizationBranchRestExample example = new OrganizationBranchRestExample();
        Criteria criteria = example.createCriteria();
        criteria.andBranchIdEqualTo(id);
        criteria.andBranchRestTypeEqualTo(2);
        criteria.andBranchRestStatusEqualTo(0);
        example.setOrderByClause("branch_rest_create_time desc");
        List<OrganizationBranchRest> list = organizationBranchRestMapper.selectByExample(example);
        PageInfo<OrganizationBranchRest> pageInfo = new PageInfo<OrganizationBranchRest>(list);
        return pageInfo;
    }

    /**
    * <p>Title: getOrganizationRestDayByIdAll</p> 
    * <p>Description:获取门店所有的休息日 </p> 
    * @param id
    * @return 
    * @see br.crm.service.branch.OrgRestService#getOrganizationRestDayByIdAll(java.lang.String) 
    */
    @Override
    public List<OrganizationBranchRest> getOrganizationRestDayByIdAll(String id) {
        OrganizationBranchRestExample example = new OrganizationBranchRestExample();
        Criteria criteria = example.createCriteria();
        criteria.andBranchIdEqualTo(id);
        criteria.andBranchRestTypeEqualTo(2);
        criteria.andBranchRestStatusEqualTo(0);
        List<OrganizationBranchRest> list = organizationBranchRestMapper.selectByExample(example);
        return list;
    }

    /**
     * <p>Title:getOrgBranchRestList</p> 
     * <p>Description:获取所有门店的所有休息日 </p> 
     * @return
     * @see br.crm.service.branch.OrgRestService#getOrgBranchRestList()
     */
    @Override
    public List<OrganizationBranchRest> getOrgBranchRestList() {
        OrganizationBranchRestExample example = new OrganizationBranchRestExample();
        example.createCriteria().andBranchRestStatusEqualTo(0);
        List<OrganizationBranchRest> list = organizationBranchRestMapper.selectByExample(example);
        return list;
    }

}
