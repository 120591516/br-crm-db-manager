package br.crm.service.dict;

import java.util.List;

import br.crm.pojo.dict.DictImg;

public interface DictImgService {

    Long insertImg(DictImg dictImg);

    DictImg getEntityById(Long imgId);

    List<DictImg> getAll();
}
