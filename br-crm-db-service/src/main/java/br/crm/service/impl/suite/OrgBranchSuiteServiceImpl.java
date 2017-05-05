package br.crm.service.impl.suite;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javassist.expr.NewArray;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.mail.util.BEncoderStream;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.dict.DictAreaMapper;
import br.crm.mapper.org.DictExamSuiteTypeMapper;
import br.crm.mapper.suite.OrganizationBranchSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteTypeMapper;
import br.crm.mapper.suite.self.OrganizationBranchSuiteSelfMapper;
import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchExample.Criteria;
import br.crm.pojo.dict.DictArea;
import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.org.DictExamSuiteTypeExample;
import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.crm.pojo.suite.OrganizationExamSuiteTypeExample;
import br.order.redis.suite.OrgBranchSuiteRedis;
import br.order.redis.suite.OrgExamSuiteRedis;
import br.crm.service.impl.dict.dictExamSuiteTypeServiceImpl;
import br.crm.service.suite.OrgBranchSuiteService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.branch.OrganizationBranchVo;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteTypeVo;
import br.crm.vo.suite.OrgExamSuiteVo;

/**
 * 
 * @ClassName: OrgBranchSuiteServiceImpl
 * @Description: TODO 门店绑定套餐
 * @author kangting
 * @date 2016年9月13日 下午3:10:23
 *
 */
@Service
public class OrgBranchSuiteServiceImpl implements OrgBranchSuiteService {

	@Autowired
	private OrganizationBranchSuiteMapper organizationBranchSuiteMapper;

	@Autowired
	private OrganizationBranchSuiteSelfMapper organizationBranchSuiteSelfMapper;
	
	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;
	
	@Autowired
	private OrganizationExamSuiteMapper  organizationExamSuiteMapper;
	
	@Autowired
	private OrganizationExamSuiteTypeMapper organizationExamSuiteTypeMapper;
	
	@Autowired
	private DictExamSuiteTypeMapper dictExamSuiteTypeMapper;
 
	@Autowired
	private DictAreaMapper dictAreaMapper;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private OrgBranchSuiteRedis orgBranchSuiteRedis;
	
	@Autowired
	private OrgExamSuiteRedis orgExamSuiteRedis;


