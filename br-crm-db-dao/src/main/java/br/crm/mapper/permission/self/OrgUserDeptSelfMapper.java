package br.crm.mapper.permission.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.permission.OrgUserVo;

public interface OrgUserDeptSelfMapper {

	OrgUserVo getOrgUserByPid(@Param("pid") String pid);
	
	List<OrganizationUser> getOrgUserByFid(@Param("fid")String fid);

}
