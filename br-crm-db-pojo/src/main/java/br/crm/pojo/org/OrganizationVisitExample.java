package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationVisitExample() {
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

        public Criteria andOrgVisitIdIsNull() {
            addCriterion("org_visit_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdIsNotNull() {
            addCriterion("org_visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdEqualTo(Long value) {
            addCriterion("org_visit_id =", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdNotEqualTo(Long value) {
            addCriterion("org_visit_id <>", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdGreaterThan(Long value) {
            addCriterion("org_visit_id >", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_visit_id >=", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdLessThan(Long value) {
            addCriterion("org_visit_id <", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdLessThanOrEqualTo(Long value) {
            addCriterion("org_visit_id <=", value, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdIn(List<Long> values) {
            addCriterion("org_visit_id in", values, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdNotIn(List<Long> values) {
            addCriterion("org_visit_id not in", values, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdBetween(Long value1, Long value2) {
            addCriterion("org_visit_id between", value1, value2, "orgVisitId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitIdNotBetween(Long value1, Long value2) {
            addCriterion("org_visit_id not between", value1, value2, "orgVisitId");
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

        public Criteria andOrgVisitTimeIsNull() {
            addCriterion("org_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeIsNotNull() {
            addCriterion("org_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeEqualTo(Date value) {
            addCriterion("org_visit_time =", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeNotEqualTo(Date value) {
            addCriterion("org_visit_time <>", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeGreaterThan(Date value) {
            addCriterion("org_visit_time >", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_visit_time >=", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeLessThan(Date value) {
            addCriterion("org_visit_time <", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_visit_time <=", value, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeIn(List<Date> values) {
            addCriterion("org_visit_time in", values, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeNotIn(List<Date> values) {
            addCriterion("org_visit_time not in", values, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeBetween(Date value1, Date value2) {
            addCriterion("org_visit_time between", value1, value2, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_visit_time not between", value1, value2, "orgVisitTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionIsNull() {
            addCriterion("org_visit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionIsNotNull() {
            addCriterion("org_visit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionEqualTo(String value) {
            addCriterion("org_visit_opinion =", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionNotEqualTo(String value) {
            addCriterion("org_visit_opinion <>", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionGreaterThan(String value) {
            addCriterion("org_visit_opinion >", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("org_visit_opinion >=", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionLessThan(String value) {
            addCriterion("org_visit_opinion <", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionLessThanOrEqualTo(String value) {
            addCriterion("org_visit_opinion <=", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionLike(String value) {
            addCriterion("org_visit_opinion like", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionNotLike(String value) {
            addCriterion("org_visit_opinion not like", value, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionIn(List<String> values) {
            addCriterion("org_visit_opinion in", values, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionNotIn(List<String> values) {
            addCriterion("org_visit_opinion not in", values, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionBetween(String value1, String value2) {
            addCriterion("org_visit_opinion between", value1, value2, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitOpinionNotBetween(String value1, String value2) {
            addCriterion("org_visit_opinion not between", value1, value2, "orgVisitOpinion");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdIsNull() {
            addCriterion("org_visit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdIsNotNull() {
            addCriterion("org_visit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdEqualTo(Long value) {
            addCriterion("org_visit_person_id =", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdNotEqualTo(Long value) {
            addCriterion("org_visit_person_id <>", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdGreaterThan(Long value) {
            addCriterion("org_visit_person_id >", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_visit_person_id >=", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdLessThan(Long value) {
            addCriterion("org_visit_person_id <", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdLessThanOrEqualTo(Long value) {
            addCriterion("org_visit_person_id <=", value, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdIn(List<Long> values) {
            addCriterion("org_visit_person_id in", values, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdNotIn(List<Long> values) {
            addCriterion("org_visit_person_id not in", values, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdBetween(Long value1, Long value2) {
            addCriterion("org_visit_person_id between", value1, value2, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonIdNotBetween(Long value1, Long value2) {
            addCriterion("org_visit_person_id not between", value1, value2, "orgVisitPersonId");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameIsNull() {
            addCriterion("org_visit_person_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameIsNotNull() {
            addCriterion("org_visit_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameEqualTo(String value) {
            addCriterion("org_visit_person_name =", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameNotEqualTo(String value) {
            addCriterion("org_visit_person_name <>", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameGreaterThan(String value) {
            addCriterion("org_visit_person_name >", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_visit_person_name >=", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameLessThan(String value) {
            addCriterion("org_visit_person_name <", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameLessThanOrEqualTo(String value) {
            addCriterion("org_visit_person_name <=", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameLike(String value) {
            addCriterion("org_visit_person_name like", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameNotLike(String value) {
            addCriterion("org_visit_person_name not like", value, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameIn(List<String> values) {
            addCriterion("org_visit_person_name in", values, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameNotIn(List<String> values) {
            addCriterion("org_visit_person_name not in", values, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameBetween(String value1, String value2) {
            addCriterion("org_visit_person_name between", value1, value2, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitPersonNameNotBetween(String value1, String value2) {
            addCriterion("org_visit_person_name not between", value1, value2, "orgVisitPersonName");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeIsNull() {
            addCriterion("org_visit_next_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeIsNotNull() {
            addCriterion("org_visit_next_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeEqualTo(Date value) {
            addCriterion("org_visit_next_time =", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeNotEqualTo(Date value) {
            addCriterion("org_visit_next_time <>", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeGreaterThan(Date value) {
            addCriterion("org_visit_next_time >", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_visit_next_time >=", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeLessThan(Date value) {
            addCriterion("org_visit_next_time <", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_visit_next_time <=", value, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeIn(List<Date> values) {
            addCriterion("org_visit_next_time in", values, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeNotIn(List<Date> values) {
            addCriterion("org_visit_next_time not in", values, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeBetween(Date value1, Date value2) {
            addCriterion("org_visit_next_time between", value1, value2, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitNextTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_visit_next_time not between", value1, value2, "orgVisitNextTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeIsNull() {
            addCriterion("org_visit_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeIsNotNull() {
            addCriterion("org_visit_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeEqualTo(Date value) {
            addCriterion("org_visit_create_time =", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeNotEqualTo(Date value) {
            addCriterion("org_visit_create_time <>", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeGreaterThan(Date value) {
            addCriterion("org_visit_create_time >", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_visit_create_time >=", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeLessThan(Date value) {
            addCriterion("org_visit_create_time <", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_visit_create_time <=", value, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeIn(List<Date> values) {
            addCriterion("org_visit_create_time in", values, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeNotIn(List<Date> values) {
            addCriterion("org_visit_create_time not in", values, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_visit_create_time between", value1, value2, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_visit_create_time not between", value1, value2, "orgVisitCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeIsNull() {
            addCriterion("org_visit_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeIsNotNull() {
            addCriterion("org_visit_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeEqualTo(Date value) {
            addCriterion("org_visit_edit_time =", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeNotEqualTo(Date value) {
            addCriterion("org_visit_edit_time <>", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeGreaterThan(Date value) {
            addCriterion("org_visit_edit_time >", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_visit_edit_time >=", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeLessThan(Date value) {
            addCriterion("org_visit_edit_time <", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_visit_edit_time <=", value, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeIn(List<Date> values) {
            addCriterion("org_visit_edit_time in", values, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeNotIn(List<Date> values) {
            addCriterion("org_visit_edit_time not in", values, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_visit_edit_time between", value1, value2, "orgVisitEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgVisitEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_visit_edit_time not between", value1, value2, "orgVisitEditTime");
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