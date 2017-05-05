package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictpayway;
import br.crm.pojo.dict.DictpaywayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictpaywayMapper {
    int countByExample(DictpaywayExample example);

    int deleteByExample(DictpaywayExample example);

    int deleteByPrimaryKey(Long idPayway);

    int insert(Dictpayway record);

    int insertSelective(Dictpayway record);

    List<Dictpayway> selectByExample(DictpaywayExample example);

    Dictpayway selectByPrimaryKey(Long idPayway);

    int updateByExampleSelective(@Param("record") Dictpayway record, @Param("example") DictpaywayExample example);

    int updateByExample(@Param("record") Dictpayway record, @Param("example") DictpaywayExample example);

    int updateByPrimaryKeySelective(Dictpayway record);

    int updateByPrimaryKey(Dictpayway record);
}