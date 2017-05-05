package br.crm.service.dict;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictconclusiondepttype;

public interface DictConclusionDeptTypeService {

	PageInfo<Dictconclusiondepttype> getConclusionDeptTypeList(Integer page, Integer rows);

	int addConclusionDeptType(Dictconclusiondepttype dictconclusiondepttype);

	Dictconclusiondepttype getConclusionDeptTypeById(String idConclusionDeptType);

	int updateConclusionDeptType(Dictconclusiondepttype dictconclusiondepttype);

	List<Map<String, String>> getConclusionDeptTypeList();
	
	List<Dictconclusiondepttype> getAllDictconclusiondepttype();

}
