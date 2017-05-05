package br.crm.mapper.dict.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.dict.DictArea;

public interface DictAreaSelfMapper {

	List<DictArea> getAreaByPage(@Param("areaName")String areaName);
    
}