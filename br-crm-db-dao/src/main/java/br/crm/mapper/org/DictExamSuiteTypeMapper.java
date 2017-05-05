package br.crm.mapper.org;

import br.crm.pojo.org.DictExamSuiteType;
import br.crm.pojo.org.DictExamSuiteTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictExamSuiteTypeMapper {
    int countByExample(DictExamSuiteTypeExample example);

    int deleteByExample(DictExamSuiteTypeExample example);

    int deleteByPrimaryKey(String examTypeId);

    int insert(DictExamSuiteType record);

    int insertSelective(DictExamSuiteType record);

    List<DictExamSuiteType> selectByExample(DictExamSuiteTypeExample example);

    DictExamSuiteType selectByPrimaryKey(String examTypeId);

    int updateByExampleSelective(@Param("record") DictExamSuiteType record, @Param("example") DictExamSuiteTypeExample example);

    int updateByExample(@Param("record") DictExamSuiteType record, @Param("example") DictExamSuiteTypeExample example);

    int updateByPrimaryKeySelective(DictExamSuiteType record);

    int updateByPrimaryKey(DictExamSuiteType record);
}