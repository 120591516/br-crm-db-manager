package br.crm.mapper.branch;

import br.crm.pojo.branch.OrganizationBranchImg;
import br.crm.pojo.branch.OrganizationBranchImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBranchImgMapper {
    int countByExample(OrganizationBranchImgExample example);

    int deleteByExample(OrganizationBranchImgExample example);

    int deleteByPrimaryKey(String orgBranchImgId);

    int insert(OrganizationBranchImg record);

    int insertSelective(OrganizationBranchImg record);

    List<OrganizationBranchImg> selectByExample(OrganizationBranchImgExample example);

    OrganizationBranchImg selectByPrimaryKey(String orgBranchImgId);

    int updateByExampleSelective(@Param("record") OrganizationBranchImg record, @Param("example") OrganizationBranchImgExample example);

    int updateByExample(@Param("record") OrganizationBranchImg record, @Param("example") OrganizationBranchImgExample example);

    int updateByPrimaryKeySelective(OrganizationBranchImg record);

    int updateByPrimaryKey(OrganizationBranchImg record);
}