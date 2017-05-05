package br.crm.service.dict;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictconclusiontype;

public interface DictConclusionTypeService {

	PageInfo<Dictconclusiontype> getConclusionTypeList(Integer page, Integer rows);

	int addConclusionType(Dictconclusiontype dictconclusiontype);

	Dictconclusiontype getConclusionTypeById(String idConclusionType);

	int updateConclusionType(Dictconclusiontype dictconclusiontype);

	List<Map<String, String>> getConclusionTypeList();

}
