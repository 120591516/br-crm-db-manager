package br.crm.service.impl.suite;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.examfeeitem.OrganizationExamFeeItemMapper;
import br.crm.mapper.examitem.OrganizationExamFeeItemDetailMapper;
import br.crm.mapper.suite.OrganizationExamSuiteFeeItemMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetail;
import br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuiteFeeItem;
import br.crm.pojo.suite.OrganizationExamSuiteFeeItemExample;
import br.crm.pojo.suite.OrganizationExamSuiteFeeItemExample.Criteria;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.service.suite.OrgExamFeeItemSuiteService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.order.redis.examfeeitem.OrgExamFeeItemDetailRedis;
import br.order.redis.examfeeitem.OrgExamFeeItemRedis;
import br.order.redis.suite.OrgExamFeeItemSuiteRedis;
import br.order.redis.suite.OrgExamSuiteRedis;

/**
 * (收费-体检套餐service)
 * 
 * @ClassName: OrgExamFeeItemSuiteServiceImpl
 * @Description: TODO(收费-体检套餐service)
 * @author 王文腾
 * @date 2016年9月13日 上午10:26:29
 */
@Service
public class OrgExamFeeItemSuiteServiceImpl implements OrgExamFeeItemSuiteService {
    /**
     * {收费项-体检套餐DAO}
     */
    @Autowired
    private OrganizationExamSuiteFeeItemMapper organizationExamSuiteFeeItemMapper;

    @Autowired
    private OrganizationExamSuiteMapper organizationExamSuiteMapper;
    
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private OrgExamFeeItemSuiteRedis orgExamFeeItemSuiteRedis;
	
	@Autowired
	private OrgExamSuiteRedis orgExamSuiteRedis;
	
	@Autowired
	private OrgExamFeeItemDetailRedis orgExamFeeItemDetailRedis;
	
	@Autowired
	private OrgExamFeeItemRedis orgExamFeeItemRedis;
	
	@Autowired
	private OrganizationExamFeeItemDetailMapper organizationExamFeeItemDetailMapper;

	@Autowired
	private OrganizationExamFeeItemMapper organizationExamFeeItemMapper;
	
	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;
	
	@Autowired
	private DictImgMapper dictImgMapper;

