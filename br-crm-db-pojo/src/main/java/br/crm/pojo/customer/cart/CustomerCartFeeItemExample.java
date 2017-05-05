package br.crm.pojo.customer.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCartFeeItemExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerCartFeeItemExample() {
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

        public Criteria andCustomerCartFeeItemIdIsNull() {
            addCriterion("customer_cart_fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdIsNotNull() {
            addCriterion("customer_cart_fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdEqualTo(String value) {
            addCriterion("customer_cart_fee_item_id =", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdNotEqualTo(String value) {
            addCriterion("customer_cart_fee_item_id <>", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdGreaterThan(String value) {
            addCriterion("customer_cart_fee_item_id >", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cart_fee_item_id >=", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdLessThan(String value) {
            addCriterion("customer_cart_fee_item_id <", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("customer_cart_fee_item_id <=", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdLike(String value) {
            addCriterion("customer_cart_fee_item_id like", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdNotLike(String value) {
            addCriterion("customer_cart_fee_item_id not like", value, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdIn(List<String> values) {
            addCriterion("customer_cart_fee_item_id in", values, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdNotIn(List<String> values) {
            addCriterion("customer_cart_fee_item_id not in", values, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdBetween(String value1, String value2) {
            addCriterion("customer_cart_fee_item_id between", value1, value2, "customerCartFeeItemId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("customer_cart_fee_item_id not between", value1, value2, "customerCartFeeItemId");
            return (Criteria) this;
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

        public Criteria andExamFeeItemIdOldIsNull() {
            addCriterion("exam_fee_item_id_old is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldIsNotNull() {
            addCriterion("exam_fee_item_id_old is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldEqualTo(String value) {
            addCriterion("exam_fee_item_id_old =", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldNotEqualTo(String value) {
            addCriterion("exam_fee_item_id_old <>", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldGreaterThan(String value) {
            addCriterion("exam_fee_item_id_old >", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id_old >=", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldLessThan(String value) {
            addCriterion("exam_fee_item_id_old <", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id_old <=", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldLike(String value) {
            addCriterion("exam_fee_item_id_old like", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldNotLike(String value) {
            addCriterion("exam_fee_item_id_old not like", value, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldIn(List<String> values) {
            addCriterion("exam_fee_item_id_old in", values, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldNotIn(List<String> values) {
            addCriterion("exam_fee_item_id_old not in", values, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id_old between", value1, value2, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdOldNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id_old not between", value1, value2, "examFeeItemIdOld");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNull() {
            addCriterion("exam_fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNotNull() {
            addCriterion("exam_fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdEqualTo(String value) {
            addCriterion("exam_fee_item_id =", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_id <>", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThan(String value) {
            addCriterion("exam_fee_item_id >", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id >=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThan(String value) {
            addCriterion("exam_fee_item_id <", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id <=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLike(String value) {
            addCriterion("exam_fee_item_id like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotLike(String value) {
            addCriterion("exam_fee_item_id not like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIn(List<String> values) {
            addCriterion("exam_fee_item_id in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_id not in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id between", value1, value2, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id not between", value1, value2, "examFeeItemId");
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

        public Criteria andCustomerCartFeeItemStatusIsNull() {
            addCriterion("customer_cart_fee_item_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusIsNotNull() {
            addCriterion("customer_cart_fee_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusEqualTo(Integer value) {
            addCriterion("customer_cart_fee_item_status =", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusNotEqualTo(Integer value) {
            addCriterion("customer_cart_fee_item_status <>", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusGreaterThan(Integer value) {
            addCriterion("customer_cart_fee_item_status >", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_cart_fee_item_status >=", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusLessThan(Integer value) {
            addCriterion("customer_cart_fee_item_status <", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_cart_fee_item_status <=", value, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusIn(List<Integer> values) {
            addCriterion("customer_cart_fee_item_status in", values, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusNotIn(List<Integer> values) {
            addCriterion("customer_cart_fee_item_status not in", values, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_cart_fee_item_status between", value1, value2, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_cart_fee_item_status not between", value1, value2, "customerCartFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeIsNull() {
            addCriterion("customer_cart_fee_item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeIsNotNull() {
            addCriterion("customer_cart_fee_item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_create_time =", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_create_time <>", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeGreaterThan(Date value) {
            addCriterion("customer_cart_fee_item_create_time >", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_create_time >=", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeLessThan(Date value) {
            addCriterion("customer_cart_fee_item_create_time <", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_create_time <=", value, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeIn(List<Date> values) {
            addCriterion("customer_cart_fee_item_create_time in", values, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_cart_fee_item_create_time not in", values, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_cart_fee_item_create_time between", value1, value2, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_cart_fee_item_create_time not between", value1, value2, "customerCartFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeIsNull() {
            addCriterion("customer_cart_fee_item_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeIsNotNull() {
            addCriterion("customer_cart_fee_item_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_edit_time =", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeNotEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_edit_time <>", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeGreaterThan(Date value) {
            addCriterion("customer_cart_fee_item_edit_time >", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_edit_time >=", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeLessThan(Date value) {
            addCriterion("customer_cart_fee_item_edit_time <", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_cart_fee_item_edit_time <=", value, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeIn(List<Date> values) {
            addCriterion("customer_cart_fee_item_edit_time in", values, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeNotIn(List<Date> values) {
            addCriterion("customer_cart_fee_item_edit_time not in", values, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_cart_fee_item_edit_time between", value1, value2, "customerCartFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCartFeeItemEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_cart_fee_item_edit_time not between", value1, value2, "customerCartFeeItemEditTime");
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