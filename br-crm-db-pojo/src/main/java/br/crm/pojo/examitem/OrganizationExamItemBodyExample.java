package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamItemBodyExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamItemBodyExample() {
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

        public Criteria andExamItemBodyIdIsNull() {
            addCriterion("exam_item_body_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdIsNotNull() {
            addCriterion("exam_item_body_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdEqualTo(String value) {
            addCriterion("exam_item_body_id =", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdNotEqualTo(String value) {
            addCriterion("exam_item_body_id <>", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdGreaterThan(String value) {
            addCriterion("exam_item_body_id >", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_body_id >=", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdLessThan(String value) {
            addCriterion("exam_item_body_id <", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_body_id <=", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdLike(String value) {
            addCriterion("exam_item_body_id like", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdNotLike(String value) {
            addCriterion("exam_item_body_id not like", value, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdIn(List<String> values) {
            addCriterion("exam_item_body_id in", values, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdNotIn(List<String> values) {
            addCriterion("exam_item_body_id not in", values, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdBetween(String value1, String value2) {
            addCriterion("exam_item_body_id between", value1, value2, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_body_id not between", value1, value2, "examItemBodyId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdIsNull() {
            addCriterion("exam_item_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemIdIsNotNull() {
            addCriterion("exam_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemIdEqualTo(String value) {
            addCriterion("exam_item_id =", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdNotEqualTo(String value) {
            addCriterion("exam_item_id <>", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdGreaterThan(String value) {
            addCriterion("exam_item_id >", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_id >=", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdLessThan(String value) {
            addCriterion("exam_item_id <", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_id <=", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdLike(String value) {
            addCriterion("exam_item_id like", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdNotLike(String value) {
            addCriterion("exam_item_id not like", value, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdIn(List<String> values) {
            addCriterion("exam_item_id in", values, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdNotIn(List<String> values) {
            addCriterion("exam_item_id not in", values, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdBetween(String value1, String value2) {
            addCriterion("exam_item_id between", value1, value2, "examItemId");
            return (Criteria) this;
        }

        public Criteria andExamItemIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_id not between", value1, value2, "examItemId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIsNull() {
            addCriterion("body_part_id is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIsNotNull() {
            addCriterion("body_part_id is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdEqualTo(String value) {
            addCriterion("body_part_id =", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotEqualTo(String value) {
            addCriterion("body_part_id <>", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThan(String value) {
            addCriterion("body_part_id >", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("body_part_id >=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThan(String value) {
            addCriterion("body_part_id <", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThanOrEqualTo(String value) {
            addCriterion("body_part_id <=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLike(String value) {
            addCriterion("body_part_id like", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotLike(String value) {
            addCriterion("body_part_id not like", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIn(List<String> values) {
            addCriterion("body_part_id in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotIn(List<String> values) {
            addCriterion("body_part_id not in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdBetween(String value1, String value2) {
            addCriterion("body_part_id between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotBetween(String value1, String value2) {
            addCriterion("body_part_id not between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultIsNull() {
            addCriterion("exam_item_body_isdefault is null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultIsNotNull() {
            addCriterion("exam_item_body_isdefault is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultEqualTo(Integer value) {
            addCriterion("exam_item_body_isdefault =", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultNotEqualTo(Integer value) {
            addCriterion("exam_item_body_isdefault <>", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultGreaterThan(Integer value) {
            addCriterion("exam_item_body_isdefault >", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_body_isdefault >=", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultLessThan(Integer value) {
            addCriterion("exam_item_body_isdefault <", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_body_isdefault <=", value, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultIn(List<Integer> values) {
            addCriterion("exam_item_body_isdefault in", values, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultNotIn(List<Integer> values) {
            addCriterion("exam_item_body_isdefault not in", values, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_body_isdefault between", value1, value2, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyIsdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_body_isdefault not between", value1, value2, "examItemBodyIsdefault");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusIsNull() {
            addCriterion("exam_item_body_status is null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusIsNotNull() {
            addCriterion("exam_item_body_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusEqualTo(Integer value) {
            addCriterion("exam_item_body_status =", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusNotEqualTo(Integer value) {
            addCriterion("exam_item_body_status <>", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusGreaterThan(Integer value) {
            addCriterion("exam_item_body_status >", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_body_status >=", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusLessThan(Integer value) {
            addCriterion("exam_item_body_status <", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_body_status <=", value, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusIn(List<Integer> values) {
            addCriterion("exam_item_body_status in", values, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusNotIn(List<Integer> values) {
            addCriterion("exam_item_body_status not in", values, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_body_status between", value1, value2, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_body_status not between", value1, value2, "examItemBodyStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeIsNull() {
            addCriterion("exam_item_body_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeIsNotNull() {
            addCriterion("exam_item_body_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeEqualTo(Date value) {
            addCriterion("exam_item_body_create_time =", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_item_body_create_time <>", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeGreaterThan(Date value) {
            addCriterion("exam_item_body_create_time >", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_body_create_time >=", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeLessThan(Date value) {
            addCriterion("exam_item_body_create_time <", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_body_create_time <=", value, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeIn(List<Date> values) {
            addCriterion("exam_item_body_create_time in", values, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_item_body_create_time not in", values, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_body_create_time between", value1, value2, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_body_create_time not between", value1, value2, "examItemBodyCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeIsNull() {
            addCriterion("exam_item_body_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeIsNotNull() {
            addCriterion("exam_item_body_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeEqualTo(Date value) {
            addCriterion("exam_item_body_edit_time =", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeNotEqualTo(Date value) {
            addCriterion("exam_item_body_edit_time <>", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeGreaterThan(Date value) {
            addCriterion("exam_item_body_edit_time >", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_body_edit_time >=", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeLessThan(Date value) {
            addCriterion("exam_item_body_edit_time <", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_body_edit_time <=", value, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeIn(List<Date> values) {
            addCriterion("exam_item_body_edit_time in", values, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeNotIn(List<Date> values) {
            addCriterion("exam_item_body_edit_time not in", values, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_body_edit_time between", value1, value2, "examItemBodyEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemBodyEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_body_edit_time not between", value1, value2, "examItemBodyEditTime");
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