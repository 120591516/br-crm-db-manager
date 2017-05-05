package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusionspecialist;
import br.crm.pojo.dict.DictconclusionspecialistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusionspecialistMapper {
    int countByExample(DictconclusionspecialistExample example);

    int deleteByExample(DictconclusionspecialistExample example);

    int deleteByPrimaryKey(String idConclusionspecialist);

    int insert(Dictconclusionspecialist record);

    int insertSelective(Dictconclusionspecialist record);

    List<Dictconclusionspecialist> selectByExample(DictconclusionspecialistExample example);

    Dictconclusionspecialist selectByPrimaryKey(String idConclusionspecialist);

    int updateByExampleSelective(@Param("record") Dictconclusionspecialist record, @Param("example") DictconclusionspecialistExample example);

    int updateByExample(@Param("record") Dictconclusionspecialist record, @Param("example") DictconclusionspecialistExample example);

    int updateByPrimaryKeySelective(Dictconclusionspecialist record);

    int updateByPrimaryKey(Dictconclusionspecialist record);
}