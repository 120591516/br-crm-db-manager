package br.crm.service.dict;

import java.util.LinkedList;
import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.dict.DictArea;

public interface DictAreaService {

    List<DictArea> getAllProvince();

    List<DictArea> getCityByProvinceId(Integer provinceId);

    List<DictArea> getDistrictByCityId(Integer cityId);

    PageInfo<DictArea> getAreaByPage(String areaName, Integer page, Integer rows);

    int insertProvince(DictArea dictArea);

    int insertCity(DictArea dictArea);

    int insertDistrict(DictArea dictArea);

    DictArea getPositionCity(String city);

    LinkedList<String> getPositionCity();

    List<DictArea> getCitys(LinkedList<String> list);

    List<DictArea> getAllCity();

}
