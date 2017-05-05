package br.crm.service.impl.firstdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.mapper.branch.OrganizationBranchImgMapper;
import br.crm.mapper.branch.OrganizationBranchMapper;
import br.crm.mapper.dict.DictImgMapper;
import br.crm.mapper.firstshow.FirstimgshowMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.suite.OrganizationExamSuiteImgMapper;
import br.crm.mapper.suite.OrganizationExamSuiteMapper;
import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.branch.OrganizationBranchImgExample;
import br.crm.pojo.dict.DictImg;
import br.crm.pojo.firstshow.Firstimgshow;
import br.crm.pojo.firstshow.FirstimgshowExample;
import br.crm.pojo.suite.OrganizationExamSuite;
import br.crm.pojo.suite.OrganizationExamSuiteExample;
import br.crm.pojo.suite.OrganizationExamSuiteImg;
import br.crm.pojo.suite.OrganizationExamSuiteImgExample;
import br.crm.service.firstdata.FirstImgDataService;
import br.order.redis.redis.RedisService;
import br.crm.vo.firstdata.FirstimgshowVo;

@Service
public class FirstImgDataServiceImpl implements FirstImgDataService {

	@Autowired
	private FirstimgshowMapper firstimgshowMapper;

	@Autowired
	private DictImgMapper dictImgMapper;

	@Autowired
	private OrganizationBranchImgMapper organizationBranchImgMapper;

	@Autowired
	private OrganizationExamSuiteImgMapper organizationExamSuiteImgMapper;

	@Autowired
	private OrganizationBranchMapper organizationBranchMapper;

	@Autowired
	private OrganizationExamSuiteMapper organizationExamSuiteMapper;

	@Autowired
	private OrganizationMapper organizationMapper;

	@Autowired
	private RedisService redisService;

	@Override
	public List<FirstimgshowVo> showFirstImgDataList() {
		List<FirstimgshowVo> result = new ArrayList<FirstimgshowVo>();
		FirstimgshowExample firstimgshowExample = new FirstimgshowExample();
		firstimgshowExample.setOrderByClause(" firstimgshow_status ASC");
		firstimgshowExample.setOrderByClause(" firstimgshow_created desc");
		List<Firstimgshow> list = firstimgshowMapper.selectByExample(firstimgshowExample);
		if (CollectionUtils.isNotEmpty(list)) {
			try {
				for (Firstimgshow firstimgshow : list) {
					FirstimgshowVo firstimgshowVo = new FirstimgshowVo();
					BeanUtils.copyProperties(firstimgshowVo, firstimgshow);
					if (firstimgshowVo.getFirstimgshowDataType() == 1) {
						firstimgshowVo.setDataTypeName(organizationBranchMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataId()).getBranchName());
					} else {
						firstimgshowVo.setDataTypeName(organizationExamSuiteMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataId()).getExamSuiteName());
					}
					firstimgshowVo.setOrgName(organizationMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataOrgId()).getOrgShortName());
					result.add(firstimgshowVo);
				}
				return result;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int addFirstImgData(Firstimgshow firstimgshow) {

		int i = firstimgshowMapper.insertSelective(firstimgshow);
		redisService.set(RedisConstant.br_order_orgFirstImgData_id.concat(firstimgshow.getFirstimgshowId()), JSONObject.toJSONString(firstimgshow));
		return i;
	}

	@Override
	public FirstimgshowVo getFirstImgDataById(String firstimgshowId) {
		FirstimgshowVo firstimgshowVo = new FirstimgshowVo();
		Firstimgshow firstimgshow = JsonUtils.jsonToPojo(redisService.get(RedisConstant.br_order_orgFirstImgData_id.concat(firstimgshowId)), Firstimgshow.class);
		if (null != firstimgshow) {
			try {
				BeanUtils.copyProperties(firstimgshowVo, firstimgshow);
				if (firstimgshowVo.getFirstimgshowDataType() == 1) {
					firstimgshowVo.setDataTypeName(organizationBranchMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataId()).getBranchName());
				} else {
					firstimgshowVo.setDataTypeName(organizationExamSuiteMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataId()).getExamSuiteName());
				}
				firstimgshowVo.setOrgName(organizationMapper.selectByPrimaryKey(firstimgshowVo.getFirstimgshowDataOrgId()).getOrgShortName());
				// 返回可用位置
				List<String> indexs = new LinkedList<String>();
				FirstimgshowExample firstimgshowExample = new FirstimgshowExample();
				firstimgshowExample.createCriteria().andFirstimgshowStatusEqualTo(0);
				List<Firstimgshow> list = firstimgshowMapper.selectByExample(firstimgshowExample);
				if (CollectionUtils.isNotEmpty(list)) {
					for (Firstimgshow imgshow : list) {
						indexs.add(imgshow.getFirstimgshowIndex().toString());
					}
				}
				firstimgshowVo.setIndexs(indexs);
				return firstimgshowVo;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return firstimgshowVo;
	}

