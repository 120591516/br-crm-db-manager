package br.crm.mapper.dict;

import br.crm.pojo.dict.DictDeptType;
import br.crm.pojo.dict.DictDeptTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictDeptTypeMapper {
    int countByExample(DictDeptTypeExample example);

    int deleteByExample(DictDeptTypeExample example);

    int deleteByPrimaryKey(String dictDeptTypeId);

    int insert(DictDeptType record);

    int insertSelective(DictDeptType record);

    List<DictDeptType> selectByExample(DictDeptTypeExample example);

    DictDeptType selectByPrimaryKey(String dictDeptTypeId);

    int updateByExampleSelective(@Param("record") DictDeptType record, @Param("example") DictDeptTypeExample example);

    int updateByExample(@Param("record") DictDeptType record, @Param("example") DictDeptTypeExample example);

    int updateByPrimaryKeySelective(DictDeptType record);

    int updateByPrimaryKey(DictDeptType record);
}