package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusiongroup;
import br.crm.pojo.dict.DictconclusiongroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusiongroupMapper {
    int countByExample(DictconclusiongroupExample example);

    int deleteByExample(DictconclusiongroupExample example);

    int deleteByPrimaryKey(String keyconclusiongroupid);

    int insert(Dictconclusiongroup record);

    int insertSelective(Dictconclusiongroup record);

    List<Dictconclusiongroup> selectByExample(DictconclusiongroupExample example);

    Dictconclusiongroup selectByPrimaryKey(String keyconclusiongroupid);

    int updateByExampleSelective(@Param("record") Dictconclusiongroup record, @Param("example") DictconclusiongroupExample example);

    int updateByExample(@Param("record") Dictconclusiongroup record, @Param("example") DictconclusiongroupExample example);

    int updateByPrimaryKeySelective(Dictconclusiongroup record);

    int updateByPrimaryKey(Dictconclusiongroup record);
}