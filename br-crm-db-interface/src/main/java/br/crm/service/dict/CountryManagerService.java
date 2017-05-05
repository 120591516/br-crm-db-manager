package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.DictCountry;


public interface CountryManagerService {

	PageInfo<DictCountry> getList(Integer page, Integer rows,String condition);

	int addCountry(DictCountry dictCountry);

	DictCountry getCountryById(Long country_id);

	int updateCountry(DictCountry dictCountry);

	DictCountry getCountryByName(String countryName);

	DictCountry checkCountryCode(String countryCode);

	DictCountry checkCountryInputCode(String countryInputCode);

	DictCountry checkCountryLineOrder(String countryLineOrder);
	
	List<DictCountry> getAll();

	DictCountry checkCountryName(String countryName);
	

}
