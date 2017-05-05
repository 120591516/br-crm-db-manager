package br.crm.service.impl.examfeeitem;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examfeeitem.OrganizationExamFeeItemMapper;
import br.crm.mapper.examfeeitem.self.OrgExamFeeItemSelfMapper;
import br.crm.mapper.examitem.OrganizationExamFeeItemDetailMapper;
import br.crm.mapper.suite.OrganizationExamSuiteFeeItemMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemExample;
import br.crm.service.orgexamfeeitem.OrgExamFeeItemService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.examfeeitem.OrgExamFeeItemRedis;
import br.order.redis.redis.RedisService;
import br.crm.vo.examfeeitem.OrgExamFeeItemQu;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;

/**
 * (收费项目service)
 * 
 * @ClassName: OrgExamFeeItemServiceImpl
 * @Description: TODO(收费项目service)
 * @author 王文腾
 * @date 2016年9月13日 上午9:58:40
 */
@Service
public  class OrgExamFeeItemServiceImpl implements OrgExamFeeItemService {
    /**
     * {收费项目DAO}
     */
    @Autowired
    private OrganizationExamFeeItemMapper organizationExamFeeItemMapper;

    /**
     * {收费项目自定义DAO}
     */
    @Autowired
    private OrgExamFeeItemSelfMapper orgExamFeeItemSelfMapper;

    /**
     * {收费项目-套餐DAO}
     */
    @Autowired
    private OrganizationExamSuiteFeeItemMapper organizationExamSuiteFeeItemMapper;
    /**
     * {收费项目-体检项目DAO}
     */
    @Autowired
    private OrganizationExamFeeItemDetailMapper organizationExamFeeItemDetailMapper;

    @Autowired
    private OrganizationExamSuiteMapper organizationExamSuiteMapper;

	
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private OrgExamFeeItemRedis orgExamFeeItemRedis;
    

    /**
     * 添加收费项目信息
     * <p>
     * Title: insertOrganizationExamFeeItem
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationExamFeeItem
     *            收费项目对象
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#insertOrganizationExamFeeItem(br.crm.pojo.org.OrganizationExamFeeItem)
     */
    @Override
    public int insertOrganizationExamFeeItem(OrganizationExamFeeItem organizationExamFeeItem) {
        organizationExamFeeItem.setId(UUIDUtils.getId());
        organizationExamFeeItem.setCreatetime(new Date());
        organizationExamFeeItem.setEdittime(organizationExamFeeItem.getCreatetime());
        organizationExamFeeItem.setStatus(0);
        Boolean redis = systemConfigService.getRedis();
        if(redis){
        	orgExamFeeItemRedis.insertOrganizationExamFeeItem(organizationExamFeeItem);
        }
        return organizationExamFeeItemMapper.insertSelective(organizationExamFeeItem);
    }

