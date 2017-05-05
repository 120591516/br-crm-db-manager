package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictsection;
import br.crm.pojo.dict.DictsectionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DictsectionMapper {
    int countByExample(DictsectionExample example);

    int deleteByExample(DictsectionExample example);

    int deleteByPrimaryKey(Integer idSection);

    int insert(Dictsection record);

    int insertSelective(Dictsection record);

    List<Dictsection> selectByExample(DictsectionExample example);

    Dictsection selectByPrimaryKey(@Param("idSection")Long idDictsection);

    int updateByExampleSelective(@Param("record") Dictsection record, @Param("example") DictsectionExample example);

    int updateByExample(@Param("record") Dictsection record, @Param("example") DictsectionExample example);

    int updateByPrimaryKeySelective(Dictsection record);

    int updateByPrimaryKey(Dictsection record);
}