package br.crm.mapper.org;

import br.crm.pojo.org.OrganizationLicense;
import br.crm.pojo.org.OrganizationLicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationLicenseMapper {
    int countByExample(OrganizationLicenseExample example);

    int deleteByExample(OrganizationLicenseExample example);

    int deleteByPrimaryKey(Long orgLicenseId);

    int insert(OrganizationLicense record);

    int insertSelective(OrganizationLicense record);

    List<OrganizationLicense> selectByExample(OrganizationLicenseExample example);

    OrganizationLicense selectByPrimaryKey(Long orgLicenseId);

    int updateByExampleSelective(@Param("record") OrganizationLicense record, @Param("example") OrganizationLicenseExample example);

    int updateByExample(@Param("record") OrganizationLicense record, @Param("example") OrganizationLicenseExample example);

    int updateByPrimaryKeySelective(OrganizationLicense record);

    int updateByPrimaryKey(OrganizationLicense record);
}