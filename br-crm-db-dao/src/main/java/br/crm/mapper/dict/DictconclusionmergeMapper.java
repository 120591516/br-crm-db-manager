package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusionmerge;
import br.crm.pojo.dict.DictconclusionmergeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusionmergeMapper {
    int countByExample(DictconclusionmergeExample example);

    int deleteByExample(DictconclusionmergeExample example);

    int deleteByPrimaryKey(String idConclusionmerge);

    int insert(Dictconclusionmerge record);

    int insertSelective(Dictconclusionmerge record);

    List<Dictconclusionmerge> selectByExample(DictconclusionmergeExample example);

    Dictconclusionmerge selectByPrimaryKey(String idConclusionmerge);

    int updateByExampleSelective(@Param("record") Dictconclusionmerge record, @Param("example") DictconclusionmergeExample example);

    int updateByExample(@Param("record") Dictconclusionmerge record, @Param("example") DictconclusionmergeExample example);

    int updateByPrimaryKeySelective(Dictconclusionmerge record);

    int updateByPrimaryKey(Dictconclusionmerge record);
}