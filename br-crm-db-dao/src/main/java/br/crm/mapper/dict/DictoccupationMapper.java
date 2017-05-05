package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictoccupation;
import br.crm.pojo.dict.DictoccupationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictoccupationMapper {
    int countByExample(DictoccupationExample example);

    int deleteByExample(DictoccupationExample example);

    int deleteByPrimaryKey(Integer idOccupation);

    int insert(Dictoccupation record);

    int insertSelective(Dictoccupation record);

    List<Dictoccupation> selectByExample(DictoccupationExample example);

    Dictoccupation selectByPrimaryKey(Integer idOccupation);

    int updateByExampleSelective(@Param("record") Dictoccupation record, @Param("example") DictoccupationExample example);

    int updateByExample(@Param("record") Dictoccupation record, @Param("example") DictoccupationExample example);

    int updateByPrimaryKeySelective(Dictoccupation record);

    int updateByPrimaryKey(Dictoccupation record);
}