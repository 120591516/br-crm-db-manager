package br.crm.service.branch;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.branch.OrganizationBranch;
import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.vo.branch.OrganizationBranchVo;

public interface OrgBranchService {

    String insertOrganizationBranch(OrganizationBranchVo organizationBranch);

    OrganizationBranchVo getOrganizationBranchById(String id);

    int updateOrganizationBranch(OrganizationBranchVo organizationBranch);

    PageInfo<OrganizationBranchVo> searchOrganizationBranch(OrganizationBranchVo organizationBranch, Integer page,
            Integer rows);

    int insertImgAndBranch(OrganizationBranchVo organizationBranchVo, String branchId, List<Long> list);

    List<OrganizationBranch> getOrganizationBranchAll();

    List<OrganizationBranch> getOrganizationBranchAllByOrgId(String orgid);

    PageInfo<OrganizationBranchVo> getOrganizationBranchListByOrgId(String orgId, Integer page, Integer rows,
            OrganizationBranchVo organizationBranchvo);

    List<OrganizationBranch> getOrganizationBranchAllByOrgIdOpen(String orgid, Integer page, Integer rows);

    PageInfo<OrganizationBranchVo> searchBranch(Integer page, Integer rows, OrganizationBranchVo organizationBranchVo);

    PageInfo<OrganizationBranch> getOrganizationBranchLimitPeople(Integer page, Integer rows,
            OrganizationBranchVo organizationBranchvo);

    int updateOrgBranchLimitPeople(String branchId, Integer limitPeople, Integer warnPeople);

    int insertMasterImgAndBranch(OrganizationBranchVo organizationBranchVo, String branchId, Long imgId);

    List<OrganizationBranch> getOrganizationBranchByUser(String orgId);

    List<OrganizationBranchImg> getAllBranchImg();

    List<Map<String, String>> getBranchNameByOrgId(String orgId);

    LinkedList<String> getCityByBranch();

}