	/**
	 * 
	 * <p>
	 * Title: getOrgBranchSuite
	 * </p>
	 * <p>
	 * Description: 分页查看套餐信息
	 * </p>
	 * 
	 * @param page
	 *            当前 页
	 * @param rows
	 *            每页条数
	 * @param orgExamSuiteQu
	 *            参数
	 * @return
	 * @see br.crm.service.org.OrgBranchSuiteService#getOrgBranchSuite(java.lang.Integer, java.lang.Integer, br.crm.vo.org.OrgExamSuiteQu)
	 */
	@Override
	public PageInfo<OrgExamSuiteVo> getOrgBranchSuite(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu) {
		
		PageHelper.startPage(page, rows);
		List<OrgExamSuiteVo> list = new ArrayList<OrgExamSuiteVo>();
		OrganizationBranchSuiteExample example=new OrganizationBranchSuiteExample();
		example.createCriteria().andStatusEqualTo(0);
		example.createCriteria().andBranchIdEqualTo(orgExamSuiteQu.getBranchId());
		List<OrganizationBranchSuite> orgBranchSuite=organizationBranchSuiteMapper.selectByExample(example);
	
		for(OrganizationBranchSuite obSuite:orgBranchSuite){
			if(obSuite.getSuiteId()!=null){
				//条件过滤
				OrganizationExamSuiteExample exampleSuite=new OrganizationExamSuiteExample();
				br.crm.pojo.suite.OrganizationExamSuiteExample.Criteria criteria=exampleSuite.createCriteria();
			
				criteria.andExamSuiteIdEqualTo(obSuite.getSuiteId());
				if(orgExamSuiteQu.getExamSuiteName()!=null){
					criteria.andExamSuiteNameLike(orgExamSuiteQu.getExamSuiteName());
				}
				if(orgExamSuiteQu.getExamSuiteCode()!=null){
					criteria.andExamSuiteCodeEqualTo(orgExamSuiteQu.getExamSuiteCode());
				}
				if(orgExamSuiteQu.getExamSuiteSex()==0){
					criteria.andExamSuiteMaleEqualTo(0);
					criteria.andExamSuiteFemaleEqualTo(0);
				}else if(orgExamSuiteQu.getExamSuiteSex()==1){
					criteria.andExamSuiteMaleEqualTo(0);
					criteria.andExamSuiteFemaleEqualTo(1);
				}else if(orgExamSuiteQu.getExamSuiteSex()==2){
					criteria.andExamSuiteMaleEqualTo(1);
					criteria.andExamSuiteFemaleEqualTo(0);
				}	
				if(orgExamSuiteQu.getPriceStart()!=null&&orgExamSuiteQu.getPriceEnd()!=null){
					criteria.andExamSuitePriceBetween(orgExamSuiteQu.getPriceStart(),orgExamSuiteQu.getPriceEnd());
				}else if(orgExamSuiteQu.getPriceStart()==null&&orgExamSuiteQu.getPriceEnd()!=null){
					criteria.andExamSuitePriceLessThanOrEqualTo(orgExamSuiteQu.getPriceEnd());
				}else if(orgExamSuiteQu.getPriceStart()!=null&&orgExamSuiteQu.getPriceEnd()==null){
					criteria.andExamSuitePriceGreaterThanOrEqualTo(orgExamSuiteQu.getPriceStart());
				}
				if(orgExamSuiteQu.getInputCode()!=null){
					criteria.andExamSuiteInputCodeEqualTo(orgExamSuiteQu.getInputCode());
				}
				//套餐类型过滤
				OrganizationExamSuiteTypeExample exampleType=new OrganizationExamSuiteTypeExample();
				br.crm.pojo.suite.OrganizationExamSuiteTypeExample.Criteria criteriaType=exampleType.createCriteria();
				criteriaType.andExamSuiteTypeStatusEqualTo(0);
				if(orgExamSuiteQu.getSuiteTypeId()!=null){
					criteriaType.andExamTypeIdEqualTo(orgExamSuiteQu.getSuiteTypeId());
				}
				//TODO 获取套餐类型信息
				List<OrganizationExamSuiteType> organizationExam=organizationExamSuiteTypeMapper.selectByExample(exampleType);
				String suiteTypeList=null;
				if(orgExamSuiteQu.getSuiteTypeId()!=null&&CollectionUtils.isNotEmpty(organizationExam)){
					continue; 
				}else if(orgExamSuiteQu.getSuiteTypeId()==null&&CollectionUtils.isNotEmpty(organizationExam)){
					for(OrganizationExamSuiteType type:organizationExam){//查看套餐类型name
						//TODO redis  套餐类型
						DictExamSuiteType dictExamSuiteType=dictExamSuiteTypeMapper.selectByPrimaryKey(type.getExamSuiteTypeId());
						if(dictExamSuiteType!=null&&dictExamSuiteType.getExamTypeName()!=null){
							suiteTypeList=suiteTypeList+dictExamSuiteType.getExamTypeName()+" ";
						}
					}
				}
				OrgExamSuiteVo suiteVo=new OrgExamSuiteVo();
				OrganizationExamSuite suite;
				if(systemConfigService.getRedis()){
					suite= orgExamSuiteRedis.getOrgExamSuiteById(obSuite.getSuiteId());
				}else{
					suite=organizationExamSuiteMapper.selectByPrimaryKey(obSuite.getSuiteId());
				} 
				
				try {
					BeanUtils.copyProperties(suiteVo, suite);
				} catch (IllegalAccessException e) { 
					e.printStackTrace(); 
				} catch (InvocationTargetException e) { 
					e.printStackTrace();
				}
				list.add(suiteVo);
				} 
			}
		PageInfo<OrgExamSuiteVo> pageInfo = new PageInfo<OrgExamSuiteVo>(list);
		return pageInfo;
	}

