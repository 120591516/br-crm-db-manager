package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictagegroup;

public interface DictagegroupService {

	PageInfo<Dictagegroup> getDictagegroupList(int page, int rows);

	Dictagegroup getDictagegroup(Integer pid);

	int addDictagegroup(Dictagegroup dictagegroup);

	int updateDictagegroup(Dictagegroup dictagegroup);
	
	List<Dictagegroup> getAll();
}
