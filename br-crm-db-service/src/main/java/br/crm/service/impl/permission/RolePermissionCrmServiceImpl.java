package br.crm.service.impl.permission;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.mapper.permission.OrganizationOperationMapper;
import br.crm.mapper.permission.OrganizationPermissionMapper;
import br.crm.mapper.permission.OrganizationPermissionOperationMapper;
import br.crm.mapper.permission.OrganizationRolePermissionMapper;
import br.crm.mapper.permission.self.BrOperationMapperQu;
import br.crm.mapper.permission.self.BrRolePermissionSelfMapper;
import br.crm.pojo.permission.OrganizationOperation;
import br.crm.pojo.permission.OrganizationOperationExample;
import br.crm.pojo.permission.OrganizationPermission;
import br.crm.pojo.permission.OrganizationPermissionExample;
import br.crm.pojo.permission.OrganizationPermissionOperationExample;
import br.crm.pojo.permission.OrganizationRolePermission;
import br.crm.pojo.permission.OrganizationRolePermissionExample;
import br.crm.service.permission.RolePermissionCrmService;
import br.crm.vo.permission.PermissionResult;
import br.crm.vo.permission.UserPermissionVo;

/**
 * 
 * @ClassName: RolePermissionCrmServiceImpl
 * @Description: 角色权限接口实现
 * @author zxy
 * @date 2016年9月13日 下午4:16:51
 *
 */
@Service
public class RolePermissionCrmServiceImpl implements RolePermissionCrmService {

	@Autowired
	private BrRolePermissionSelfMapper brRolePermissionSelfMapper;

	@Autowired
	private OrganizationPermissionMapper organizationPermissionMapper;

	@Autowired
	private BrOperationMapperQu brOperationMapperQu;

	@Autowired
	private OrganizationOperationMapper organizationOperationMapper;

	@Autowired
	private OrganizationRolePermissionMapper organizationRolePermissionMapper;

