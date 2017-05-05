package br.crm.mapper.firstshow;

import br.crm.pojo.firstshow.Firstdatashow;
import br.crm.pojo.firstshow.FirstdatashowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstdatashowMapper {
    int countByExample(FirstdatashowExample example);

    int deleteByExample(FirstdatashowExample example);

    int deleteByPrimaryKey(String firstdatashowId);

    int insert(Firstdatashow record);

    int insertSelective(Firstdatashow record);

    List<Firstdatashow> selectByExample(FirstdatashowExample example);

    Firstdatashow selectByPrimaryKey(String firstdatashowId);

    int updateByExampleSelective(@Param("record") Firstdatashow record, @Param("example") FirstdatashowExample example);

    int updateByExample(@Param("record") Firstdatashow record, @Param("example") FirstdatashowExample example);

    int updateByPrimaryKeySelective(Firstdatashow record);

    int updateByPrimaryKey(Firstdatashow record);
}