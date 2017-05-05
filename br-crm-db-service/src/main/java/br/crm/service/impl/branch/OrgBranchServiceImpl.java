package br.crm.service.impl.branch;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.branch.OrganizationBranchImgMapper;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.branch.self.OrganizationBranchSelfMapper;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.suite.OrganizationBranchSuiteMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchExample;
import br.crm.pojo.branch.OrganizationBranchExample.Criteria;
import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.branch.OrganizationBranchImgExample;
import br.crm.pojo.branch.OrganizationBranchRest;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationExample;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.crm.service.branch.OrgBranchService;
import br.crm.service.suite.OrgBranchSuiteService;
import br.crm.service.suite.OrgExamSuiteTypeService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.branch.OrganizationBranchVo;
import br.order.redis.redis.RedisService;

/**
 * 门店ServiceImpl
 * 
 * @ClassName: OrgBranchServiceImpl
 * @Description: TODO(门店ServiceImpl)
 * @author adminis
 * @date 2016年9月9日 上午9:28:38
 *
 */
@Service
public class OrgBranchServiceImpl implements OrgBranchService {

    private List<String> imgList = new ArrayList<String>();

    /**
     * 门店DAO
     */
    @Autowired
    private OrganizationBranchMapper organizationBranchMapper;

    /**
     * 门店自定义DAO
     */
    @Autowired
    private OrganizationBranchSelfMapper organizationBranchSelfMapper;

    /**
     * 门店-图片DAO
     */
    @Autowired
    private OrganizationBranchImgMapper orgBranchImgMapper;

    /**
     * 图片DAO
     */
    @Autowired
    private DictImgMapper dictImgMapper;

    @Autowired
    private OrganizationBranchSuiteMapper organizationBranchSuiteMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private OrgExamSuiteTypeService orgExamSuiteTypeService;

    @Autowired
    private OrgBranchSuiteService orgBranchSuiteService;

    /**
     * (添加门店)
     * <p>
     * Title: insertOrganizationBranch
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationBranchVo
     *            门店VO对象
     * @return
     * @see br.crm.service.branch.OrgBranchService#insertOrganizationBranch(br.crm.vo.branch.OrganizationBranchVo)
     */
    @Override
    public String insertOrganizationBranch(OrganizationBranchVo organizationBranchVo) {
        OrganizationBranch branch = new OrganizationBranch();
        branch.setBranchId(UUIDUtils.getId());
        branch.setOrgId(organizationBranchVo.getOrgId());
        branch.setBranchCode(organizationBranchVo.getBranchCode());
        branch.setBranchName(organizationBranchVo.getBranchName());
        // 省市区
        branch.setBranchAreaId(organizationBranchVo.getBranchAreaId());
        branch.setBranchCityId(organizationBranchVo.getBranchCityId());
        branch.setBranchProvinceId(organizationBranchVo.getBranchProvinceId());
        // 详细地址
        branch.setBranchAddress(organizationBranchVo.getBranchAddress());
        // 伐值
        branch.setWarnPeople(organizationBranchVo.getWarnPeople());
        branch.setWarnAmount(organizationBranchVo.getWarnAmount());
        branch.setLimitAmount(organizationBranchVo.getLimitAmount());
        branch.setLimitPeople(organizationBranchVo.getLimitPeople());
        branch.setCreatetime(new Date());
        branch.setEdittime(branch.getCreatetime());
        branch.setStatus(0);
        branch.setSummary(organizationBranchVo.getSummary());
        branch.setSplitSuite(organizationBranchVo.getSplitSuite());
        branch.setNote(organizationBranchVo.getNote());
        branch.setExamEndTime(organizationBranchVo.getExamEndTime());
        branch.setExamStartTime(organizationBranchVo.getExamStartTime());
        // 添加普通门店信息
        organizationBranchMapper.insertSelective(branch);
        redisService.set(RedisConstant.br_order_orgbranch_orgBranchId.concat(branch.getBranchId()), JSONObject.toJSONString(branch));
        return branch.getBranchId();
    }

