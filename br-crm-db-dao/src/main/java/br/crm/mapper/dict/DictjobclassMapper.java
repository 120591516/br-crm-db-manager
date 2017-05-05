package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictjobclass;
import br.crm.pojo.dict.DictjobclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictjobclassMapper {
    int countByExample(DictjobclassExample example);

    int deleteByExample(DictjobclassExample example);

    int deleteByPrimaryKey(Long idJobclass);

    int insert(Dictjobclass record);

    int insertSelective(Dictjobclass record);

    List<Dictjobclass> selectByExample(DictjobclassExample example);

    Dictjobclass selectByPrimaryKey(Long idJobclass);

    int updateByExampleSelective(@Param("record") Dictjobclass record, @Param("example") DictjobclassExample example);

    int updateByExample(@Param("record") Dictjobclass record, @Param("example") DictjobclassExample example);

    int updateByPrimaryKeySelective(Dictjobclass record);

    int updateByPrimaryKey(Dictjobclass record);
}