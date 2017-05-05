package br.crm.service.permission;

import java.util.List;

import br.crm.vo.permission.UserPermissionVo;


public interface UserPermissionCrmService {
	List<UserPermissionVo> getUserPermission(String userId);
}
