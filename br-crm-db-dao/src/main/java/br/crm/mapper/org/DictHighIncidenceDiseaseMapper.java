package br.crm.mapper.org;

import br.crm.pojo.org.DictHighIncidenceDisease;
import br.crm.pojo.org.DictHighIncidenceDiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictHighIncidenceDiseaseMapper {
    int countByExample(DictHighIncidenceDiseaseExample example);

    int deleteByExample(DictHighIncidenceDiseaseExample example);

    int deleteByPrimaryKey(String highIncidenceDiseaseId);

    int insert(DictHighIncidenceDisease record);

    int insertSelective(DictHighIncidenceDisease record);

    List<DictHighIncidenceDisease> selectByExample(DictHighIncidenceDiseaseExample example);

    DictHighIncidenceDisease selectByPrimaryKey(String highIncidenceDiseaseId);

    int updateByExampleSelective(@Param("record") DictHighIncidenceDisease record, @Param("example") DictHighIncidenceDiseaseExample example);

    int updateByExample(@Param("record") DictHighIncidenceDisease record, @Param("example") DictHighIncidenceDiseaseExample example);

    int updateByPrimaryKeySelective(DictHighIncidenceDisease record);

    int updateByPrimaryKey(DictHighIncidenceDisease record);
}