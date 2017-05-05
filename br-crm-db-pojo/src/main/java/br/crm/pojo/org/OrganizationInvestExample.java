package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationInvestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationInvestExample() {
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

        public Criteria andOrgInvestIdIsNull() {
            addCriterion("org_invest_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdIsNotNull() {
            addCriterion("org_invest_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdEqualTo(Long value) {
            addCriterion("org_invest_id =", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdNotEqualTo(Long value) {
            addCriterion("org_invest_id <>", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdGreaterThan(Long value) {
            addCriterion("org_invest_id >", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_invest_id >=", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdLessThan(Long value) {
            addCriterion("org_invest_id <", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdLessThanOrEqualTo(Long value) {
            addCriterion("org_invest_id <=", value, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdIn(List<Long> values) {
            addCriterion("org_invest_id in", values, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdNotIn(List<Long> values) {
            addCriterion("org_invest_id not in", values, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdBetween(Long value1, Long value2) {
            addCriterion("org_invest_id between", value1, value2, "orgInvestId");
            return (Criteria) this;
        }

        public Criteria andOrgInvestIdNotBetween(Long value1, Long value2) {
            addCriterion("org_invest_id not between", value1, value2, "orgInvestId");
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

        public Criteria andOrgInvestInvestmentIsNull() {
            addCriterion("org_invest_investment is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentIsNotNull() {
            addCriterion("org_invest_investment is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentEqualTo(String value) {
            addCriterion("org_invest_investment =", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentNotEqualTo(String value) {
            addCriterion("org_invest_investment <>", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentGreaterThan(String value) {
            addCriterion("org_invest_investment >", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("org_invest_investment >=", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentLessThan(String value) {
            addCriterion("org_invest_investment <", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentLessThanOrEqualTo(String value) {
            addCriterion("org_invest_investment <=", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentLike(String value) {
            addCriterion("org_invest_investment like", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentNotLike(String value) {
            addCriterion("org_invest_investment not like", value, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentIn(List<String> values) {
            addCriterion("org_invest_investment in", values, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentNotIn(List<String> values) {
            addCriterion("org_invest_investment not in", values, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentBetween(String value1, String value2) {
            addCriterion("org_invest_investment between", value1, value2, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestInvestmentNotBetween(String value1, String value2) {
            addCriterion("org_invest_investment not between", value1, value2, "orgInvestInvestment");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeIsNull() {
            addCriterion("org_invest_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeIsNotNull() {
            addCriterion("org_invest_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeEqualTo(Date value) {
            addCriterion("org_invest_time =", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeNotEqualTo(Date value) {
            addCriterion("org_invest_time <>", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeGreaterThan(Date value) {
            addCriterion("org_invest_time >", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_invest_time >=", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeLessThan(Date value) {
            addCriterion("org_invest_time <", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_invest_time <=", value, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeIn(List<Date> values) {
            addCriterion("org_invest_time in", values, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeNotIn(List<Date> values) {
            addCriterion("org_invest_time not in", values, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeBetween(Date value1, Date value2) {
            addCriterion("org_invest_time between", value1, value2, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_invest_time not between", value1, value2, "orgInvestTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyIsNull() {
            addCriterion("org_invest_money is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyIsNotNull() {
            addCriterion("org_invest_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyEqualTo(Double value) {
            addCriterion("org_invest_money =", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyNotEqualTo(Double value) {
            addCriterion("org_invest_money <>", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyGreaterThan(Double value) {
            addCriterion("org_invest_money >", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("org_invest_money >=", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyLessThan(Double value) {
            addCriterion("org_invest_money <", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyLessThanOrEqualTo(Double value) {
            addCriterion("org_invest_money <=", value, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyIn(List<Double> values) {
            addCriterion("org_invest_money in", values, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyNotIn(List<Double> values) {
            addCriterion("org_invest_money not in", values, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyBetween(Double value1, Double value2) {
            addCriterion("org_invest_money between", value1, value2, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestMoneyNotBetween(Double value1, Double value2) {
            addCriterion("org_invest_money not between", value1, value2, "orgInvestMoney");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelIsNull() {
            addCriterion("org_invest_wheel is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelIsNotNull() {
            addCriterion("org_invest_wheel is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelEqualTo(String value) {
            addCriterion("org_invest_wheel =", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelNotEqualTo(String value) {
            addCriterion("org_invest_wheel <>", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelGreaterThan(String value) {
            addCriterion("org_invest_wheel >", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelGreaterThanOrEqualTo(String value) {
            addCriterion("org_invest_wheel >=", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelLessThan(String value) {
            addCriterion("org_invest_wheel <", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelLessThanOrEqualTo(String value) {
            addCriterion("org_invest_wheel <=", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelLike(String value) {
            addCriterion("org_invest_wheel like", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelNotLike(String value) {
            addCriterion("org_invest_wheel not like", value, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelIn(List<String> values) {
            addCriterion("org_invest_wheel in", values, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelNotIn(List<String> values) {
            addCriterion("org_invest_wheel not in", values, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelBetween(String value1, String value2) {
            addCriterion("org_invest_wheel between", value1, value2, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestWheelNotBetween(String value1, String value2) {
            addCriterion("org_invest_wheel not between", value1, value2, "orgInvestWheel");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeIsNull() {
            addCriterion("org_invest_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeIsNotNull() {
            addCriterion("org_invest_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeEqualTo(Date value) {
            addCriterion("org_invest_create_time =", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeNotEqualTo(Date value) {
            addCriterion("org_invest_create_time <>", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeGreaterThan(Date value) {
            addCriterion("org_invest_create_time >", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_invest_create_time >=", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeLessThan(Date value) {
            addCriterion("org_invest_create_time <", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_invest_create_time <=", value, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeIn(List<Date> values) {
            addCriterion("org_invest_create_time in", values, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeNotIn(List<Date> values) {
            addCriterion("org_invest_create_time not in", values, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_invest_create_time between", value1, value2, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_invest_create_time not between", value1, value2, "orgInvestCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeIsNull() {
            addCriterion("org_invest_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeIsNotNull() {
            addCriterion("org_invest_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeEqualTo(Date value) {
            addCriterion("org_invest_edit_time =", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeNotEqualTo(Date value) {
            addCriterion("org_invest_edit_time <>", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeGreaterThan(Date value) {
            addCriterion("org_invest_edit_time >", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_invest_edit_time >=", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeLessThan(Date value) {
            addCriterion("org_invest_edit_time <", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_invest_edit_time <=", value, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeIn(List<Date> values) {
            addCriterion("org_invest_edit_time in", values, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeNotIn(List<Date> values) {
            addCriterion("org_invest_edit_time not in", values, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_invest_edit_time between", value1, value2, "orgInvestEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgInvestEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_invest_edit_time not between", value1, value2, "orgInvestEditTime");
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