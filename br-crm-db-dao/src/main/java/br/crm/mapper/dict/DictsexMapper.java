package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictsex;
import br.crm.pojo.dict.DictsexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictsexMapper {
    int countByExample(DictsexExample example);

    int deleteByExample(DictsexExample example);

    int deleteByPrimaryKey(Integer idSex);

    int insert(Dictsex record);

    int insertSelective(Dictsex record);

    List<Dictsex> selectByExample(DictsexExample example);

    Dictsex selectByPrimaryKey(Integer idSex);

    int updateByExampleSelective(@Param("record") Dictsex record, @Param("example") DictsexExample example);

    int updateByExample(@Param("record") Dictsex record, @Param("example") DictsexExample example);

    int updateByPrimaryKeySelective(Dictsex record);

    int updateByPrimaryKey(Dictsex record);
}