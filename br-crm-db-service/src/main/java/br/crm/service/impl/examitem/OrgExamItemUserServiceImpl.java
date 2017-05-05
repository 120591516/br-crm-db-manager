package br.crm.service.impl.examitem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examitem.OrganizationExamFeeItemDetailMapper;
import br.crm.mapper.examitem.OrganizationExamItemUserMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetail;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample;
import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.examitem.OrganizationExamItemUserExample;
import br.crm.pojo.examitem.OrganizationExamItemUserExample.Criteria;
import br.crm.pojo.org.Organization;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.service.examitem.OrgExamItemUserService;
import br.crm.vo.examitem.OrganizationExamItemUserVo;
import br.order.redis.redis.RedisService;

@Service
public class OrgExamItemUserServiceImpl implements OrgExamItemUserService {

    @Autowired
    private OrganizationExamFeeItemDetailMapper orgExamFeeItemDetailMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private OrganizationExamItemUserMapper organizationExamItemUserMapper;

    @Override
    public PageInfo<OrganizationExamItemUserVo> getOrganizationExamItemUser(Integer page, Integer rows, String userId, String examId, String feeItemId, String orgId, String branchId, String deptId) {

        PageHelper.startPage(page, rows);
        OrganizationExamItemUserExample example = new OrganizationExamItemUserExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andOrganizationExamItemStatusEqualTo(0);
        //医生搜索
        if (userId != null) {
            createCriteria.andOrganizationUserIdEqualTo(userId);
            //根据用户获取机构id 
            String orgId1="";//
            
        }
        //检查项搜索
        if (examId != null) {
            createCriteria.andOrganizationExamItemIdEqualTo(examId);
        }
        //机构搜索
        if (orgId != null) {
            //若果机构的id为-1 那么是初始化进来的
            if (orgId.equals("-1")) {
                //获取到当前收费项所在的机构id
                OrganizationExamFeeItem feeItem = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgExamFeeItem_id.concat(feeItemId)), OrganizationExamFeeItem.class);
                orgId = feeItem.getOrgId();
            }
            //匹配改机构下的已经绑定检查项的医生
            createCriteria.andOrganizationIdEqualTo(orgId);
            List<String> userids = new ArrayList<String>();
            List<String> userList = null;
            if (redisService.get(RedisConstant.br_order_orgUser_orgId.concat(orgId)) != null) {
                userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgId.concat(orgId)), String.class);
                for (String string : userList) {
                    if (string != null) {
                        userids.add(string);
                    }
                }
                if (userids != null) {
                    createCriteria.andOrganizationUserIdIn(userids);
                }
            }

        }
        //门店搜索
        if (branchId != null) {
            List<String> userIds = new ArrayList<String>();
            if (redisService.get(RedisConstant.br_order_orgUser_orgBranchId.concat(branchId)) != null) {
                List<String> userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgBranchId.concat(branchId)), String.class);
                for (String string : userList) {
                    if (string != null) {
                        userIds.add(string);
                    }
                }
                if (userIds != null) {
                    createCriteria.andOrganizationUserIdIn(userIds);
                }
            }
        }
        //科室搜索
        if (deptId != null) {
            List<String> userIds = new ArrayList<String>();
            if (redisService.get(RedisConstant.br_order_orgUser_orgDeptId.concat(deptId)) != null) {
                List<String> userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgDeptId.concat(deptId)), String.class);
                for (String string : userList) {
                    if (string != null) {
                        userIds.add(string);
                    }
                }
                if (userIds != null) {
                    createCriteria.andOrganizationUserIdIn(userIds);
                }

            }
        }
        /*//收费项搜索
        if(feeItemId!=null){
        	List<String> oeiuIds=new ArrayList<String>();
        	if(redisService.get(RedisConstant.br_order_orgExamFeeItemDetail_feeItemId.concat(feeItemId))!=null){
        		List<String> feeExamItem=JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgExamFeeItemDetail_feeItemId.concat(feeItemId)),String.class);
        		if(CollectionUtils.isNotEmpty(feeExamItem)){
        		for (String string : feeExamItem) {
        			if(string!=null){
        			oeiuIds.add(string);
        			}
        		}
        		if(oeiuIds!=null){
        			createCriteria.andOrganizationExamItemUserIdIn(oeiuIds);
        		} 
        	}
        	}
        } */
        //过滤收费项绑定检查医生列表
        /*OrganizationExamItemUserExample example1 = new OrganizationExamItemUserExample();
        example1.createCriteria().andOrganizationExamItemStatusEqualTo(0);
        List<OrganizationExamItemUser> examItemUser = organizationExamItemUserMapper.selectByExample(example1);*/
        OrganizationExamFeeItemDetailExample example1 = new OrganizationExamFeeItemDetailExample();
        br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample.Criteria createCriteria2 = example1.createCriteria();
        //匹配该机构下的已经绑定检查项的医生并且过滤收费项
        createCriteria2.andStatusEqualTo(0).andOrganizationIdEqualTo(orgId);
        //根据收费项id分页查询
        if (feeItemId != null) {
            createCriteria2.andExamFeeItemIdEqualTo(feeItemId);
        }
        List<OrganizationExamFeeItemDetail> list1 = orgExamFeeItemDetailMapper.selectByExample(example1);
        List<OrganizationExamItemUser> list = organizationExamItemUserMapper.selectByExample(example);
        List<OrganizationExamItemUserVo> examItemUserVo = new ArrayList<OrganizationExamItemUserVo>();
        try {
            OrganizationExamItemUserVo orgExamItemUserVo = null;
            if(CollectionUtils.isNotEmpty(list)){
                for (OrganizationExamItemUser orgExamItemUser : list) {
                    orgExamItemUserVo = new OrganizationExamItemUserVo();
                    BeanUtils.copyProperties(orgExamItemUserVo, orgExamItemUser);
                    if(CollectionUtils.isNotEmpty(list1)){
                        for (OrganizationExamFeeItemDetail organizationExamFeeItemDetail : list1) {
                            if (orgExamItemUser.getOrganizationExamItemUserId().equals(organizationExamFeeItemDetail.getExamItemUserId())) {
                                orgExamItemUserVo.setChecked(true);
                            }
                        }
                    }
                    examItemUserVo.add(orgExamItemUserVo);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<OrganizationExamItemUser> pageInfo = new PageInfo<OrganizationExamItemUser>(list);
        if (CollectionUtils.isNotEmpty(examItemUserVo)) {
            for (OrganizationExamItemUserVo user : examItemUserVo) {
                //根据检查项id获取检查项姓名
                OrganizationExamItem organizationExamItem = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgExamItem_id.concat(user.getOrganizationExamItemId())), OrganizationExamItem.class);

                //根据医生id获取医生姓名
                OrganizationUser organizationUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(user.getOrganizationUserId())), OrganizationUser.class);
                //获取机构id门店id和名称				
                Organization organization = new Organization();
                OrganizationBranch OrganizationBranch = new OrganizationBranch();
                OrganizationDept organizationDept = new OrganizationDept();

                if (organizationUser != null) {
                    if (organizationUser.getOrgId() != null && redisService.get(RedisConstant.br_order_organization_id.concat(organizationUser.getOrgId())) != null) {
                        organization = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_organization_id.concat(organizationUser.getOrgId())), Organization.class);
                    }
                    if (organizationUser.getOrgBranchId() != null && redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(organizationUser.getOrgBranchId())) != null) {
                        OrganizationBranch = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(organizationUser.getOrgBranchId())), OrganizationBranch.class);
                    }
                    if (organizationUser.getOrgBranchDeptId() != null && redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(organizationUser.getOrgBranchDeptId())) != null) {
                        organizationDept = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(organizationUser.getOrgBranchDeptId())), OrganizationDept.class);
                    }
                    user.setBranchId(organizationUser.getOrgBranchId());
                    user.setOrgId(organizationUser.getOrgId());
                    user.setDeptId(organizationUser.getOrgBranchDeptId());
                    user.setUserName(organizationUser != null ? organizationUser.getUserName() : null);
                }
                if (user != null) {
                    user.setOrganizationExamItemId(user.getOrganizationExamItemId());
                    user.setOrganizationUserId(user.getOrganizationUserId());
                    user.setOrganizationExamItemUserId(user.getOrganizationExamItemUserId());
                }
                user.setOrgName(organization != null ? organization.getOrgShortName() : null);
                user.setBranchName(OrganizationBranch != null ? OrganizationBranch.getBranchName() : null);
                user.setDeptName(organizationDept != null ? organizationDept.getDepartName() : null);
                user.setExamItemName(organizationExamItem != null ? organizationExamItem.getExamItemName() : null);
                user.setfFemale(organizationExamItem != null ? organizationExamItem.getfFemale() : null);//男性
                user.setfMale(organizationExamItem != null ? organizationExamItem.getfMale() : null);//女性

            }
        }
        PageInfo<OrganizationExamItemUserVo> resultPageInfo = new PageInfo<OrganizationExamItemUserVo>(examItemUserVo);
        resultPageInfo.setLastPage(pageInfo.getLastPage());
        resultPageInfo.setTotal(pageInfo.getTotal());
        resultPageInfo.setIsFirstPage(pageInfo.isIsFirstPage());
        resultPageInfo.setIsLastPage(pageInfo.isIsLastPage());
        resultPageInfo.setNextPage(pageInfo.getNextPage());
        resultPageInfo.setStartRow(pageInfo.getStartRow());
        resultPageInfo.setEndRow(pageInfo.getEndRow());
        resultPageInfo.setNavigatepageNums(pageInfo.getNavigatepageNums());
        return resultPageInfo;
    }

    @Override
    public OrganizationExamItemUser selectOrgExamItemUserById(String examItemUserId) {
        return organizationExamItemUserMapper.selectByPrimaryKey(examItemUserId);
    }

    @Override
    public int updateOrgExamItemUser(OrganizationExamItemUser organizationExamItemUser) {
        return organizationExamItemUserMapper.updateByPrimaryKeySelective(organizationExamItemUser);
    }

    @Override
    public int saveUser(String itemId, OrganizationUser orgUser) {
        if (StringUtils.isNotEmpty(itemId)) {
            int r = 0;
            String[] sourceStrArray = itemId.split(",");
            OrganizationExamItemUser userItem = new OrganizationExamItemUser();
            userItem.setOrganizationExamItemCreateTime(new Date());
            userItem.setOrganizationExamItemEditTime(userItem.getOrganizationExamItemCreateTime());
            userItem.setOrganizationExamItemStatus(0);
            userItem.setOrganizationId(orgUser.getOrgId());
            userItem.setOrganizationUserId(orgUser.getUserId());
            userItem.setOrganizationBranchId(orgUser.getOrgBranchId());
            userItem.setOrganizationBranchDeptId(orgUser.getOrgBranchDeptId());
            for (int i = 0; i < sourceStrArray.length; i++) {
                userItem.setOrganizationExamItemId(sourceStrArray[i]);
                userItem.setOrganizationExamItemUserId(UUIDUtils.getId());
                int y = organizationExamItemUserMapper.insertSelective(userItem);
                if (y > 0) {
                    redisService.set(RedisConstant.br_order_orgExamItemUser_id.concat(userItem.getOrganizationExamItemUserId()), JSONObject.toJSONString(userItem));
                }
            }
            return r;
        }
        return 0;

    }

    @Override
    public OrganizationExamItemUser selectOrgExamItemUserByParam(String organizationUserId, String organizationExamItemId) {
        OrganizationExamItemUserExample example = new OrganizationExamItemUserExample();
        Criteria createCriteria = example.createCriteria();
        if (organizationUserId != null && organizationExamItemId != null) {
            createCriteria.andOrganizationUserIdEqualTo(organizationUserId).andOrganizationExamItemIdEqualTo(organizationExamItemId);
        }
        return organizationExamItemUserMapper.selectByExample(example).get(0);

    }

    @Override
    public int deleteOrgExamItemUser(String organizationExamItemUserId) {
        return organizationExamItemUserMapper.deleteByPrimaryKey(organizationExamItemUserId);

    }

    @Override
    public void initData() {
        OrganizationExamItemUserExample example = new OrganizationExamItemUserExample();
        example.createCriteria().andOrganizationExamItemStatusEqualTo(0);
        List<OrganizationExamItemUser> list = organizationExamItemUserMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationExamItemUser organizationExamItemUser : list) {
                //缓存体检项和医生关联表（主键id）
                redisService.set(RedisConstant.br_order_orgExamItemUser_id.concat(organizationExamItemUser.getOrganizationExamItemUserId()), JSONObject.toJSONString(organizationExamItemUser));

            }

        }
    }
}
