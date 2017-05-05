package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationCooperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationCooperationExample() {
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

        public Criteria andOrgCooperationIdIsNull() {
            addCriterion("org_cooperation_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdIsNotNull() {
            addCriterion("org_cooperation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdEqualTo(Long value) {
            addCriterion("org_cooperation_id =", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdNotEqualTo(Long value) {
            addCriterion("org_cooperation_id <>", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdGreaterThan(Long value) {
            addCriterion("org_cooperation_id >", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_cooperation_id >=", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdLessThan(Long value) {
            addCriterion("org_cooperation_id <", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdLessThanOrEqualTo(Long value) {
            addCriterion("org_cooperation_id <=", value, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdIn(List<Long> values) {
            addCriterion("org_cooperation_id in", values, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdNotIn(List<Long> values) {
            addCriterion("org_cooperation_id not in", values, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdBetween(Long value1, Long value2) {
            addCriterion("org_cooperation_id between", value1, value2, "orgCooperationId");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationIdNotBetween(Long value1, Long value2) {
            addCriterion("org_cooperation_id not between", value1, value2, "orgCooperationId");
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

        public Criteria andOrgCooperationValIsNull() {
            addCriterion("org_cooperation_val is null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValIsNotNull() {
            addCriterion("org_cooperation_val is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValEqualTo(Integer value) {
            addCriterion("org_cooperation_val =", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValNotEqualTo(Integer value) {
            addCriterion("org_cooperation_val <>", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValGreaterThan(Integer value) {
            addCriterion("org_cooperation_val >", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_cooperation_val >=", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValLessThan(Integer value) {
            addCriterion("org_cooperation_val <", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValLessThanOrEqualTo(Integer value) {
            addCriterion("org_cooperation_val <=", value, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValIn(List<Integer> values) {
            addCriterion("org_cooperation_val in", values, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValNotIn(List<Integer> values) {
            addCriterion("org_cooperation_val not in", values, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValBetween(Integer value1, Integer value2) {
            addCriterion("org_cooperation_val between", value1, value2, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationValNotBetween(Integer value1, Integer value2) {
            addCriterion("org_cooperation_val not between", value1, value2, "orgCooperationVal");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionIsNull() {
            addCriterion("org_cooperation_opinion is null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionIsNotNull() {
            addCriterion("org_cooperation_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionEqualTo(String value) {
            addCriterion("org_cooperation_opinion =", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionNotEqualTo(String value) {
            addCriterion("org_cooperation_opinion <>", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionGreaterThan(String value) {
            addCriterion("org_cooperation_opinion >", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("org_cooperation_opinion >=", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionLessThan(String value) {
            addCriterion("org_cooperation_opinion <", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionLessThanOrEqualTo(String value) {
            addCriterion("org_cooperation_opinion <=", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionLike(String value) {
            addCriterion("org_cooperation_opinion like", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionNotLike(String value) {
            addCriterion("org_cooperation_opinion not like", value, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionIn(List<String> values) {
            addCriterion("org_cooperation_opinion in", values, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionNotIn(List<String> values) {
            addCriterion("org_cooperation_opinion not in", values, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionBetween(String value1, String value2) {
            addCriterion("org_cooperation_opinion between", value1, value2, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationOpinionNotBetween(String value1, String value2) {
            addCriterion("org_cooperation_opinion not between", value1, value2, "orgCooperationOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeIsNull() {
            addCriterion("org_cooperation_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeIsNotNull() {
            addCriterion("org_cooperation_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeEqualTo(Date value) {
            addCriterion("org_cooperation_create_time =", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeNotEqualTo(Date value) {
            addCriterion("org_cooperation_create_time <>", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeGreaterThan(Date value) {
            addCriterion("org_cooperation_create_time >", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_cooperation_create_time >=", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeLessThan(Date value) {
            addCriterion("org_cooperation_create_time <", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_cooperation_create_time <=", value, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeIn(List<Date> values) {
            addCriterion("org_cooperation_create_time in", values, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeNotIn(List<Date> values) {
            addCriterion("org_cooperation_create_time not in", values, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_cooperation_create_time between", value1, value2, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_cooperation_create_time not between", value1, value2, "orgCooperationCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeIsNull() {
            addCriterion("org_cooperation_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeIsNotNull() {
            addCriterion("org_cooperation_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeEqualTo(Date value) {
            addCriterion("org_cooperation_edit_time =", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeNotEqualTo(Date value) {
            addCriterion("org_cooperation_edit_time <>", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeGreaterThan(Date value) {
            addCriterion("org_cooperation_edit_time >", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_cooperation_edit_time >=", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeLessThan(Date value) {
            addCriterion("org_cooperation_edit_time <", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_cooperation_edit_time <=", value, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeIn(List<Date> values) {
            addCriterion("org_cooperation_edit_time in", values, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeNotIn(List<Date> values) {
            addCriterion("org_cooperation_edit_time not in", values, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_cooperation_edit_time between", value1, value2, "orgCooperationEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgCooperationEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_cooperation_edit_time not between", value1, value2, "orgCooperationEditTime");
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