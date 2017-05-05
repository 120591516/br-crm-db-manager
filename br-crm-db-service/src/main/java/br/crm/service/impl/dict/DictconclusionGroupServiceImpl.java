package br.crm.service.impl.dict;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.mapper.dict.DictconclusiongroupMapper;
import br.crm.pojo.dict.Dictconclusiongroup;
import br.crm.pojo.dict.DictconclusiongroupExample;
import br.crm.service.dict.DictconclusionGroupService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictconclusionGroupRedis;

@Service
public class DictconclusionGroupServiceImpl implements DictconclusionGroupService {

	@Autowired
	private DictconclusiongroupMapper dictconclusiongroupMapper;
	
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictconclusionGroupRedis dictconclusionGroupRedis;
	@Override
	public PageInfo<Dictconclusiongroup> getConclusionGroupList(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		List<Dictconclusiongroup> list = dictconclusiongroupMapper.selectByExample(null);

		PageInfo<Dictconclusiongroup> result = new PageInfo<Dictconclusiongroup>(list);

		return result;
	}

	@Override
	public int addConclusionGroup(Dictconclusiongroup dictconclusiongroup) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictconclusionGroupRedis.addConclusionGroup(dictconclusiongroup);
			
		}

		return dictconclusiongroupMapper.insertSelective(dictconclusiongroup);
	}

	@Override
	public Dictconclusiongroup getConclusionGroupById(String keyconclusiongroupid) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			return	dictconclusionGroupRedis.getConclusionGroupById(keyconclusiongroupid);
		}
		return dictconclusiongroupMapper.selectByPrimaryKey(keyconclusiongroupid);
	}

	@Override
	public int updateConclusionGroup(Dictconclusiongroup dictconclusiongroup) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictconclusionGroupRedis.updateConclusionGroup(dictconclusiongroup);
		}
		return dictconclusiongroupMapper.updateByPrimaryKeySelective(dictconclusiongroup);
	}

	@Override
	public List<Map<String, String>> getConclusionGroupList() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		DictconclusiongroupExample dictconclusiongroupExample = new DictconclusiongroupExample();
		dictconclusiongroupExample.createCriteria().andStatusEqualTo(0);
		List<Dictconclusiongroup> list = dictconclusiongroupMapper.selectByExample(dictconclusiongroupExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Dictconclusiongroup dictconclusiongroup : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", dictconclusiongroup.getKeyconclusiongroupid());
				map.put("name", dictconclusiongroup.getConclusiongroupName());
				result.add(map);
			}
		}
		return result;
	}

	@Override
	public List<Dictconclusiongroup> getAllDictconclusionGroup() {
		return dictconclusiongroupMapper.selectByExample(null);
	}

}
