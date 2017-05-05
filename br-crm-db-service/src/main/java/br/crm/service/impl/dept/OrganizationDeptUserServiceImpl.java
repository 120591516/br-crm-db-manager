package br.crm.service.impl.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.dept.OrganizationDeptUserMapper;
import br.crm.pojo.dept.OrganizationDeptUser;
import br.crm.pojo.dept.OrganizationDeptUserExample;
import br.crm.service.dept.OrganizationDeptUserService;

/**
 * 
 * @ClassName: OrganizationDeptUserServiceImpl
 * @Description: 科室员工维护表接口实现
 * @author zxy
 * @date 2016年9月13日 下午3:34:47
 *
 */
@Service
public class OrganizationDeptUserServiceImpl implements OrganizationDeptUserService {

    @Autowired
    private OrganizationDeptUserMapper organizationDeptUsermapper;

    /**
     * 新增科室员工
     * <p>
     * Title: addOrganizationDeptUser
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param deptUser
     *            科室员工对象
     * @return
     * @see br.crm.service.org.OrganizationDeptUserService#addOrganizationDeptUser(br.crm.pojo.org.OrganizationDeptUser)
     */
    @Override
    public int addOrganizationDeptUser(OrganizationDeptUser deptUser) {
        deptUser.setId(UUIDUtils.getId());
        return organizationDeptUsermapper.insert(deptUser);
    }

    /**
     * 修改科室员工
     * <p>
     * Title: updateOrganizationDeptUser
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param deptUser
     *            科室员工对象
     * @return
     * @see br.crm.service.org.OrganizationDeptUserService#updateOrganizationDeptUser(br.crm.pojo.org.OrganizationDeptUser)
     */
    @Override
    public int updateOrganizationDeptUser(OrganizationDeptUser deptUser) {
        OrganizationDeptUserExample example = new OrganizationDeptUserExample();
        example.createCriteria().andUserIdEqualTo(deptUser.getUserId());
        example.createCriteria().andUserIdEqualTo(deptUser.getDeptId());
        return organizationDeptUsermapper.updateByExampleSelective(deptUser, example);
    }

    /**
     * 删除科室员工信息
     * <p>
     * Title: deleteOrganizationDeptUser
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param pid
     *            科室员工id
     * @return
     * @see br.crm.service.org.OrganizationDeptUserService#deleteOrganizationDeptUser(java.lang.String)
     */
    @Override
    public int deleteOrganizationDeptUser(String pid) {
        OrganizationDeptUserExample example = new OrganizationDeptUserExample();
        example.createCriteria().andUserIdEqualTo(pid);
        return organizationDeptUsermapper.deleteByExample(example);
    }

    @Override
    public OrganizationDeptUser getOrganizationDeptUserByDeptId(String deptId) {
        OrganizationDeptUserExample example = new OrganizationDeptUserExample();
        example.createCriteria().andDeptIdEqualTo(deptId);
        return organizationDeptUsermapper.selectByExample(example).get(0);
    }

    @Override
    public List<OrganizationDeptUser> getAll() {
        List<OrganizationDeptUser> list = organizationDeptUsermapper.selectByExample(null);
        return list;
    }

}
