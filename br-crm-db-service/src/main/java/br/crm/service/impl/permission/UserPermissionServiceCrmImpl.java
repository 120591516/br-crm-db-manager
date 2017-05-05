package br.crm.service.impl.permission;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.common.utils.MyPredicate;
import br.crm.mapper.permission.self.BrUserRoleSelfMapper;
import br.crm.pojo.permission.OrganizationPermission;
import br.crm.service.permission.UserPermissionCrmService;
import br.crm.vo.permission.UserPermissionVo;

/**
 * 
 * @ClassName: UserPermissionServiceCrmImpl
 * @Description: 用户角色接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:19:26
 *
 */
@Service
public class UserPermissionServiceCrmImpl implements UserPermissionCrmService {

	@Autowired
	private BrUserRoleSelfMapper brUserRoleSelfMapper;

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getUserPermission
	 * </p>
	 * <p>
	 * Description:获取对象列表
	 * </p>
	 * 
	 * @param userId
	 * @return
	 * @see br.crm.service.permission.UserPermissionCrmService#getUserPermission(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<UserPermissionVo> getUserPermission(String userId) {
		List<UserPermissionVo> userPermissionVo = brUserRoleSelfMapper.getUserPermission(userId);
		List<UserPermissionVo> userPermissions = new ArrayList<UserPermissionVo>();
		for (UserPermissionVo up : userPermissionVo) {
			if (up.getPermissionParentId().intValue() == 0) {
				Predicate isProblem1 = new MyPredicate("permissionParentId", up.getPermissionId());
				up.setChildrens(((List<UserPermissionVo>) CollectionUtils.select(userPermissionVo, isProblem1)));
				userPermissions.add(up);
			}
		}
		return userPermissions;
	}

}
