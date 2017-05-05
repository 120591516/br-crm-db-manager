package br.crm.mapper.group;

import br.crm.pojo.group.EnterpriseGroup;
import br.crm.pojo.group.EnterpriseGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseGroupMapper {
    int countByExample(EnterpriseGroupExample example);

    int deleteByExample(EnterpriseGroupExample example);

    int deleteByPrimaryKey(String enterpriseGroupId);

    int insert(EnterpriseGroup record);

    int insertSelective(EnterpriseGroup record);

    List<EnterpriseGroup> selectByExample(EnterpriseGroupExample example);

    EnterpriseGroup selectByPrimaryKey(String enterpriseGroupId);

    int updateByExampleSelective(@Param("record") EnterpriseGroup record, @Param("example") EnterpriseGroupExample example);

    int updateByExample(@Param("record") EnterpriseGroup record, @Param("example") EnterpriseGroupExample example);

    int updateByPrimaryKeySelective(EnterpriseGroup record);

    int updateByPrimaryKey(EnterpriseGroup record);
}