package br.crm.pojo.patient.feeItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientFeeItemExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientFeeItemExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("patient_id like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("patient_id not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
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

        public Criteria andPatientFeeItemPriceIsNull() {
            addCriterion("patient_fee_item_price is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceIsNotNull() {
            addCriterion("patient_fee_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_price =", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceNotEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_price <>", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceGreaterThan(BigDecimal value) {
            addCriterion("patient_fee_item_price >", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_price >=", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceLessThan(BigDecimal value) {
            addCriterion("patient_fee_item_price <", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_price <=", value, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_price in", values, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceNotIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_price not in", values, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_price between", value1, value2, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_price not between", value1, value2, "patientFeeItemPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceIsNull() {
            addCriterion("patient_fee_item_fact_price is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceIsNotNull() {
            addCriterion("patient_fee_item_fact_price is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price =", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceNotEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price <>", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceGreaterThan(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price >", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price >=", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceLessThan(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price <", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_fact_price <=", value, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_fact_price in", values, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceNotIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_fact_price not in", values, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_fact_price between", value1, value2, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemFactPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_fact_price not between", value1, value2, "patientFeeItemFactPrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceIsNull() {
            addCriterion("patient_fee_item_settle_price is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceIsNotNull() {
            addCriterion("patient_fee_item_settle_price is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price =", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceNotEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price <>", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceGreaterThan(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price >", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price >=", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceLessThan(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price <", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_fee_item_settle_price <=", value, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_settle_price in", values, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceNotIn(List<BigDecimal> values) {
            addCriterion("patient_fee_item_settle_price not in", values, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_settle_price between", value1, value2, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSettlePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_fee_item_settle_price not between", value1, value2, "patientFeeItemSettlePrice");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNull() {
            addCriterion("pay_way_id is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNotNull() {
            addCriterion("pay_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdEqualTo(String value) {
            addCriterion("pay_way_id =", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotEqualTo(String value) {
            addCriterion("pay_way_id <>", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThan(String value) {
            addCriterion("pay_way_id >", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_id >=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThan(String value) {
            addCriterion("pay_way_id <", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_way_id <=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLike(String value) {
            addCriterion("pay_way_id like", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotLike(String value) {
            addCriterion("pay_way_id not like", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIn(List<String> values) {
            addCriterion("pay_way_id in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotIn(List<String> values) {
            addCriterion("pay_way_id not in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdBetween(String value1, String value2) {
            addCriterion("pay_way_id between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotBetween(String value1, String value2) {
            addCriterion("pay_way_id not between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredIsNull() {
            addCriterion("patient_fee_item_registered is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredIsNotNull() {
            addCriterion("patient_fee_item_registered is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredEqualTo(Boolean value) {
            addCriterion("patient_fee_item_registered =", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_registered <>", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_registered >", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_registered >=", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredLessThan(Boolean value) {
            addCriterion("patient_fee_item_registered <", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_registered <=", value, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredIn(List<Boolean> values) {
            addCriterion("patient_fee_item_registered in", values, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_registered not in", values, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_registered between", value1, value2, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisteredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_registered not between", value1, value2, "patientFeeItemRegistered");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdIsNull() {
            addCriterion("patient_fee_item_reg_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdIsNotNull() {
            addCriterion("patient_fee_item_reg_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_id =", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdNotEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_id <>", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdGreaterThan(String value) {
            addCriterion("patient_fee_item_reg_doctor_id >", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_id >=", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdLessThan(String value) {
            addCriterion("patient_fee_item_reg_doctor_id <", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_id <=", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdLike(String value) {
            addCriterion("patient_fee_item_reg_doctor_id like", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdNotLike(String value) {
            addCriterion("patient_fee_item_reg_doctor_id not like", value, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdIn(List<String> values) {
            addCriterion("patient_fee_item_reg_doctor_id in", values, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdNotIn(List<String> values) {
            addCriterion("patient_fee_item_reg_doctor_id not in", values, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdBetween(String value1, String value2) {
            addCriterion("patient_fee_item_reg_doctor_id between", value1, value2, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorIdNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_reg_doctor_id not between", value1, value2, "patientFeeItemRegDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameIsNull() {
            addCriterion("patient_fee_item_reg_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameIsNotNull() {
            addCriterion("patient_fee_item_reg_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_name =", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameNotEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_name <>", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameGreaterThan(String value) {
            addCriterion("patient_fee_item_reg_doctor_name >", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_name >=", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameLessThan(String value) {
            addCriterion("patient_fee_item_reg_doctor_name <", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_reg_doctor_name <=", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameLike(String value) {
            addCriterion("patient_fee_item_reg_doctor_name like", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameNotLike(String value) {
            addCriterion("patient_fee_item_reg_doctor_name not like", value, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameIn(List<String> values) {
            addCriterion("patient_fee_item_reg_doctor_name in", values, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameNotIn(List<String> values) {
            addCriterion("patient_fee_item_reg_doctor_name not in", values, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameBetween(String value1, String value2) {
            addCriterion("patient_fee_item_reg_doctor_name between", value1, value2, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegDoctorNameNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_reg_doctor_name not between", value1, value2, "patientFeeItemRegDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeIsNull() {
            addCriterion("patient_fee_item_register_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeIsNotNull() {
            addCriterion("patient_fee_item_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_register_time =", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_register_time <>", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_register_time >", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_register_time >=", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeLessThan(Date value) {
            addCriterion("patient_fee_item_register_time <", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_register_time <=", value, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_register_time in", values, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_register_time not in", values, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_register_time between", value1, value2, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_register_time not between", value1, value2, "patientFeeItemRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdIsNull() {
            addCriterion("patient_register_sheet_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdIsNotNull() {
            addCriterion("patient_register_sheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdEqualTo(String value) {
            addCriterion("patient_register_sheet_id =", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdNotEqualTo(String value) {
            addCriterion("patient_register_sheet_id <>", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdGreaterThan(String value) {
            addCriterion("patient_register_sheet_id >", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_register_sheet_id >=", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdLessThan(String value) {
            addCriterion("patient_register_sheet_id <", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdLessThanOrEqualTo(String value) {
            addCriterion("patient_register_sheet_id <=", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdLike(String value) {
            addCriterion("patient_register_sheet_id like", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdNotLike(String value) {
            addCriterion("patient_register_sheet_id not like", value, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdIn(List<String> values) {
            addCriterion("patient_register_sheet_id in", values, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdNotIn(List<String> values) {
            addCriterion("patient_register_sheet_id not in", values, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdBetween(String value1, String value2) {
            addCriterion("patient_register_sheet_id between", value1, value2, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientRegisterSheetIdNotBetween(String value1, String value2) {
            addCriterion("patient_register_sheet_id not between", value1, value2, "patientRegisterSheetId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedIsNull() {
            addCriterion("patient_fee_item_reg_returned is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedIsNotNull() {
            addCriterion("patient_fee_item_reg_returned is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedEqualTo(Boolean value) {
            addCriterion("patient_fee_item_reg_returned =", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_reg_returned <>", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_reg_returned >", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_reg_returned >=", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedLessThan(Boolean value) {
            addCriterion("patient_fee_item_reg_returned <", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_reg_returned <=", value, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedIn(List<Boolean> values) {
            addCriterion("patient_fee_item_reg_returned in", values, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_reg_returned not in", values, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_reg_returned between", value1, value2, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemRegReturnedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_reg_returned not between", value1, value2, "patientFeeItemRegReturned");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedIsNull() {
            addCriterion("patient_fee_item_charged is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedIsNotNull() {
            addCriterion("patient_fee_item_charged is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedEqualTo(Boolean value) {
            addCriterion("patient_fee_item_charged =", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_charged <>", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_charged >", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_charged >=", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedLessThan(Boolean value) {
            addCriterion("patient_fee_item_charged <", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_charged <=", value, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedIn(List<Boolean> values) {
            addCriterion("patient_fee_item_charged in", values, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_charged not in", values, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_charged between", value1, value2, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_charged not between", value1, value2, "patientFeeItemCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdIsNull() {
            addCriterion("patient_fee_item_charger_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdIsNotNull() {
            addCriterion("patient_fee_item_charger_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdEqualTo(String value) {
            addCriterion("patient_fee_item_charger_id =", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdNotEqualTo(String value) {
            addCriterion("patient_fee_item_charger_id <>", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdGreaterThan(String value) {
            addCriterion("patient_fee_item_charger_id >", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_charger_id >=", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdLessThan(String value) {
            addCriterion("patient_fee_item_charger_id <", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_charger_id <=", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdLike(String value) {
            addCriterion("patient_fee_item_charger_id like", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdNotLike(String value) {
            addCriterion("patient_fee_item_charger_id not like", value, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdIn(List<String> values) {
            addCriterion("patient_fee_item_charger_id in", values, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdNotIn(List<String> values) {
            addCriterion("patient_fee_item_charger_id not in", values, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdBetween(String value1, String value2) {
            addCriterion("patient_fee_item_charger_id between", value1, value2, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerIdNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_charger_id not between", value1, value2, "patientFeeItemChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameIsNull() {
            addCriterion("patient_fee_item_charger_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameIsNotNull() {
            addCriterion("patient_fee_item_charger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameEqualTo(String value) {
            addCriterion("patient_fee_item_charger_name =", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameNotEqualTo(String value) {
            addCriterion("patient_fee_item_charger_name <>", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameGreaterThan(String value) {
            addCriterion("patient_fee_item_charger_name >", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_charger_name >=", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameLessThan(String value) {
            addCriterion("patient_fee_item_charger_name <", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_charger_name <=", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameLike(String value) {
            addCriterion("patient_fee_item_charger_name like", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameNotLike(String value) {
            addCriterion("patient_fee_item_charger_name not like", value, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameIn(List<String> values) {
            addCriterion("patient_fee_item_charger_name in", values, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameNotIn(List<String> values) {
            addCriterion("patient_fee_item_charger_name not in", values, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameBetween(String value1, String value2) {
            addCriterion("patient_fee_item_charger_name between", value1, value2, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerNameNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_charger_name not between", value1, value2, "patientFeeItemChargerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeIsNull() {
            addCriterion("patient_fee_item_charger_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeIsNotNull() {
            addCriterion("patient_fee_item_charger_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_charger_time =", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_charger_time <>", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_charger_time >", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_charger_time >=", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeLessThan(Date value) {
            addCriterion("patient_fee_item_charger_time <", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_charger_time <=", value, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_charger_time in", values, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_charger_time not in", values, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_charger_time between", value1, value2, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemChargerTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_charger_time not between", value1, value2, "patientFeeItemChargerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdIsNull() {
            addCriterion("patient_fee_item_discounter_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdIsNotNull() {
            addCriterion("patient_fee_item_discounter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdEqualTo(String value) {
            addCriterion("patient_fee_item_discounter_id =", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdNotEqualTo(String value) {
            addCriterion("patient_fee_item_discounter_id <>", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdGreaterThan(String value) {
            addCriterion("patient_fee_item_discounter_id >", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_discounter_id >=", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdLessThan(String value) {
            addCriterion("patient_fee_item_discounter_id <", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_discounter_id <=", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdLike(String value) {
            addCriterion("patient_fee_item_discounter_id like", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdNotLike(String value) {
            addCriterion("patient_fee_item_discounter_id not like", value, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdIn(List<String> values) {
            addCriterion("patient_fee_item_discounter_id in", values, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdNotIn(List<String> values) {
            addCriterion("patient_fee_item_discounter_id not in", values, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdBetween(String value1, String value2) {
            addCriterion("patient_fee_item_discounter_id between", value1, value2, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemDiscounterIdNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_discounter_id not between", value1, value2, "patientFeeItemDiscounterId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberIsNull() {
            addCriterion("patient_fee_item_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberIsNotNull() {
            addCriterion("patient_fee_item_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberEqualTo(Integer value) {
            addCriterion("patient_fee_item_batch_number =", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberNotEqualTo(Integer value) {
            addCriterion("patient_fee_item_batch_number <>", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberGreaterThan(Integer value) {
            addCriterion("patient_fee_item_batch_number >", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_batch_number >=", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberLessThan(Integer value) {
            addCriterion("patient_fee_item_batch_number <", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_batch_number <=", value, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberIn(List<Integer> values) {
            addCriterion("patient_fee_item_batch_number in", values, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberNotIn(List<Integer> values) {
            addCriterion("patient_fee_item_batch_number not in", values, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_batch_number between", value1, value2, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemBatchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_batch_number not between", value1, value2, "patientFeeItemBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionIsNull() {
            addCriterion("patient_fee_item_tube_position is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionIsNotNull() {
            addCriterion("patient_fee_item_tube_position is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionEqualTo(Integer value) {
            addCriterion("patient_fee_item_tube_position =", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionNotEqualTo(Integer value) {
            addCriterion("patient_fee_item_tube_position <>", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionGreaterThan(Integer value) {
            addCriterion("patient_fee_item_tube_position >", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_tube_position >=", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionLessThan(Integer value) {
            addCriterion("patient_fee_item_tube_position <", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionLessThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_tube_position <=", value, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionIn(List<Integer> values) {
            addCriterion("patient_fee_item_tube_position in", values, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionNotIn(List<Integer> values) {
            addCriterion("patient_fee_item_tube_position not in", values, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_tube_position between", value1, value2, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemTubePositionNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_tube_position not between", value1, value2, "patientFeeItemTubePosition");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberIsNull() {
            addCriterion("patient_fee_item_sample_number is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberIsNotNull() {
            addCriterion("patient_fee_item_sample_number is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberEqualTo(Integer value) {
            addCriterion("patient_fee_item_sample_number =", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberNotEqualTo(Integer value) {
            addCriterion("patient_fee_item_sample_number <>", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberGreaterThan(Integer value) {
            addCriterion("patient_fee_item_sample_number >", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_sample_number >=", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberLessThan(Integer value) {
            addCriterion("patient_fee_item_sample_number <", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_sample_number <=", value, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberIn(List<Integer> values) {
            addCriterion("patient_fee_item_sample_number in", values, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberNotIn(List<Integer> values) {
            addCriterion("patient_fee_item_sample_number not in", values, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_sample_number between", value1, value2, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSampleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_sample_number not between", value1, value2, "patientFeeItemSampleNumber");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledIsNull() {
            addCriterion("patient_fee_item_lab_sampled is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledIsNotNull() {
            addCriterion("patient_fee_item_lab_sampled is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledEqualTo(Long value) {
            addCriterion("patient_fee_item_lab_sampled =", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledNotEqualTo(Long value) {
            addCriterion("patient_fee_item_lab_sampled <>", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledGreaterThan(Long value) {
            addCriterion("patient_fee_item_lab_sampled >", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_fee_item_lab_sampled >=", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledLessThan(Long value) {
            addCriterion("patient_fee_item_lab_sampled <", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledLessThanOrEqualTo(Long value) {
            addCriterion("patient_fee_item_lab_sampled <=", value, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledIn(List<Long> values) {
            addCriterion("patient_fee_item_lab_sampled in", values, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledNotIn(List<Long> values) {
            addCriterion("patient_fee_item_lab_sampled not in", values, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledBetween(Long value1, Long value2) {
            addCriterion("patient_fee_item_lab_sampled between", value1, value2, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSampledNotBetween(Long value1, Long value2) {
            addCriterion("patient_fee_item_lab_sampled not between", value1, value2, "patientFeeItemLabSampled");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdIsNull() {
            addCriterion("patient_fee_item_lab_sampler_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdIsNotNull() {
            addCriterion("patient_fee_item_lab_sampler_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_id =", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdNotEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_id <>", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdGreaterThan(String value) {
            addCriterion("patient_fee_item_lab_sampler_id >", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_id >=", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdLessThan(String value) {
            addCriterion("patient_fee_item_lab_sampler_id <", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_id <=", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdLike(String value) {
            addCriterion("patient_fee_item_lab_sampler_id like", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdNotLike(String value) {
            addCriterion("patient_fee_item_lab_sampler_id not like", value, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdIn(List<String> values) {
            addCriterion("patient_fee_item_lab_sampler_id in", values, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdNotIn(List<String> values) {
            addCriterion("patient_fee_item_lab_sampler_id not in", values, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdBetween(String value1, String value2) {
            addCriterion("patient_fee_item_lab_sampler_id between", value1, value2, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerIdNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_lab_sampler_id not between", value1, value2, "patientFeeItemLabSamplerId");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameIsNull() {
            addCriterion("patient_fee_item_lab_sampler_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameIsNotNull() {
            addCriterion("patient_fee_item_lab_sampler_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_name =", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameNotEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_name <>", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameGreaterThan(String value) {
            addCriterion("patient_fee_item_lab_sampler_name >", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_name >=", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameLessThan(String value) {
            addCriterion("patient_fee_item_lab_sampler_name <", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_lab_sampler_name <=", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameLike(String value) {
            addCriterion("patient_fee_item_lab_sampler_name like", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameNotLike(String value) {
            addCriterion("patient_fee_item_lab_sampler_name not like", value, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameIn(List<String> values) {
            addCriterion("patient_fee_item_lab_sampler_name in", values, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameNotIn(List<String> values) {
            addCriterion("patient_fee_item_lab_sampler_name not in", values, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameBetween(String value1, String value2) {
            addCriterion("patient_fee_item_lab_sampler_name between", value1, value2, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerNameNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_lab_sampler_name not between", value1, value2, "patientFeeItemLabSamplerName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeIsNull() {
            addCriterion("patient_fee_item_lab_sampler_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeIsNotNull() {
            addCriterion("patient_fee_item_lab_sampler_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time =", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time <>", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time >", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time >=", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeLessThan(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time <", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_sampler_time <=", value, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_sampler_time in", values, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_sampler_time not in", values, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_sampler_time between", value1, value2, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSamplerTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_sampler_time not between", value1, value2, "patientFeeItemLabSamplerTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisIsNull() {
            addCriterion("patient_fee_item_lab_send_lis is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisIsNotNull() {
            addCriterion("patient_fee_item_lab_send_lis is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis =", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis <>", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis >", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis >=", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisLessThan(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis <", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_send_lis <=", value, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisIn(List<Boolean> values) {
            addCriterion("patient_fee_item_lab_send_lis in", values, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_lab_send_lis not in", values, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_lab_send_lis between", value1, value2, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_lab_send_lis not between", value1, value2, "patientFeeItemLabSendLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeIsNull() {
            addCriterion("patient_fee_item_lab_send_lis_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeIsNotNull() {
            addCriterion("patient_fee_item_lab_send_lis_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time =", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time <>", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time >", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time >=", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeLessThan(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time <", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_send_lis_time <=", value, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_send_lis_time in", values, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_send_lis_time not in", values, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_send_lis_time between", value1, value2, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabSendLisTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_send_lis_time not between", value1, value2, "patientFeeItemLabSendLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisIsNull() {
            addCriterion("patient_fee_item_lab_rcvd_from_lis is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisIsNotNull() {
            addCriterion("patient_fee_item_lab_rcvd_from_lis is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis =", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis <>", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis >", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis >=", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisLessThan(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis <", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis <=", value, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisIn(List<Boolean> values) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis in", values, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis not in", values, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis between", value1, value2, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis not between", value1, value2, "patientFeeItemLabRcvdFromLis");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeIsNull() {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeIsNotNull() {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time =", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time <>", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time >", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time >=", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeLessThan(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time <", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time <=", value, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time in", values, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time not in", values, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time between", value1, value2, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemLabRcvdFromLisTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_lab_rcvd_from_lis_time not between", value1, value2, "patientFeeItemLabRcvdFromLisTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpIsNull() {
            addCriterion("patient_fee_item_give_up is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpIsNotNull() {
            addCriterion("patient_fee_item_give_up is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpEqualTo(Boolean value) {
            addCriterion("patient_fee_item_give_up =", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_give_up <>", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_give_up >", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_give_up >=", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpLessThan(Boolean value) {
            addCriterion("patient_fee_item_give_up <", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_give_up <=", value, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpIn(List<Boolean> values) {
            addCriterion("patient_fee_item_give_up in", values, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_give_up not in", values, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_give_up between", value1, value2, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemGiveUpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_give_up not between", value1, value2, "patientFeeItemGiveUp");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedIsNull() {
            addCriterion("patient_fee_item_examinated is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedIsNotNull() {
            addCriterion("patient_fee_item_examinated is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedEqualTo(Boolean value) {
            addCriterion("patient_fee_item_examinated =", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_examinated <>", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_examinated >", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_examinated >=", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedLessThan(Boolean value) {
            addCriterion("patient_fee_item_examinated <", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_examinated <=", value, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedIn(List<Boolean> values) {
            addCriterion("patient_fee_item_examinated in", values, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_examinated not in", values, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_examinated between", value1, value2, "patientFeeItemExaminated");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_examinated not between", value1, value2, "patientFeeItemExaminated");
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

        public Criteria andExamDoctorIdIsNull() {
            addCriterion("exam_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdIsNotNull() {
            addCriterion("exam_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdEqualTo(String value) {
            addCriterion("exam_doctor_id =", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdNotEqualTo(String value) {
            addCriterion("exam_doctor_id <>", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdGreaterThan(String value) {
            addCriterion("exam_doctor_id >", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_doctor_id >=", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdLessThan(String value) {
            addCriterion("exam_doctor_id <", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("exam_doctor_id <=", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdLike(String value) {
            addCriterion("exam_doctor_id like", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdNotLike(String value) {
            addCriterion("exam_doctor_id not like", value, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdIn(List<String> values) {
            addCriterion("exam_doctor_id in", values, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdNotIn(List<String> values) {
            addCriterion("exam_doctor_id not in", values, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdBetween(String value1, String value2) {
            addCriterion("exam_doctor_id between", value1, value2, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorIdNotBetween(String value1, String value2) {
            addCriterion("exam_doctor_id not between", value1, value2, "examDoctorId");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIsNull() {
            addCriterion("exam_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIsNotNull() {
            addCriterion("exam_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameEqualTo(String value) {
            addCriterion("exam_doctor_name =", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotEqualTo(String value) {
            addCriterion("exam_doctor_name <>", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameGreaterThan(String value) {
            addCriterion("exam_doctor_name >", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_doctor_name >=", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLessThan(String value) {
            addCriterion("exam_doctor_name <", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("exam_doctor_name <=", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLike(String value) {
            addCriterion("exam_doctor_name like", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotLike(String value) {
            addCriterion("exam_doctor_name not like", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIn(List<String> values) {
            addCriterion("exam_doctor_name in", values, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotIn(List<String> values) {
            addCriterion("exam_doctor_name not in", values, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameBetween(String value1, String value2) {
            addCriterion("exam_doctor_name between", value1, value2, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotBetween(String value1, String value2) {
            addCriterion("exam_doctor_name not between", value1, value2, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeIsNull() {
            addCriterion("patient_fee_item_examinate_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeIsNotNull() {
            addCriterion("patient_fee_item_examinate_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_examinate_time =", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_examinate_time <>", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_examinate_time >", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_examinate_time >=", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeLessThan(Date value) {
            addCriterion("patient_fee_item_examinate_time <", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_examinate_time <=", value, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_examinate_time in", values, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_examinate_time not in", values, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_examinate_time between", value1, value2, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemExaminateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_examinate_time not between", value1, value2, "patientFeeItemExaminateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnIsNull() {
            addCriterion("patient_fee_item_mark_fee_return is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnIsNotNull() {
            addCriterion("patient_fee_item_mark_fee_return is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnEqualTo(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return =", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return <>", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return >", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return >=", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnLessThan(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return <", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_mark_fee_return <=", value, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnIn(List<Boolean> values) {
            addCriterion("patient_fee_item_mark_fee_return in", values, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_mark_fee_return not in", values, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_mark_fee_return between", value1, value2, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemMarkFeeReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_mark_fee_return not between", value1, value2, "patientFeeItemMarkFeeReturn");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyIsNull() {
            addCriterion("patient_fee_item_work_inner_modify is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyIsNotNull() {
            addCriterion("patient_fee_item_work_inner_modify is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyEqualTo(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify =", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyNotEqualTo(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify <>", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyGreaterThan(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify >", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify >=", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyLessThan(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify <", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_fee_item_work_inner_modify <=", value, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyIn(List<Boolean> values) {
            addCriterion("patient_fee_item_work_inner_modify in", values, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyNotIn(List<Boolean> values) {
            addCriterion("patient_fee_item_work_inner_modify not in", values, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_work_inner_modify between", value1, value2, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemWorkInnerModifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_fee_item_work_inner_modify not between", value1, value2, "patientFeeItemWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeIsNull() {
            addCriterion("patient_fee_item_severe_degree is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeIsNotNull() {
            addCriterion("patient_fee_item_severe_degree is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeEqualTo(String value) {
            addCriterion("patient_fee_item_severe_degree =", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeNotEqualTo(String value) {
            addCriterion("patient_fee_item_severe_degree <>", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeGreaterThan(String value) {
            addCriterion("patient_fee_item_severe_degree >", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_severe_degree >=", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeLessThan(String value) {
            addCriterion("patient_fee_item_severe_degree <", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_severe_degree <=", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeLike(String value) {
            addCriterion("patient_fee_item_severe_degree like", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeNotLike(String value) {
            addCriterion("patient_fee_item_severe_degree not like", value, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeIn(List<String> values) {
            addCriterion("patient_fee_item_severe_degree in", values, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeNotIn(List<String> values) {
            addCriterion("patient_fee_item_severe_degree not in", values, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeBetween(String value1, String value2) {
            addCriterion("patient_fee_item_severe_degree between", value1, value2, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemSevereDegreeNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_severe_degree not between", value1, value2, "patientFeeItemSevereDegree");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksIsNull() {
            addCriterion("patient_fee_item_Interface_marks is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksIsNotNull() {
            addCriterion("patient_fee_item_Interface_marks is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksEqualTo(String value) {
            addCriterion("patient_fee_item_Interface_marks =", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksNotEqualTo(String value) {
            addCriterion("patient_fee_item_Interface_marks <>", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksGreaterThan(String value) {
            addCriterion("patient_fee_item_Interface_marks >", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_Interface_marks >=", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksLessThan(String value) {
            addCriterion("patient_fee_item_Interface_marks <", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_Interface_marks <=", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksLike(String value) {
            addCriterion("patient_fee_item_Interface_marks like", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksNotLike(String value) {
            addCriterion("patient_fee_item_Interface_marks not like", value, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksIn(List<String> values) {
            addCriterion("patient_fee_item_Interface_marks in", values, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksNotIn(List<String> values) {
            addCriterion("patient_fee_item_Interface_marks not in", values, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksBetween(String value1, String value2) {
            addCriterion("patient_fee_item_Interface_marks between", value1, value2, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemInterfaceMarksNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_Interface_marks not between", value1, value2, "patientFeeItemInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultIsNull() {
            addCriterion("patient_fee_item_url_result is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultIsNotNull() {
            addCriterion("patient_fee_item_url_result is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultEqualTo(String value) {
            addCriterion("patient_fee_item_url_result =", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultNotEqualTo(String value) {
            addCriterion("patient_fee_item_url_result <>", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultGreaterThan(String value) {
            addCriterion("patient_fee_item_url_result >", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_url_result >=", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultLessThan(String value) {
            addCriterion("patient_fee_item_url_result <", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_item_url_result <=", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultLike(String value) {
            addCriterion("patient_fee_item_url_result like", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultNotLike(String value) {
            addCriterion("patient_fee_item_url_result not like", value, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultIn(List<String> values) {
            addCriterion("patient_fee_item_url_result in", values, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultNotIn(List<String> values) {
            addCriterion("patient_fee_item_url_result not in", values, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultBetween(String value1, String value2) {
            addCriterion("patient_fee_item_url_result between", value1, value2, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemUrlResultNotBetween(String value1, String value2) {
            addCriterion("patient_fee_item_url_result not between", value1, value2, "patientFeeItemUrlResult");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeIsNull() {
            addCriterion("patient_fee_item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeIsNotNull() {
            addCriterion("patient_fee_item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_create_time =", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_create_time <>", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_create_time >", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_create_time >=", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeLessThan(Date value) {
            addCriterion("patient_fee_item_create_time <", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_create_time <=", value, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_create_time in", values, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_create_time not in", values, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_create_time between", value1, value2, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_create_time not between", value1, value2, "patientFeeItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeIsNull() {
            addCriterion("patient_fee_item_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeIsNotNull() {
            addCriterion("patient_fee_item_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeEqualTo(Date value) {
            addCriterion("patient_fee_item_edit_time =", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeNotEqualTo(Date value) {
            addCriterion("patient_fee_item_edit_time <>", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeGreaterThan(Date value) {
            addCriterion("patient_fee_item_edit_time >", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_edit_time >=", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeLessThan(Date value) {
            addCriterion("patient_fee_item_edit_time <", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_fee_item_edit_time <=", value, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeIn(List<Date> values) {
            addCriterion("patient_fee_item_edit_time in", values, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeNotIn(List<Date> values) {
            addCriterion("patient_fee_item_edit_time not in", values, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_edit_time between", value1, value2, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_fee_item_edit_time not between", value1, value2, "patientFeeItemEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusIsNull() {
            addCriterion("patient_fee_item_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusIsNotNull() {
            addCriterion("patient_fee_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusEqualTo(Integer value) {
            addCriterion("patient_fee_item_status =", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusNotEqualTo(Integer value) {
            addCriterion("patient_fee_item_status <>", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusGreaterThan(Integer value) {
            addCriterion("patient_fee_item_status >", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_status >=", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusLessThan(Integer value) {
            addCriterion("patient_fee_item_status <", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_fee_item_status <=", value, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusIn(List<Integer> values) {
            addCriterion("patient_fee_item_status in", values, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusNotIn(List<Integer> values) {
            addCriterion("patient_fee_item_status not in", values, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_status between", value1, value2, "patientFeeItemStatus");
            return (Criteria) this;
        }

        public Criteria andPatientFeeItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_fee_item_status not between", value1, value2, "patientFeeItemStatus");
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