package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dicteducation;

public interface DictEducationService {

	PageInfo<Dicteducation> getEducationList(Integer page, Integer rows);

	int addEducation(Dicteducation dicteducation);

	Dicteducation getEducationById(Integer idEducation);

	int updateEducation(Dicteducation dicteducation);
	
	List<Dicteducation> getAll();
}