package br.crm.vo.permission;

import java.io.Serializable;

import br.crm.pojo.permission.OrganizationUserManager;

/** 
* 
* @ClassName: OrganizationUserManagerVo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年11月24日 上午9:54:36 
*/
public class OrganizationUserManagerVo extends OrganizationUserManager implements Serializable {
    private String userName;

    private String userManagerEditPersonName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserManagerEditPersonName() {
        return userManagerEditPersonName;
    }

    public void setUserManagerEditPersonName(String userManagerEditPersonName) {
        this.userManagerEditPersonName = userManagerEditPersonName;
    }

}
