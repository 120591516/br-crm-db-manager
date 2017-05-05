package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictagegroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictagegroupExample() {
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

        public Criteria andAgegroupIdIsNull() {
            addCriterion("AgeGroup_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdIsNotNull() {
            addCriterion("AgeGroup_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdEqualTo(Integer value) {
            addCriterion("AgeGroup_ID =", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdNotEqualTo(Integer value) {
            addCriterion("AgeGroup_ID <>", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdGreaterThan(Integer value) {
            addCriterion("AgeGroup_ID >", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_ID >=", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdLessThan(Integer value) {
            addCriterion("AgeGroup_ID <", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_ID <=", value, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdIn(List<Integer> values) {
            addCriterion("AgeGroup_ID in", values, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdNotIn(List<Integer> values) {
            addCriterion("AgeGroup_ID not in", values, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_ID between", value1, value2, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_ID not between", value1, value2, "agegroupId");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameIsNull() {
            addCriterion("AgeGroup_Name is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameIsNotNull() {
            addCriterion("AgeGroup_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameEqualTo(String value) {
            addCriterion("AgeGroup_Name =", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameNotEqualTo(String value) {
            addCriterion("AgeGroup_Name <>", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameGreaterThan(String value) {
            addCriterion("AgeGroup_Name >", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Name >=", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameLessThan(String value) {
            addCriterion("AgeGroup_Name <", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameLessThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Name <=", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameLike(String value) {
            addCriterion("AgeGroup_Name like", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameNotLike(String value) {
            addCriterion("AgeGroup_Name not like", value, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameIn(List<String> values) {
            addCriterion("AgeGroup_Name in", values, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameNotIn(List<String> values) {
            addCriterion("AgeGroup_Name not in", values, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameBetween(String value1, String value2) {
            addCriterion("AgeGroup_Name between", value1, value2, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupNameNotBetween(String value1, String value2) {
            addCriterion("AgeGroup_Name not between", value1, value2, "agegroupName");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpIsNull() {
            addCriterion("AgeGroup_Up is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpIsNotNull() {
            addCriterion("AgeGroup_Up is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpEqualTo(Integer value) {
            addCriterion("AgeGroup_Up =", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpNotEqualTo(Integer value) {
            addCriterion("AgeGroup_Up <>", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpGreaterThan(Integer value) {
            addCriterion("AgeGroup_Up >", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_Up >=", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpLessThan(Integer value) {
            addCriterion("AgeGroup_Up <", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpLessThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_Up <=", value, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpIn(List<Integer> values) {
            addCriterion("AgeGroup_Up in", values, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpNotIn(List<Integer> values) {
            addCriterion("AgeGroup_Up not in", values, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_Up between", value1, value2, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_Up not between", value1, value2, "agegroupUp");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownIsNull() {
            addCriterion("AgeGroup_down is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownIsNotNull() {
            addCriterion("AgeGroup_down is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownEqualTo(Integer value) {
            addCriterion("AgeGroup_down =", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownNotEqualTo(Integer value) {
            addCriterion("AgeGroup_down <>", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownGreaterThan(Integer value) {
            addCriterion("AgeGroup_down >", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_down >=", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownLessThan(Integer value) {
            addCriterion("AgeGroup_down <", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownLessThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_down <=", value, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownIn(List<Integer> values) {
            addCriterion("AgeGroup_down in", values, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownNotIn(List<Integer> values) {
            addCriterion("AgeGroup_down not in", values, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_down between", value1, value2, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupDownNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_down not between", value1, value2, "agegroupDown");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextIsNull() {
            addCriterion("AgeGroup_Text is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextIsNotNull() {
            addCriterion("AgeGroup_Text is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextEqualTo(String value) {
            addCriterion("AgeGroup_Text =", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextNotEqualTo(String value) {
            addCriterion("AgeGroup_Text <>", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextGreaterThan(String value) {
            addCriterion("AgeGroup_Text >", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextGreaterThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Text >=", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextLessThan(String value) {
            addCriterion("AgeGroup_Text <", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextLessThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Text <=", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextLike(String value) {
            addCriterion("AgeGroup_Text like", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextNotLike(String value) {
            addCriterion("AgeGroup_Text not like", value, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextIn(List<String> values) {
            addCriterion("AgeGroup_Text in", values, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextNotIn(List<String> values) {
            addCriterion("AgeGroup_Text not in", values, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextBetween(String value1, String value2) {
            addCriterion("AgeGroup_Text between", value1, value2, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupTextNotBetween(String value1, String value2) {
            addCriterion("AgeGroup_Text not between", value1, value2, "agegroupText");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderIsNull() {
            addCriterion("AgeGroup_Order is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderIsNotNull() {
            addCriterion("AgeGroup_Order is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderEqualTo(String value) {
            addCriterion("AgeGroup_Order =", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderNotEqualTo(String value) {
            addCriterion("AgeGroup_Order <>", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderGreaterThan(String value) {
            addCriterion("AgeGroup_Order >", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderGreaterThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Order >=", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderLessThan(String value) {
            addCriterion("AgeGroup_Order <", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderLessThanOrEqualTo(String value) {
            addCriterion("AgeGroup_Order <=", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderLike(String value) {
            addCriterion("AgeGroup_Order like", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderNotLike(String value) {
            addCriterion("AgeGroup_Order not like", value, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderIn(List<String> values) {
            addCriterion("AgeGroup_Order in", values, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderNotIn(List<String> values) {
            addCriterion("AgeGroup_Order not in", values, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderBetween(String value1, String value2) {
            addCriterion("AgeGroup_Order between", value1, value2, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupOrderNotBetween(String value1, String value2) {
            addCriterion("AgeGroup_Order not between", value1, value2, "agegroupOrder");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeIsNull() {
            addCriterion("AgeGroup_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeIsNotNull() {
            addCriterion("AgeGroup_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeEqualTo(Date value) {
            addCriterion("AgeGroup_CreateTime =", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeNotEqualTo(Date value) {
            addCriterion("AgeGroup_CreateTime <>", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeGreaterThan(Date value) {
            addCriterion("AgeGroup_CreateTime >", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AgeGroup_CreateTime >=", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeLessThan(Date value) {
            addCriterion("AgeGroup_CreateTime <", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("AgeGroup_CreateTime <=", value, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeIn(List<Date> values) {
            addCriterion("AgeGroup_CreateTime in", values, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeNotIn(List<Date> values) {
            addCriterion("AgeGroup_CreateTime not in", values, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeBetween(Date value1, Date value2) {
            addCriterion("AgeGroup_CreateTime between", value1, value2, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("AgeGroup_CreateTime not between", value1, value2, "agegroupCreatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeIsNull() {
            addCriterion("AgeGroup_UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeIsNotNull() {
            addCriterion("AgeGroup_UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeEqualTo(Date value) {
            addCriterion("AgeGroup_UpdateTime =", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeNotEqualTo(Date value) {
            addCriterion("AgeGroup_UpdateTime <>", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeGreaterThan(Date value) {
            addCriterion("AgeGroup_UpdateTime >", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AgeGroup_UpdateTime >=", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeLessThan(Date value) {
            addCriterion("AgeGroup_UpdateTime <", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("AgeGroup_UpdateTime <=", value, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeIn(List<Date> values) {
            addCriterion("AgeGroup_UpdateTime in", values, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeNotIn(List<Date> values) {
            addCriterion("AgeGroup_UpdateTime not in", values, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("AgeGroup_UpdateTime between", value1, value2, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("AgeGroup_UpdateTime not between", value1, value2, "agegroupUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusIsNull() {
            addCriterion("AgeGroup_Status is null");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusIsNotNull() {
            addCriterion("AgeGroup_Status is not null");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusEqualTo(Integer value) {
            addCriterion("AgeGroup_Status =", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusNotEqualTo(Integer value) {
            addCriterion("AgeGroup_Status <>", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusGreaterThan(Integer value) {
            addCriterion("AgeGroup_Status >", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_Status >=", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusLessThan(Integer value) {
            addCriterion("AgeGroup_Status <", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AgeGroup_Status <=", value, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusIn(List<Integer> values) {
            addCriterion("AgeGroup_Status in", values, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusNotIn(List<Integer> values) {
            addCriterion("AgeGroup_Status not in", values, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_Status between", value1, value2, "agegroupStatus");
            return (Criteria) this;
        }

        public Criteria andAgegroupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeGroup_Status not between", value1, value2, "agegroupStatus");
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