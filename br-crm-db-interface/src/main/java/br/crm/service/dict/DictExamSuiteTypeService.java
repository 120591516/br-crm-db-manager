package br.crm.service.dict;

import java.util.List;

import br.crm.pojo.org.DictExamSuiteType;

import com.github.pagehelper.PageInfo;

public interface DictExamSuiteTypeService {

	PageInfo<DictExamSuiteType> getExamSuiteTypeByPage(Integer page,
			Integer rows);

	int insertExamSuiteType(DictExamSuiteType dictExamSuiteType);
	
	int updateExamSuiteType(DictExamSuiteType dictExamSuiteType);

	DictExamSuiteType getDictExamSuiteTypeById(String idExamSuiteType);

	List<DictExamSuiteType> getExamSuiteTypes();

}
