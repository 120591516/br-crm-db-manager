package br.crm.mapper.dict;

import br.crm.pojo.dict.DictCountry;
import br.crm.pojo.dict.DictCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictCountryMapper {
    int countByExample(DictCountryExample example);

    int deleteByExample(DictCountryExample example);

    int deleteByPrimaryKey(Long countryId);

    int insert(DictCountry record);

    int insertSelective(DictCountry record);

    List<DictCountry> selectByExample(DictCountryExample example);

    DictCountry selectByPrimaryKey(Long countryId);

    int updateByExampleSelective(@Param("record") DictCountry record, @Param("example") DictCountryExample example);

    int updateByExample(@Param("record") DictCountry record, @Param("example") DictCountryExample example);

    int updateByPrimaryKeySelective(DictCountry record);

    int updateByPrimaryKey(DictCountry record);
}