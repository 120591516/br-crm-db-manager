package br.crm.pojo.suite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamSuiteTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamSuiteTypeExample() {
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

        public Criteria andExamSuiteTypeIdIsNull() {
            addCriterion("exam_suite_type_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdIsNotNull() {
            addCriterion("exam_suite_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdEqualTo(String value) {
            addCriterion("exam_suite_type_id =", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdNotEqualTo(String value) {
            addCriterion("exam_suite_type_id <>", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdGreaterThan(String value) {
            addCriterion("exam_suite_type_id >", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_type_id >=", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdLessThan(String value) {
            addCriterion("exam_suite_type_id <", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_type_id <=", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdLike(String value) {
            addCriterion("exam_suite_type_id like", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdNotLike(String value) {
            addCriterion("exam_suite_type_id not like", value, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdIn(List<String> values) {
            addCriterion("exam_suite_type_id in", values, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdNotIn(List<String> values) {
            addCriterion("exam_suite_type_id not in", values, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdBetween(String value1, String value2) {
            addCriterion("exam_suite_type_id between", value1, value2, "examSuiteTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_type_id not between", value1, value2, "examSuiteTypeId");
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

        public Criteria andExamTypeIdIsNull() {
            addCriterion("exam_type_id is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdIsNotNull() {
            addCriterion("exam_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdEqualTo(String value) {
            addCriterion("exam_type_id =", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdNotEqualTo(String value) {
            addCriterion("exam_type_id <>", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdGreaterThan(String value) {
            addCriterion("exam_type_id >", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type_id >=", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdLessThan(String value) {
            addCriterion("exam_type_id <", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdLessThanOrEqualTo(String value) {
            addCriterion("exam_type_id <=", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdLike(String value) {
            addCriterion("exam_type_id like", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdNotLike(String value) {
            addCriterion("exam_type_id not like", value, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdIn(List<String> values) {
            addCriterion("exam_type_id in", values, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdNotIn(List<String> values) {
            addCriterion("exam_type_id not in", values, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdBetween(String value1, String value2) {
            addCriterion("exam_type_id between", value1, value2, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIdNotBetween(String value1, String value2) {
            addCriterion("exam_type_id not between", value1, value2, "examTypeId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteIsNull() {
            addCriterion("exam_suite_type_note is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteIsNotNull() {
            addCriterion("exam_suite_type_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteEqualTo(String value) {
            addCriterion("exam_suite_type_note =", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteNotEqualTo(String value) {
            addCriterion("exam_suite_type_note <>", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteGreaterThan(String value) {
            addCriterion("exam_suite_type_note >", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_type_note >=", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteLessThan(String value) {
            addCriterion("exam_suite_type_note <", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_type_note <=", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteLike(String value) {
            addCriterion("exam_suite_type_note like", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteNotLike(String value) {
            addCriterion("exam_suite_type_note not like", value, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteIn(List<String> values) {
            addCriterion("exam_suite_type_note in", values, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteNotIn(List<String> values) {
            addCriterion("exam_suite_type_note not in", values, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteBetween(String value1, String value2) {
            addCriterion("exam_suite_type_note between", value1, value2, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeNoteNotBetween(String value1, String value2) {
            addCriterion("exam_suite_type_note not between", value1, value2, "examSuiteTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusIsNull() {
            addCriterion("exam_suite_type_status is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusIsNotNull() {
            addCriterion("exam_suite_type_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusEqualTo(Integer value) {
            addCriterion("exam_suite_type_status =", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusNotEqualTo(Integer value) {
            addCriterion("exam_suite_type_status <>", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusGreaterThan(Integer value) {
            addCriterion("exam_suite_type_status >", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_type_status >=", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusLessThan(Integer value) {
            addCriterion("exam_suite_type_status <", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_type_status <=", value, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusIn(List<Integer> values) {
            addCriterion("exam_suite_type_status in", values, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusNotIn(List<Integer> values) {
            addCriterion("exam_suite_type_status not in", values, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_type_status between", value1, value2, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_type_status not between", value1, value2, "examSuiteTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeIsNull() {
            addCriterion("exam_suite_type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeIsNotNull() {
            addCriterion("exam_suite_type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeEqualTo(Date value) {
            addCriterion("exam_suite_type_create_time =", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_suite_type_create_time <>", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeGreaterThan(Date value) {
            addCriterion("exam_suite_type_create_time >", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_suite_type_create_time >=", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeLessThan(Date value) {
            addCriterion("exam_suite_type_create_time <", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_suite_type_create_time <=", value, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeIn(List<Date> values) {
            addCriterion("exam_suite_type_create_time in", values, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_suite_type_create_time not in", values, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_suite_type_create_time between", value1, value2, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_suite_type_create_time not between", value1, value2, "examSuiteTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeIsNull() {
            addCriterion("exam_suite_type_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeIsNotNull() {
            addCriterion("exam_suite_type_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeEqualTo(Date value) {
            addCriterion("exam_suite_type_edit_time =", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeNotEqualTo(Date value) {
            addCriterion("exam_suite_type_edit_time <>", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeGreaterThan(Date value) {
            addCriterion("exam_suite_type_edit_time >", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_suite_type_edit_time >=", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeLessThan(Date value) {
            addCriterion("exam_suite_type_edit_time <", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_suite_type_edit_time <=", value, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeIn(List<Date> values) {
            addCriterion("exam_suite_type_edit_time in", values, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeNotIn(List<Date> values) {
            addCriterion("exam_suite_type_edit_time not in", values, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_suite_type_edit_time between", value1, value2, "examSuiteTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteTypeEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_suite_type_edit_time not between", value1, value2, "examSuiteTypeEditTime");
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