package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationBranchUser;
import br.crm.pojo.org.OrganizationBranchUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchUserMapper {
    int countByExample(OrganizationBranchUserExample example);

    int deleteByExample(OrganizationBranchUserExample example);

    int deleteByPrimaryKey(String orgBranchUserId);

    int insert(OrganizationBranchUser record);

    int insertSelective(OrganizationBranchUser record);

    List<OrganizationBranchUser> selectByExample(OrganizationBranchUserExample example);

    OrganizationBranchUser selectByPrimaryKey(String orgBranchUserId);

    int updateByExampleSelective(@Param("record") OrganizationBranchUser record, @Param("example") OrganizationBranchUserExample example);

    int updateByExample(@Param("record") OrganizationBranchUser record, @Param("example") OrganizationBranchUserExample example);

    int updateByPrimaryKeySelective(OrganizationBranchUser record);

    int updateByPrimaryKey(OrganizationBranchUser record);
}