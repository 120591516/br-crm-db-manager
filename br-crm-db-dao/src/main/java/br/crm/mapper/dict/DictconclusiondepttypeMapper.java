package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusiondepttype;
import br.crm.pojo.dict.DictconclusiondepttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusiondepttypeMapper {
    int countByExample(DictconclusiondepttypeExample example);

    int deleteByExample(DictconclusiondepttypeExample example);

    int deleteByPrimaryKey(String idConclusionDeptType);

    int insert(Dictconclusiondepttype record);

    int insertSelective(Dictconclusiondepttype record);

    List<Dictconclusiondepttype> selectByExample(DictconclusiondepttypeExample example);

    Dictconclusiondepttype selectByPrimaryKey(String idConclusionDeptType);

    int updateByExampleSelective(@Param("record") Dictconclusiondepttype record, @Param("example") DictconclusiondepttypeExample example);

    int updateByExample(@Param("record") Dictconclusiondepttype record, @Param("example") DictconclusiondepttypeExample example);

    int updateByPrimaryKeySelective(Dictconclusiondepttype record);

    int updateByPrimaryKey(Dictconclusiondepttype record);
}