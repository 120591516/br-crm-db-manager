package br.crm.pojo.examfeeitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrganizationExamFeeItemSubjectExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamFeeItemSubjectExample() {
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

        public Criteria andExamFeeItemSubjectIdIsNull() {
            addCriterion("exam_fee_item_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdIsNotNull() {
            addCriterion("exam_fee_item_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdEqualTo(String value) {
            addCriterion("exam_fee_item_subject_id =", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_subject_id <>", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdGreaterThan(String value) {
            addCriterion("exam_fee_item_subject_id >", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_subject_id >=", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdLessThan(String value) {
            addCriterion("exam_fee_item_subject_id <", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_subject_id <=", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdLike(String value) {
            addCriterion("exam_fee_item_subject_id like", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdNotLike(String value) {
            addCriterion("exam_fee_item_subject_id not like", value, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdIn(List<String> values) {
            addCriterion("exam_fee_item_subject_id in", values, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_subject_id not in", values, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_subject_id between", value1, value2, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_subject_id not between", value1, value2, "examFeeItemSubjectId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNull() {
            addCriterion("exam_fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNotNull() {
            addCriterion("exam_fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdEqualTo(String value) {
            addCriterion("exam_fee_item_id =", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_id <>", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThan(String value) {
            addCriterion("exam_fee_item_id >", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id >=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThan(String value) {
            addCriterion("exam_fee_item_id <", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id <=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLike(String value) {
            addCriterion("exam_fee_item_id like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotLike(String value) {
            addCriterion("exam_fee_item_id not like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIn(List<String> values) {
            addCriterion("exam_fee_item_id in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_id not in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id between", value1, value2, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id not between", value1, value2, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdIsNull() {
            addCriterion("exam_fee_item_sub_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdIsNotNull() {
            addCriterion("exam_fee_item_sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdEqualTo(String value) {
            addCriterion("exam_fee_item_sub_id =", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_sub_id <>", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdGreaterThan(String value) {
            addCriterion("exam_fee_item_sub_id >", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_sub_id >=", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdLessThan(String value) {
            addCriterion("exam_fee_item_sub_id <", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_sub_id <=", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdLike(String value) {
            addCriterion("exam_fee_item_sub_id like", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdNotLike(String value) {
            addCriterion("exam_fee_item_sub_id not like", value, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdIn(List<String> values) {
            addCriterion("exam_fee_item_sub_id in", values, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_sub_id not in", values, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_sub_id between", value1, value2, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_sub_id not between", value1, value2, "examFeeItemSubId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderIsNull() {
            addCriterion("exam_fee_item_subject_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderIsNotNull() {
            addCriterion("exam_fee_item_subject_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderEqualTo(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order =", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderNotEqualTo(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order <>", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderGreaterThan(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order >", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order >=", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderLessThan(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order <", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exam_fee_item_subject_disp_order <=", value, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderIn(List<Integer> values) {
            addCriterion("exam_fee_item_subject_disp_order in", values, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderNotIn(List<Integer> values) {
            addCriterion("exam_fee_item_subject_disp_order not in", values, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("exam_fee_item_subject_disp_order between", value1, value2, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_fee_item_subject_disp_order not between", value1, value2, "examFeeItemSubjectDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteIsNull() {
            addCriterion("exam_fee_item_subject_note is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteIsNotNull() {
            addCriterion("exam_fee_item_subject_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteEqualTo(String value) {
            addCriterion("exam_fee_item_subject_note =", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteNotEqualTo(String value) {
            addCriterion("exam_fee_item_subject_note <>", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteGreaterThan(String value) {
            addCriterion("exam_fee_item_subject_note >", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_subject_note >=", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteLessThan(String value) {
            addCriterion("exam_fee_item_subject_note <", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_subject_note <=", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteLike(String value) {
            addCriterion("exam_fee_item_subject_note like", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteNotLike(String value) {
            addCriterion("exam_fee_item_subject_note not like", value, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteIn(List<String> values) {
            addCriterion("exam_fee_item_subject_note in", values, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteNotIn(List<String> values) {
            addCriterion("exam_fee_item_subject_note not in", values, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteBetween(String value1, String value2) {
            addCriterion("exam_fee_item_subject_note between", value1, value2, "examFeeItemSubjectNote");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemSubjectNoteNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_subject_note not between", value1, value2, "examFeeItemSubjectNote");
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