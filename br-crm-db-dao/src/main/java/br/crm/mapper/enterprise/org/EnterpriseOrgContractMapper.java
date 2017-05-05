package br.crm.mapper.enterprise.org;

import br.crm.pojo.enterprise.org.EnterpriseOrgContract;
import br.crm.pojo.enterprise.org.EnterpriseOrgContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseOrgContractMapper {
    int countByExample(EnterpriseOrgContractExample example);

    int deleteByExample(EnterpriseOrgContractExample example);

    int deleteByPrimaryKey(String enterpriseOrgContractId);

    int insert(EnterpriseOrgContract record);

    int insertSelective(EnterpriseOrgContract record);

    List<EnterpriseOrgContract> selectByExample(EnterpriseOrgContractExample example);

    EnterpriseOrgContract selectByPrimaryKey(String enterpriseOrgContractId);

    int updateByExampleSelective(@Param("record") EnterpriseOrgContract record, @Param("example") EnterpriseOrgContractExample example);

    int updateByExample(@Param("record") EnterpriseOrgContract record, @Param("example") EnterpriseOrgContractExample example);

    int updateByPrimaryKeySelective(EnterpriseOrgContract record);

    int updateByPrimaryKey(EnterpriseOrgContract record);
}