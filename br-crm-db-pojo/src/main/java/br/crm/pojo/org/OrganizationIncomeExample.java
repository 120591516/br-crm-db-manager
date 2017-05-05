package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationIncomeExample() {
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

        public Criteria andOrgIncomeIdIsNull() {
            addCriterion("org_income_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdIsNotNull() {
            addCriterion("org_income_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdEqualTo(Long value) {
            addCriterion("org_income_id =", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdNotEqualTo(Long value) {
            addCriterion("org_income_id <>", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdGreaterThan(Long value) {
            addCriterion("org_income_id >", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_income_id >=", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdLessThan(Long value) {
            addCriterion("org_income_id <", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdLessThanOrEqualTo(Long value) {
            addCriterion("org_income_id <=", value, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdIn(List<Long> values) {
            addCriterion("org_income_id in", values, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdNotIn(List<Long> values) {
            addCriterion("org_income_id not in", values, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdBetween(Long value1, Long value2) {
            addCriterion("org_income_id between", value1, value2, "orgIncomeId");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeIdNotBetween(Long value1, Long value2) {
            addCriterion("org_income_id not between", value1, value2, "orgIncomeId");
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

        public Criteria andOrgIncomeYearIsNull() {
            addCriterion("org_income_year is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearIsNotNull() {
            addCriterion("org_income_year is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearEqualTo(String value) {
            addCriterion("org_income_year =", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearNotEqualTo(String value) {
            addCriterion("org_income_year <>", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearGreaterThan(String value) {
            addCriterion("org_income_year >", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearGreaterThanOrEqualTo(String value) {
            addCriterion("org_income_year >=", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearLessThan(String value) {
            addCriterion("org_income_year <", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearLessThanOrEqualTo(String value) {
            addCriterion("org_income_year <=", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearLike(String value) {
            addCriterion("org_income_year like", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearNotLike(String value) {
            addCriterion("org_income_year not like", value, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearIn(List<String> values) {
            addCriterion("org_income_year in", values, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearNotIn(List<String> values) {
            addCriterion("org_income_year not in", values, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearBetween(String value1, String value2) {
            addCriterion("org_income_year between", value1, value2, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeYearNotBetween(String value1, String value2) {
            addCriterion("org_income_year not between", value1, value2, "orgIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountIsNull() {
            addCriterion("org_income_count is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountIsNotNull() {
            addCriterion("org_income_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountEqualTo(Integer value) {
            addCriterion("org_income_count =", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountNotEqualTo(Integer value) {
            addCriterion("org_income_count <>", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountGreaterThan(Integer value) {
            addCriterion("org_income_count >", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_income_count >=", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountLessThan(Integer value) {
            addCriterion("org_income_count <", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountLessThanOrEqualTo(Integer value) {
            addCriterion("org_income_count <=", value, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountIn(List<Integer> values) {
            addCriterion("org_income_count in", values, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountNotIn(List<Integer> values) {
            addCriterion("org_income_count not in", values, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountBetween(Integer value1, Integer value2) {
            addCriterion("org_income_count between", value1, value2, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("org_income_count not between", value1, value2, "orgIncomeCount");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverIsNull() {
            addCriterion("org_income_turnover is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverIsNotNull() {
            addCriterion("org_income_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverEqualTo(Double value) {
            addCriterion("org_income_turnover =", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverNotEqualTo(Double value) {
            addCriterion("org_income_turnover <>", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverGreaterThan(Double value) {
            addCriterion("org_income_turnover >", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverGreaterThanOrEqualTo(Double value) {
            addCriterion("org_income_turnover >=", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverLessThan(Double value) {
            addCriterion("org_income_turnover <", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverLessThanOrEqualTo(Double value) {
            addCriterion("org_income_turnover <=", value, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverIn(List<Double> values) {
            addCriterion("org_income_turnover in", values, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverNotIn(List<Double> values) {
            addCriterion("org_income_turnover not in", values, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverBetween(Double value1, Double value2) {
            addCriterion("org_income_turnover between", value1, value2, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeTurnoverNotBetween(Double value1, Double value2) {
            addCriterion("org_income_turnover not between", value1, value2, "orgIncomeTurnover");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitIsNull() {
            addCriterion("org_income_profit is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitIsNotNull() {
            addCriterion("org_income_profit is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitEqualTo(Double value) {
            addCriterion("org_income_profit =", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitNotEqualTo(Double value) {
            addCriterion("org_income_profit <>", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitGreaterThan(Double value) {
            addCriterion("org_income_profit >", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("org_income_profit >=", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitLessThan(Double value) {
            addCriterion("org_income_profit <", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitLessThanOrEqualTo(Double value) {
            addCriterion("org_income_profit <=", value, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitIn(List<Double> values) {
            addCriterion("org_income_profit in", values, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitNotIn(List<Double> values) {
            addCriterion("org_income_profit not in", values, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitBetween(Double value1, Double value2) {
            addCriterion("org_income_profit between", value1, value2, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeProfitNotBetween(Double value1, Double value2) {
            addCriterion("org_income_profit not between", value1, value2, "orgIncomeProfit");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeIsNull() {
            addCriterion("org_income_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeIsNotNull() {
            addCriterion("org_income_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeEqualTo(Date value) {
            addCriterion("org_income_create_time =", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeNotEqualTo(Date value) {
            addCriterion("org_income_create_time <>", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeGreaterThan(Date value) {
            addCriterion("org_income_create_time >", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_income_create_time >=", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeLessThan(Date value) {
            addCriterion("org_income_create_time <", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_income_create_time <=", value, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeIn(List<Date> values) {
            addCriterion("org_income_create_time in", values, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeNotIn(List<Date> values) {
            addCriterion("org_income_create_time not in", values, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_income_create_time between", value1, value2, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_income_create_time not between", value1, value2, "orgIncomeCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeIsNull() {
            addCriterion("org_income_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeIsNotNull() {
            addCriterion("org_income_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeEqualTo(Date value) {
            addCriterion("org_income_edit_time =", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeNotEqualTo(Date value) {
            addCriterion("org_income_edit_time <>", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeGreaterThan(Date value) {
            addCriterion("org_income_edit_time >", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_income_edit_time >=", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeLessThan(Date value) {
            addCriterion("org_income_edit_time <", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_income_edit_time <=", value, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeIn(List<Date> values) {
            addCriterion("org_income_edit_time in", values, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeNotIn(List<Date> values) {
            addCriterion("org_income_edit_time not in", values, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_income_edit_time between", value1, value2, "orgIncomeEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgIncomeEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_income_edit_time not between", value1, value2, "orgIncomeEditTime");
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