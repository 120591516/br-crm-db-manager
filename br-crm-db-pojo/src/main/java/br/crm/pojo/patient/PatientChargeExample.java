package br.crm.pojo.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientChargeExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientChargeExample() {
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

        public Criteria andPatientChargeIdIsNull() {
            addCriterion("patient_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdIsNotNull() {
            addCriterion("patient_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdEqualTo(String value) {
            addCriterion("patient_charge_id =", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdNotEqualTo(String value) {
            addCriterion("patient_charge_id <>", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdGreaterThan(String value) {
            addCriterion("patient_charge_id >", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_charge_id >=", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdLessThan(String value) {
            addCriterion("patient_charge_id <", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdLessThanOrEqualTo(String value) {
            addCriterion("patient_charge_id <=", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdLike(String value) {
            addCriterion("patient_charge_id like", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdNotLike(String value) {
            addCriterion("patient_charge_id not like", value, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdIn(List<String> values) {
            addCriterion("patient_charge_id in", values, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdNotIn(List<String> values) {
            addCriterion("patient_charge_id not in", values, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdBetween(String value1, String value2) {
            addCriterion("patient_charge_id between", value1, value2, "patientChargeId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIdNotBetween(String value1, String value2) {
            addCriterion("patient_charge_id not between", value1, value2, "patientChargeId");
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

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNull() {
            addCriterion("pay_way_name is null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNotNull() {
            addCriterion("pay_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameEqualTo(String value) {
            addCriterion("pay_way_name =", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotEqualTo(String value) {
            addCriterion("pay_way_name <>", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThan(String value) {
            addCriterion("pay_way_name >", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_name >=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThan(String value) {
            addCriterion("pay_way_name <", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_way_name <=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLike(String value) {
            addCriterion("pay_way_name like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotLike(String value) {
            addCriterion("pay_way_name not like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIn(List<String> values) {
            addCriterion("pay_way_name in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotIn(List<String> values) {
            addCriterion("pay_way_name not in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameBetween(String value1, String value2) {
            addCriterion("pay_way_name between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotBetween(String value1, String value2) {
            addCriterion("pay_way_name not between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountIsNull() {
            addCriterion("patient_charge_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountIsNotNull() {
            addCriterion("patient_charge_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount =", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountNotEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount <>", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountGreaterThan(BigDecimal value) {
            addCriterion("patient_charge_money_amount >", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount >=", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountLessThan(BigDecimal value) {
            addCriterion("patient_charge_money_amount <", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount <=", value, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountIn(List<BigDecimal> values) {
            addCriterion("patient_charge_money_amount in", values, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountNotIn(List<BigDecimal> values) {
            addCriterion("patient_charge_money_amount not in", values, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_charge_money_amount between", value1, value2, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_charge_money_amount not between", value1, value2, "patientChargeMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidIsNull() {
            addCriterion("patient_charge_money_amount_paid is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidIsNotNull() {
            addCriterion("patient_charge_money_amount_paid is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid =", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidNotEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid <>", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidGreaterThan(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid >", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid >=", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidLessThan(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid <", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_charge_money_amount_paid <=", value, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidIn(List<BigDecimal> values) {
            addCriterion("patient_charge_money_amount_paid in", values, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidNotIn(List<BigDecimal> values) {
            addCriterion("patient_charge_money_amount_paid not in", values, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_charge_money_amount_paid between", value1, value2, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeMoneyAmountPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_charge_money_amount_paid not between", value1, value2, "patientChargeMoneyAmountPaid");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedIsNull() {
            addCriterion("patient_charge_FeeConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedIsNotNull() {
            addCriterion("patient_charge_FeeConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedEqualTo(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed =", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedNotEqualTo(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed <>", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedGreaterThan(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed >", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed >=", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedLessThan(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed <", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_FeeConfirmed <=", value, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedIn(List<Boolean> values) {
            addCriterion("patient_charge_FeeConfirmed in", values, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedNotIn(List<Boolean> values) {
            addCriterion("patient_charge_FeeConfirmed not in", values, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_FeeConfirmed between", value1, value2, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeconfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_FeeConfirmed not between", value1, value2, "patientChargeFeeconfirmed");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaIsNull() {
            addCriterion("patient_charge_work_by_org_delta is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaIsNotNull() {
            addCriterion("patient_charge_work_by_org_delta is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaEqualTo(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta =", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaNotEqualTo(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta <>", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaGreaterThan(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta >", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta >=", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaLessThan(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta <", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_work_by_org_delta <=", value, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaIn(List<Boolean> values) {
            addCriterion("patient_charge_work_by_org_delta in", values, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaNotIn(List<Boolean> values) {
            addCriterion("patient_charge_work_by_org_delta not in", values, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_work_by_org_delta between", value1, value2, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkByOrgDeltaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_work_by_org_delta not between", value1, value2, "patientChargeWorkByOrgDelta");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedIsNull() {
            addCriterion("patient_charge_fee_transfered is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedIsNotNull() {
            addCriterion("patient_charge_fee_transfered is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_transfered =", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedNotEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_transfered <>", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedGreaterThan(Boolean value) {
            addCriterion("patient_charge_fee_transfered >", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_transfered >=", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedLessThan(Boolean value) {
            addCriterion("patient_charge_fee_transfered <", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_transfered <=", value, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_transfered in", values, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedNotIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_transfered not in", values, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_transfered between", value1, value2, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeTransferedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_transfered not between", value1, value2, "patientChargeFeeTransfered");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedIsNull() {
            addCriterion("patient_charge_fee_charged is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedIsNotNull() {
            addCriterion("patient_charge_fee_charged is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged =", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedNotEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged <>", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedGreaterThan(Boolean value) {
            addCriterion("patient_charge_fee_charged >", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged >=", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedLessThan(Boolean value) {
            addCriterion("patient_charge_fee_charged <", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged <=", value, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_charged in", values, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedNotIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_charged not in", values, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_charged between", value1, value2, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_charged not between", value1, value2, "patientChargeFeeCharged");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditIsNull() {
            addCriterion("patient_charge_fee_charged_on_credit is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditIsNotNull() {
            addCriterion("patient_charge_fee_charged_on_credit is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit =", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditNotEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit <>", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditGreaterThan(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit >", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit >=", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditLessThan(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit <", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_fee_charged_on_credit <=", value, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_charged_on_credit in", values, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditNotIn(List<Boolean> values) {
            addCriterion("patient_charge_fee_charged_on_credit not in", values, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_charged_on_credit between", value1, value2, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeFeeChargedOnCreditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_fee_charged_on_credit not between", value1, value2, "patientChargeFeeChargedOnCredit");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnIsNull() {
            addCriterion("patient_charge_is_return is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnIsNotNull() {
            addCriterion("patient_charge_is_return is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnEqualTo(Boolean value) {
            addCriterion("patient_charge_is_return =", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnNotEqualTo(Boolean value) {
            addCriterion("patient_charge_is_return <>", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnGreaterThan(Boolean value) {
            addCriterion("patient_charge_is_return >", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_is_return >=", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnLessThan(Boolean value) {
            addCriterion("patient_charge_is_return <", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_is_return <=", value, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnIn(List<Boolean> values) {
            addCriterion("patient_charge_is_return in", values, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnNotIn(List<Boolean> values) {
            addCriterion("patient_charge_is_return not in", values, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_is_return between", value1, value2, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeIsReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_is_return not between", value1, value2, "patientChargeIsReturn");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedIsNull() {
            addCriterion("patient_charge_receipt_printed is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedIsNotNull() {
            addCriterion("patient_charge_receipt_printed is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedEqualTo(Boolean value) {
            addCriterion("patient_charge_receipt_printed =", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedNotEqualTo(Boolean value) {
            addCriterion("patient_charge_receipt_printed <>", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedGreaterThan(Boolean value) {
            addCriterion("patient_charge_receipt_printed >", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_receipt_printed >=", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedLessThan(Boolean value) {
            addCriterion("patient_charge_receipt_printed <", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_receipt_printed <=", value, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedIn(List<Boolean> values) {
            addCriterion("patient_charge_receipt_printed in", values, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedNotIn(List<Boolean> values) {
            addCriterion("patient_charge_receipt_printed not in", values, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_receipt_printed between", value1, value2, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeReceiptPrintedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_receipt_printed not between", value1, value2, "patientChargeReceiptPrinted");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdIsNull() {
            addCriterion("patient_charge_charger_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdIsNotNull() {
            addCriterion("patient_charge_charger_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdEqualTo(String value) {
            addCriterion("patient_charge_charger_id =", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdNotEqualTo(String value) {
            addCriterion("patient_charge_charger_id <>", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdGreaterThan(String value) {
            addCriterion("patient_charge_charger_id >", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_charge_charger_id >=", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdLessThan(String value) {
            addCriterion("patient_charge_charger_id <", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdLessThanOrEqualTo(String value) {
            addCriterion("patient_charge_charger_id <=", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdLike(String value) {
            addCriterion("patient_charge_charger_id like", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdNotLike(String value) {
            addCriterion("patient_charge_charger_id not like", value, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdIn(List<String> values) {
            addCriterion("patient_charge_charger_id in", values, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdNotIn(List<String> values) {
            addCriterion("patient_charge_charger_id not in", values, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdBetween(String value1, String value2) {
            addCriterion("patient_charge_charger_id between", value1, value2, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargerIdNotBetween(String value1, String value2) {
            addCriterion("patient_charge_charger_id not between", value1, value2, "patientChargeChargerId");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeIsNull() {
            addCriterion("patient_charge_charge_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeIsNotNull() {
            addCriterion("patient_charge_charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeEqualTo(Date value) {
            addCriterion("patient_charge_charge_time =", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeNotEqualTo(Date value) {
            addCriterion("patient_charge_charge_time <>", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeGreaterThan(Date value) {
            addCriterion("patient_charge_charge_time >", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_charge_charge_time >=", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeLessThan(Date value) {
            addCriterion("patient_charge_charge_time <", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_charge_charge_time <=", value, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeIn(List<Date> values) {
            addCriterion("patient_charge_charge_time in", values, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeNotIn(List<Date> values) {
            addCriterion("patient_charge_charge_time not in", values, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeBetween(Date value1, Date value2) {
            addCriterion("patient_charge_charge_time between", value1, value2, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_charge_charge_time not between", value1, value2, "patientChargeChargeTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordIsNull() {
            addCriterion("patient_charge_ver_this_record is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordIsNotNull() {
            addCriterion("patient_charge_ver_this_record is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordEqualTo(Integer value) {
            addCriterion("patient_charge_ver_this_record =", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordNotEqualTo(Integer value) {
            addCriterion("patient_charge_ver_this_record <>", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordGreaterThan(Integer value) {
            addCriterion("patient_charge_ver_this_record >", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_charge_ver_this_record >=", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordLessThan(Integer value) {
            addCriterion("patient_charge_ver_this_record <", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordLessThanOrEqualTo(Integer value) {
            addCriterion("patient_charge_ver_this_record <=", value, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordIn(List<Integer> values) {
            addCriterion("patient_charge_ver_this_record in", values, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordNotIn(List<Integer> values) {
            addCriterion("patient_charge_ver_this_record not in", values, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordBetween(Integer value1, Integer value2) {
            addCriterion("patient_charge_ver_this_record between", value1, value2, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeVerThisRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_charge_ver_this_record not between", value1, value2, "patientChargeVerThisRecord");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyIsNull() {
            addCriterion("patient_charge_work_inner_modify is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyIsNotNull() {
            addCriterion("patient_charge_work_inner_modify is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyEqualTo(Boolean value) {
            addCriterion("patient_charge_work_inner_modify =", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyNotEqualTo(Boolean value) {
            addCriterion("patient_charge_work_inner_modify <>", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyGreaterThan(Boolean value) {
            addCriterion("patient_charge_work_inner_modify >", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_work_inner_modify >=", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyLessThan(Boolean value) {
            addCriterion("patient_charge_work_inner_modify <", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_charge_work_inner_modify <=", value, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyIn(List<Boolean> values) {
            addCriterion("patient_charge_work_inner_modify in", values, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyNotIn(List<Boolean> values) {
            addCriterion("patient_charge_work_inner_modify not in", values, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_work_inner_modify between", value1, value2, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeWorkInnerModifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_charge_work_inner_modify not between", value1, value2, "patientChargeWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeIsNull() {
            addCriterion("patient_charge_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeIsNotNull() {
            addCriterion("patient_charge_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeEqualTo(Date value) {
            addCriterion("patient_charge_create_time =", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_charge_create_time <>", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeGreaterThan(Date value) {
            addCriterion("patient_charge_create_time >", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_charge_create_time >=", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeLessThan(Date value) {
            addCriterion("patient_charge_create_time <", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_charge_create_time <=", value, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeIn(List<Date> values) {
            addCriterion("patient_charge_create_time in", values, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_charge_create_time not in", values, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_charge_create_time between", value1, value2, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_charge_create_time not between", value1, value2, "patientChargeCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeIsNull() {
            addCriterion("patient_charge_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeIsNotNull() {
            addCriterion("patient_charge_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeEqualTo(Date value) {
            addCriterion("patient_charge_edit_time =", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeNotEqualTo(Date value) {
            addCriterion("patient_charge_edit_time <>", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeGreaterThan(Date value) {
            addCriterion("patient_charge_edit_time >", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_charge_edit_time >=", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeLessThan(Date value) {
            addCriterion("patient_charge_edit_time <", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_charge_edit_time <=", value, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeIn(List<Date> values) {
            addCriterion("patient_charge_edit_time in", values, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeNotIn(List<Date> values) {
            addCriterion("patient_charge_edit_time not in", values, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_charge_edit_time between", value1, value2, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_charge_edit_time not between", value1, value2, "patientChargeEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusIsNull() {
            addCriterion("patient_charge_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusIsNotNull() {
            addCriterion("patient_charge_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusEqualTo(Integer value) {
            addCriterion("patient_charge_status =", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusNotEqualTo(Integer value) {
            addCriterion("patient_charge_status <>", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusGreaterThan(Integer value) {
            addCriterion("patient_charge_status >", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_charge_status >=", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusLessThan(Integer value) {
            addCriterion("patient_charge_status <", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_charge_status <=", value, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusIn(List<Integer> values) {
            addCriterion("patient_charge_status in", values, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusNotIn(List<Integer> values) {
            addCriterion("patient_charge_status not in", values, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_charge_status between", value1, value2, "patientChargeStatus");
            return (Criteria) this;
        }

        public Criteria andPatientChargeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_charge_status not between", value1, value2, "patientChargeStatus");
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