	/**
	 * 
	 * <p>
	 * Title: getBranchSuiteById
	 * </p>
	 * <p>
	 * Description: 根据id查看绑定套餐信息
	 * </p>
	 * 
	 * @param orgBranchSuiteId
	 *            门店绑定套餐id
	 * @return
	 * @see br.crm.service.org.OrgBranchSuiteService#getBranchSuiteById(java.lang.String)
	 */
	@Override
	public OrgExamSuiteVo getBranchSuiteById(String orgBranchSuiteId) { 
		OrgExamSuiteVo  oesv = organizationBranchSuiteSelfMapper.selectByPrimaryKey(orgBranchSuiteId);
			if (oesv != null & oesv.getOrgExamSuiteTypeVo().size() > 0) {
				StringBuffer nameList = new StringBuffer();
				for (OrgExamSuiteTypeVo ostv : oesv.getOrgExamSuiteTypeVo()) {
					nameList.append(ostv.getExamTypeName() + " ");
				}
				oesv.setTypeNameList(nameList.toString());
			} 
		return oesv;
	}

	/**
	 * 
	 * <p>
	 * Title: updateOrgBranchSuite
	 * </p>
	 * <p>
	 * Description: 修改门店套餐信息
	 * </p>
	 * 
	 * @param orgBranchSuite
	 *            门店套餐信息
	 * @return
	 * @see br.crm.service.org.OrgBranchSuiteService#updateOrgBranchSuite(br.crm.pojo.org.OrganizationBranchSuite)
	 */
	@Override
	public int updateOrgBranchSuite(OrganizationBranchSuite orgBranchSuite) {
			
		if(systemConfigService.getRedis()){
			orgBranchSuiteRedis.updateOrgBranchSuite(orgBranchSuite);
		} 
		return organizationBranchSuiteMapper.updateByPrimaryKeySelective(orgBranchSuite);
	}

	/**
	 * 插入门店套餐信息
	 * <p>
	 * Title: insertBranchSuite
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgBranchSuite
	 *            绑定套餐信息
	 * @param suiteIds
	 *            已选择的套餐id
	 * @return
	 * @see br.crm.service.org.OrgBranchSuiteService#insertBranchSuite(br.crm.pojo.org.OrganizationBranchSuite, java.lang.String)
	 */
	@Override
	public int insertBranchSuite(OrganizationBranchSuite orgBranchSuite, String suiteIds) {

		if (suiteIds != null) {
			int r = 0;Boolean redis=systemConfigService.getRedis();
			String[] sourceStrArray = suiteIds.split(",");
			for (int i = 0; i < sourceStrArray.length; i++) {
				orgBranchSuite.setSuiteId(String.valueOf(sourceStrArray[i]));
				orgBranchSuite.setBranchSuiteId(UUIDUtils.getId());
				int y = organizationBranchSuiteMapper.insertSelective(orgBranchSuite);
				if (y > 0) {
					r++;
				}
				if(redis){
					orgBranchSuiteRedis.insertOrgBranchSuite(orgBranchSuite);
				} 
			}
			return r;
		}
		return 0;
	} 
	/**
	 * 
	* <p>Title: getOrgBranchBySuiteId</p> 
	* <p>Description: 根据套餐获id取门店信息</p> 
	* @param examSuiteId
	* @return 
	* @see br.crm.service.suite.OrgBranchSuiteService#getOrgBranchBySuiteId(java.lang.String)
	 */
	@Override
	public List<OrganizationBranchVo> getOrgBranchBySuiteId(String examSuiteId) {
		if(systemConfigService.getRedis()){
			return orgBranchSuiteRedis.getOrgBranchSuiteBySuiteId(examSuiteId);
		}
		List<OrganizationBranchVo> result = new ArrayList<OrganizationBranchVo>();
		OrganizationBranchSuiteExample example=new OrganizationBranchSuiteExample();
		example.createCriteria().andStatusEqualTo(0);
		example.createCriteria().andSuiteIdEqualTo(examSuiteId);
		example.setOrderByClause("createtime desc");
		List<OrganizationBranchSuite> list=organizationBranchSuiteMapper.selectByExample(example);
		for(OrganizationBranchSuite orgBranchSuite:list){
			OrganizationBranchVo orgBranchVo = new OrganizationBranchVo();
			OrganizationBranch branch =organizationBranchMapper.selectByPrimaryKey(orgBranchSuite.getBranchId());
			DictArea dictArea=dictAreaMapper.selectByPrimaryKey(branch.getBranchAreaId()); 
			try {
				BeanUtils.copyProperties(orgBranchVo, branch);
			} catch (IllegalAccessException e) { 
				e.printStackTrace();
			} catch (InvocationTargetException e) { 
				e.printStackTrace();
			}
			orgBranchVo.setDictArea(dictArea); 
			result.add(orgBranchVo);
		} 
		return result;
	}
	
