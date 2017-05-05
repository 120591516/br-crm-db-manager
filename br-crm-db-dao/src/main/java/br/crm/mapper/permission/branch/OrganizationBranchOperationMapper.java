package br.crm.mapper.permission.branch;

import br.crm.pojo.permission.branch.OrganizationBranchOperation;
import br.crm.pojo.permission.branch.OrganizationBranchOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchOperationMapper {
    int countByExample(OrganizationBranchOperationExample example);

    int deleteByExample(OrganizationBranchOperationExample example);

    int deleteByPrimaryKey(Long operationId);

    int insert(OrganizationBranchOperation record);

    int insertSelective(OrganizationBranchOperation record);

    List<OrganizationBranchOperation> selectByExample(OrganizationBranchOperationExample example);

    OrganizationBranchOperation selectByPrimaryKey(Long operationId);

    int updateByExampleSelective(@Param("record") OrganizationBranchOperation record, @Param("example") OrganizationBranchOperationExample example);

    int updateByExample(@Param("record") OrganizationBranchOperation record, @Param("example") OrganizationBranchOperationExample example);

    int updateByPrimaryKeySelective(OrganizationBranchOperation record);

    int updateByPrimaryKey(OrganizationBranchOperation record);
}