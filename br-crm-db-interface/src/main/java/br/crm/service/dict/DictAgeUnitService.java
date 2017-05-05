package br.crm.service.dict;

import java.util.List;

import br.crm.pojo.dict.Dictageunit;

public interface DictAgeUnitService {

	List<Dictageunit> getAllDictageunit();

	int addDictAgeUnit(Dictageunit dictageunit);

	Dictageunit getDictAgeUnitById(Integer ageunitId);

	int updateDictageunit(Dictageunit dictageunit);

}
