package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictPatientClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictPatientClassExample() {
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

        public Criteria andCustomerClassIdIsNull() {
            addCriterion("customer_class_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdIsNotNull() {
            addCriterion("customer_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdEqualTo(String value) {
            addCriterion("customer_class_id =", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdNotEqualTo(String value) {
            addCriterion("customer_class_id <>", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdGreaterThan(String value) {
            addCriterion("customer_class_id >", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_id >=", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdLessThan(String value) {
            addCriterion("customer_class_id <", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdLessThanOrEqualTo(String value) {
            addCriterion("customer_class_id <=", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdLike(String value) {
            addCriterion("customer_class_id like", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdNotLike(String value) {
            addCriterion("customer_class_id not like", value, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdIn(List<String> values) {
            addCriterion("customer_class_id in", values, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdNotIn(List<String> values) {
            addCriterion("customer_class_id not in", values, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdBetween(String value1, String value2) {
            addCriterion("customer_class_id between", value1, value2, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassIdNotBetween(String value1, String value2) {
            addCriterion("customer_class_id not between", value1, value2, "customerClassId");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameIsNull() {
            addCriterion("customer_class_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameIsNotNull() {
            addCriterion("customer_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEqualTo(String value) {
            addCriterion("customer_class_name =", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameNotEqualTo(String value) {
            addCriterion("customer_class_name <>", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameGreaterThan(String value) {
            addCriterion("customer_class_name >", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_name >=", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameLessThan(String value) {
            addCriterion("customer_class_name <", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameLessThanOrEqualTo(String value) {
            addCriterion("customer_class_name <=", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameLike(String value) {
            addCriterion("customer_class_name like", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameNotLike(String value) {
            addCriterion("customer_class_name not like", value, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameIn(List<String> values) {
            addCriterion("customer_class_name in", values, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameNotIn(List<String> values) {
            addCriterion("customer_class_name not in", values, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameBetween(String value1, String value2) {
            addCriterion("customer_class_name between", value1, value2, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameNotBetween(String value1, String value2) {
            addCriterion("customer_class_name not between", value1, value2, "customerClassName");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngIsNull() {
            addCriterion("customer_class_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngIsNotNull() {
            addCriterion("customer_class_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngEqualTo(String value) {
            addCriterion("customer_class_name_eng =", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngNotEqualTo(String value) {
            addCriterion("customer_class_name_eng <>", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngGreaterThan(String value) {
            addCriterion("customer_class_name_eng >", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_name_eng >=", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngLessThan(String value) {
            addCriterion("customer_class_name_eng <", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngLessThanOrEqualTo(String value) {
            addCriterion("customer_class_name_eng <=", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngLike(String value) {
            addCriterion("customer_class_name_eng like", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngNotLike(String value) {
            addCriterion("customer_class_name_eng not like", value, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngIn(List<String> values) {
            addCriterion("customer_class_name_eng in", values, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngNotIn(List<String> values) {
            addCriterion("customer_class_name_eng not in", values, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngBetween(String value1, String value2) {
            addCriterion("customer_class_name_eng between", value1, value2, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNameEngNotBetween(String value1, String value2) {
            addCriterion("customer_class_name_eng not between", value1, value2, "customerClassNameEng");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeIsNull() {
            addCriterion("customer_class_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeIsNotNull() {
            addCriterion("customer_class_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeEqualTo(String value) {
            addCriterion("customer_class_code =", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeNotEqualTo(String value) {
            addCriterion("customer_class_code <>", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeGreaterThan(String value) {
            addCriterion("customer_class_code >", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_code >=", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeLessThan(String value) {
            addCriterion("customer_class_code <", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_class_code <=", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeLike(String value) {
            addCriterion("customer_class_code like", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeNotLike(String value) {
            addCriterion("customer_class_code not like", value, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeIn(List<String> values) {
            addCriterion("customer_class_code in", values, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeNotIn(List<String> values) {
            addCriterion("customer_class_code not in", values, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeBetween(String value1, String value2) {
            addCriterion("customer_class_code between", value1, value2, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCodeNotBetween(String value1, String value2) {
            addCriterion("customer_class_code not between", value1, value2, "customerClassCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeIsNull() {
            addCriterion("customer_class_input_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeIsNotNull() {
            addCriterion("customer_class_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeEqualTo(String value) {
            addCriterion("customer_class_input_code =", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeNotEqualTo(String value) {
            addCriterion("customer_class_input_code <>", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeGreaterThan(String value) {
            addCriterion("customer_class_input_code >", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_input_code >=", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeLessThan(String value) {
            addCriterion("customer_class_input_code <", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_class_input_code <=", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeLike(String value) {
            addCriterion("customer_class_input_code like", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeNotLike(String value) {
            addCriterion("customer_class_input_code not like", value, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeIn(List<String> values) {
            addCriterion("customer_class_input_code in", values, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeNotIn(List<String> values) {
            addCriterion("customer_class_input_code not in", values, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeBetween(String value1, String value2) {
            addCriterion("customer_class_input_code between", value1, value2, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassInputCodeNotBetween(String value1, String value2) {
            addCriterion("customer_class_input_code not between", value1, value2, "customerClassInputCode");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteIsNull() {
            addCriterion("customer_class_note is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteIsNotNull() {
            addCriterion("customer_class_note is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteEqualTo(String value) {
            addCriterion("customer_class_note =", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteNotEqualTo(String value) {
            addCriterion("customer_class_note <>", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteGreaterThan(String value) {
            addCriterion("customer_class_note >", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteGreaterThanOrEqualTo(String value) {
            addCriterion("customer_class_note >=", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteLessThan(String value) {
            addCriterion("customer_class_note <", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteLessThanOrEqualTo(String value) {
            addCriterion("customer_class_note <=", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteLike(String value) {
            addCriterion("customer_class_note like", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteNotLike(String value) {
            addCriterion("customer_class_note not like", value, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteIn(List<String> values) {
            addCriterion("customer_class_note in", values, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteNotIn(List<String> values) {
            addCriterion("customer_class_note not in", values, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteBetween(String value1, String value2) {
            addCriterion("customer_class_note between", value1, value2, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassNoteNotBetween(String value1, String value2) {
            addCriterion("customer_class_note not between", value1, value2, "customerClassNote");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusIsNull() {
            addCriterion("customer_class_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusIsNotNull() {
            addCriterion("customer_class_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusEqualTo(Integer value) {
            addCriterion("customer_class_status =", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusNotEqualTo(Integer value) {
            addCriterion("customer_class_status <>", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusGreaterThan(Integer value) {
            addCriterion("customer_class_status >", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_class_status >=", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusLessThan(Integer value) {
            addCriterion("customer_class_status <", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_class_status <=", value, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusIn(List<Integer> values) {
            addCriterion("customer_class_status in", values, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusNotIn(List<Integer> values) {
            addCriterion("customer_class_status not in", values, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_class_status between", value1, value2, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_class_status not between", value1, value2, "customerClassStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeIsNull() {
            addCriterion("customer_class_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeIsNotNull() {
            addCriterion("customer_class_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeEqualTo(Date value) {
            addCriterion("customer_class_create_time =", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_class_create_time <>", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeGreaterThan(Date value) {
            addCriterion("customer_class_create_time >", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_class_create_time >=", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeLessThan(Date value) {
            addCriterion("customer_class_create_time <", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_class_create_time <=", value, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeIn(List<Date> values) {
            addCriterion("customer_class_create_time in", values, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_class_create_time not in", values, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_class_create_time between", value1, value2, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_class_create_time not between", value1, value2, "customerClassCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeIsNull() {
            addCriterion("customer_class_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeIsNotNull() {
            addCriterion("customer_class_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeEqualTo(Date value) {
            addCriterion("customer_class_edit_time =", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeNotEqualTo(Date value) {
            addCriterion("customer_class_edit_time <>", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeGreaterThan(Date value) {
            addCriterion("customer_class_edit_time >", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_class_edit_time >=", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeLessThan(Date value) {
            addCriterion("customer_class_edit_time <", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_class_edit_time <=", value, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeIn(List<Date> values) {
            addCriterion("customer_class_edit_time in", values, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeNotIn(List<Date> values) {
            addCriterion("customer_class_edit_time not in", values, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_class_edit_time between", value1, value2, "customerClassEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerClassEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_class_edit_time not between", value1, value2, "customerClassEditTime");
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