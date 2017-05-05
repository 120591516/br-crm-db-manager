package br.crm.service.impl.dept;

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

import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.dept.OrganizationDeptMapper;
import br.crm.mapper.dept.OrganizationDeptUserMapper;
import br.crm.mapper.dict.DictDeptTypeMapper;
import br.crm.mapper.examfeeitem.OrganizationExamFeeItemMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.dept.OrganizationDept;
import br.crm.pojo.dept.OrganizationDeptExample;
import br.crm.pojo.dept.OrganizationDeptExample.Criteria;
import br.crm.pojo.dept.OrganizationDeptUser;
import br.crm.pojo.dept.OrganizationDeptUserExample;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItem;
import br.crm.pojo.examfeeitem.OrganizationExamFeeItemExample;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.service.dept.OrgDeptService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.dept.OrganizationDeptVo;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.order.redis.branch.OrgBranchRedis;
import br.order.redis.dept.OrgDeptRedis;

/**
 * 
 * @ClassName: OrgDeptServiceImpl
 * @Description: 科室相关接口的实现
 * @author zxy
 * @date 2016年9月12日 上午11:06:12
 *
 */
@Service
public class OrgDeptServiceImpl implements OrgDeptService {

    @Autowired
    private OrganizationDeptMapper organizationDeptMapper;

    @Autowired
    private OrganizationExamFeeItemMapper organizationExamFeeItemMapper;

    @Autowired
    private DictDeptTypeMapper dictDeptTypeMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private OrganizationDeptUserMapper organizationDeptUserMapper;

    @Autowired
    private OrganizationUserMapper organizationUserMapper;

    @Autowired
    private OrgDeptRedis orgDeptRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    @Autowired
    private OrgBranchRedis orgBranchRedis;

    @Autowired
    private OrganizationBranchMapper organizationBranchMapper;

