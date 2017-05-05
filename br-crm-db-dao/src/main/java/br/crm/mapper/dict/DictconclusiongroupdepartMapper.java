package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictconclusiongroupdepart;
import br.crm.pojo.dict.DictconclusiongroupdepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictconclusiongroupdepartMapper {
    int countByExample(DictconclusiongroupdepartExample example);

    int deleteByExample(DictconclusiongroupdepartExample example);

    int deleteByPrimaryKey(String idConclusiongroupdepart);

    int insert(Dictconclusiongroupdepart record);

    int insertSelective(Dictconclusiongroupdepart record);

    List<Dictconclusiongroupdepart> selectByExample(DictconclusiongroupdepartExample example);

    Dictconclusiongroupdepart selectByPrimaryKey(String idConclusiongroupdepart);

    int updateByExampleSelective(@Param("record") Dictconclusiongroupdepart record, @Param("example") DictconclusiongroupdepartExample example);

    int updateByExample(@Param("record") Dictconclusiongroupdepart record, @Param("example") DictconclusiongroupdepartExample example);

    int updateByPrimaryKeySelective(Dictconclusiongroupdepart record);

    int updateByPrimaryKey(Dictconclusiongroupdepart record);
}