package br.crm.mapper.dict;

import br.crm.pojo.dict.DictImg;
import br.crm.pojo.dict.DictImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictImgMapper {
    int countByExample(DictImgExample example);

    int deleteByExample(DictImgExample example);

    int deleteByPrimaryKey(Long imgId);

    int insert(DictImg record);

    int insertSelective(DictImg record);

    List<DictImg> selectByExample(DictImgExample example);

    DictImg selectByPrimaryKey(Long imgId);

    int updateByExampleSelective(@Param("record") DictImg record, @Param("example") DictImgExample example);

    int updateByExample(@Param("record") DictImg record, @Param("example") DictImgExample example);

    int updateByPrimaryKeySelective(DictImg record);

    int updateByPrimaryKey(DictImg record);
}