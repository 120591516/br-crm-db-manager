package br.crm.service.impl.examfeeitem;

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
import br.crm.mapper.examfeeitem.OrganizationExamFeeItemClassMapper;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClass;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClassExample;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemClassExample.Criteria;
import br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService;
import br.order.redis.redis.RedisService;

/**
 * (收费项目分类service)
 * 
 * @ClassName: OrgExamFeeItemClassServiceImpl
 * @Description: TODO(收费项目分类service)
 * @author 王文腾
 * @date 2016年9月13日 上午9:52:20
 */
@Service
public class OrgExamFeeItemClassServiceImpl implements OrgExamFeeItemClassService {

    /**
     * {收费项目分类DAO}
     */
    @Autowired
    private OrganizationExamFeeItemClassMapper organizationExamFeeItemClassMapper;

    @Autowired
    private RedisService redisService;


    /**
     * 获取收费项目分类列表
     * <p>
     * Title: getAllOrgExamItemClass
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService#getAllOrgExamItemClass()
     */
    @Override
    public List<OrganizationExamFeeItemClass> getAllOrgExamItemClass() {
        OrganizationExamFeeItemClassExample example = new OrganizationExamFeeItemClassExample();
        Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return organizationExamFeeItemClassMapper.selectByExample(example);
        
    }

    /**
     * 添加收费项目分类信息
     * <p>
     * Title: insertOrgExamFeeItemClass
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItemClass
     *            收费项目分类对象
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService#insertOrgExamFeeItemClass(br.crm.pojo.org.OrganizationExamFeeItemClass)
     */
    @Override
    public int insertOrgExamFeeItemClass(OrganizationExamFeeItemClass orgExamFeeItemClass) {
        orgExamFeeItemClass.setId(UUIDUtils.getId());
        orgExamFeeItemClass.setCreateTime(new Date());
        orgExamFeeItemClass.setEditTime(orgExamFeeItemClass.getCreateTime());
        orgExamFeeItemClass.setStatus(0);
        redisService.set(RedisConstant.br_order_orgExamFeeItemClass_id.concat(orgExamFeeItemClass.getId()),
                JSONObject.toJSONString(orgExamFeeItemClass));
        return organizationExamFeeItemClassMapper.insertSelective(orgExamFeeItemClass);
    }

    /**
     * 获取收费项目分类信息
     * <p>
     * Title: getOrgExamFeeItemClassById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            收费项目分类id
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService#getOrgExamFeeItemClassById(java.lang.String)
     */
    @Override
    public OrganizationExamFeeItemClass getOrgExamFeeItemClassById(String id) {
        return JsonUtils.jsonToPojo(
                redisService.get(RedisConstant.br_order_orgExamFeeItemClass_id.concat(id)),
                OrganizationExamFeeItemClass.class);
    }

    /**
     * 修改 收费项目分类信息
     * <p>
     * Title: updateOrgExamFeeItemClass
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItemClass
     *            收费项目分类对象
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService#updateOrgExamFeeItemClass(br.crm.pojo.org.OrganizationExamFeeItemClass)
     */
    @Override
    public int updateOrgExamFeeItemClass(OrganizationExamFeeItemClass orgExamFeeItemClass) {
        orgExamFeeItemClass.setEditTime(new Date());       
        int result = organizationExamFeeItemClassMapper.updateByPrimaryKeySelective(orgExamFeeItemClass);
        redisService.set(RedisConstant.br_order_orgExamFeeItemClass_id.concat(orgExamFeeItemClass.getId()),
                    JSONObject.toJSONString(orgExamFeeItemClass));       
        return result;
    }

	/**
		 * <p>Title:initData</p> 
		 * <p>Description: 收费项目redis缓存</p> 
	     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemClassService#initData()
		 */
	@Override
	public void initData() {		
		OrganizationExamFeeItemClassExample example = new OrganizationExamFeeItemClassExample();
		example.createCriteria().andStatusEqualTo(0);
		List<OrganizationExamFeeItemClass> selectByExample = organizationExamFeeItemClassMapper.selectByExample(example );
		if(CollectionUtils.isNotEmpty(selectByExample)){
			for (OrganizationExamFeeItemClass organizationExamFeeItemClass : selectByExample) {
				redisService.set(RedisConstant.br_order_orgExamFeeItemClass_id.concat(organizationExamFeeItemClass.getId()), JSONObject.toJSONString(organizationExamFeeItemClass));
			}
		}
	}

}
