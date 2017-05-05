package br.crm.service.examitem;

import java.util.List;

import br.crm.pojo.examitem.OrganizationExamItemType;

public interface OrgExamItemTypeService {

	List<OrganizationExamItemType> getAllOrgExamItemType();

	int insertOrgExamItemType(OrganizationExamItemType orgExamItemType);

	OrganizationExamItemType getOrgExamItemTypeById(String orgExamItemTypeId);

	int updateOrgExamItemType(OrganizationExamItemType orgExamItemType);
	
	void initData();

}
