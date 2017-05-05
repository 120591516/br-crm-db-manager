package br.crm.service.dict;

import java.util.List;

import br.crm.pojo.dict.Dictbloodtype;

public interface DictBloodTypeService {

	List<Dictbloodtype> getAllBloodType();

	int addBloodType(Dictbloodtype dictbloodtype);

	Dictbloodtype getBloodTypeById(Long idBloodtype);

	int updateBloodType(Dictbloodtype dictbloodtype);
	
}
