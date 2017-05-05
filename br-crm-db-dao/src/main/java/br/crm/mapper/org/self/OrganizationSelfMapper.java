package br.crm.mapper.org.self;

import br.crm.vo.org.OrganizationQu;
import br.crm.vo.org.OrganizationVo;
import br.crm.vo.org.RegistOrgInfoVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationSelfMapper {

	List<OrganizationVo> getOrganizationByPage(@Param("organizationQu")OrganizationQu organizationQu);

	OrganizationVo getOrgAllInfoById(Long orgId);

	int insertOrganization(@Param("registOrgInfoVo") RegistOrgInfoVo registOrgInfoVo);

	int insertOrganizationConn(@Param("registOrgInfoVo") RegistOrgInfoVo registOrgInfoVo);

	int insertOrganizationLicense(@Param("registOrgInfoVo") RegistOrgInfoVo registOrgInfoVo);

	OrganizationVo getOrganizationById(Long orgId);


}