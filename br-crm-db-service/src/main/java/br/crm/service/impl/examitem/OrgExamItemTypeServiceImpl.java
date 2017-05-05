package br.crm.service.impl.examitem;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examitem.OrganizationExamItemTypeMapper;
import br.crm.pojo.examitem.OrganizationExamItemType;
import br.crm.pojo.examitem.OrganizationExamItemTypeExample;
import br.crm.pojo.examitem.OrganizationExamItemTypeExample.Criteria;
import br.crm.service.examitem.OrgExamItemTypeService;
import br.order.redis.redis.RedisService;

/**
 * (检查项类型service)
 * 
 * @ClassName: OrgExamItemTypeServiceImpl
 * @Description: TODO(检查项类型service)
 * @author 王文腾
 * @date 2016年9月13日 上午11:23:25
 */
@Service
public class OrgExamItemTypeServiceImpl implements OrgExamItemTypeService {
    /**
     * {检查项类型DAO}
     */
    @Autowired
    private OrganizationExamItemTypeMapper organizationExamItemTypeMapper;

    @Autowired
    private RedisService redisService;

    /**
     * 获取检查项类型列表
     * <p>
     * Title: getAllOrgExamItemType
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @see br.crm.service.examitem.OrgExamItemTypeService#getAllOrgExamItemType()
     */
    @Override
    public List<OrganizationExamItemType> getAllOrgExamItemType() {
        OrganizationExamItemTypeExample example = new OrganizationExamItemTypeExample();
        example.setOrderByClause(" exam_item_type_create_time desc");
        Criteria criteria = example.createCriteria();
        criteria.andExamItemTypeStatusEqualTo(0);
        List<OrganizationExamItemType> list = organizationExamItemTypeMapper.selectByExample(example);
        return list;
    }

    /**
     * 添加检查项类型信息
     * <p>
     * Title: insertOrgExamItemType
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamItemType
     *            检查项类型信息对象
     * @return
     * @see br.crm.service.examitem.OrgExamItemTypeService#insertOrgExamItemType(br.crm.pojo.org.OrganizationExamItemType)
     */
    @Override
    public int insertOrgExamItemType(OrganizationExamItemType orgExamItemType) {
        orgExamItemType.setExamItemTypeId(UUIDUtils.getId());
        orgExamItemType.setExamItemTypeCreateTime(new Date());
        orgExamItemType.setExamItemTypeEditTime(orgExamItemType.getExamItemTypeCreateTime());
        orgExamItemType.setExamItemTypeStatus(0);
        redisService.set(RedisConstant.br_order_orgExamItemType_id.concat(orgExamItemType.getExamItemTypeId()),
                JSONObject.toJSONString(orgExamItemType));
        return organizationExamItemTypeMapper.insertSelective(orgExamItemType);
    }

    /**
     * 获取检查项类型信息对象
     * <p>
     * Title: getOrgExamItemTypeById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamItemTypeId
     *            检查项类型信息id
     * @return
     * @see br.crm.service.examitem.OrgExamItemTypeService#getOrgExamItemTypeById(java.lang.String)
     */
    @Override
    public OrganizationExamItemType getOrgExamItemTypeById(String orgExamItemTypeId) {
        return JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgExamItemType_id.concat(orgExamItemTypeId)),
                OrganizationExamItemType.class);
    }

    /**
     * 修改检查项类型信息
     * <p>
     * Title: updateOrgExamItemType
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamItemType
     *            检查项类型信息对象
     * @return
     * @see br.crm.service.examitem.OrgExamItemTypeService#updateOrgExamItemType(br.crm.pojo.org.OrganizationExamItemType)
     */
    @Override
    public int updateOrgExamItemType(OrganizationExamItemType orgExamItemType) {
        orgExamItemType.setExamItemTypeEditTime(new Date());
        int result = organizationExamItemTypeMapper.updateByPrimaryKeySelective(orgExamItemType);
      
        redisService.set(RedisConstant.br_order_orgExamItemType_id.concat(orgExamItemType.getExamItemTypeId()),
                    JSONObject.toJSONString(orgExamItemType));
        
       return result;
    }

	/**
		 * <p>Title:initData</p> 
		 * <p>Description: 检查项目类型表初始化缓存redis</p> 
	     * @see br.crm.service.examitem.OrgExamItemTypeService#initData()
		 */
	@Override
	public void initData() {
		List<OrganizationExamItemType> list = organizationExamItemTypeMapper.selectByExample(null);
		if(CollectionUtils.isNotEmpty(list)){
			for (OrganizationExamItemType organizationExamItemType : list) {
				  redisService.set(RedisConstant.br_order_orgExamItemType_id.concat(organizationExamItemType.getExamItemTypeId()),
		                    JSONObject.toJSONString(organizationExamItemType));
			}
		}
		
	}

}
