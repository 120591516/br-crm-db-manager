package br.crm.pojo.examfeeitem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamFeeItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamFeeItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIsNull() {
            addCriterion("organization_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIsNotNull() {
            addCriterion("organization_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdEqualTo(String value) {
            addCriterion("organization_branch_id =", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotEqualTo(String value) {
            addCriterion("organization_branch_id <>", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdGreaterThan(String value) {
            addCriterion("organization_branch_id >", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_branch_id >=", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLessThan(String value) {
            addCriterion("organization_branch_id <", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLessThanOrEqualTo(String value) {
            addCriterion("organization_branch_id <=", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLike(String value) {
            addCriterion("organization_branch_id like", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotLike(String value) {
            addCriterion("organization_branch_id not like", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIn(List<String> values) {
            addCriterion("organization_branch_id in", values, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotIn(List<String> values) {
            addCriterion("organization_branch_id not in", values, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdBetween(String value1, String value2) {
            addCriterion("organization_branch_id between", value1, value2, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotBetween(String value1, String value2) {
            addCriterion("organization_branch_id not between", value1, value2, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIsNull() {
            addCriterion("exam_fee_item_name is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIsNotNull() {
            addCriterion("exam_fee_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEqualTo(String value) {
            addCriterion("exam_fee_item_name =", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotEqualTo(String value) {
            addCriterion("exam_fee_item_name <>", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameGreaterThan(String value) {
            addCriterion("exam_fee_item_name >", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name >=", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLessThan(String value) {
            addCriterion("exam_fee_item_name <", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name <=", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLike(String value) {
            addCriterion("exam_fee_item_name like", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotLike(String value) {
            addCriterion("exam_fee_item_name not like", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIn(List<String> values) {
            addCriterion("exam_fee_item_name in", values, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotIn(List<String> values) {
            addCriterion("exam_fee_item_name not in", values, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name between", value1, value2, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name not between", value1, value2, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrIsNull() {
            addCriterion("exam_fee_item_name_abr is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrIsNotNull() {
            addCriterion("exam_fee_item_name_abr is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrEqualTo(String value) {
            addCriterion("exam_fee_item_name_abr =", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrNotEqualTo(String value) {
            addCriterion("exam_fee_item_name_abr <>", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrGreaterThan(String value) {
            addCriterion("exam_fee_item_name_abr >", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_abr >=", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrLessThan(String value) {
            addCriterion("exam_fee_item_name_abr <", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_abr <=", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrLike(String value) {
            addCriterion("exam_fee_item_name_abr like", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrNotLike(String value) {
            addCriterion("exam_fee_item_name_abr not like", value, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrIn(List<String> values) {
            addCriterion("exam_fee_item_name_abr in", values, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrNotIn(List<String> values) {
            addCriterion("exam_fee_item_name_abr not in", values, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_abr between", value1, value2, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameAbrNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_abr not between", value1, value2, "examFeeItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngIsNull() {
            addCriterion("exam_fee_item_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngIsNotNull() {
            addCriterion("exam_fee_item_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng =", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngNotEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng <>", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngGreaterThan(String value) {
            addCriterion("exam_fee_item_name_eng >", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng >=", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngLessThan(String value) {
            addCriterion("exam_fee_item_name_eng <", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng <=", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngLike(String value) {
            addCriterion("exam_fee_item_name_eng like", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngNotLike(String value) {
            addCriterion("exam_fee_item_name_eng not like", value, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngIn(List<String> values) {
            addCriterion("exam_fee_item_name_eng in", values, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngNotIn(List<String> values) {
            addCriterion("exam_fee_item_name_eng not in", values, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_eng between", value1, value2, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_eng not between", value1, value2, "examFeeItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrIsNull() {
            addCriterion("exam_fee_item_name_eng_abr is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrIsNotNull() {
            addCriterion("exam_fee_item_name_eng_abr is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng_abr =", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrNotEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng_abr <>", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrGreaterThan(String value) {
            addCriterion("exam_fee_item_name_eng_abr >", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng_abr >=", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrLessThan(String value) {
            addCriterion("exam_fee_item_name_eng_abr <", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name_eng_abr <=", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrLike(String value) {
            addCriterion("exam_fee_item_name_eng_abr like", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrNotLike(String value) {
            addCriterion("exam_fee_item_name_eng_abr not like", value, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrIn(List<String> values) {
            addCriterion("exam_fee_item_name_eng_abr in", values, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrNotIn(List<String> values) {
            addCriterion("exam_fee_item_name_eng_abr not in", values, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_eng_abr between", value1, value2, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEngAbrNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name_eng_abr not between", value1, value2, "examFeeItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeIsNull() {
            addCriterion("exam_fee_item_code is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeIsNotNull() {
            addCriterion("exam_fee_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeEqualTo(String value) {
            addCriterion("exam_fee_item_code =", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotEqualTo(String value) {
            addCriterion("exam_fee_item_code <>", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeGreaterThan(String value) {
            addCriterion("exam_fee_item_code >", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_code >=", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLessThan(String value) {
            addCriterion("exam_fee_item_code <", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_code <=", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLike(String value) {
            addCriterion("exam_fee_item_code like", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotLike(String value) {
            addCriterion("exam_fee_item_code not like", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeIn(List<String> values) {
            addCriterion("exam_fee_item_code in", values, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotIn(List<String> values) {
            addCriterion("exam_fee_item_code not in", values, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeBetween(String value1, String value2) {
            addCriterion("exam_fee_item_code between", value1, value2, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_code not between", value1, value2, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeIsNull() {
            addCriterion("exam_fee_item_fee_code is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeIsNotNull() {
            addCriterion("exam_fee_item_fee_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeEqualTo(String value) {
            addCriterion("exam_fee_item_fee_code =", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeNotEqualTo(String value) {
            addCriterion("exam_fee_item_fee_code <>", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeGreaterThan(String value) {
            addCriterion("exam_fee_item_fee_code >", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_fee_code >=", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeLessThan(String value) {
            addCriterion("exam_fee_item_fee_code <", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_fee_code <=", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeLike(String value) {
            addCriterion("exam_fee_item_fee_code like", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeNotLike(String value) {
            addCriterion("exam_fee_item_fee_code not like", value, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeIn(List<String> values) {
            addCriterion("exam_fee_item_fee_code in", values, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeNotIn(List<String> values) {
            addCriterion("exam_fee_item_fee_code not in", values, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeBetween(String value1, String value2) {
            addCriterion("exam_fee_item_fee_code between", value1, value2, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemFeeCodeNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_fee_code not between", value1, value2, "examFeeItemFeeCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameIsNull() {
            addCriterion("exam_fee_item_his_name is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameIsNotNull() {
            addCriterion("exam_fee_item_his_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameEqualTo(String value) {
            addCriterion("exam_fee_item_his_name =", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameNotEqualTo(String value) {
            addCriterion("exam_fee_item_his_name <>", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameGreaterThan(String value) {
            addCriterion("exam_fee_item_his_name >", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_his_name >=", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameLessThan(String value) {
            addCriterion("exam_fee_item_his_name <", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_his_name <=", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameLike(String value) {
            addCriterion("exam_fee_item_his_name like", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameNotLike(String value) {
            addCriterion("exam_fee_item_his_name not like", value, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameIn(List<String> values) {
            addCriterion("exam_fee_item_his_name in", values, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameNotIn(List<String> values) {
            addCriterion("exam_fee_item_his_name not in", values, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameBetween(String value1, String value2) {
            addCriterion("exam_fee_item_his_name between", value1, value2, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemHisNameNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_his_name not between", value1, value2, "examFeeItemHisName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceIsNull() {
            addCriterion("exam_fee_item_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceIsNotNull() {
            addCriterion("exam_fee_item_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price =", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price <>", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price >", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price >=", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceLessThan(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price <", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_unit_price <=", value, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_unit_price in", values, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_unit_price not in", values, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_unit_price between", value1, value2, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_unit_price not between", value1, value2, "examFeeItemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceIsNull() {
            addCriterion("exam_fee_item_suite_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceIsNotNull() {
            addCriterion("exam_fee_item_suite_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price =", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price <>", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price >", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price >=", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceLessThan(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price <", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_suite_price <=", value, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_suite_price in", values, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_suite_price not in", values, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_suite_price between", value1, value2, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSuitePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_suite_price not between", value1, value2, "examFeeItemSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceIsNull() {
            addCriterion("exam_fee_item_material_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceIsNotNull() {
            addCriterion("exam_fee_item_material_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_material_price =", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_material_price <>", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fee_item_material_price >", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_material_price >=", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceLessThan(BigDecimal value) {
            addCriterion("exam_fee_item_material_price <", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_material_price <=", value, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_material_price in", values, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_material_price not in", values, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_material_price between", value1, value2, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemMaterialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_material_price not between", value1, value2, "examFeeItemMaterialPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceIsNull() {
            addCriterion("exam_fee_item_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceIsNotNull() {
            addCriterion("exam_fee_item_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price =", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price <>", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price >", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price >=", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceLessThan(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price <", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_cost_price <=", value, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_cost_price in", values, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_cost_price not in", values, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_cost_price between", value1, value2, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_cost_price not between", value1, value2, "examFeeItemCostPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceIsNull() {
            addCriterion("exam_fee_item_coop_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceIsNotNull() {
            addCriterion("exam_fee_item_coop_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price =", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price <>", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price >", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price >=", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceLessThan(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price <", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fee_item_coop_price <=", value, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_coop_price in", values, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fee_item_coop_price not in", values, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_coop_price between", value1, value2, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCoopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fee_item_coop_price not between", value1, value2, "examFeeItemCoopPrice");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdIsNull() {
            addCriterion("coop_org_id is null");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdIsNotNull() {
            addCriterion("coop_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdEqualTo(String value) {
            addCriterion("coop_org_id =", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdNotEqualTo(String value) {
            addCriterion("coop_org_id <>", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdGreaterThan(String value) {
            addCriterion("coop_org_id >", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("coop_org_id >=", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdLessThan(String value) {
            addCriterion("coop_org_id <", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdLessThanOrEqualTo(String value) {
            addCriterion("coop_org_id <=", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdLike(String value) {
            addCriterion("coop_org_id like", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdNotLike(String value) {
            addCriterion("coop_org_id not like", value, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdIn(List<String> values) {
            addCriterion("coop_org_id in", values, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdNotIn(List<String> values) {
            addCriterion("coop_org_id not in", values, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdBetween(String value1, String value2) {
            addCriterion("coop_org_id between", value1, value2, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andCoopOrgIdNotBetween(String value1, String value2) {
            addCriterion("coop_org_id not between", value1, value2, "coopOrgId");
            return (Criteria) this;
        }

        public Criteria andExamDetailIsNull() {
            addCriterion("exam_detail is null");
            return (Criteria) this;
        }

        public Criteria andExamDetailIsNotNull() {
            addCriterion("exam_detail is not null");
            return (Criteria) this;
        }

        public Criteria andExamDetailEqualTo(String value) {
            addCriterion("exam_detail =", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailNotEqualTo(String value) {
            addCriterion("exam_detail <>", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailGreaterThan(String value) {
            addCriterion("exam_detail >", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailGreaterThanOrEqualTo(String value) {
            addCriterion("exam_detail >=", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailLessThan(String value) {
            addCriterion("exam_detail <", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailLessThanOrEqualTo(String value) {
            addCriterion("exam_detail <=", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailLike(String value) {
            addCriterion("exam_detail like", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailNotLike(String value) {
            addCriterion("exam_detail not like", value, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailIn(List<String> values) {
            addCriterion("exam_detail in", values, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailNotIn(List<String> values) {
            addCriterion("exam_detail not in", values, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailBetween(String value1, String value2) {
            addCriterion("exam_detail between", value1, value2, "examDetail");
            return (Criteria) this;
        }

        public Criteria andExamDetailNotBetween(String value1, String value2) {
            addCriterion("exam_detail not between", value1, value2, "examDetail");
            return (Criteria) this;
        }

        public Criteria andFMaleIsNull() {
            addCriterion("f_male is null");
            return (Criteria) this;
        }

        public Criteria andFMaleIsNotNull() {
            addCriterion("f_male is not null");
            return (Criteria) this;
        }

        public Criteria andFMaleEqualTo(Integer value) {
            addCriterion("f_male =", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotEqualTo(Integer value) {
            addCriterion("f_male <>", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleGreaterThan(Integer value) {
            addCriterion("f_male >", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_male >=", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleLessThan(Integer value) {
            addCriterion("f_male <", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleLessThanOrEqualTo(Integer value) {
            addCriterion("f_male <=", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleIn(List<Integer> values) {
            addCriterion("f_male in", values, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotIn(List<Integer> values) {
            addCriterion("f_male not in", values, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleBetween(Integer value1, Integer value2) {
            addCriterion("f_male between", value1, value2, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotBetween(Integer value1, Integer value2) {
            addCriterion("f_male not between", value1, value2, "fMale");
            return (Criteria) this;
        }

        public Criteria andFFemaleIsNull() {
            addCriterion("f_female is null");
            return (Criteria) this;
        }

        public Criteria andFFemaleIsNotNull() {
            addCriterion("f_female is not null");
            return (Criteria) this;
        }

        public Criteria andFFemaleEqualTo(Integer value) {
            addCriterion("f_female =", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotEqualTo(Integer value) {
            addCriterion("f_female <>", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleGreaterThan(Integer value) {
            addCriterion("f_female >", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_female >=", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleLessThan(Integer value) {
            addCriterion("f_female <", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleLessThanOrEqualTo(Integer value) {
            addCriterion("f_female <=", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleIn(List<Integer> values) {
            addCriterion("f_female in", values, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotIn(List<Integer> values) {
            addCriterion("f_female not in", values, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleBetween(Integer value1, Integer value2) {
            addCriterion("f_female between", value1, value2, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotBetween(Integer value1, Integer value2) {
            addCriterion("f_female not between", value1, value2, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFAlertIsNull() {
            addCriterion("f_alert is null");
            return (Criteria) this;
        }

        public Criteria andFAlertIsNotNull() {
            addCriterion("f_alert is not null");
            return (Criteria) this;
        }

        public Criteria andFAlertEqualTo(Integer value) {
            addCriterion("f_alert =", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertNotEqualTo(Integer value) {
            addCriterion("f_alert <>", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertGreaterThan(Integer value) {
            addCriterion("f_alert >", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_alert >=", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertLessThan(Integer value) {
            addCriterion("f_alert <", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertLessThanOrEqualTo(Integer value) {
            addCriterion("f_alert <=", value, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertIn(List<Integer> values) {
            addCriterion("f_alert in", values, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertNotIn(List<Integer> values) {
            addCriterion("f_alert not in", values, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertBetween(Integer value1, Integer value2) {
            addCriterion("f_alert between", value1, value2, "fAlert");
            return (Criteria) this;
        }

        public Criteria andFAlertNotBetween(Integer value1, Integer value2) {
            addCriterion("f_alert not between", value1, value2, "fAlert");
            return (Criteria) this;
        }

        public Criteria andWarningMsgIsNull() {
            addCriterion("warning_msg is null");
            return (Criteria) this;
        }

        public Criteria andWarningMsgIsNotNull() {
            addCriterion("warning_msg is not null");
            return (Criteria) this;
        }

        public Criteria andWarningMsgEqualTo(String value) {
            addCriterion("warning_msg =", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgNotEqualTo(String value) {
            addCriterion("warning_msg <>", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgGreaterThan(String value) {
            addCriterion("warning_msg >", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgGreaterThanOrEqualTo(String value) {
            addCriterion("warning_msg >=", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgLessThan(String value) {
            addCriterion("warning_msg <", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgLessThanOrEqualTo(String value) {
            addCriterion("warning_msg <=", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgLike(String value) {
            addCriterion("warning_msg like", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgNotLike(String value) {
            addCriterion("warning_msg not like", value, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgIn(List<String> values) {
            addCriterion("warning_msg in", values, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgNotIn(List<String> values) {
            addCriterion("warning_msg not in", values, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgBetween(String value1, String value2) {
            addCriterion("warning_msg between", value1, value2, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andWarningMsgNotBetween(String value1, String value2) {
            addCriterion("warning_msg not between", value1, value2, "warningMsg");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderIsNull() {
            addCriterion("breakfast_order is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderIsNotNull() {
            addCriterion("breakfast_order is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderEqualTo(Integer value) {
            addCriterion("breakfast_order =", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderNotEqualTo(Integer value) {
            addCriterion("breakfast_order <>", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderGreaterThan(Integer value) {
            addCriterion("breakfast_order >", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("breakfast_order >=", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderLessThan(Integer value) {
            addCriterion("breakfast_order <", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderLessThanOrEqualTo(Integer value) {
            addCriterion("breakfast_order <=", value, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderIn(List<Integer> values) {
            addCriterion("breakfast_order in", values, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderNotIn(List<Integer> values) {
            addCriterion("breakfast_order not in", values, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderBetween(Integer value1, Integer value2) {
            addCriterion("breakfast_order between", value1, value2, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andBreakfastOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("breakfast_order not between", value1, value2, "breakfastOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNull() {
            addCriterion("disp_order is null");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNotNull() {
            addCriterion("disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andDispOrderEqualTo(Integer value) {
            addCriterion("disp_order =", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotEqualTo(Integer value) {
            addCriterion("disp_order <>", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThan(Integer value) {
            addCriterion("disp_order >", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("disp_order >=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThan(Integer value) {
            addCriterion("disp_order <", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("disp_order <=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderIn(List<Integer> values) {
            addCriterion("disp_order in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotIn(List<Integer> values) {
            addCriterion("disp_order not in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("disp_order between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("disp_order not between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}