    /**
     * 分页显示科室列表
     * <p>
     * Title: getOrgDeptByCondition
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param page
     *            页数
     * @param rows
     *            行数
     * @param organizationDeptQu
     *            条件查询对象
     * @return
     * @see br.crm.service.org.OrgDeptService#getOrgDeptByCondition(int, int,
     *      br.crm.vo.org.OrganizationDeptQu)
     */
    @Override
    public PageInfo<OrganizationDeptVo> getOrgDeptByCondition(int page, int rows, OrganizationDeptVo organizationDeptVo) {
        PageHelper.startPage(page, rows);
        List<OrganizationDeptVo> result = new ArrayList<OrganizationDeptVo>();
        OrganizationDeptExample example = new OrganizationDeptExample();
        Criteria criteria = example.createCriteria();
        if (organizationDeptVo != null) {

            if (StringUtils.isNotEmpty(organizationDeptVo.getOrgId())) {
                criteria.andOrgIdEqualTo(organizationDeptVo.getOrgId());
            }
            if (StringUtils.isNotEmpty(organizationDeptVo.getDepartName())) {
                criteria.andDepartNameLike("%" + organizationDeptVo.getDepartName() + "%");
            }
            if (StringUtils.isNotEmpty(organizationDeptVo.getBranchId())) {

                criteria.andBranchIdEqualTo(organizationDeptVo.getBranchId());
            }
            if (StringUtils.isNotEmpty(organizationDeptVo.getDepartParentId())) {

                criteria.andDepartParentIdEqualTo(organizationDeptVo.getDepartParentId());
            }
        }
        OrganizationDeptVo vo = null;
        OrganizationDeptUser organizationDeptUser = null;
        OrganizationUser organizationUser = null;
        List<OrganizationDept> organizationDeptList = organizationDeptMapper.selectByExample(example);
        PageInfo<OrganizationDept> pageInfo = new PageInfo<OrganizationDept>(organizationDeptList);
        try {
            if (CollectionUtils.isNotEmpty(organizationDeptList)) {
                for (OrganizationDept organizationDept : organizationDeptList) {
                    vo = new OrganizationDeptVo();
                    OrganizationDeptUserExample example1 = new OrganizationDeptUserExample();
                    example1.createCriteria().andDeptIdEqualTo(organizationDept.getOrgDeptId());

                    organizationDeptUser = organizationDeptUserMapper.selectByExample(example1).size() == 0 ? null : organizationDeptUserMapper.selectByExample(example1).get(0);
                    BeanUtils.copyProperties(vo, organizationDept);
                    if (!organizationDept.getDepartParentId().equals("0")) {
                        if (systemConfigService.getRedis()) {
                            if (null != orgDeptRedis.getOrgDept(organizationDept.getDepartParentId())) {
                                OrganizationDept parentDepart = orgDeptRedis.getOrgDept(organizationDept.getDepartParentId());
                                vo.setDepartParentName(parentDepart.getDepartName());
                            }
                        }
                        else {
                            if (null != organizationDeptMapper.selectByPrimaryKey(organizationDept.getDepartParentId())) {
                                OrganizationDept parentDepart = organizationDeptMapper.selectByPrimaryKey(organizationDept.getDepartParentId());
                                vo.setDepartParentName(parentDepart.getDepartName());
                            }
                        }
                    }
                    else {
                        vo.setDepartParentName("无");
                    }
                    if (organizationDeptUser != null) {
                        organizationUser = organizationUserMapper.selectByPrimaryKey(organizationDeptUser.getUserId());
                        if (organizationUser != null) {
                            BeanUtils.copyProperties(vo, organizationUser);
                            vo.setUserName(organizationUser.getUserLoginName());
                        }
                    }
                    OrganizationBranch organizationBranch = null;
                    if (systemConfigService.getRedis()) {
                        organizationBranch = orgBranchRedis.getOrgBranch(vo.getBranchId());
                    }
                    else {
                        organizationBranch = organizationBranchMapper.selectByPrimaryKey(vo.getBranchId());
                    }
                    vo.setBranchName(organizationBranch == null ? null : organizationBranch.getBranchName());
                    vo.setDictDeptTypeName(dictDeptTypeMapper.selectByPrimaryKey(vo.getDepartType()).getDictDeptTypeName());
                    vo.setOrgShortName(organizationMapper.selectByPrimaryKey(vo.getOrgId()).getOrgShortName());
                    result.add(vo);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<OrganizationDeptVo> resultPageInfo = new PageInfo<OrganizationDeptVo>(result);
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
     * 添加科室信息
     * <p>
     * Title: addOrgDept
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param dept
     *            科室对象
     * @return
     * @see br.crm.service.org.OrgDeptService#addOrgDept(br.crm.pojo.org.OrganizationDept)
     */
    @Override
    public int addOrgDept(OrganizationDept dept) {
        int result = organizationDeptMapper.insertSelective(dept);
        if (systemConfigService.getRedis()) {
            orgDeptRedis.setOrgDept(dept);
        }
        return result;
    }

    /**
     * 修改科室信息
     * <p>
     * Title: updateOrgDept
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param dept
     *            科室信息对象
     * @return
     * @see br.crm.service.org.OrgDeptService#updateOrgDept(br.crm.pojo.org.OrganizationDept)
     */
    @Override
    public int updateOrgDept(OrganizationDeptVo dept) {
        dept.setEdittime(new Date());
        int result = organizationDeptMapper.updateByPrimaryKeySelective(dept);
        if (systemConfigService.getRedis()) {
            orgDeptRedis.setOrgDept(dept);
        }
        return result;
    }

    /**
     * 根据科室id获取科室信息
     * <p>
     * Title: getOrgDeptByPid
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param pid
     *            科室id
     * @return
     * @see br.crm.service.org.OrgDeptService#getOrgDeptByPid(java.lang.String)
     */
    @Override
    public OrganizationDeptVo getOrgDeptByPid(String pid) {
        OrganizationDeptVo result = new OrganizationDeptVo();
        OrganizationDept dept = organizationDeptMapper.selectByPrimaryKey(pid);
        try {
            if (null != dept) {
                BeanUtils.copyProperties(result, dept);
                OrganizationDeptExample example = new OrganizationDeptExample();
                example.createCriteria().andStatusEqualTo(0).andDepartManagerIdEqualTo(dept.getOrgDeptId());
                List<OrganizationDept> list = organizationDeptMapper.selectByExample(example);
                if (CollectionUtils.isNotEmpty(list)) {
                    result.setDictDeptTypeName(dept.getDepartName());
                }
                else {
                    result.setDictDeptTypeName("无");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 根据机构id获取科室信息
     * <p>
     * Title: getOrgDeptByOrgid
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param orgid
     *            机构id
     * @return
     * @see br.crm.service.org.OrgDeptService#getOrgDeptByOrgid(java.lang.String)
     */
    @Override
    public List<OrganizationDept> getOrgDeptByOrgid(String orgid) {
        if (StringUtils.isNotEmpty(orgid)) {
            OrganizationDeptExample example = new OrganizationDeptExample();
            example.createCriteria().andOrgIdEqualTo(orgid);
            return organizationDeptMapper.selectByExample(example);
        }
        return null;
    }

    /**
     * 根据门店id获取科室信息
     * <p>
     * Title: getOrgDeptByBranid
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param branid
     * @return
     * @see br.crm.service.org.OrgDeptService#getOrgDeptByBranid(java.lang.String)
     */
    @Override
    public List<OrganizationDept> getOrgDeptByBranid(String branid) {

        OrganizationDeptExample example = new OrganizationDeptExample();

        example.createCriteria().andBranchIdEqualTo(branid).andStatusEqualTo(0);

        return organizationDeptMapper.selectByExample(example);

    }

    /**
     * 获取科室列表
     * <p>
     * Title: getOrgDeptAll
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @see br.crm.service.org.OrgDeptService#getOrgDeptAll()
     */
    @Override
    public List<OrganizationDept> getOrgDeptAll() {
        return organizationDeptMapper.selectByExample(null);
    }

    @Override
    public List<OrgExamFeeItemVo> getItemByDeptid(String deptId) {
        List<OrgExamFeeItemVo> result = new ArrayList<OrgExamFeeItemVo>();
        OrganizationExamFeeItemExample example = new OrganizationExamFeeItemExample();
        example.createCriteria().andDepartmentIdEqualTo(deptId);
        List<OrganizationExamFeeItem> list = organizationExamFeeItemMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationExamFeeItem organizationExamFeeItem : list) {
                OrgExamFeeItemVo vo = new OrgExamFeeItemVo();
                try {
                    BeanUtils.copyProperties(vo, organizationExamFeeItem);
                    result.add(vo);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;

    }

    @Override
    public List<Map<String, String>> getDeptNameByBranchId(String branchId) {
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        OrganizationDeptExample example = new OrganizationDeptExample();
        example.createCriteria().andBranchIdEqualTo(branchId);
        List<OrganizationDept> list = organizationDeptMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            for (OrganizationDept organizationDept : list) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("deptId", organizationDept.getOrgDeptId());
                map.put("deptName", organizationDept.getDepartName());
                result.add(map);
            }
        }
        return result;
    }

    @Override
    public List<OrganizationDept> getDeptNameByBranid(String branid) {
        // TODO Auto-generated method stub   
        return null;
    }

    /** 
    *  根据机构门店科室id获取科室信息
    * <p>Title: getOrganizationDeptByDeptId</p> 
    * <p>Description: </p> 
    * @param deptId
    * @return
    * @see br.crm.service.dept.OrgDeptService#getOrganizationDeptByDeptId(java.lang.String) 
    */
    @Override
    public OrganizationDept getOrganizationDeptByDeptId(String deptId) {
        OrganizationDept organizationDept = null;
        if (systemConfigService.getRedis()) {
            organizationDept = orgDeptRedis.getOrgDept(deptId);
        }
        else {
            organizationDept = organizationDeptMapper.selectByPrimaryKey(deptId);
        }
        return organizationDept;
    }

}
