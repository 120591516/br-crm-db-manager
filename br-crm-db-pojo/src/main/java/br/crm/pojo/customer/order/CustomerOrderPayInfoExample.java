package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderPayInfoExample implements Serializable  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderPayInfoExample() {
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNull() {
            addCriterion("pay_way_id is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNotNull() {
            addCriterion("pay_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdEqualTo(Integer value) {
            addCriterion("pay_way_id =", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotEqualTo(Integer value) {
            addCriterion("pay_way_id <>", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThan(Integer value) {
            addCriterion("pay_way_id >", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way_id >=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThan(Integer value) {
            addCriterion("pay_way_id <", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way_id <=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIn(List<Integer> values) {
            addCriterion("pay_way_id in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotIn(List<Integer> values) {
            addCriterion("pay_way_id not in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_way_id between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way_id not between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNull() {
            addCriterion("pay_way_name is null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNotNull() {
            addCriterion("pay_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameEqualTo(String value) {
            addCriterion("pay_way_name =", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotEqualTo(String value) {
            addCriterion("pay_way_name <>", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThan(String value) {
            addCriterion("pay_way_name >", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_name >=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThan(String value) {
            addCriterion("pay_way_name <", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_way_name <=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLike(String value) {
            addCriterion("pay_way_name like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotLike(String value) {
            addCriterion("pay_way_name not like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIn(List<String> values) {
            addCriterion("pay_way_name in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotIn(List<String> values) {
            addCriterion("pay_way_name not in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameBetween(String value1, String value2) {
            addCriterion("pay_way_name between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotBetween(String value1, String value2) {
            addCriterion("pay_way_name not between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountIsNull() {
            addCriterion("order_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountIsNotNull() {
            addCriterion("order_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountEqualTo(BigDecimal value) {
            addCriterion("order_pay_amount =", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_pay_amount <>", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountGreaterThan(BigDecimal value) {
            addCriterion("order_pay_amount >", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_pay_amount >=", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountLessThan(BigDecimal value) {
            addCriterion("order_pay_amount <", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_pay_amount <=", value, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountIn(List<BigDecimal> values) {
            addCriterion("order_pay_amount in", values, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_pay_amount not in", values, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_pay_amount between", value1, value2, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_pay_amount not between", value1, value2, "orderPayAmount");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackIsNull() {
            addCriterion("order_pay_callback is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackIsNotNull() {
            addCriterion("order_pay_callback is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackEqualTo(String value) {
            addCriterion("order_pay_callback =", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackNotEqualTo(String value) {
            addCriterion("order_pay_callback <>", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackGreaterThan(String value) {
            addCriterion("order_pay_callback >", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay_callback >=", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackLessThan(String value) {
            addCriterion("order_pay_callback <", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackLessThanOrEqualTo(String value) {
            addCriterion("order_pay_callback <=", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackLike(String value) {
            addCriterion("order_pay_callback like", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackNotLike(String value) {
            addCriterion("order_pay_callback not like", value, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackIn(List<String> values) {
            addCriterion("order_pay_callback in", values, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackNotIn(List<String> values) {
            addCriterion("order_pay_callback not in", values, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackBetween(String value1, String value2) {
            addCriterion("order_pay_callback between", value1, value2, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayCallbackNotBetween(String value1, String value2) {
            addCriterion("order_pay_callback not between", value1, value2, "orderPayCallback");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyIsNull() {
            addCriterion("order_pay_notify is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyIsNotNull() {
            addCriterion("order_pay_notify is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyEqualTo(String value) {
            addCriterion("order_pay_notify =", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyNotEqualTo(String value) {
            addCriterion("order_pay_notify <>", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyGreaterThan(String value) {
            addCriterion("order_pay_notify >", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay_notify >=", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyLessThan(String value) {
            addCriterion("order_pay_notify <", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyLessThanOrEqualTo(String value) {
            addCriterion("order_pay_notify <=", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyLike(String value) {
            addCriterion("order_pay_notify like", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyNotLike(String value) {
            addCriterion("order_pay_notify not like", value, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyIn(List<String> values) {
            addCriterion("order_pay_notify in", values, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyNotIn(List<String> values) {
            addCriterion("order_pay_notify not in", values, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyBetween(String value1, String value2) {
            addCriterion("order_pay_notify between", value1, value2, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotifyNotBetween(String value1, String value2) {
            addCriterion("order_pay_notify not between", value1, value2, "orderPayNotify");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultIsNull() {
            addCriterion("order_pay_result is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultIsNotNull() {
            addCriterion("order_pay_result is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultEqualTo(Integer value) {
            addCriterion("order_pay_result =", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultNotEqualTo(Integer value) {
            addCriterion("order_pay_result <>", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultGreaterThan(Integer value) {
            addCriterion("order_pay_result >", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pay_result >=", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultLessThan(Integer value) {
            addCriterion("order_pay_result <", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultLessThanOrEqualTo(Integer value) {
            addCriterion("order_pay_result <=", value, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultIn(List<Integer> values) {
            addCriterion("order_pay_result in", values, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultNotIn(List<Integer> values) {
            addCriterion("order_pay_result not in", values, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_result between", value1, value2, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayResultNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pay_result not between", value1, value2, "orderPayResult");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoIsNull() {
            addCriterion("order_pay_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoIsNotNull() {
            addCriterion("order_pay_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoEqualTo(String value) {
            addCriterion("order_pay_order_no =", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoNotEqualTo(String value) {
            addCriterion("order_pay_order_no <>", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoGreaterThan(String value) {
            addCriterion("order_pay_order_no >", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay_order_no >=", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoLessThan(String value) {
            addCriterion("order_pay_order_no <", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_pay_order_no <=", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoLike(String value) {
            addCriterion("order_pay_order_no like", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoNotLike(String value) {
            addCriterion("order_pay_order_no not like", value, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoIn(List<String> values) {
            addCriterion("order_pay_order_no in", values, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoNotIn(List<String> values) {
            addCriterion("order_pay_order_no not in", values, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoBetween(String value1, String value2) {
            addCriterion("order_pay_order_no between", value1, value2, "orderPayOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderPayOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_pay_order_no not between", value1, value2, "orderPayOrderNo");
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

        public Criteria andCustomerOrderPayInfoCreateTimeIsNull() {
            addCriterion("customer_order_pay_info_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeIsNotNull() {
            addCriterion("customer_order_pay_info_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeEqualTo(Date value) {
            addCriterion("customer_order_pay_info_create_time =", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_order_pay_info_create_time <>", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeGreaterThan(Date value) {
            addCriterion("customer_order_pay_info_create_time >", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_pay_info_create_time >=", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeLessThan(Date value) {
            addCriterion("customer_order_pay_info_create_time <", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_pay_info_create_time <=", value, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeIn(List<Date> values) {
            addCriterion("customer_order_pay_info_create_time in", values, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_order_pay_info_create_time not in", values, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_pay_info_create_time between", value1, value2, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_pay_info_create_time not between", value1, value2, "customerOrderPayInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeIsNull() {
            addCriterion("customer_order_pay_info_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeIsNotNull() {
            addCriterion("customer_order_pay_info_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeEqualTo(Date value) {
            addCriterion("customer_order_pay_info_edit_time =", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeNotEqualTo(Date value) {
            addCriterion("customer_order_pay_info_edit_time <>", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeGreaterThan(Date value) {
            addCriterion("customer_order_pay_info_edit_time >", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_pay_info_edit_time >=", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeLessThan(Date value) {
            addCriterion("customer_order_pay_info_edit_time <", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_pay_info_edit_time <=", value, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeIn(List<Date> values) {
            addCriterion("customer_order_pay_info_edit_time in", values, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeNotIn(List<Date> values) {
            addCriterion("customer_order_pay_info_edit_time not in", values, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_pay_info_edit_time between", value1, value2, "customerOrderPayInfoEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderPayInfoEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_pay_info_edit_time not between", value1, value2, "customerOrderPayInfoEditTime");
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