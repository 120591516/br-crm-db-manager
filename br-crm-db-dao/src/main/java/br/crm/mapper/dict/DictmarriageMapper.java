package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictmarriage;
import br.crm.pojo.dict.DictmarriageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictmarriageMapper {
    int countByExample(DictmarriageExample example);

    int deleteByExample(DictmarriageExample example);

    int deleteByPrimaryKey(Integer idMarriage);

    int insert(Dictmarriage record);

    int insertSelective(Dictmarriage record);

    List<Dictmarriage> selectByExample(DictmarriageExample example);

    Dictmarriage selectByPrimaryKey(Integer idMarriage);

    int updateByExampleSelective(@Param("record") Dictmarriage record, @Param("example") DictmarriageExample example);

    int updateByExample(@Param("record") Dictmarriage record, @Param("example") DictmarriageExample example);

    int updateByPrimaryKeySelective(Dictmarriage record);

    int updateByPrimaryKey(Dictmarriage record);
}