    /**
     * 获取收费关联部门信息对象
     * <p>
     * Title: getOrganizationExamFeeItemById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            收费项目id
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#getOrganizationExamFeeItemById(java.lang.String)
     */
    @Override
    public OrganizationExamFeeItem getOrganizationExamFeeItemById(String id) {
    	Boolean redis = systemConfigService.getRedis();
    	if(redis){
    		return orgExamFeeItemRedis.getOrganizationExamFeeItemById(id);
    	}
        return organizationExamFeeItemMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改收费项目信息
     * <p>
     * Title: updateOrganizationExamFeeItemById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItem
     *            收费项目信息对象
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#updateOrganizationExamFeeItemById(br.crm.pojo.org.OrganizationExamFeeItem)
     */
    @Override
    public int updateOrganizationExamFeeItemById(OrganizationExamFeeItem orgExamFeeItem) {
        orgExamFeeItem.setEdittime(new Date());
        Boolean redis = systemConfigService.getRedis();
        if(redis){
        	orgExamFeeItemRedis.updateOrganizationExamFeeItemById(orgExamFeeItem);
        }
        int result = organizationExamFeeItemMapper.updateByPrimaryKeySelective(orgExamFeeItem);
        return result;
    }

    /**
     * 条件查询分页显示收费项信息列表
     * <p>
     * Title: getOrgExamItemByPage
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItemQu
     *            条件查询对象
     * @param page
     *            当前页数
     * @param rows
     *            每页显示行数
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#getOrgExamItemByPage(br.crm.vo.examfeeitem.OrgExamFeeItemQu,
     *      java.lang.Integer, java.lang.Integer)
     */
    @Override
    public PageInfo<OrganizationExamFeeItem> getOrgExamItemByPage(OrgExamFeeItemQu orgExamFeeItemQu, Integer page, Integer rows) {

        OrganizationExamFeeItemExample example = new OrganizationExamFeeItemExample();
        br.crm.pojo.examfeeitem.OrganizationExamFeeItemExample.Criteria criteria = example.createCriteria();

        if (orgExamFeeItemQu.getOrgId() != null) {
            criteria.andOrgIdEqualTo(orgExamFeeItemQu.getOrgId());
        }
        if (StringUtils.isNotEmpty(orgExamFeeItemQu.getExamFeeItemName())) {
            criteria.andExamFeeItemNameLike("%" + orgExamFeeItemQu.getExamFeeItemName() + "%");
        }
        if (StringUtils.isNotEmpty(orgExamFeeItemQu.getExamFeeItemNameEng())) {
            criteria.andExamFeeItemNameEngLike("%" + orgExamFeeItemQu.getExamFeeItemNameEng() + "%");
        }
        if (orgExamFeeItemQu.getDepartmentId() != null) {
            criteria.andDepartmentIdEqualTo(orgExamFeeItemQu.getDepartmentId());
        }
        if (orgExamFeeItemQu.getSex() != null) {
            if (orgExamFeeItemQu.getSex() == 0) {
                criteria.andFMaleEqualTo(0);
            }
            else if (orgExamFeeItemQu.getSex() == 1) {
                criteria.andFFemaleEqualTo(0);
            }
            else if (orgExamFeeItemQu.getSex() == 2) {
                criteria.andFMaleEqualTo(0);
                criteria.andFFemaleEqualTo(0);
            }
        }
        if (orgExamFeeItemQu.getExamFeeItemUnitPriceStart() != null && orgExamFeeItemQu.getExamFeeItemUnitPriceEnd() != null) {
            criteria.andExamFeeItemUnitPriceBetween(orgExamFeeItemQu.getExamFeeItemUnitPriceStart(), orgExamFeeItemQu.getExamFeeItemUnitPriceEnd());
        }
        else if (orgExamFeeItemQu.getExamFeeItemUnitPriceStart() != null && orgExamFeeItemQu.getExamFeeItemUnitPriceEnd() == null) {
            criteria.andExamFeeItemUnitPriceGreaterThanOrEqualTo(orgExamFeeItemQu.getExamFeeItemUnitPriceStart());
        }
        else if (orgExamFeeItemQu.getExamFeeItemUnitPriceStart() == null && orgExamFeeItemQu.getExamFeeItemUnitPriceEnd() != null) {
            criteria.andExamFeeItemUnitPriceLessThanOrEqualTo(orgExamFeeItemQu.getExamFeeItemUnitPriceEnd());
        }

        PageHelper.startPage(page, rows);
        List<OrganizationExamFeeItem> list = organizationExamFeeItemMapper.selectByExample(example);
        PageInfo<OrganizationExamFeeItem> pageInfo = new PageInfo<OrganizationExamFeeItem>(list);
        return pageInfo;
    }

    /**
     * 获取收费项对象
     * <p>
     * Title: getOrganizationExamFeeItemByPrimaryKey
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            收费项id
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#getOrganizationExamFeeItemByPrimaryKey(java.lang.String)
     */
    @Override
    public OrgExamFeeItemVo getOrganizationExamFeeItemByPrimaryKey(String id) {

        return orgExamFeeItemSelfMapper.selectById(id);
    }


    /**
     * redis 调用全部
    * <p>Title: getAllOrgExamFeeItem</p> 
    * <p>Description: </p> 
    * @return 
    * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#getAllOrgExamFeeItem()
     */

	@Override
	public List<OrganizationExamFeeItem> getAllOrgExamFeeItem() {
		
		return organizationExamFeeItemMapper.selectByExample(null);
	}

 

}
