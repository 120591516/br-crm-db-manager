package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictreceipttype;

public interface DictreceipttypeService {
	Dictreceipttype selectByPrimaryKey(Long idReceipttype);

	PageInfo<Dictreceipttype> getDictreceipttypeByPage(Integer page, Integer rows);

	int addDictreceipttype(Dictreceipttype dictreceipttype);

	int updateDictreceipttype(Dictreceipttype dictreceipttype);

	int deleteDictreceipttype(Dictreceipttype dictreceipttype);

    List<Dictreceipttype> getDictreceipttypeList();
}
