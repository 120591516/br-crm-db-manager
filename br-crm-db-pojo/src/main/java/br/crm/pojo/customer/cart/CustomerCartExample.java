package br.crm.pojo.customer.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCartExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(String value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(String value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(String value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(String value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(String value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLike(String value) {
            addCriterion("cart_id like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotLike(String value) {
            addCriterion("cart_id not like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<String> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<String> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(String value1, String value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(String value1, String value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
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

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
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

        public Criteria andCustomerCartImgIdIsNull() {
            addCriterion("customer_cart_img_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdIsNotNull() {
            addCriterion("customer_cart_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdEqualTo(String value) {
            addCriterion("customer_cart_img_id =", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdNotEqualTo(String value) {
            addCriterion("customer_cart_img_id <>", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdGreaterThan(String value) {
            addCriterion("customer_cart_img_id >", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cart_img_id >=", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdLessThan(String value) {
            addCriterion("customer_cart_img_id <", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdLessThanOrEqualTo(String value) {
            addCriterion("customer_cart_img_id <=", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdLike(String value) {
            addCriterion("customer_cart_img_id like", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdNotLike(String value) {
            addCriterion("customer_cart_img_id not like", value, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdIn(List<String> values) {
            addCriterion("customer_cart_img_id in", values, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdNotIn(List<String> values) {
            addCriterion("customer_cart_img_id not in", values, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdBetween(String value1, String value2) {
            addCriterion("customer_cart_img_id between", value1, value2, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgIdNotBetween(String value1, String value2) {
            addCriterion("customer_cart_img_id not between", value1, value2, "customerCartImgId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlIsNull() {
            addCriterion("customer_cart_img_url is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlIsNotNull() {
            addCriterion("customer_cart_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlEqualTo(String value) {
            addCriterion("customer_cart_img_url =", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlNotEqualTo(String value) {
            addCriterion("customer_cart_img_url <>", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlGreaterThan(String value) {
            addCriterion("customer_cart_img_url >", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cart_img_url >=", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlLessThan(String value) {
            addCriterion("customer_cart_img_url <", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlLessThanOrEqualTo(String value) {
            addCriterion("customer_cart_img_url <=", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlLike(String value) {
            addCriterion("customer_cart_img_url like", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlNotLike(String value) {
            addCriterion("customer_cart_img_url not like", value, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlIn(List<String> values) {
            addCriterion("customer_cart_img_url in", values, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlNotIn(List<String> values) {
            addCriterion("customer_cart_img_url not in", values, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlBetween(String value1, String value2) {
            addCriterion("customer_cart_img_url between", value1, value2, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerCartImgUrlNotBetween(String value1, String value2) {
            addCriterion("customer_cart_img_url not between", value1, value2, "customerCartImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitIsNull() {
            addCriterion("exam_suite_split is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitIsNotNull() {
            addCriterion("exam_suite_split is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitEqualTo(Boolean value) {
            addCriterion("exam_suite_split =", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitNotEqualTo(Boolean value) {
            addCriterion("exam_suite_split <>", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitGreaterThan(Boolean value) {
            addCriterion("exam_suite_split >", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("exam_suite_split >=", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitLessThan(Boolean value) {
            addCriterion("exam_suite_split <", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitLessThanOrEqualTo(Boolean value) {
            addCriterion("exam_suite_split <=", value, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitIn(List<Boolean> values) {
            addCriterion("exam_suite_split in", values, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitNotIn(List<Boolean> values) {
            addCriterion("exam_suite_split not in", values, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitBetween(Boolean value1, Boolean value2) {
            addCriterion("exam_suite_split between", value1, value2, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteSplitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("exam_suite_split not between", value1, value2, "examSuiteSplit");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNull() {
            addCriterion("exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNotNull() {
            addCriterion("exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdEqualTo(String value) {
            addCriterion("exam_suite_id =", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotEqualTo(String value) {
            addCriterion("exam_suite_id <>", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThan(String value) {
            addCriterion("exam_suite_id >", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_id >=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThan(String value) {
            addCriterion("exam_suite_id <", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_id <=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLike(String value) {
            addCriterion("exam_suite_id like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotLike(String value) {
            addCriterion("exam_suite_id not like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIn(List<String> values) {
            addCriterion("exam_suite_id in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotIn(List<String> values) {
            addCriterion("exam_suite_id not in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdBetween(String value1, String value2) {
            addCriterion("exam_suite_id between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_id not between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNull() {
            addCriterion("exam_suite_name is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNotNull() {
            addCriterion("exam_suite_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEqualTo(String value) {
            addCriterion("exam_suite_name =", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotEqualTo(String value) {
            addCriterion("exam_suite_name <>", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThan(String value) {
            addCriterion("exam_suite_name >", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_name >=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThan(String value) {
            addCriterion("exam_suite_name <", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_name <=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLike(String value) {
            addCriterion("exam_suite_name like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotLike(String value) {
            addCriterion("exam_suite_name not like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIn(List<String> values) {
            addCriterion("exam_suite_name in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotIn(List<String> values) {
            addCriterion("exam_suite_name not in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameBetween(String value1, String value2) {
            addCriterion("exam_suite_name between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotBetween(String value1, String value2) {
            addCriterion("exam_suite_name not between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIsNull() {
            addCriterion("exam_suite_price is null");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIsNotNull() {
            addCriterion("exam_suite_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price =", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price <>", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_price >", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price >=", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceLessThan(BigDecimal value) {
            addCriterion("exam_suite_price <", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price <=", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIn(List<BigDecimal> values) {
            addCriterion("exam_suite_price in", values, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_price not in", values, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_price between", value1, value2, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_price not between", value1, value2, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIsNull() {
            addCriterion("exam_suite_discount_price is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIsNotNull() {
            addCriterion("exam_suite_discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price =", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price <>", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_discount_price >", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price >=", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceLessThan(BigDecimal value) {
            addCriterion("exam_suite_discount_price <", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price <=", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("exam_suite_discount_price in", values, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_discount_price not in", values, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_discount_price between", value1, value2, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_discount_price not between", value1, value2, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andCartNumberIsNull() {
            addCriterion("cart_number is null");
            return (Criteria) this;
        }

        public Criteria andCartNumberIsNotNull() {
            addCriterion("cart_number is not null");
            return (Criteria) this;
        }

        public Criteria andCartNumberEqualTo(Integer value) {
            addCriterion("cart_number =", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberNotEqualTo(Integer value) {
            addCriterion("cart_number <>", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberGreaterThan(Integer value) {
            addCriterion("cart_number >", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_number >=", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberLessThan(Integer value) {
            addCriterion("cart_number <", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cart_number <=", value, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberIn(List<Integer> values) {
            addCriterion("cart_number in", values, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberNotIn(List<Integer> values) {
            addCriterion("cart_number not in", values, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberBetween(Integer value1, Integer value2) {
            addCriterion("cart_number between", value1, value2, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andCartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_number not between", value1, value2, "cartNumber");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIsNull() {
            addCriterion("single_price is null");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIsNotNull() {
            addCriterion("single_price is not null");
            return (Criteria) this;
        }

        public Criteria andSinglePriceEqualTo(BigDecimal value) {
            addCriterion("single_price =", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotEqualTo(BigDecimal value) {
            addCriterion("single_price <>", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceGreaterThan(BigDecimal value) {
            addCriterion("single_price >", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("single_price >=", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceLessThan(BigDecimal value) {
            addCriterion("single_price <", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("single_price <=", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIn(List<BigDecimal> values) {
            addCriterion("single_price in", values, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotIn(List<BigDecimal> values) {
            addCriterion("single_price not in", values, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("single_price between", value1, value2, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("single_price not between", value1, value2, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andCartStatusIsNull() {
            addCriterion("cart_status is null");
            return (Criteria) this;
        }

        public Criteria andCartStatusIsNotNull() {
            addCriterion("cart_status is not null");
            return (Criteria) this;
        }

        public Criteria andCartStatusEqualTo(Integer value) {
            addCriterion("cart_status =", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotEqualTo(Integer value) {
            addCriterion("cart_status <>", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusGreaterThan(Integer value) {
            addCriterion("cart_status >", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_status >=", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusLessThan(Integer value) {
            addCriterion("cart_status <", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cart_status <=", value, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusIn(List<Integer> values) {
            addCriterion("cart_status in", values, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotIn(List<Integer> values) {
            addCriterion("cart_status not in", values, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusBetween(Integer value1, Integer value2) {
            addCriterion("cart_status between", value1, value2, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_status not between", value1, value2, "cartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("exam_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Date value) {
            addCriterion("exam_time =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Date value) {
            addCriterion("exam_time <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Date value) {
            addCriterion("exam_time >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_time >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Date value) {
            addCriterion("exam_time <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_time <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Date> values) {
            addCriterion("exam_time in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Date> values) {
            addCriterion("exam_time not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Date value1, Date value2) {
            addCriterion("exam_time between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_time not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeIsNull() {
            addCriterion("cart_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeIsNotNull() {
            addCriterion("cart_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeEqualTo(Date value) {
            addCriterion("cart_create_time =", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeNotEqualTo(Date value) {
            addCriterion("cart_create_time <>", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeGreaterThan(Date value) {
            addCriterion("cart_create_time >", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cart_create_time >=", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeLessThan(Date value) {
            addCriterion("cart_create_time <", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cart_create_time <=", value, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeIn(List<Date> values) {
            addCriterion("cart_create_time in", values, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeNotIn(List<Date> values) {
            addCriterion("cart_create_time not in", values, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cart_create_time between", value1, value2, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cart_create_time not between", value1, value2, "cartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeIsNull() {
            addCriterion("cart_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeIsNotNull() {
            addCriterion("cart_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeEqualTo(Date value) {
            addCriterion("cart_edit_time =", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeNotEqualTo(Date value) {
            addCriterion("cart_edit_time <>", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeGreaterThan(Date value) {
            addCriterion("cart_edit_time >", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cart_edit_time >=", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeLessThan(Date value) {
            addCriterion("cart_edit_time <", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("cart_edit_time <=", value, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeIn(List<Date> values) {
            addCriterion("cart_edit_time in", values, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeNotIn(List<Date> values) {
            addCriterion("cart_edit_time not in", values, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeBetween(Date value1, Date value2) {
            addCriterion("cart_edit_time between", value1, value2, "cartEditTime");
            return (Criteria) this;
        }

        public Criteria andCartEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("cart_edit_time not between", value1, value2, "cartEditTime");
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