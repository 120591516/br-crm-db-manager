package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictExamItemValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictExamItemValueExample() {
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

        public Criteria andExamItemValueNameIsNull() {
            addCriterion("exam_item_value_name is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameIsNotNull() {
            addCriterion("exam_item_value_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameEqualTo(String value) {
            addCriterion("exam_item_value_name =", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameNotEqualTo(String value) {
            addCriterion("exam_item_value_name <>", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameGreaterThan(String value) {
            addCriterion("exam_item_value_name >", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_name >=", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameLessThan(String value) {
            addCriterion("exam_item_value_name <", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_name <=", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameLike(String value) {
            addCriterion("exam_item_value_name like", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameNotLike(String value) {
            addCriterion("exam_item_value_name not like", value, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameIn(List<String> values) {
            addCriterion("exam_item_value_name in", values, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameNotIn(List<String> values) {
            addCriterion("exam_item_value_name not in", values, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameBetween(String value1, String value2) {
            addCriterion("exam_item_value_name between", value1, value2, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueNameNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_name not between", value1, value2, "examItemValueName");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeIsNull() {
            addCriterion("exam_item_value_code is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeIsNotNull() {
            addCriterion("exam_item_value_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeEqualTo(String value) {
            addCriterion("exam_item_value_code =", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeNotEqualTo(String value) {
            addCriterion("exam_item_value_code <>", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeGreaterThan(String value) {
            addCriterion("exam_item_value_code >", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_code >=", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeLessThan(String value) {
            addCriterion("exam_item_value_code <", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_code <=", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeLike(String value) {
            addCriterion("exam_item_value_code like", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeNotLike(String value) {
            addCriterion("exam_item_value_code not like", value, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeIn(List<String> values) {
            addCriterion("exam_item_value_code in", values, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeNotIn(List<String> values) {
            addCriterion("exam_item_value_code not in", values, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeBetween(String value1, String value2) {
            addCriterion("exam_item_value_code between", value1, value2, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCodeNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_code not between", value1, value2, "examItemValueCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeIsNull() {
            addCriterion("exam_item_value_input_code is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeIsNotNull() {
            addCriterion("exam_item_value_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeEqualTo(String value) {
            addCriterion("exam_item_value_input_code =", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeNotEqualTo(String value) {
            addCriterion("exam_item_value_input_code <>", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeGreaterThan(String value) {
            addCriterion("exam_item_value_input_code >", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_input_code >=", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeLessThan(String value) {
            addCriterion("exam_item_value_input_code <", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_input_code <=", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeLike(String value) {
            addCriterion("exam_item_value_input_code like", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeNotLike(String value) {
            addCriterion("exam_item_value_input_code not like", value, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeIn(List<String> values) {
            addCriterion("exam_item_value_input_code in", values, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeNotIn(List<String> values) {
            addCriterion("exam_item_value_input_code not in", values, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeBetween(String value1, String value2) {
            addCriterion("exam_item_value_input_code between", value1, value2, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueInputCodeNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_input_code not between", value1, value2, "examItemValueInputCode");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeIsNull() {
            addCriterion("exam_item_value_server_degree is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeIsNotNull() {
            addCriterion("exam_item_value_server_degree is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeEqualTo(Integer value) {
            addCriterion("exam_item_value_server_degree =", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotEqualTo(Integer value) {
            addCriterion("exam_item_value_server_degree <>", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeGreaterThan(Integer value) {
            addCriterion("exam_item_value_server_degree >", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_server_degree >=", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeLessThan(Integer value) {
            addCriterion("exam_item_value_server_degree <", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_server_degree <=", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeIn(List<Integer> values) {
            addCriterion("exam_item_value_server_degree in", values, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotIn(List<Integer> values) {
            addCriterion("exam_item_value_server_degree not in", values, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_server_degree between", value1, value2, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_server_degree not between", value1, value2, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreIsNull() {
            addCriterion("exam_item_value_askscore is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreIsNotNull() {
            addCriterion("exam_item_value_askscore is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreEqualTo(Integer value) {
            addCriterion("exam_item_value_askscore =", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreNotEqualTo(Integer value) {
            addCriterion("exam_item_value_askscore <>", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreGreaterThan(Integer value) {
            addCriterion("exam_item_value_askscore >", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_askscore >=", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreLessThan(Integer value) {
            addCriterion("exam_item_value_askscore <", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_askscore <=", value, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreIn(List<Integer> values) {
            addCriterion("exam_item_value_askscore in", values, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreNotIn(List<Integer> values) {
            addCriterion("exam_item_value_askscore not in", values, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_askscore between", value1, value2, "examItemValueAskscore");
            return (Criteria) this;
        }

        public Criteria andExamItemValueAskscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_askscore not between", value1, value2, "examItemValueAskscore");
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

        public Criteria andDictConclusionIdEqualTo(Long value) {
            addCriterion("dict_conclusion_id =", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotEqualTo(Long value) {
            addCriterion("dict_conclusion_id <>", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdGreaterThan(Long value) {
            addCriterion("dict_conclusion_id >", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_conclusion_id >=", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdLessThan(Long value) {
            addCriterion("dict_conclusion_id <", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_conclusion_id <=", value, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdIn(List<Long> values) {
            addCriterion("dict_conclusion_id in", values, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotIn(List<Long> values) {
            addCriterion("dict_conclusion_id not in", values, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdBetween(Long value1, Long value2) {
            addCriterion("dict_conclusion_id between", value1, value2, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andDictConclusionIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_conclusion_id not between", value1, value2, "dictConclusionId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperIsNull() {
            addCriterion("exam_item_value_oper is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperIsNotNull() {
            addCriterion("exam_item_value_oper is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperEqualTo(String value) {
            addCriterion("exam_item_value_oper =", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperNotEqualTo(String value) {
            addCriterion("exam_item_value_oper <>", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperGreaterThan(String value) {
            addCriterion("exam_item_value_oper >", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_oper >=", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperLessThan(String value) {
            addCriterion("exam_item_value_oper <", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_oper <=", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperLike(String value) {
            addCriterion("exam_item_value_oper like", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperNotLike(String value) {
            addCriterion("exam_item_value_oper not like", value, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperIn(List<String> values) {
            addCriterion("exam_item_value_oper in", values, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperNotIn(List<String> values) {
            addCriterion("exam_item_value_oper not in", values, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperBetween(String value1, String value2) {
            addCriterion("exam_item_value_oper between", value1, value2, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_oper not between", value1, value2, "examItemValueOper");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleIsNull() {
            addCriterion("exam_item_value_operand_male is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleIsNotNull() {
            addCriterion("exam_item_value_operand_male is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleEqualTo(Float value) {
            addCriterion("exam_item_value_operand_male =", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleNotEqualTo(Float value) {
            addCriterion("exam_item_value_operand_male <>", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleGreaterThan(Float value) {
            addCriterion("exam_item_value_operand_male >", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleGreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_value_operand_male >=", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleLessThan(Float value) {
            addCriterion("exam_item_value_operand_male <", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleLessThanOrEqualTo(Float value) {
            addCriterion("exam_item_value_operand_male <=", value, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleIn(List<Float> values) {
            addCriterion("exam_item_value_operand_male in", values, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleNotIn(List<Float> values) {
            addCriterion("exam_item_value_operand_male not in", values, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleBetween(Float value1, Float value2) {
            addCriterion("exam_item_value_operand_male between", value1, value2, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandMaleNotBetween(Float value1, Float value2) {
            addCriterion("exam_item_value_operand_male not between", value1, value2, "examItemValueOperandMale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleIsNull() {
            addCriterion("exam_item_value_operand_female is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleIsNotNull() {
            addCriterion("exam_item_value_operand_female is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleEqualTo(Float value) {
            addCriterion("exam_item_value_operand_female =", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleNotEqualTo(Float value) {
            addCriterion("exam_item_value_operand_female <>", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleGreaterThan(Float value) {
            addCriterion("exam_item_value_operand_female >", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleGreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_value_operand_female >=", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleLessThan(Float value) {
            addCriterion("exam_item_value_operand_female <", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleLessThanOrEqualTo(Float value) {
            addCriterion("exam_item_value_operand_female <=", value, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleIn(List<Float> values) {
            addCriterion("exam_item_value_operand_female in", values, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleNotIn(List<Float> values) {
            addCriterion("exam_item_value_operand_female not in", values, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleBetween(Float value1, Float value2) {
            addCriterion("exam_item_value_operand_female between", value1, value2, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueOperandFemaleNotBetween(Float value1, Float value2) {
            addCriterion("exam_item_value_operand_female not between", value1, value2, "examItemValueOperandFemale");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderIsNull() {
            addCriterion("exam_item_value_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderIsNotNull() {
            addCriterion("exam_item_value_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderEqualTo(Integer value) {
            addCriterion("exam_item_value_disp_order =", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderNotEqualTo(Integer value) {
            addCriterion("exam_item_value_disp_order <>", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderGreaterThan(Integer value) {
            addCriterion("exam_item_value_disp_order >", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_disp_order >=", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderLessThan(Integer value) {
            addCriterion("exam_item_value_disp_order <", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_disp_order <=", value, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderIn(List<Integer> values) {
            addCriterion("exam_item_value_disp_order in", values, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderNotIn(List<Integer> values) {
            addCriterion("exam_item_value_disp_order not in", values, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_disp_order between", value1, value2, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_disp_order not between", value1, value2, "examItemValueDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextIsNull() {
            addCriterion("exam_item_value_text is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextIsNotNull() {
            addCriterion("exam_item_value_text is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextEqualTo(String value) {
            addCriterion("exam_item_value_text =", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextNotEqualTo(String value) {
            addCriterion("exam_item_value_text <>", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextGreaterThan(String value) {
            addCriterion("exam_item_value_text >", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_text >=", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextLessThan(String value) {
            addCriterion("exam_item_value_text <", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_text <=", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextLike(String value) {
            addCriterion("exam_item_value_text like", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextNotLike(String value) {
            addCriterion("exam_item_value_text not like", value, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextIn(List<String> values) {
            addCriterion("exam_item_value_text in", values, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextNotIn(List<String> values) {
            addCriterion("exam_item_value_text not in", values, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextBetween(String value1, String value2) {
            addCriterion("exam_item_value_text between", value1, value2, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTextNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_text not between", value1, value2, "examItemValueText");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusIsNull() {
            addCriterion("exam_item_value_status is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusIsNotNull() {
            addCriterion("exam_item_value_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusEqualTo(Integer value) {
            addCriterion("exam_item_value_status =", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusNotEqualTo(Integer value) {
            addCriterion("exam_item_value_status <>", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusGreaterThan(Integer value) {
            addCriterion("exam_item_value_status >", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_status >=", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusLessThan(Integer value) {
            addCriterion("exam_item_value_status <", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_value_status <=", value, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusIn(List<Integer> values) {
            addCriterion("exam_item_value_status in", values, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusNotIn(List<Integer> values) {
            addCriterion("exam_item_value_status not in", values, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_status between", value1, value2, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_value_status not between", value1, value2, "examItemValueStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeIsNull() {
            addCriterion("exam_item_value_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeIsNotNull() {
            addCriterion("exam_item_value_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeEqualTo(Date value) {
            addCriterion("exam_item_value_create_time =", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_item_value_create_time <>", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeGreaterThan(Date value) {
            addCriterion("exam_item_value_create_time >", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_value_create_time >=", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeLessThan(Date value) {
            addCriterion("exam_item_value_create_time <", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_value_create_time <=", value, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeIn(List<Date> values) {
            addCriterion("exam_item_value_create_time in", values, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_item_value_create_time not in", values, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_value_create_time between", value1, value2, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_value_create_time not between", value1, value2, "examItemValueCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeIsNull() {
            addCriterion("exam_item_value_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeIsNotNull() {
            addCriterion("exam_item_value_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeEqualTo(Date value) {
            addCriterion("exam_item_value_edit_time =", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeNotEqualTo(Date value) {
            addCriterion("exam_item_value_edit_time <>", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeGreaterThan(Date value) {
            addCriterion("exam_item_value_edit_time >", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_value_edit_time >=", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeLessThan(Date value) {
            addCriterion("exam_item_value_edit_time <", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_value_edit_time <=", value, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeIn(List<Date> values) {
            addCriterion("exam_item_value_edit_time in", values, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeNotIn(List<Date> values) {
            addCriterion("exam_item_value_edit_time not in", values, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_value_edit_time between", value1, value2, "examItemValueEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemValueEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_value_edit_time not between", value1, value2, "examItemValueEditTime");
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