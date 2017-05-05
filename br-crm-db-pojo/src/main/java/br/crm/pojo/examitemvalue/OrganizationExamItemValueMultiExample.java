package br.crm.pojo.examitemvalue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrganizationExamItemValueMultiExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamItemValueMultiExample() {
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

        public Criteria andExamItemValueMultiIdIsNull() {
            addCriterion("exam_item_value_multi_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdIsNotNull() {
            addCriterion("exam_item_value_multi_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdEqualTo(String value) {
            addCriterion("exam_item_value_multi_id =", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdNotEqualTo(String value) {
            addCriterion("exam_item_value_multi_id <>", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdGreaterThan(String value) {
            addCriterion("exam_item_value_multi_id >", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_multi_id >=", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdLessThan(String value) {
            addCriterion("exam_item_value_multi_id <", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_multi_id <=", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdLike(String value) {
            addCriterion("exam_item_value_multi_id like", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdNotLike(String value) {
            addCriterion("exam_item_value_multi_id not like", value, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdIn(List<String> values) {
            addCriterion("exam_item_value_multi_id in", values, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdNotIn(List<String> values) {
            addCriterion("exam_item_value_multi_id not in", values, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdBetween(String value1, String value2) {
            addCriterion("exam_item_value_multi_id between", value1, value2, "examItemValueMultiId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_multi_id not between", value1, value2, "examItemValueMultiId");
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

        public Criteria andDictBodypartIdIsNull() {
            addCriterion("dict_bodypart_id is null");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdIsNotNull() {
            addCriterion("dict_bodypart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdEqualTo(String value) {
            addCriterion("dict_bodypart_id =", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdNotEqualTo(String value) {
            addCriterion("dict_bodypart_id <>", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdGreaterThan(String value) {
            addCriterion("dict_bodypart_id >", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_bodypart_id >=", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdLessThan(String value) {
            addCriterion("dict_bodypart_id <", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdLessThanOrEqualTo(String value) {
            addCriterion("dict_bodypart_id <=", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdLike(String value) {
            addCriterion("dict_bodypart_id like", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdNotLike(String value) {
            addCriterion("dict_bodypart_id not like", value, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdIn(List<String> values) {
            addCriterion("dict_bodypart_id in", values, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdNotIn(List<String> values) {
            addCriterion("dict_bodypart_id not in", values, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdBetween(String value1, String value2) {
            addCriterion("dict_bodypart_id between", value1, value2, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andDictBodypartIdNotBetween(String value1, String value2) {
            addCriterion("dict_bodypart_id not between", value1, value2, "dictBodypartId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeIsNull() {
            addCriterion("exam_item_value_multi_degree is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeIsNotNull() {
            addCriterion("exam_item_value_multi_degree is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeEqualTo(Integer value) {
            addCriterion("exam_item_value_multi_degree =", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeNotEqualTo(Integer value) {
            addCriterion("exam_item_value_multi_degree <>", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeGreaterThan(Integer value) {
            addCriterion("exam_item_value_multi_degree >", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_multi_degree >=", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeLessThan(Integer value) {
            addCriterion("exam_item_value_multi_degree <", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_multi_degree <=", value, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeIn(List<Integer> values) {
            addCriterion("exam_item_value_multi_degree in", values, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeNotIn(List<Integer> values) {
            addCriterion("exam_item_value_multi_degree not in", values, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_multi_degree between", value1, value2, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueMultiDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_multi_degree not between", value1, value2, "examItemValueMultiDegree");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdIsNull() {
            addCriterion("dict_conclusion_id is null");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdIsNotNull() {
            addCriterion("dict_conclusion_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdEqualTo(String value) {
            addCriterion("dict_conclusion_id =", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotEqualTo(String value) {
            addCriterion("dict_conclusion_id <>", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdGreaterThan(String value) {
            addCriterion("dict_conclusion_id >", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_conclusion_id >=", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdLessThan(String value) {
            addCriterion("dict_conclusion_id <", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdLessThanOrEqualTo(String value) {
            addCriterion("dict_conclusion_id <=", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdLike(String value) {
            addCriterion("dict_conclusion_id like", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotLike(String value) {
            addCriterion("dict_conclusion_id not like", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdIn(List<String> values) {
            addCriterion("dict_conclusion_id in", values, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotIn(List<String> values) {
            addCriterion("dict_conclusion_id not in", values, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdBetween(String value1, String value2) {
            addCriterion("dict_conclusion_id between", value1, value2, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotBetween(String value1, String value2) {
            addCriterion("dict_conclusion_id not between", value1, value2, "dictConclusionId");
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