package br.crm.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.Dictoccupation;

public interface DictOccupationService {

    PageInfo<Dictoccupation> getOccupationList(Integer page, Integer rows);

    int addOccupation(Dictoccupation dictoccupation);

    Dictoccupation getOccupationById(Long idOccupation);

    int updateOccupation(Dictoccupation dictoccupation);

    List<Dictoccupation> getAll();

}
