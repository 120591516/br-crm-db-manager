package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictinformway;

public interface DictinFormWayService {

    PageInfo<Dictinformway> getInformwayList(Integer page, Integer rows);

    int addInformway(Dictinformway dictinformway);

    Dictinformway getInformwayById(Long idInformway);

    int updateInformway(Dictinformway dictinformway);

    List<Dictinformway> getAll();

}
