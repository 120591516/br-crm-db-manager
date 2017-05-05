package br.crm.pojo.dept;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationDeptExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationDeptExample() {
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

        public Criteria andOrgDeptIdIsNull() {
            addCriterion("org_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdIsNotNull() {
            addCriterion("org_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdEqualTo(String value) {
            addCriterion("org_dept_id =", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotEqualTo(String value) {
            addCriterion("org_dept_id <>", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdGreaterThan(String value) {
            addCriterion("org_dept_id >", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_dept_id >=", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLessThan(String value) {
            addCriterion("org_dept_id <", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLessThanOrEqualTo(String value) {
            addCriterion("org_dept_id <=", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLike(String value) {
            addCriterion("org_dept_id like", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotLike(String value) {
            addCriterion("org_dept_id not like", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdIn(List<String> values) {
            addCriterion("org_dept_id in", values, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotIn(List<String> values) {
            addCriterion("org_dept_id not in", values, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdBetween(String value1, String value2) {
            addCriterion("org_dept_id between", value1, value2, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotBetween(String value1, String value2) {
            addCriterion("org_dept_id not between", value1, value2, "orgDeptId");
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

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("branch_id like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("branch_id not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrIsNull() {
            addCriterion("depart_name_abr is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrIsNotNull() {
            addCriterion("depart_name_abr is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrEqualTo(String value) {
            addCriterion("depart_name_abr =", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrNotEqualTo(String value) {
            addCriterion("depart_name_abr <>", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrGreaterThan(String value) {
            addCriterion("depart_name_abr >", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name_abr >=", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrLessThan(String value) {
            addCriterion("depart_name_abr <", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrLessThanOrEqualTo(String value) {
            addCriterion("depart_name_abr <=", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrLike(String value) {
            addCriterion("depart_name_abr like", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrNotLike(String value) {
            addCriterion("depart_name_abr not like", value, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrIn(List<String> values) {
            addCriterion("depart_name_abr in", values, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrNotIn(List<String> values) {
            addCriterion("depart_name_abr not in", values, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrBetween(String value1, String value2) {
            addCriterion("depart_name_abr between", value1, value2, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameAbrNotBetween(String value1, String value2) {
            addCriterion("depart_name_abr not between", value1, value2, "departNameAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngIsNull() {
            addCriterion("depart_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngIsNotNull() {
            addCriterion("depart_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngEqualTo(String value) {
            addCriterion("depart_name_eng =", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngNotEqualTo(String value) {
            addCriterion("depart_name_eng <>", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngGreaterThan(String value) {
            addCriterion("depart_name_eng >", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name_eng >=", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngLessThan(String value) {
            addCriterion("depart_name_eng <", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngLessThanOrEqualTo(String value) {
            addCriterion("depart_name_eng <=", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngLike(String value) {
            addCriterion("depart_name_eng like", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngNotLike(String value) {
            addCriterion("depart_name_eng not like", value, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngIn(List<String> values) {
            addCriterion("depart_name_eng in", values, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngNotIn(List<String> values) {
            addCriterion("depart_name_eng not in", values, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngBetween(String value1, String value2) {
            addCriterion("depart_name_eng between", value1, value2, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngNotBetween(String value1, String value2) {
            addCriterion("depart_name_eng not between", value1, value2, "departNameEng");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrIsNull() {
            addCriterion("depart_name_eng_abr is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrIsNotNull() {
            addCriterion("depart_name_eng_abr is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrEqualTo(String value) {
            addCriterion("depart_name_eng_abr =", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrNotEqualTo(String value) {
            addCriterion("depart_name_eng_abr <>", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrGreaterThan(String value) {
            addCriterion("depart_name_eng_abr >", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name_eng_abr >=", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrLessThan(String value) {
            addCriterion("depart_name_eng_abr <", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrLessThanOrEqualTo(String value) {
            addCriterion("depart_name_eng_abr <=", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrLike(String value) {
            addCriterion("depart_name_eng_abr like", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrNotLike(String value) {
            addCriterion("depart_name_eng_abr not like", value, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrIn(List<String> values) {
            addCriterion("depart_name_eng_abr in", values, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrNotIn(List<String> values) {
            addCriterion("depart_name_eng_abr not in", values, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrBetween(String value1, String value2) {
            addCriterion("depart_name_eng_abr between", value1, value2, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartNameEngAbrNotBetween(String value1, String value2) {
            addCriterion("depart_name_eng_abr not between", value1, value2, "departNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNull() {
            addCriterion("depart_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNotNull() {
            addCriterion("depart_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeEqualTo(String value) {
            addCriterion("depart_code =", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotEqualTo(String value) {
            addCriterion("depart_code <>", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThan(String value) {
            addCriterion("depart_code >", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("depart_code >=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThan(String value) {
            addCriterion("depart_code <", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThanOrEqualTo(String value) {
            addCriterion("depart_code <=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLike(String value) {
            addCriterion("depart_code like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotLike(String value) {
            addCriterion("depart_code not like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIn(List<String> values) {
            addCriterion("depart_code in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotIn(List<String> values) {
            addCriterion("depart_code not in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeBetween(String value1, String value2) {
            addCriterion("depart_code between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotBetween(String value1, String value2) {
            addCriterion("depart_code not between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIsNull() {
            addCriterion("depart_type is null");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIsNotNull() {
            addCriterion("depart_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTypeEqualTo(String value) {
            addCriterion("depart_type =", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotEqualTo(String value) {
            addCriterion("depart_type <>", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeGreaterThan(String value) {
            addCriterion("depart_type >", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("depart_type >=", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLessThan(String value) {
            addCriterion("depart_type <", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLessThanOrEqualTo(String value) {
            addCriterion("depart_type <=", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLike(String value) {
            addCriterion("depart_type like", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotLike(String value) {
            addCriterion("depart_type not like", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIn(List<String> values) {
            addCriterion("depart_type in", values, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotIn(List<String> values) {
            addCriterion("depart_type not in", values, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeBetween(String value1, String value2) {
            addCriterion("depart_type between", value1, value2, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotBetween(String value1, String value2) {
            addCriterion("depart_type not between", value1, value2, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeIsNull() {
            addCriterion("depart_his_type is null");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeIsNotNull() {
            addCriterion("depart_his_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeEqualTo(String value) {
            addCriterion("depart_his_type =", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeNotEqualTo(String value) {
            addCriterion("depart_his_type <>", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeGreaterThan(String value) {
            addCriterion("depart_his_type >", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeGreaterThanOrEqualTo(String value) {
            addCriterion("depart_his_type >=", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeLessThan(String value) {
            addCriterion("depart_his_type <", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeLessThanOrEqualTo(String value) {
            addCriterion("depart_his_type <=", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeLike(String value) {
            addCriterion("depart_his_type like", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeNotLike(String value) {
            addCriterion("depart_his_type not like", value, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeIn(List<String> values) {
            addCriterion("depart_his_type in", values, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeNotIn(List<String> values) {
            addCriterion("depart_his_type not in", values, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeBetween(String value1, String value2) {
            addCriterion("depart_his_type between", value1, value2, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartHisTypeNotBetween(String value1, String value2) {
            addCriterion("depart_his_type not between", value1, value2, "departHisType");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdIsNull() {
            addCriterion("depart_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdIsNotNull() {
            addCriterion("depart_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdEqualTo(String value) {
            addCriterion("depart_manager_id =", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdNotEqualTo(String value) {
            addCriterion("depart_manager_id <>", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdGreaterThan(String value) {
            addCriterion("depart_manager_id >", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_manager_id >=", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdLessThan(String value) {
            addCriterion("depart_manager_id <", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdLessThanOrEqualTo(String value) {
            addCriterion("depart_manager_id <=", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdLike(String value) {
            addCriterion("depart_manager_id like", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdNotLike(String value) {
            addCriterion("depart_manager_id not like", value, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdIn(List<String> values) {
            addCriterion("depart_manager_id in", values, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdNotIn(List<String> values) {
            addCriterion("depart_manager_id not in", values, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdBetween(String value1, String value2) {
            addCriterion("depart_manager_id between", value1, value2, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartManagerIdNotBetween(String value1, String value2) {
            addCriterion("depart_manager_id not between", value1, value2, "departManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdIsNull() {
            addCriterion("depart_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdIsNotNull() {
            addCriterion("depart_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdEqualTo(String value) {
            addCriterion("depart_parent_id =", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdNotEqualTo(String value) {
            addCriterion("depart_parent_id <>", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdGreaterThan(String value) {
            addCriterion("depart_parent_id >", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_parent_id >=", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdLessThan(String value) {
            addCriterion("depart_parent_id <", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdLessThanOrEqualTo(String value) {
            addCriterion("depart_parent_id <=", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdLike(String value) {
            addCriterion("depart_parent_id like", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdNotLike(String value) {
            addCriterion("depart_parent_id not like", value, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdIn(List<String> values) {
            addCriterion("depart_parent_id in", values, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdNotIn(List<String> values) {
            addCriterion("depart_parent_id not in", values, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdBetween(String value1, String value2) {
            addCriterion("depart_parent_id between", value1, value2, "departParentId");
            return (Criteria) this;
        }

        public Criteria andDepartParentIdNotBetween(String value1, String value2) {
            addCriterion("depart_parent_id not between", value1, value2, "departParentId");
            return (Criteria) this;
        }

        public Criteria andFUnListIsNull() {
            addCriterion("f_un_list is null");
            return (Criteria) this;
        }

        public Criteria andFUnListIsNotNull() {
            addCriterion("f_un_list is not null");
            return (Criteria) this;
        }

        public Criteria andFUnListEqualTo(Integer value) {
            addCriterion("f_un_list =", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListNotEqualTo(Integer value) {
            addCriterion("f_un_list <>", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListGreaterThan(Integer value) {
            addCriterion("f_un_list >", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_un_list >=", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListLessThan(Integer value) {
            addCriterion("f_un_list <", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListLessThanOrEqualTo(Integer value) {
            addCriterion("f_un_list <=", value, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListIn(List<Integer> values) {
            addCriterion("f_un_list in", values, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListNotIn(List<Integer> values) {
            addCriterion("f_un_list not in", values, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListBetween(Integer value1, Integer value2) {
            addCriterion("f_un_list between", value1, value2, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFUnListNotBetween(Integer value1, Integer value2) {
            addCriterion("f_un_list not between", value1, value2, "fUnList");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyIsNull() {
            addCriterion("f_guide_depart_only is null");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyIsNotNull() {
            addCriterion("f_guide_depart_only is not null");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyEqualTo(Integer value) {
            addCriterion("f_guide_depart_only =", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyNotEqualTo(Integer value) {
            addCriterion("f_guide_depart_only <>", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyGreaterThan(Integer value) {
            addCriterion("f_guide_depart_only >", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_guide_depart_only >=", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyLessThan(Integer value) {
            addCriterion("f_guide_depart_only <", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyLessThanOrEqualTo(Integer value) {
            addCriterion("f_guide_depart_only <=", value, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyIn(List<Integer> values) {
            addCriterion("f_guide_depart_only in", values, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyNotIn(List<Integer> values) {
            addCriterion("f_guide_depart_only not in", values, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyBetween(Integer value1, Integer value2) {
            addCriterion("f_guide_depart_only between", value1, value2, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andFGuideDepartOnlyNotBetween(Integer value1, Integer value2) {
            addCriterion("f_guide_depart_only not between", value1, value2, "fGuideDepartOnly");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdIsNull() {
            addCriterion("queue_site_id is null");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdIsNotNull() {
            addCriterion("queue_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdEqualTo(Long value) {
            addCriterion("queue_site_id =", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdNotEqualTo(Long value) {
            addCriterion("queue_site_id <>", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdGreaterThan(Long value) {
            addCriterion("queue_site_id >", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("queue_site_id >=", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdLessThan(Long value) {
            addCriterion("queue_site_id <", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("queue_site_id <=", value, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdIn(List<Long> values) {
            addCriterion("queue_site_id in", values, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdNotIn(List<Long> values) {
            addCriterion("queue_site_id not in", values, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdBetween(Long value1, Long value2) {
            addCriterion("queue_site_id between", value1, value2, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andQueueSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("queue_site_id not between", value1, value2, "queueSiteId");
            return (Criteria) this;
        }

        public Criteria andPacsTypeIsNull() {
            addCriterion("pacs_type is null");
            return (Criteria) this;
        }

        public Criteria andPacsTypeIsNotNull() {
            addCriterion("pacs_type is not null");
            return (Criteria) this;
        }

        public Criteria andPacsTypeEqualTo(String value) {
            addCriterion("pacs_type =", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeNotEqualTo(String value) {
            addCriterion("pacs_type <>", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeGreaterThan(String value) {
            addCriterion("pacs_type >", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pacs_type >=", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeLessThan(String value) {
            addCriterion("pacs_type <", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeLessThanOrEqualTo(String value) {
            addCriterion("pacs_type <=", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeLike(String value) {
            addCriterion("pacs_type like", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeNotLike(String value) {
            addCriterion("pacs_type not like", value, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeIn(List<String> values) {
            addCriterion("pacs_type in", values, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeNotIn(List<String> values) {
            addCriterion("pacs_type not in", values, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeBetween(String value1, String value2) {
            addCriterion("pacs_type between", value1, value2, "pacsType");
            return (Criteria) this;
        }

        public Criteria andPacsTypeNotBetween(String value1, String value2) {
            addCriterion("pacs_type not between", value1, value2, "pacsType");
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

        public Criteria andDirectionGuideIsNull() {
            addCriterion("direction_guide is null");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideIsNotNull() {
            addCriterion("direction_guide is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideEqualTo(String value) {
            addCriterion("direction_guide =", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideNotEqualTo(String value) {
            addCriterion("direction_guide <>", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideGreaterThan(String value) {
            addCriterion("direction_guide >", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideGreaterThanOrEqualTo(String value) {
            addCriterion("direction_guide >=", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideLessThan(String value) {
            addCriterion("direction_guide <", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideLessThanOrEqualTo(String value) {
            addCriterion("direction_guide <=", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideLike(String value) {
            addCriterion("direction_guide like", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideNotLike(String value) {
            addCriterion("direction_guide not like", value, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideIn(List<String> values) {
            addCriterion("direction_guide in", values, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideNotIn(List<String> values) {
            addCriterion("direction_guide not in", values, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideBetween(String value1, String value2) {
            addCriterion("direction_guide between", value1, value2, "directionGuide");
            return (Criteria) this;
        }

        public Criteria andDirectionGuideNotBetween(String value1, String value2) {
            addCriterion("direction_guide not between", value1, value2, "directionGuide");
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