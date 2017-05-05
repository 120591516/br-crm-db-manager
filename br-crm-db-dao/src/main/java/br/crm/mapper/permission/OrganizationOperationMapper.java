package br.crm.mapper.permission;

import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationOperationMapper {
    int countByExample(OrganizationOperationExample example);

    int deleteByExample(OrganizationOperationExample example);

    int deleteByPrimaryKey(Long operationId);

    int insert(OrganizationOperation record);

    int insertSelective(OrganizationOperation record);

    List<OrganizationOperation> selectByExample(OrganizationOperationExample example);

    OrganizationOperation selectByPrimaryKey(Long operationId);

    int updateByExampleSelective(@Param("record") OrganizationOperation record, @Param("example") OrganizationOperationExample example);

    int updateByExample(@Param("record") OrganizationOperation record, @Param("example") OrganizationOperationExample example);

    int updateByPrimaryKeySelective(OrganizationOperation record);

    int updateByPrimaryKey(OrganizationOperation record);
}