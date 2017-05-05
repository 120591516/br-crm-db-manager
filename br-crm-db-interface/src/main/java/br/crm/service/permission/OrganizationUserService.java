package br.crm.service.permission;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.permission.OrgUserVo;

public interface OrganizationUserService {
	PageInfo<OrgUserVo> getOrgUserByCondition(int page, int rows, OrgUserVo orgUserVo);

	String addOrgUser(OrganizationUser user);

	int updateOrgUser(OrganizationUser user);

	OrgUserVo getOrgUserByPid(String doctorId);

	OrganizationUser getOrgUser(String doctorId);

	List<OrganizationUser> getOrgUserByFid(String fid);

	List<OrganizationUser> getOrgUserAll();

	OrganizationUser getOrgUserByOrgId(String orgId);

	List<OrganizationUser> getOrgUserAllByOrgId(String orgId);
	
	void initData();

	int addOrgUserByOrg(OrganizationUser organizationUser);

    List<OrganizationUser> getOrgUserByDept(String orgBranchDeptId);

    int resetOrgUserPwd(String userId);
}
