package br.crm.mapper.branch;

import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchMapper {
    int countByExample(OrganizationBranchExample example);

    int deleteByExample(OrganizationBranchExample example);

    int deleteByPrimaryKey(String branchId);

    int insert(OrganizationBranch record);

    int insertSelective(OrganizationBranch record);

    List<OrganizationBranch> selectByExample(OrganizationBranchExample example);

    OrganizationBranch selectByPrimaryKey(String branchId);

    int updateByExampleSelective(@Param("record") OrganizationBranch record, @Param("example") OrganizationBranchExample example);

    int updateByExample(@Param("record") OrganizationBranch record, @Param("example") OrganizationBranchExample example);

    int updateByPrimaryKeySelective(OrganizationBranch record);

    int updateByPrimaryKey(OrganizationBranch record);
}