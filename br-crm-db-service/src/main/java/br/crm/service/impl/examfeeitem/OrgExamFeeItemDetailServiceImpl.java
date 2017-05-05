package br.crm.service.impl.examfeeitem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.examitem.OrganizationExamFeeItemDetailMapper;
import br.crm.mapper.examitem.OrganizationExamItemMapper;
import br.crm.mapper.examitem.OrganizationExamItemUserMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetail;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample.Criteria;
import br.crm.pojo.examitem.OrganizationExamItem;
import br.crm.pojo.examitem.OrganizationExamItemUser;
import br.crm.pojo.examitem.OrganizationExamItemUserExample;
import br.crm.pojo.org.Organization;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.examfeeitem.OrgExamFeeItemDetailRedis;
import br.order.redis.examitem.OrgExamItemRedis;
import br.order.redis.org.OrgRedis;
import br.order.redis.redis.RedisService;
import br.crm.vo.examitem.OrganizationExamFeeItemDetailVo;

/**
 * (收费项-体检项关联service)
 * 
 * @ClassName: OrgExamFeeItemDetailServiceImpl
 * @Description: 
 * @author 王文腾
 * @date 2016年9月13日 上午10:09:21
 */
@Service
public class OrgExamFeeItemDetailServiceImpl implements OrgExamFeeItemDetailService {
    /**
     * {收费项-体检项DAO}
     */
    @Autowired
    private OrganizationExamFeeItemDetailMapper orgExamFeeItemDetailMapper;
    @Autowired
    private OrganizationExamItemUserMapper organizationExamItemUserMapper;
    @Autowired
    private OrganizationExamItemMapper organizationExamItemMapper;
    @Autowired
    private  OrganizationMapper organizationMapper;
    @Autowired
    private RedisService redisService;
    @Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private OrgExamFeeItemDetailRedis orgExamFeeItemDetailRedis;
	@Autowired
	private OrgExamItemRedis OrgExamItemRedis;
	@Autowired
	private OrgRedis orgRedis;
	


    /**
     * 批量添加收费项体检项关联信息
     * <p>
     * Title: batchInsertOrgExamFeeItemDetail
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param list
     *            收费项-体检项对象集合
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService#batchInsertOrgExamFeeItemDetail(java.util.List)
     */
    @Override
    public int batchInsertOrgExamFeeItemDetail(OrganizationExamFeeItem orgExamFeeItem, String examItemId) {
       
        String[] value = examItemId.split(",");
        int i = 0;
        for (int j = 0; j < value.length; j++) {
            if(value[j].length()>0){
                OrganizationExamFeeItemDetail orgExamFeeItemDetail = new OrganizationExamFeeItemDetail();
                orgExamFeeItemDetail.setExamFeeItemDetailId(UUIDUtils.getId());
                orgExamFeeItemDetail.setExamFeeItemId(orgExamFeeItem.getId());
                orgExamFeeItemDetail.setOrganizationId(orgExamFeeItem.getOrgId());
                orgExamFeeItemDetail.setOrganizationBranchId(orgExamFeeItem.getOrganizationBranchId());
                orgExamFeeItemDetail.setOrganizationDeptId(orgExamFeeItem.getDepartmentId());
                orgExamFeeItemDetail.setExamItemUserId(value[j]);
                orgExamFeeItemDetail.setCreateTime(new Date());
                orgExamFeeItemDetail.setEditTime(orgExamFeeItemDetail.getCreateTime());
                orgExamFeeItemDetail.setStatus(0);
                int y = orgExamFeeItemDetailMapper.insertSelective(orgExamFeeItemDetail);
                i++;
                if (y > 0&& systemConfigService.getRedis()) {
                	orgExamFeeItemDetailRedis.insertOrgExamFeeItemDetail(orgExamFeeItemDetail); 
                }
            }
        }

        return i;
    }

    /**
     * 根据收费项id删除收费项-体检项关联
     * <p>
     * Title: deleteOrgExamFeeItemDetail
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param examFeeItemId
     *            收费项id
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService#deleteOrgExamFeeItemDetail(java.lang.String)
     */
    @Override
    public int deleteOrgExamFeeItemDetail(String examFeeItemId) {
       
        OrganizationExamFeeItemDetailExample example = new OrganizationExamFeeItemDetailExample();
        Criteria criteria = example.createCriteria();
        criteria.andExamFeeItemIdEqualTo(examFeeItemId);
        if(systemConfigService.getRedis()){
        	orgExamFeeItemDetailRedis.updateOrgExamFeeItemDetail(examFeeItemId);
        }
        return orgExamFeeItemDetailMapper.deleteByExample(example);
    }

    

