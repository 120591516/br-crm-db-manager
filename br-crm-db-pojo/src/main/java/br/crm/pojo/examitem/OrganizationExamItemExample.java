package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamItemExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamItemExample() {
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

        public Criteria andExamItemNameIsNull() {
            addCriterion("exam_item_name is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameIsNotNull() {
            addCriterion("exam_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEqualTo(String value) {
            addCriterion("exam_item_name =", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameNotEqualTo(String value) {
            addCriterion("exam_item_name <>", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameGreaterThan(String value) {
            addCriterion("exam_item_name >", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_name >=", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameLessThan(String value) {
            addCriterion("exam_item_name <", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameLessThanOrEqualTo(String value) {
            addCriterion("exam_item_name <=", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameLike(String value) {
            addCriterion("exam_item_name like", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameNotLike(String value) {
            addCriterion("exam_item_name not like", value, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameIn(List<String> values) {
            addCriterion("exam_item_name in", values, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameNotIn(List<String> values) {
            addCriterion("exam_item_name not in", values, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameBetween(String value1, String value2) {
            addCriterion("exam_item_name between", value1, value2, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameNotBetween(String value1, String value2) {
            addCriterion("exam_item_name not between", value1, value2, "examItemName");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrIsNull() {
            addCriterion("exam_item_name_abr is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrIsNotNull() {
            addCriterion("exam_item_name_abr is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrEqualTo(String value) {
            addCriterion("exam_item_name_abr =", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrNotEqualTo(String value) {
            addCriterion("exam_item_name_abr <>", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrGreaterThan(String value) {
            addCriterion("exam_item_name_abr >", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_name_abr >=", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrLessThan(String value) {
            addCriterion("exam_item_name_abr <", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrLessThanOrEqualTo(String value) {
            addCriterion("exam_item_name_abr <=", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrLike(String value) {
            addCriterion("exam_item_name_abr like", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrNotLike(String value) {
            addCriterion("exam_item_name_abr not like", value, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrIn(List<String> values) {
            addCriterion("exam_item_name_abr in", values, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrNotIn(List<String> values) {
            addCriterion("exam_item_name_abr not in", values, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrBetween(String value1, String value2) {
            addCriterion("exam_item_name_abr between", value1, value2, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameAbrNotBetween(String value1, String value2) {
            addCriterion("exam_item_name_abr not between", value1, value2, "examItemNameAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnIsNull() {
            addCriterion("exam_item_name_prn is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnIsNotNull() {
            addCriterion("exam_item_name_prn is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnEqualTo(String value) {
            addCriterion("exam_item_name_prn =", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnNotEqualTo(String value) {
            addCriterion("exam_item_name_prn <>", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnGreaterThan(String value) {
            addCriterion("exam_item_name_prn >", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_name_prn >=", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnLessThan(String value) {
            addCriterion("exam_item_name_prn <", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnLessThanOrEqualTo(String value) {
            addCriterion("exam_item_name_prn <=", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnLike(String value) {
            addCriterion("exam_item_name_prn like", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnNotLike(String value) {
            addCriterion("exam_item_name_prn not like", value, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnIn(List<String> values) {
            addCriterion("exam_item_name_prn in", values, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnNotIn(List<String> values) {
            addCriterion("exam_item_name_prn not in", values, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnBetween(String value1, String value2) {
            addCriterion("exam_item_name_prn between", value1, value2, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNamePrnNotBetween(String value1, String value2) {
            addCriterion("exam_item_name_prn not between", value1, value2, "examItemNamePrn");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngIsNull() {
            addCriterion("exam_item_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngIsNotNull() {
            addCriterion("exam_item_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngEqualTo(String value) {
            addCriterion("exam_item_name_eng =", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngNotEqualTo(String value) {
            addCriterion("exam_item_name_eng <>", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngGreaterThan(String value) {
            addCriterion("exam_item_name_eng >", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_name_eng >=", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngLessThan(String value) {
            addCriterion("exam_item_name_eng <", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngLessThanOrEqualTo(String value) {
            addCriterion("exam_item_name_eng <=", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngLike(String value) {
            addCriterion("exam_item_name_eng like", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngNotLike(String value) {
            addCriterion("exam_item_name_eng not like", value, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngIn(List<String> values) {
            addCriterion("exam_item_name_eng in", values, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngNotIn(List<String> values) {
            addCriterion("exam_item_name_eng not in", values, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngBetween(String value1, String value2) {
            addCriterion("exam_item_name_eng between", value1, value2, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngNotBetween(String value1, String value2) {
            addCriterion("exam_item_name_eng not between", value1, value2, "examItemNameEng");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrIsNull() {
            addCriterion("exam_item_name_eng_abr is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrIsNotNull() {
            addCriterion("exam_item_name_eng_abr is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrEqualTo(String value) {
            addCriterion("exam_item_name_eng_abr =", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrNotEqualTo(String value) {
            addCriterion("exam_item_name_eng_abr <>", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrGreaterThan(String value) {
            addCriterion("exam_item_name_eng_abr >", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_name_eng_abr >=", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrLessThan(String value) {
            addCriterion("exam_item_name_eng_abr <", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrLessThanOrEqualTo(String value) {
            addCriterion("exam_item_name_eng_abr <=", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrLike(String value) {
            addCriterion("exam_item_name_eng_abr like", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrNotLike(String value) {
            addCriterion("exam_item_name_eng_abr not like", value, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrIn(List<String> values) {
            addCriterion("exam_item_name_eng_abr in", values, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrNotIn(List<String> values) {
            addCriterion("exam_item_name_eng_abr not in", values, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrBetween(String value1, String value2) {
            addCriterion("exam_item_name_eng_abr between", value1, value2, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemNameEngAbrNotBetween(String value1, String value2) {
            addCriterion("exam_item_name_eng_abr not between", value1, value2, "examItemNameEngAbr");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeIsNull() {
            addCriterion("exam_item_code is null");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeIsNotNull() {
            addCriterion("exam_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeEqualTo(String value) {
            addCriterion("exam_item_code =", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeNotEqualTo(String value) {
            addCriterion("exam_item_code <>", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeGreaterThan(String value) {
            addCriterion("exam_item_code >", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_code >=", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeLessThan(String value) {
            addCriterion("exam_item_code <", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_item_code <=", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeLike(String value) {
            addCriterion("exam_item_code like", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeNotLike(String value) {
            addCriterion("exam_item_code not like", value, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeIn(List<String> values) {
            addCriterion("exam_item_code in", values, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeNotIn(List<String> values) {
            addCriterion("exam_item_code not in", values, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeBetween(String value1, String value2) {
            addCriterion("exam_item_code between", value1, value2, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemCodeNotBetween(String value1, String value2) {
            addCriterion("exam_item_code not between", value1, value2, "examItemCode");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdIsNull() {
            addCriterion("exam_item_type_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdIsNotNull() {
            addCriterion("exam_item_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdEqualTo(String value) {
            addCriterion("exam_item_type_id =", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdNotEqualTo(String value) {
            addCriterion("exam_item_type_id <>", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdGreaterThan(String value) {
            addCriterion("exam_item_type_id >", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_type_id >=", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdLessThan(String value) {
            addCriterion("exam_item_type_id <", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_type_id <=", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdLike(String value) {
            addCriterion("exam_item_type_id like", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdNotLike(String value) {
            addCriterion("exam_item_type_id not like", value, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdIn(List<String> values) {
            addCriterion("exam_item_type_id in", values, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdNotIn(List<String> values) {
            addCriterion("exam_item_type_id not in", values, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdBetween(String value1, String value2) {
            addCriterion("exam_item_type_id between", value1, value2, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemTypeIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_type_id not between", value1, value2, "examItemTypeId");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeIsNull() {
            addCriterion("exam_item_value_type is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeIsNotNull() {
            addCriterion("exam_item_value_type is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeEqualTo(String value) {
            addCriterion("exam_item_value_type =", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeNotEqualTo(String value) {
            addCriterion("exam_item_value_type <>", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeGreaterThan(String value) {
            addCriterion("exam_item_value_type >", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_type >=", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeLessThan(String value) {
            addCriterion("exam_item_value_type <", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_type <=", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeLike(String value) {
            addCriterion("exam_item_value_type like", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeNotLike(String value) {
            addCriterion("exam_item_value_type not like", value, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeIn(List<String> values) {
            addCriterion("exam_item_value_type in", values, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeNotIn(List<String> values) {
            addCriterion("exam_item_value_type not in", values, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeBetween(String value1, String value2) {
            addCriterion("exam_item_value_type between", value1, value2, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueTypeNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_type not between", value1, value2, "examItemValueType");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitIsNull() {
            addCriterion("exam_item_value_unit is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitIsNotNull() {
            addCriterion("exam_item_value_unit is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitEqualTo(String value) {
            addCriterion("exam_item_value_unit =", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitNotEqualTo(String value) {
            addCriterion("exam_item_value_unit <>", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitGreaterThan(String value) {
            addCriterion("exam_item_value_unit >", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_unit >=", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitLessThan(String value) {
            addCriterion("exam_item_value_unit <", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_unit <=", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitLike(String value) {
            addCriterion("exam_item_value_unit like", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitNotLike(String value) {
            addCriterion("exam_item_value_unit not like", value, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitIn(List<String> values) {
            addCriterion("exam_item_value_unit in", values, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitNotIn(List<String> values) {
            addCriterion("exam_item_value_unit not in", values, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitBetween(String value1, String value2) {
            addCriterion("exam_item_value_unit between", value1, value2, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemValueUnitNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_unit not between", value1, value2, "examItemValueUnit");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelIsNull() {
            addCriterion("exam_item_conclusion_level is null");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelIsNotNull() {
            addCriterion("exam_item_conclusion_level is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelEqualTo(Integer value) {
            addCriterion("exam_item_conclusion_level =", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelNotEqualTo(Integer value) {
            addCriterion("exam_item_conclusion_level <>", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelGreaterThan(Integer value) {
            addCriterion("exam_item_conclusion_level >", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_conclusion_level >=", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelLessThan(Integer value) {
            addCriterion("exam_item_conclusion_level <", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_conclusion_level <=", value, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelIn(List<Integer> values) {
            addCriterion("exam_item_conclusion_level in", values, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelNotIn(List<Integer> values) {
            addCriterion("exam_item_conclusion_level not in", values, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_conclusion_level between", value1, value2, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_conclusion_level not between", value1, value2, "examItemConclusionLevel");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleIsNull() {
            addCriterion("exam_item_conclusion_title is null");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleIsNotNull() {
            addCriterion("exam_item_conclusion_title is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleEqualTo(String value) {
            addCriterion("exam_item_conclusion_title =", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleNotEqualTo(String value) {
            addCriterion("exam_item_conclusion_title <>", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleGreaterThan(String value) {
            addCriterion("exam_item_conclusion_title >", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_conclusion_title >=", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleLessThan(String value) {
            addCriterion("exam_item_conclusion_title <", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleLessThanOrEqualTo(String value) {
            addCriterion("exam_item_conclusion_title <=", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleLike(String value) {
            addCriterion("exam_item_conclusion_title like", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleNotLike(String value) {
            addCriterion("exam_item_conclusion_title not like", value, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleIn(List<String> values) {
            addCriterion("exam_item_conclusion_title in", values, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleNotIn(List<String> values) {
            addCriterion("exam_item_conclusion_title not in", values, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleBetween(String value1, String value2) {
            addCriterion("exam_item_conclusion_title between", value1, value2, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemConclusionTitleNotBetween(String value1, String value2) {
            addCriterion("exam_item_conclusion_title not between", value1, value2, "examItemConclusionTitle");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementIsNull() {
            addCriterion("exam_item_increment is null");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementIsNotNull() {
            addCriterion("exam_item_increment is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementEqualTo(Float value) {
            addCriterion("exam_item_increment =", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementNotEqualTo(Float value) {
            addCriterion("exam_item_increment <>", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementGreaterThan(Float value) {
            addCriterion("exam_item_increment >", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementGreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_increment >=", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementLessThan(Float value) {
            addCriterion("exam_item_increment <", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementLessThanOrEqualTo(Float value) {
            addCriterion("exam_item_increment <=", value, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementIn(List<Float> values) {
            addCriterion("exam_item_increment in", values, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementNotIn(List<Float> values) {
            addCriterion("exam_item_increment not in", values, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementBetween(Float value1, Float value2) {
            addCriterion("exam_item_increment between", value1, value2, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemIncrementNotBetween(Float value1, Float value2) {
            addCriterion("exam_item_increment not between", value1, value2, "examItemIncrement");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionIsNull() {
            addCriterion("exam_item_num_precision is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionIsNotNull() {
            addCriterion("exam_item_num_precision is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionEqualTo(Integer value) {
            addCriterion("exam_item_num_precision =", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionNotEqualTo(Integer value) {
            addCriterion("exam_item_num_precision <>", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionGreaterThan(Integer value) {
            addCriterion("exam_item_num_precision >", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_num_precision >=", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionLessThan(Integer value) {
            addCriterion("exam_item_num_precision <", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_num_precision <=", value, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionIn(List<Integer> values) {
            addCriterion("exam_item_num_precision in", values, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionNotIn(List<Integer> values) {
            addCriterion("exam_item_num_precision not in", values, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_num_precision between", value1, value2, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andExamItemNumPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_num_precision not between", value1, value2, "examItemNumPrecision");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinIsNull() {
            addCriterion("f_use_app_max_min is null");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinIsNotNull() {
            addCriterion("f_use_app_max_min is not null");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinEqualTo(Integer value) {
            addCriterion("f_use_app_max_min =", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinNotEqualTo(Integer value) {
            addCriterion("f_use_app_max_min <>", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinGreaterThan(Integer value) {
            addCriterion("f_use_app_max_min >", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_use_app_max_min >=", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinLessThan(Integer value) {
            addCriterion("f_use_app_max_min <", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinLessThanOrEqualTo(Integer value) {
            addCriterion("f_use_app_max_min <=", value, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinIn(List<Integer> values) {
            addCriterion("f_use_app_max_min in", values, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinNotIn(List<Integer> values) {
            addCriterion("f_use_app_max_min not in", values, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinBetween(Integer value1, Integer value2) {
            addCriterion("f_use_app_max_min between", value1, value2, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFUseAppMaxMinNotBetween(Integer value1, Integer value2) {
            addCriterion("f_use_app_max_min not between", value1, value2, "fUseAppMaxMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinIsNull() {
            addCriterion("f_include_min is null");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinIsNotNull() {
            addCriterion("f_include_min is not null");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinEqualTo(Integer value) {
            addCriterion("f_include_min =", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinNotEqualTo(Integer value) {
            addCriterion("f_include_min <>", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinGreaterThan(Integer value) {
            addCriterion("f_include_min >", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_include_min >=", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinLessThan(Integer value) {
            addCriterion("f_include_min <", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinLessThanOrEqualTo(Integer value) {
            addCriterion("f_include_min <=", value, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinIn(List<Integer> values) {
            addCriterion("f_include_min in", values, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinNotIn(List<Integer> values) {
            addCriterion("f_include_min not in", values, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinBetween(Integer value1, Integer value2) {
            addCriterion("f_include_min between", value1, value2, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMinNotBetween(Integer value1, Integer value2) {
            addCriterion("f_include_min not between", value1, value2, "fIncludeMin");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxIsNull() {
            addCriterion("f_include_max is null");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxIsNotNull() {
            addCriterion("f_include_max is not null");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxEqualTo(Integer value) {
            addCriterion("f_include_max =", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxNotEqualTo(Integer value) {
            addCriterion("f_include_max <>", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxGreaterThan(Integer value) {
            addCriterion("f_include_max >", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_include_max >=", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxLessThan(Integer value) {
            addCriterion("f_include_max <", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxLessThanOrEqualTo(Integer value) {
            addCriterion("f_include_max <=", value, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxIn(List<Integer> values) {
            addCriterion("f_include_max in", values, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxNotIn(List<Integer> values) {
            addCriterion("f_include_max not in", values, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxBetween(Integer value1, Integer value2) {
            addCriterion("f_include_max between", value1, value2, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFIncludeMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("f_include_max not between", value1, value2, "fIncludeMax");
            return (Criteria) this;
        }

        public Criteria andFMaleIsNull() {
            addCriterion("f_male is null");
            return (Criteria) this;
        }

        public Criteria andFMaleIsNotNull() {
            addCriterion("f_male is not null");
            return (Criteria) this;
        }

        public Criteria andFMaleEqualTo(Integer value) {
            addCriterion("f_male =", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotEqualTo(Integer value) {
            addCriterion("f_male <>", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleGreaterThan(Integer value) {
            addCriterion("f_male >", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_male >=", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleLessThan(Integer value) {
            addCriterion("f_male <", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleLessThanOrEqualTo(Integer value) {
            addCriterion("f_male <=", value, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleIn(List<Integer> values) {
            addCriterion("f_male in", values, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotIn(List<Integer> values) {
            addCriterion("f_male not in", values, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleBetween(Integer value1, Integer value2) {
            addCriterion("f_male between", value1, value2, "fMale");
            return (Criteria) this;
        }

        public Criteria andFMaleNotBetween(Integer value1, Integer value2) {
            addCriterion("f_male not between", value1, value2, "fMale");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefIsNull() {
            addCriterion("male_value_def is null");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefIsNotNull() {
            addCriterion("male_value_def is not null");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefEqualTo(String value) {
            addCriterion("male_value_def =", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefNotEqualTo(String value) {
            addCriterion("male_value_def <>", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefGreaterThan(String value) {
            addCriterion("male_value_def >", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefGreaterThanOrEqualTo(String value) {
            addCriterion("male_value_def >=", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefLessThan(String value) {
            addCriterion("male_value_def <", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefLessThanOrEqualTo(String value) {
            addCriterion("male_value_def <=", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefLike(String value) {
            addCriterion("male_value_def like", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefNotLike(String value) {
            addCriterion("male_value_def not like", value, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefIn(List<String> values) {
            addCriterion("male_value_def in", values, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefNotIn(List<String> values) {
            addCriterion("male_value_def not in", values, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefBetween(String value1, String value2) {
            addCriterion("male_value_def between", value1, value2, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueDefNotBetween(String value1, String value2) {
            addCriterion("male_value_def not between", value1, value2, "maleValueDef");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinIsNull() {
            addCriterion("male_value_min is null");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinIsNotNull() {
            addCriterion("male_value_min is not null");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinEqualTo(Float value) {
            addCriterion("male_value_min =", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinNotEqualTo(Float value) {
            addCriterion("male_value_min <>", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinGreaterThan(Float value) {
            addCriterion("male_value_min >", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinGreaterThanOrEqualTo(Float value) {
            addCriterion("male_value_min >=", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinLessThan(Float value) {
            addCriterion("male_value_min <", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinLessThanOrEqualTo(Float value) {
            addCriterion("male_value_min <=", value, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinIn(List<Float> values) {
            addCriterion("male_value_min in", values, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinNotIn(List<Float> values) {
            addCriterion("male_value_min not in", values, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinBetween(Float value1, Float value2) {
            addCriterion("male_value_min between", value1, value2, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMinNotBetween(Float value1, Float value2) {
            addCriterion("male_value_min not between", value1, value2, "maleValueMin");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxIsNull() {
            addCriterion("male_value_max is null");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxIsNotNull() {
            addCriterion("male_value_max is not null");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxEqualTo(Float value) {
            addCriterion("male_value_max =", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxNotEqualTo(Float value) {
            addCriterion("male_value_max <>", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxGreaterThan(Float value) {
            addCriterion("male_value_max >", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("male_value_max >=", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxLessThan(Float value) {
            addCriterion("male_value_max <", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxLessThanOrEqualTo(Float value) {
            addCriterion("male_value_max <=", value, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxIn(List<Float> values) {
            addCriterion("male_value_max in", values, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxNotIn(List<Float> values) {
            addCriterion("male_value_max not in", values, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxBetween(Float value1, Float value2) {
            addCriterion("male_value_max between", value1, value2, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueMaxNotBetween(Float value1, Float value2) {
            addCriterion("male_value_max not between", value1, value2, "maleValueMax");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpIsNull() {
            addCriterion("male_value_sever_up is null");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpIsNotNull() {
            addCriterion("male_value_sever_up is not null");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpEqualTo(Float value) {
            addCriterion("male_value_sever_up =", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpNotEqualTo(Float value) {
            addCriterion("male_value_sever_up <>", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpGreaterThan(Float value) {
            addCriterion("male_value_sever_up >", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpGreaterThanOrEqualTo(Float value) {
            addCriterion("male_value_sever_up >=", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpLessThan(Float value) {
            addCriterion("male_value_sever_up <", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpLessThanOrEqualTo(Float value) {
            addCriterion("male_value_sever_up <=", value, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpIn(List<Float> values) {
            addCriterion("male_value_sever_up in", values, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpNotIn(List<Float> values) {
            addCriterion("male_value_sever_up not in", values, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpBetween(Float value1, Float value2) {
            addCriterion("male_value_sever_up between", value1, value2, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueSeverUpNotBetween(Float value1, Float value2) {
            addCriterion("male_value_sever_up not between", value1, value2, "maleValueSeverUp");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownIsNull() {
            addCriterion("male_value_server_down is null");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownIsNotNull() {
            addCriterion("male_value_server_down is not null");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownEqualTo(Float value) {
            addCriterion("male_value_server_down =", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownNotEqualTo(Float value) {
            addCriterion("male_value_server_down <>", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownGreaterThan(Float value) {
            addCriterion("male_value_server_down >", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownGreaterThanOrEqualTo(Float value) {
            addCriterion("male_value_server_down >=", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownLessThan(Float value) {
            addCriterion("male_value_server_down <", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownLessThanOrEqualTo(Float value) {
            addCriterion("male_value_server_down <=", value, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownIn(List<Float> values) {
            addCriterion("male_value_server_down in", values, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownNotIn(List<Float> values) {
            addCriterion("male_value_server_down not in", values, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownBetween(Float value1, Float value2) {
            addCriterion("male_value_server_down between", value1, value2, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andMaleValueServerDownNotBetween(Float value1, Float value2) {
            addCriterion("male_value_server_down not between", value1, value2, "maleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFFemaleIsNull() {
            addCriterion("f_female is null");
            return (Criteria) this;
        }

        public Criteria andFFemaleIsNotNull() {
            addCriterion("f_female is not null");
            return (Criteria) this;
        }

        public Criteria andFFemaleEqualTo(Integer value) {
            addCriterion("f_female =", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotEqualTo(Integer value) {
            addCriterion("f_female <>", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleGreaterThan(Integer value) {
            addCriterion("f_female >", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_female >=", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleLessThan(Integer value) {
            addCriterion("f_female <", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleLessThanOrEqualTo(Integer value) {
            addCriterion("f_female <=", value, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleIn(List<Integer> values) {
            addCriterion("f_female in", values, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotIn(List<Integer> values) {
            addCriterion("f_female not in", values, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleBetween(Integer value1, Integer value2) {
            addCriterion("f_female between", value1, value2, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFFemaleNotBetween(Integer value1, Integer value2) {
            addCriterion("f_female not between", value1, value2, "fFemale");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefIsNull() {
            addCriterion("female_value_def is null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefIsNotNull() {
            addCriterion("female_value_def is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefEqualTo(String value) {
            addCriterion("female_value_def =", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefNotEqualTo(String value) {
            addCriterion("female_value_def <>", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefGreaterThan(String value) {
            addCriterion("female_value_def >", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefGreaterThanOrEqualTo(String value) {
            addCriterion("female_value_def >=", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefLessThan(String value) {
            addCriterion("female_value_def <", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefLessThanOrEqualTo(String value) {
            addCriterion("female_value_def <=", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefLike(String value) {
            addCriterion("female_value_def like", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefNotLike(String value) {
            addCriterion("female_value_def not like", value, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefIn(List<String> values) {
            addCriterion("female_value_def in", values, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefNotIn(List<String> values) {
            addCriterion("female_value_def not in", values, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefBetween(String value1, String value2) {
            addCriterion("female_value_def between", value1, value2, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueDefNotBetween(String value1, String value2) {
            addCriterion("female_value_def not between", value1, value2, "femaleValueDef");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinIsNull() {
            addCriterion("female_value_min is null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinIsNotNull() {
            addCriterion("female_value_min is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinEqualTo(Float value) {
            addCriterion("female_value_min =", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinNotEqualTo(Float value) {
            addCriterion("female_value_min <>", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinGreaterThan(Float value) {
            addCriterion("female_value_min >", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinGreaterThanOrEqualTo(Float value) {
            addCriterion("female_value_min >=", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinLessThan(Float value) {
            addCriterion("female_value_min <", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinLessThanOrEqualTo(Float value) {
            addCriterion("female_value_min <=", value, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinIn(List<Float> values) {
            addCriterion("female_value_min in", values, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinNotIn(List<Float> values) {
            addCriterion("female_value_min not in", values, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinBetween(Float value1, Float value2) {
            addCriterion("female_value_min between", value1, value2, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMinNotBetween(Float value1, Float value2) {
            addCriterion("female_value_min not between", value1, value2, "femaleValueMin");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxIsNull() {
            addCriterion("female_value_max is null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxIsNotNull() {
            addCriterion("female_value_max is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxEqualTo(Float value) {
            addCriterion("female_value_max =", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxNotEqualTo(Float value) {
            addCriterion("female_value_max <>", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxGreaterThan(Float value) {
            addCriterion("female_value_max >", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("female_value_max >=", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxLessThan(Float value) {
            addCriterion("female_value_max <", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxLessThanOrEqualTo(Float value) {
            addCriterion("female_value_max <=", value, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxIn(List<Float> values) {
            addCriterion("female_value_max in", values, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxNotIn(List<Float> values) {
            addCriterion("female_value_max not in", values, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxBetween(Float value1, Float value2) {
            addCriterion("female_value_max between", value1, value2, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueMaxNotBetween(Float value1, Float value2) {
            addCriterion("female_value_max not between", value1, value2, "femaleValueMax");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpIsNull() {
            addCriterion("female_value_server_up is null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpIsNotNull() {
            addCriterion("female_value_server_up is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpEqualTo(Float value) {
            addCriterion("female_value_server_up =", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpNotEqualTo(Float value) {
            addCriterion("female_value_server_up <>", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpGreaterThan(Float value) {
            addCriterion("female_value_server_up >", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpGreaterThanOrEqualTo(Float value) {
            addCriterion("female_value_server_up >=", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpLessThan(Float value) {
            addCriterion("female_value_server_up <", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpLessThanOrEqualTo(Float value) {
            addCriterion("female_value_server_up <=", value, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpIn(List<Float> values) {
            addCriterion("female_value_server_up in", values, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpNotIn(List<Float> values) {
            addCriterion("female_value_server_up not in", values, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpBetween(Float value1, Float value2) {
            addCriterion("female_value_server_up between", value1, value2, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerUpNotBetween(Float value1, Float value2) {
            addCriterion("female_value_server_up not between", value1, value2, "femaleValueServerUp");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownIsNull() {
            addCriterion("female_value_server_down is null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownIsNotNull() {
            addCriterion("female_value_server_down is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownEqualTo(Float value) {
            addCriterion("female_value_server_down =", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownNotEqualTo(Float value) {
            addCriterion("female_value_server_down <>", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownGreaterThan(Float value) {
            addCriterion("female_value_server_down >", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownGreaterThanOrEqualTo(Float value) {
            addCriterion("female_value_server_down >=", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownLessThan(Float value) {
            addCriterion("female_value_server_down <", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownLessThanOrEqualTo(Float value) {
            addCriterion("female_value_server_down <=", value, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownIn(List<Float> values) {
            addCriterion("female_value_server_down in", values, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownNotIn(List<Float> values) {
            addCriterion("female_value_server_down not in", values, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownBetween(Float value1, Float value2) {
            addCriterion("female_value_server_down between", value1, value2, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andFemaleValueServerDownNotBetween(Float value1, Float value2) {
            addCriterion("female_value_server_down not between", value1, value2, "femaleValueServerDown");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteIsNull() {
            addCriterion("exam_item_note is null");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteIsNotNull() {
            addCriterion("exam_item_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteEqualTo(String value) {
            addCriterion("exam_item_note =", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteNotEqualTo(String value) {
            addCriterion("exam_item_note <>", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteGreaterThan(String value) {
            addCriterion("exam_item_note >", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_note >=", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteLessThan(String value) {
            addCriterion("exam_item_note <", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_item_note <=", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteLike(String value) {
            addCriterion("exam_item_note like", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteNotLike(String value) {
            addCriterion("exam_item_note not like", value, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteIn(List<String> values) {
            addCriterion("exam_item_note in", values, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteNotIn(List<String> values) {
            addCriterion("exam_item_note not in", values, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteBetween(String value1, String value2) {
            addCriterion("exam_item_note between", value1, value2, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemNoteNotBetween(String value1, String value2) {
            addCriterion("exam_item_note not between", value1, value2, "examItemNote");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderIsNull() {
            addCriterion("exam_item_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderIsNotNull() {
            addCriterion("exam_item_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderEqualTo(Integer value) {
            addCriterion("exam_item_disp_order =", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderNotEqualTo(Integer value) {
            addCriterion("exam_item_disp_order <>", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderGreaterThan(Integer value) {
            addCriterion("exam_item_disp_order >", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_disp_order >=", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderLessThan(Integer value) {
            addCriterion("exam_item_disp_order <", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_disp_order <=", value, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderIn(List<Integer> values) {
            addCriterion("exam_item_disp_order in", values, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderNotIn(List<Integer> values) {
            addCriterion("exam_item_disp_order not in", values, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_disp_order between", value1, value2, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_disp_order not between", value1, value2, "examItemDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatIsNull() {
            addCriterion("exam_item_create_plat is null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatIsNotNull() {
            addCriterion("exam_item_create_plat is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatEqualTo(Integer value) {
            addCriterion("exam_item_create_plat =", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatNotEqualTo(Integer value) {
            addCriterion("exam_item_create_plat <>", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatGreaterThan(Integer value) {
            addCriterion("exam_item_create_plat >", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_create_plat >=", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatLessThan(Integer value) {
            addCriterion("exam_item_create_plat <", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_create_plat <=", value, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatIn(List<Integer> values) {
            addCriterion("exam_item_create_plat in", values, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatNotIn(List<Integer> values) {
            addCriterion("exam_item_create_plat not in", values, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_create_plat between", value1, value2, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreatePlatNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_create_plat not between", value1, value2, "examItemCreatePlat");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdIsNull() {
            addCriterion("exam_item_creater_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdIsNotNull() {
            addCriterion("exam_item_creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdEqualTo(String value) {
            addCriterion("exam_item_creater_id =", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdNotEqualTo(String value) {
            addCriterion("exam_item_creater_id <>", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdGreaterThan(String value) {
            addCriterion("exam_item_creater_id >", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_creater_id >=", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdLessThan(String value) {
            addCriterion("exam_item_creater_id <", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_creater_id <=", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdLike(String value) {
            addCriterion("exam_item_creater_id like", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdNotLike(String value) {
            addCriterion("exam_item_creater_id not like", value, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdIn(List<String> values) {
            addCriterion("exam_item_creater_id in", values, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdNotIn(List<String> values) {
            addCriterion("exam_item_creater_id not in", values, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdBetween(String value1, String value2) {
            addCriterion("exam_item_creater_id between", value1, value2, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemCreaterIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_creater_id not between", value1, value2, "examItemCreaterId");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusIsNull() {
            addCriterion("exam_item_status is null");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusIsNotNull() {
            addCriterion("exam_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusEqualTo(Integer value) {
            addCriterion("exam_item_status =", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusNotEqualTo(Integer value) {
            addCriterion("exam_item_status <>", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusGreaterThan(Integer value) {
            addCriterion("exam_item_status >", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_item_status >=", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusLessThan(Integer value) {
            addCriterion("exam_item_status <", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_item_status <=", value, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusIn(List<Integer> values) {
            addCriterion("exam_item_status in", values, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusNotIn(List<Integer> values) {
            addCriterion("exam_item_status not in", values, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_status between", value1, value2, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_item_status not between", value1, value2, "examItemStatus");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeIsNull() {
            addCriterion("exam_item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeIsNotNull() {
            addCriterion("exam_item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeEqualTo(Date value) {
            addCriterion("exam_item_create_time =", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_item_create_time <>", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeGreaterThan(Date value) {
            addCriterion("exam_item_create_time >", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_create_time >=", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeLessThan(Date value) {
            addCriterion("exam_item_create_time <", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_create_time <=", value, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeIn(List<Date> values) {
            addCriterion("exam_item_create_time in", values, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_item_create_time not in", values, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_create_time between", value1, value2, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_create_time not between", value1, value2, "examItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeIsNull() {
            addCriterion("exam_item_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeIsNotNull() {
            addCriterion("exam_item_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeEqualTo(Date value) {
            addCriterion("exam_item_edit_time =", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeNotEqualTo(Date value) {
            addCriterion("exam_item_edit_time <>", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeGreaterThan(Date value) {
            addCriterion("exam_item_edit_time >", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_item_edit_time >=", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeLessThan(Date value) {
            addCriterion("exam_item_edit_time <", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_item_edit_time <=", value, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeIn(List<Date> values) {
            addCriterion("exam_item_edit_time in", values, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeNotIn(List<Date> values) {
            addCriterion("exam_item_edit_time not in", values, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_item_edit_time between", value1, value2, "examItemEditTime");
            return (Criteria) this;
        }

        public Criteria andExamItemEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_item_edit_time not between", value1, value2, "examItemEditTime");
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