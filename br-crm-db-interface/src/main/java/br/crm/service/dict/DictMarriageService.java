package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictmarriage;

public interface DictMarriageService {

    PageInfo<Dictmarriage> getMarriageList(Integer page, Integer rows);

    int addMarriage(Dictmarriage dictmarriage);

    Dictmarriage getMarriageById(Integer idMarriage);

    int updateMarriage(Dictmarriage dictmarriage);

    List<Dictmarriage> getAll();

}