    /**
     * 分页显示收费项体检套餐信息
     * <p>
     * Title: getOrgExamFeeItemSuiteByPage
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param page
     *            当前页数
     * @param rows
     *            当前页显示行数
     * @return
     * @see br.crm.service.suite.OrgExamFeeItemSuiteService#getOrgExamFeeItemSuiteByPage(java.lang.Integer,
     *      java.lang.Integer)
     */
    @Override
    public PageInfo<OrganizationExamSuiteFeeItem> getOrgExamFeeItemSuiteByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        OrganizationExamSuiteFeeItemExample example = new OrganizationExamSuiteFeeItemExample();
        Criteria criteria = example.createCriteria();
        criteria.andExamFisStatusEqualTo(0);
        List<OrganizationExamSuiteFeeItem> list = organizationExamSuiteFeeItemMapper.selectByExample(example);
        PageInfo<OrganizationExamSuiteFeeItem> pageInfo = new PageInfo<OrganizationExamSuiteFeeItem>(list);
        return pageInfo;
    }

    /**
     * 添加收费-体检套餐信息
     * <p>
     * Title: insertOrgExamFeeItemSuite
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItemSuite
     *            收费-体检套餐对象
     * @return
     * @see br.crm.service.suite.OrgExamFeeItemSuiteService#insertOrgExamFeeItemSuite(br.crm.pojo.suite.OrganizationExamFeeItemSuite)
     */
    @Override
    public int insertOrgExamFeeItemSuite(OrganizationExamSuiteFeeItem orgExamFeeItemSuite) {
        orgExamFeeItemSuite.setExamFisId(UUIDUtils.getId());
        orgExamFeeItemSuite.setExamFisStatus(0);
        orgExamFeeItemSuite.setExamFisCreateTime(new Date());
        orgExamFeeItemSuite.setExamFisEditTime(orgExamFeeItemSuite.getExamFisCreateTime());
        int i =organizationExamSuiteFeeItemMapper.insertSelective(orgExamFeeItemSuite);
        if(systemConfigService.getRedis()){
        	orgExamFeeItemSuiteRedis.insertOrgExamFeeItemSuite(orgExamFeeItemSuite);
        } 
        return i;
    }

    /**
     * 根据id获取收费-体检套餐信息
     * <p>
     * Title: getOrgExamFeeItemSuiteById
     * </p>
     * <p>
     * Description:
     * </p> 
     * 
     * @param examFisId
     *            主键id
     * @return
     * @see br.crm.service.suite.OrgExamFeeItemSuiteService#getOrgExamFeeItemSuiteById(java.lang.String)
     */
    @Override
    public OrganizationExamSuiteFeeItem getOrgExamFeeItemSuiteById(String examFisId) {
    	if(systemConfigService.getRedis()){
    		return orgExamFeeItemSuiteRedis.getOrgExamFeeItemSuiteById(examFisId);
    	}
    	OrganizationExamSuiteFeeItem organizationExamSuiteFeeItem= organizationExamSuiteFeeItemMapper.selectByPrimaryKey(examFisId);
        return organizationExamSuiteFeeItem;
    }

    /**
     * 修改收费-体检套餐信息
     * <p>
     * Title: updateOrgExamFeeItemSuite
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamFeeItemSuite
     *            收费-体检套餐对象
     * @return
     * @see br.crm.service.suite.OrgExamFeeItemSuiteService#updateOrgExamFeeItemSuite(br.crm.pojo.suite.OrganizationExamFeeItemSuite)
     */
    @Override
    public int updateOrgExamFeeItemSuite(OrganizationExamSuiteFeeItem orgExamFeeItemSuite) {
        orgExamFeeItemSuite.setExamFisEditTime(new Date());
        int result = organizationExamSuiteFeeItemMapper.updateByPrimaryKeySelective(orgExamFeeItemSuite);
        if(systemConfigService.getRedis()){
        	orgExamFeeItemSuiteRedis.updateOrgExamFeeItemSuite(orgExamFeeItemSuite);
        }
        return result;
    }
 
    /**
     * 批量添加收费项-体检套餐关联信息
     * <p>
     * Title: batchInsertOrgExamFeeItemSuite
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param list
     *            收费-体检套餐对象集合
     * @return
     * @see br.crm.service.suite.OrgExamFeeItemSuiteService#insertOrgExamFeeItemSuite(java.util.List)
     */
    @Override
    public int insertOrgExamFeeItemSuite(String examSuiteId,String examFeeItemDetailId) {
        String [] examFeeItemDetailIds = examFeeItemDetailId.split(",");
        int i= 0;
        OrganizationExamSuite examSuite;
        if(systemConfigService.getRedis()){
        	examSuite=orgExamSuiteRedis.getOrgExamSuiteById(examSuiteId);
        }else{
        	examSuite= organizationExamSuiteMapper.selectByPrimaryKey(examSuiteId);
        }
       
        OrganizationExamSuiteFeeItem orgExamSuiteFeeItem =new OrganizationExamSuiteFeeItem();
        orgExamSuiteFeeItem.setExamFisId(UUIDUtils.getId());
        orgExamSuiteFeeItem.setExamSuiteId(examSuiteId);
        orgExamSuiteFeeItem.setExamFisStatus(0);
        orgExamSuiteFeeItem.setExamFisCreateTime(new Date());
        orgExamSuiteFeeItem.setExamFisEditTime(orgExamSuiteFeeItem.getExamFisCreateTime());
        for (int j = 0; j < examFeeItemDetailIds.length; j++) {
        	 OrganizationExamFeeItemDetail examFeeItemDetail;
        	 OrganizationExamFeeItem feeItem;
        	 if(systemConfigService.getRedis()){  
        		 examFeeItemDetail=orgExamFeeItemDetailRedis.selectOrgExamFeeItemDetailByPrimaryKey(examFeeItemDetailIds[j]);//根据收费项-检查项中间表id获取中间表
        		 feeItem=orgExamFeeItemRedis.getOrganizationExamFeeItemById(examFeeItemDetail.getExamFeeItemId());//根据中间表数据获取收费项对象
        	 }else{ 
        		  examFeeItemDetail= organizationExamFeeItemDetailMapper.selectByPrimaryKey(examFeeItemDetailIds[j]);
        		  feeItem=organizationExamFeeItemMapper.selectByPrimaryKey(examFeeItemDetail.getExamFeeItemId());
        	 } 
            orgExamSuiteFeeItem.setExamFeeItemId(examFeeItemDetailIds[j]);
            orgExamSuiteFeeItem.setExamFisPrice(examSuite.getExamSuitePrice());
            orgExamSuiteFeeItem.setOrganizationId(feeItem.getOrgId());
            orgExamSuiteFeeItem.setOrganizationBranchId(feeItem.getOrganizationBranchId());
            i += organizationExamSuiteFeeItemMapper.insertSelective(orgExamSuiteFeeItem);
            if(i>0&&systemConfigService.getRedis()){
            	orgExamFeeItemSuiteRedis.insertOrgExamFeeItemSuite(orgExamSuiteFeeItem);
            }
        }
        return i;
    } 
    
    @Override
    public List<OrganizationExamSuiteFeeItem> getAllOrgExamFeeItemSuite() { 
        OrganizationExamSuiteFeeItemExample example = new OrganizationExamSuiteFeeItemExample();
        Criteria criteria = example.createCriteria();
        criteria.andExamFisStatusEqualTo(0);
        List<OrganizationExamSuiteFeeItem> list = organizationExamSuiteFeeItemMapper.selectByExample(example);
        return list;
    }
  
    
    
    /**
     * 获取套餐下的收费项
     * <p>
     * Title: getOrgExamFeeItemBySId
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgExamSuiteId
     *            套餐id
     * @return 收费项信息列表
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#getOrgExamFeeItemBySId(java.lang.String)
     */
  
    @Override
    public PageInfo<OrgExamFeeItemVo> getOrgExamFeeItemBySId(String orgId, String orgExamSuiteId, Integer page, Integer rows) {
        //定义返回的数据集合
        List<OrgExamFeeItemVo> resultList = new ArrayList<OrgExamFeeItemVo>();
        PageInfo<OrgExamFeeItemVo> resultPageInfo = new PageInfo<OrgExamFeeItemVo>(resultList);
        //如果机构id为空根据收费项id获取机构的id
        if (StringUtils.isEmpty(orgId)) {
        	if(systemConfigService.getRedis()){
        		orgId = orgExamSuiteRedis.getOrgExamSuiteById(orgExamSuiteId).getOrgId();
        	}else{
        		orgId = organizationExamSuiteMapper.selectByPrimaryKey(orgExamSuiteId).getOrgId();
        	} 
        }

        //先根据套餐id获取 收费项-检查项-用户中间表ID
        OrganizationExamSuiteFeeItemExample suiteFeeItemExample = new OrganizationExamSuiteFeeItemExample();
        suiteFeeItemExample.createCriteria().andOrganizationIdEqualTo(orgId).andExamFisStatusEqualTo(0).andExamSuiteIdEqualTo(orgExamSuiteId);
        List<OrganizationExamSuiteFeeItem> suiteFeeItemList = organizationExamSuiteFeeItemMapper.selectByExample(suiteFeeItemExample);
        PageInfo<OrganizationExamSuiteFeeItem> pageInfo = new PageInfo<OrganizationExamSuiteFeeItem>(suiteFeeItemList);

        if (CollectionUtils.isEmpty(suiteFeeItemList)) {
            return resultPageInfo;
        }
        else {
            for (OrganizationExamSuiteFeeItem orgExamSuiteFeeItem : suiteFeeItemList) {
                OrgExamFeeItemVo feeItemVo = new OrgExamFeeItemVo();
                OrganizationExamFeeItemDetail feeItemDetail;
                if(systemConfigService.getRedis()){
                	feeItemDetail =orgExamFeeItemDetailRedis.selectOrgExamFeeItemDetailByPrimaryKey(orgExamSuiteFeeItem.getExamFeeItemId());
                }else{
                	feeItemDetail =organizationExamFeeItemDetailMapper.selectByPrimaryKey(orgExamSuiteFeeItem.getExamFeeItemId());
                } 
                if (feeItemDetail!=null) {
                	OrganizationExamFeeItem feeItem;
                	if(systemConfigService.getRedis()){
                		feeItem=orgExamFeeItemRedis.getOrganizationExamFeeItemById(feeItemDetail.getExamFeeItemId());
                	}else{
                		feeItem=organizationExamFeeItemMapper.selectByPrimaryKey(feeItemDetail.getExamFeeItemId());
                	}
                    try {
                        BeanUtils.copyProperties(feeItemVo, feeItem);
                        feeItemVo.setExamFeeItemDetailId(feeItemDetail.getExamFeeItemDetailId());
                        resultList.add(feeItemVo);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        resultPageInfo = new PageInfo<OrgExamFeeItemVo>(resultList);
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
    /**
     * 
     * <p>
     * Title: getOrgExamFeeItemBySuitId
     * </p>
     * <p>
     * Description: 根据套餐id查看收费项
     * </p>
     * 
     * @param orgExamSuiteId
     *            套餐id
     * @return
     * @see br.crm.service.org.OrgExamSuiteService#getOrgExamFeeItemBySuitId(java.lang.String)
     */
    @Override
    public PageInfo<OrgExamFeeItemVo> getOrgExamFeeItemBySuitId(String orgId, String orgExamSuiteId, Integer page, Integer rows) {
        if (StringUtils.isEmpty(orgId)) {
            orgId = organizationExamSuiteMapper.selectByPrimaryKey(orgExamSuiteId).getOrgId();
        }
        List<OrgExamFeeItemVo> resultList = new ArrayList<OrgExamFeeItemVo>();
        // 获取当前套餐下已有的收费项-体检项中间表
        OrganizationExamSuiteFeeItemExample example = new OrganizationExamSuiteFeeItemExample();
        example.createCriteria().andExamSuiteIdEqualTo(orgExamSuiteId).andExamFisStatusEqualTo(0).andOrganizationIdEqualTo(orgId);
        List<OrganizationExamSuiteFeeItem> suiteList = organizationExamSuiteFeeItemMapper.selectByExample(example);
        System.out.println(suiteList.size());
        // 查询收费-检查项目
        OrganizationExamFeeItemDetailExample examFeeItemDetailExample = new OrganizationExamFeeItemDetailExample();
        //添加本机构查询条件
        examFeeItemDetailExample.createCriteria().andStatusEqualTo(0).andOrganizationIdEqualTo(orgId);
        /*if (feedIdStrings != null) {
        	examFeeItemDetailExample.createCriteria().andExamFeeItemDetailIdNotIn(feedIdStrings);
        }*/
        PageHelper.startPage(page, rows);
        //查询已绑定检查项的收费项信息
        List<OrganizationExamFeeItemDetail> organizationExamFeeItemDetailList = organizationExamFeeItemDetailMapper.selectByExample(examFeeItemDetailExample);
        OrgExamFeeItemVo orgExamFeeItemVo = null;
        PageInfo<OrganizationExamFeeItemDetail> pageInfo = new PageInfo<OrganizationExamFeeItemDetail>(organizationExamFeeItemDetailList);
        try {
            //封装收费项
            for (OrganizationExamFeeItemDetail organizationExamFeeItemDetail : organizationExamFeeItemDetailList) {
                orgExamFeeItemVo = new OrgExamFeeItemVo();
                BeanUtils.copyProperties(orgExamFeeItemVo, organizationExamFeeItemMapper.selectByPrimaryKey(organizationExamFeeItemDetail.getExamFeeItemId()));
                orgExamFeeItemVo.setFeeItemExamItemUserId(organizationExamFeeItemDetail.getExamItemUserId());
                orgExamFeeItemVo.setExamFeeItemDetailId(organizationExamFeeItemDetail.getExamFeeItemDetailId());
                if (CollectionUtils.isNotEmpty(suiteList)) {
                    for (OrganizationExamSuiteFeeItem orgExamFeeItemSuite : suiteList) {
                        if (orgExamFeeItemSuite.getExamFeeItemId().equals(organizationExamFeeItemDetail.getExamFeeItemDetailId())) {
                            System.out.println(orgExamFeeItemSuite.getExamFeeItemId());
                            orgExamFeeItemVo.setChecked(true);
                        }
                    }
                }
                resultList.add(orgExamFeeItemVo);
            }
        }
        catch (Exception e) {
         e.printStackTrace();
        }
        PageInfo<OrgExamFeeItemVo> resultPageInfo = new PageInfo<OrgExamFeeItemVo>(resultList);
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

    /**
     * 查询收费项信息关联条数
     * <p>
     * Title: countExamFeeItemRelation
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            收费项id
     * @return
     * @see br.crm.service.orgexamfeeitem.OrgExamFeeItemService#countExamFeeItemRelation(java.lang.String)
     */
    @Override
    public int countExamFeeItemRelation(String id) {
        OrganizationExamSuiteFeeItemExample example = new OrganizationExamSuiteFeeItemExample();
        Criteria criteria = example.createCriteria();
        criteria.andExamFeeItemIdEqualTo(id);
        int count = organizationExamSuiteFeeItemMapper.countByExample(example);
        if (count <= 0) {
            OrganizationExamFeeItemDetailExample exampleD = new OrganizationExamFeeItemDetailExample();
            br.crm.pojo.examitem.OrganizationExamFeeItemDetailExample.Criteria criteria2 = exampleD.createCriteria();
            criteria2.andExamFeeItemIdEqualTo(id);
            count = organizationExamFeeItemDetailMapper.countByExample(exampleD);
            if (count <= 0) {
                return count;
            }
        }
        return -1;
    }

    @Override
    public List<Map<String, String>> getSuiteListByOrgId(String orgId) {
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        OrganizationExamSuiteExample organizationExamSuiteExample = new OrganizationExamSuiteExample();
        organizationExamSuiteExample.createCriteria().andExamSuiteStatusEqualTo(0).andOrgIdEqualTo(orgId);
        List<OrganizationExamSuite> list = organizationExamSuiteMapper.selectByExample(organizationExamSuiteExample);
        if (CollectionUtils.isNotEmpty(list)) {
        	Map<String, String> map = new HashMap<String, String>();
            for (OrganizationExamSuite organizationExamSuite : list) {
            	OrganizationExamSuiteImgExample organizationExamSuiteImgExample = new OrganizationExamSuiteImgExample();
            	organizationExamSuiteImgExample.createCriteria().andOrgExamSuiteStatusEqualTo(0).andOrgExamSuiteIdEqualTo(organizationExamSuite.getExamSuiteId());
            	List<OrganizationExamSuiteImg> orgSuiteImgList = organizationExamSuiteImgMapper.selectByExample(organizationExamSuiteImgExample);
            	if(CollectionUtils.isNotEmpty(orgSuiteImgList)){
            		for (OrganizationExamSuiteImg organizationExamSuiteImg : orgSuiteImgList) {
						if(null!=organizationExamSuiteImg.getOrgExamSuiteImgType()&&organizationExamSuiteImg.getOrgExamSuiteImgType().intValue()==0){
							map.put("suiteImgId", organizationExamSuiteImg.getDictImgId().toString());		
							map.put("suiteImgURL", dictImgMapper.selectByPrimaryKey(organizationExamSuiteImg.getDictImgId()).getImgLocation());
						}
					}
            	}	
                
                map.put("suiteId", organizationExamSuite.getExamSuiteId());
                map.put("suiteName", organizationExamSuite.getExamSuiteName());
                
                result.add(map);
            }
        }
        return result;
    }

    

	

}
