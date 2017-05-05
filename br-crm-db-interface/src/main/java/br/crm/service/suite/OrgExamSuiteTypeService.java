package br.crm.service.suite;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.crm.pojo.suite.OrganizationExamSuiteType;

public interface OrgExamSuiteTypeService {

    PageInfo<OrganizationExamSuiteType> getOrgExamSuiteTypeList(Integer page, Integer rows);

    int insertOrgExamSuiteType(OrganizationExamSuiteType organizationExamSuiteType);

    int updateOrgExamSuiteType(OrganizationExamSuiteType oest);

    //套餐绑定类型 
    void initData();

    List<OrganizationExamSuiteType> getOrgExamSuiteTypeList(OrganizationExamSuiteType param);
}
