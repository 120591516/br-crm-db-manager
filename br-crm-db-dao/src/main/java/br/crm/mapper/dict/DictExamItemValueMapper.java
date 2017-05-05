package br.crm.mapper.dict;

import br.crm.pojo.dict.DictExamItemValue;
import br.crm.pojo.dict.DictExamItemValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictExamItemValueMapper {
    int countByExample(DictExamItemValueExample example);

    int deleteByExample(DictExamItemValueExample example);

    int deleteByPrimaryKey(String examItemValueId);

    int insert(DictExamItemValue record);

    int insertSelective(DictExamItemValue record);

    List<DictExamItemValue> selectByExample(DictExamItemValueExample example);

    DictExamItemValue selectByPrimaryKey(String examItemValueId);

    int updateByExampleSelective(@Param("record") DictExamItemValue record, @Param("example") DictExamItemValueExample example);

    int updateByExample(@Param("record") DictExamItemValue record, @Param("example") DictExamItemValueExample example);

    int updateByPrimaryKeySelective(DictExamItemValue record);

    int updateByPrimaryKey(DictExamItemValue record);
}