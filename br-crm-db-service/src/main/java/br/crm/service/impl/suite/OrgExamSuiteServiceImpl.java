package br.crm.service.impl.suite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.customer.order.self.CustomerOrderCartSelfMapper;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.suite.OrganizationExamSuiteFeeItemMapper;
import br.crm.mapper.suite.OrganizationExamSuiteHidMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.mapper.suite.OrganizationExamSuiteTypeMapper;
import br.crm.mapper.suite.self.OrgExamFeeItemSuiteSelfMapper;
import br.crm.mapper.suite.self.OrganizationExamSuiteSelfMapper;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.org.DictHighIncidenceDisease;
import br.crm.pojo.org.Organization;
import br.crm.pojo.org.OrganizationExample;
import br.crm.pojo.org.OrganizationLevel;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuiteFeeItemExample;
import br.crm.pojo.suite.OrganizationExamSuiteHid;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.pojo.suite.OrganizationExamSuiteType;
import br.order.redis.redis.RedisService;
import br.crm.service.suite.OrgExamSuiteService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.examfeeitem.OrgExamFeeItemVo;
import br.crm.vo.suite.OrgExamSuiteHidVo;
import br.crm.vo.suite.OrgExamSuiteImgVo;
import br.crm.vo.suite.OrgExamSuiteQu;
import br.crm.vo.suite.OrgExamSuiteTypeVo;
import br.crm.vo.suite.OrgExamSuiteVo;

/**
 * 套餐信息
 * 
 * @ClassName: OrgExamSuiteServiceImpl
 * @Description: TODO
 * @author kangting
 * @date 2016年9月13日 下午3:20:37
 *
 */
@Service
public class OrgExamSuiteServiceImpl implements OrgExamSuiteService {

	@Autowired
	private OrganizationExamSuiteMapper orgExamSuiteMapper;
	
	@Autowired
	private OrganizationExamSuiteSelfMapper orgExamSuiteSelfMapper;
	
	@Autowired
	private OrganizationExamSuiteHidMapper organizationExamSuiteHidMapper;
	
	@Autowired
	private OrganizationExamSuiteTypeMapper organizationExamSuiteTypeMapper;
	
	@Autowired
	private OrganizationExamSuiteFeeItemMapper organizationExamFeeItemSuiteMapper;
	
	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;
	
	@Autowired
	private OrganizationMapper organizationMapper;
	
	@Autowired
	private DictImgMapper dictImgMapper;

	@Autowired
	private RedisService redisService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private CustomerOrderCartSelfMapper customerOrderCartSelfMapper;
	


	/**
	 * 
	 * <p>
	 * Title: getOrgExamSuite
	 * </p>
	 * <p>
	 * Description: 套餐列表
	 * </p>
	 * 
	 * @param page
	 *            当前页
	 * @param rows
	 *            每页显示条数
	 * @param orgExamSuiteQu
	 *            参数
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteService#getOrgExamSuite(java.lang.Integer,
	 *      java.lang.Integer, br.crm.vo.org.OrgExamSuiteQu)
	 */
	@Override
	public PageInfo<OrgExamSuiteVo> getOrgExamSuite(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu) {
		PageHelper.startPage(page, rows);
		List<OrgExamSuiteVo> list = orgExamSuiteSelfMapper.selectByParam(orgExamSuiteQu);
		for (OrgExamSuiteVo oesv : list) {
			if (oesv != null & oesv.getOrgExamSuiteTypeVo().size() > 0) {
				StringBuffer nameList = new StringBuffer();
				for (OrgExamSuiteTypeVo ostv : oesv.getOrgExamSuiteTypeVo()) {
					nameList.append(ostv.getExamTypeName() + " ");
				}
				oesv.setTypeNameList(nameList.toString());
			}

		}
		PageInfo<OrgExamSuiteVo> pageInfo = new PageInfo<OrgExamSuiteVo>(list);
		return pageInfo;
	}

