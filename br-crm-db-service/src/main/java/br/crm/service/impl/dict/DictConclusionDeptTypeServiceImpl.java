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

import br.crm.mapper.dict.DictconclusiondepttypeMapper;
import br.crm.pojo.dict.Dictconclusiondepttype;
import br.crm.pojo.dict.DictconclusiondepttypeExample;
import br.crm.service.dict.DictConclusionDeptTypeService;
import br.crm.service.system.SystemConfigService;
import br.order.redis.dict.DictConclusionDeptTypeRedis;

@Service
public class DictConclusionDeptTypeServiceImpl implements DictConclusionDeptTypeService {

	@Autowired
	private DictconclusiondepttypeMapper dictconclusiondepttypeMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DictConclusionDeptTypeRedis dictConclusionDeptTypeRedis;
	
	@Override
	public PageInfo<Dictconclusiondepttype> getConclusionDeptTypeList(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		List<Dictconclusiondepttype> list = dictconclusiondepttypeMapper.selectByExample(null);

		PageInfo<Dictconclusiondepttype> result = new PageInfo<Dictconclusiondepttype>(list);

		return result;
	}

	@Override
	public int addConclusionDeptType(Dictconclusiondepttype dictconclusiondepttype) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictConclusionDeptTypeRedis.addConclusionDeptType(dictconclusiondepttype);
		}
		return dictconclusiondepttypeMapper.insertSelective(dictconclusiondepttype);
	}

	@Override
	public Dictconclusiondepttype getConclusionDeptTypeById(String idConclusionDeptType) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			return dictConclusionDeptTypeRedis.getConclusionDeptTypeById(idConclusionDeptType);
		}
		return dictconclusiondepttypeMapper.selectByPrimaryKey(idConclusionDeptType);
	}

	@Override
	public int updateConclusionDeptType(Dictconclusiondepttype dictconclusiondepttype) {
		Boolean redis = systemConfigService.getRedis();
		if(redis){
			dictConclusionDeptTypeRedis.updateConclusionDeptType(dictconclusiondepttype);
		}
		return dictconclusiondepttypeMapper.updateByPrimaryKeySelective(dictconclusiondepttype);
	}

	@Override
	public List<Map<String, String>> getConclusionDeptTypeList() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		DictconclusiondepttypeExample dictconclusiondepttypeExample = new DictconclusiondepttypeExample();
		dictconclusiondepttypeExample.createCriteria().andStatusEqualTo(0);
		List<Dictconclusiondepttype> list = dictconclusiondepttypeMapper.selectByExample(dictconclusiondepttypeExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Dictconclusiondepttype dictconclusiondepttype : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", dictconclusiondepttype.getIdConclusionDeptType());
				map.put("name", dictconclusiondepttype.getConclusionTypeDeptName());
				result.add(map);
			}
		}
		return result;
	}

	@Override
	public List<Dictconclusiondepttype> getAllDictconclusiondepttype() {
		
		return dictconclusiondepttypeMapper.selectByExample(null);
	}

}
