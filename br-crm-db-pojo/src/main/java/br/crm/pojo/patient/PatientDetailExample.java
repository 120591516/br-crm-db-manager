package br.crm.pojo.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDetailExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientDetailExample() {
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

        public Criteria andPatientDetailIdIsNull() {
            addCriterion("patient_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdIsNotNull() {
            addCriterion("patient_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdEqualTo(String value) {
            addCriterion("patient_detail_id =", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdNotEqualTo(String value) {
            addCriterion("patient_detail_id <>", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdGreaterThan(String value) {
            addCriterion("patient_detail_id >", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_detail_id >=", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdLessThan(String value) {
            addCriterion("patient_detail_id <", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdLessThanOrEqualTo(String value) {
            addCriterion("patient_detail_id <=", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdLike(String value) {
            addCriterion("patient_detail_id like", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdNotLike(String value) {
            addCriterion("patient_detail_id not like", value, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdIn(List<String> values) {
            addCriterion("patient_detail_id in", values, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdNotIn(List<String> values) {
            addCriterion("patient_detail_id not in", values, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdBetween(String value1, String value2) {
            addCriterion("patient_detail_id between", value1, value2, "patientDetailId");
            return (Criteria) this;
        }

        public Criteria andPatientDetailIdNotBetween(String value1, String value2) {
            addCriterion("patient_detail_id not between", value1, value2, "patientDetailId");
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

        public Criteria andPatientClassIdIsNull() {
            addCriterion("patient_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdIsNotNull() {
            addCriterion("patient_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdEqualTo(String value) {
            addCriterion("patient_class_id =", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotEqualTo(String value) {
            addCriterion("patient_class_id <>", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdGreaterThan(String value) {
            addCriterion("patient_class_id >", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_class_id >=", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLessThan(String value) {
            addCriterion("patient_class_id <", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLessThanOrEqualTo(String value) {
            addCriterion("patient_class_id <=", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLike(String value) {
            addCriterion("patient_class_id like", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotLike(String value) {
            addCriterion("patient_class_id not like", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdIn(List<String> values) {
            addCriterion("patient_class_id in", values, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotIn(List<String> values) {
            addCriterion("patient_class_id not in", values, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdBetween(String value1, String value2) {
            addCriterion("patient_class_id between", value1, value2, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotBetween(String value1, String value2) {
            addCriterion("patient_class_id not between", value1, value2, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentIsNull() {
            addCriterion("patient_off_percent is null");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentIsNotNull() {
            addCriterion("patient_off_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentEqualTo(Integer value) {
            addCriterion("patient_off_percent =", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentNotEqualTo(Integer value) {
            addCriterion("patient_off_percent <>", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentGreaterThan(Integer value) {
            addCriterion("patient_off_percent >", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_off_percent >=", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentLessThan(Integer value) {
            addCriterion("patient_off_percent <", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentLessThanOrEqualTo(Integer value) {
            addCriterion("patient_off_percent <=", value, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentIn(List<Integer> values) {
            addCriterion("patient_off_percent in", values, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentNotIn(List<Integer> values) {
            addCriterion("patient_off_percent not in", values, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentBetween(Integer value1, Integer value2) {
            addCriterion("patient_off_percent between", value1, value2, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientOffPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_off_percent not between", value1, value2, "patientOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentIsNull() {
            addCriterion("patient_max_off_percent is null");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentIsNotNull() {
            addCriterion("patient_max_off_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentEqualTo(Integer value) {
            addCriterion("patient_max_off_percent =", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentNotEqualTo(Integer value) {
            addCriterion("patient_max_off_percent <>", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentGreaterThan(Integer value) {
            addCriterion("patient_max_off_percent >", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_max_off_percent >=", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentLessThan(Integer value) {
            addCriterion("patient_max_off_percent <", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentLessThanOrEqualTo(Integer value) {
            addCriterion("patient_max_off_percent <=", value, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentIn(List<Integer> values) {
            addCriterion("patient_max_off_percent in", values, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentNotIn(List<Integer> values) {
            addCriterion("patient_max_off_percent not in", values, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentBetween(Integer value1, Integer value2) {
            addCriterion("patient_max_off_percent between", value1, value2, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientMaxOffPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_max_off_percent not between", value1, value2, "patientMaxOffPercent");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitIsNull() {
            addCriterion("patient_price_limit is null");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitIsNotNull() {
            addCriterion("patient_price_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitEqualTo(BigDecimal value) {
            addCriterion("patient_price_limit =", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitNotEqualTo(BigDecimal value) {
            addCriterion("patient_price_limit <>", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitGreaterThan(BigDecimal value) {
            addCriterion("patient_price_limit >", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_price_limit >=", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitLessThan(BigDecimal value) {
            addCriterion("patient_price_limit <", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_price_limit <=", value, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitIn(List<BigDecimal> values) {
            addCriterion("patient_price_limit in", values, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitNotIn(List<BigDecimal> values) {
            addCriterion("patient_price_limit not in", values, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_price_limit between", value1, value2, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientPriceLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_price_limit not between", value1, value2, "patientPriceLimit");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountIsNull() {
            addCriterion("patient_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountIsNotNull() {
            addCriterion("patient_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount =", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountNotEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount <>", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountGreaterThan(BigDecimal value) {
            addCriterion("patient_money_amount >", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount >=", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountLessThan(BigDecimal value) {
            addCriterion("patient_money_amount <", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount <=", value, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountIn(List<BigDecimal> values) {
            addCriterion("patient_money_amount in", values, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountNotIn(List<BigDecimal> values) {
            addCriterion("patient_money_amount not in", values, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_money_amount between", value1, value2, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_money_amount not between", value1, value2, "patientMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidIsNull() {
            addCriterion("patient_money_amount_paid is null");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidIsNotNull() {
            addCriterion("patient_money_amount_paid is not null");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount_paid =", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidNotEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount_paid <>", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidGreaterThan(BigDecimal value) {
            addCriterion("patient_money_amount_paid >", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount_paid >=", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidLessThan(BigDecimal value) {
            addCriterion("patient_money_amount_paid <", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_money_amount_paid <=", value, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidIn(List<BigDecimal> values) {
            addCriterion("patient_money_amount_paid in", values, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidNotIn(List<BigDecimal> values) {
            addCriterion("patient_money_amount_paid not in", values, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_money_amount_paid between", value1, value2, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientMoneyAmountPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_money_amount_paid not between", value1, value2, "patientMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdIsNull() {
            addCriterion("open_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdIsNotNull() {
            addCriterion("open_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdEqualTo(String value) {
            addCriterion("open_doctor_id =", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdNotEqualTo(String value) {
            addCriterion("open_doctor_id <>", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdGreaterThan(String value) {
            addCriterion("open_doctor_id >", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_doctor_id >=", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdLessThan(String value) {
            addCriterion("open_doctor_id <", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("open_doctor_id <=", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdLike(String value) {
            addCriterion("open_doctor_id like", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdNotLike(String value) {
            addCriterion("open_doctor_id not like", value, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdIn(List<String> values) {
            addCriterion("open_doctor_id in", values, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdNotIn(List<String> values) {
            addCriterion("open_doctor_id not in", values, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdBetween(String value1, String value2) {
            addCriterion("open_doctor_id between", value1, value2, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andOpenDoctorIdNotBetween(String value1, String value2) {
            addCriterion("open_doctor_id not between", value1, value2, "openDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoIsNull() {
            addCriterion("patient_work_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoIsNotNull() {
            addCriterion("patient_work_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoEqualTo(String value) {
            addCriterion("patient_work_no =", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoNotEqualTo(String value) {
            addCriterion("patient_work_no <>", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoGreaterThan(String value) {
            addCriterion("patient_work_no >", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_work_no >=", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoLessThan(String value) {
            addCriterion("patient_work_no <", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoLessThanOrEqualTo(String value) {
            addCriterion("patient_work_no <=", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoLike(String value) {
            addCriterion("patient_work_no like", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoNotLike(String value) {
            addCriterion("patient_work_no not like", value, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoIn(List<String> values) {
            addCriterion("patient_work_no in", values, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoNotIn(List<String> values) {
            addCriterion("patient_work_no not in", values, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoBetween(String value1, String value2) {
            addCriterion("patient_work_no between", value1, value2, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andPatientWorkNoNotBetween(String value1, String value2) {
            addCriterion("patient_work_no not between", value1, value2, "patientWorkNo");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdIsNull() {
            addCriterion("doctor_reg_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdIsNotNull() {
            addCriterion("doctor_reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdEqualTo(String value) {
            addCriterion("doctor_reg_id =", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdNotEqualTo(String value) {
            addCriterion("doctor_reg_id <>", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdGreaterThan(String value) {
            addCriterion("doctor_reg_id >", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_reg_id >=", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdLessThan(String value) {
            addCriterion("doctor_reg_id <", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_reg_id <=", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdLike(String value) {
            addCriterion("doctor_reg_id like", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdNotLike(String value) {
            addCriterion("doctor_reg_id not like", value, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdIn(List<String> values) {
            addCriterion("doctor_reg_id in", values, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdNotIn(List<String> values) {
            addCriterion("doctor_reg_id not in", values, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdBetween(String value1, String value2) {
            addCriterion("doctor_reg_id between", value1, value2, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegIdNotBetween(String value1, String value2) {
            addCriterion("doctor_reg_id not between", value1, value2, "doctorRegId");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameIsNull() {
            addCriterion("doctor_reg_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameIsNotNull() {
            addCriterion("doctor_reg_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameEqualTo(String value) {
            addCriterion("doctor_reg_name =", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameNotEqualTo(String value) {
            addCriterion("doctor_reg_name <>", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameGreaterThan(String value) {
            addCriterion("doctor_reg_name >", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_reg_name >=", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameLessThan(String value) {
            addCriterion("doctor_reg_name <", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_reg_name <=", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameLike(String value) {
            addCriterion("doctor_reg_name like", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameNotLike(String value) {
            addCriterion("doctor_reg_name not like", value, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameIn(List<String> values) {
            addCriterion("doctor_reg_name in", values, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameNotIn(List<String> values) {
            addCriterion("doctor_reg_name not in", values, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameBetween(String value1, String value2) {
            addCriterion("doctor_reg_name between", value1, value2, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andDoctorRegNameNotBetween(String value1, String value2) {
            addCriterion("doctor_reg_name not between", value1, value2, "doctorRegName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNull() {
            addCriterion("exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNotNull() {
            addCriterion("exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdEqualTo(String value) {
            addCriterion("exam_suite_id =", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotEqualTo(String value) {
            addCriterion("exam_suite_id <>", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThan(String value) {
            addCriterion("exam_suite_id >", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_id >=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThan(String value) {
            addCriterion("exam_suite_id <", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_id <=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLike(String value) {
            addCriterion("exam_suite_id like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotLike(String value) {
            addCriterion("exam_suite_id not like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIn(List<String> values) {
            addCriterion("exam_suite_id in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotIn(List<String> values) {
            addCriterion("exam_suite_id not in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdBetween(String value1, String value2) {
            addCriterion("exam_suite_id between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_id not between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNull() {
            addCriterion("exam_suite_name is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNotNull() {
            addCriterion("exam_suite_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEqualTo(String value) {
            addCriterion("exam_suite_name =", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotEqualTo(String value) {
            addCriterion("exam_suite_name <>", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThan(String value) {
            addCriterion("exam_suite_name >", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_name >=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThan(String value) {
            addCriterion("exam_suite_name <", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_name <=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLike(String value) {
            addCriterion("exam_suite_name like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotLike(String value) {
            addCriterion("exam_suite_name not like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIn(List<String> values) {
            addCriterion("exam_suite_name in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotIn(List<String> values) {
            addCriterion("exam_suite_name not in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameBetween(String value1, String value2) {
            addCriterion("exam_suite_name between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotBetween(String value1, String value2) {
            addCriterion("exam_suite_name not between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdIsNull() {
            addCriterion("doctor_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdIsNotNull() {
            addCriterion("doctor_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdEqualTo(String value) {
            addCriterion("doctor_apply_id =", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdNotEqualTo(String value) {
            addCriterion("doctor_apply_id <>", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdGreaterThan(String value) {
            addCriterion("doctor_apply_id >", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_apply_id >=", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdLessThan(String value) {
            addCriterion("doctor_apply_id <", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_apply_id <=", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdLike(String value) {
            addCriterion("doctor_apply_id like", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdNotLike(String value) {
            addCriterion("doctor_apply_id not like", value, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdIn(List<String> values) {
            addCriterion("doctor_apply_id in", values, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdNotIn(List<String> values) {
            addCriterion("doctor_apply_id not in", values, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdBetween(String value1, String value2) {
            addCriterion("doctor_apply_id between", value1, value2, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyIdNotBetween(String value1, String value2) {
            addCriterion("doctor_apply_id not between", value1, value2, "doctorApplyId");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameIsNull() {
            addCriterion("doctor_apply_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameIsNotNull() {
            addCriterion("doctor_apply_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameEqualTo(String value) {
            addCriterion("doctor_apply_name =", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameNotEqualTo(String value) {
            addCriterion("doctor_apply_name <>", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameGreaterThan(String value) {
            addCriterion("doctor_apply_name >", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_apply_name >=", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameLessThan(String value) {
            addCriterion("doctor_apply_name <", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_apply_name <=", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameLike(String value) {
            addCriterion("doctor_apply_name like", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameNotLike(String value) {
            addCriterion("doctor_apply_name not like", value, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameIn(List<String> values) {
            addCriterion("doctor_apply_name in", values, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameNotIn(List<String> values) {
            addCriterion("doctor_apply_name not in", values, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameBetween(String value1, String value2) {
            addCriterion("doctor_apply_name between", value1, value2, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andDoctorApplyNameNotBetween(String value1, String value2) {
            addCriterion("doctor_apply_name not between", value1, value2, "doctorApplyName");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedIsNull() {
            addCriterion("patient_guidance_printed is null");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedIsNotNull() {
            addCriterion("patient_guidance_printed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedEqualTo(Long value) {
            addCriterion("patient_guidance_printed =", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedNotEqualTo(Long value) {
            addCriterion("patient_guidance_printed <>", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedGreaterThan(Long value) {
            addCriterion("patient_guidance_printed >", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_guidance_printed >=", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedLessThan(Long value) {
            addCriterion("patient_guidance_printed <", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedLessThanOrEqualTo(Long value) {
            addCriterion("patient_guidance_printed <=", value, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedIn(List<Long> values) {
            addCriterion("patient_guidance_printed in", values, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedNotIn(List<Long> values) {
            addCriterion("patient_guidance_printed not in", values, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedBetween(Long value1, Long value2) {
            addCriterion("patient_guidance_printed between", value1, value2, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientGuidancePrintedNotBetween(Long value1, Long value2) {
            addCriterion("patient_guidance_printed not between", value1, value2, "patientGuidancePrinted");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedIsNull() {
            addCriterion("patient_fee_charged is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedIsNotNull() {
            addCriterion("patient_fee_charged is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedEqualTo(Long value) {
            addCriterion("patient_fee_charged =", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedNotEqualTo(Long value) {
            addCriterion("patient_fee_charged <>", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedGreaterThan(Long value) {
            addCriterion("patient_fee_charged >", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_fee_charged >=", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedLessThan(Long value) {
            addCriterion("patient_fee_charged <", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedLessThanOrEqualTo(Long value) {
            addCriterion("patient_fee_charged <=", value, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedIn(List<Long> values) {
            addCriterion("patient_fee_charged in", values, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedNotIn(List<Long> values) {
            addCriterion("patient_fee_charged not in", values, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedBetween(Long value1, Long value2) {
            addCriterion("patient_fee_charged between", value1, value2, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientFeeChargedNotBetween(Long value1, Long value2) {
            addCriterion("patient_fee_charged not between", value1, value2, "patientFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedIsNull() {
            addCriterion("patient_exam_started is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedIsNotNull() {
            addCriterion("patient_exam_started is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedEqualTo(Long value) {
            addCriterion("patient_exam_started =", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedNotEqualTo(Long value) {
            addCriterion("patient_exam_started <>", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedGreaterThan(Long value) {
            addCriterion("patient_exam_started >", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_exam_started >=", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedLessThan(Long value) {
            addCriterion("patient_exam_started <", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedLessThanOrEqualTo(Long value) {
            addCriterion("patient_exam_started <=", value, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedIn(List<Long> values) {
            addCriterion("patient_exam_started in", values, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedNotIn(List<Long> values) {
            addCriterion("patient_exam_started not in", values, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedBetween(Long value1, Long value2) {
            addCriterion("patient_exam_started between", value1, value2, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientExamStartedNotBetween(Long value1, Long value2) {
            addCriterion("patient_exam_started not between", value1, value2, "patientExamStarted");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalIsNull() {
            addCriterion("patient_ready_to_final is null");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalIsNotNull() {
            addCriterion("patient_ready_to_final is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalEqualTo(Long value) {
            addCriterion("patient_ready_to_final =", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalNotEqualTo(Long value) {
            addCriterion("patient_ready_to_final <>", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalGreaterThan(Long value) {
            addCriterion("patient_ready_to_final >", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_ready_to_final >=", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalLessThan(Long value) {
            addCriterion("patient_ready_to_final <", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalLessThanOrEqualTo(Long value) {
            addCriterion("patient_ready_to_final <=", value, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalIn(List<Long> values) {
            addCriterion("patient_ready_to_final in", values, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalNotIn(List<Long> values) {
            addCriterion("patient_ready_to_final not in", values, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalBetween(Long value1, Long value2) {
            addCriterion("patient_ready_to_final between", value1, value2, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andPatientReadyToFinalNotBetween(Long value1, Long value2) {
            addCriterion("patient_ready_to_final not between", value1, value2, "patientReadyToFinal");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdIsNull() {
            addCriterion("doctor_fee_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdIsNotNull() {
            addCriterion("doctor_fee_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdEqualTo(String value) {
            addCriterion("doctor_fee_id =", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdNotEqualTo(String value) {
            addCriterion("doctor_fee_id <>", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdGreaterThan(String value) {
            addCriterion("doctor_fee_id >", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_fee_id >=", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdLessThan(String value) {
            addCriterion("doctor_fee_id <", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_fee_id <=", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdLike(String value) {
            addCriterion("doctor_fee_id like", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdNotLike(String value) {
            addCriterion("doctor_fee_id not like", value, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdIn(List<String> values) {
            addCriterion("doctor_fee_id in", values, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdNotIn(List<String> values) {
            addCriterion("doctor_fee_id not in", values, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdBetween(String value1, String value2) {
            addCriterion("doctor_fee_id between", value1, value2, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeIdNotBetween(String value1, String value2) {
            addCriterion("doctor_fee_id not between", value1, value2, "doctorFeeId");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameIsNull() {
            addCriterion("doctor_fee_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameIsNotNull() {
            addCriterion("doctor_fee_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameEqualTo(String value) {
            addCriterion("doctor_fee_name =", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameNotEqualTo(String value) {
            addCriterion("doctor_fee_name <>", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameGreaterThan(String value) {
            addCriterion("doctor_fee_name >", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_fee_name >=", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameLessThan(String value) {
            addCriterion("doctor_fee_name <", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_fee_name <=", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameLike(String value) {
            addCriterion("doctor_fee_name like", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameNotLike(String value) {
            addCriterion("doctor_fee_name not like", value, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameIn(List<String> values) {
            addCriterion("doctor_fee_name in", values, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameNotIn(List<String> values) {
            addCriterion("doctor_fee_name not in", values, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameBetween(String value1, String value2) {
            addCriterion("doctor_fee_name between", value1, value2, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andDoctorFeeNameNotBetween(String value1, String value2) {
            addCriterion("doctor_fee_name not between", value1, value2, "doctorFeeName");
            return (Criteria) this;
        }

        public Criteria andPatientPausedIsNull() {
            addCriterion("patient_paused is null");
            return (Criteria) this;
        }

        public Criteria andPatientPausedIsNotNull() {
            addCriterion("patient_paused is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPausedEqualTo(Long value) {
            addCriterion("patient_paused =", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedNotEqualTo(Long value) {
            addCriterion("patient_paused <>", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedGreaterThan(Long value) {
            addCriterion("patient_paused >", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_paused >=", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedLessThan(Long value) {
            addCriterion("patient_paused <", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedLessThanOrEqualTo(Long value) {
            addCriterion("patient_paused <=", value, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedIn(List<Long> values) {
            addCriterion("patient_paused in", values, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedNotIn(List<Long> values) {
            addCriterion("patient_paused not in", values, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedBetween(Long value1, Long value2) {
            addCriterion("patient_paused between", value1, value2, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientPausedNotBetween(Long value1, Long value2) {
            addCriterion("patient_paused not between", value1, value2, "patientPaused");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedIsNull() {
            addCriterion("patient_final_locked is null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedIsNotNull() {
            addCriterion("patient_final_locked is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedEqualTo(Long value) {
            addCriterion("patient_final_locked =", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedNotEqualTo(Long value) {
            addCriterion("patient_final_locked <>", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedGreaterThan(Long value) {
            addCriterion("patient_final_locked >", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_final_locked >=", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedLessThan(Long value) {
            addCriterion("patient_final_locked <", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedLessThanOrEqualTo(Long value) {
            addCriterion("patient_final_locked <=", value, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedIn(List<Long> values) {
            addCriterion("patient_final_locked in", values, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedNotIn(List<Long> values) {
            addCriterion("patient_final_locked not in", values, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedBetween(Long value1, Long value2) {
            addCriterion("patient_final_locked between", value1, value2, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalLockedNotBetween(Long value1, Long value2) {
            addCriterion("patient_final_locked not between", value1, value2, "patientFinalLocked");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedIsNull() {
            addCriterion("patient_final_examed is null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedIsNotNull() {
            addCriterion("patient_final_examed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedEqualTo(Long value) {
            addCriterion("patient_final_examed =", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedNotEqualTo(Long value) {
            addCriterion("patient_final_examed <>", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedGreaterThan(Long value) {
            addCriterion("patient_final_examed >", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_final_examed >=", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedLessThan(Long value) {
            addCriterion("patient_final_examed <", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedLessThanOrEqualTo(Long value) {
            addCriterion("patient_final_examed <=", value, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedIn(List<Long> values) {
            addCriterion("patient_final_examed in", values, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedNotIn(List<Long> values) {
            addCriterion("patient_final_examed not in", values, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedBetween(Long value1, Long value2) {
            addCriterion("patient_final_examed between", value1, value2, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedNotBetween(Long value1, Long value2) {
            addCriterion("patient_final_examed not between", value1, value2, "patientFinalExamed");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedIsNull() {
            addCriterion("patient_final_approved is null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedIsNotNull() {
            addCriterion("patient_final_approved is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedEqualTo(Long value) {
            addCriterion("patient_final_approved =", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedNotEqualTo(Long value) {
            addCriterion("patient_final_approved <>", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedGreaterThan(Long value) {
            addCriterion("patient_final_approved >", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_final_approved >=", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedLessThan(Long value) {
            addCriterion("patient_final_approved <", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedLessThanOrEqualTo(Long value) {
            addCriterion("patient_final_approved <=", value, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedIn(List<Long> values) {
            addCriterion("patient_final_approved in", values, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedNotIn(List<Long> values) {
            addCriterion("patient_final_approved not in", values, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedBetween(Long value1, Long value2) {
            addCriterion("patient_final_approved between", value1, value2, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andPatientFinalApprovedNotBetween(Long value1, Long value2) {
            addCriterion("patient_final_approved not between", value1, value2, "patientFinalApproved");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdIsNull() {
            addCriterion("doctor_final_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdIsNotNull() {
            addCriterion("doctor_final_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdEqualTo(String value) {
            addCriterion("doctor_final_id =", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdNotEqualTo(String value) {
            addCriterion("doctor_final_id <>", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdGreaterThan(String value) {
            addCriterion("doctor_final_id >", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_final_id >=", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdLessThan(String value) {
            addCriterion("doctor_final_id <", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_final_id <=", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdLike(String value) {
            addCriterion("doctor_final_id like", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdNotLike(String value) {
            addCriterion("doctor_final_id not like", value, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdIn(List<String> values) {
            addCriterion("doctor_final_id in", values, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdNotIn(List<String> values) {
            addCriterion("doctor_final_id not in", values, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdBetween(String value1, String value2) {
            addCriterion("doctor_final_id between", value1, value2, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalIdNotBetween(String value1, String value2) {
            addCriterion("doctor_final_id not between", value1, value2, "doctorFinalId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameIsNull() {
            addCriterion("doctor_final_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameIsNotNull() {
            addCriterion("doctor_final_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameEqualTo(String value) {
            addCriterion("doctor_final_name =", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameNotEqualTo(String value) {
            addCriterion("doctor_final_name <>", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameGreaterThan(String value) {
            addCriterion("doctor_final_name >", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_final_name >=", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameLessThan(String value) {
            addCriterion("doctor_final_name <", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_final_name <=", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameLike(String value) {
            addCriterion("doctor_final_name like", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameNotLike(String value) {
            addCriterion("doctor_final_name not like", value, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameIn(List<String> values) {
            addCriterion("doctor_final_name in", values, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameNotIn(List<String> values) {
            addCriterion("doctor_final_name not in", values, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameBetween(String value1, String value2) {
            addCriterion("doctor_final_name between", value1, value2, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalNameNotBetween(String value1, String value2) {
            addCriterion("doctor_final_name not between", value1, value2, "doctorFinalName");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeIsNull() {
            addCriterion("patient_final_examed_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeIsNotNull() {
            addCriterion("patient_final_examed_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeEqualTo(Date value) {
            addCriterion("patient_final_examed_time =", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeNotEqualTo(Date value) {
            addCriterion("patient_final_examed_time <>", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeGreaterThan(Date value) {
            addCriterion("patient_final_examed_time >", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_final_examed_time >=", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeLessThan(Date value) {
            addCriterion("patient_final_examed_time <", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_final_examed_time <=", value, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeIn(List<Date> values) {
            addCriterion("patient_final_examed_time in", values, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeNotIn(List<Date> values) {
            addCriterion("patient_final_examed_time not in", values, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeBetween(Date value1, Date value2) {
            addCriterion("patient_final_examed_time between", value1, value2, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andPatientFinalExamedTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_final_examed_time not between", value1, value2, "patientFinalExamedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdIsNull() {
            addCriterion("doctor_final_approved_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdIsNotNull() {
            addCriterion("doctor_final_approved_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdEqualTo(String value) {
            addCriterion("doctor_final_approved_id =", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdNotEqualTo(String value) {
            addCriterion("doctor_final_approved_id <>", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdGreaterThan(String value) {
            addCriterion("doctor_final_approved_id >", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_final_approved_id >=", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdLessThan(String value) {
            addCriterion("doctor_final_approved_id <", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_final_approved_id <=", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdLike(String value) {
            addCriterion("doctor_final_approved_id like", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdNotLike(String value) {
            addCriterion("doctor_final_approved_id not like", value, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdIn(List<String> values) {
            addCriterion("doctor_final_approved_id in", values, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdNotIn(List<String> values) {
            addCriterion("doctor_final_approved_id not in", values, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdBetween(String value1, String value2) {
            addCriterion("doctor_final_approved_id between", value1, value2, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedIdNotBetween(String value1, String value2) {
            addCriterion("doctor_final_approved_id not between", value1, value2, "doctorFinalApprovedId");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameIsNull() {
            addCriterion("doctor_final_approved_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameIsNotNull() {
            addCriterion("doctor_final_approved_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameEqualTo(String value) {
            addCriterion("doctor_final_approved_name =", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameNotEqualTo(String value) {
            addCriterion("doctor_final_approved_name <>", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameGreaterThan(String value) {
            addCriterion("doctor_final_approved_name >", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_final_approved_name >=", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameLessThan(String value) {
            addCriterion("doctor_final_approved_name <", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_final_approved_name <=", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameLike(String value) {
            addCriterion("doctor_final_approved_name like", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameNotLike(String value) {
            addCriterion("doctor_final_approved_name not like", value, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameIn(List<String> values) {
            addCriterion("doctor_final_approved_name in", values, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameNotIn(List<String> values) {
            addCriterion("doctor_final_approved_name not in", values, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameBetween(String value1, String value2) {
            addCriterion("doctor_final_approved_name between", value1, value2, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedNameNotBetween(String value1, String value2) {
            addCriterion("doctor_final_approved_name not between", value1, value2, "doctorFinalApprovedName");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeIsNull() {
            addCriterion("doctor_final_approved_time is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeIsNotNull() {
            addCriterion("doctor_final_approved_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeEqualTo(Date value) {
            addCriterion("doctor_final_approved_time =", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeNotEqualTo(Date value) {
            addCriterion("doctor_final_approved_time <>", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeGreaterThan(Date value) {
            addCriterion("doctor_final_approved_time >", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("doctor_final_approved_time >=", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeLessThan(Date value) {
            addCriterion("doctor_final_approved_time <", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeLessThanOrEqualTo(Date value) {
            addCriterion("doctor_final_approved_time <=", value, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeIn(List<Date> values) {
            addCriterion("doctor_final_approved_time in", values, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeNotIn(List<Date> values) {
            addCriterion("doctor_final_approved_time not in", values, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeBetween(Date value1, Date value2) {
            addCriterion("doctor_final_approved_time between", value1, value2, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andDoctorFinalApprovedTimeNotBetween(Date value1, Date value2) {
            addCriterion("doctor_final_approved_time not between", value1, value2, "doctorFinalApprovedTime");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedIsNull() {
            addCriterion("patient_card_issued is null");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedIsNotNull() {
            addCriterion("patient_card_issued is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedEqualTo(Long value) {
            addCriterion("patient_card_issued =", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedNotEqualTo(Long value) {
            addCriterion("patient_card_issued <>", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedGreaterThan(Long value) {
            addCriterion("patient_card_issued >", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_card_issued >=", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedLessThan(Long value) {
            addCriterion("patient_card_issued <", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedLessThanOrEqualTo(Long value) {
            addCriterion("patient_card_issued <=", value, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedIn(List<Long> values) {
            addCriterion("patient_card_issued in", values, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedNotIn(List<Long> values) {
            addCriterion("patient_card_issued not in", values, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedBetween(Long value1, Long value2) {
            addCriterion("patient_card_issued between", value1, value2, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardIssuedNotBetween(Long value1, Long value2) {
            addCriterion("patient_card_issued not between", value1, value2, "patientCardIssued");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedIsNull() {
            addCriterion("patient_card_returned is null");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedIsNotNull() {
            addCriterion("patient_card_returned is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedEqualTo(Long value) {
            addCriterion("patient_card_returned =", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedNotEqualTo(Long value) {
            addCriterion("patient_card_returned <>", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedGreaterThan(Long value) {
            addCriterion("patient_card_returned >", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_card_returned >=", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedLessThan(Long value) {
            addCriterion("patient_card_returned <", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedLessThanOrEqualTo(Long value) {
            addCriterion("patient_card_returned <=", value, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedIn(List<Long> values) {
            addCriterion("patient_card_returned in", values, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedNotIn(List<Long> values) {
            addCriterion("patient_card_returned not in", values, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedBetween(Long value1, Long value2) {
            addCriterion("patient_card_returned between", value1, value2, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCardReturnedNotBetween(Long value1, Long value2) {
            addCriterion("patient_card_returned not between", value1, value2, "patientCardReturned");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedIsNull() {
            addCriterion("patient_cover_printed is null");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedIsNotNull() {
            addCriterion("patient_cover_printed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedEqualTo(Long value) {
            addCriterion("patient_cover_printed =", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedNotEqualTo(Long value) {
            addCriterion("patient_cover_printed <>", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedGreaterThan(Long value) {
            addCriterion("patient_cover_printed >", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_cover_printed >=", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedLessThan(Long value) {
            addCriterion("patient_cover_printed <", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedLessThanOrEqualTo(Long value) {
            addCriterion("patient_cover_printed <=", value, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedIn(List<Long> values) {
            addCriterion("patient_cover_printed in", values, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedNotIn(List<Long> values) {
            addCriterion("patient_cover_printed not in", values, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedBetween(Long value1, Long value2) {
            addCriterion("patient_cover_printed between", value1, value2, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientCoverPrintedNotBetween(Long value1, Long value2) {
            addCriterion("patient_cover_printed not between", value1, value2, "patientCoverPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedIsNull() {
            addCriterion("patient_report_printed is null");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedIsNotNull() {
            addCriterion("patient_report_printed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedEqualTo(Long value) {
            addCriterion("patient_report_printed =", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedNotEqualTo(Long value) {
            addCriterion("patient_report_printed <>", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedGreaterThan(Long value) {
            addCriterion("patient_report_printed >", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_report_printed >=", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedLessThan(Long value) {
            addCriterion("patient_report_printed <", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedLessThanOrEqualTo(Long value) {
            addCriterion("patient_report_printed <=", value, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedIn(List<Long> values) {
            addCriterion("patient_report_printed in", values, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedNotIn(List<Long> values) {
            addCriterion("patient_report_printed not in", values, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedBetween(Long value1, Long value2) {
            addCriterion("patient_report_printed between", value1, value2, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientReportPrintedNotBetween(Long value1, Long value2) {
            addCriterion("patient_report_printed not between", value1, value2, "patientReportPrinted");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdIsNull() {
            addCriterion("report_printed_by_id is null");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdIsNotNull() {
            addCriterion("report_printed_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdEqualTo(String value) {
            addCriterion("report_printed_by_id =", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdNotEqualTo(String value) {
            addCriterion("report_printed_by_id <>", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdGreaterThan(String value) {
            addCriterion("report_printed_by_id >", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_printed_by_id >=", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdLessThan(String value) {
            addCriterion("report_printed_by_id <", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdLessThanOrEqualTo(String value) {
            addCriterion("report_printed_by_id <=", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdLike(String value) {
            addCriterion("report_printed_by_id like", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdNotLike(String value) {
            addCriterion("report_printed_by_id not like", value, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdIn(List<String> values) {
            addCriterion("report_printed_by_id in", values, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdNotIn(List<String> values) {
            addCriterion("report_printed_by_id not in", values, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdBetween(String value1, String value2) {
            addCriterion("report_printed_by_id between", value1, value2, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByIdNotBetween(String value1, String value2) {
            addCriterion("report_printed_by_id not between", value1, value2, "reportPrintedById");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeIsNull() {
            addCriterion("report_printed_by_time is null");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeIsNotNull() {
            addCriterion("report_printed_by_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeEqualTo(Date value) {
            addCriterion("report_printed_by_time =", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeNotEqualTo(Date value) {
            addCriterion("report_printed_by_time <>", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeGreaterThan(Date value) {
            addCriterion("report_printed_by_time >", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_printed_by_time >=", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeLessThan(Date value) {
            addCriterion("report_printed_by_time <", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_printed_by_time <=", value, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeIn(List<Date> values) {
            addCriterion("report_printed_by_time in", values, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeNotIn(List<Date> values) {
            addCriterion("report_printed_by_time not in", values, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeBetween(Date value1, Date value2) {
            addCriterion("report_printed_by_time between", value1, value2, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportPrintedByTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_printed_by_time not between", value1, value2, "reportPrintedByTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedIsNull() {
            addCriterion("report_in_formed is null");
            return (Criteria) this;
        }

        public Criteria andReportInFormedIsNotNull() {
            addCriterion("report_in_formed is not null");
            return (Criteria) this;
        }

        public Criteria andReportInFormedEqualTo(Long value) {
            addCriterion("report_in_formed =", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedNotEqualTo(Long value) {
            addCriterion("report_in_formed <>", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedGreaterThan(Long value) {
            addCriterion("report_in_formed >", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedGreaterThanOrEqualTo(Long value) {
            addCriterion("report_in_formed >=", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedLessThan(Long value) {
            addCriterion("report_in_formed <", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedLessThanOrEqualTo(Long value) {
            addCriterion("report_in_formed <=", value, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedIn(List<Long> values) {
            addCriterion("report_in_formed in", values, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedNotIn(List<Long> values) {
            addCriterion("report_in_formed not in", values, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedBetween(Long value1, Long value2) {
            addCriterion("report_in_formed between", value1, value2, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedNotBetween(Long value1, Long value2) {
            addCriterion("report_in_formed not between", value1, value2, "reportInFormed");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeIsNull() {
            addCriterion("report_in_formed_time is null");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeIsNotNull() {
            addCriterion("report_in_formed_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeEqualTo(Date value) {
            addCriterion("report_in_formed_time =", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeNotEqualTo(Date value) {
            addCriterion("report_in_formed_time <>", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeGreaterThan(Date value) {
            addCriterion("report_in_formed_time >", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_in_formed_time >=", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeLessThan(Date value) {
            addCriterion("report_in_formed_time <", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_in_formed_time <=", value, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeIn(List<Date> values) {
            addCriterion("report_in_formed_time in", values, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeNotIn(List<Date> values) {
            addCriterion("report_in_formed_time not in", values, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeBetween(Date value1, Date value2) {
            addCriterion("report_in_formed_time between", value1, value2, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andReportInFormedTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_in_formed_time not between", value1, value2, "reportInFormedTime");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereIsNull() {
            addCriterion("patient_is_severe is null");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereIsNotNull() {
            addCriterion("patient_is_severe is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereEqualTo(Long value) {
            addCriterion("patient_is_severe =", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereNotEqualTo(Long value) {
            addCriterion("patient_is_severe <>", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereGreaterThan(Long value) {
            addCriterion("patient_is_severe >", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_is_severe >=", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereLessThan(Long value) {
            addCriterion("patient_is_severe <", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereLessThanOrEqualTo(Long value) {
            addCriterion("patient_is_severe <=", value, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereIn(List<Long> values) {
            addCriterion("patient_is_severe in", values, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereNotIn(List<Long> values) {
            addCriterion("patient_is_severe not in", values, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereBetween(Long value1, Long value2) {
            addCriterion("patient_is_severe between", value1, value2, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientIsSevereNotBetween(Long value1, Long value2) {
            addCriterion("patient_is_severe not between", value1, value2, "patientIsSevere");
            return (Criteria) this;
        }

        public Criteria andPatientClosedIsNull() {
            addCriterion("patient_closed is null");
            return (Criteria) this;
        }

        public Criteria andPatientClosedIsNotNull() {
            addCriterion("patient_closed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientClosedEqualTo(Long value) {
            addCriterion("patient_closed =", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedNotEqualTo(Long value) {
            addCriterion("patient_closed <>", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedGreaterThan(Long value) {
            addCriterion("patient_closed >", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_closed >=", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedLessThan(Long value) {
            addCriterion("patient_closed <", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedLessThanOrEqualTo(Long value) {
            addCriterion("patient_closed <=", value, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedIn(List<Long> values) {
            addCriterion("patient_closed in", values, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedNotIn(List<Long> values) {
            addCriterion("patient_closed not in", values, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedBetween(Long value1, Long value2) {
            addCriterion("patient_closed between", value1, value2, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedNotBetween(Long value1, Long value2) {
            addCriterion("patient_closed not between", value1, value2, "patientClosed");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeIsNull() {
            addCriterion("patient_closed_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeIsNotNull() {
            addCriterion("patient_closed_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeEqualTo(Date value) {
            addCriterion("patient_closed_time =", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeNotEqualTo(Date value) {
            addCriterion("patient_closed_time <>", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeGreaterThan(Date value) {
            addCriterion("patient_closed_time >", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_closed_time >=", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeLessThan(Date value) {
            addCriterion("patient_closed_time <", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_closed_time <=", value, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeIn(List<Date> values) {
            addCriterion("patient_closed_time in", values, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeNotIn(List<Date> values) {
            addCriterion("patient_closed_time not in", values, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeBetween(Date value1, Date value2) {
            addCriterion("patient_closed_time between", value1, value2, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientClosedTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_closed_time not between", value1, value2, "patientClosedTime");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedIsNull() {
            addCriterion("patient_need_traced is null");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedIsNotNull() {
            addCriterion("patient_need_traced is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedEqualTo(Long value) {
            addCriterion("patient_need_traced =", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedNotEqualTo(Long value) {
            addCriterion("patient_need_traced <>", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedGreaterThan(Long value) {
            addCriterion("patient_need_traced >", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_need_traced >=", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedLessThan(Long value) {
            addCriterion("patient_need_traced <", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedLessThanOrEqualTo(Long value) {
            addCriterion("patient_need_traced <=", value, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedIn(List<Long> values) {
            addCriterion("patient_need_traced in", values, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedNotIn(List<Long> values) {
            addCriterion("patient_need_traced not in", values, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedBetween(Long value1, Long value2) {
            addCriterion("patient_need_traced between", value1, value2, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientNeedTracedNotBetween(Long value1, Long value2) {
            addCriterion("patient_need_traced not between", value1, value2, "patientNeedTraced");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonIsNull() {
            addCriterion("patient_diff_person is null");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonIsNotNull() {
            addCriterion("patient_diff_person is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonEqualTo(Long value) {
            addCriterion("patient_diff_person =", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonNotEqualTo(Long value) {
            addCriterion("patient_diff_person <>", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonGreaterThan(Long value) {
            addCriterion("patient_diff_person >", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_diff_person >=", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonLessThan(Long value) {
            addCriterion("patient_diff_person <", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonLessThanOrEqualTo(Long value) {
            addCriterion("patient_diff_person <=", value, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonIn(List<Long> values) {
            addCriterion("patient_diff_person in", values, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonNotIn(List<Long> values) {
            addCriterion("patient_diff_person not in", values, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonBetween(Long value1, Long value2) {
            addCriterion("patient_diff_person between", value1, value2, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientDiffPersonNotBetween(Long value1, Long value2) {
            addCriterion("patient_diff_person not between", value1, value2, "patientDiffPerson");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllIsNull() {
            addCriterion("patient_settle_all is null");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllIsNotNull() {
            addCriterion("patient_settle_all is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllEqualTo(Long value) {
            addCriterion("patient_settle_all =", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllNotEqualTo(Long value) {
            addCriterion("patient_settle_all <>", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllGreaterThan(Long value) {
            addCriterion("patient_settle_all >", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_settle_all >=", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllLessThan(Long value) {
            addCriterion("patient_settle_all <", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllLessThanOrEqualTo(Long value) {
            addCriterion("patient_settle_all <=", value, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllIn(List<Long> values) {
            addCriterion("patient_settle_all in", values, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllNotIn(List<Long> values) {
            addCriterion("patient_settle_all not in", values, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllBetween(Long value1, Long value2) {
            addCriterion("patient_settle_all between", value1, value2, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientSettleAllNotBetween(Long value1, Long value2) {
            addCriterion("patient_settle_all not between", value1, value2, "patientSettleAll");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperIsNull() {
            addCriterion("patient_inner_oper is null");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperIsNotNull() {
            addCriterion("patient_inner_oper is not null");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperEqualTo(Long value) {
            addCriterion("patient_inner_oper =", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperNotEqualTo(Long value) {
            addCriterion("patient_inner_oper <>", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperGreaterThan(Long value) {
            addCriterion("patient_inner_oper >", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_inner_oper >=", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperLessThan(Long value) {
            addCriterion("patient_inner_oper <", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperLessThanOrEqualTo(Long value) {
            addCriterion("patient_inner_oper <=", value, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperIn(List<Long> values) {
            addCriterion("patient_inner_oper in", values, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperNotIn(List<Long> values) {
            addCriterion("patient_inner_oper not in", values, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperBetween(Long value1, Long value2) {
            addCriterion("patient_inner_oper between", value1, value2, "patientInnerOper");
            return (Criteria) this;
        }

        public Criteria andPatientInnerOperNotBetween(Long value1, Long value2) {
            addCriterion("patient_inner_oper not between", value1, value2, "patientInnerOper");
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

        public Criteria andExamItemValueServerDegreeEqualTo(String value) {
            addCriterion("exam_item_value_server_degree =", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotEqualTo(String value) {
            addCriterion("exam_item_value_server_degree <>", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeGreaterThan(String value) {
            addCriterion("exam_item_value_server_degree >", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_value_server_degree >=", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeLessThan(String value) {
            addCriterion("exam_item_value_server_degree <", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeLessThanOrEqualTo(String value) {
            addCriterion("exam_item_value_server_degree <=", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeLike(String value) {
            addCriterion("exam_item_value_server_degree like", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotLike(String value) {
            addCriterion("exam_item_value_server_degree not like", value, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeIn(List<String> values) {
            addCriterion("exam_item_value_server_degree in", values, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotIn(List<String> values) {
            addCriterion("exam_item_value_server_degree not in", values, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeBetween(String value1, String value2) {
            addCriterion("exam_item_value_server_degree between", value1, value2, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andExamItemValueServerDegreeNotBetween(String value1, String value2) {
            addCriterion("exam_item_value_server_degree not between", value1, value2, "examItemValueServerDegree");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteIsNull() {
            addCriterion("patient_server_degree_note is null");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteIsNotNull() {
            addCriterion("patient_server_degree_note is not null");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteEqualTo(String value) {
            addCriterion("patient_server_degree_note =", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteNotEqualTo(String value) {
            addCriterion("patient_server_degree_note <>", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteGreaterThan(String value) {
            addCriterion("patient_server_degree_note >", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("patient_server_degree_note >=", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteLessThan(String value) {
            addCriterion("patient_server_degree_note <", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteLessThanOrEqualTo(String value) {
            addCriterion("patient_server_degree_note <=", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteLike(String value) {
            addCriterion("patient_server_degree_note like", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteNotLike(String value) {
            addCriterion("patient_server_degree_note not like", value, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteIn(List<String> values) {
            addCriterion("patient_server_degree_note in", values, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteNotIn(List<String> values) {
            addCriterion("patient_server_degree_note not in", values, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteBetween(String value1, String value2) {
            addCriterion("patient_server_degree_note between", value1, value2, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientServerDegreeNoteNotBetween(String value1, String value2) {
            addCriterion("patient_server_degree_note not between", value1, value2, "patientServerDegreeNote");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedIsNull() {
            addCriterion("patient_severe_informed is null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedIsNotNull() {
            addCriterion("patient_severe_informed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedEqualTo(Long value) {
            addCriterion("patient_severe_informed =", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedNotEqualTo(Long value) {
            addCriterion("patient_severe_informed <>", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedGreaterThan(Long value) {
            addCriterion("patient_severe_informed >", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_severe_informed >=", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedLessThan(Long value) {
            addCriterion("patient_severe_informed <", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedLessThanOrEqualTo(Long value) {
            addCriterion("patient_severe_informed <=", value, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedIn(List<Long> values) {
            addCriterion("patient_severe_informed in", values, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedNotIn(List<Long> values) {
            addCriterion("patient_severe_informed not in", values, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedBetween(Long value1, Long value2) {
            addCriterion("patient_severe_informed between", value1, value2, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedNotBetween(Long value1, Long value2) {
            addCriterion("patient_severe_informed not between", value1, value2, "patientSevereInformed");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeIsNull() {
            addCriterion("patient_severe_informed_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeIsNotNull() {
            addCriterion("patient_severe_informed_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeEqualTo(Date value) {
            addCriterion("patient_severe_informed_time =", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeNotEqualTo(Date value) {
            addCriterion("patient_severe_informed_time <>", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeGreaterThan(Date value) {
            addCriterion("patient_severe_informed_time >", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_severe_informed_time >=", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeLessThan(Date value) {
            addCriterion("patient_severe_informed_time <", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_severe_informed_time <=", value, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeIn(List<Date> values) {
            addCriterion("patient_severe_informed_time in", values, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeNotIn(List<Date> values) {
            addCriterion("patient_severe_informed_time not in", values, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeBetween(Date value1, Date value2) {
            addCriterion("patient_severe_informed_time between", value1, value2, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_severe_informed_time not between", value1, value2, "patientSevereInformedTime");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByIsNull() {
            addCriterion("patient_severe_informed_time_by is null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByIsNotNull() {
            addCriterion("patient_severe_informed_time_by is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByEqualTo(String value) {
            addCriterion("patient_severe_informed_time_by =", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByNotEqualTo(String value) {
            addCriterion("patient_severe_informed_time_by <>", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByGreaterThan(String value) {
            addCriterion("patient_severe_informed_time_by >", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByGreaterThanOrEqualTo(String value) {
            addCriterion("patient_severe_informed_time_by >=", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByLessThan(String value) {
            addCriterion("patient_severe_informed_time_by <", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByLessThanOrEqualTo(String value) {
            addCriterion("patient_severe_informed_time_by <=", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByLike(String value) {
            addCriterion("patient_severe_informed_time_by like", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByNotLike(String value) {
            addCriterion("patient_severe_informed_time_by not like", value, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByIn(List<String> values) {
            addCriterion("patient_severe_informed_time_by in", values, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByNotIn(List<String> values) {
            addCriterion("patient_severe_informed_time_by not in", values, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByBetween(String value1, String value2) {
            addCriterion("patient_severe_informed_time_by between", value1, value2, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientSevereInformedTimeByNotBetween(String value1, String value2) {
            addCriterion("patient_severe_informed_time_by not between", value1, value2, "patientSevereInformedTimeBy");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksIsNull() {
            addCriterion("patient_interface_marks is null");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksIsNotNull() {
            addCriterion("patient_interface_marks is not null");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksEqualTo(String value) {
            addCriterion("patient_interface_marks =", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksNotEqualTo(String value) {
            addCriterion("patient_interface_marks <>", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksGreaterThan(String value) {
            addCriterion("patient_interface_marks >", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksGreaterThanOrEqualTo(String value) {
            addCriterion("patient_interface_marks >=", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksLessThan(String value) {
            addCriterion("patient_interface_marks <", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksLessThanOrEqualTo(String value) {
            addCriterion("patient_interface_marks <=", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksLike(String value) {
            addCriterion("patient_interface_marks like", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksNotLike(String value) {
            addCriterion("patient_interface_marks not like", value, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksIn(List<String> values) {
            addCriterion("patient_interface_marks in", values, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksNotIn(List<String> values) {
            addCriterion("patient_interface_marks not in", values, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksBetween(String value1, String value2) {
            addCriterion("patient_interface_marks between", value1, value2, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientInterfaceMarksNotBetween(String value1, String value2) {
            addCriterion("patient_interface_marks not between", value1, value2, "patientInterfaceMarks");
            return (Criteria) this;
        }

        public Criteria andPatientFlagIsNull() {
            addCriterion("patient_flag is null");
            return (Criteria) this;
        }

        public Criteria andPatientFlagIsNotNull() {
            addCriterion("patient_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFlagEqualTo(String value) {
            addCriterion("patient_flag =", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagNotEqualTo(String value) {
            addCriterion("patient_flag <>", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagGreaterThan(String value) {
            addCriterion("patient_flag >", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagGreaterThanOrEqualTo(String value) {
            addCriterion("patient_flag >=", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagLessThan(String value) {
            addCriterion("patient_flag <", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagLessThanOrEqualTo(String value) {
            addCriterion("patient_flag <=", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagLike(String value) {
            addCriterion("patient_flag like", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagNotLike(String value) {
            addCriterion("patient_flag not like", value, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagIn(List<String> values) {
            addCriterion("patient_flag in", values, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagNotIn(List<String> values) {
            addCriterion("patient_flag not in", values, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagBetween(String value1, String value2) {
            addCriterion("patient_flag between", value1, value2, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientFlagNotBetween(String value1, String value2) {
            addCriterion("patient_flag not between", value1, value2, "patientFlag");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeIsNull() {
            addCriterion("patient_start_at_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeIsNotNull() {
            addCriterion("patient_start_at_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeEqualTo(Date value) {
            addCriterion("patient_start_at_time =", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeNotEqualTo(Date value) {
            addCriterion("patient_start_at_time <>", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeGreaterThan(Date value) {
            addCriterion("patient_start_at_time >", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_start_at_time >=", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeLessThan(Date value) {
            addCriterion("patient_start_at_time <", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_start_at_time <=", value, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeIn(List<Date> values) {
            addCriterion("patient_start_at_time in", values, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeNotIn(List<Date> values) {
            addCriterion("patient_start_at_time not in", values, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeBetween(Date value1, Date value2) {
            addCriterion("patient_start_at_time between", value1, value2, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientStartAtTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_start_at_time not between", value1, value2, "patientStartAtTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeIsNull() {
            addCriterion("patient_result_last_change_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeIsNotNull() {
            addCriterion("patient_result_last_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeEqualTo(Date value) {
            addCriterion("patient_result_last_change_time =", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeNotEqualTo(Date value) {
            addCriterion("patient_result_last_change_time <>", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeGreaterThan(Date value) {
            addCriterion("patient_result_last_change_time >", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_change_time >=", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeLessThan(Date value) {
            addCriterion("patient_result_last_change_time <", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_change_time <=", value, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeIn(List<Date> values) {
            addCriterion("patient_result_last_change_time in", values, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeNotIn(List<Date> values) {
            addCriterion("patient_result_last_change_time not in", values, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_change_time between", value1, value2, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_change_time not between", value1, value2, "patientResultLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeIsNull() {
            addCriterion("patient_result_last_archive_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeIsNotNull() {
            addCriterion("patient_result_last_archive_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeEqualTo(Date value) {
            addCriterion("patient_result_last_archive_time =", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeNotEqualTo(Date value) {
            addCriterion("patient_result_last_archive_time <>", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeGreaterThan(Date value) {
            addCriterion("patient_result_last_archive_time >", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_archive_time >=", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeLessThan(Date value) {
            addCriterion("patient_result_last_archive_time <", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_archive_time <=", value, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeIn(List<Date> values) {
            addCriterion("patient_result_last_archive_time in", values, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeNotIn(List<Date> values) {
            addCriterion("patient_result_last_archive_time not in", values, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_archive_time between", value1, value2, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastArchiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_archive_time not between", value1, value2, "patientResultLastArchiveTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeIsNull() {
            addCriterion("patient_result_last_OLAP_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeIsNotNull() {
            addCriterion("patient_result_last_OLAP_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeEqualTo(Date value) {
            addCriterion("patient_result_last_OLAP_time =", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeNotEqualTo(Date value) {
            addCriterion("patient_result_last_OLAP_time <>", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeGreaterThan(Date value) {
            addCriterion("patient_result_last_OLAP_time >", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_OLAP_time >=", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeLessThan(Date value) {
            addCriterion("patient_result_last_OLAP_time <", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_result_last_OLAP_time <=", value, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeIn(List<Date> values) {
            addCriterion("patient_result_last_OLAP_time in", values, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeNotIn(List<Date> values) {
            addCriterion("patient_result_last_OLAP_time not in", values, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_OLAP_time between", value1, value2, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientResultLastOlapTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_result_last_OLAP_time not between", value1, value2, "patientResultLastOlapTime");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeIsNull() {
            addCriterion("patient_hospital_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeIsNotNull() {
            addCriterion("patient_hospital_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeEqualTo(String value) {
            addCriterion("patient_hospital_code =", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeNotEqualTo(String value) {
            addCriterion("patient_hospital_code <>", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeGreaterThan(String value) {
            addCriterion("patient_hospital_code >", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_hospital_code >=", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeLessThan(String value) {
            addCriterion("patient_hospital_code <", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_hospital_code <=", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeLike(String value) {
            addCriterion("patient_hospital_code like", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeNotLike(String value) {
            addCriterion("patient_hospital_code not like", value, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeIn(List<String> values) {
            addCriterion("patient_hospital_code in", values, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeNotIn(List<String> values) {
            addCriterion("patient_hospital_code not in", values, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeBetween(String value1, String value2) {
            addCriterion("patient_hospital_code between", value1, value2, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalCodeNotBetween(String value1, String value2) {
            addCriterion("patient_hospital_code not between", value1, value2, "patientHospitalCode");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameIsNull() {
            addCriterion("patient_hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameIsNotNull() {
            addCriterion("patient_hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameEqualTo(String value) {
            addCriterion("patient_hospital_name =", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameNotEqualTo(String value) {
            addCriterion("patient_hospital_name <>", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameGreaterThan(String value) {
            addCriterion("patient_hospital_name >", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_hospital_name >=", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameLessThan(String value) {
            addCriterion("patient_hospital_name <", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("patient_hospital_name <=", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameLike(String value) {
            addCriterion("patient_hospital_name like", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameNotLike(String value) {
            addCriterion("patient_hospital_name not like", value, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameIn(List<String> values) {
            addCriterion("patient_hospital_name in", values, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameNotIn(List<String> values) {
            addCriterion("patient_hospital_name not in", values, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameBetween(String value1, String value2) {
            addCriterion("patient_hospital_name between", value1, value2, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientHospitalNameNotBetween(String value1, String value2) {
            addCriterion("patient_hospital_name not between", value1, value2, "patientHospitalName");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusIsNull() {
            addCriterion("patient_detail_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusIsNotNull() {
            addCriterion("patient_detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusEqualTo(Integer value) {
            addCriterion("patient_detail_status =", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusNotEqualTo(Integer value) {
            addCriterion("patient_detail_status <>", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusGreaterThan(Integer value) {
            addCriterion("patient_detail_status >", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_detail_status >=", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusLessThan(Integer value) {
            addCriterion("patient_detail_status <", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_detail_status <=", value, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusIn(List<Integer> values) {
            addCriterion("patient_detail_status in", values, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusNotIn(List<Integer> values) {
            addCriterion("patient_detail_status not in", values, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_detail_status between", value1, value2, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_detail_status not between", value1, value2, "patientDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeIsNull() {
            addCriterion("patient_detail_crate_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeIsNotNull() {
            addCriterion("patient_detail_crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeEqualTo(Date value) {
            addCriterion("patient_detail_crate_time =", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeNotEqualTo(Date value) {
            addCriterion("patient_detail_crate_time <>", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeGreaterThan(Date value) {
            addCriterion("patient_detail_crate_time >", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_detail_crate_time >=", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeLessThan(Date value) {
            addCriterion("patient_detail_crate_time <", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_detail_crate_time <=", value, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeIn(List<Date> values) {
            addCriterion("patient_detail_crate_time in", values, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeNotIn(List<Date> values) {
            addCriterion("patient_detail_crate_time not in", values, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_detail_crate_time between", value1, value2, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_detail_crate_time not between", value1, value2, "patientDetailCrateTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeIsNull() {
            addCriterion("patient_detail_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeIsNotNull() {
            addCriterion("patient_detail_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeEqualTo(Date value) {
            addCriterion("patient_detail_edit_time =", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeNotEqualTo(Date value) {
            addCriterion("patient_detail_edit_time <>", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeGreaterThan(Date value) {
            addCriterion("patient_detail_edit_time >", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_detail_edit_time >=", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeLessThan(Date value) {
            addCriterion("patient_detail_edit_time <", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_detail_edit_time <=", value, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeIn(List<Date> values) {
            addCriterion("patient_detail_edit_time in", values, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeNotIn(List<Date> values) {
            addCriterion("patient_detail_edit_time not in", values, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_detail_edit_time between", value1, value2, "patientDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientDetailEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_detail_edit_time not between", value1, value2, "patientDetailEditTime");
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