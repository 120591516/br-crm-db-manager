package br.crm.pojo.customer.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderCartExample() {
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

        public Criteria andCustomerOrderCartIdIsNull() {
            addCriterion("customer_order_cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdIsNotNull() {
            addCriterion("customer_order_cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdEqualTo(String value) {
            addCriterion("customer_order_cart_id =", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdNotEqualTo(String value) {
            addCriterion("customer_order_cart_id <>", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdGreaterThan(String value) {
            addCriterion("customer_order_cart_id >", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_cart_id >=", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdLessThan(String value) {
            addCriterion("customer_order_cart_id <", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_cart_id <=", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdLike(String value) {
            addCriterion("customer_order_cart_id like", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdNotLike(String value) {
            addCriterion("customer_order_cart_id not like", value, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdIn(List<String> values) {
            addCriterion("customer_order_cart_id in", values, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdNotIn(List<String> values) {
            addCriterion("customer_order_cart_id not in", values, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdBetween(String value1, String value2) {
            addCriterion("customer_order_cart_id between", value1, value2, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_cart_id not between", value1, value2, "customerOrderCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIsNull() {
            addCriterion("customer_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIsNotNull() {
            addCriterion("customer_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoEqualTo(String value) {
            addCriterion("customer_order_no =", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotEqualTo(String value) {
            addCriterion("customer_order_no <>", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoGreaterThan(String value) {
            addCriterion("customer_order_no >", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_no >=", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLessThan(String value) {
            addCriterion("customer_order_no <", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLessThanOrEqualTo(String value) {
            addCriterion("customer_order_no <=", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLike(String value) {
            addCriterion("customer_order_no like", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotLike(String value) {
            addCriterion("customer_order_no not like", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIn(List<String> values) {
            addCriterion("customer_order_no in", values, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotIn(List<String> values) {
            addCriterion("customer_order_no not in", values, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoBetween(String value1, String value2) {
            addCriterion("customer_order_no between", value1, value2, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotBetween(String value1, String value2) {
            addCriterion("customer_order_no not between", value1, value2, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdIsNull() {
            addCriterion("customer_cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdIsNotNull() {
            addCriterion("customer_cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdEqualTo(String value) {
            addCriterion("customer_cart_id =", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdNotEqualTo(String value) {
            addCriterion("customer_cart_id <>", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdGreaterThan(String value) {
            addCriterion("customer_cart_id >", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cart_id >=", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdLessThan(String value) {
            addCriterion("customer_cart_id <", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdLessThanOrEqualTo(String value) {
            addCriterion("customer_cart_id <=", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdLike(String value) {
            addCriterion("customer_cart_id like", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdNotLike(String value) {
            addCriterion("customer_cart_id not like", value, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdIn(List<String> values) {
            addCriterion("customer_cart_id in", values, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdNotIn(List<String> values) {
            addCriterion("customer_cart_id not in", values, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdBetween(String value1, String value2) {
            addCriterion("customer_cart_id between", value1, value2, "customerCartId");
            return (Criteria) this;
        }

        public Criteria andCustomerCartIdNotBetween(String value1, String value2) {
            addCriterion("customer_cart_id not between", value1, value2, "customerCartId");
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

        public Criteria andOrgBranchIdIsNull() {
            addCriterion("org_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIsNotNull() {
            addCriterion("org_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdEqualTo(String value) {
            addCriterion("org_branch_id =", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotEqualTo(String value) {
            addCriterion("org_branch_id <>", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThan(String value) {
            addCriterion("org_branch_id >", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_id >=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThan(String value) {
            addCriterion("org_branch_id <", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThanOrEqualTo(String value) {
            addCriterion("org_branch_id <=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLike(String value) {
            addCriterion("org_branch_id like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotLike(String value) {
            addCriterion("org_branch_id not like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIn(List<String> values) {
            addCriterion("org_branch_id in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotIn(List<String> values) {
            addCriterion("org_branch_id not in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdBetween(String value1, String value2) {
            addCriterion("org_branch_id between", value1, value2, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotBetween(String value1, String value2) {
            addCriterion("org_branch_id not between", value1, value2, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameIsNull() {
            addCriterion("org_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameIsNotNull() {
            addCriterion("org_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameEqualTo(String value) {
            addCriterion("org_branch_name =", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameNotEqualTo(String value) {
            addCriterion("org_branch_name <>", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameGreaterThan(String value) {
            addCriterion("org_branch_name >", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_name >=", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameLessThan(String value) {
            addCriterion("org_branch_name <", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameLessThanOrEqualTo(String value) {
            addCriterion("org_branch_name <=", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameLike(String value) {
            addCriterion("org_branch_name like", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameNotLike(String value) {
            addCriterion("org_branch_name not like", value, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameIn(List<String> values) {
            addCriterion("org_branch_name in", values, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameNotIn(List<String> values) {
            addCriterion("org_branch_name not in", values, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameBetween(String value1, String value2) {
            addCriterion("org_branch_name between", value1, value2, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andOrgBranchNameNotBetween(String value1, String value2) {
            addCriterion("org_branch_name not between", value1, value2, "orgBranchName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusIsNull() {
            addCriterion("customer_order_cart_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusIsNotNull() {
            addCriterion("customer_order_cart_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusEqualTo(Integer value) {
            addCriterion("customer_order_cart_status =", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusNotEqualTo(Integer value) {
            addCriterion("customer_order_cart_status <>", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusGreaterThan(Integer value) {
            addCriterion("customer_order_cart_status >", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_order_cart_status >=", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusLessThan(Integer value) {
            addCriterion("customer_order_cart_status <", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_order_cart_status <=", value, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusIn(List<Integer> values) {
            addCriterion("customer_order_cart_status in", values, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusNotIn(List<Integer> values) {
            addCriterion("customer_order_cart_status not in", values, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_cart_status between", value1, value2, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_cart_status not between", value1, value2, "customerOrderCartStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeIsNull() {
            addCriterion("customer_order_cart_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeIsNotNull() {
            addCriterion("customer_order_cart_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeEqualTo(Date value) {
            addCriterion("customer_order_cart_create_time =", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_order_cart_create_time <>", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeGreaterThan(Date value) {
            addCriterion("customer_order_cart_create_time >", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_cart_create_time >=", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeLessThan(Date value) {
            addCriterion("customer_order_cart_create_time <", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_cart_create_time <=", value, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeIn(List<Date> values) {
            addCriterion("customer_order_cart_create_time in", values, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_order_cart_create_time not in", values, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_cart_create_time between", value1, value2, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_cart_create_time not between", value1, value2, "customerOrderCartCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeIsNull() {
            addCriterion("customer_order_cart_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeIsNotNull() {
            addCriterion("customer_order_cart_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeEqualTo(Date value) {
            addCriterion("customer_order_cart_edit_time =", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeNotEqualTo(Date value) {
            addCriterion("customer_order_cart_edit_time <>", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeGreaterThan(Date value) {
            addCriterion("customer_order_cart_edit_time >", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_cart_edit_time >=", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeLessThan(Date value) {
            addCriterion("customer_order_cart_edit_time <", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_cart_edit_time <=", value, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeIn(List<Date> values) {
            addCriterion("customer_order_cart_edit_time in", values, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeNotIn(List<Date> values) {
            addCriterion("customer_order_cart_edit_time not in", values, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_cart_edit_time between", value1, value2, "customerOrderCartEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCartEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_cart_edit_time not between", value1, value2, "customerOrderCartEditTime");
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