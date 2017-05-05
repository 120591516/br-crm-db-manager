package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.List;

public class OrganizationEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationEmailExample() {
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

        public Criteria andOrgEmailIdIsNull() {
            addCriterion("org_email_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdIsNotNull() {
            addCriterion("org_email_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdEqualTo(Long value) {
            addCriterion("org_email_id =", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdNotEqualTo(Long value) {
            addCriterion("org_email_id <>", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdGreaterThan(Long value) {
            addCriterion("org_email_id >", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_email_id >=", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdLessThan(Long value) {
            addCriterion("org_email_id <", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("org_email_id <=", value, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdIn(List<Long> values) {
            addCriterion("org_email_id in", values, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdNotIn(List<Long> values) {
            addCriterion("org_email_id not in", values, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdBetween(Long value1, Long value2) {
            addCriterion("org_email_id between", value1, value2, "orgEmailId");
            return (Criteria) this;
        }

        public Criteria andOrgEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("org_email_id not between", value1, value2, "orgEmailId");
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

        public Criteria andDictEmailIdIsNull() {
            addCriterion("dict_email_id is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdIsNotNull() {
            addCriterion("dict_email_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdEqualTo(Long value) {
            addCriterion("dict_email_id =", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotEqualTo(Long value) {
            addCriterion("dict_email_id <>", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdGreaterThan(Long value) {
            addCriterion("dict_email_id >", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_email_id >=", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdLessThan(Long value) {
            addCriterion("dict_email_id <", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_email_id <=", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdIn(List<Long> values) {
            addCriterion("dict_email_id in", values, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotIn(List<Long> values) {
            addCriterion("dict_email_id not in", values, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdBetween(Long value1, Long value2) {
            addCriterion("dict_email_id between", value1, value2, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_email_id not between", value1, value2, "dictEmailId");
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