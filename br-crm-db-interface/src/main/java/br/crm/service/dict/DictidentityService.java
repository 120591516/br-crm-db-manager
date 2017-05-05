package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictidentity;

public interface DictidentityService {

	PageInfo<Dictidentity> getIdentityList(Integer page, Integer rows);

	int addIdentity(Dictidentity dictidentity);

	Dictidentity getIdentityById(Long idIdentity);

	int updateIdentity(Dictidentity dictidentity);
	
	List<Dictidentity> getAll();

}
