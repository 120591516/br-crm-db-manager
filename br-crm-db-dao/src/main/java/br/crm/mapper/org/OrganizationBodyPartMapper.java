package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationBodyPart;
import br.crm.pojo.org.OrganizationBodyPartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationBodyPartMapper {
    int countByExample(OrganizationBodyPartExample example);

    int deleteByExample(OrganizationBodyPartExample example);

    int deleteByPrimaryKey(String bodyPartId);

    int insert(OrganizationBodyPart record);

    int insertSelective(OrganizationBodyPart record);

    List<OrganizationBodyPart> selectByExample(OrganizationBodyPartExample example);

    OrganizationBodyPart selectByPrimaryKey(String bodyPartId);

    int updateByExampleSelective(@Param("record") OrganizationBodyPart record, @Param("example") OrganizationBodyPartExample example);

    int updateByExample(@Param("record") OrganizationBodyPart record, @Param("example") OrganizationBodyPartExample example);

    int updateByPrimaryKeySelective(OrganizationBodyPart record);

    int updateByPrimaryKey(OrganizationBodyPart record);
}