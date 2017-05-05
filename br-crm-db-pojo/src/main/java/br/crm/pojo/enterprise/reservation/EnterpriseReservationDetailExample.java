package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseReservationDetailExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseReservationDetailExample() {
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

        public Criteria andEnterpriseReservationDetailIdIsNull() {
            addCriterion("enterprise_reservation_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdIsNotNull() {
            addCriterion("enterprise_reservation_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdEqualTo(String value) {
            addCriterion("enterprise_reservation_detail_id =", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdNotEqualTo(String value) {
            addCriterion("enterprise_reservation_detail_id <>", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdGreaterThan(String value) {
            addCriterion("enterprise_reservation_detail_id >", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_detail_id >=", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdLessThan(String value) {
            addCriterion("enterprise_reservation_detail_id <", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_detail_id <=", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdLike(String value) {
            addCriterion("enterprise_reservation_detail_id like", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdNotLike(String value) {
            addCriterion("enterprise_reservation_detail_id not like", value, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdIn(List<String> values) {
            addCriterion("enterprise_reservation_detail_id in", values, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdNotIn(List<String> values) {
            addCriterion("enterprise_reservation_detail_id not in", values, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_detail_id between", value1, value2, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_detail_id not between", value1, value2, "enterpriseReservationDetailId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIsNull() {
            addCriterion("enterprise_reservation_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIsNotNull() {
            addCriterion("enterprise_reservation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdEqualTo(String value) {
            addCriterion("enterprise_reservation_id =", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotEqualTo(String value) {
            addCriterion("enterprise_reservation_id <>", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdGreaterThan(String value) {
            addCriterion("enterprise_reservation_id >", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_id >=", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLessThan(String value) {
            addCriterion("enterprise_reservation_id <", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_id <=", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLike(String value) {
            addCriterion("enterprise_reservation_id like", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotLike(String value) {
            addCriterion("enterprise_reservation_id not like", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIn(List<String> values) {
            addCriterion("enterprise_reservation_id in", values, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotIn(List<String> values) {
            addCriterion("enterprise_reservation_id not in", values, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_id between", value1, value2, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_id not between", value1, value2, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerIsNull() {
            addCriterion("enterprise_reservation_count_customer is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerIsNotNull() {
            addCriterion("enterprise_reservation_count_customer is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_customer =", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_customer <>", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_count_customer >", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_customer >=", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerLessThan(Integer value) {
            addCriterion("enterprise_reservation_count_customer <", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_customer <=", value, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerIn(List<Integer> values) {
            addCriterion("enterprise_reservation_count_customer in", values, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_count_customer not in", values, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_count_customer between", value1, value2, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountCustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_count_customer not between", value1, value2, "enterpriseReservationCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredIsNull() {
            addCriterion("enterprise_reservation_count_registered is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredIsNotNull() {
            addCriterion("enterprise_reservation_count_registered is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_registered =", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_registered <>", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_count_registered >", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_registered >=", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredLessThan(Integer value) {
            addCriterion("enterprise_reservation_count_registered <", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_count_registered <=", value, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredIn(List<Integer> values) {
            addCriterion("enterprise_reservation_count_registered in", values, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_count_registered not in", values, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_count_registered between", value1, value2, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCountRegisteredNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_count_registered not between", value1, value2, "enterpriseReservationCountRegistered");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedIsNull() {
            addCriterion("enterprise_reservation_full_finished is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedIsNotNull() {
            addCriterion("enterprise_reservation_full_finished is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedEqualTo(Integer value) {
            addCriterion("enterprise_reservation_full_finished =", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_full_finished <>", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_full_finished >", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_full_finished >=", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedLessThan(Integer value) {
            addCriterion("enterprise_reservation_full_finished <", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_full_finished <=", value, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedIn(List<Integer> values) {
            addCriterion("enterprise_reservation_full_finished in", values, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_full_finished not in", values, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_full_finished between", value1, value2, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFullFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_full_finished not between", value1, value2, "enterpriseReservationFullFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedIsNull() {
            addCriterion("enterprise_reservation_part_finished is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedIsNotNull() {
            addCriterion("enterprise_reservation_part_finished is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedEqualTo(Integer value) {
            addCriterion("enterprise_reservation_part_finished =", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_part_finished <>", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_part_finished >", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_part_finished >=", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedLessThan(Integer value) {
            addCriterion("enterprise_reservation_part_finished <", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_part_finished <=", value, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedIn(List<Integer> values) {
            addCriterion("enterprise_reservation_part_finished in", values, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_part_finished not in", values, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_part_finished between", value1, value2, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPartFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_part_finished not between", value1, value2, "enterpriseReservationPartFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountIsNull() {
            addCriterion("enterprise_reservation_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountIsNotNull() {
            addCriterion("enterprise_reservation_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount =", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount <>", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountGreaterThan(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount >", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount >=", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountLessThan(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount <", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_money_amount <=", value, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_money_amount in", values, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_money_amount not in", values, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_money_amount between", value1, value2, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationMoneyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_money_amount not between", value1, value2, "enterpriseReservationMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountIsNull() {
            addCriterion("enterprise_reservation_settled_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountIsNotNull() {
            addCriterion("enterprise_reservation_settled_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount =", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount <>", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountGreaterThan(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount >", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount >=", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountLessThan(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount <", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_settled_money_amount <=", value, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_settled_money_amount in", values, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_settled_money_amount not in", values, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_settled_money_amount between", value1, value2, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSettledMoneyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_settled_money_amount not between", value1, value2, "enterpriseReservationSettledMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidIsNull() {
            addCriterion("enterprise_reservation_paid is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidIsNotNull() {
            addCriterion("enterprise_reservation_paid is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_paid =", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_paid <>", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidGreaterThan(BigDecimal value) {
            addCriterion("enterprise_reservation_paid >", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_paid >=", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidLessThan(BigDecimal value) {
            addCriterion("enterprise_reservation_paid <", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_reservation_paid <=", value, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_paid in", values, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_reservation_paid not in", values, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_paid between", value1, value2, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_reservation_paid not between", value1, value2, "enterpriseReservationPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeIsNull() {
            addCriterion("enterprise_reservation_final_settled_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeIsNotNull() {
            addCriterion("enterprise_reservation_final_settled_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_settled_time =", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_settled_time <>", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_final_settled_time >", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_settled_time >=", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_final_settled_time <", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_settled_time <=", value, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_final_settled_time in", values, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_final_settled_time not in", values, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_final_settled_time between", value1, value2, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalSettledTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_final_settled_time not between", value1, value2, "enterpriseReservationFinalSettledTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidIsNull() {
            addCriterion("enterprise_reservation_finished_paid is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidIsNotNull() {
            addCriterion("enterprise_reservation_finished_paid is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid =", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidNotEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid <>", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidGreaterThan(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid >", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid >=", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidLessThan(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid <", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidLessThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished_paid <=", value, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_finished_paid in", values, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidNotIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_finished_paid not in", values, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_finished_paid between", value1, value2, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedPaidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_finished_paid not between", value1, value2, "enterpriseReservationFinishedPaid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedIsNull() {
            addCriterion("enterprise_reservation_finished is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedIsNotNull() {
            addCriterion("enterprise_reservation_finished is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished =", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedNotEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished <>", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedGreaterThan(Boolean value) {
            addCriterion("enterprise_reservation_finished >", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished >=", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedLessThan(Boolean value) {
            addCriterion("enterprise_reservation_finished <", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedLessThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_finished <=", value, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_finished in", values, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedNotIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_finished not in", values, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_finished between", value1, value2, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_finished not between", value1, value2, "enterpriseReservationFinished");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusIsNull() {
            addCriterion("enterprise_reservation_detail_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusIsNotNull() {
            addCriterion("enterprise_reservation_detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusEqualTo(Integer value) {
            addCriterion("enterprise_reservation_detail_status =", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_detail_status <>", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_detail_status >", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_detail_status >=", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusLessThan(Integer value) {
            addCriterion("enterprise_reservation_detail_status <", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_detail_status <=", value, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusIn(List<Integer> values) {
            addCriterion("enterprise_reservation_detail_status in", values, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_detail_status not in", values, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_detail_status between", value1, value2, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_detail_status not between", value1, value2, "enterpriseReservationDetailStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeIsNull() {
            addCriterion("enterprise_reservation_detail_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeIsNotNull() {
            addCriterion("enterprise_reservation_detail_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_create_time =", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_create_time <>", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_detail_create_time >", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_create_time >=", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_detail_create_time <", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_create_time <=", value, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_detail_create_time in", values, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_detail_create_time not in", values, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_detail_create_time between", value1, value2, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_detail_create_time not between", value1, value2, "enterpriseReservationDetailCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeIsNull() {
            addCriterion("enterprise_reservation_detail_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeIsNotNull() {
            addCriterion("enterprise_reservation_detail_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time =", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time <>", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time >", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time >=", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time <", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_detail_edit_time <=", value, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_detail_edit_time in", values, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_detail_edit_time not in", values, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_detail_edit_time between", value1, value2, "enterpriseReservationDetailEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationDetailEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_detail_edit_time not between", value1, value2, "enterpriseReservationDetailEditTime");
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