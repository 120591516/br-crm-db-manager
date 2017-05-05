package br.crm.mapper.branch;

import br.crm.pojo.branch.OrganizationBranchRest;
import br.crm.pojo.branch.OrganizationBranchRestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchRestMapper {
    int countByExample(OrganizationBranchRestExample example);

    int deleteByExample(OrganizationBranchRestExample example);

    int deleteByPrimaryKey(String branchRestId);

    int insert(OrganizationBranchRest record);

    int insertSelective(OrganizationBranchRest record);

    List<OrganizationBranchRest> selectByExample(OrganizationBranchRestExample example);

    OrganizationBranchRest selectByPrimaryKey(String branchRestId);

    int updateByExampleSelective(@Param("record") OrganizationBranchRest record, @Param("example") OrganizationBranchRestExample example);

    int updateByExample(@Param("record") OrganizationBranchRest record, @Param("example") OrganizationBranchRestExample example);

    int updateByPrimaryKeySelective(OrganizationBranchRest record);

    int updateByPrimaryKey(OrganizationBranchRest record);
}