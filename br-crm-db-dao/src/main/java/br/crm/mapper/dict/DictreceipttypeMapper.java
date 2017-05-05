package br.crm.mapper.dict;

import br.crm.pojo.dict.Dictreceipttype;
import br.crm.pojo.dict.DictreceipttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictreceipttypeMapper {
    int countByExample(DictreceipttypeExample example);

    int deleteByExample(DictreceipttypeExample example);

    int deleteByPrimaryKey(Long idReceipttype);

    int insert(Dictreceipttype record);

    int insertSelective(Dictreceipttype record);

    List<Dictreceipttype> selectByExample(DictreceipttypeExample example);

    Dictreceipttype selectByPrimaryKey(Long idReceipttype);

    int updateByExampleSelective(@Param("record") Dictreceipttype record, @Param("example") DictreceipttypeExample example);

    int updateByExample(@Param("record") Dictreceipttype record, @Param("example") DictreceipttypeExample example);

    int updateByPrimaryKeySelective(Dictreceipttype record);

    int updateByPrimaryKey(Dictreceipttype record);
}