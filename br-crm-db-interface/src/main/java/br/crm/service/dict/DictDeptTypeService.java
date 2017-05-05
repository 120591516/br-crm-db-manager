package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.DictDeptType;

public interface DictDeptTypeService {

	int addDeptType(DictDeptType dictDeptType);

	int deleteDeptType(String dictDeptTypeId);

	int updateDeptType(DictDeptType dictDeptType);

	PageInfo<DictDeptType> selectDeptTypeList(Integer page, Integer rows);

	DictDeptType getDeptTypeById(String dictDeptTypeId);
	
	List<DictDeptType> getAll();
}
