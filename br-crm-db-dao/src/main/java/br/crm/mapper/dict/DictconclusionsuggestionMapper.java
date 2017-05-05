package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusionsuggestion;
import br.crm.pojo.dict.DictconclusionsuggestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusionsuggestionMapper {
    int countByExample(DictconclusionsuggestionExample example);

    int deleteByExample(DictconclusionsuggestionExample example);

    int deleteByPrimaryKey(String idConclusionsuggestion);

    int insert(Dictconclusionsuggestion record);

    int insertSelective(Dictconclusionsuggestion record);

    List<Dictconclusionsuggestion> selectByExample(DictconclusionsuggestionExample example);

    Dictconclusionsuggestion selectByPrimaryKey(String idConclusionsuggestion);

    int updateByExampleSelective(@Param("record") Dictconclusionsuggestion record, @Param("example") DictconclusionsuggestionExample example);

    int updateByExample(@Param("record") Dictconclusionsuggestion record, @Param("example") DictconclusionsuggestionExample example);

    int updateByPrimaryKeySelective(Dictconclusionsuggestion record);

    int updateByPrimaryKey(Dictconclusionsuggestion record);
}