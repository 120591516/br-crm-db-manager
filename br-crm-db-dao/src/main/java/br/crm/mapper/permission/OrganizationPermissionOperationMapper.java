package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationPermissionOperation;
import br.crm.pojo.permission.OrganizationPermissionOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationPermissionOperationMapper {
    int countByExample(OrganizationPermissionOperationExample example);

    int deleteByExample(OrganizationPermissionOperationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationPermissionOperation record);

    int insertSelective(OrganizationPermissionOperation record);

    List<OrganizationPermissionOperation> selectByExample(OrganizationPermissionOperationExample example);

    OrganizationPermissionOperation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationPermissionOperation record, @Param("example") OrganizationPermissionOperationExample example);

    int updateByExample(@Param("record") OrganizationPermissionOperation record, @Param("example") OrganizationPermissionOperationExample example);

    int updateByPrimaryKeySelective(OrganizationPermissionOperation record);

    int updateByPrimaryKey(OrganizationPermissionOperation record);
}