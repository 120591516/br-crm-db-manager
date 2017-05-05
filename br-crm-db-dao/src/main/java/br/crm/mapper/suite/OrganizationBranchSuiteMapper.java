package br.crm.mapper.suite;

import br.crm.pojo.suite.OrganizationBranchSuite;
import br.crm.pojo.suite.OrganizationBranchSuiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchSuiteMapper {
    int countByExample(OrganizationBranchSuiteExample example);

    int deleteByExample(OrganizationBranchSuiteExample example);

    int deleteByPrimaryKey(String branchSuiteId);

    int insert(OrganizationBranchSuite record);

    int insertSelective(OrganizationBranchSuite record);

    List<OrganizationBranchSuite> selectByExample(OrganizationBranchSuiteExample example);

    OrganizationBranchSuite selectByPrimaryKey(String branchSuiteId);

    int updateByExampleSelective(@Param("record") OrganizationBranchSuite record, @Param("example") OrganizationBranchSuiteExample example);

    int updateByExample(@Param("record") OrganizationBranchSuite record, @Param("example") OrganizationBranchSuiteExample example);

    int updateByPrimaryKeySelective(OrganizationBranchSuite record);

    int updateByPrimaryKey(OrganizationBranchSuite record);
}