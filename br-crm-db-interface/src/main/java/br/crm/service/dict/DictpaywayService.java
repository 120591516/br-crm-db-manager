package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictpayway;

public interface DictpaywayService {
    Dictpayway selectByPrimaryKey(Long idPayway);

    PageInfo<Dictpayway> getDictpaywayByPage(Integer page, Integer rows);

    int addDictpayway(Dictpayway dictpayway);

    int updateDictpayway(Dictpayway dictpayway);

    int deleteDictpayway(Dictpayway dictpayway);

    List<Dictpayway> getAll();

}
