package br.crm.mapper.dict;

import br.crm.pojo.dict.Dicteducation;
import br.crm.pojo.dict.DicteducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicteducationMapper {
    int countByExample(DicteducationExample example);

    int deleteByExample(DicteducationExample example);

    int deleteByPrimaryKey(Integer idEducation);

    int insert(Dicteducation record);

    int insertSelective(Dicteducation record);

    List<Dicteducation> selectByExample(DicteducationExample example);

    Dicteducation selectByPrimaryKey(Integer idEducation);

    int updateByExampleSelective(@Param("record") Dicteducation record, @Param("example") DicteducationExample example);

    int updateByExample(@Param("record") Dicteducation record, @Param("example") DicteducationExample example);

    int updateByPrimaryKeySelective(Dicteducation record);

    int updateByPrimaryKey(Dicteducation record);
}