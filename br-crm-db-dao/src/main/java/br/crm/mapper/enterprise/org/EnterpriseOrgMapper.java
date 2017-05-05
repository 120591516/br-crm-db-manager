package br.crm.mapper.enterprise.org;

import br.crm.pojo.enterprise.org.EnterpriseOrg;
import br.crm.pojo.enterprise.org.EnterpriseOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseOrgMapper {
    int countByExample(EnterpriseOrgExample example);

    int deleteByExample(EnterpriseOrgExample example);

    int deleteByPrimaryKey(String enterpriseOrgId);

    int insert(EnterpriseOrg record);

    int insertSelective(EnterpriseOrg record);

    List<EnterpriseOrg> selectByExample(EnterpriseOrgExample example);

    EnterpriseOrg selectByPrimaryKey(String enterpriseOrgId);

    int updateByExampleSelective(@Param("record") EnterpriseOrg record, @Param("example") EnterpriseOrgExample example);

    int updateByExample(@Param("record") EnterpriseOrg record, @Param("example") EnterpriseOrgExample example);

    int updateByPrimaryKeySelective(EnterpriseOrg record);

    int updateByPrimaryKey(EnterpriseOrg record);
}