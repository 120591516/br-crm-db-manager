package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictageunit;
import br.crm.pojo.dict.DictageunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictageunitMapper {
    int countByExample(DictageunitExample example);

    int deleteByExample(DictageunitExample example);

    int deleteByPrimaryKey(Integer ageunitId);

    int insert(Dictageunit record);

    int insertSelective(Dictageunit record);

    List<Dictageunit> selectByExample(DictageunitExample example);

    Dictageunit selectByPrimaryKey(Integer ageunitId);

    int updateByExampleSelective(@Param("record") Dictageunit record, @Param("example") DictageunitExample example);

    int updateByExample(@Param("record") Dictageunit record, @Param("example") DictageunitExample example);

    int updateByPrimaryKeySelective(Dictageunit record);

    int updateByPrimaryKey(Dictageunit record);
}