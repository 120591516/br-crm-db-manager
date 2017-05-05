package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExamItemExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExamItemExample() {
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

        public Criteria andPatientExamDepartIdIsNull() {
            addCriterion("patient_exam_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdIsNotNull() {
            addCriterion("patient_exam_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdEqualTo(String value) {
            addCriterion("patient_exam_depart_id =", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotEqualTo(String value) {
            addCriterion("patient_exam_depart_id <>", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdGreaterThan(String value) {
            addCriterion("patient_exam_depart_id >", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_depart_id >=", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLessThan(String value) {
            addCriterion("patient_exam_depart_id <", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_depart_id <=", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLike(String value) {
            addCriterion("patient_exam_depart_id like", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotLike(String value) {
            addCriterion("patient_exam_depart_id not like", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdIn(List<String> values) {
            addCriterion("patient_exam_depart_id in", values, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotIn(List<String> values) {
            addCriterion("patient_exam_depart_id not in", values, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdBetween(String value1, String value2) {
            addCriterion("patient_exam_depart_id between", value1, value2, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_depart_id not between", value1, value2, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdIsNull() {
            addCriterion("patient_fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdIsNotNull() {
            addCriterion("patient_fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdEqualTo(String value) {
            addCriterion("patient_fee_item_id =", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdNotEqualTo(String value) {
            addCriterion("patient_fee_item_id <>", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdGreaterThan(String value) {
            addCriterion("patient_fee_item_id >", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_id >=", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdLessThan(String value) {
            addCriterion("patient_fee_item_id <", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_id <=", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdLike(String value) {
            addCriterion("patient_fee_item_id like", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdNotLike(String value) {
            addCriterion("patient_fee_item_id not like", value, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdIn(List<String> values) {
            addCriterion("patient_fee_item_id in", values, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdNotIn(List<String> values) {
            addCriterion("patient_fee_item_id not in", values, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdBetween(String value1, String value2) {
            addCriterion("patient_fee_item_id between", value1, value2, "patientFeeItemId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_id not between", value1, value2, "patientFeeItemId");
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

        public Criteria andBodyPartIdIsNull() {
            addCriterion("body_part_id is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIsNotNull() {
            addCriterion("body_part_id is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdEqualTo(Integer value) {
            addCriterion("body_part_id =", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotEqualTo(Integer value) {
            addCriterion("body_part_id <>", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThan(Integer value) {
            addCriterion("body_part_id >", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("body_part_id >=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThan(Integer value) {
            addCriterion("body_part_id <", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("body_part_id <=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIn(List<Integer> values) {
            addCriterion("body_part_id in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotIn(List<Integer> values) {
            addCriterion("body_part_id not in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdBetween(Integer value1, Integer value2) {
            addCriterion("body_part_id between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("body_part_id not between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIsNull() {
            addCriterion("body_part_name is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIsNotNull() {
            addCriterion("body_part_name is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameEqualTo(String value) {
            addCriterion("body_part_name =", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotEqualTo(String value) {
            addCriterion("body_part_name <>", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameGreaterThan(String value) {
            addCriterion("body_part_name >", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("body_part_name >=", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLessThan(String value) {
            addCriterion("body_part_name <", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLessThanOrEqualTo(String value) {
            addCriterion("body_part_name <=", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLike(String value) {
            addCriterion("body_part_name like", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotLike(String value) {
            addCriterion("body_part_name not like", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIn(List<String> values) {
            addCriterion("body_part_name in", values, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotIn(List<String> values) {
            addCriterion("body_part_name not in", values, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameBetween(String value1, String value2) {
            addCriterion("body_part_name between", value1, value2, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotBetween(String value1, String value2) {
            addCriterion("body_part_name not between", value1, value2, "bodyPartName");
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

        public Criteria andSevereDegreeIdIsNull() {
            addCriterion("severe_degree_id is null");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdIsNotNull() {
            addCriterion("severe_degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdEqualTo(Integer value) {
            addCriterion("severe_degree_id =", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotEqualTo(Integer value) {
            addCriterion("severe_degree_id <>", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdGreaterThan(Integer value) {
            addCriterion("severe_degree_id >", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("severe_degree_id >=", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdLessThan(Integer value) {
            addCriterion("severe_degree_id <", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("severe_degree_id <=", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdIn(List<Integer> values) {
            addCriterion("severe_degree_id in", values, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotIn(List<Integer> values) {
            addCriterion("severe_degree_id not in", values, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdBetween(Integer value1, Integer value2) {
            addCriterion("severe_degree_id between", value1, value2, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("severe_degree_id not between", value1, value2, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeIsNull() {
            addCriterion("patient_exam_item_ref_range is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeIsNotNull() {
            addCriterion("patient_exam_item_ref_range is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeEqualTo(String value) {
            addCriterion("patient_exam_item_ref_range =", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeNotEqualTo(String value) {
            addCriterion("patient_exam_item_ref_range <>", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeGreaterThan(String value) {
            addCriterion("patient_exam_item_ref_range >", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_ref_range >=", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeLessThan(String value) {
            addCriterion("patient_exam_item_ref_range <", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_ref_range <=", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeLike(String value) {
            addCriterion("patient_exam_item_ref_range like", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeNotLike(String value) {
            addCriterion("patient_exam_item_ref_range not like", value, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeIn(List<String> values) {
            addCriterion("patient_exam_item_ref_range in", values, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeNotIn(List<String> values) {
            addCriterion("patient_exam_item_ref_range not in", values, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeBetween(String value1, String value2) {
            addCriterion("patient_exam_item_ref_range between", value1, value2, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemRefRangeNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_ref_range not between", value1, value2, "patientExamItemRefRange");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortIsNull() {
            addCriterion("exam_item_values_short is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortIsNotNull() {
            addCriterion("exam_item_values_short is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortEqualTo(String value) {
            addCriterion("exam_item_values_short =", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortNotEqualTo(String value) {
            addCriterion("exam_item_values_short <>", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortGreaterThan(String value) {
            addCriterion("exam_item_values_short >", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_values_short >=", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortLessThan(String value) {
            addCriterion("exam_item_values_short <", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortLessThanOrEqualTo(String value) {
            addCriterion("exam_item_values_short <=", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortLike(String value) {
            addCriterion("exam_item_values_short like", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortNotLike(String value) {
            addCriterion("exam_item_values_short not like", value, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortIn(List<String> values) {
            addCriterion("exam_item_values_short in", values, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortNotIn(List<String> values) {
            addCriterion("exam_item_values_short not in", values, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortBetween(String value1, String value2) {
            addCriterion("exam_item_values_short between", value1, value2, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesShortNotBetween(String value1, String value2) {
            addCriterion("exam_item_values_short not between", value1, value2, "examItemValuesShort");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberIsNull() {
            addCriterion("exam_item_values_number is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberIsNotNull() {
            addCriterion("exam_item_values_number is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberEqualTo(Float value) {
            addCriterion("exam_item_values_number =", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberNotEqualTo(Float value) {
            addCriterion("exam_item_values_number <>", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberGreaterThan(Float value) {
            addCriterion("exam_item_values_number >", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number >=", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberLessThan(Float value) {
            addCriterion("exam_item_values_number <", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberLessThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number <=", value, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberIn(List<Float> values) {
            addCriterion("exam_item_values_number in", values, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberNotIn(List<Float> values) {
            addCriterion("exam_item_values_number not in", values, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberBetween(Float value1, Float value2) {
            addCriterion("exam_item_values_number between", value1, value2, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumberNotBetween(Float value1, Float value2) {
            addCriterion("exam_item_values_number not between", value1, value2, "examItemValuesNumber");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagIsNull() {
            addCriterion("patient_exam_item_labItem_flag is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagIsNotNull() {
            addCriterion("patient_exam_item_labItem_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagEqualTo(String value) {
            addCriterion("patient_exam_item_labItem_flag =", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagNotEqualTo(String value) {
            addCriterion("patient_exam_item_labItem_flag <>", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagGreaterThan(String value) {
            addCriterion("patient_exam_item_labItem_flag >", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_labItem_flag >=", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagLessThan(String value) {
            addCriterion("patient_exam_item_labItem_flag <", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_labItem_flag <=", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagLike(String value) {
            addCriterion("patient_exam_item_labItem_flag like", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagNotLike(String value) {
            addCriterion("patient_exam_item_labItem_flag not like", value, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagIn(List<String> values) {
            addCriterion("patient_exam_item_labItem_flag in", values, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagNotIn(List<String> values) {
            addCriterion("patient_exam_item_labItem_flag not in", values, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagBetween(String value1, String value2) {
            addCriterion("patient_exam_item_labItem_flag between", value1, value2, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemFlagNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_labItem_flag not between", value1, value2, "patientExamItemLabitemFlag");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalIsNull() {
            addCriterion("patient_exam_item_labItem_normal is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalIsNotNull() {
            addCriterion("patient_exam_item_labItem_normal is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalEqualTo(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal =", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalNotEqualTo(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal <>", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalGreaterThan(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal >", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal >=", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalLessThan(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal <", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_exam_item_labItem_normal <=", value, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalIn(List<Boolean> values) {
            addCriterion("patient_exam_item_labItem_normal in", values, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalNotIn(List<Boolean> values) {
            addCriterion("patient_exam_item_labItem_normal not in", values, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_exam_item_labItem_normal between", value1, value2, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemLabitemNormalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_exam_item_labItem_normal not between", value1, value2, "patientExamItemLabitemNormal");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2IsNull() {
            addCriterion("exam_item_values_number2 is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2IsNotNull() {
            addCriterion("exam_item_values_number2 is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2EqualTo(Float value) {
            addCriterion("exam_item_values_number2 =", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2NotEqualTo(Float value) {
            addCriterion("exam_item_values_number2 <>", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2GreaterThan(Float value) {
            addCriterion("exam_item_values_number2 >", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2GreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number2 >=", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2LessThan(Float value) {
            addCriterion("exam_item_values_number2 <", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2LessThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number2 <=", value, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2In(List<Float> values) {
            addCriterion("exam_item_values_number2 in", values, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2NotIn(List<Float> values) {
            addCriterion("exam_item_values_number2 not in", values, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2Between(Float value1, Float value2) {
            addCriterion("exam_item_values_number2 between", value1, value2, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber2NotBetween(Float value1, Float value2) {
            addCriterion("exam_item_values_number2 not between", value1, value2, "examItemValuesNumber2");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3IsNull() {
            addCriterion("exam_item_values_number3 is null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3IsNotNull() {
            addCriterion("exam_item_values_number3 is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3EqualTo(Float value) {
            addCriterion("exam_item_values_number3 =", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3NotEqualTo(Float value) {
            addCriterion("exam_item_values_number3 <>", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3GreaterThan(Float value) {
            addCriterion("exam_item_values_number3 >", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3GreaterThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number3 >=", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3LessThan(Float value) {
            addCriterion("exam_item_values_number3 <", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3LessThanOrEqualTo(Float value) {
            addCriterion("exam_item_values_number3 <=", value, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3In(List<Float> values) {
            addCriterion("exam_item_values_number3 in", values, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3NotIn(List<Float> values) {
            addCriterion("exam_item_values_number3 not in", values, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3Between(Float value1, Float value2) {
            addCriterion("exam_item_values_number3 between", value1, value2, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andExamItemValuesNumber3NotBetween(Float value1, Float value2) {
            addCriterion("exam_item_values_number3 not between", value1, value2, "examItemValuesNumber3");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderIsNull() {
            addCriterion("patient_exam_item_order is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderIsNotNull() {
            addCriterion("patient_exam_item_order is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderEqualTo(String value) {
            addCriterion("patient_exam_item_order =", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderNotEqualTo(String value) {
            addCriterion("patient_exam_item_order <>", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderGreaterThan(String value) {
            addCriterion("patient_exam_item_order >", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_order >=", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderLessThan(String value) {
            addCriterion("patient_exam_item_order <", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_order <=", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderLike(String value) {
            addCriterion("patient_exam_item_order like", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderNotLike(String value) {
            addCriterion("patient_exam_item_order not like", value, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderIn(List<String> values) {
            addCriterion("patient_exam_item_order in", values, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderNotIn(List<String> values) {
            addCriterion("patient_exam_item_order not in", values, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderBetween(String value1, String value2) {
            addCriterion("patient_exam_item_order between", value1, value2, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemOrderNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_order not between", value1, value2, "patientExamItemOrder");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeIsNull() {
            addCriterion("patient_exam_item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeIsNotNull() {
            addCriterion("patient_exam_item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_create_time =", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_create_time <>", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_create_time >", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_create_time >=", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeLessThan(Date value) {
            addCriterion("patient_exam_item_create_time <", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_create_time <=", value, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_create_time in", values, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_create_time not in", values, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_create_time between", value1, value2, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_create_time not between", value1, value2, "patientExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeIsNull() {
            addCriterion("patient_exam_item_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeIsNotNull() {
            addCriterion("patient_exam_item_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_edit_time =", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_edit_time <>", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_edit_time >", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_edit_time >=", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeLessThan(Date value) {
            addCriterion("patient_exam_item_edit_time <", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_edit_time <=", value, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_edit_time in", values, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_edit_time not in", values, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_edit_time between", value1, value2, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_edit_time not between", value1, value2, "patientExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusIsNull() {
            addCriterion("patient_exam_item_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusIsNotNull() {
            addCriterion("patient_exam_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusEqualTo(Integer value) {
            addCriterion("patient_exam_item_status =", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusNotEqualTo(Integer value) {
            addCriterion("patient_exam_item_status <>", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusGreaterThan(Integer value) {
            addCriterion("patient_exam_item_status >", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_status >=", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusLessThan(Integer value) {
            addCriterion("patient_exam_item_status <", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_status <=", value, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusIn(List<Integer> values) {
            addCriterion("patient_exam_item_status in", values, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusNotIn(List<Integer> values) {
            addCriterion("patient_exam_item_status not in", values, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_status between", value1, value2, "patientExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_status not between", value1, value2, "patientExamItemStatus");
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