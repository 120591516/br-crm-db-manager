package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.DictNation;

public interface DictNationService {

	PageInfo<DictNation> getAllNation(Integer page, Integer rows);

	int addNation(DictNation dictNation);

	DictNation getNationById(Long id);

	int updateNation(DictNation dictNation);
	
	List<DictNation> getAll();

}
