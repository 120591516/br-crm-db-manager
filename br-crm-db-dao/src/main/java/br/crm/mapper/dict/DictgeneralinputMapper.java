package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictgeneralinput;
import br.crm.pojo.dict.DictgeneralinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictgeneralinputMapper {
    int countByExample(DictgeneralinputExample example);

    int deleteByExample(DictgeneralinputExample example);

    int deleteByPrimaryKey(Integer idGeneralinput);

    int insert(Dictgeneralinput record);

    int insertSelective(Dictgeneralinput record);

    List<Dictgeneralinput> selectByExampleWithBLOBs(DictgeneralinputExample example);

    List<Dictgeneralinput> selectByExample(DictgeneralinputExample example);

    Dictgeneralinput selectByPrimaryKey(Integer idGeneralinput);

    int updateByExampleSelective(@Param("record") Dictgeneralinput record, @Param("example") DictgeneralinputExample example);

    int updateByExampleWithBLOBs(@Param("record") Dictgeneralinput record, @Param("example") DictgeneralinputExample example);

    int updateByExample(@Param("record") Dictgeneralinput record, @Param("example") DictgeneralinputExample example);

    int updateByPrimaryKeySelective(Dictgeneralinput record);

    int updateByPrimaryKeyWithBLOBs(Dictgeneralinput record);

    int updateByPrimaryKey(Dictgeneralinput record);
}