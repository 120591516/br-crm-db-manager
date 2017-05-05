package br.crm.mapper.permission.branch;

import br.crm.pojo.permission.branch.OrganizationBranchPermissionOperation;
import br.crm.pojo.permission.branch.OrganizationBranchPermissionOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchPermissionOperationMapper {
    int countByExample(OrganizationBranchPermissionOperationExample example);

    int deleteByExample(OrganizationBranchPermissionOperationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationBranchPermissionOperation record);

    int insertSelective(OrganizationBranchPermissionOperation record);

    List<OrganizationBranchPermissionOperation> selectByExample(OrganizationBranchPermissionOperationExample example);

    OrganizationBranchPermissionOperation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationBranchPermissionOperation record, @Param("example") OrganizationBranchPermissionOperationExample example);

    int updateByExample(@Param("record") OrganizationBranchPermissionOperation record, @Param("example") OrganizationBranchPermissionOperationExample example);

    int updateByPrimaryKeySelective(OrganizationBranchPermissionOperation record);

    int updateByPrimaryKey(OrganizationBranchPermissionOperation record);
}