    /**
    	 * <p>Title:updateOrgExamFeeItemDetail</p> 
    	 * <p>Description: 根据收费检查项主键id逻辑删除收费项目与检查项目关联表</p> 
    	 * @param examFeeItemDetailId
    	 * @return
         * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService#updateOrgExamFeeItemDetail(java.lang.String)
    	 */
    @Override
    public int updateOrgExamFeeItemDetail(
            OrganizationExamFeeItemDetail organizationExamFeeItemDetail) {
    	if(systemConfigService.getRedis()){
    		orgExamFeeItemDetailRedis.updateOrgExamFeeItemDetail(organizationExamFeeItemDetail.getExamFeeItemDetailId());
    	}
        return orgExamFeeItemDetailMapper
                .updateByPrimaryKeySelective(organizationExamFeeItemDetail);
    }

    @Override
    public OrganizationExamFeeItemDetail SelectOrgExamFeeItemDetailByPrimaryKey(
            String examFeeItemDetailId) {
    if(systemConfigService.getRedis()){
    	 return orgExamFeeItemDetailRedis.selectOrgExamFeeItemDetailByPrimaryKey(examFeeItemDetailId);
    }
        return orgExamFeeItemDetailMapper
                .selectByPrimaryKey(examFeeItemDetailId);
    }

    /**
    	 * <p>Title:getOrgExamFeeItemDetailByPage</p> 
    	 * <p>Description:根据收费项id,机构id,门店id做检查项收费项关联分页 </p> 
    	 * @param page
    	 * @param rows
    	 * @param feeItemId
    	 * @param orgId
    	 * @param branchId
    	 * @return
         * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService#getOrgExamFeeItemDetailByPage(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
    	 */
    @Override
    public PageInfo<OrganizationExamFeeItemDetailVo> getOrgExamFeeItemDetailByPage(
            Integer page, Integer rows, String feeItemId, String orgId,
            String branchId) {
        PageHelper.startPage(page, rows);
        OrganizationExamFeeItemDetailExample example = new OrganizationExamFeeItemDetailExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andStatusEqualTo(0);
        //根据收费项id分页查询
        if (feeItemId != null) {
            createCriteria.andExamFeeItemIdEqualTo(feeItemId);
        }
        //根据机构id分页查询
        if (orgId != null) {
            List<String> userids = new ArrayList<String>();
            List<String> userList = null;
            	//TODO 机构人员查询
            if (redisService.get(RedisConstant.br_order_orgUser_orgId.concat(orgId)) != null) {
                userList = JsonUtils.jsonToList(redisService.get(RedisConstant.br_order_orgUser_orgId.concat(orgId)),
                        String.class);
                for (String string : userList) {
                    if (string != null) {
                        userids.add(string);
                    }
                }
                if (userids != null) {
                    List<String> examItemUser = new ArrayList<>();
                    OrganizationExamItemUserExample userExample = new OrganizationExamItemUserExample();
                    br.crm.pojo.examitem.OrganizationExamItemUserExample.Criteria userCriteria = userExample
                            .createCriteria();
                    userCriteria.andOrganizationUserIdIn(userids);
                    List<OrganizationExamItemUser> euserList = organizationExamItemUserMapper
                            .selectByExample(userExample);
                    for (OrganizationExamItemUser orgExamItemUser : euserList) {
                        examItemUser.add(orgExamItemUser
                                .getOrganizationExamItemUserId());
                    }
                    createCriteria.andExamItemUserIdIn(examItemUser);
                }
            }
        }
        //根据门店id分页查询
        if (branchId != null) {
            List<String> userIds = new ArrayList<String>();
            	//TODO 门店人员
            if (redisService.get(RedisConstant.br_order_orgUser_orgBranchId
                    .concat(branchId)) != null) {
                List<String> userList = JsonUtils
                        .jsonToList(
                                redisService
                                        .get(RedisConstant.br_order_orgUser_orgBranchId
                                                .concat(branchId)),
                                String.class);
                for (String string : userList) {
                    if (string != null) {
                        userIds.add(string);
                    }
                }
                if (userIds != null) {
                    List<String> examItemUser = new ArrayList<>();
                    OrganizationExamItemUserExample userExample = new OrganizationExamItemUserExample();
                    br.crm.pojo.examitem.OrganizationExamItemUserExample.Criteria userCriteria = userExample
                            .createCriteria();
                    userCriteria.andOrganizationUserIdIn(userIds);
                    List<OrganizationExamItemUser> euserList = organizationExamItemUserMapper
                            .selectByExample(userExample);
                    for (OrganizationExamItemUser orgExamItemUser : euserList) {
                        examItemUser.add(orgExamItemUser
                                .getOrganizationExamItemUserId());
                    }
                    createCriteria.andExamItemUserIdIn(examItemUser);
                }
            }
        }
        List<OrganizationExamFeeItemDetailVo> detailVoList = new ArrayList<OrganizationExamFeeItemDetailVo>();
        List<OrganizationExamFeeItemDetail> list = orgExamFeeItemDetailMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationExamFeeItemDetail organizationExamFeeItemDetail : list) {
                OrganizationExamFeeItemDetailVo detailVo = new OrganizationExamFeeItemDetailVo();
                Organization organization = new Organization();
                OrganizationBranch OrganizationBranch = new OrganizationBranch();
                OrganizationDept organizationDept = new OrganizationDept();
                //TODO 获取医生对象 redis
                if (organizationExamFeeItemDetail.getExamItemUserId() != null
                        && redisService.get(RedisConstant.br_order_orgExamItemUser_id.concat(organizationExamFeeItemDetail
                                                .getExamItemUserId())) != null) {
                    OrganizationExamItemUser organizationExamItemUser = JsonUtils.jsonToPojo(
                        redisService.get(RedisConstant.br_order_orgExamItemUser_id.concat(organizationExamFeeItemDetail.getExamItemUserId())),
                        			OrganizationExamItemUser.class);
                    //获取检查项对象 
                    OrganizationExamItem organizationExamItem;
                    if(systemConfigService.getRedis()){
                    	organizationExamItem= OrgExamItemRedis.getOrgExamItemById(organizationExamItemUser.getOrganizationExamItemId());
                    }else{
                    	organizationExamItem = organizationExamItemMapper.selectByPrimaryKey(organizationExamItemUser.getOrganizationExamItemId());
                                
                    }
                     //TODO  br_order_orgUser_userId 机构用户
                    OrganizationUser organizationUser = null;
                    if (redisService.get(RedisConstant.br_order_orgUser_userId.concat(organizationExamItemUser.getOrganizationUserId())) != null) {
                        organizationUser = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgUser_userId.concat(organizationExamItemUser
                                            .getOrganizationUserId())),OrganizationUser.class);
                    }
                   
