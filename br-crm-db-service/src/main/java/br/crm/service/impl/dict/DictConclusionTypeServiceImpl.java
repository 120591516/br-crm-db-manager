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

import br.crm.mapper.dict.DictconclusiontypeMapper;
import br.crm.pojo.dict.Dictconclusiontype;
import br.crm.pojo.dict.DictconclusiontypeExample;
import br.crm.service.dict.DictConclusionTypeService;

@Service
public class DictConclusionTypeServiceImpl implements DictConclusionTypeService {

	@Autowired
	private DictconclusiontypeMapper dictconclusiontypeMapper;

	@Override
	public PageInfo<Dictconclusiontype> getConclusionTypeList(Integer page, Integer rows) {

		PageHelper.startPage(page, rows);

		List<Dictconclusiontype> list = dictconclusiontypeMapper.selectByExample(null);

		PageInfo<Dictconclusiontype> result = new PageInfo<Dictconclusiontype>(list);

		return result;
	}

	@Override
	public int addConclusionType(Dictconclusiontype dictconclusiontype) {

		return dictconclusiontypeMapper.insertSelective(dictconclusiontype);
	}

	@Override
	public Dictconclusiontype getConclusionTypeById(String idConclusionType) {

		return dictconclusiontypeMapper.selectByPrimaryKey(idConclusionType);
	}

	@Override
	public int updateConclusionType(Dictconclusiontype dictconclusiontype) {

		return dictconclusiontypeMapper.updateByPrimaryKeySelective(dictconclusiontype);
	}

	@Override
	public List<Map<String, String>> getConclusionTypeList() {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		DictconclusiontypeExample dictconclusiontypeExample = new DictconclusiontypeExample();
		dictconclusiontypeExample.createCriteria().andStatusEqualTo(0);
		List<Dictconclusiontype> list = dictconclusiontypeMapper.selectByExample(dictconclusiontypeExample);
		if (CollectionUtils.isNotEmpty(list)) {
			for (Dictconclusiontype dictconclusiontype : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", dictconclusiontype.getIdConclusionType());
				map.put("name", dictconclusiontype.getConclusionTypeName());
				result.add(map);
			}
		}
		return result;
	}

}
