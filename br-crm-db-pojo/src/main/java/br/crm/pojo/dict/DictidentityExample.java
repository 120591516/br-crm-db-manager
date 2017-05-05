package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictidentityExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictidentityExample() {
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

        public Criteria andIdIdentityIsNull() {
            addCriterion("ID_Identity is null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityIsNotNull() {
            addCriterion("ID_Identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityEqualTo(Integer value) {
            addCriterion("ID_Identity =", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityNotEqualTo(Integer value) {
            addCriterion("ID_Identity <>", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityGreaterThan(Integer value) {
            addCriterion("ID_Identity >", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Identity >=", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityLessThan(Integer value) {
            addCriterion("ID_Identity <", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Identity <=", value, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityIn(List<Integer> values) {
            addCriterion("ID_Identity in", values, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityNotIn(List<Integer> values) {
            addCriterion("ID_Identity not in", values, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityBetween(Integer value1, Integer value2) {
            addCriterion("ID_Identity between", value1, value2, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Identity not between", value1, value2, "idIdentity");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNull() {
            addCriterion("Identity_Name is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNotNull() {
            addCriterion("Identity_Name is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameEqualTo(String value) {
            addCriterion("Identity_Name =", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotEqualTo(String value) {
            addCriterion("Identity_Name <>", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThan(String value) {
            addCriterion("Identity_Name >", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThanOrEqualTo(String value) {
            addCriterion("Identity_Name >=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThan(String value) {
            addCriterion("Identity_Name <", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThanOrEqualTo(String value) {
            addCriterion("Identity_Name <=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLike(String value) {
            addCriterion("Identity_Name like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotLike(String value) {
            addCriterion("Identity_Name not like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIn(List<String> values) {
            addCriterion("Identity_Name in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotIn(List<String> values) {
            addCriterion("Identity_Name not in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameBetween(String value1, String value2) {
            addCriterion("Identity_Name between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotBetween(String value1, String value2) {
            addCriterion("Identity_Name not between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNull() {
            addCriterion("Identity_Code is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNotNull() {
            addCriterion("Identity_Code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeEqualTo(String value) {
            addCriterion("Identity_Code =", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotEqualTo(String value) {
            addCriterion("Identity_Code <>", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThan(String value) {
            addCriterion("Identity_Code >", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Identity_Code >=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThan(String value) {
            addCriterion("Identity_Code <", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("Identity_Code <=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLike(String value) {
            addCriterion("Identity_Code like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotLike(String value) {
            addCriterion("Identity_Code not like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIn(List<String> values) {
            addCriterion("Identity_Code in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotIn(List<String> values) {
            addCriterion("Identity_Code not in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeBetween(String value1, String value2) {
            addCriterion("Identity_Code between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("Identity_Code not between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNull() {
            addCriterion("Input_Code is null");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNotNull() {
            addCriterion("Input_Code is not null");
            return (Criteria) this;
        }

        public Criteria andInputCodeEqualTo(String value) {
            addCriterion("Input_Code =", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotEqualTo(String value) {
            addCriterion("Input_Code <>", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThan(String value) {
            addCriterion("Input_Code >", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Input_Code >=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThan(String value) {
            addCriterion("Input_Code <", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThanOrEqualTo(String value) {
            addCriterion("Input_Code <=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLike(String value) {
            addCriterion("Input_Code like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotLike(String value) {
            addCriterion("Input_Code not like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIn(List<String> values) {
            addCriterion("Input_Code in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotIn(List<String> values) {
            addCriterion("Input_Code not in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeBetween(String value1, String value2) {
            addCriterion("Input_Code between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotBetween(String value1, String value2) {
            addCriterion("Input_Code not between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorIsNull() {
            addCriterion("Priority_Indicator is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorIsNotNull() {
            addCriterion("Priority_Indicator is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorEqualTo(Boolean value) {
            addCriterion("Priority_Indicator =", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorNotEqualTo(Boolean value) {
            addCriterion("Priority_Indicator <>", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorGreaterThan(Boolean value) {
            addCriterion("Priority_Indicator >", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Priority_Indicator >=", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorLessThan(Boolean value) {
            addCriterion("Priority_Indicator <", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("Priority_Indicator <=", value, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorIn(List<Boolean> values) {
            addCriterion("Priority_Indicator in", values, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorNotIn(List<Boolean> values) {
            addCriterion("Priority_Indicator not in", values, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("Priority_Indicator between", value1, value2, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andPriorityIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Priority_Indicator not between", value1, value2, "priorityIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorIsNull() {
            addCriterion("Military_Indicator is null");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorIsNotNull() {
            addCriterion("Military_Indicator is not null");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorEqualTo(Boolean value) {
            addCriterion("Military_Indicator =", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorNotEqualTo(Boolean value) {
            addCriterion("Military_Indicator <>", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorGreaterThan(Boolean value) {
            addCriterion("Military_Indicator >", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Military_Indicator >=", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorLessThan(Boolean value) {
            addCriterion("Military_Indicator <", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("Military_Indicator <=", value, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorIn(List<Boolean> values) {
            addCriterion("Military_Indicator in", values, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorNotIn(List<Boolean> values) {
            addCriterion("Military_Indicator not in", values, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("Military_Indicator between", value1, value2, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andMilitaryIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Military_Indicator not between", value1, value2, "militaryIndicator");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexIsNull() {
            addCriterion("IdentityCodeX is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexIsNotNull() {
            addCriterion("IdentityCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexEqualTo(String value) {
            addCriterion("IdentityCodeX =", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexNotEqualTo(String value) {
            addCriterion("IdentityCodeX <>", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexGreaterThan(String value) {
            addCriterion("IdentityCodeX >", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityCodeX >=", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexLessThan(String value) {
            addCriterion("IdentityCodeX <", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexLessThanOrEqualTo(String value) {
            addCriterion("IdentityCodeX <=", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexLike(String value) {
            addCriterion("IdentityCodeX like", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexNotLike(String value) {
            addCriterion("IdentityCodeX not like", value, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexIn(List<String> values) {
            addCriterion("IdentityCodeX in", values, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexNotIn(List<String> values) {
            addCriterion("IdentityCodeX not in", values, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexBetween(String value1, String value2) {
            addCriterion("IdentityCodeX between", value1, value2, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdentitycodexNotBetween(String value1, String value2) {
            addCriterion("IdentityCodeX not between", value1, value2, "identitycodex");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeIsNull() {
            addCriterion("ID_Identity_createtime is null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeIsNotNull() {
            addCriterion("ID_Identity_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeEqualTo(Date value) {
            addCriterion("ID_Identity_createtime =", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeNotEqualTo(Date value) {
            addCriterion("ID_Identity_createtime <>", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeGreaterThan(Date value) {
            addCriterion("ID_Identity_createtime >", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ID_Identity_createtime >=", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeLessThan(Date value) {
            addCriterion("ID_Identity_createtime <", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ID_Identity_createtime <=", value, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeIn(List<Date> values) {
            addCriterion("ID_Identity_createtime in", values, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeNotIn(List<Date> values) {
            addCriterion("ID_Identity_createtime not in", values, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeBetween(Date value1, Date value2) {
            addCriterion("ID_Identity_createtime between", value1, value2, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ID_Identity_createtime not between", value1, value2, "idIdentityCreatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeIsNull() {
            addCriterion("ID_Identity_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeIsNotNull() {
            addCriterion("ID_Identity_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeEqualTo(Date value) {
            addCriterion("ID_Identity_updatetime =", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeNotEqualTo(Date value) {
            addCriterion("ID_Identity_updatetime <>", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeGreaterThan(Date value) {
            addCriterion("ID_Identity_updatetime >", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ID_Identity_updatetime >=", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeLessThan(Date value) {
            addCriterion("ID_Identity_updatetime <", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ID_Identity_updatetime <=", value, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeIn(List<Date> values) {
            addCriterion("ID_Identity_updatetime in", values, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeNotIn(List<Date> values) {
            addCriterion("ID_Identity_updatetime not in", values, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("ID_Identity_updatetime between", value1, value2, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ID_Identity_updatetime not between", value1, value2, "idIdentityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusIsNull() {
            addCriterion("ID_Identity_Status is null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusIsNotNull() {
            addCriterion("ID_Identity_Status is not null");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusEqualTo(Integer value) {
            addCriterion("ID_Identity_Status =", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusNotEqualTo(Integer value) {
            addCriterion("ID_Identity_Status <>", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusGreaterThan(Integer value) {
            addCriterion("ID_Identity_Status >", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Identity_Status >=", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusLessThan(Integer value) {
            addCriterion("ID_Identity_Status <", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Identity_Status <=", value, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusIn(List<Integer> values) {
            addCriterion("ID_Identity_Status in", values, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusNotIn(List<Integer> values) {
            addCriterion("ID_Identity_Status not in", values, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusBetween(Integer value1, Integer value2) {
            addCriterion("ID_Identity_Status between", value1, value2, "idIdentityStatus");
            return (Criteria) this;
        }

        public Criteria andIdIdentityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Identity_Status not between", value1, value2, "idIdentityStatus");
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