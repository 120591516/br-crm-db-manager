package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusion;
import br.crm.pojo.dict.DictconclusionExample;
import br.crm.pojo.dict.DictconclusionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusionMapper {
    int countByExample(DictconclusionExample example);

    int deleteByExample(DictconclusionExample example);

    int deleteByPrimaryKey(String idConclusion);

    int insert(DictconclusionWithBLOBs record);

    int insertSelective(DictconclusionWithBLOBs record);

    List<DictconclusionWithBLOBs> selectByExampleWithBLOBs(DictconclusionExample example);

    List<Dictconclusion> selectByExample(DictconclusionExample example);

    DictconclusionWithBLOBs selectByPrimaryKey(String idConclusion);

    int updateByExampleSelective(@Param("record") DictconclusionWithBLOBs record, @Param("example") DictconclusionExample example);

    int updateByExampleWithBLOBs(@Param("record") DictconclusionWithBLOBs record, @Param("example") DictconclusionExample example);

    int updateByExample(@Param("record") Dictconclusion record, @Param("example") DictconclusionExample example);

    int updateByPrimaryKeySelective(DictconclusionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DictconclusionWithBLOBs record);

    int updateByPrimaryKey(Dictconclusion record);
}