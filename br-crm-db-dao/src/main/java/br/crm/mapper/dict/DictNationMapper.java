package br.crm.mapper.dict;

import br.crm.pojo.dict.DictNation;
import br.crm.pojo.dict.DictNationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictNationMapper {
    int countByExample(DictNationExample example);

    int deleteByExample(DictNationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictNation record);

    int insertSelective(DictNation record);

    List<DictNation> selectByExample(DictNationExample example);

    DictNation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictNation record, @Param("example") DictNationExample example);

    int updateByExample(@Param("record") DictNation record, @Param("example") DictNationExample example);

    int updateByPrimaryKeySelective(DictNation record);

    int updateByPrimaryKey(DictNation record);
}