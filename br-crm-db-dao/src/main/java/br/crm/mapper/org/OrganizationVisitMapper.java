package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationVisit;
import br.crm.pojo.org.OrganizationVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationVisitMapper {
    int countByExample(OrganizationVisitExample example);

    int deleteByExample(OrganizationVisitExample example);

    int deleteByPrimaryKey(Long orgVisitId);

    int insert(OrganizationVisit record);

    Long insertSelective(OrganizationVisit record);

    List<OrganizationVisit> selectByExample(OrganizationVisitExample example);

    OrganizationVisit selectByPrimaryKey(Long orgVisitId);

    int updateByExampleSelective(@Param("record") OrganizationVisit record, @Param("example") OrganizationVisitExample example);

    int updateByExample(@Param("record") OrganizationVisit record, @Param("example") OrganizationVisitExample example);

    int updateByPrimaryKeySelective(OrganizationVisit record);

    int updateByPrimaryKey(OrganizationVisit record);
}