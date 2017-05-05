package br.crm.pojo.suite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamSuiteHidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamSuiteHidExample() {
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

        public Criteria andOesHidIdIsNull() {
            addCriterion("oes_hid_id is null");
            return (Criteria) this;
        }

        public Criteria andOesHidIdIsNotNull() {
            addCriterion("oes_hid_id is not null");
            return (Criteria) this;
        }

        public Criteria andOesHidIdEqualTo(String value) {
            addCriterion("oes_hid_id =", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdNotEqualTo(String value) {
            addCriterion("oes_hid_id <>", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdGreaterThan(String value) {
            addCriterion("oes_hid_id >", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdGreaterThanOrEqualTo(String value) {
            addCriterion("oes_hid_id >=", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdLessThan(String value) {
            addCriterion("oes_hid_id <", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdLessThanOrEqualTo(String value) {
            addCriterion("oes_hid_id <=", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdLike(String value) {
            addCriterion("oes_hid_id like", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdNotLike(String value) {
            addCriterion("oes_hid_id not like", value, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdIn(List<String> values) {
            addCriterion("oes_hid_id in", values, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdNotIn(List<String> values) {
            addCriterion("oes_hid_id not in", values, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdBetween(String value1, String value2) {
            addCriterion("oes_hid_id between", value1, value2, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andOesHidIdNotBetween(String value1, String value2) {
            addCriterion("oes_hid_id not between", value1, value2, "oesHidId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNull() {
            addCriterion("exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNotNull() {
            addCriterion("exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdEqualTo(String value) {
            addCriterion("exam_suite_id =", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotEqualTo(String value) {
            addCriterion("exam_suite_id <>", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThan(String value) {
            addCriterion("exam_suite_id >", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_id >=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThan(String value) {
            addCriterion("exam_suite_id <", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_id <=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLike(String value) {
            addCriterion("exam_suite_id like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotLike(String value) {
            addCriterion("exam_suite_id not like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIn(List<String> values) {
            addCriterion("exam_suite_id in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotIn(List<String> values) {
            addCriterion("exam_suite_id not in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdBetween(String value1, String value2) {
            addCriterion("exam_suite_id between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_id not between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdIsNull() {
            addCriterion("high_incidence_disease_id is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdIsNotNull() {
            addCriterion("high_incidence_disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdEqualTo(String value) {
            addCriterion("high_incidence_disease_id =", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotEqualTo(String value) {
            addCriterion("high_incidence_disease_id <>", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdGreaterThan(String value) {
            addCriterion("high_incidence_disease_id >", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_id >=", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLessThan(String value) {
            addCriterion("high_incidence_disease_id <", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_id <=", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLike(String value) {
            addCriterion("high_incidence_disease_id like", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotLike(String value) {
            addCriterion("high_incidence_disease_id not like", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdIn(List<String> values) {
            addCriterion("high_incidence_disease_id in", values, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotIn(List<String> values) {
            addCriterion("high_incidence_disease_id not in", values, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_id between", value1, value2, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_id not between", value1, value2, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteIsNull() {
            addCriterion("oes_hid_note is null");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteIsNotNull() {
            addCriterion("oes_hid_note is not null");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteEqualTo(String value) {
            addCriterion("oes_hid_note =", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteNotEqualTo(String value) {
            addCriterion("oes_hid_note <>", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteGreaterThan(String value) {
            addCriterion("oes_hid_note >", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteGreaterThanOrEqualTo(String value) {
            addCriterion("oes_hid_note >=", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteLessThan(String value) {
            addCriterion("oes_hid_note <", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteLessThanOrEqualTo(String value) {
            addCriterion("oes_hid_note <=", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteLike(String value) {
            addCriterion("oes_hid_note like", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteNotLike(String value) {
            addCriterion("oes_hid_note not like", value, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteIn(List<String> values) {
            addCriterion("oes_hid_note in", values, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteNotIn(List<String> values) {
            addCriterion("oes_hid_note not in", values, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteBetween(String value1, String value2) {
            addCriterion("oes_hid_note between", value1, value2, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidNoteNotBetween(String value1, String value2) {
            addCriterion("oes_hid_note not between", value1, value2, "oesHidNote");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusIsNull() {
            addCriterion("oes_hid_status is null");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusIsNotNull() {
            addCriterion("oes_hid_status is not null");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusEqualTo(Integer value) {
            addCriterion("oes_hid_status =", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusNotEqualTo(Integer value) {
            addCriterion("oes_hid_status <>", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusGreaterThan(Integer value) {
            addCriterion("oes_hid_status >", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oes_hid_status >=", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusLessThan(Integer value) {
            addCriterion("oes_hid_status <", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oes_hid_status <=", value, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusIn(List<Integer> values) {
            addCriterion("oes_hid_status in", values, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusNotIn(List<Integer> values) {
            addCriterion("oes_hid_status not in", values, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusBetween(Integer value1, Integer value2) {
            addCriterion("oes_hid_status between", value1, value2, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oes_hid_status not between", value1, value2, "oesHidStatus");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeIsNull() {
            addCriterion("oes_hid_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeIsNotNull() {
            addCriterion("oes_hid_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeEqualTo(Date value) {
            addCriterion("oes_hid_create_time =", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeNotEqualTo(Date value) {
            addCriterion("oes_hid_create_time <>", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeGreaterThan(Date value) {
            addCriterion("oes_hid_create_time >", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oes_hid_create_time >=", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeLessThan(Date value) {
            addCriterion("oes_hid_create_time <", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("oes_hid_create_time <=", value, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeIn(List<Date> values) {
            addCriterion("oes_hid_create_time in", values, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeNotIn(List<Date> values) {
            addCriterion("oes_hid_create_time not in", values, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeBetween(Date value1, Date value2) {
            addCriterion("oes_hid_create_time between", value1, value2, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("oes_hid_create_time not between", value1, value2, "oesHidCreateTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeIsNull() {
            addCriterion("oes_hid_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeIsNotNull() {
            addCriterion("oes_hid_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeEqualTo(Date value) {
            addCriterion("oes_hid_edit_time =", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeNotEqualTo(Date value) {
            addCriterion("oes_hid_edit_time <>", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeGreaterThan(Date value) {
            addCriterion("oes_hid_edit_time >", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oes_hid_edit_time >=", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeLessThan(Date value) {
            addCriterion("oes_hid_edit_time <", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("oes_hid_edit_time <=", value, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeIn(List<Date> values) {
            addCriterion("oes_hid_edit_time in", values, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeNotIn(List<Date> values) {
            addCriterion("oes_hid_edit_time not in", values, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeBetween(Date value1, Date value2) {
            addCriterion("oes_hid_edit_time between", value1, value2, "oesHidEditTime");
            return (Criteria) this;
        }

        public Criteria andOesHidEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("oes_hid_edit_time not between", value1, value2, "oesHidEditTime");
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