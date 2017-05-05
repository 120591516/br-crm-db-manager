package br.crm.mapper.dict;

import br.crm.pojo.dict.DictArea;
import br.crm.pojo.dict.DictAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictAreaMapper {
    int countByExample(DictAreaExample example);

    int deleteByExample(DictAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictArea record);

    int insertSelective(DictArea record);

    List<DictArea> selectByExample(DictAreaExample example);

    DictArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictArea record, @Param("example") DictAreaExample example);

    int updateByExample(@Param("record") DictArea record, @Param("example") DictAreaExample example);

    int updateByPrimaryKeySelective(DictArea record);

    int updateByPrimaryKey(DictArea record);
}