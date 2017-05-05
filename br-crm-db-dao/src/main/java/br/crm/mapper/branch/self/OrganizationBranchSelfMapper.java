package br.crm.mapper.branch.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.vo.branch.OrganizationBranchVo;

public interface OrganizationBranchSelfMapper {

	OrganizationBranchVo selectByPrimaryKey(@Param("id")String id);

	List<OrganizationBranchVo> selectByCondition(@Param("organizationBranchVo")OrganizationBranchVo organizationBranchVo);


}
