package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictsex;

public interface DictsexService {
	Dictsex getDictsexByID(int pid);

	PageInfo<Dictsex> getDictSexList(Integer page,Integer rows);

	int addDictSex(Dictsex dictsex);

	int updateDictSex(Dictsex dictsex);

	int deleteDictSex(Dictsex dictsex);

	List<Dictsex> dictSexListByStatus();

}