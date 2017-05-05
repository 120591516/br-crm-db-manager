package br.crm.pojo.branch;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchExample() {
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

        public Criteria andBranchNameIsNull() {
            addCriterion("branch_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("branch_name =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("branch_name <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("branch_name >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("branch_name <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("branch_name <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("branch_name like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("branch_name not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("branch_name in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("branch_name not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("branch_name between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("branch_name not between", value1, value2, "branchName");
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

        public Criteria andBranchCodeIsNull() {
            addCriterion("branch_code is null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNotNull() {
            addCriterion("branch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeEqualTo(String value) {
            addCriterion("branch_code =", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotEqualTo(String value) {
            addCriterion("branch_code <>", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThan(String value) {
            addCriterion("branch_code >", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("branch_code >=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThan(String value) {
            addCriterion("branch_code <", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("branch_code <=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLike(String value) {
            addCriterion("branch_code like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotLike(String value) {
            addCriterion("branch_code not like", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIn(List<String> values) {
            addCriterion("branch_code in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotIn(List<String> values) {
            addCriterion("branch_code not in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeBetween(String value1, String value2) {
            addCriterion("branch_code between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotBetween(String value1, String value2) {
            addCriterion("branch_code not between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdIsNull() {
            addCriterion("branch_province_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdIsNotNull() {
            addCriterion("branch_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdEqualTo(Integer value) {
            addCriterion("branch_province_id =", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdNotEqualTo(Integer value) {
            addCriterion("branch_province_id <>", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdGreaterThan(Integer value) {
            addCriterion("branch_province_id >", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_province_id >=", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdLessThan(Integer value) {
            addCriterion("branch_province_id <", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("branch_province_id <=", value, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdIn(List<Integer> values) {
            addCriterion("branch_province_id in", values, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdNotIn(List<Integer> values) {
            addCriterion("branch_province_id not in", values, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("branch_province_id between", value1, value2, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_province_id not between", value1, value2, "branchProvinceId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdIsNull() {
            addCriterion("branch_city_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdIsNotNull() {
            addCriterion("branch_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdEqualTo(Integer value) {
            addCriterion("branch_city_id =", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdNotEqualTo(Integer value) {
            addCriterion("branch_city_id <>", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdGreaterThan(Integer value) {
            addCriterion("branch_city_id >", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_city_id >=", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdLessThan(Integer value) {
            addCriterion("branch_city_id <", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("branch_city_id <=", value, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdIn(List<Integer> values) {
            addCriterion("branch_city_id in", values, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdNotIn(List<Integer> values) {
            addCriterion("branch_city_id not in", values, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdBetween(Integer value1, Integer value2) {
            addCriterion("branch_city_id between", value1, value2, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_city_id not between", value1, value2, "branchCityId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdIsNull() {
            addCriterion("branch_area_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdIsNotNull() {
            addCriterion("branch_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdEqualTo(Integer value) {
            addCriterion("branch_area_id =", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdNotEqualTo(Integer value) {
            addCriterion("branch_area_id <>", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdGreaterThan(Integer value) {
            addCriterion("branch_area_id >", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_area_id >=", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdLessThan(Integer value) {
            addCriterion("branch_area_id <", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("branch_area_id <=", value, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdIn(List<Integer> values) {
            addCriterion("branch_area_id in", values, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdNotIn(List<Integer> values) {
            addCriterion("branch_area_id not in", values, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("branch_area_id between", value1, value2, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_area_id not between", value1, value2, "branchAreaId");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIsNull() {
            addCriterion("branch_address is null");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIsNotNull() {
            addCriterion("branch_address is not null");
            return (Criteria) this;
        }

        public Criteria andBranchAddressEqualTo(String value) {
            addCriterion("branch_address =", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotEqualTo(String value) {
            addCriterion("branch_address <>", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressGreaterThan(String value) {
            addCriterion("branch_address >", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressGreaterThanOrEqualTo(String value) {
            addCriterion("branch_address >=", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLessThan(String value) {
            addCriterion("branch_address <", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLessThanOrEqualTo(String value) {
            addCriterion("branch_address <=", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressLike(String value) {
            addCriterion("branch_address like", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotLike(String value) {
            addCriterion("branch_address not like", value, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressIn(List<String> values) {
            addCriterion("branch_address in", values, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotIn(List<String> values) {
            addCriterion("branch_address not in", values, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressBetween(String value1, String value2) {
            addCriterion("branch_address between", value1, value2, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andBranchAddressNotBetween(String value1, String value2) {
            addCriterion("branch_address not between", value1, value2, "branchAddress");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeIsNull() {
            addCriterion("exam_start_time is null");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeIsNotNull() {
            addCriterion("exam_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeEqualTo(String value) {
            addCriterion("exam_start_time =", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeNotEqualTo(String value) {
            addCriterion("exam_start_time <>", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeGreaterThan(String value) {
            addCriterion("exam_start_time >", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_start_time >=", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeLessThan(String value) {
            addCriterion("exam_start_time <", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeLessThanOrEqualTo(String value) {
            addCriterion("exam_start_time <=", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeLike(String value) {
            addCriterion("exam_start_time like", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeNotLike(String value) {
            addCriterion("exam_start_time not like", value, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeIn(List<String> values) {
            addCriterion("exam_start_time in", values, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeNotIn(List<String> values) {
            addCriterion("exam_start_time not in", values, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeBetween(String value1, String value2) {
            addCriterion("exam_start_time between", value1, value2, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamStartTimeNotBetween(String value1, String value2) {
            addCriterion("exam_start_time not between", value1, value2, "examStartTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeIsNull() {
            addCriterion("exam_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeIsNotNull() {
            addCriterion("exam_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeEqualTo(String value) {
            addCriterion("exam_end_time =", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeNotEqualTo(String value) {
            addCriterion("exam_end_time <>", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeGreaterThan(String value) {
            addCriterion("exam_end_time >", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_end_time >=", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeLessThan(String value) {
            addCriterion("exam_end_time <", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeLessThanOrEqualTo(String value) {
            addCriterion("exam_end_time <=", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeLike(String value) {
            addCriterion("exam_end_time like", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeNotLike(String value) {
            addCriterion("exam_end_time not like", value, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeIn(List<String> values) {
            addCriterion("exam_end_time in", values, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeNotIn(List<String> values) {
            addCriterion("exam_end_time not in", values, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeBetween(String value1, String value2) {
            addCriterion("exam_end_time between", value1, value2, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andExamEndTimeNotBetween(String value1, String value2) {
            addCriterion("exam_end_time not between", value1, value2, "examEndTime");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteIsNull() {
            addCriterion("split_suite is null");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteIsNotNull() {
            addCriterion("split_suite is not null");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteEqualTo(Integer value) {
            addCriterion("split_suite =", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteNotEqualTo(Integer value) {
            addCriterion("split_suite <>", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteGreaterThan(Integer value) {
            addCriterion("split_suite >", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_suite >=", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteLessThan(Integer value) {
            addCriterion("split_suite <", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteLessThanOrEqualTo(Integer value) {
            addCriterion("split_suite <=", value, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteIn(List<Integer> values) {
            addCriterion("split_suite in", values, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteNotIn(List<Integer> values) {
            addCriterion("split_suite not in", values, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteBetween(Integer value1, Integer value2) {
            addCriterion("split_suite between", value1, value2, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andSplitSuiteNotBetween(Integer value1, Integer value2) {
            addCriterion("split_suite not between", value1, value2, "splitSuite");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleIsNull() {
            addCriterion("warn_people is null");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleIsNotNull() {
            addCriterion("warn_people is not null");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleEqualTo(Integer value) {
            addCriterion("warn_people =", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleNotEqualTo(Integer value) {
            addCriterion("warn_people <>", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleGreaterThan(Integer value) {
            addCriterion("warn_people >", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_people >=", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleLessThan(Integer value) {
            addCriterion("warn_people <", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("warn_people <=", value, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleIn(List<Integer> values) {
            addCriterion("warn_people in", values, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleNotIn(List<Integer> values) {
            addCriterion("warn_people not in", values, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleBetween(Integer value1, Integer value2) {
            addCriterion("warn_people between", value1, value2, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andWarnPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_people not between", value1, value2, "warnPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleIsNull() {
            addCriterion("limit_people is null");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleIsNotNull() {
            addCriterion("limit_people is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleEqualTo(Integer value) {
            addCriterion("limit_people =", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleNotEqualTo(Integer value) {
            addCriterion("limit_people <>", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleGreaterThan(Integer value) {
            addCriterion("limit_people >", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_people >=", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleLessThan(Integer value) {
            addCriterion("limit_people <", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("limit_people <=", value, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleIn(List<Integer> values) {
            addCriterion("limit_people in", values, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleNotIn(List<Integer> values) {
            addCriterion("limit_people not in", values, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleBetween(Integer value1, Integer value2) {
            addCriterion("limit_people between", value1, value2, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andLimitPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_people not between", value1, value2, "limitPeople");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIsNull() {
            addCriterion("warn_amount is null");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIsNotNull() {
            addCriterion("warn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWarnAmountEqualTo(BigDecimal value) {
            addCriterion("warn_amount =", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotEqualTo(BigDecimal value) {
            addCriterion("warn_amount <>", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountGreaterThan(BigDecimal value) {
            addCriterion("warn_amount >", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warn_amount >=", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountLessThan(BigDecimal value) {
            addCriterion("warn_amount <", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warn_amount <=", value, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountIn(List<BigDecimal> values) {
            addCriterion("warn_amount in", values, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotIn(List<BigDecimal> values) {
            addCriterion("warn_amount not in", values, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warn_amount between", value1, value2, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andWarnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warn_amount not between", value1, value2, "warnAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
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

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
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