	@Override
	public int updateFirstImgData(Firstimgshow firstimgshow) {

		int i = firstimgshowMapper.updateByPrimaryKeySelective(firstimgshow);

		redisService.set(RedisConstant.br_order_orgFirstImgData_id.concat(firstimgshow.getFirstimgshowId()), JSONObject.toJSONString(firstimgshow));

		return i;
	}

	@Override
	public List<DictImg> getImgByBranchId(String id) {
		List<DictImg> result = new ArrayList<DictImg>();
		OrganizationBranchImgExample organizationBranchImgExample = new OrganizationBranchImgExample();
		organizationBranchImgExample.createCriteria().andOrgBranchIdEqualTo(id);
		List<OrganizationBranchImg> imgList = organizationBranchImgMapper.selectByExample(organizationBranchImgExample);
		if (CollectionUtils.isNotEmpty(imgList)) {
			for (OrganizationBranchImg organizationBranchImg : imgList) {
				DictImg img = dictImgMapper.selectByPrimaryKey(organizationBranchImg.getDictImgId());
				if (null != img) {
					result.add(img);
				}
			}
		}
		return result;
	}

	@Override
	public List<DictImg> getImgBySuiteId(String id) {
		List<DictImg> result = new ArrayList<DictImg>();
		OrganizationExamSuiteImgExample organizationExamSuiteImgExample = new OrganizationExamSuiteImgExample();
		organizationExamSuiteImgExample.createCriteria().andOrgExamSuiteIdEqualTo(id).andOrgExamSuiteStatusEqualTo(0);
		List<OrganizationExamSuiteImg> suiteList = organizationExamSuiteImgMapper.selectByExample(organizationExamSuiteImgExample);
		if (CollectionUtils.isNotEmpty(suiteList)) {
			for (OrganizationExamSuiteImg organizationExamSuiteImg : suiteList) {
				DictImg img = dictImgMapper.selectByPrimaryKey(organizationExamSuiteImg.getDictImgId());
				if (null != img) {
					result.add(img);
				}
			}
		}
		return result;
	}

	@Override
	public List<Map<String, String>> getImgIndex() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		FirstimgshowExample firstimgshowExample = new FirstimgshowExample();
		firstimgshowExample.createCriteria().andFirstimgshowStatusEqualTo(0);
		firstimgshowExample.setOrderByClause(" firstimgshow_index asc");
		List<Firstimgshow> list = firstimgshowMapper.selectByExample(firstimgshowExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Firstimgshow firstimgshow : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("index", firstimgshow.getFirstimgshowIndex() + "");
				result.add(map);
			}
		}
		return result;
	}

	@Override
	public List<Map<String, String>> getSuiteByOrgId(String orgId) {
		List<Map<String, String>> map = new ArrayList<Map<String, String>>();
		OrganizationExamSuiteExample organizationExamSuiteExample = new OrganizationExamSuiteExample();
		organizationExamSuiteExample.createCriteria().andOrgIdEqualTo(orgId).andExamSuiteStatusEqualTo(0);
		List<OrganizationExamSuite> suiteList = organizationExamSuiteMapper.selectByExample(organizationExamSuiteExample);
		if (CollectionUtils.isNotEmpty(suiteList)) {
			for (OrganizationExamSuite organizationExamSuite : suiteList) {
				Map<String, String> suite = new HashMap<String, String>();
				suite.put("suiteId", organizationExamSuite.getExamSuiteId());
				suite.put("suiteName", organizationExamSuite.getExamSuiteName());
				map.add(suite);
			}
		}
		return map;
	}

	@Override
	public void initData() {
		List<Firstimgshow> list = firstimgshowMapper.selectByExample(null);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Firstimgshow firstimgshow : list) {
				redisService.set(RedisConstant.br_order_orgFirstImgData_id.concat(firstimgshow.getFirstimgshowId()), JSONObject.toJSONString(firstimgshow));
			}
		}
	}

	@Override
	public List<Map<String, String>> getFirstImgs() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		FirstimgshowExample firstimgshowExample = new FirstimgshowExample();
		firstimgshowExample.setOrderByClause(" firstimgshow_index ASC");
		firstimgshowExample.createCriteria().andFirstimgshowStatusEqualTo(0);
		List<Firstimgshow> list = firstimgshowMapper.selectByExample(firstimgshowExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Firstimgshow firstimgshow : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("index", firstimgshow.getFirstimgshowIndex() + "");
				map.put("title", firstimgshow.getFirstimgshowTitle());
				map.put("imgurl", firstimgshow.getFirstimgshowImgUrl());
				map.put("dataId", firstimgshow.getFirstimgshowDataId());
				map.put("dataIdType", firstimgshow.getFirstimgshowDataType() + "");
				result.add(map);
			}
		}
		return result;
	}

}
