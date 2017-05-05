package br.crm.mapper.firstshow;

import br.crm.pojo.firstshow.Firstimgshow;
import br.crm.pojo.firstshow.FirstimgshowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstimgshowMapper {
    int countByExample(FirstimgshowExample example);

    int deleteByExample(FirstimgshowExample example);

    int deleteByPrimaryKey(String firstimgshowId);

    int insert(Firstimgshow record);

    int insertSelective(Firstimgshow record);

    List<Firstimgshow> selectByExampleWithBLOBs(FirstimgshowExample example);

    List<Firstimgshow> selectByExample(FirstimgshowExample example);

    Firstimgshow selectByPrimaryKey(String firstimgshowId);

    int updateByExampleSelective(@Param("record") Firstimgshow record, @Param("example") FirstimgshowExample example);

    int updateByExampleWithBLOBs(@Param("record") Firstimgshow record, @Param("example") FirstimgshowExample example);

    int updateByExample(@Param("record") Firstimgshow record, @Param("example") FirstimgshowExample example);

    int updateByPrimaryKeySelective(Firstimgshow record);

    int updateByPrimaryKeyWithBLOBs(Firstimgshow record);

    int updateByPrimaryKey(Firstimgshow record);
}