	/**
	* <p>Title: getOrgBranchSuiteByBranchId</p> 
	* <p>Description: 根据门店id查看套餐 </p> 
	* @param branchId
	* @return 
	* @see br.crm.service.suite.OrgBranchSuiteService#getOrgBranchSuiteByBranchId(java.lang.String) 
	*/
	@Override
	public List<OrgExamSuiteVo> getOrgBranchSuiteByBranchId(String branchId) {
		if(systemConfigService.getRedis()){
			return orgBranchSuiteRedis.getOrgBranchSuiteByBranchId(branchId);
		}
		List<OrgExamSuiteVo> result = new ArrayList<OrgExamSuiteVo>();
		OrganizationBranchSuiteExample example=new OrganizationBranchSuiteExample();
		example.createCriteria().andStatusEqualTo(0);
		example.createCriteria().andSuiteIdEqualTo(branchId);
		example.setOrderByClause("createtime desc");
		List<OrganizationBranchSuite> list=organizationBranchSuiteMapper.selectByExample(example);
		
		for(OrganizationBranchSuite orgBranchSuite:list){
			OrgExamSuiteVo orgSuiteVo = new OrgExamSuiteVo();
			OrganizationExamSuite suite =organizationExamSuiteMapper.selectByPrimaryKey(orgBranchSuite.getSuiteId());
			
			OrganizationExamSuiteTypeExample exampleType=new OrganizationExamSuiteTypeExample();
			exampleType.createCriteria().andExamSuiteTypeStatusEqualTo(0);
			exampleType.createCriteria().andExamSuiteIdEqualTo(orgBranchSuite.getBranchSuiteId());
			exampleType.setOrderByClause("exam_suite_type_create_time desc");
			List<OrganizationExamSuiteType> orgSuiteTypesList=organizationExamSuiteTypeMapper.selectByExample(exampleType);
			
			try {
					BeanUtils.copyProperties(orgSuiteVo, suite);
				} catch (IllegalAccessException e) { 
					e.printStackTrace();
				} catch (InvocationTargetException e) { 
					e.printStackTrace();
			}
			if(!orgSuiteTypesList.isEmpty()){
				for(OrganizationExamSuiteType type:orgSuiteTypesList){  
					DictExamSuiteType suiteType=dictExamSuiteTypeMapper.selectByPrimaryKey(type.getExamTypeId());
					orgSuiteVo.setTypeNameList(orgSuiteVo.getTypeNameList()+suiteType.getExamTypeName()+" ");
				}
			} 
			result.add(orgSuiteVo);
		} 
		return result; 
	 
	}

	/**
	* <p>Title: getAllOrgBranchSuiteByExample</p> 
	* <p>Description: </p> 
	* @param organizationBranchSuiteExample
	* @return 
	* @see br.crm.service.suite.OrgBranchSuiteService#getAllOrgBranchSuiteByExample(br.crm.pojo.suite.OrganizationBranchSuiteExample) 
	*/
	@Override
	public List<OrganizationBranchSuite> getAllOrgBranchSuiteByExample() {
		// TODO Auto-generated method stub
		OrganizationBranchSuiteExample example = new OrganizationBranchSuiteExample();
		example.createCriteria().andStatusEqualTo(0);
		return organizationBranchSuiteMapper.selectByExample(example); 
	}

	

}
