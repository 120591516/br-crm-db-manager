package br.crm.service.dict;


import java.util.List;

import br.crm.pojo.dict.Dictsection;

public interface DictSectionService {

	List<Dictsection> getDictSectionList();

	Dictsection getDictSectionById(Long idDictSection);

	int updateDictSection(Dictsection DictSectionById);

	int addDictSection(Dictsection dictsection);

}
