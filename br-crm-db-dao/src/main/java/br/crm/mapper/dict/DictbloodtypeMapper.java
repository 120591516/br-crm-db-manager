package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictbloodtype;
import br.crm.pojo.dict.DictbloodtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictbloodtypeMapper {
    int countByExample(DictbloodtypeExample example);

    int deleteByExample(DictbloodtypeExample example);

    int deleteByPrimaryKey(Integer idBloodtype);

    int insert(Dictbloodtype record);

    int insertSelective(Dictbloodtype record);

    List<Dictbloodtype> selectByExample(DictbloodtypeExample example);

    Dictbloodtype selectByPrimaryKey(Integer idBloodtype);

    int updateByExampleSelective(@Param("record") Dictbloodtype record, @Param("example") DictbloodtypeExample example);

    int updateByExample(@Param("record") Dictbloodtype record, @Param("example") DictbloodtypeExample example);

    int updateByPrimaryKeySelective(Dictbloodtype record);

    int updateByPrimaryKey(Dictbloodtype record);
}