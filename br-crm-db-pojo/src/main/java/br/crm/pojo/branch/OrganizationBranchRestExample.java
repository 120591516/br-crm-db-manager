package br.crm.pojo.branch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchRestExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchRestExample() {
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

        public Criteria andBranchRestIdIsNull() {
            addCriterion("branch_rest_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdIsNotNull() {
            addCriterion("branch_rest_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdEqualTo(String value) {
            addCriterion("branch_rest_id =", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdNotEqualTo(String value) {
            addCriterion("branch_rest_id <>", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdGreaterThan(String value) {
            addCriterion("branch_rest_id >", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_rest_id >=", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdLessThan(String value) {
            addCriterion("branch_rest_id <", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdLessThanOrEqualTo(String value) {
            addCriterion("branch_rest_id <=", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdLike(String value) {
            addCriterion("branch_rest_id like", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdNotLike(String value) {
            addCriterion("branch_rest_id not like", value, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdIn(List<String> values) {
            addCriterion("branch_rest_id in", values, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdNotIn(List<String> values) {
            addCriterion("branch_rest_id not in", values, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdBetween(String value1, String value2) {
            addCriterion("branch_rest_id between", value1, value2, "branchRestId");
            return (Criteria) this;
        }

        public Criteria andBranchRestIdNotBetween(String value1, String value2) {
            addCriterion("branch_rest_id not between", value1, value2, "branchRestId");
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

        public Criteria andBranchRestTypeIsNull() {
            addCriterion("branch_rest_type is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeIsNotNull() {
            addCriterion("branch_rest_type is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeEqualTo(Integer value) {
            addCriterion("branch_rest_type =", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeNotEqualTo(Integer value) {
            addCriterion("branch_rest_type <>", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeGreaterThan(Integer value) {
            addCriterion("branch_rest_type >", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_rest_type >=", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeLessThan(Integer value) {
            addCriterion("branch_rest_type <", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("branch_rest_type <=", value, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeIn(List<Integer> values) {
            addCriterion("branch_rest_type in", values, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeNotIn(List<Integer> values) {
            addCriterion("branch_rest_type not in", values, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeBetween(Integer value1, Integer value2) {
            addCriterion("branch_rest_type between", value1, value2, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_rest_type not between", value1, value2, "branchRestType");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueIsNull() {
            addCriterion("branch_rest_value is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueIsNotNull() {
            addCriterion("branch_rest_value is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueEqualTo(String value) {
            addCriterion("branch_rest_value =", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueNotEqualTo(String value) {
            addCriterion("branch_rest_value <>", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueGreaterThan(String value) {
            addCriterion("branch_rest_value >", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueGreaterThanOrEqualTo(String value) {
            addCriterion("branch_rest_value >=", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueLessThan(String value) {
            addCriterion("branch_rest_value <", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueLessThanOrEqualTo(String value) {
            addCriterion("branch_rest_value <=", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueLike(String value) {
            addCriterion("branch_rest_value like", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueNotLike(String value) {
            addCriterion("branch_rest_value not like", value, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueIn(List<String> values) {
            addCriterion("branch_rest_value in", values, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueNotIn(List<String> values) {
            addCriterion("branch_rest_value not in", values, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueBetween(String value1, String value2) {
            addCriterion("branch_rest_value between", value1, value2, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestValueNotBetween(String value1, String value2) {
            addCriterion("branch_rest_value not between", value1, value2, "branchRestValue");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusIsNull() {
            addCriterion("branch_rest_status is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusIsNotNull() {
            addCriterion("branch_rest_status is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusEqualTo(Integer value) {
            addCriterion("branch_rest_status =", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusNotEqualTo(Integer value) {
            addCriterion("branch_rest_status <>", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusGreaterThan(Integer value) {
            addCriterion("branch_rest_status >", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_rest_status >=", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusLessThan(Integer value) {
            addCriterion("branch_rest_status <", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusLessThanOrEqualTo(Integer value) {
            addCriterion("branch_rest_status <=", value, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusIn(List<Integer> values) {
            addCriterion("branch_rest_status in", values, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusNotIn(List<Integer> values) {
            addCriterion("branch_rest_status not in", values, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusBetween(Integer value1, Integer value2) {
            addCriterion("branch_rest_status between", value1, value2, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_rest_status not between", value1, value2, "branchRestStatus");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeIsNull() {
            addCriterion("branch_rest_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeIsNotNull() {
            addCriterion("branch_rest_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeEqualTo(Date value) {
            addCriterion("branch_rest_create_time =", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeNotEqualTo(Date value) {
            addCriterion("branch_rest_create_time <>", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeGreaterThan(Date value) {
            addCriterion("branch_rest_create_time >", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("branch_rest_create_time >=", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeLessThan(Date value) {
            addCriterion("branch_rest_create_time <", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("branch_rest_create_time <=", value, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeIn(List<Date> values) {
            addCriterion("branch_rest_create_time in", values, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeNotIn(List<Date> values) {
            addCriterion("branch_rest_create_time not in", values, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeBetween(Date value1, Date value2) {
            addCriterion("branch_rest_create_time between", value1, value2, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("branch_rest_create_time not between", value1, value2, "branchRestCreateTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeIsNull() {
            addCriterion("branch_rest_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeIsNotNull() {
            addCriterion("branch_rest_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeEqualTo(Date value) {
            addCriterion("branch_rest_edit_time =", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeNotEqualTo(Date value) {
            addCriterion("branch_rest_edit_time <>", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeGreaterThan(Date value) {
            addCriterion("branch_rest_edit_time >", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("branch_rest_edit_time >=", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeLessThan(Date value) {
            addCriterion("branch_rest_edit_time <", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("branch_rest_edit_time <=", value, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeIn(List<Date> values) {
            addCriterion("branch_rest_edit_time in", values, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeNotIn(List<Date> values) {
            addCriterion("branch_rest_edit_time not in", values, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeBetween(Date value1, Date value2) {
            addCriterion("branch_rest_edit_time between", value1, value2, "branchRestEditTime");
            return (Criteria) this;
        }

        public Criteria andBranchRestEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("branch_rest_edit_time not between", value1, value2, "branchRestEditTime");
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