	/**
	 * 
	 * <p>
	 * Title: updateOrgExamSuite
	 * </p>
	 * <p>
	 * Description: 修改套餐
	 * </p>
	 * 
	 * @param orgExamSuiteVo1
	 *            套餐信息
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteService#updateOrgExamSuite(br.crm.vo.suite.OrgExamSuiteVo)
	 */
	@Override
	public int updateOrgExamSuite(OrgExamSuiteVo orgExamSuiteVo1) {
		orgExamSuiteVo1.setExamSuiteEditTime(new Date());
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			redisService.set(RedisConstant.br_order_orgExamSuite_suiteId.concat(orgExamSuiteVo1.getExamSuiteId()), JSONObject.toJSONString(orgExamSuiteVo1));
		}
		int r = orgExamSuiteMapper.updateByPrimaryKeySelective(orgExamSuiteVo1);
		OrgExamSuiteVo orgExamSuiteVo = orgExamSuiteSelfMapper.selectByPrimaryKey(orgExamSuiteVo1.getExamSuiteId());
		if (r > 0 && orgExamSuiteVo != null) {
			// 删除高发疾病
			if (orgExamSuiteVo.getOrgExamSuiteHidVo() != null && orgExamSuiteVo.getOrgExamSuiteHidVo().size() > 0) {
				OrganizationExamSuiteHid orgExamSuiteHid = new OrganizationExamSuiteHid();
				orgExamSuiteHid.setOesHidStatus(1);
				orgExamSuiteHid.setOesHidEditTime(new Date());
				for (OrgExamSuiteHidVo hid : orgExamSuiteVo.getOrgExamSuiteHidVo()) {
					orgExamSuiteHid.setOesHidId(hid.getOesHidId());
					if(redis){
						redisService.delete(RedisConstant.br_order_orgExamSuiteHid_id.concat(hid.getOesHidId()));						
					}
					organizationExamSuiteHidMapper.updateByPrimaryKeySelective(orgExamSuiteHid);
				}
			}
			// 删除类型
			if (orgExamSuiteVo.getOrgExamSuiteTypeVo() != null && orgExamSuiteVo.getOrgExamSuiteTypeVo().size() > 0) {
				OrganizationExamSuiteType organizationExamSuiteType = new OrganizationExamSuiteType();
				organizationExamSuiteType.setExamSuiteTypeStatus(1);
				organizationExamSuiteType.setExamSuiteTypeEditTime(new Date());
				for (OrgExamSuiteTypeVo type : orgExamSuiteVo.getOrgExamSuiteTypeVo()) {
					organizationExamSuiteType.setExamSuiteTypeId(type.getExamSuiteTypeId());
					if(redis){
						redisService.delete(RedisConstant.br_order_orgExamSuiteType_id.concat(type.getExamSuiteTypeId()));						
					}
					organizationExamSuiteTypeMapper.updateByPrimaryKeySelective(organizationExamSuiteType);
				}
			}
			// 删除图片
			if (orgExamSuiteVo.getOrgExamSuiteImgVo() != null && orgExamSuiteVo.getOrgExamSuiteImgVo().size() > 0) {
				OrganizationExamSuiteImg orgStuiteImg = new OrganizationExamSuiteImg();
				orgStuiteImg.setOrgExamSuiteEditTime(new Date());
				orgStuiteImg.setOrgExamSuiteStatus(1);
				for (OrgExamSuiteImgVo img : orgExamSuiteVo.getOrgExamSuiteImgVo()) {
					orgStuiteImg.setOrgExamSuiteImgId(img.getOrgExamSuiteImgId());
					if(redis){
						redisService.delete(RedisConstant.br_order_orgExamSuiteImg_id.concat(orgStuiteImg.getOrgExamSuiteImgId()));
					}
					organizationExamSuiteImgMapper.updateByPrimaryKeySelective(orgStuiteImg);
				}
			}
		}
		if (r > 0) {
			if (orgExamSuiteVo1.getHighIncidenceDiseaseList() != null && orgExamSuiteVo1.getHighIncidenceDiseaseList().size() > 0) {
				OrganizationExamSuiteHid orgExamSuiteHid = new OrganizationExamSuiteHid();
				orgExamSuiteHid.setOesHidStatus(0);
				orgExamSuiteHid.setOesHidCreateTime(new Date());
				orgExamSuiteHid.setOesHidEditTime(orgExamSuiteHid.getOesHidCreateTime());
				orgExamSuiteHid.setExamSuiteId(orgExamSuiteVo.getExamSuiteId());
				for (String hidId : orgExamSuiteVo1.getHighIncidenceDiseaseList()) {
					orgExamSuiteHid.setHighIncidenceDiseaseId(hidId);
					orgExamSuiteHid.setOesHidId(UUIDUtils.getId());
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteHid_id.concat(orgExamSuiteHid.getOesHidId()), JSONObject.toJSONString(orgExamSuiteHid));
					}
					organizationExamSuiteHidMapper.insertSelective(orgExamSuiteHid);
				}
			}
			if (orgExamSuiteVo1.getTypeList() != null && orgExamSuiteVo1.getTypeList().size() > 0) {
				OrganizationExamSuiteType organizationExamSuiteType = new OrganizationExamSuiteType();
				organizationExamSuiteType.setExamSuiteTypeCreateTime(new Date());
				organizationExamSuiteType.setExamSuiteTypeStatus(0);
				organizationExamSuiteType.setExamSuiteTypeEditTime(organizationExamSuiteType.getExamSuiteTypeCreateTime());
				organizationExamSuiteType.setExamSuiteId(orgExamSuiteVo.getExamSuiteId());
				for (String typeId : orgExamSuiteVo1.getTypeList()) {
					organizationExamSuiteType.setExamTypeId(typeId);
					organizationExamSuiteType.setExamSuiteTypeId(UUIDUtils.getId());
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteType_id.concat(organizationExamSuiteType.getExamSuiteTypeId()), JSONObject.toJSONString(organizationExamSuiteType));
					}					
					organizationExamSuiteTypeMapper.insertSelective(organizationExamSuiteType);
				}
			}
			if (orgExamSuiteVo1.getOrgSuiteImgs() != null) {
				String[] sourceStrArray = orgExamSuiteVo1.getOrgSuiteImgs().split(",");
				OrganizationExamSuiteImg orgStuiteImg = new OrganizationExamSuiteImg();
				orgStuiteImg.setOrgExamSuiteCreateTime(new Date());
				orgStuiteImg.setOrgExamSuiteEditTime(orgStuiteImg.getOrgExamSuiteCreateTime());
				orgStuiteImg.setOrgExamSuiteStatus(0);
				orgStuiteImg.setOrgId(orgExamSuiteVo.getOrgId());
				orgStuiteImg.setOrgExamSuiteId(orgExamSuiteVo1.getExamSuiteId());
				for (int i = 0; i < sourceStrArray.length; i++) {
					if(i==1){
						orgStuiteImg.setOrgExamSuiteImgType(0);
					}else{
						orgStuiteImg.setOrgExamSuiteImgType(1);
					}
					orgStuiteImg.setOrgExamSuiteImgId(UUIDUtils.getId());
					orgStuiteImg.setDictImgId(Long.valueOf(sourceStrArray[i]));
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteImg_id.concat(orgStuiteImg.getOrgExamSuiteImgId()), JSONObject.toJSONString(orgStuiteImg));
					}					
					organizationExamSuiteImgMapper.insertSelective(orgStuiteImg);
				}
			}
		}
		return r;
	}

	/**
	 * 插入套餐
	 * <p>
	 * Title: intertOrgExamSuite
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param orgExamSuiteVo
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteService#intertOrgExamSuite(br.crm.vo.suite.OrgExamSuiteVo)
	 */
	@Override
	public int insertOrgExamSuite(OrgExamSuiteVo orgExamSuiteVo) {
		orgExamSuiteVo.setExamSuiteStatus(0);
		orgExamSuiteVo.setExamSuiteCreateTime(new Date());
		orgExamSuiteVo.setExamSuiteEditTime(orgExamSuiteVo.getExamSuiteCreateTime());
		orgExamSuiteVo.setExamSuiteId(UUIDUtils.getId());
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			redisService.set(RedisConstant.br_order_orgExamSuite_suiteId.concat(orgExamSuiteVo.getExamSuiteId()), JSONObject.toJSONString(orgExamSuiteVo));
		}		
		int r = orgExamSuiteSelfMapper.insert(orgExamSuiteVo);
		if (r > 0) {
			// 套餐高发疾病
			if (orgExamSuiteVo.getHighIncidenceDiseaseList() != null && orgExamSuiteVo.getHighIncidenceDiseaseList().size() > 0) {
				OrganizationExamSuiteHid orgExamSuiteHid = new OrganizationExamSuiteHid();

				orgExamSuiteHid.setOesHidStatus(0);
				orgExamSuiteHid.setOesHidCreateTime(new Date());
				orgExamSuiteHid.setOesHidEditTime(orgExamSuiteHid.getOesHidCreateTime());
				orgExamSuiteHid.setExamSuiteId(orgExamSuiteVo.getExamSuiteId());
				for (String hidId : orgExamSuiteVo.getHighIncidenceDiseaseList()) {
					orgExamSuiteHid.setHighIncidenceDiseaseId(hidId);
					orgExamSuiteHid.setOesHidId(UUIDUtils.getId());
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteHid_id.concat(hidId), JSONObject.toJSONString(orgExamSuiteVo));
					}
					organizationExamSuiteHidMapper.insertSelective(orgExamSuiteHid);
				}

			}
			// 套餐类型
			if (orgExamSuiteVo.getTypeList() != null && orgExamSuiteVo.getTypeList().size() > 0) {
				OrganizationExamSuiteType organizationExamSuiteType = new OrganizationExamSuiteType();
				organizationExamSuiteType.setExamSuiteTypeCreateTime(new Date());
				organizationExamSuiteType.setExamSuiteTypeStatus(0);
				organizationExamSuiteType.setExamSuiteTypeEditTime(organizationExamSuiteType.getExamSuiteTypeCreateTime());
				organizationExamSuiteType.setExamSuiteId(orgExamSuiteVo.getExamSuiteId());
				for (String typeId : orgExamSuiteVo.getTypeList()) {
					organizationExamSuiteType.setExamTypeId(typeId);
					organizationExamSuiteType.setExamSuiteTypeId(UUIDUtils.getId());
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteType_id.concat(organizationExamSuiteType.getExamSuiteTypeId()), JSONObject.toJSONString(organizationExamSuiteType));
					}
					organizationExamSuiteTypeMapper.insertSelective(organizationExamSuiteType);
				}
			}
			// 套餐图片保存
			if (orgExamSuiteVo.getOrgSuiteImgs() != null) {
				String[] sourceStrArray = orgExamSuiteVo.getOrgSuiteImgs().split(",");
				OrganizationExamSuiteImg orgStuiteImg = new OrganizationExamSuiteImg();
				orgStuiteImg.setOrgExamSuiteCreateTime(new Date());
				orgStuiteImg.setOrgExamSuiteEditTime(orgStuiteImg.getOrgExamSuiteCreateTime());
				orgStuiteImg.setOrgExamSuiteStatus(0);
				orgStuiteImg.setOrgId(orgExamSuiteVo.getOrgId());
				orgStuiteImg.setOrgExamSuiteId(orgExamSuiteVo.getExamSuiteId());
				
				for (int i = 0; i < sourceStrArray.length; i++) {
					if(i==0){
						orgStuiteImg.setOrgExamSuiteImgType(0);
					}else{
						orgStuiteImg.setOrgExamSuiteImgType(1);
					}
					orgStuiteImg.setOrgExamSuiteImgId(UUIDUtils.getId());
					orgStuiteImg.setDictImgId(Long.valueOf(sourceStrArray[i]));
					if(redis){
						redisService.set(RedisConstant.br_order_orgExamSuiteImg_id.concat(orgStuiteImg.getOrgExamSuiteImgId()), JSONObject.toJSONString(orgStuiteImg));
					}
					
					organizationExamSuiteImgMapper.insertSelective(orgStuiteImg);
				}
			}
		}
		return r;
	}

	/**
	 * 
	 * <p>
	 * Title: getOrgExamSuiteById
	 * </p>
	 * <p>
	 * Description: 根据id查看套餐信息
	 * </p>
	 * 
	 * @param idOrgExamSuite
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteService#getOrgExamSuiteById(java.lang.String)
	 */
	@Override
	public OrgExamSuiteVo getOrgExamSuiteById(String idOrgExamSuite) {
		OrgExamSuiteVo oesv;
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			return JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgExamSuite_suiteId.concat(idOrgExamSuite)), OrgExamSuiteVo.class);
		}
		else{
			oesv = orgExamSuiteSelfMapper.selectByPrimaryKey(idOrgExamSuite);
			if (oesv != null & oesv.getOrgExamSuiteTypeVo().size() > 0) {
				StringBuffer nameList = new StringBuffer();
				for (OrgExamSuiteTypeVo ostv : oesv.getOrgExamSuiteTypeVo()) {
					nameList.append(ostv.getExamTypeName() + " ");
				}
				oesv.setTypeNameList(nameList.toString());
				
		}
			return oesv;
		}
		
	}

	/**
	 * <p>
	 * Title: delectOrgExamSuite
	 * </p>
	 * <p>
	 * Description: 删除套餐信息
	 * </p>
	 * 
	 * @param idOrgExamSuite
	 *            套餐id
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteService#delectOrgExamSuite(java.lang.String)
	 */
	@Override
	public int delectOrgExamSuite(String idOrgExamSuite) {
		OrganizationExamSuiteFeeItemExample example = new OrganizationExamSuiteFeeItemExample();
		br.crm.pojo.suite.OrganizationExamSuiteFeeItemExample.Criteria criteria = example.createCriteria();
		criteria.andExamSuiteIdEqualTo(idOrgExamSuite);
		int r = organizationExamFeeItemSuiteMapper.countByExample(example);
		if (r <= 0) {
			OrganizationExamSuite OrgExamSuite = new OrganizationExamSuite();
			OrgExamSuite.setExamSuiteStatus(1);
			OrgExamSuite.setExamSuiteEditTime(new Date());
			OrgExamSuite.setExamSuiteId(idOrgExamSuite);
			redisService.delete(RedisConstant.br_order_orgExamSuite_suiteId.concat(idOrgExamSuite));
			r = orgExamSuiteMapper.updateByPrimaryKeySelective(OrgExamSuite);
			OrgExamSuiteVo orgExamSuiteVo = orgExamSuiteSelfMapper.selectByPrimaryKey(idOrgExamSuite);
			if (r > 0 && orgExamSuiteVo != null) {
				// 删除高发疾病
				if (orgExamSuiteVo.getOrgExamSuiteHidVo() != null && orgExamSuiteVo.getOrgExamSuiteHidVo().size() > 0) {
					OrganizationExamSuiteHid orgExamSuiteHid = new OrganizationExamSuiteHid();
					orgExamSuiteHid.setOesHidStatus(1);
					orgExamSuiteHid.setOesHidEditTime(new Date());
					for (OrgExamSuiteHidVo hid : orgExamSuiteVo.getOrgExamSuiteHidVo()) {
						orgExamSuiteHid.setOesHidId(hid.getOesHidId());
						redisService.delete(RedisConstant.br_order_orgExamSuiteHid_id.concat(hid.getOesHidId()));

						organizationExamSuiteHidMapper.updateByPrimaryKeySelective(orgExamSuiteHid);
					}
				}
				// 删除套餐类型
				if (orgExamSuiteVo.getOrgExamSuiteTypeVo() != null && orgExamSuiteVo.getOrgExamSuiteTypeVo().size() > 0) {
					OrganizationExamSuiteType organizationExamSuiteType = new OrganizationExamSuiteType();
					organizationExamSuiteType.setExamSuiteTypeStatus(1);
					organizationExamSuiteType.setExamSuiteTypeEditTime(new Date());
					for (OrgExamSuiteTypeVo type : orgExamSuiteVo.getOrgExamSuiteTypeVo()) {
						organizationExamSuiteType.setExamSuiteTypeId(type.getExamSuiteTypeId());
						redisService.delete(RedisConstant.br_order_orgExamSuiteType_id.concat(type.getExamSuiteTypeId()));
						organizationExamSuiteTypeMapper.updateByPrimaryKeySelective(organizationExamSuiteType);
					}
				}
				// 删除图片
				if (orgExamSuiteVo.getOrgExamSuiteImgVo() != null && orgExamSuiteVo.getOrgExamSuiteImgVo().size() > 0) {
					OrganizationExamSuiteImg orgStuiteImg = new OrganizationExamSuiteImg();
					orgStuiteImg.setOrgExamSuiteEditTime(new Date());
					orgStuiteImg.setOrgExamSuiteStatus(1);
					for (OrgExamSuiteImgVo img : orgExamSuiteVo.getOrgExamSuiteImgVo()) {
						orgStuiteImg.setOrgExamSuiteImgId(img.getOrgExamSuiteImgId());
						redisService.delete(RedisConstant.br_order_orgExamSuiteImg_id.concat(orgStuiteImg.getOrgExamSuiteImgId()));
						organizationExamSuiteImgMapper.updateByPrimaryKeySelective(orgStuiteImg);
					}
				}
			}
			return r;
		} else {
			return -1;
		}
	} 
	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: searchSuite
	 * </p>
	 * <p>
	 * Description:用户首页搜索套餐
	 * </p>
	 * 
	 * @param page
	 *            当前页码
	 * @param rows
	 *            显示的条数
	 * @param orgExamSuiteQu
	 * @return
	 * @see br.crm.service.suite.OrgExamSuiteService#searchSuite(java.lang.Integer,
	 *      java.lang.Integer, br.crm.vo.suite.OrgExamSuiteQu)
	 */
	@Override
	public PageInfo<OrgExamSuiteVo> searchSuite(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu) {
		List<OrgExamSuiteVo> resultList = new ArrayList<OrgExamSuiteVo>();
		PageHelper.startPage(page, rows);
		OrganizationExamSuiteExample example = new OrganizationExamSuiteExample();
		OrganizationExamSuiteExample.Criteria criteria = example.createCriteria();
		criteria.andExamSuiteStatusEqualTo(0);

		List<String> orgExamSuiteIdSearchList = new ArrayList<String>();
		List<String> orgIdSearchList = new ArrayList<String>();

		if (null != orgExamSuiteQu) {
			// 1.1用户搜索套餐类别
			if (StringUtils.isNotEmpty(orgExamSuiteQu.getSuiteTypeId())) {
				String jsonOrgExamSuiteList = redisService.get(RedisConstant.br_order_orgExamSuiteType_typeId.concat(orgExamSuiteQu.getSuiteTypeId().toString()));
				if (StringUtils.isNotBlank(jsonOrgExamSuiteList)) {
					List<String> orgExamSuiteIdList = JSONObject.parseArray(jsonOrgExamSuiteList, String.class);
					orgExamSuiteIdSearchList.addAll(orgExamSuiteIdList);
				}
			}
			// 2.1用户选择机构类型
			if (StringUtils.isNotEmpty(orgExamSuiteQu.getHospitalType())) {//2：医院，1：体检机构
				Integer orgType = Integer.valueOf(orgExamSuiteQu.getHospitalType());
				if(orgType.intValue()==2|| orgType.intValue() == 1){
					OrganizationExample organizationExample = new OrganizationExample();
					br.crm.pojo.org.OrganizationExample.Criteria criteriaOrg = organizationExample.createCriteria();
					criteriaOrg.andOrgStatusEqualTo(0);
					criteriaOrg.andOrgNatureEqualTo(orgType);
					if(orgType.intValue() == 2){
						// 2.2用户选择医院等级
						if (StringUtils.isNotEmpty(orgExamSuiteQu.getOrgLevel())) {
							criteriaOrg.andOrgLevelIdEqualTo(Integer.valueOf(orgExamSuiteQu.getOrgLevel()));
						}
					}
					List<Organization> orgList = organizationMapper.selectByExample(organizationExample);
					if (CollectionUtils.isNotEmpty(orgList)) {
						for (Organization organization : orgList) {
							orgIdSearchList.add(organization.getOrgId());
						}
					}
				}
			}
			// 1.3用户搜索高发疾病
			if (StringUtils.isNotEmpty(orgExamSuiteQu.getHighDisease())) {
				String jsonSuiteHid = redisService.get(RedisConstant.br_order_orgExamSuiteHid_Hid + orgExamSuiteQu.getHighDisease());
				if (StringUtils.isNotEmpty(jsonSuiteHid)) {
					List<String> hidArray = JSONObject.parseArray(jsonSuiteHid, String.class);
					if (CollectionUtils.isNotEmpty(hidArray)) {
						orgExamSuiteIdSearchList.addAll(hidArray);
					}
				}

			}
			// 1.4用户搜索价位 ---开始价格
			if (null != orgExamSuiteQu.getPriceStart()) {
				criteria.andExamSuiteDiscountPriceGreaterThanOrEqualTo(orgExamSuiteQu.getPriceStart());
			}
			// 1.4.1用户搜索价位 ---结束价格
			if (null != orgExamSuiteQu.getPriceEnd()) {
				criteria.andExamSuiteDiscountPriceLessThanOrEqualTo(orgExamSuiteQu.getPriceEnd());
			}

			// 1.5用户性别搜索
			if (null != orgExamSuiteQu.getExamSuiteSex() && StringUtils.isNotEmpty(orgExamSuiteQu.getExamSuiteSex().toString())) {

				if (orgExamSuiteQu.getExamSuiteSex().intValue() == 1) { // 男性 1

					criteria.andExamSuiteMaleEqualTo(0);

				} else if (orgExamSuiteQu.getExamSuiteSex().intValue() == 2) {// 女性
																				// 2

					criteria.andExamSuiteFemaleEqualTo(0);

				} else {// 通用3

					criteria.andExamSuiteMaleEqualTo(0).andExamSuiteFemaleEqualTo(0);
				}

			}
			// 1.6用户搜索关键词
			if (StringUtils.isNotEmpty(orgExamSuiteQu.getKeyword())) {

				criteria.andExamSuiteNameLike("%" + orgExamSuiteQu.getKeyword() + "%");
			}

		}
		if (CollectionUtils.isNotEmpty(orgIdSearchList)||StringUtils.isNotEmpty(orgExamSuiteQu.getHospitalType())) {
			criteria.andOrgIdIn(orgIdSearchList);
		}
		if (CollectionUtils.isNotEmpty(orgExamSuiteIdSearchList)) {
			criteria.andExamSuiteIdIn(orgExamSuiteIdSearchList);
		}
		List<OrganizationExamSuite> list = orgExamSuiteMapper.selectByExample(example);
		// 1.1 套餐表和套餐类型表
		if (CollectionUtils.isNotEmpty(list)) {
			for (OrganizationExamSuite organizationExamSuite : list) {

				OrgExamSuiteVo result = new OrgExamSuiteVo();
				try {
					BeanUtils.copyProperties(result, organizationExamSuite);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Redis中取套餐类型表 套餐ID
				if (redisService.exists(RedisConstant.br_order_orgExamSuiteType_suiteId + organizationExamSuite.getExamSuiteId())) {

					String str = redisService.get(RedisConstant.br_order_orgExamSuiteType_suiteId + organizationExamSuite.getExamSuiteId());

					List<String> array = JSONObject.parseArray(str, String.class);

					if (CollectionUtils.isNotEmpty(array)) {
						for (String examTypeId : array) {
							// 取体检套餐类型对应表 -exam_type_id---id
							if (redisService.exists(RedisConstant.br_order_orgExamSuiteType_id + examTypeId)) {

								String st = redisService.get(RedisConstant.br_order_orgExamSuiteType_id + examTypeId);

								DictExamSuiteType dictExamSuiteType = JSONObject.parseObject(st, DictExamSuiteType.class);
								if (null != dictExamSuiteType) {
									result.getSuiteTypeName().add(dictExamSuiteType.getExamTypeName());
								}
							}
						}
					}

				}
				// 1.2从Redis中获取 机构类型
				if (StringUtils.isNotEmpty(organizationExamSuite.getOrgId())) {

					String jsonOrg = redisService.get(organizationExamSuite.getOrgId());

					Organization organization = JSONObject.parseObject(jsonOrg, Organization.class);

					if (null != organization) {
						// 根据机构的ID关联查询机构等级
						if (redisService.exists(RedisConstant.org_level_id + organization.getOrgLevelId())) {
							String level = redisService.get(RedisConstant.org_level_id + organization.getOrgLevelId());
							OrganizationLevel organizationLevel = JSONObject.parseObject(level, OrganizationLevel.class);
							if (null != organizationLevel) {
								result.setOrgLevelName(organizationLevel.getOrgLevelName());
							}
						}
					}
				}
				// 1.3从Redis中获取 体检套餐高发疾病对应表
				if (StringUtils.isNotEmpty(organizationExamSuite.getExamSuiteId())) {

					String jsonHid = redisService.get(RedisConstant.br_order_orgExamSuiteHid_suiteid_ + organizationExamSuite.getExamSuiteId());

					List<String> hidArray = JSONObject.parseArray(jsonHid, String.class);

					if (CollectionUtils.isNotEmpty(hidArray)) {

						for (String hidId : hidArray) {

							if (StringUtils.isNotEmpty(hidId)) {

								String jsonhid = redisService.get(RedisConstant.br_order_dict_hid_id + hidId);

								if (StringUtils.isNotBlank(jsonhid)) {

									DictHighIncidenceDisease dictHighIncidenceDisease = JSONObject.parseObject(jsonhid, DictHighIncidenceDisease.class);
									if (null != dictHighIncidenceDisease) {
										result.getHidName().add(dictHighIncidenceDisease.getHighIncidenceDiseaseName());
									}
								}
							}
						}
					}
				}
				// 1.4从Redis中获取图片
				if (StringUtils.isNotEmpty(organizationExamSuite.getExamSuiteId())) {
					// 查找中间表 套餐-图片
					String jsonImg = redisService.get(RedisConstant.br_order_orgExamSuiteImg_suiteId + organizationExamSuite.getExamSuiteId());

					if (StringUtils.isNotEmpty(jsonImg)) {

						List<Long> imgArray = JSONObject.parseArray(jsonImg, Long.class);

						if (CollectionUtils.isNotEmpty(imgArray)) {
							for (Long imgId : imgArray) {
								if (StringUtils.isNotEmpty(imgId.toString())) {
									DictImg img = dictImgMapper.selectByPrimaryKey(imgId);
									if (null != img) {
										result.setImgId(img.getImgId().toString());
										result.setExamSuiteImgUrl(img.getImgLocation());
									}
								}
							}
						}
					}
				}
				if(null==result.getExamSuiteDiscountPrice()||"".equals(result.getExamSuiteDiscountPrice())){
					result.setExamSuiteDiscountPrice(new BigDecimal(0));
				}
				if(null==result.getExamSuitePrice()||"".equals(result.getExamSuitePrice())){
					result.setExamSuitePrice(new BigDecimal(0));
				}
				resultList.add(result);
			}

		}
		PageInfo<OrgExamSuiteVo> pageInfo = new PageInfo<OrgExamSuiteVo>(resultList);
		PageInfo<OrganizationExamSuite> suiteListPageInfo = new PageInfo<OrganizationExamSuite>(list);
		pageInfo.setTotal(suiteListPageInfo.getTotal());
		pageInfo.setPages(suiteListPageInfo.getPages());
		pageInfo.setPageSize(suiteListPageInfo.getPageSize());
		return pageInfo;
	}

	/**
	 * <p>
	 * Title: getOrgExamSuiteLimitPeople
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @param orgExamSuiteQu
	 * @return
	 * @see br.crm.service.suite.OrgExamSuiteService#getOrgExamSuiteLimitPeople(java.lang.Integer,
	 *      java.lang.Integer, br.crm.vo.suite.OrgExamSuiteQu)
	 */
	@Override
	public PageInfo<OrganizationExamSuite> getOrgExamSuiteLimitPeople(Integer page, Integer rows, OrgExamSuiteQu orgExamSuiteQu) {
		PageHelper.startPage(page, rows);
		OrganizationExamSuiteExample example = new OrganizationExamSuiteExample();
		br.crm.pojo.suite.OrganizationExamSuiteExample.Criteria criteria = example.createCriteria();
		criteria.andExamSuiteStatusEqualTo(0);
		if (orgExamSuiteQu.getOrgId() != null) {
			criteria.andOrgIdEqualTo(orgExamSuiteQu.getOrgId());
		}
		if (orgExamSuiteQu.getExamSuiteName() != null) {
			criteria.andExamSuiteNameLike('%' + orgExamSuiteQu.getExamSuiteName() + '%');
		}
		if (orgExamSuiteQu.getExamSuiteCode() != null) {
			criteria.andExamSuiteCodeEqualTo(orgExamSuiteQu.getExamSuiteCode());
		}
		if (orgExamSuiteQu.getLimitPeopleStart() != null && orgExamSuiteQu.getLimitPeopleEnd() != null) {
			criteria.andExamSuiteLimitPeopleBetween(orgExamSuiteQu.getLimitPeopleStart(), orgExamSuiteQu.getLimitPeopleEnd());
		}
		if (orgExamSuiteQu.getLimitPeopleStart() != null && orgExamSuiteQu.getLimitPeopleEnd() == null) {
			criteria.andExamSuiteLimitPeopleGreaterThanOrEqualTo(orgExamSuiteQu.getLimitPeopleStart());
		}
		if (orgExamSuiteQu.getLimitPeopleStart() == null && orgExamSuiteQu.getLimitPeopleEnd() != null) {
			criteria.andExamSuiteLimitPeopleLessThanOrEqualTo(orgExamSuiteQu.getLimitPeopleEnd());
		}
		example.setOrderByClause("exam_suite_create_time desc");
		List<OrganizationExamSuite> list = orgExamSuiteMapper.selectByExample(example);
		PageInfo<OrganizationExamSuite> pageInfo = new PageInfo<OrganizationExamSuite>(list);
		return pageInfo;
	}

	/**
	 * <p>
	 * Title: updateOrgExamSuiteLimitPeople
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param suiteId
	 * @param limitPeople
	 * @return
	 * @see br.crm.service.suite.OrgExamSuiteService#updateOrgExamSuiteLimitPeople(java.lang.String,
	 *      java.lang.Integer)
	 */
	@Override
	public int updateOrgExamSuiteLimitPeople(String suiteId, Integer limitPeople,Integer warnPeople) {
		OrganizationExamSuite examSuite = new OrganizationExamSuite();
		examSuite.setExamSuiteId(suiteId);
		examSuite.setExamSuiteLimitPeople(limitPeople);
		examSuite.setExamSuiteWarnPeople(warnPeople);
		return orgExamSuiteMapper.updateByPrimaryKeySelective(examSuite);
	}


	@Override
	public List<OrganizationExamSuite> getAllOrgExamSuite() {
		return orgExamSuiteMapper.selectByExample(null);
	}

	@Override
	public Integer sumSuiteNum(String examSuiteId) {
		return customerOrderCartSelfMapper.sumSuiteNum(examSuiteId);
	}

}
