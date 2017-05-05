package br.crm.service.dict;

import java.util.List;

import br.crm.pojo.org.DictHighIncidenceDisease;

import com.github.pagehelper.PageInfo;

public interface DictHighIncidenceDiseaseService {

	DictHighIncidenceDisease getHighIncidenceDiseaseById(String idEducation);

	PageInfo<DictHighIncidenceDisease> getHighIncidenceDiseaseList(
			Integer page, Integer rows);

	int addHighIncidenceDisease(DictHighIncidenceDisease highIncidenceDisease);

	int updateHighIncidenceDisease(DictHighIncidenceDisease highIncidenceDisease);

	List<DictHighIncidenceDisease> getHighIncidenceDiseases();
	
}
