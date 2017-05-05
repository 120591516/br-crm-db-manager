package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictagegroup;
import br.crm.pojo.dict.DictagegroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictagegroupMapper {
    int countByExample(DictagegroupExample example);

    int deleteByExample(DictagegroupExample example);

    int deleteByPrimaryKey(Integer agegroupId);

    int insert(Dictagegroup record);

    int insertSelective(Dictagegroup record);

    List<Dictagegroup> selectByExample(DictagegroupExample example);

    Dictagegroup selectByPrimaryKey(Integer agegroupId);

    int updateByExampleSelective(@Param("record") Dictagegroup record, @Param("example") DictagegroupExample example);

    int updateByExample(@Param("record") Dictagegroup record, @Param("example") DictagegroupExample example);

    int updateByPrimaryKeySelective(Dictagegroup record);

    int updateByPrimaryKey(Dictagegroup record);
}