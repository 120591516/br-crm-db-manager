package br.crm.mapper.dict;

import br.crm.pojo.dict.Dicticd10;
import br.crm.pojo.dict.Dicticd10Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Dicticd10Mapper {
    int countByExample(Dicticd10Example example);

    int deleteByExample(Dicticd10Example example);

    int deleteByPrimaryKey(Long dicticd10Id);

    int insert(Dicticd10 record);

    int insertSelective(Dicticd10 record);

    List<Dicticd10> selectByExample(Dicticd10Example example);

    Dicticd10 selectByPrimaryKey(Long dicticd10Id);

    int updateByExampleSelective(@Param("record") Dicticd10 record, @Param("example") Dicticd10Example example);

    int updateByExample(@Param("record") Dicticd10 record, @Param("example") Dicticd10Example example);

    int updateByPrimaryKeySelective(Dicticd10 record);

    int updateByPrimaryKey(Dicticd10 record);
}