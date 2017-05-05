package br.crm.service.impl.suite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.RedisConstant;
import br.crm.mapper.suite.OrganizationExamSuiteTypeMapper;
import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.crm.pojo.suite.OrganizationExamSuiteTypeExample;
import br.crm.pojo.suite.OrganizationExamSuiteTypeExample.Criteria;
import br.crm.service.suite.OrgExamSuiteTypeService;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: OrgExamSuiteTypeServiceImpl
 * @Description: TODO 套餐绑定类型
 * @author kangting
 * @date 2016年9月13日 下午3:21:51
 *
 */
@Service
public class OrgExamSuiteTypeServiceImpl implements OrgExamSuiteTypeService {

    @Autowired
    private OrganizationExamSuiteTypeMapper orgExamSuiteTypeMapper;

    @Autowired
    private RedisService redisService;

    /**
     * 
     * <p>
     * Title: getOrgExamSuiteTypeList
     * </p>
     * <p>
     * Description: 分页查看套餐绑定类型
     * </p>
     * 
     * @param page
     *            当前页
     * @param rows
     *            每页数量
     * @return
     * @see br.crm.service.org.OrgExamSuiteTypeService#getOrgExamSuiteTypeList(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<OrganizationExamSuiteType> getOrgExamSuiteTypeList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        OrganizationExamSuiteTypeExample example = new OrganizationExamSuiteTypeExample();
        example.createCriteria().andExamSuiteTypeStatusEqualTo(0);
        List<OrganizationExamSuiteType> list = orgExamSuiteTypeMapper.selectByExample(example);
        PageInfo<OrganizationExamSuiteType> pageInfo = new PageInfo<OrganizationExamSuiteType>(list);
        return pageInfo;
    }

    /**
     * 
     * <p>
     * Title: insertOrgExamSuiteType
     * </p>
     * <p>
     * Description: 插入套餐绑定类型
     * </p>
     * 
     * @param organizationExamSuiteType
     * @return
     * @see br.crm.service.org.OrgExamSuiteTypeService#insertOrgExamSuiteType(br.crm.pojo.org.OrganizationExamSuiteType)
     */
    @Override
    public int insertOrgExamSuiteType(OrganizationExamSuiteType organizationExamSuiteType) {
        int result = orgExamSuiteTypeMapper.insertSelective(organizationExamSuiteType);
        redisService.set(RedisConstant.br_order_orgExamSuiteType_id.concat(organizationExamSuiteType.getExamSuiteTypeId()), JSONObject.toJSONString(organizationExamSuiteType));
        return result;
    }

    /**
     *
     * <p>
     * Title: updateOrgExamSuiteType
     * </p>
     * <p>
     * Description: 修改套餐绑定类型
     * </p>
     * 
     * @param oest
     * @return
     * @see br.crm.service.org.OrgExamSuiteTypeService#updateOrgExamSuiteType(br.crm.pojo.org.OrganizationExamSuiteType)
     */
    @Override
    public int updateOrgExamSuiteType(OrganizationExamSuiteType oest) {
        int result = orgExamSuiteTypeMapper.updateByPrimaryKeySelective(oest);
        redisService.set(RedisConstant.br_order_orgExamSuiteType_id.concat(oest.getExamSuiteTypeId()), JSONObject.toJSONString(oest));
        return result;
    }

    /**
    	 * <p>Title:initData</p> 
    	 * <p>Description: 套餐-类型redis缓存</p> 
         * @see br.crm.service.suite.OrgExamSuiteTypeService#initData()
    	 */
    @Override
    public void initData() {
        OrganizationExamSuiteTypeExample example = new OrganizationExamSuiteTypeExample();
        example.createCriteria().andExamSuiteTypeStatusEqualTo(0);
        List<OrganizationExamSuiteType> OrganizationExamSuiteTypeList = orgExamSuiteTypeMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(OrganizationExamSuiteTypeList)) {
            //缓存中间表id
            for (OrganizationExamSuiteType organizationExamSuiteType : OrganizationExamSuiteTypeList) {
                redisService.set(RedisConstant.br_order_orgExamSuiteType_id.concat(organizationExamSuiteType.getExamSuiteTypeId()), JSONObject.toJSONString(organizationExamSuiteType));
                //缓存套餐id
                List<String> typeList = new ArrayList<String>();
                if (redisService.exists(RedisConstant.br_order_orgExamSuiteType_suiteId.concat(organizationExamSuiteType.getExamSuiteId()))) {
                    typeList = JSONObject.parseArray(redisService.get(RedisConstant.br_order_orgExamSuiteType_suiteId.concat(organizationExamSuiteType.getExamSuiteId())), String.class);
                }
                if (!typeList.contains(organizationExamSuiteType.getExamTypeId())) {
                    typeList.add(organizationExamSuiteType.getExamTypeId());
                }
                redisService.set(RedisConstant.br_order_orgExamSuiteType_suiteId.concat(organizationExamSuiteType.getExamSuiteId()), JSONObject.toJSONString(typeList));
                //缓存类型id
                List<String> suitList = new ArrayList<String>();
                if (redisService.exists(RedisConstant.br_order_orgExamSuiteType_typeId.concat(organizationExamSuiteType.getExamTypeId()))) {
                    suitList = JSONObject.parseArray(redisService.get(RedisConstant.br_order_orgExamSuiteType_typeId.concat(organizationExamSuiteType.getExamTypeId())), String.class);
                }
                if (!suitList.contains(organizationExamSuiteType.getExamSuiteId())) {
                    suitList.add(organizationExamSuiteType.getExamSuiteId());
                }
                redisService.set(RedisConstant.br_order_orgExamSuiteType_typeId.concat(organizationExamSuiteType.getExamTypeId()), JSONObject.toJSONString(suitList));
            }

        }

    }

    @Override
    public List<OrganizationExamSuiteType> getOrgExamSuiteTypeList(OrganizationExamSuiteType param) {
        List<OrganizationExamSuiteType> result = new ArrayList<OrganizationExamSuiteType>();
        OrganizationExamSuiteTypeExample example = new OrganizationExamSuiteTypeExample();
        if (null != param) {
            Criteria criteria = example.createCriteria();
            if (null != param.getExamSuiteId()) {
                criteria.andExamSuiteIdEqualTo(param.getExamSuiteId());
            }
            if (null != param.getExamSuiteTypeStatus()) {
                criteria.andExamSuiteTypeStatusEqualTo(param.getExamSuiteTypeStatus());
            }
            if (null != param.getExamTypeId()) {
                criteria.andExamTypeIdEqualTo(param.getExamTypeId());
            }
        }
        result = orgExamSuiteTypeMapper.selectByExample(example);
        return result;
    }

}
