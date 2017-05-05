package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictExamSuiteTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictExamSuiteTypeExample() {
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

        public Criteria andExamTypeNameIsNull() {
            addCriterion("exam_type_name is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameIsNotNull() {
            addCriterion("exam_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEqualTo(String value) {
            addCriterion("exam_type_name =", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameNotEqualTo(String value) {
            addCriterion("exam_type_name <>", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameGreaterThan(String value) {
            addCriterion("exam_type_name >", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type_name >=", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameLessThan(String value) {
            addCriterion("exam_type_name <", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameLessThanOrEqualTo(String value) {
            addCriterion("exam_type_name <=", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameLike(String value) {
            addCriterion("exam_type_name like", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameNotLike(String value) {
            addCriterion("exam_type_name not like", value, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameIn(List<String> values) {
            addCriterion("exam_type_name in", values, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameNotIn(List<String> values) {
            addCriterion("exam_type_name not in", values, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameBetween(String value1, String value2) {
            addCriterion("exam_type_name between", value1, value2, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameNotBetween(String value1, String value2) {
            addCriterion("exam_type_name not between", value1, value2, "examTypeName");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngIsNull() {
            addCriterion("exam_type_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngIsNotNull() {
            addCriterion("exam_type_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngEqualTo(String value) {
            addCriterion("exam_type_name_eng =", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngNotEqualTo(String value) {
            addCriterion("exam_type_name_eng <>", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngGreaterThan(String value) {
            addCriterion("exam_type_name_eng >", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type_name_eng >=", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngLessThan(String value) {
            addCriterion("exam_type_name_eng <", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngLessThanOrEqualTo(String value) {
            addCriterion("exam_type_name_eng <=", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngLike(String value) {
            addCriterion("exam_type_name_eng like", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngNotLike(String value) {
            addCriterion("exam_type_name_eng not like", value, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngIn(List<String> values) {
            addCriterion("exam_type_name_eng in", values, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngNotIn(List<String> values) {
            addCriterion("exam_type_name_eng not in", values, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngBetween(String value1, String value2) {
            addCriterion("exam_type_name_eng between", value1, value2, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeNameEngNotBetween(String value1, String value2) {
            addCriterion("exam_type_name_eng not between", value1, value2, "examTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeIsNull() {
            addCriterion("exam_type_code is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeIsNotNull() {
            addCriterion("exam_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeEqualTo(String value) {
            addCriterion("exam_type_code =", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeNotEqualTo(String value) {
            addCriterion("exam_type_code <>", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeGreaterThan(String value) {
            addCriterion("exam_type_code >", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type_code >=", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeLessThan(String value) {
            addCriterion("exam_type_code <", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_type_code <=", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeLike(String value) {
            addCriterion("exam_type_code like", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeNotLike(String value) {
            addCriterion("exam_type_code not like", value, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeIn(List<String> values) {
            addCriterion("exam_type_code in", values, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeNotIn(List<String> values) {
            addCriterion("exam_type_code not in", values, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeBetween(String value1, String value2) {
            addCriterion("exam_type_code between", value1, value2, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeCodeNotBetween(String value1, String value2) {
            addCriterion("exam_type_code not between", value1, value2, "examTypeCode");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteIsNull() {
            addCriterion("exam_type_note is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteIsNotNull() {
            addCriterion("exam_type_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteEqualTo(String value) {
            addCriterion("exam_type_note =", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteNotEqualTo(String value) {
            addCriterion("exam_type_note <>", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteGreaterThan(String value) {
            addCriterion("exam_type_note >", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_type_note >=", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteLessThan(String value) {
            addCriterion("exam_type_note <", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_type_note <=", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteLike(String value) {
            addCriterion("exam_type_note like", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteNotLike(String value) {
            addCriterion("exam_type_note not like", value, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteIn(List<String> values) {
            addCriterion("exam_type_note in", values, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteNotIn(List<String> values) {
            addCriterion("exam_type_note not in", values, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteBetween(String value1, String value2) {
            addCriterion("exam_type_note between", value1, value2, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeNoteNotBetween(String value1, String value2) {
            addCriterion("exam_type_note not between", value1, value2, "examTypeNote");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusIsNull() {
            addCriterion("exam_type_status is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusIsNotNull() {
            addCriterion("exam_type_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusEqualTo(Integer value) {
            addCriterion("exam_type_status =", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusNotEqualTo(Integer value) {
            addCriterion("exam_type_status <>", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusGreaterThan(Integer value) {
            addCriterion("exam_type_status >", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_type_status >=", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusLessThan(Integer value) {
            addCriterion("exam_type_status <", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_type_status <=", value, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusIn(List<Integer> values) {
            addCriterion("exam_type_status in", values, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusNotIn(List<Integer> values) {
            addCriterion("exam_type_status not in", values, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_type_status between", value1, value2, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_type_status not between", value1, value2, "examTypeStatus");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeIsNull() {
            addCriterion("exam_type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeIsNotNull() {
            addCriterion("exam_type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeEqualTo(Date value) {
            addCriterion("exam_type_create_time =", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_type_create_time <>", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeGreaterThan(Date value) {
            addCriterion("exam_type_create_time >", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_type_create_time >=", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeLessThan(Date value) {
            addCriterion("exam_type_create_time <", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_type_create_time <=", value, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeIn(List<Date> values) {
            addCriterion("exam_type_create_time in", values, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_type_create_time not in", values, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_type_create_time between", value1, value2, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_type_create_time not between", value1, value2, "examTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeIsNull() {
            addCriterion("exam_type_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeIsNotNull() {
            addCriterion("exam_type_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeEqualTo(Date value) {
            addCriterion("exam_type_edit_time =", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeNotEqualTo(Date value) {
            addCriterion("exam_type_edit_time <>", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeGreaterThan(Date value) {
            addCriterion("exam_type_edit_time >", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_type_edit_time >=", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeLessThan(Date value) {
            addCriterion("exam_type_edit_time <", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_type_edit_time <=", value, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeIn(List<Date> values) {
            addCriterion("exam_type_edit_time in", values, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeNotIn(List<Date> values) {
            addCriterion("exam_type_edit_time not in", values, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_type_edit_time between", value1, value2, "examTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andExamTypeEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_type_edit_time not between", value1, value2, "examTypeEditTime");
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