package br.crm.pojo.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationLevelExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationLevelExample() {
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

        public Criteria andOrgLevelIdIsNull() {
            addCriterion("org_level_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdIsNotNull() {
            addCriterion("org_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdEqualTo(Integer value) {
            addCriterion("org_level_id =", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotEqualTo(Integer value) {
            addCriterion("org_level_id <>", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdGreaterThan(Integer value) {
            addCriterion("org_level_id >", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_level_id >=", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdLessThan(Integer value) {
            addCriterion("org_level_id <", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_level_id <=", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdIn(List<Integer> values) {
            addCriterion("org_level_id in", values, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotIn(List<Integer> values) {
            addCriterion("org_level_id not in", values, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("org_level_id between", value1, value2, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_level_id not between", value1, value2, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameIsNull() {
            addCriterion("org_level_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameIsNotNull() {
            addCriterion("org_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameEqualTo(String value) {
            addCriterion("org_level_name =", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameNotEqualTo(String value) {
            addCriterion("org_level_name <>", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameGreaterThan(String value) {
            addCriterion("org_level_name >", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_level_name >=", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameLessThan(String value) {
            addCriterion("org_level_name <", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameLessThanOrEqualTo(String value) {
            addCriterion("org_level_name <=", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameLike(String value) {
            addCriterion("org_level_name like", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameNotLike(String value) {
            addCriterion("org_level_name not like", value, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameIn(List<String> values) {
            addCriterion("org_level_name in", values, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameNotIn(List<String> values) {
            addCriterion("org_level_name not in", values, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameBetween(String value1, String value2) {
            addCriterion("org_level_name between", value1, value2, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNameNotBetween(String value1, String value2) {
            addCriterion("org_level_name not between", value1, value2, "orgLevelName");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusIsNull() {
            addCriterion("org_level_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusIsNotNull() {
            addCriterion("org_level_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusEqualTo(Integer value) {
            addCriterion("org_level_status =", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusNotEqualTo(Integer value) {
            addCriterion("org_level_status <>", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusGreaterThan(Integer value) {
            addCriterion("org_level_status >", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_level_status >=", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusLessThan(Integer value) {
            addCriterion("org_level_status <", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_level_status <=", value, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusIn(List<Integer> values) {
            addCriterion("org_level_status in", values, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusNotIn(List<Integer> values) {
            addCriterion("org_level_status not in", values, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_level_status between", value1, value2, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_level_status not between", value1, value2, "orgLevelStatus");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeIsNull() {
            addCriterion("org_level_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeIsNotNull() {
            addCriterion("org_level_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeEqualTo(Date value) {
            addCriterion("org_level_createtime =", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeNotEqualTo(Date value) {
            addCriterion("org_level_createtime <>", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeGreaterThan(Date value) {
            addCriterion("org_level_createtime >", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_level_createtime >=", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeLessThan(Date value) {
            addCriterion("org_level_createtime <", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("org_level_createtime <=", value, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeIn(List<Date> values) {
            addCriterion("org_level_createtime in", values, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeNotIn(List<Date> values) {
            addCriterion("org_level_createtime not in", values, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeBetween(Date value1, Date value2) {
            addCriterion("org_level_createtime between", value1, value2, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("org_level_createtime not between", value1, value2, "orgLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeIsNull() {
            addCriterion("org_level_edittime is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeIsNotNull() {
            addCriterion("org_level_edittime is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeEqualTo(Date value) {
            addCriterion("org_level_edittime =", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeNotEqualTo(Date value) {
            addCriterion("org_level_edittime <>", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeGreaterThan(Date value) {
            addCriterion("org_level_edittime >", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_level_edittime >=", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeLessThan(Date value) {
            addCriterion("org_level_edittime <", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("org_level_edittime <=", value, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeIn(List<Date> values) {
            addCriterion("org_level_edittime in", values, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeNotIn(List<Date> values) {
            addCriterion("org_level_edittime not in", values, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeBetween(Date value1, Date value2) {
            addCriterion("org_level_edittime between", value1, value2, "orgLevelEdittime");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("org_level_edittime not between", value1, value2, "orgLevelEdittime");
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