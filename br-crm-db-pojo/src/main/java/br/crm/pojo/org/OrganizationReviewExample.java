package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationReviewExample() {
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

        public Criteria andOrgReviewIdIsNull() {
            addCriterion("org_review_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdIsNotNull() {
            addCriterion("org_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdEqualTo(Long value) {
            addCriterion("org_review_id =", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdNotEqualTo(Long value) {
            addCriterion("org_review_id <>", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdGreaterThan(Long value) {
            addCriterion("org_review_id >", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_review_id >=", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdLessThan(Long value) {
            addCriterion("org_review_id <", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdLessThanOrEqualTo(Long value) {
            addCriterion("org_review_id <=", value, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdIn(List<Long> values) {
            addCriterion("org_review_id in", values, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdNotIn(List<Long> values) {
            addCriterion("org_review_id not in", values, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdBetween(Long value1, Long value2) {
            addCriterion("org_review_id between", value1, value2, "orgReviewId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewIdNotBetween(Long value1, Long value2) {
            addCriterion("org_review_id not between", value1, value2, "orgReviewId");
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

        public Criteria andOrgReviewResultIsNull() {
            addCriterion("org_review_result is null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultIsNotNull() {
            addCriterion("org_review_result is not null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultEqualTo(Integer value) {
            addCriterion("org_review_result =", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultNotEqualTo(Integer value) {
            addCriterion("org_review_result <>", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultGreaterThan(Integer value) {
            addCriterion("org_review_result >", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_review_result >=", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultLessThan(Integer value) {
            addCriterion("org_review_result <", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultLessThanOrEqualTo(Integer value) {
            addCriterion("org_review_result <=", value, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultIn(List<Integer> values) {
            addCriterion("org_review_result in", values, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultNotIn(List<Integer> values) {
            addCriterion("org_review_result not in", values, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultBetween(Integer value1, Integer value2) {
            addCriterion("org_review_result between", value1, value2, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewResultNotBetween(Integer value1, Integer value2) {
            addCriterion("org_review_result not between", value1, value2, "orgReviewResult");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageIsNull() {
            addCriterion("org_review_message is null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageIsNotNull() {
            addCriterion("org_review_message is not null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageEqualTo(String value) {
            addCriterion("org_review_message =", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageNotEqualTo(String value) {
            addCriterion("org_review_message <>", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageGreaterThan(String value) {
            addCriterion("org_review_message >", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageGreaterThanOrEqualTo(String value) {
            addCriterion("org_review_message >=", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageLessThan(String value) {
            addCriterion("org_review_message <", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageLessThanOrEqualTo(String value) {
            addCriterion("org_review_message <=", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageLike(String value) {
            addCriterion("org_review_message like", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageNotLike(String value) {
            addCriterion("org_review_message not like", value, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageIn(List<String> values) {
            addCriterion("org_review_message in", values, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageNotIn(List<String> values) {
            addCriterion("org_review_message not in", values, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageBetween(String value1, String value2) {
            addCriterion("org_review_message between", value1, value2, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewMessageNotBetween(String value1, String value2) {
            addCriterion("org_review_message not between", value1, value2, "orgReviewMessage");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdIsNull() {
            addCriterion("org_review_person_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdIsNotNull() {
            addCriterion("org_review_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdEqualTo(Long value) {
            addCriterion("org_review_person_id =", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdNotEqualTo(Long value) {
            addCriterion("org_review_person_id <>", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdGreaterThan(Long value) {
            addCriterion("org_review_person_id >", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_review_person_id >=", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdLessThan(Long value) {
            addCriterion("org_review_person_id <", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdLessThanOrEqualTo(Long value) {
            addCriterion("org_review_person_id <=", value, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdIn(List<Long> values) {
            addCriterion("org_review_person_id in", values, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdNotIn(List<Long> values) {
            addCriterion("org_review_person_id not in", values, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdBetween(Long value1, Long value2) {
            addCriterion("org_review_person_id between", value1, value2, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewPersonIdNotBetween(Long value1, Long value2) {
            addCriterion("org_review_person_id not between", value1, value2, "orgReviewPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeIsNull() {
            addCriterion("org_review_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeIsNotNull() {
            addCriterion("org_review_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeEqualTo(Date value) {
            addCriterion("org_review_create_time =", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeNotEqualTo(Date value) {
            addCriterion("org_review_create_time <>", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeGreaterThan(Date value) {
            addCriterion("org_review_create_time >", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_review_create_time >=", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeLessThan(Date value) {
            addCriterion("org_review_create_time <", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_review_create_time <=", value, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeIn(List<Date> values) {
            addCriterion("org_review_create_time in", values, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeNotIn(List<Date> values) {
            addCriterion("org_review_create_time not in", values, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_review_create_time between", value1, value2, "orgReviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgReviewCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_review_create_time not between", value1, value2, "orgReviewCreateTime");
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