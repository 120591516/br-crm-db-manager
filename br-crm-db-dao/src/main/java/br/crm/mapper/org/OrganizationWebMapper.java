package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationWeb;
import br.crm.pojo.org.OrganizationWebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationWebMapper {
    int countByExample(OrganizationWebExample example);

    int deleteByExample(OrganizationWebExample example);

    int deleteByPrimaryKey(Long orgWebId);

    int insert(OrganizationWeb record);

    Long insertSelective(OrganizationWeb record);

    List<OrganizationWeb> selectByExample(OrganizationWebExample example);

    OrganizationWeb selectByPrimaryKey(Long orgWebId);

    int updateByExampleSelective(@Param("record") OrganizationWeb record, @Param("example") OrganizationWebExample example);

    int updateByExample(@Param("record") OrganizationWeb record, @Param("example") OrganizationWebExample example);

    int updateByPrimaryKeySelective(OrganizationWeb record);

    int updateByPrimaryKey(OrganizationWeb record);
}