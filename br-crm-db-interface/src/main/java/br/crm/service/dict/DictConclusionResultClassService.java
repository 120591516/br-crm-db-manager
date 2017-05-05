package br.crm.service.dict;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictconclusionresultclass;

public interface DictConclusionResultClassService {

	PageInfo<Dictconclusionresultclass> getConclusionResultClassList(Integer page, Integer rows);

	int addConclusionResultClass(Dictconclusionresultclass dictconclusionresultclass);

	Dictconclusionresultclass getConclusionResultClassById(String idConclusionresultclass);

	int updateConclusionResultClass(Dictconclusionresultclass dictconclusionresultclass);

	List<Map<String, String>> getConclusionResultClassList();
	
	List<Dictconclusionresultclass> getAllDictConclusionResultClass();

}
