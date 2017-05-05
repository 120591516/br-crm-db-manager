package br.crm.pojo.patient.registerSheet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientRegisterSheetDetailExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientRegisterSheetDetailExample() {
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

        public Criteria andRegDetailIdIsNull() {
            addCriterion("reg_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdIsNotNull() {
            addCriterion("reg_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdEqualTo(String value) {
            addCriterion("reg_detail_id =", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdNotEqualTo(String value) {
            addCriterion("reg_detail_id <>", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdGreaterThan(String value) {
            addCriterion("reg_detail_id >", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_detail_id >=", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdLessThan(String value) {
            addCriterion("reg_detail_id <", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdLessThanOrEqualTo(String value) {
            addCriterion("reg_detail_id <=", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdLike(String value) {
            addCriterion("reg_detail_id like", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdNotLike(String value) {
            addCriterion("reg_detail_id not like", value, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdIn(List<String> values) {
            addCriterion("reg_detail_id in", values, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdNotIn(List<String> values) {
            addCriterion("reg_detail_id not in", values, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdBetween(String value1, String value2) {
            addCriterion("reg_detail_id between", value1, value2, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegDetailIdNotBetween(String value1, String value2) {
            addCriterion("reg_detail_id not between", value1, value2, "regDetailId");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("reg_id like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("reg_id not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemIsNull() {
            addCriterion("reg_virtual_item is null");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemIsNotNull() {
            addCriterion("reg_virtual_item is not null");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemEqualTo(Boolean value) {
            addCriterion("reg_virtual_item =", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemNotEqualTo(Boolean value) {
            addCriterion("reg_virtual_item <>", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemGreaterThan(Boolean value) {
            addCriterion("reg_virtual_item >", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_virtual_item >=", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemLessThan(Boolean value) {
            addCriterion("reg_virtual_item <", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_virtual_item <=", value, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemIn(List<Boolean> values) {
            addCriterion("reg_virtual_item in", values, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemNotIn(List<Boolean> values) {
            addCriterion("reg_virtual_item not in", values, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_virtual_item between", value1, value2, "regVirtualItem");
            return (Criteria) this;
        }

        public Criteria andRegVirtualItemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_virtual_item not between", value1, value2, "regVirtualItem");
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

        public Criteria andExamFeeItemCodeIsNull() {
            addCriterion("exam_fee_item_code is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeIsNotNull() {
            addCriterion("exam_fee_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeEqualTo(String value) {
            addCriterion("exam_fee_item_code =", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotEqualTo(String value) {
            addCriterion("exam_fee_item_code <>", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeGreaterThan(String value) {
            addCriterion("exam_fee_item_code >", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_code >=", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLessThan(String value) {
            addCriterion("exam_fee_item_code <", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_code <=", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeLike(String value) {
            addCriterion("exam_fee_item_code like", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotLike(String value) {
            addCriterion("exam_fee_item_code not like", value, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeIn(List<String> values) {
            addCriterion("exam_fee_item_code in", values, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotIn(List<String> values) {
            addCriterion("exam_fee_item_code not in", values, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeBetween(String value1, String value2) {
            addCriterion("exam_fee_item_code between", value1, value2, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemCodeNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_code not between", value1, value2, "examFeeItemCode");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIsNull() {
            addCriterion("exam_fee_item_name is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIsNotNull() {
            addCriterion("exam_fee_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameEqualTo(String value) {
            addCriterion("exam_fee_item_name =", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotEqualTo(String value) {
            addCriterion("exam_fee_item_name <>", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameGreaterThan(String value) {
            addCriterion("exam_fee_item_name >", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name >=", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLessThan(String value) {
            addCriterion("exam_fee_item_name <", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_name <=", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameLike(String value) {
            addCriterion("exam_fee_item_name like", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotLike(String value) {
            addCriterion("exam_fee_item_name not like", value, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameIn(List<String> values) {
            addCriterion("exam_fee_item_name in", values, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotIn(List<String> values) {
            addCriterion("exam_fee_item_name not in", values, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name between", value1, value2, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemNameNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_name not between", value1, value2, "examFeeItemName");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceIsNull() {
            addCriterion("reg_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceIsNotNull() {
            addCriterion("reg_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceEqualTo(Long value) {
            addCriterion("reg_unit_price =", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceNotEqualTo(Long value) {
            addCriterion("reg_unit_price <>", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceGreaterThan(Long value) {
            addCriterion("reg_unit_price >", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_unit_price >=", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceLessThan(Long value) {
            addCriterion("reg_unit_price <", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("reg_unit_price <=", value, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceIn(List<Long> values) {
            addCriterion("reg_unit_price in", values, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceNotIn(List<Long> values) {
            addCriterion("reg_unit_price not in", values, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceBetween(Long value1, Long value2) {
            addCriterion("reg_unit_price between", value1, value2, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("reg_unit_price not between", value1, value2, "regUnitPrice");
            return (Criteria) this;
        }

        public Criteria andRegQtyIsNull() {
            addCriterion("reg_qty is null");
            return (Criteria) this;
        }

        public Criteria andRegQtyIsNotNull() {
            addCriterion("reg_qty is not null");
            return (Criteria) this;
        }

        public Criteria andRegQtyEqualTo(Integer value) {
            addCriterion("reg_qty =", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyNotEqualTo(Integer value) {
            addCriterion("reg_qty <>", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyGreaterThan(Integer value) {
            addCriterion("reg_qty >", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_qty >=", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyLessThan(Integer value) {
            addCriterion("reg_qty <", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyLessThanOrEqualTo(Integer value) {
            addCriterion("reg_qty <=", value, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyIn(List<Integer> values) {
            addCriterion("reg_qty in", values, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyNotIn(List<Integer> values) {
            addCriterion("reg_qty not in", values, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyBetween(Integer value1, Integer value2) {
            addCriterion("reg_qty between", value1, value2, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_qty not between", value1, value2, "regQty");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIsNull() {
            addCriterion("reg_work_inner_modify is null");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIsNotNull() {
            addCriterion("reg_work_inner_modify is not null");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify =", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify <>", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyGreaterThan(Boolean value) {
            addCriterion("reg_work_inner_modify >", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify >=", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyLessThan(Boolean value) {
            addCriterion("reg_work_inner_modify <", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify <=", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIn(List<Boolean> values) {
            addCriterion("reg_work_inner_modify in", values, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotIn(List<Boolean> values) {
            addCriterion("reg_work_inner_modify not in", values, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_work_inner_modify between", value1, value2, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_work_inner_modify not between", value1, value2, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeIsNull() {
            addCriterion("reg_detail_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeIsNotNull() {
            addCriterion("reg_detail_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeEqualTo(Date value) {
            addCriterion("reg_detail_create_time =", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeNotEqualTo(Date value) {
            addCriterion("reg_detail_create_time <>", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeGreaterThan(Date value) {
            addCriterion("reg_detail_create_time >", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_detail_create_time >=", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeLessThan(Date value) {
            addCriterion("reg_detail_create_time <", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_detail_create_time <=", value, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeIn(List<Date> values) {
            addCriterion("reg_detail_create_time in", values, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeNotIn(List<Date> values) {
            addCriterion("reg_detail_create_time not in", values, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeBetween(Date value1, Date value2) {
            addCriterion("reg_detail_create_time between", value1, value2, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_detail_create_time not between", value1, value2, "regDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeIsNull() {
            addCriterion("reg_detail_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeIsNotNull() {
            addCriterion("reg_detail_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeEqualTo(Date value) {
            addCriterion("reg_detail_edit_time =", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeNotEqualTo(Date value) {
            addCriterion("reg_detail_edit_time <>", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeGreaterThan(Date value) {
            addCriterion("reg_detail_edit_time >", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_detail_edit_time >=", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeLessThan(Date value) {
            addCriterion("reg_detail_edit_time <", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_detail_edit_time <=", value, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeIn(List<Date> values) {
            addCriterion("reg_detail_edit_time in", values, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeNotIn(List<Date> values) {
            addCriterion("reg_detail_edit_time not in", values, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeBetween(Date value1, Date value2) {
            addCriterion("reg_detail_edit_time between", value1, value2, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_detail_edit_time not between", value1, value2, "regDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusIsNull() {
            addCriterion("reg_detail_status is null");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusIsNotNull() {
            addCriterion("reg_detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusEqualTo(Integer value) {
            addCriterion("reg_detail_status =", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusNotEqualTo(Integer value) {
            addCriterion("reg_detail_status <>", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusGreaterThan(Integer value) {
            addCriterion("reg_detail_status >", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_detail_status >=", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusLessThan(Integer value) {
            addCriterion("reg_detail_status <", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("reg_detail_status <=", value, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusIn(List<Integer> values) {
            addCriterion("reg_detail_status in", values, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusNotIn(List<Integer> values) {
            addCriterion("reg_detail_status not in", values, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusBetween(Integer value1, Integer value2) {
            addCriterion("reg_detail_status between", value1, value2, "regDetailStatus");
            return (Criteria) this;
        }

        public Criteria andRegDetailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_detail_status not between", value1, value2, "regDetailStatus");
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