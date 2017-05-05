package br.crm.service.impl.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.permission.OrganizationUserManagerMapper;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserManager;
import br.crm.pojo.permission.OrganizationUserManagerExample;
import br.crm.pojo.permission.OrganizationUserManagerExample.Criteria;
import br.crm.service.permission.OrgUserManagerService;
import br.crm.vo.permission.OrganizationUserManagerVo;
import br.order.redis.redis.RedisService;

/** 
* 管理用户service
* @ClassName: OrgUserManagerServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年11月17日 上午10:18:51 
*/
@Service
public class OrgUserManagerServiceImpl implements OrgUserManagerService {

    @Autowired
    private OrganizationUserManagerMapper organizationUserManagerMapper;

    @Autowired
    private RedisService redisService;

    /**
     * <p>Title:initData</p> 
     * <p>Description:体检机构管理用户redis缓存 </p> 
     * @see br.crm.service.examitem.OrgExamItemService#initData()
     */
    @Override
    public void initData() {
        List<OrganizationUserManager> list = organizationUserManagerMapper.selectByExample(null);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationUserManager orgUserManager : list) {
                redisService.set(RedisConstant.br_order_orgUserManager_userManagerId.concat(orgUserManager.getUserManagerId()), JSONObject.toJSONString(orgUserManager));
            }
        }
    }

    /** 
    *  新增管理用户
    * <p>Title: insertOrgUserManager</p> 
    * <p>Description: </p> 
    * @param orgUserManager
    * @return
    * @see br.crm.service.permission.OrgUserManagerService#insertOrgUserManager(br.crm.pojo.permission.OrganizationUserManager) 
    */
    @Override
    public int insertOrgUserManager(OrganizationUserManager orgUserManager) {
        orgUserManager.setUserManagerId(UUIDUtils.getId());
        orgUserManager.setUserManagerStatus(0);
        orgUserManager.setUserManagerCreateTime(new Date());
        orgUserManager.setUserManagerEditTime(orgUserManager.getUserManagerCreateTime());
        int i = organizationUserManagerMapper.insertSelective(orgUserManager);
        redisService.set(RedisConstant.br_order_orgUserManager_userManagerId.concat(orgUserManager.getUserManagerId()), JSONObject.toJSONString(orgUserManager));
        return i;
    }

    @Override
    public List<OrganizationUserManagerVo> getOrgUserManagerByUserId(String userId, String orgId) {
        List<OrganizationUserManagerVo> result = new ArrayList<OrganizationUserManagerVo>();
        try {
            OrganizationUserManagerExample example = new OrganizationUserManagerExample();
            Criteria criteria = example.createCriteria();
            criteria.andOrgIdEqualTo(orgId);
            criteria.andUserIdEqualTo(userId);
            criteria.andUserManagerStatusEqualTo(0);
            List<OrganizationUserManager> list = organizationUserManagerMapper.selectByExample(example);
            for (OrganizationUserManager orgUserManager : list) {
                OrganizationUser orgUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(orgUserManager.getUserId())), OrganizationUser.class);
                OrganizationUserManagerVo orgManagerVo = new OrganizationUserManagerVo();

                BeanUtils.copyProperties(orgManagerVo, orgUserManager);

                orgManagerVo.setUserName(orgUser.getUserName());
                result.add(orgManagerVo);
            }
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateOrgUserManager(OrganizationUserManager orgUserManager) {
        orgUserManager.setUserManagerEditTime(new Date());
        redisService.set(RedisConstant.br_order_orgUserManager_userManagerId.concat(orgUserManager.getUserManagerId()), JSONObject.toJSONString(orgUserManager));
        return organizationUserManagerMapper.updateByPrimaryKeySelective(orgUserManager);

    }

    /** 
    *  分页获取当前机构的管理信息
    * <p>Title: getOrgUserManagerByPage</p> 
    * <p>Description: </p> 
    * @param page 
    * @param rows
    * @param orgId 机构id
    * @return
    * @see br.crm.service.permission.OrgUserManagerService#getOrgUserManagerByPage(java.lang.Integer, java.lang.Integer, java.lang.String) 
    */
    @Override
    public PageInfo<OrganizationUserManagerVo> getOrgUserManagerByPage(Integer page, Integer rows, String orgId) {

        List<OrganizationUserManagerVo> result = new ArrayList<OrganizationUserManagerVo>();
        try {
            OrganizationUserManagerExample example = new OrganizationUserManagerExample();
            Criteria criteria = example.createCriteria();
            criteria.andUserManagerStatusEqualTo(0);
            criteria.andOrgIdEqualTo(orgId);
            List<OrganizationUserManager> list = organizationUserManagerMapper.selectByExample(example);
            for (OrganizationUserManager orgUserManager : list) {
                OrganizationUser orgUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(orgUserManager.getUserId())), OrganizationUser.class);
                OrganizationUserManagerVo orgManagerVo = new OrganizationUserManagerVo();
                BeanUtils.copyProperties(orgManagerVo, orgUserManager);
                orgManagerVo.setUserName(orgUser.getUserName());
                result.add(orgManagerVo);
            }
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        PageInfo<OrganizationUserManagerVo> pageInfo = new PageInfo<OrganizationUserManagerVo>(result);
        return pageInfo;
    }

    @Override
    public OrganizationUserManagerVo getOrgUserManager(String userManagerId) {
        OrganizationUserManager orgUserManager = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUserManager_userManagerId.concat(userManagerId)), OrganizationUserManager.class);
        OrganizationUser orgUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(orgUserManager.getUserId())), OrganizationUser.class);
        OrganizationUserManagerVo orgManagerVo = new OrganizationUserManagerVo();
        try {
            BeanUtils.copyProperties(orgManagerVo, orgUserManager);
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        orgManagerVo.setUserName(orgUser.getUserName());
        return orgManagerVo;
    }
}
