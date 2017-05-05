package br.crm.mapper.dict;

import br.crm.pojo.dict.DictSmsRecord;
import br.crm.pojo.dict.DictSmsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictSmsRecordMapper {
    int countByExample(DictSmsRecordExample example);

    int deleteByExample(DictSmsRecordExample example);

    int deleteByPrimaryKey(Long smsId);

    int insert(DictSmsRecord record);

    int insertSelective(DictSmsRecord record);

    List<DictSmsRecord> selectByExample(DictSmsRecordExample example);

    DictSmsRecord selectByPrimaryKey(Long smsId);

    int updateByExampleSelective(@Param("record") DictSmsRecord record, @Param("example") DictSmsRecordExample example);

    int updateByExample(@Param("record") DictSmsRecord record, @Param("example") DictSmsRecordExample example);

    int updateByPrimaryKeySelective(DictSmsRecord record);

    int updateByPrimaryKey(DictSmsRecord record);
}