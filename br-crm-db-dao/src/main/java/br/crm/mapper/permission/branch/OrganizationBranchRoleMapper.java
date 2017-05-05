package br.crm.mapper.permission.branch;

import br.crm.pojo.permission.branch.OrganizationBranchRole;
import br.crm.pojo.permission.branch.OrganizationBranchRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchRoleMapper {
    int countByExample(OrganizationBranchRoleExample example);

    int deleteByExample(OrganizationBranchRoleExample example);

    int deleteByPrimaryKey(Long branchRoleId);

    int insert(OrganizationBranchRole record);

    int insertSelective(OrganizationBranchRole record);

    List<OrganizationBranchRole> selectByExample(OrganizationBranchRoleExample example);

    OrganizationBranchRole selectByPrimaryKey(Long branchRoleId);

    int updateByExampleSelective(@Param("record") OrganizationBranchRole record, @Param("example") OrganizationBranchRoleExample example);

    int updateByExample(@Param("record") OrganizationBranchRole record, @Param("example") OrganizationBranchRoleExample example);

    int updateByPrimaryKeySelective(OrganizationBranchRole record);

    int updateByPrimaryKey(OrganizationBranchRole record);
}