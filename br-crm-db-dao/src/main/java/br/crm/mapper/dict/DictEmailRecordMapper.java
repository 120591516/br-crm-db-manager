package br.crm.mapper.dict;

import br.crm.pojo.dict.DictEmailRecord;
import br.crm.pojo.dict.DictEmailRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictEmailRecordMapper {
    int countByExample(DictEmailRecordExample example);

    int deleteByExample(DictEmailRecordExample example);

    int deleteByPrimaryKey(Long dictEmailId);

    int insert(DictEmailRecord record);

    int insertSelective(DictEmailRecord record);

    List<DictEmailRecord> selectByExample(DictEmailRecordExample example);

    DictEmailRecord selectByPrimaryKey(Long dictEmailId);

    int updateByExampleSelective(@Param("record") DictEmailRecord record, @Param("example") DictEmailRecordExample example);

    int updateByExample(@Param("record") DictEmailRecord record, @Param("example") DictEmailRecordExample example);

    int updateByPrimaryKeySelective(DictEmailRecord record);

    int updateByPrimaryKey(DictEmailRecord record);
}