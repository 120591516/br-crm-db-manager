package br.crm.service.permission;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.permission.OrganizationUser;
import br.crm.vo.permission.OrgUserVo;
import br.crm.vo.permission.OrganizationRoleVo;
import br.crm.vo.permission.RoleModel;

public interface UserManageCrmService {

	PageInfo<OrgUserVo> getUserByPage(Integer page, Integer rows, OrgUserVo user);
	
	OrganizationUser getUserByUserName(String userName);
	
	OrganizationUser login(String userName, String password);

	int insertBrUser(OrganizationUser brUser);

	int updateBrUser(OrganizationUser brUser);

	int insertUserRole(String strRolesId,String userId, OrgUserVo user);
	
	int insertUserRoleOne(int RoleId,String userId);

	int updateUserRole(String strRolesId,String userId, OrgUserVo user);

	OrganizationRoleVo getUserRoleById(String userId);

	OrganizationUser getBrUserById(String userId);

	int getCountByUserName(String userName, String userId);

	List<RoleModel> getRolesByUserId(String orgId,String userId);

	Map<String,Object> getBranchAndOrgbyUserId(String userId);

	
}
