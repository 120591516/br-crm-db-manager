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

import br.crm.mapper.dict.DictconclusionresultclassMapper;
import br.crm.pojo.dict.Dictconclusionresultclass;
import br.crm.pojo.dict.DictconclusionresultclassExample;
import br.crm.service.dict.DictConclusionResultClassService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictConclusionResultClassRedis;

@Service
public class DictConclusionResultClassServiceImpl implements DictConclusionResultClassService {

	@Autowired
	private DictconclusionresultclassMapper dictconclusionresultclassMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictConclusionResultClassRedis dictConclusionResultClassRedis;
	@Override
	public PageInfo<Dictconclusionresultclass> getConclusionResultClassList(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		List<Dictconclusionresultclass> list = dictconclusionresultclassMapper.selectByExample(null);

		PageInfo<Dictconclusionresultclass> result = new PageInfo<Dictconclusionresultclass>(list);

		return result;
	}

	@Override
	public int addConclusionResultClass(Dictconclusionresultclass dictconclusionresultclass) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictConclusionResultClassRedis.addConclusionResultClass(dictconclusionresultclass);
		}
		return dictconclusionresultclassMapper.insertSelective(dictconclusionresultclass);
	}

	@Override
	public Dictconclusionresultclass getConclusionResultClassById(String idConclusionresultclass) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			return dictConclusionResultClassRedis.getConclusionResultClassById(idConclusionresultclass);
		}
		return dictconclusionresultclassMapper.selectByPrimaryKey(idConclusionresultclass);
	}

	@Override
	public int updateConclusionResultClass(Dictconclusionresultclass dictconclusionresultclass) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictConclusionResultClassRedis.updateConclusionResultClass(dictconclusionresultclass);
		}
		return dictconclusionresultclassMapper.updateByPrimaryKeySelective(dictconclusionresultclass);
	}

	@Override
	public List<Map<String, String>> getConclusionResultClassList() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		DictconclusionresultclassExample dictconclusionresultclassExample = new DictconclusionresultclassExample();
		dictconclusionresultclassExample.createCriteria().andStatusEqualTo(0);
		List<Dictconclusionresultclass> list = dictconclusionresultclassMapper.selectByExample(dictconclusionresultclassExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Dictconclusionresultclass dictconclusionresultclass : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", dictconclusionresultclass.getIdConclusionresultclass());
				map.put("name", dictconclusionresultclass.getConclusionresultclassName());
				result.add(map);
			}
		}
		return result;
	}

	@Override
	public List<Dictconclusionresultclass> getAllDictConclusionResultClass() {
		
		return dictconclusionresultclassMapper.selectByExample(null);
	}

}
