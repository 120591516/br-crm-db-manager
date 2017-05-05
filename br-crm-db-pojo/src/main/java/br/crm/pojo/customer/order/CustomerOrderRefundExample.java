package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderRefundExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderRefundExample() {
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

        public Criteria andCustomerOrderRefundIdIsNull() {
            addCriterion("customer_order_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdIsNotNull() {
            addCriterion("customer_order_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdEqualTo(String value) {
            addCriterion("customer_order_refund_id =", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdNotEqualTo(String value) {
            addCriterion("customer_order_refund_id <>", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdGreaterThan(String value) {
            addCriterion("customer_order_refund_id >", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_refund_id >=", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdLessThan(String value) {
            addCriterion("customer_order_refund_id <", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_refund_id <=", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdLike(String value) {
            addCriterion("customer_order_refund_id like", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdNotLike(String value) {
            addCriterion("customer_order_refund_id not like", value, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdIn(List<String> values) {
            addCriterion("customer_order_refund_id in", values, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdNotIn(List<String> values) {
            addCriterion("customer_order_refund_id not in", values, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdBetween(String value1, String value2) {
            addCriterion("customer_order_refund_id between", value1, value2, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_refund_id not between", value1, value2, "customerOrderRefundId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdIsNull() {
            addCriterion("customer_order_pay_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdIsNotNull() {
            addCriterion("customer_order_pay_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdEqualTo(String value) {
            addCriterion("customer_order_pay_info_id =", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdNotEqualTo(String value) {
            addCriterion("customer_order_pay_info_id <>", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdGreaterThan(String value) {
            addCriterion("customer_order_pay_info_id >", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_pay_info_id >=", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdLessThan(String value) {
            addCriterion("customer_order_pay_info_id <", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_pay_info_id <=", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdLike(String value) {
            addCriterion("customer_order_pay_info_id like", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdNotLike(String value) {
            addCriterion("customer_order_pay_info_id not like", value, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdIn(List<String> values) {
            addCriterion("customer_order_pay_info_id in", values, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdNotIn(List<String> values) {
            addCriterion("customer_order_pay_info_id not in", values, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdBetween(String value1, String value2) {
            addCriterion("customer_order_pay_info_id between", value1, value2, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_pay_info_id not between", value1, value2, "customerOrderPayInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoIsNull() {
            addCriterion("customer_order_pay_info_No is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoIsNotNull() {
            addCriterion("customer_order_pay_info_No is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoEqualTo(String value) {
            addCriterion("customer_order_pay_info_No =", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoNotEqualTo(String value) {
            addCriterion("customer_order_pay_info_No <>", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoGreaterThan(String value) {
            addCriterion("customer_order_pay_info_No >", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_pay_info_No >=", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoLessThan(String value) {
            addCriterion("customer_order_pay_info_No <", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoLessThanOrEqualTo(String value) {
            addCriterion("customer_order_pay_info_No <=", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoLike(String value) {
            addCriterion("customer_order_pay_info_No like", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoNotLike(String value) {
            addCriterion("customer_order_pay_info_No not like", value, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoIn(List<String> values) {
            addCriterion("customer_order_pay_info_No in", values, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoNotIn(List<String> values) {
            addCriterion("customer_order_pay_info_No not in", values, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoBetween(String value1, String value2) {
            addCriterion("customer_order_pay_info_No between", value1, value2, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoNoNotBetween(String value1, String value2) {
            addCriterion("customer_order_pay_info_No not between", value1, value2, "customerOrderPayInfoNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdIsNull() {
            addCriterion("customer_order_pay_way_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdIsNotNull() {
            addCriterion("customer_order_pay_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdEqualTo(Integer value) {
            addCriterion("customer_order_pay_way_id =", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdNotEqualTo(Integer value) {
            addCriterion("customer_order_pay_way_id <>", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdGreaterThan(Integer value) {
            addCriterion("customer_order_pay_way_id >", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_order_pay_way_id >=", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdLessThan(Integer value) {
            addCriterion("customer_order_pay_way_id <", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_order_pay_way_id <=", value, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdIn(List<Integer> values) {
            addCriterion("customer_order_pay_way_id in", values, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdNotIn(List<Integer> values) {
            addCriterion("customer_order_pay_way_id not in", values, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_pay_way_id between", value1, value2, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_pay_way_id not between", value1, value2, "customerOrderPayWayId");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoIsNull() {
            addCriterion("order_refund_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoIsNotNull() {
            addCriterion("order_refund_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoEqualTo(String value) {
            addCriterion("order_refund_order_no =", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoNotEqualTo(String value) {
            addCriterion("order_refund_order_no <>", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoGreaterThan(String value) {
            addCriterion("order_refund_order_no >", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_refund_order_no >=", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoLessThan(String value) {
            addCriterion("order_refund_order_no <", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_refund_order_no <=", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoLike(String value) {
            addCriterion("order_refund_order_no like", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoNotLike(String value) {
            addCriterion("order_refund_order_no not like", value, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoIn(List<String> values) {
            addCriterion("order_refund_order_no in", values, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoNotIn(List<String> values) {
            addCriterion("order_refund_order_no not in", values, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoBetween(String value1, String value2) {
            addCriterion("order_refund_order_no between", value1, value2, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_refund_order_no not between", value1, value2, "orderRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsIsNull() {
            addCriterion("order_refund_details is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsIsNotNull() {
            addCriterion("order_refund_details is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsEqualTo(String value) {
            addCriterion("order_refund_details =", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsNotEqualTo(String value) {
            addCriterion("order_refund_details <>", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsGreaterThan(String value) {
            addCriterion("order_refund_details >", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("order_refund_details >=", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsLessThan(String value) {
            addCriterion("order_refund_details <", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsLessThanOrEqualTo(String value) {
            addCriterion("order_refund_details <=", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsLike(String value) {
            addCriterion("order_refund_details like", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsNotLike(String value) {
            addCriterion("order_refund_details not like", value, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsIn(List<String> values) {
            addCriterion("order_refund_details in", values, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsNotIn(List<String> values) {
            addCriterion("order_refund_details not in", values, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsBetween(String value1, String value2) {
            addCriterion("order_refund_details between", value1, value2, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundDetailsNotBetween(String value1, String value2) {
            addCriterion("order_refund_details not between", value1, value2, "orderRefundDetails");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultIsNull() {
            addCriterion("order_refund_result is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultIsNotNull() {
            addCriterion("order_refund_result is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultEqualTo(Integer value) {
            addCriterion("order_refund_result =", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultNotEqualTo(Integer value) {
            addCriterion("order_refund_result <>", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultGreaterThan(Integer value) {
            addCriterion("order_refund_result >", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_refund_result >=", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultLessThan(Integer value) {
            addCriterion("order_refund_result <", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultLessThanOrEqualTo(Integer value) {
            addCriterion("order_refund_result <=", value, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultIn(List<Integer> values) {
            addCriterion("order_refund_result in", values, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultNotIn(List<Integer> values) {
            addCriterion("order_refund_result not in", values, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_result between", value1, value2, "orderRefundResult");
            return (Criteria) this;
        }

        public Criteria andOrderRefundResultNotBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_result not between", value1, value2, "orderRefundResult");
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

        public Criteria andCustomerOrderRefundCreateTimeIsNull() {
            addCriterion("customer_order_refund_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeIsNotNull() {
            addCriterion("customer_order_refund_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeEqualTo(Date value) {
            addCriterion("customer_order_refund_create_time =", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_order_refund_create_time <>", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeGreaterThan(Date value) {
            addCriterion("customer_order_refund_create_time >", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_refund_create_time >=", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeLessThan(Date value) {
            addCriterion("customer_order_refund_create_time <", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_refund_create_time <=", value, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeIn(List<Date> values) {
            addCriterion("customer_order_refund_create_time in", values, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_order_refund_create_time not in", values, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_refund_create_time between", value1, value2, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_refund_create_time not between", value1, value2, "customerOrderRefundCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeIsNull() {
            addCriterion("customer_order_refund_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeIsNotNull() {
            addCriterion("customer_order_refund_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeEqualTo(Date value) {
            addCriterion("customer_order_refund_edit_time =", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeNotEqualTo(Date value) {
            addCriterion("customer_order_refund_edit_time <>", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeGreaterThan(Date value) {
            addCriterion("customer_order_refund_edit_time >", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_refund_edit_time >=", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeLessThan(Date value) {
            addCriterion("customer_order_refund_edit_time <", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_refund_edit_time <=", value, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeIn(List<Date> values) {
            addCriterion("customer_order_refund_edit_time in", values, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeNotIn(List<Date> values) {
            addCriterion("customer_order_refund_edit_time not in", values, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_refund_edit_time between", value1, value2, "customerOrderRefundEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderRefundEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_refund_edit_time not between", value1, value2, "customerOrderRefundEditTime");
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