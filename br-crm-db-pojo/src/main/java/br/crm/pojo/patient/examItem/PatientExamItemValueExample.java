package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExamItemValueExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExamItemValueExample() {
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

        public Criteria andPatientExamItemValueIdIsNull() {
            addCriterion("patient_exam_item_value_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdIsNotNull() {
            addCriterion("patient_exam_item_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdEqualTo(String value) {
            addCriterion("patient_exam_item_value_id =", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdNotEqualTo(String value) {
            addCriterion("patient_exam_item_value_id <>", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdGreaterThan(String value) {
            addCriterion("patient_exam_item_value_id >", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_value_id >=", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdLessThan(String value) {
            addCriterion("patient_exam_item_value_id <", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_value_id <=", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdLike(String value) {
            addCriterion("patient_exam_item_value_id like", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdNotLike(String value) {
            addCriterion("patient_exam_item_value_id not like", value, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdIn(List<String> values) {
            addCriterion("patient_exam_item_value_id in", values, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdNotIn(List<String> values) {
            addCriterion("patient_exam_item_value_id not in", values, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdBetween(String value1, String value2) {
            addCriterion("patient_exam_item_value_id between", value1, value2, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_value_id not between", value1, value2, "patientExamItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIsNull() {
            addCriterion("patient_exam_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIsNotNull() {
            addCriterion("patient_exam_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdEqualTo(String value) {
            addCriterion("patient_exam_item_id =", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotEqualTo(String value) {
            addCriterion("patient_exam_item_id <>", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdGreaterThan(String value) {
            addCriterion("patient_exam_item_id >", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_id >=", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLessThan(String value) {
            addCriterion("patient_exam_item_id <", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_id <=", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLike(String value) {
            addCriterion("patient_exam_item_id like", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotLike(String value) {
            addCriterion("patient_exam_item_id not like", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIn(List<String> values) {
            addCriterion("patient_exam_item_id in", values, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotIn(List<String> values) {
            addCriterion("patient_exam_item_id not in", values, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdBetween(String value1, String value2) {
            addCriterion("patient_exam_item_id between", value1, value2, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_id not between", value1, value2, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdIsNull() {
            addCriterion("exam_item_value_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdIsNotNull() {
            addCriterion("exam_item_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdEqualTo(String value) {
            addCriterion("exam_item_value_id =", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdNotEqualTo(String value) {
            addCriterion("exam_item_value_id <>", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdGreaterThan(String value) {
            addCriterion("exam_item_value_id >", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_id >=", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdLessThan(String value) {
            addCriterion("exam_item_value_id <", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_id <=", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdLike(String value) {
            addCriterion("exam_item_value_id like", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdNotLike(String value) {
            addCriterion("exam_item_value_id not like", value, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdIn(List<String> values) {
            addCriterion("exam_item_value_id in", values, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdNotIn(List<String> values) {
            addCriterion("exam_item_value_id not in", values, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdBetween(String value1, String value2) {
            addCriterion("exam_item_value_id between", value1, value2, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_id not between", value1, value2, "examItemValueId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderIsNull() {
            addCriterion("patient_exam_item_value_order is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderIsNotNull() {
            addCriterion("patient_exam_item_value_order is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_order =", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderNotEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_order <>", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderGreaterThan(Integer value) {
            addCriterion("patient_exam_item_value_order >", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_order >=", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderLessThan(Integer value) {
            addCriterion("patient_exam_item_value_order <", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderLessThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_order <=", value, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderIn(List<Integer> values) {
            addCriterion("patient_exam_item_value_order in", values, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderNotIn(List<Integer> values) {
            addCriterion("patient_exam_item_value_order not in", values, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_value_order between", value1, value2, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_value_order not between", value1, value2, "patientExamItemValueOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeIsNull() {
            addCriterion("patient_exam_item_value_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeIsNotNull() {
            addCriterion("patient_exam_item_value_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_value_create_time =", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_value_create_time <>", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_value_create_time >", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_value_create_time >=", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeLessThan(Date value) {
            addCriterion("patient_exam_item_value_create_time <", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_value_create_time <=", value, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_value_create_time in", values, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_value_create_time not in", values, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_value_create_time between", value1, value2, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_value_create_time not between", value1, value2, "patientExamItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeIsNull() {
            addCriterion("patient_exam_item_value_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeIsNotNull() {
            addCriterion("patient_exam_item_value_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_value_edit_time =", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_value_edit_time <>", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_value_edit_time >", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_value_edit_time >=", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeLessThan(Date value) {
            addCriterion("patient_exam_item_value_edit_time <", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_value_edit_time <=", value, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_value_edit_time in", values, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_value_edit_time not in", values, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_value_edit_time between", value1, value2, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_value_edit_time not between", value1, value2, "patientExamItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusIsNull() {
            addCriterion("patient_exam_item_value_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusIsNotNull() {
            addCriterion("patient_exam_item_value_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_status =", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusNotEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_status <>", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusGreaterThan(Integer value) {
            addCriterion("patient_exam_item_value_status >", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_status >=", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusLessThan(Integer value) {
            addCriterion("patient_exam_item_value_status <", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_value_status <=", value, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusIn(List<Integer> values) {
            addCriterion("patient_exam_item_value_status in", values, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusNotIn(List<Integer> values) {
            addCriterion("patient_exam_item_value_status not in", values, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_value_status between", value1, value2, "patientExamItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemValueStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_value_status not between", value1, value2, "patientExamItemValueStatus");
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