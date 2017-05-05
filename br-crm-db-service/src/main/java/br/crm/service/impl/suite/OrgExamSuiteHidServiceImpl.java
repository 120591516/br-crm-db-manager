package br.crm.service.impl.suite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.suite.OrganizationExamSuiteHidMapper;
import br.crm.pojo.suite.OrganizationExamSuiteHid;
import br.crm.pojo.suite.OrganizationExamSuiteHidExample;
import br.crm.service.suite.OrgExamSuiteHidService;
import br.order.redis.redis.RedisService;

/**
 * 
 * @ClassName: OrgExamSuiteHidServiceImpl
 * @Description: TODO F套餐高发疾病绑定信息
 * @author kangting
 * @date 2016年9月13日 下午3:24:41
 *
 */
@Service
public class OrgExamSuiteHidServiceImpl implements OrgExamSuiteHidService {

	@Autowired
	private OrganizationExamSuiteHidMapper orgExamSuiteHidMapper;
	
	@Autowired
	private RedisService redisService;

	/**
	 * 
	 * <p>
	 * Title: getOrgExamSuiteHidList
	 * </p>
	 * <p>
	 * Description: 套餐高发疾病绑定信息
	 * </p>
	 * 
	 * @param page
	 *            当前页
	 * @param rows
	 *            每页数量
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteHidService#getOrgExamSuiteHidList(java.lang.Integer,
	 *      java.lang.Integer)
	 */
	@Override
	public PageInfo<OrganizationExamSuiteHid> getOrgExamSuiteHidList(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		OrganizationExamSuiteHidExample example = new OrganizationExamSuiteHidExample();
		example.createCriteria().andOesHidStatusEqualTo(0);
		List<OrganizationExamSuiteHid> list = orgExamSuiteHidMapper.selectByExample(example);
		PageInfo<OrganizationExamSuiteHid> pageInfo = new PageInfo<OrganizationExamSuiteHid>(list);
		return pageInfo;
	}

 

	/**
	 *
	 * <p>
	 * Title: insetOrgExamSuiteHid
	 * </p>
	 * <p>
	 * Description: 插入套餐绑定高发疾病
	 * </p>
	 * 
	 * @param orgExamSuiteHid
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteHidService#insetOrgExamSuiteHid(br.crm.pojo.org.OrganizationExamSuiteHid)
	 */
	@Override
	public int insetOrgExamSuiteHid(OrganizationExamSuiteHid orgExamSuiteHid) {
		int result = orgExamSuiteHidMapper.insertSelective(orgExamSuiteHid);
		redisService.set(RedisConstant.br_order_orgExamSuiteHid_id.concat(orgExamSuiteHid.getOesHidId()), 
				JSONObject.toJSONString(orgExamSuiteHid));
		return result;
	}

	/**
	 * 
	 * <p>
	 * Title: updateOrgExamSuiteHid
	 * </p>
	 * <p>
	 * Description: 修改套餐绑定高发疾病
	 * </p>
	 * 
	 * @param orgExamSuiteHid
	 * @return
	 * @see br.crm.service.org.OrgExamSuiteHidService#updateOrgExamSuiteHid(br.crm.pojo.org.OrganizationExamSuiteHid)
	 */
	@Override
	public int updateOrgExamSuiteHid(OrganizationExamSuiteHid orgExamSuiteHid) {
		int result =  orgExamSuiteHidMapper.updateByPrimaryKeySelective(orgExamSuiteHid);
		
		redisService.set(RedisConstant.br_order_orgExamSuiteHid_id.concat(orgExamSuiteHid.getOesHidId()), 
				JSONObject.toJSONString(orgExamSuiteHid));
		
		return result;
	}
	
		/**
		 * <p>Title:initData</p> 
		 * <p>Description: 套餐-高发疾病redis缓存</p> 
	     * @see br.crm.service.suite.OrgExamSuiteHidService#initData()
		 */
	@Override
	public void initData() {
		OrganizationExamSuiteHidExample example = new OrganizationExamSuiteHidExample();
		example.createCriteria().andOesHidStatusEqualTo(0);
		List<OrganizationExamSuiteHid> list = orgExamSuiteHidMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)){
			for (OrganizationExamSuiteHid organizationExamSuiteHid : list) {
				redisService.set(RedisConstant.br_order_orgExamSuiteHid_id.concat(organizationExamSuiteHid.getOesHidId()), JSONObject.toJSONString(organizationExamSuiteHid));
				//存储套餐id
				List<String>hidList = new ArrayList<String>();
				if(redisService.exists(RedisConstant.br_order_orgExamSuiteHid_suiteid_.concat(organizationExamSuiteHid.getExamSuiteId()))){
					hidList = JSONObject.parseArray(redisService.get(RedisConstant.br_order_orgExamSuiteHid_suiteid_.concat(organizationExamSuiteHid.getExamSuiteId())),String.class);
				}
				if(!hidList.contains(organizationExamSuiteHid.getHighIncidenceDiseaseId())){
					hidList.add(organizationExamSuiteHid.getHighIncidenceDiseaseId());
				}
				redisService.set(RedisConstant.br_order_orgExamSuiteHid_suiteid_.concat(organizationExamSuiteHid.getExamSuiteId()), JSONObject.toJSONString(hidList));
				//存储高发疾病id
				List<String>suitList = new ArrayList<String>();
				if(redisService.exists(RedisConstant.br_order_orgExamSuiteHid_Hid.concat(organizationExamSuiteHid.getHighIncidenceDiseaseId()))){
					suitList = JSONObject.parseArray(redisService.get(RedisConstant.br_order_orgExamSuiteHid_Hid.concat(organizationExamSuiteHid.getHighIncidenceDiseaseId())),String.class  );
				}
				if(!suitList.contains(organizationExamSuiteHid.getExamSuiteId())){
					suitList.add(organizationExamSuiteHid.getExamSuiteId());
				}
				redisService.set(RedisConstant.br_order_orgExamSuiteHid_Hid.concat(organizationExamSuiteHid.getHighIncidenceDiseaseId()), JSONObject.toJSONString(suitList));
			}
			
		}
		
	}

}
