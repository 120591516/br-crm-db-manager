package br.crm.mapper.dict;

import br.crm.pojo.dict.DictPatientClass;
import br.crm.pojo.dict.DictPatientClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictPatientClassMapper {
    int countByExample(DictPatientClassExample example);

    int deleteByExample(DictPatientClassExample example);

    int deleteByPrimaryKey(String customerClassId);

    int insert(DictPatientClass record);

    int insertSelective(DictPatientClass record);

    List<DictPatientClass> selectByExample(DictPatientClassExample example);

    DictPatientClass selectByPrimaryKey(String customerClassId);

    int updateByExampleSelective(@Param("record") DictPatientClass record, @Param("example") DictPatientClassExample example);

    int updateByExample(@Param("record") DictPatientClass record, @Param("example") DictPatientClassExample example);

    int updateByPrimaryKeySelective(DictPatientClass record);

    int updateByPrimaryKey(DictPatientClass record);
}