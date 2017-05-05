package br.crm.service.branch;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.branch.OrganizationBranchRest;

public interface OrgRestService {

    int insertOrganizationRest(OrganizationBranchRest organizationBranchRest);

    List<OrganizationBranchRest> getOrganizationRestById(String id);

    int updateOrganizationRest(OrganizationBranchRest branchRest);

    /**
     * @param rows 
     * @param page  
    * @Title: getOrganizationRestDayById 
    * @Description: TODO
    * @param @param id
    * @param @return    
    * @return PageInfo<OrganizationBranchRest>    
    * @throws 
    */
    PageInfo<OrganizationBranchRest> getOrganizationRestDayById(String id, Integer page, Integer rows);

    /** 
    * @Title: getOrganizationRestDayByIdAll 
    * @Description: TODO
    * @param @param id
    * @param @return    
    * @return List<OrganizationBranchRest>    
    * @throws 
    */
    List<OrganizationBranchRest> getOrganizationRestDayByIdAll(String id);

    List<OrganizationBranchRest> getOrgBranchRestList();
}
