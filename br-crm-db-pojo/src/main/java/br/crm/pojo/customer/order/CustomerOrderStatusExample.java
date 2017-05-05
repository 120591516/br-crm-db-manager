package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderStatusExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderStatusExample() {
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

        public Criteria andCustomerOrderStatusIdIsNull() {
            addCriterion("customer_order_status_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdIsNotNull() {
            addCriterion("customer_order_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdEqualTo(Integer value) {
            addCriterion("customer_order_status_id =", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdNotEqualTo(Integer value) {
            addCriterion("customer_order_status_id <>", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdGreaterThan(Integer value) {
            addCriterion("customer_order_status_id >", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_order_status_id >=", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdLessThan(Integer value) {
            addCriterion("customer_order_status_id <", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_order_status_id <=", value, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdIn(List<Integer> values) {
            addCriterion("customer_order_status_id in", values, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdNotIn(List<Integer> values) {
            addCriterion("customer_order_status_id not in", values, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_status_id between", value1, value2, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_order_status_id not between", value1, value2, "customerOrderStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameIsNull() {
            addCriterion("customer_order_status_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameIsNotNull() {
            addCriterion("customer_order_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameEqualTo(String value) {
            addCriterion("customer_order_status_name =", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameNotEqualTo(String value) {
            addCriterion("customer_order_status_name <>", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameGreaterThan(String value) {
            addCriterion("customer_order_status_name >", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_status_name >=", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameLessThan(String value) {
            addCriterion("customer_order_status_name <", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameLessThanOrEqualTo(String value) {
            addCriterion("customer_order_status_name <=", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameLike(String value) {
            addCriterion("customer_order_status_name like", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameNotLike(String value) {
            addCriterion("customer_order_status_name not like", value, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameIn(List<String> values) {
            addCriterion("customer_order_status_name in", values, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameNotIn(List<String> values) {
            addCriterion("customer_order_status_name not in", values, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameBetween(String value1, String value2) {
            addCriterion("customer_order_status_name between", value1, value2, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusNameNotBetween(String value1, String value2) {
            addCriterion("customer_order_status_name not between", value1, value2, "customerOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeIsNull() {
            addCriterion("customer_order_status_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeIsNotNull() {
            addCriterion("customer_order_status_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeEqualTo(Date value) {
            addCriterion("customer_order_status_create_time =", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_order_status_create_time <>", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeGreaterThan(Date value) {
            addCriterion("customer_order_status_create_time >", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_status_create_time >=", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeLessThan(Date value) {
            addCriterion("customer_order_status_create_time <", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_status_create_time <=", value, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeIn(List<Date> values) {
            addCriterion("customer_order_status_create_time in", values, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_order_status_create_time not in", values, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_status_create_time between", value1, value2, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_status_create_time not between", value1, value2, "customerOrderStatusCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeIsNull() {
            addCriterion("customer_order_status_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeIsNotNull() {
            addCriterion("customer_order_status_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeEqualTo(Date value) {
            addCriterion("customer_order_status_edit_time =", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeNotEqualTo(Date value) {
            addCriterion("customer_order_status_edit_time <>", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeGreaterThan(Date value) {
            addCriterion("customer_order_status_edit_time >", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_order_status_edit_time >=", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeLessThan(Date value) {
            addCriterion("customer_order_status_edit_time <", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_order_status_edit_time <=", value, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeIn(List<Date> values) {
            addCriterion("customer_order_status_edit_time in", values, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeNotIn(List<Date> values) {
            addCriterion("customer_order_status_edit_time not in", values, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_order_status_edit_time between", value1, value2, "customerOrderStatusEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderStatusEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_order_status_edit_time not between", value1, value2, "customerOrderStatusEditTime");
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