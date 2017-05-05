package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictinformway;
import br.crm.pojo.dict.DictinformwayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictinformwayMapper {
    int countByExample(DictinformwayExample example);

    int deleteByExample(DictinformwayExample example);

    int deleteByPrimaryKey(Integer idInformway);

    int insert(Dictinformway record);

    int insertSelective(Dictinformway record);

    List<Dictinformway> selectByExample(DictinformwayExample example);

    Dictinformway selectByPrimaryKey(Integer idInformway);

    int updateByExampleSelective(@Param("record") Dictinformway record, @Param("example") DictinformwayExample example);

    int updateByExample(@Param("record") Dictinformway record, @Param("example") DictinformwayExample example);

    int updateByPrimaryKeySelective(Dictinformway record);

    int updateByPrimaryKey(Dictinformway record);
}