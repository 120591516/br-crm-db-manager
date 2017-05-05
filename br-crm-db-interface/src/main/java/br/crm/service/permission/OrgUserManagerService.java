package br.crm.service.permission;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.permission.OrganizationUserManager;
import br.crm.vo.permission.OrganizationUserManagerVo;

/** 
* 
* @ClassName: OrgUserManagerService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年11月17日 上午10:08:47 
*/
public interface OrgUserManagerService {
    void initData();
    
    int insertOrgUserManager(OrganizationUserManager orgUserManager);
    
    List<OrganizationUserManagerVo> getOrgUserManagerByUserId(String userId,String orgId);
    
    int updateOrgUserManager(OrganizationUserManager orgUserManager);

    PageInfo<OrganizationUserManagerVo> getOrgUserManagerByPage(Integer page, Integer rows, String orgId);

    OrganizationUserManagerVo getOrgUserManager(String useManagerId);
    
}
