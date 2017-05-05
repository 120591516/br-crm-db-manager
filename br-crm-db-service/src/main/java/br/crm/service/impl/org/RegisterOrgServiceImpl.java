package br.crm.service.impl.org;

import java.util.Date;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.crm.common.utils.UUIDUtils;
import br.crm.mapper.org.OrganizationBranchUserMapper;
import br.crm.mapper.org.OrganizationMapper;
import br.crm.mapper.org.self.OrganizationSelfMapper;
import br.crm.mapper.permission.OrganizationUserMapper;
import br.crm.pojo.org.OrganizationBranchUser;
import br.crm.pojo.org.OrganizationExample;
import br.crm.pojo.permission.OrganizationUser;
import br.crm.pojo.permission.OrganizationUserExample;
import br.crm.pojo.permission.OrganizationUserExample.Criteria;
import br.crm.service.org.RegisterOrgService;
import br.crm.service.system.SystemConfigService;
import br.crm.vo.org.RegistOrgInfoVo;
import br.order.redis.org.OrgRedis;

/**
 * 
 * @ClassName: RegisterOrgServiceImpl
 * @Description: TODO 注册机构用户
 * @author admin
 * @date 2016年9月13日 下午3:28:28
 *
 */
@Service
public class RegisterOrgServiceImpl implements RegisterOrgService {
    @Autowired
    private OrganizationSelfMapper organizationSelfMapper;

    @Autowired
    private OrganizationUserMapper organizationUserMapper;

    @Autowired
    private OrganizationBranchUserMapper organizationBranchUserMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private OrgRedis orgRedis;

    @Autowired
    private SystemConfigService systemConfigService;

    /**
     * 
     * <p>
     * Title: insertOrgInfo
     * </p>
     * <p>
     * Description:插入信息
     * </p>
     * 
     * @param registOrgInfoVo
     * @return
     * @see br.crm.service.org.RegisterOrgService#insertOrgInfo(br.crm.vo.org.RegistOrgInfoVo)
     */
    @Override
    public int insertOrgInfo(RegistOrgInfoVo registOrgInfoVo) {
        if (registOrgInfoVo != null) {
            registOrgInfoVo.setOrgId(UUIDUtils.getId());
            registOrgInfoVo.setOrgStatus(2);
            registOrgInfoVo.setOrgCreateTime(new Date());
            registOrgInfoVo.setProvinceId(registOrgInfoVo.getProvinceId());
            registOrgInfoVo.setCityId(registOrgInfoVo.getCityId());
            registOrgInfoVo.setOrgEditTime(registOrgInfoVo.getOrgCreateTime());
            registOrgInfoVo.setOrgConnStatus(0);
            registOrgInfoVo.setOrgConnCreateTime(registOrgInfoVo.getOrgCreateTime());
            registOrgInfoVo.setOrgConnEditTime(registOrgInfoVo.getOrgCreateTime());
            registOrgInfoVo.setOrgLicenseCreateTime(registOrgInfoVo.getOrgCreateTime());
            registOrgInfoVo.setOrgLicenseEditTime(registOrgInfoVo.getOrgCreateTime());
            if (registOrgInfoVo.getOrgNature().intValue() == 1) {
                registOrgInfoVo.setOrgLevelId(1000);
            }
            int i = organizationSelfMapper.insertOrganization(registOrgInfoVo);
            if (systemConfigService.getRedis()) {
                orgRedis.setOrganization(registOrgInfoVo);
            }
            if (i > 0) {
                int j = organizationSelfMapper.insertOrganizationConn(registOrgInfoVo);
                if (j > 0) {
                    int k = organizationSelfMapper.insertOrganizationLicense(registOrgInfoVo);
                    if (k > 0) {
                        String salt = registOrgInfoVo.getUserLoginName();
                        Md5Hash md5 = new Md5Hash(registOrgInfoVo.getUserPassword(), salt, 2);
                        registOrgInfoVo.setUserPassword(md5.toString());
                        OrganizationUser organizationUser = new OrganizationUser();
                        organizationUser.setUserId(UUIDUtils.getId());
                        organizationUser.setUserLoginName(registOrgInfoVo.getUserLoginName());
                        organizationUser.setOrgId(registOrgInfoVo.getOrgId());
                        organizationUser.setUserName(registOrgInfoVo.getOrgConnName());
                        organizationUser.setUserEmail(registOrgInfoVo.getOrgConnEmail());
                        organizationUser.setUserPhone(registOrgInfoVo.getOrgConnPhone());
                        organizationUser.setUserPassword(registOrgInfoVo.getUserPassword());
                        organizationUser.setUserStatus(1);
                        organizationUser.setUserCreateTime(new Date());
                        organizationUser.setUserEditTime(new Date());
                        int m = organizationUserMapper.insertSelective(organizationUser);
                        if (m > 0) {
                            registOrgInfoVo.setOrgBranchUserId(UUIDUtils.getId());
                            OrganizationBranchUser organizationBranchUser = new OrganizationBranchUser();
                            organizationBranchUser.setOrgBranchUserId(UUIDUtils.getId());
                            organizationBranchUser.setOrgId(registOrgInfoVo.getOrgId());
                            organizationBranchUser.setOrgUserId(organizationUser.getUserId());
                            organizationBranchUser.setOrgBranchId("");
                            organizationBranchUser.setOrgBranchUserStatus(0);
                            organizationBranchUser.setOrgBranchUserCreateTime(new Date());
                            organizationBranchUser.setOrgBranchUserEditTime(new Date());
                            int n = organizationBranchUserMapper.insertSelective(organizationBranchUser);
                            if (n > 0) {
                                return i;
                            }
                        }
                    }
                }
            }

        }
        return 0;
    }

    /**
     * 
     * <p>
     * Title: getCountByUserName
     * </p>
     * <p>
     * Description: 重名验证
     * </p>
     * 
     * @param userName
     * @param userId
     * @return
     * @see br.crm.service.org.RegisterOrgService#getCountByUserName(java.lang.String,
     *      java.lang.Long)
     */
    @Override
    public int getCountByUserName(String userName) {
        int i = 0;
        OrganizationUserExample example = new OrganizationUserExample();
        Criteria criteria = example.createCriteria();
        // 新增
        criteria.andUserLoginNameEqualTo(userName);
        i = organizationUserMapper.countByExample(example);
        return i;
    }

    @Override
    public int getCountByOrganizationTotalName(String totalName) {
        int i = 0;
        OrganizationExample example = new OrganizationExample();
        example.createCriteria().andOrgTotalNameEqualTo(totalName.toLowerCase().trim());
        i = organizationMapper.countByExample(example);
        return i;
    }

}