                    if (organizationUser != null) {
                    	
                        if (organizationUser.getOrgId() != null ) {
                        	if(systemConfigService.getRedis()){
                        		organization=orgRedis.getOrganization(organizationUser.getOrgId());
                        	}else{
                        		  organization = organizationMapper.selectByPrimaryKey(organizationUser.getOrgId());
                        	} 
                        }
                        //TODO 门店信息
                        if (organizationUser.getOrgBranchId() != null&& redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(organizationUser
                                                .getOrgBranchId())) != null) {
                            OrganizationBranch = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgbranch_orgBranchId.concat(organizationUser
                                                .getOrgBranchId())),OrganizationBranch.class);
                        }
                        //TODO 机构科室
                        if (organizationUser.getOrgBranchDeptId() != null&& redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(organizationUser
                                                .getOrgBranchDeptId())) != null) {
                            organizationDept = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgDept_orgDeptId.concat(organizationUser
                                                .getOrgBranchDeptId())),OrganizationDept.class);
                        }
                        
                        detailVo.setExamFeeItemDetailId(organizationExamFeeItemDetail.getExamFeeItemDetailId());
                        detailVo.setUserId(organizationUser.getUserId());
                        detailVo.setUserName(organizationUser.getUserName());
                        detailVo.setDeptId(organizationDept.getOrgDeptId());
                        detailVo.setDeptName(organizationDept.getDepartName());
                        detailVo.setOrganizationExamItemId(organizationExamItem.getExamItemId());
                        detailVo.setExamItemName(organizationExamItem.getExamItemName());
                        detailVo.setfMale(organizationExamItem.getfMale());
                        detailVo.setfFemale(organizationExamItem.getfFemale());
                        detailVo.setBranchId(organizationUser.getOrgBranchId());
                        detailVo.setOrgId(organizationUser.getOrgId());
                        detailVo.setOrgName(organization != null? organization.getOrgShortName() : null);
                        detailVo.setBranchName(OrganizationBranch != null? OrganizationBranch.getBranchName() : null);
                    }
                    detailVoList.add(detailVo);
                }
            }
        }
        PageInfo<OrganizationExamFeeItemDetailVo> pageInfo = new PageInfo<OrganizationExamFeeItemDetailVo>(
                detailVoList);
        return pageInfo;
    }

	/**
	* <p>Title: getAllOrgExamFeeItemDetail</p> 
	* <p>Description: </p> 
	* @return 
	* @see br.crm.service.orgexamfeeitem.OrgExamFeeItemDetailService#getAllOrgExamFeeItemDetail() 
	*/
	@Override
	public List<OrganizationExamFeeItemDetail> getAllOrgExamFeeItemDetail() {
		// TODO Auto-generated method stub
		OrganizationExamFeeItemDetailExample example = new OrganizationExamFeeItemDetailExample();
	    example.createCriteria().andStatusEqualTo(0);
	    List<OrganizationExamFeeItemDetail> selectByExample = orgExamFeeItemDetailMapper
	               .selectByExample(example);
	    return selectByExample;

	}
}
