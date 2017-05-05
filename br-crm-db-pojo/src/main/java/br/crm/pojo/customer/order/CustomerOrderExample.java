package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderExample() {
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

        public Criteria andCustomerOrderIdIsNull() {
            addCriterion("customer_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdIsNotNull() {
            addCriterion("customer_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdEqualTo(String value) {
            addCriterion("customer_order_id =", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotEqualTo(String value) {
            addCriterion("customer_order_id <>", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdGreaterThan(String value) {
            addCriterion("customer_order_id >", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_id >=", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLessThan(String value) {
            addCriterion("customer_order_id <", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_id <=", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLike(String value) {
            addCriterion("customer_order_id like", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotLike(String value) {
            addCriterion("customer_order_id not like", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdIn(List<String> values) {
            addCriterion("customer_order_id in", values, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotIn(List<String> values) {
            addCriterion("customer_order_id not in", values, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdBetween(String value1, String value2) {
            addCriterion("customer_order_id between", value1, value2, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_id not between", value1, value2, "customerOrderId");
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
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

        public Criteria andOrderLinkmanIsNull() {
            addCriterion("order_linkman is null");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanIsNotNull() {
            addCriterion("order_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanEqualTo(String value) {
            addCriterion("order_linkman =", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanNotEqualTo(String value) {
            addCriterion("order_linkman <>", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanGreaterThan(String value) {
            addCriterion("order_linkman >", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("order_linkman >=", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanLessThan(String value) {
            addCriterion("order_linkman <", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanLessThanOrEqualTo(String value) {
            addCriterion("order_linkman <=", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanLike(String value) {
            addCriterion("order_linkman like", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanNotLike(String value) {
            addCriterion("order_linkman not like", value, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanIn(List<String> values) {
            addCriterion("order_linkman in", values, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanNotIn(List<String> values) {
            addCriterion("order_linkman not in", values, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanBetween(String value1, String value2) {
            addCriterion("order_linkman between", value1, value2, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderLinkmanNotBetween(String value1, String value2) {
            addCriterion("order_linkman not between", value1, value2, "orderLinkman");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNull() {
            addCriterion("order_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNotNull() {
            addCriterion("order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneEqualTo(String value) {
            addCriterion("order_phone =", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotEqualTo(String value) {
            addCriterion("order_phone <>", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThan(String value) {
            addCriterion("order_phone >", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_phone >=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThan(String value) {
            addCriterion("order_phone <", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("order_phone <=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLike(String value) {
            addCriterion("order_phone like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotLike(String value) {
            addCriterion("order_phone not like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIn(List<String> values) {
            addCriterion("order_phone in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotIn(List<String> values) {
            addCriterion("order_phone not in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneBetween(String value1, String value2) {
            addCriterion("order_phone between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("order_phone not between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotIsNull() {
            addCriterion("order_snapshot is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotIsNotNull() {
            addCriterion("order_snapshot is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotEqualTo(String value) {
            addCriterion("order_snapshot =", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotNotEqualTo(String value) {
            addCriterion("order_snapshot <>", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotGreaterThan(String value) {
            addCriterion("order_snapshot >", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotGreaterThanOrEqualTo(String value) {
            addCriterion("order_snapshot >=", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotLessThan(String value) {
            addCriterion("order_snapshot <", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotLessThanOrEqualTo(String value) {
            addCriterion("order_snapshot <=", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotLike(String value) {
            addCriterion("order_snapshot like", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotNotLike(String value) {
            addCriterion("order_snapshot not like", value, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotIn(List<String> values) {
            addCriterion("order_snapshot in", values, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotNotIn(List<String> values) {
            addCriterion("order_snapshot not in", values, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotBetween(String value1, String value2) {
            addCriterion("order_snapshot between", value1, value2, "orderSnapshot");
            return (Criteria) this;
        }

        public Criteria andOrderSnapshotNotBetween(String value1, String value2) {
            addCriterion("order_snapshot not between", value1, value2, "orderSnapshot");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusIsNull() {
            addCriterion("order_refund_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusIsNotNull() {
            addCriterion("order_refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusEqualTo(Integer value) {
            addCriterion("order_refund_status =", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusNotEqualTo(Integer value) {
            addCriterion("order_refund_status <>", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusGreaterThan(Integer value) {
            addCriterion("order_refund_status >", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_refund_status >=", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusLessThan(Integer value) {
            addCriterion("order_refund_status <", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_refund_status <=", value, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusIn(List<Integer> values) {
            addCriterion("order_refund_status in", values, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusNotIn(List<Integer> values) {
            addCriterion("order_refund_status not in", values, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_status between", value1, value2, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_refund_status not between", value1, value2, "orderRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentIsNull() {
            addCriterion("order_installment is null");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentIsNotNull() {
            addCriterion("order_installment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentEqualTo(Boolean value) {
            addCriterion("order_installment =", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentNotEqualTo(Boolean value) {
            addCriterion("order_installment <>", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentGreaterThan(Boolean value) {
            addCriterion("order_installment >", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_installment >=", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentLessThan(Boolean value) {
            addCriterion("order_installment <", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentLessThanOrEqualTo(Boolean value) {
            addCriterion("order_installment <=", value, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentIn(List<Boolean> values) {
            addCriterion("order_installment in", values, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentNotIn(List<Boolean> values) {
            addCriterion("order_installment not in", values, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentBetween(Boolean value1, Boolean value2) {
            addCriterion("order_installment between", value1, value2, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_installment not between", value1, value2, "orderInstallment");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusIsNull() {
            addCriterion("order_installment_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusIsNotNull() {
            addCriterion("order_installment_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusEqualTo(String value) {
            addCriterion("order_installment_status =", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusNotEqualTo(String value) {
            addCriterion("order_installment_status <>", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusGreaterThan(String value) {
            addCriterion("order_installment_status >", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_installment_status >=", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusLessThan(String value) {
            addCriterion("order_installment_status <", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusLessThanOrEqualTo(String value) {
            addCriterion("order_installment_status <=", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusLike(String value) {
            addCriterion("order_installment_status like", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusNotLike(String value) {
            addCriterion("order_installment_status not like", value, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusIn(List<String> values) {
            addCriterion("order_installment_status in", values, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusNotIn(List<String> values) {
            addCriterion("order_installment_status not in", values, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusBetween(String value1, String value2) {
            addCriterion("order_installment_status between", value1, value2, "orderInstallmentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInstallmentStatusNotBetween(String value1, String value2) {
            addCriterion("order_installment_status not between", value1, value2, "orderInstallmentStatus");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
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

        public Criteria andReceiptStatusIsNull() {
            addCriterion("receipt_status is null");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusIsNotNull() {
            addCriterion("receipt_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusEqualTo(Integer value) {
            addCriterion("receipt_status =", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotEqualTo(Integer value) {
            addCriterion("receipt_status <>", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusGreaterThan(Integer value) {
            addCriterion("receipt_status >", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_status >=", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusLessThan(Integer value) {
            addCriterion("receipt_status <", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_status <=", value, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusIn(List<Integer> values) {
            addCriterion("receipt_status in", values, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotIn(List<Integer> values) {
            addCriterion("receipt_status not in", values, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusBetween(Integer value1, Integer value2) {
            addCriterion("receipt_status between", value1, value2, "receiptStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_status not between", value1, value2, "receiptStatus");
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

        public Criteria andCustomerOrderStatusIsNull() {
            addCriterion("customer_order_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIsNotNull() {
            addCriterion("customer_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEqualTo(Integer value) {
            addCriterion("customer_order_status =", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNotEqualTo(Integer value) {
            addCriterion("customer_order_status <>", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusGreaterThan(Integer value) {
            addCriterion("customer_order_status >", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_order_status >=", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusLessThan(Integer value) {
            addCriterion("customer_order_status <", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_order_status <=", value, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIn(List<Integer> values) {
            addCriterion("customer_order_status in", values, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNotIn(List<Integer> values) {
            addCriterion("customer_order_status not in", values, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_status between", value1, value2, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_status not between", value1, value2, "customerOrderStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeIsNull() {
            addCriterion("customer_order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeIsNotNull() {
            addCriterion("customer_order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeEqualTo(Date value) {
            addCriterion("customer_order_create_time =", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_order_create_time <>", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeGreaterThan(Date value) {
            addCriterion("customer_order_create_time >", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_create_time >=", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeLessThan(Date value) {
            addCriterion("customer_order_create_time <", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_create_time <=", value, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeIn(List<Date> values) {
            addCriterion("customer_order_create_time in", values, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_order_create_time not in", values, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_create_time between", value1, value2, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_create_time not between", value1, value2, "customerOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeIsNull() {
            addCriterion("customer_order_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeIsNotNull() {
            addCriterion("customer_order_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeEqualTo(Date value) {
            addCriterion("customer_order_edit_time =", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeNotEqualTo(Date value) {
            addCriterion("customer_order_edit_time <>", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeGreaterThan(Date value) {
            addCriterion("customer_order_edit_time >", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_edit_time >=", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeLessThan(Date value) {
            addCriterion("customer_order_edit_time <", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_edit_time <=", value, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeIn(List<Date> values) {
            addCriterion("customer_order_edit_time in", values, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeNotIn(List<Date> values) {
            addCriterion("customer_order_edit_time not in", values, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_edit_time between", value1, value2, "customerOrderEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_edit_time not between", value1, value2, "customerOrderEditTime");
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