	@Autowired
	private OrganizationPermissionOperationMapper organizationPermissionOperationMapper;

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getPermissionList
	 * </p>
	 * <p>
	 * Description:获取列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getPermissionList()
	 */
	@Override
	public List<PermissionResult> getPermissionList() {

		List<PermissionResult> list = brRolePermissionSelfMapper.selectAllPermission();
		List<PermissionResult> listResult = new ArrayList<PermissionResult>();
		for (PermissionResult p : list) {// 遍历所有的权限

			PermissionResult per = new PermissionResult();

			if (p.getpId().intValue() == 0) {

				per.setId(p.getId());

				per.setName(p.getName());

				per.setChecked(p.isChecked());

				per.setpId(p.getpId());

				for (PermissionResult p2 : list) {

					if (per.getId().longValue() == p2.getpId().longValue()) {

						per.getChildren().add(p2);
					}
				}
				listResult.add(per);
			}

		}

		return listResult;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getMenuList
	 * </p>
	 * <p>
	 * Description:获取菜单列表
	 * </p>
	 * 
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getMenuList()
	 */
	@Override
	public List<OrganizationPermission> getMenuList() {
		OrganizationPermissionExample  example =new OrganizationPermissionExample();
		example.createCriteria().andPermissionParentIdEqualTo(0L).andPermissionStatusEqualTo(0).andPermissionLevelEqualTo(1);
		List<OrganizationPermission> list = organizationPermissionMapper.selectByExample(example);

		return list;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: insertPermission
	 * </p>
	 * <p>
	 * Description:添加对象
	 * </p>
	 * 
	 * @param brPermission
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#insertPermission(br.crm.pojo.permission.OrganizationPermission)
	 */
	@Override
	public int insertPermission(OrganizationPermission brPermission) {
		if (brPermission.getPermissionId() != null) {
			return organizationPermissionMapper.updateByPrimaryKey(brPermission);
		}
		return organizationPermissionMapper.insertSelective(brPermission);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBrOperationList
	 * </p>
	 * <p>
	 * Description: 获取列表
	 * </p>
	 * 
	 * @param permissionId
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getBrOperationList(java.lang.Long)
	 */
	@Override
	public List<OrganizationOperation> getBrOperationList(Long permissionId) {

		List<OrganizationOperation> list = brOperationMapperQu.getBrOperationList(permissionId.intValue());

		return list;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: addBrOperationByPermissionId
	 * </p>
	 * <p>
	 * Description:根据permissionid添加对象
	 * </p>
	 * 
	 * @param brOperation
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#addBrOperationByPermissionId(br.crm.pojo.permission.OrganizationOperation)
	 */
	@Override
	public int addBrOperationByPermissionId(OrganizationOperation brOperation) {

		return organizationOperationMapper.insertSelective(brOperation);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: deletePermissionById
	 * </p>
	 * <p>
	 * Description:根据id删除对象
	 * </p>
	 * 
	 * @param permissionId
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#deletePermissionById(java.lang.Long)
	 */
	@Override
	public int deletePermissionById(Long permissionId) {

		OrganizationPermission brPermission = organizationPermissionMapper.selectByPrimaryKey(permissionId);

		brPermission.setPermissionStatus(1);
		// 根据权限的ID查询操作ID
		OrganizationOperationExample example = new OrganizationOperationExample();
		example.createCriteria().andPermissionIdEqualTo(permissionId);
		List<OrganizationOperation> OList = organizationOperationMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(OList)) {
			for (OrganizationOperation organizationOperation : OList) {
				// 在根据操作ID删除中间表
				OrganizationPermissionOperationExample permissionOperationExample = new OrganizationPermissionOperationExample();
				permissionOperationExample.createCriteria()
						.andOperationIdEqualTo(organizationOperation.getOperationId());
				organizationPermissionOperationMapper.deleteByExample(permissionOperationExample);
			}
		}

		return organizationPermissionMapper.updateByPrimaryKey(brPermission);
	}

	@Override
	public int deleteOperationById(Long id) {
		OrganizationOperation operation = organizationOperationMapper.selectByPrimaryKey(id);
		operation.setOperationStatus(1);
		organizationOperationMapper.updateByPrimaryKeySelective(operation);
		// 删除中间表
		OrganizationPermissionOperationExample example = new OrganizationPermissionOperationExample();
		example.createCriteria().andOperationIdEqualTo(id);
		organizationPermissionOperationMapper.deleteByExample(example);
		return 1;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updatePermissionById
	 * </p>
	 * <p>
	 * Description: 根据id修改对象
	 * </p>
	 * 
	 * @param brPermission
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#updatePermissionById(br.crm.pojo.permission.OrganizationPermission)
	 */
	@Override
	public int updatePermissionById(OrganizationPermission brPermission) {

		return organizationPermissionMapper.updateByPrimaryKeySelective(brPermission);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBrPermissionById
	 * </p>
	 * <p>
	 * Description:根据id获取对象
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getBrPermissionById(java.lang.Long)
	 */
	@Override
	public OrganizationPermission getBrPermissionById(Long id) {

		return organizationPermissionMapper.selectByPrimaryKey(id);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: selectBrOperationById
	 * </p>
	 * <p>
	 * Description:根据id获取对象信息
	 * </p>
	 * 
	 * @param operationId
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#selectBrOperationById(java.lang.Long)
	 */
	@Override
	public OrganizationOperation selectBrOperationById(Long operationId) {

		return organizationOperationMapper.selectByPrimaryKey(operationId);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: updateBrOperationById
	 * </p>
	 * <p>
	 * Description:根据id修改对象
	 * </p>
	 * 
	 * @param brOperation
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#updateBrOperationById(br.crm.pojo.permission.OrganizationOperation)
	 */
	@Override
	public int updateBrOperationById(OrganizationOperation brOperation) {

		return organizationOperationMapper.updateByPrimaryKey(brOperation);
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getBrOperationListByIdAndOpen
	 * </p>
	 * <p>
	 * Description:根据idadnopen获取对象列表
	 * </p>
	 * 
	 * @param permissionId
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getBrOperationListByIdAndOpen(java.lang.Long)
	 */
	@Override
	public List<OrganizationOperation> getBrOperationListByIdAndOpen(Long permissionId) {

		List<OrganizationOperation> list = brOperationMapperQu.getBrOperationListByIdAndOpen(permissionId.intValue());

		return list;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: getPermissionsByRoleId
	 * </p>
	 * <p>
	 * Description: 根据roleid获取对象列表
	 * </p>
	 * 
	 * @param rolelist
	 * @return
	 * @see br.crm.service.permission.RolePermissionCrmService#getPermissionsByRoleId(java.util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserPermissionVo> getPermissionsByRoleId(List<Long> rolelist) {

		List<UserPermissionVo> result = new ArrayList<UserPermissionVo>();

		List<OrganizationRolePermission> rolePermissionList = getRolePermissionsByRoleId(rolelist);
		List<OrganizationPermission> permissionListAll = new ArrayList<OrganizationPermission>();
		// 根据权限的id查询权限
		for (OrganizationRolePermission organizationRolePermission : rolePermissionList) {
			OrganizationPermission organizationPermission = organizationPermissionMapper.selectByPrimaryKey(organizationRolePermission.getPermissionId());
			if (!permissionListAll.contains(organizationPermission) && organizationPermission.getPermissionLevel().intValue() == 1) {
				permissionListAll.add(organizationPermission);
			}else {
				continue;
			}
			OrganizationPermissionExample opexample = new OrganizationPermissionExample();
			opexample.createCriteria().andPermissionParentIdEqualTo(organizationPermission.getPermissionId());
			List<OrganizationPermission> childrenList = organizationPermissionMapper.selectByExample(opexample);
			UserPermissionVo vo = new UserPermissionVo();
			try {
				BeanUtils.copyProperties(vo, organizationPermission);
			} catch (Exception e) {
				e.printStackTrace();
			}
			List<UserPermissionVo> permissionChildList = new ArrayList<UserPermissionVo>();
			for (OrganizationPermission organizationPermission2 : childrenList) {
				UserPermissionVo vo1 = new UserPermissionVo();
				try {
					BeanUtils.copyProperties(vo1, organizationPermission2);
				} catch (Exception e) {
					e.printStackTrace();
				}
				permissionChildList.add(vo1);
			}
			vo.setChildrens(permissionChildList);
			result.add(vo);
		}
		return result;
	}

	@Override
	public OrganizationOperation getBrOperationById(Long operationId) {

		return organizationOperationMapper.selectByPrimaryKey(operationId);
	}

	@Override
	public int updateBrOperation(OrganizationOperation organizationOperation) {

		return organizationOperationMapper.updateByPrimaryKeySelective(organizationOperation);
	}

	@Override
	public List<OrganizationRolePermission> getRolePermissionsByRoleId(List<Long> rolelist) {
		List<OrganizationRolePermission> rolePermissionList = new ArrayList<OrganizationRolePermission>();

		// 根据角色的id查询出权限
		for (Long RoleId : rolelist) {

			OrganizationRolePermissionExample example = new OrganizationRolePermissionExample();
			example.createCriteria().andRoleIdEqualTo(RoleId);
			List<OrganizationRolePermission> list = organizationRolePermissionMapper.selectByExample(example);
			for (OrganizationRolePermission organizationRolePermission : list) {
				if (!rolePermissionList.contains(organizationRolePermission)) {
					rolePermissionList.add(organizationRolePermission);
				}
			}
		}
		return rolePermissionList;
	}

}
