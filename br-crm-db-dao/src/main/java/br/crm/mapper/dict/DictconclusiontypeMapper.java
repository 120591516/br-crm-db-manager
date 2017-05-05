package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusiontype;
import br.crm.pojo.dict.DictconclusiontypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusiontypeMapper {
    int countByExample(DictconclusiontypeExample example);

    int deleteByExample(DictconclusiontypeExample example);

    int deleteByPrimaryKey(String idConclusionType);

    int insert(Dictconclusiontype record);

    int insertSelective(Dictconclusiontype record);

    List<Dictconclusiontype> selectByExample(DictconclusiontypeExample example);

    Dictconclusiontype selectByPrimaryKey(String idConclusionType);

    int updateByExampleSelective(@Param("record") Dictconclusiontype record, @Param("example") DictconclusiontypeExample example);

    int updateByExample(@Param("record") Dictconclusiontype record, @Param("example") DictconclusiontypeExample example);

    int updateByPrimaryKeySelective(Dictconclusiontype record);

    int updateByPrimaryKey(Dictconclusiontype record);
}