    /**
     * (添加门店与图片)
     * <p>
     * Title: insertImgAndBranch
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationBranchVo
     *            门店VO对象
     * @param branchId
     *            门店ID
     * @param list
     *            图片数组
     * @return
     * @see br.crm.service.branch.OrgBranchService#insertImgAndBranch(br.crm.vo.branch.OrganizationBranchVo,
     *      int, java.util.List)
     */
    @Override
    // 添加中间表(门店与从图片)
    public int insertImgAndBranch(OrganizationBranchVo organizationBranchVo, String branchId, List<Long> list) {
        int i = 0;
        try {
            for (Long imgId : list) {// 1A,2,3
                OrganizationBranchImg obi = new OrganizationBranchImg();
                obi.setOrgBranchImgId(UUIDUtils.getId());
                obi.setCreateTime(new Date());
                obi.setEditTime(obi.getCreateTime());
                obi.setDictImgId(imgId);// 图片id
                obi.setOrgBranchId(branchId);// 门店id
                obi.setOrgId(organizationBranchVo.getOrgId());// 体检机构Id
                obi.setOrgBranchImgNote(organizationBranchVo.getImgNote());
                obi.setOrgBranchImgType(1);
                imgList.add(obi.getDictImgId().toString());
                orgBranchImgMapper.insertSelective(obi);
                redisService.set(RedisConstant.br_order_orgBranchimg_banchid.concat(obi.getOrgBranchId()), JSONObject.toJSONString(imgList));
            }
            i = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return i;
    }

    @Override
    // 添加中间表(门店与主图片)
    public int insertMasterImgAndBranch(OrganizationBranchVo organizationBranchVo, String branchId, Long imgId) {
        int i = 0;
        try {
            OrganizationBranchImg obi = new OrganizationBranchImg();
            obi.setOrgBranchImgId(UUIDUtils.getId());
            obi.setCreateTime(new Date());
            obi.setEditTime(obi.getCreateTime());
            obi.setDictImgId(imgId);// 图片id
            obi.setOrgBranchId(branchId);// 门店id
            obi.setOrgId(organizationBranchVo.getOrgId());// 体检机构Id
            obi.setOrgBranchImgNote(organizationBranchVo.getImgNote());
            obi.setOrgBranchImgType(0);
            i = orgBranchImgMapper.insertSelective(obi);
            imgList.add(obi.getDictImgId().toString());
            redisService.set(RedisConstant.br_order_orgBranchimg_banchid.concat(obi.getOrgBranchId()), JSONObject.toJSONString(imgList));

        }
        catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return i;
    }

    /**
     * (根据门店的ID获取门店信息)
     * <p>
     * Title: getOrganizationBranchById
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param id
     *            门店ID
     * @return
     * @see br.crm.service.branch.OrgBranchService#getOrganizationBranchById(java.lang.Integer)
     */
    @Override
    public OrganizationBranchVo getOrganizationBranchById(String id) {

        OrganizationBranchVo branchVo = new OrganizationBranchVo();
        OrganizationBranch branch = organizationBranchMapper.selectByPrimaryKey(id);
        if (null != branch) {
            try {
                BeanUtils.copyProperties(branchVo, branch);
                OrganizationBranchImgExample example = new OrganizationBranchImgExample();
                example.createCriteria().andOrgBranchIdEqualTo(id);
                List<OrganizationBranchImg> list = orgBranchImgMapper.selectByExample(example);
                if (CollectionUtils.isNotEmpty(list)) {
                    List<DictImg> imgList = new ArrayList<DictImg>();
                    for (OrganizationBranchImg organizationBranchImg : list) {
                        DictImg img = dictImgMapper.selectByPrimaryKey(organizationBranchImg.getDictImgId());
                        imgList.add(img);
                    }
                    branchVo.setImg(imgList);
                }
                return branchVo;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * (更新门店)
     * <p>
     * Title: updateOrganizationBranch
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationBranch
     *            门店对象
     * @return
     * @see br.crm.service.branch.OrgBranchService#updateOrganizationBranch(br.crm.vo.branch.OrganizationBranchVo)
     */
    @Override
    public int updateOrganizationBranch(OrganizationBranchVo organizationBranch) {
        // 更新普通门店信息
        int i = organizationBranchMapper.updateByPrimaryKeySelective(organizationBranch);

        String imgId = organizationBranch.getImgId();
        List<Long> imgIdList = new ArrayList<Long>();
        Long imgIdMaster = null;
        if (StringUtils.isNotEmpty(imgId)) {
            String[] str = imgId.split(",");
            for (String s : str) {// 1A,2,3.
                if (!s.contains("A")) {
                    imgIdList.add(Long.parseLong(s));
                }
                else {
                    String[] imgIdString = s.split("A");
                    imgIdMaster = Long.parseLong(imgIdString[0].toString());
                }
            }
        }
        // 删除原来所有图片
        OrganizationBranchImgExample organizationBranchImgExample = new OrganizationBranchImgExample();
        organizationBranchImgExample.createCriteria().andOrgBranchIdEqualTo(organizationBranch.getBranchId());
        orgBranchImgMapper.deleteByExample(organizationBranchImgExample);
        // 2.1添加主图片
        if (null != imgIdMaster) {
            OrganizationBranchImg obi = new OrganizationBranchImg();
            obi.setOrgBranchImgId(UUIDUtils.getId());
            obi.setCreateTime(new Date());
            obi.setEditTime(new Date());
            obi.setDictImgId(imgIdMaster);// 图片id
            obi.setOrgBranchId(organizationBranch.getBranchId());// 门店id
            obi.setOrgId(organizationBranch.getOrgId());// 体检机构Id
            obi.setOrgBranchImgType(0);
            obi.setOrgBranchImgNote(null);
            orgBranchImgMapper.insertSelective(obi);
            imgList.add(obi.getDictImgId().toString());
            redisService.set(RedisConstant.br_order_orgBranchimg_banchid.concat(obi.getOrgBranchId()), JSONObject.toJSONString(imgList));
        }
        // 2.2添加从图片
        if (imgIdList.size() > 0 && null != imgIdList) {
            // 1.根据门店的id删除原来所有的图片
            String branchId = organizationBranch.getBranchId();
            OrganizationBranchImgExample example = new OrganizationBranchImgExample();
            example.createCriteria().andOrgBranchIdEqualTo(branchId);
            orgBranchImgMapper.deleteByExample(example);
            // 2.根据门店的id添加新的图片信息
            for (Long imgid : imgIdList) {
                OrganizationBranchImg obi = new OrganizationBranchImg();
                obi.setOrgBranchImgId(UUIDUtils.getId());
                obi.setCreateTime(new Date());
                obi.setEditTime(new Date());
                obi.setDictImgId(imgid);// 图片id
                obi.setOrgBranchId(branchId);// 门店id
                obi.setOrgId(organizationBranch.getOrgId());// 体检机构Id
                obi.setOrgBranchImgType(1);
                obi.setOrgBranchImgNote(null);
                orgBranchImgMapper.insertSelective(obi);
                orgBranchImgMapper.insertSelective(obi);
                List<String> imgList = new ArrayList<String>();
                redisService.set(RedisConstant.br_order_orgBranchimg_banchid.concat(obi.getOrgBranchImgId()), JSONObject.toJSONString(imgList));
            }
        }
        return i;
    }

    /**
     * (条件搜索门店)
     * <p>
     * Title: searchOrganizationBranch
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param organizationBranch
     *            门店对象
     * @param page
     *            当前的页码
     * @param rows
     *            每页显示的条数
     * @return
     * @see br.crm.service.branch.OrgBranchService#searchOrganizationBranch(br.crm.vo.branch.OrganizationBranchVo,
     *      java.lang.Integer, java.lang.Integer)
     */
    @Override
    public PageInfo<OrganizationBranchVo> searchOrganizationBranch(OrganizationBranchVo organizationBranchVo, Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<OrganizationBranchVo> branchList = organizationBranchSelfMapper.selectByCondition(organizationBranchVo);
        PageInfo<OrganizationBranchVo> pageInfo = new PageInfo<>(branchList);
        return pageInfo;
    }

    @Override
    public List<OrganizationBranch> getOrganizationBranchAll() {

        return organizationBranchMapper.selectByExample(null);
    }

    @Override
    public List<OrganizationBranch> getOrganizationBranchAllByOrgId(String orgid) {
        OrganizationBranchExample example = new OrganizationBranchExample();
        example.createCriteria().andOrgIdEqualTo(orgid);
        return organizationBranchMapper.selectByExample(example);
    }

    /**
     * (根据体检机构ID查询自己的门店信息)
     * <p>
     * Title: getOrganizationBranchListByOrgId
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgId
     *            体检机构ID
     * @param page
     *            当前的页码
     * @param rows
     *            每页显示的条数
     * @param organizationBranchvo
     *            门店VO对象
     * @return
     * @see br.crm.service.branch.OrgBranchService#getOrganizationBranchListByOrgId(java.lang.Long,
     *      java.lang.Integer, java.lang.Integer,
     *      br.crm.vo.branch.OrganizationBranchVo)
     */
    @Override
    public PageInfo<OrganizationBranchVo> getOrganizationBranchListByOrgId(String orgId, Integer page, Integer rows, OrganizationBranchVo organizationBranchvo) {

        PageHelper.startPage(page, rows);
        organizationBranchvo.setOrgId(orgId);
        try {
            OrganizationBranchExample organizationBranchExample = new OrganizationBranchExample();
            Criteria criteria = organizationBranchExample.createCriteria();
            criteria.andOrgIdEqualTo(orgId);
            if (null != organizationBranchvo) {
                if (StringUtils.isNotEmpty(organizationBranchvo.getBranchName())) {// 门店名称
                    criteria.andBranchNameLike("%" + organizationBranchvo.getBranchName() + "%");
                }
                if (StringUtils.isNotEmpty(organizationBranchvo.getBranchCode())) {// 代码
                    criteria.andBranchCodeLike("%" + organizationBranchvo.getBranchCode() + "%");
                }
                if (StringUtils.isNotEmpty(organizationBranchvo.getBranchAddress())) {// 地址
                    criteria.andBranchCodeLike("%" + organizationBranchvo.getBranchAddress() + "%");
                }
                if (null != (organizationBranchvo.getSplitSuite()) && -1 != organizationBranchvo.getSplitSuite()) {// 是否支持拆分套餐
                    criteria.andSplitSuiteEqualTo(organizationBranchvo.getSplitSuite());
                }

            }
            List<OrganizationBranchVo> result = new ArrayList<OrganizationBranchVo>();
            List<OrganizationBranch> list = organizationBranchMapper.selectByExample(organizationBranchExample);
            if (CollectionUtils.isNotEmpty(list)) {
                for (OrganizationBranch organizationBranch : list) {
                    OrganizationBranchVo organizationBranchVo = new OrganizationBranchVo();
                    BeanUtils.copyProperties(organizationBranchVo, organizationBranch);
                    result.add(organizationBranchVo);
                }
            }
            PageInfo<OrganizationBranch> pageInfo = new PageInfo<OrganizationBranch>(list);
            PageInfo<OrganizationBranchVo> returnPageInfo = new PageInfo<>(result);
            returnPageInfo.setPages(pageInfo.getPages());
            returnPageInfo.setTotal(pageInfo.getTotal());
            returnPageInfo.setPageSize(pageInfo.getPageSize());
            return returnPageInfo;

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * (根据机构id查可用门店列表)
     * <p>
     * Title: getOrganizationBranchAllByOrgIdOpen
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgid
     *            体检机构ID
     * @param page
     *            当前的页码
     * @param rows
     *            每页显示的条数
     * @return
     * @see br.crm.service.branch.OrgBranchService#getOrganizationBranchAllByOrgIdOpen(java.lang.Integer,
     *      java.lang.Integer, java.lang.Integer)
     */
    @Override
    public List<OrganizationBranch> getOrganizationBranchAllByOrgIdOpen(String orgid, Integer page, Integer rows) {

        PageHelper.startPage(page, rows);
        OrganizationBranchExample example = new OrganizationBranchExample();
        example.createCriteria().andOrgIdEqualTo(orgid).andStatusEqualTo(0);
        return organizationBranchMapper.selectByExample(example);
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: searchBranch
     * </p>
     * <p>
     * Description: 用户预约首页搜索门店
     * </p>
     * 
     * @param page
     *            当前的页码
     * @param rows
     *            每页显示的条数
     * @param organizationBranchVo
     *            搜索对象
     * @return
     * @see br.crm.service.branch.OrgBranchService#searchBranch(java.lang.Integer,
     *      java.lang.Integer, br.crm.vo.branch.OrganizationBranchVo)
     */
    @Override
    public PageInfo<OrganizationBranchVo> searchBranch(Integer page, Integer rows, OrganizationBranchVo organizationBranchVo) {

        List<OrganizationBranchVo> result = new ArrayList<OrganizationBranchVo>();

        List<String> orgIdList = new ArrayList<String>();
        List<String> branchList = new LinkedList<String>();
        List<OrganizationBranch> organizationBranchList = new ArrayList<OrganizationBranch>();
        try {

            PageHelper.startPage(page, rows);
            OrganizationBranchExample example = new OrganizationBranchExample();
            Criteria criteria = example.createCriteria();
            criteria.andStatusEqualTo(0);

            if (null != organizationBranchVo) {
                // 1.1用户搜索省
                if (null != organizationBranchVo.getBranchProvinceId()) {
                    criteria.andBranchProvinceIdEqualTo(organizationBranchVo.getBranchProvinceId());
                }
                // 1.2用户搜索市
                if (null != organizationBranchVo.getBranchCityId()) {
                    criteria.andBranchCityIdEqualTo(organizationBranchVo.getBranchCityId());
                }
                // 1.3用户搜索区
                if (null != organizationBranchVo.getBranchAreaId()) {
                    criteria.andBranchAreaIdEqualTo(organizationBranchVo.getBranchAreaId());
                }

                // 2.1用户选择机构类型
                if (StringUtils.isNotEmpty(organizationBranchVo.getOrgType())) {
                    Integer orgType = Integer.valueOf(organizationBranchVo.getOrgType());
                    if (orgType.intValue() == 2 || orgType.intValue() == 1) {// 2：医院，1：体检机构
                        OrganizationExample organizationExample = new OrganizationExample();
                        br.crm.pojo.org.OrganizationExample.Criteria criteriaOrg = organizationExample.createCriteria();
                        criteriaOrg.andOrgStatusEqualTo(0);
                        criteriaOrg.andOrgNatureEqualTo(orgType);
                        if (orgType.intValue() == 2) {
                            // 2.2用户选择医院等级
                            if (StringUtils.isNotEmpty(organizationBranchVo.getOrgLevel())) {
                                criteriaOrg.andOrgLevelIdEqualTo(Integer.valueOf(organizationBranchVo.getOrgLevel()));
                            }

                        }
                        List<Organization> orgList = organizationMapper.selectByExample(organizationExample);
                        if (CollectionUtils.isNotEmpty(orgList)) {
                            for (Organization organization : orgList) {
                                orgIdList.add(organization.getOrgId());
                            }
                        }
                    }
                }

                // 3.1用户输入机构名称
                if (StringUtils.isNotEmpty(organizationBranchVo.getOrgId())) {
                    OrganizationBranchExample organizationBranchExample = new OrganizationBranchExample();
                    organizationBranchExample.createCriteria().andStatusEqualTo(0).andOrgIdEqualTo(organizationBranchVo.getOrgId());
                    List<OrganizationBranch> list = organizationBranchMapper.selectByExample(organizationBranchExample);
                    if (CollectionUtils.isNotEmpty(list)) {
                        for (OrganizationBranch organizationBranch : list) {
                            branchList.add(organizationBranch.getBranchId());
                        }
                    }
                }
                // 4.1用户输入门店的名称
                if (StringUtils.isNotBlank(organizationBranchVo.getBranchName())) {
                    criteria.andBranchNameLike("%" + organizationBranchVo.getBranchName() + "%");
                }
                // 5.1用户选择套餐类型
                if (StringUtils.isNotEmpty(organizationBranchVo.getSuiteType())) {
                    if (systemConfigService.getRedis()) {
                        //根据套餐类型找绑定套餐
                        String suiteList = redisService.get(RedisConstant.br_order_orgExamSuiteType_typeId + organizationBranchVo.getSuiteType());
                        if (StringUtils.isNotEmpty(suiteList)) {
                            // 查询所有的套餐的id
                            List<String> orgArray = JSONObject.parseArray(suiteList, String.class);
                            if (CollectionUtils.isNotEmpty(orgArray)) {
                                for (String suiteId : orgArray) {
                                    String branchLists = redisService.get(RedisConstant.br_order_orgBranchSuite_suiteId + suiteId);
                                    if (StringUtils.isNotEmpty(branchLists)) {
                                        List<String> branchIdList = JSONObject.parseArray(branchLists, String.class);
                                        if (CollectionUtils.isNotEmpty(branchIdList)) {
                                            for (String branId : branchIdList) {
                                                branchList.add(branId);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    // TODO Auto-generated method stub
                    else {
                        //根据套餐类型找绑定套餐
                        OrganizationExamSuiteType organizationExamSuiteType = new OrganizationExamSuiteType();
                        organizationExamSuiteType.setExamTypeId(organizationBranchVo.getSuiteType());
                        organizationExamSuiteType.setExamSuiteTypeStatus(0);
                        List<OrganizationExamSuiteType> suiteTypeList = orgExamSuiteTypeService.getOrgExamSuiteTypeList(organizationExamSuiteType);
                        if (CollectionUtils.isNotEmpty(suiteTypeList)) {
                            for (OrganizationExamSuiteType organizationExamSuiteType2 : suiteTypeList) {
                                String suiteId = organizationExamSuiteType2.getExamSuiteId();
                                List<OrganizationBranchVo> branchBySuiteId = orgBranchSuiteService.getOrgBranchBySuiteId(suiteId);
                                if (CollectionUtils.isNotEmpty(branchBySuiteId)) {
                                    for (OrganizationBranchVo organizationBranchVo2 : branchBySuiteId) {
                                        branchList.add(organizationBranchVo2.getBranchId());
                                    }
                                }
                            }
                        }
                    }
                }
                if (CollectionUtils.isNotEmpty(orgIdList) || StringUtils.isNotEmpty(organizationBranchVo.getOrgType())) {
                    criteria.andOrgIdIn(orgIdList);
                }
                if (CollectionUtils.isNotEmpty(branchList) || StringUtils.isNotEmpty(organizationBranchVo.getOrgId()) || StringUtils.isNotEmpty(organizationBranchVo.getSuiteType())) {
                    criteria.andBranchIdIn(branchList);
                }
            }
            organizationBranchList = organizationBranchMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(organizationBranchList)) {
                for (OrganizationBranch organizationBranch : organizationBranchList) {

                    OrganizationBranchVo vo = new OrganizationBranchVo();
                    try {
                        BeanUtils.copyProperties(vo, organizationBranch);
                        // 获取休息时间
                        if (redisService.exists(RedisConstant.br_order_orgBranchRest_banchid + organizationBranch.getBranchId())) {
                            String restId = redisService.get(RedisConstant.br_order_orgBranchRest_banchid + organizationBranch.getBranchId());
                            if (StringUtils.isNotEmpty(restId)) {
                                OrganizationBranchRest str = JSONObject.parseObject(restId, OrganizationBranchRest.class);
                                if (null != str) {
                                    vo.setRestType(str.getBranchRestType().toString());
                                    vo.setRestvalue(str.getBranchRestValue());
                                }
                            }
                        }
                        // 从Redis中获取图片
                        if (StringUtils.isNoneBlank(organizationBranch.getBranchId())) {
                            // 查找中间表 门店-图片
                            String jsonImg = redisService.get(RedisConstant.br_order_orgBranchimg_banchid + organizationBranch.getBranchId());
                            if (StringUtils.isNotEmpty(jsonImg)) {
                                List<Long> imgArray = JSONObject.parseArray(jsonImg, Long.class);
                                if (CollectionUtils.isNotEmpty(imgArray)) {
                                    for (Long imgId : imgArray) {
                                        DictImg img = dictImgMapper.selectByPrimaryKey(imgId);
                                        if (null != img) {
                                            vo.setImgId(img.getImgId().toString());
                                            vo.setImgURL(img.getImgLocation());
                                        }
                                    }
                                }
                            }
                        }
                        // 门店中设置套餐数量
                        if (StringUtils.isNotEmpty(organizationBranch.getBranchId())) {
                            OrganizationBranchSuiteExample organizationBranchSuiteExample = new OrganizationBranchSuiteExample();
                            organizationBranchSuiteExample.createCriteria().andStatusEqualTo(0).andBranchIdEqualTo(organizationBranch.getBranchId());
                            int suiteCount = organizationBranchSuiteMapper.countByExample(organizationBranchSuiteExample);
                            vo.setSuiteCount(suiteCount + "");
                        }
                        result.add(vo);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<OrganizationBranchVo> pageInfo = new PageInfo<OrganizationBranchVo>(result);
        PageInfo<OrganizationBranch> branchListPageInfo = new PageInfo<OrganizationBranch>(organizationBranchList);
        pageInfo.setTotal(branchListPageInfo.getTotal());
        pageInfo.setPages(branchListPageInfo.getPages());
        pageInfo.setPageSize(branchListPageInfo.getPageSize());
        return pageInfo;

    }

    /**
     * <p>
     * Title: getOrganizationBranchLimitPeople
     * </p>
     * <p>
     * Description: 门店人数阀值设置
     * </p>
     * 
     * @param orgId
     * @param page
     * @param rows
     * @param organizationBranchvo
     * @return
     * @see br.crm.service.branch.OrgBranchService#getOrganizationBranchLimitPeople(java.lang.String,
     *      java.lang.Integer, java.lang.Integer,
     *      br.crm.vo.branch.OrganizationBranchVo)
     */
    @Override
    public PageInfo<OrganizationBranch> getOrganizationBranchLimitPeople(Integer page, Integer rows, OrganizationBranchVo organizationBranchvo) {
        PageHelper.startPage(page, rows);
        OrganizationBranchExample example = new OrganizationBranchExample();
        Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        if (organizationBranchvo.getOrgId() != null) {
            criteria.andOrgIdEqualTo(organizationBranchvo.getOrgId());
        }
        if (organizationBranchvo.getBranchName() != null) {
            criteria.andBranchNameLike('%' + organizationBranchvo.getBranchName() + '%');
        }
        if (organizationBranchvo.getBranchCode() != null) {
            criteria.andBranchCodeEqualTo(organizationBranchvo.getBranchCode());
        }
        if (organizationBranchvo.getLimitPeopleStart() != null && organizationBranchvo.getLimitPeople() != null) {
            criteria.andLimitPeopleBetween(organizationBranchvo.getLimitPeopleStart(), organizationBranchvo.getLimitPeople());
        }
        if (organizationBranchvo.getLimitPeopleStart() != null && organizationBranchvo.getLimitPeople() == null) {
            criteria.andLimitPeopleGreaterThanOrEqualTo(organizationBranchvo.getLimitPeopleStart());
        }
        if (organizationBranchvo.getLimitPeopleStart() == null && organizationBranchvo.getLimitPeople() != null) {
            criteria.andLimitPeopleLessThanOrEqualTo(organizationBranchvo.getLimitPeople());
        }
        example.setOrderByClause("createtime desc");
        List<OrganizationBranch> list = organizationBranchMapper.selectByExample(example);
        PageInfo<OrganizationBranch> pageInfo = new PageInfo<OrganizationBranch>(list);
        return pageInfo;
    }

    /**
     * <p>
     * Title: updateOrgBranchLimitPeople
     * </p>
     * <p>
     * Description: 修改门店阀值
     * </p>
     * 
     * @param suiteId
     * @param limitPeople
     * @return
     * @see br.crm.service.branch.OrgBranchService#updateOrgBranchLimitPeople(java.lang.String,
     *      java.lang.Integer)
     */
    @Override
    public int updateOrgBranchLimitPeople(String branchId, Integer limitPeople, Integer warnPeople) {
        OrganizationBranch organizationBranch = new OrganizationBranch();
        organizationBranch.setBranchId(branchId);
        organizationBranch.setLimitPeople(limitPeople);
        organizationBranch.setWarnPeople(warnPeople);
        redisService.set(RedisConstant.br_order_orgbranch_orgBranchId.concat(organizationBranch.getBranchId()), JSONObject.toJSONString(organizationBranch));
        return organizationBranchMapper.updateByPrimaryKeySelective(organizationBranch);
    }

    /**
     * (非 Javadoc)
     * <p>
     * Title: getOrganizationBranchByUser
     * </p>
     * <p>
     * Description: 根据机构id查询门店列表
     * </p>
     * 
     * @param orgId
     *            机构id
     * @return
     * @see br.crm.service.branch.OrgBranchService#getOrganizationBranchByUser(java.lang.String)
     */
    @Override
    public List<OrganizationBranch> getOrganizationBranchByUser(String orgId) {

        OrganizationBranchExample example = new OrganizationBranchExample();
        example.createCriteria().andOrgIdEqualTo(orgId).andStatusEqualTo(0);
        List<OrganizationBranch> list = organizationBranchMapper.selectByExample(example);
        return list;
    }

    /**
     * <p>Title:getAllBranchImg</p> 
     * <p>Description:获取门店所有图片 </p> 
     * @return
     * @see br.crm.service.branch.OrgBranchService#getAllBranchImg()
     */
    @Override
    public List<OrganizationBranchImg> getAllBranchImg() {
        List<OrganizationBranchImg> list = orgBranchImgMapper.selectByExample(null);
        return list;
    }

    @Override
    public List<Map<String, String>> getBranchNameByOrgId(String orgId) {
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        OrganizationBranchExample example = new OrganizationBranchExample();
        example.createCriteria().andStatusEqualTo(0).andOrgIdEqualTo(orgId);
        List<OrganizationBranch> list = organizationBranchMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationBranch organizationBranch : list) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("branchId", organizationBranch.getBranchId());
                map.put("branchName", organizationBranch.getBranchName());
                result.add(map);

            }
        }
        return result;
    }

    @Override
    public LinkedList<String> getCityByBranch() {
        LinkedList<String> result = new LinkedList<String>();
        OrganizationBranchExample organizationBranchExample = new OrganizationBranchExample();
        organizationBranchExample.createCriteria().andStatusEqualTo(0);
        List<OrganizationBranch> branchList = organizationBranchMapper.selectByExample(organizationBranchExample);
        if (CollectionUtils.isNotEmpty(branchList)) {
            for (OrganizationBranch organizationBranch : branchList) {
                result.add(organizationBranch.getBranchId());
            }
        }
        return result;
    }

}
