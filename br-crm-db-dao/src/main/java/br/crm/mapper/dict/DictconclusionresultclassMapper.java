package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusionresultclass;
import br.crm.pojo.dict.DictconclusionresultclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusionresultclassMapper {
    int countByExample(DictconclusionresultclassExample example);

    int deleteByExample(DictconclusionresultclassExample example);

    int deleteByPrimaryKey(String idConclusionresultclass);

    int insert(Dictconclusionresultclass record);

    int insertSelective(Dictconclusionresultclass record);

    List<Dictconclusionresultclass> selectByExample(DictconclusionresultclassExample example);

    Dictconclusionresultclass selectByPrimaryKey(String idConclusionresultclass);

    int updateByExampleSelective(@Param("record") Dictconclusionresultclass record, @Param("example") DictconclusionresultclassExample example);

    int updateByExample(@Param("record") Dictconclusionresultclass record, @Param("example") DictconclusionresultclassExample example);

    int updateByPrimaryKeySelective(Dictconclusionresultclass record);

    int updateByPrimaryKey(Dictconclusionresultclass record);
}