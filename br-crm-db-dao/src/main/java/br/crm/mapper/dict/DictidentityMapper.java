package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictidentity;
import br.crm.pojo.dict.DictidentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictidentityMapper {
    int countByExample(DictidentityExample example);

    int deleteByExample(DictidentityExample example);

    int deleteByPrimaryKey(Integer idIdentity);

    int insert(Dictidentity record);

    int insertSelective(Dictidentity record);

    List<Dictidentity> selectByExample(DictidentityExample example);

    Dictidentity selectByPrimaryKey(Integer idIdentity);

    int updateByExampleSelective(@Param("record") Dictidentity record, @Param("example") DictidentityExample example);

    int updateByExample(@Param("record") Dictidentity record, @Param("example") DictidentityExample example);

    int updateByPrimaryKeySelective(Dictidentity record);

    int updateByPrimaryKey(Dictidentity record);
}