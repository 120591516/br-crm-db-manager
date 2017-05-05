package br.crm.service.dict;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictconclusiongroup;

public interface DictconclusionGroupService {

	PageInfo<Dictconclusiongroup> getConclusionGroupList(Integer page, Integer rows);

	int addConclusionGroup(Dictconclusiongroup dictconclusiongroup);

	Dictconclusiongroup getConclusionGroupById(String keyconclusiongroupid);

	int updateConclusionGroup(Dictconclusiongroup dictconclusiongroup);

	List<Map<String, String>> getConclusionGroupList();
	
	List<Dictconclusiongroup> getAllDictconclusionGroup();

}
