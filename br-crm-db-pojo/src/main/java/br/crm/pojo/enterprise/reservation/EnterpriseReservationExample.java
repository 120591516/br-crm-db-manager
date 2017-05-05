package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseReservationExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseReservationExample() {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIsNull() {
            addCriterion("enterprise_org_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIsNotNull() {
            addCriterion("enterprise_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdEqualTo(String value) {
            addCriterion("enterprise_org_id =", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotEqualTo(String value) {
            addCriterion("enterprise_org_id <>", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdGreaterThan(String value) {
            addCriterion("enterprise_org_id >", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_id >=", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLessThan(String value) {
            addCriterion("enterprise_org_id <", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_id <=", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLike(String value) {
            addCriterion("enterprise_org_id like", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotLike(String value) {
            addCriterion("enterprise_org_id not like", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIn(List<String> values) {
            addCriterion("enterprise_org_id in", values, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotIn(List<String> values) {
            addCriterion("enterprise_org_id not in", values, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdBetween(String value1, String value2) {
            addCriterion("enterprise_org_id between", value1, value2, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_id not between", value1, value2, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressIsNull() {
            addCriterion("enterprise_reservation_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressIsNotNull() {
            addCriterion("enterprise_reservation_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressEqualTo(String value) {
            addCriterion("enterprise_reservation_address =", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressNotEqualTo(String value) {
            addCriterion("enterprise_reservation_address <>", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressGreaterThan(String value) {
            addCriterion("enterprise_reservation_address >", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_address >=", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressLessThan(String value) {
            addCriterion("enterprise_reservation_address <", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_address <=", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressLike(String value) {
            addCriterion("enterprise_reservation_address like", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressNotLike(String value) {
            addCriterion("enterprise_reservation_address not like", value, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressIn(List<String> values) {
            addCriterion("enterprise_reservation_address in", values, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressNotIn(List<String> values) {
            addCriterion("enterprise_reservation_address not in", values, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_address between", value1, value2, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationAddressNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_address not between", value1, value2, "enterpriseReservationAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactIsNull() {
            addCriterion("enterprise_reservation_contact is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactIsNotNull() {
            addCriterion("enterprise_reservation_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactEqualTo(String value) {
            addCriterion("enterprise_reservation_contact =", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactNotEqualTo(String value) {
            addCriterion("enterprise_reservation_contact <>", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactGreaterThan(String value) {
            addCriterion("enterprise_reservation_contact >", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_contact >=", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactLessThan(String value) {
            addCriterion("enterprise_reservation_contact <", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_contact <=", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactLike(String value) {
            addCriterion("enterprise_reservation_contact like", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactNotLike(String value) {
            addCriterion("enterprise_reservation_contact not like", value, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactIn(List<String> values) {
            addCriterion("enterprise_reservation_contact in", values, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactNotIn(List<String> values) {
            addCriterion("enterprise_reservation_contact not in", values, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_contact between", value1, value2, "enterpriseReservationContact");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationContactNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_contact not between", value1, value2, "enterpriseReservationContact");
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

        public Criteria andEnterpriseReservationTimeIsNull() {
            addCriterion("enterprise_reservation_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeIsNotNull() {
            addCriterion("enterprise_reservation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_time =", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_time <>", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_time >", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_time >=", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_time <", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_time <=", value, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_time in", values, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_time not in", values, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_time between", value1, value2, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_time not between", value1, value2, "enterpriseReservationTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeIsNull() {
            addCriterion("enterprise_reservation_final_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeIsNotNull() {
            addCriterion("enterprise_reservation_final_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_time =", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_time <>", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_final_time >", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_time >=", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_final_time <", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_final_time <=", value, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_final_time in", values, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_final_time not in", values, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_final_time between", value1, value2, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationFinalTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_final_time not between", value1, value2, "enterpriseReservationFinalTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedIsNull() {
            addCriterion("enterprise_reservation_hided is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedIsNotNull() {
            addCriterion("enterprise_reservation_hided is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_hided =", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedNotEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_hided <>", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedGreaterThan(Boolean value) {
            addCriterion("enterprise_reservation_hided >", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_hided >=", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedLessThan(Boolean value) {
            addCriterion("enterprise_reservation_hided <", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedLessThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_hided <=", value, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_hided in", values, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedNotIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_hided not in", values, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_hided between", value1, value2, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationHidedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_hided not between", value1, value2, "enterpriseReservationHided");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableIsNull() {
            addCriterion("enterprise_reservation_selectable is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableIsNotNull() {
            addCriterion("enterprise_reservation_selectable is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_selectable =", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableNotEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_selectable <>", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableGreaterThan(Boolean value) {
            addCriterion("enterprise_reservation_selectable >", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_selectable >=", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableLessThan(Boolean value) {
            addCriterion("enterprise_reservation_selectable <", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableLessThanOrEqualTo(Boolean value) {
            addCriterion("enterprise_reservation_selectable <=", value, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_selectable in", values, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableNotIn(List<Boolean> values) {
            addCriterion("enterprise_reservation_selectable not in", values, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_selectable between", value1, value2, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationSelectableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enterprise_reservation_selectable not between", value1, value2, "enterpriseReservationSelectable");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIsNull() {
            addCriterion("confidential_level_id is null");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIsNotNull() {
            addCriterion("confidential_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdEqualTo(Integer value) {
            addCriterion("confidential_level_id =", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotEqualTo(Integer value) {
            addCriterion("confidential_level_id <>", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdGreaterThan(Integer value) {
            addCriterion("confidential_level_id >", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("confidential_level_id >=", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdLessThan(Integer value) {
            addCriterion("confidential_level_id <", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("confidential_level_id <=", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIn(List<Integer> values) {
            addCriterion("confidential_level_id in", values, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotIn(List<Integer> values) {
            addCriterion("confidential_level_id not in", values, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("confidential_level_id between", value1, value2, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("confidential_level_id not between", value1, value2, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteIsNull() {
            addCriterion("enterprise_reservation_note is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteIsNotNull() {
            addCriterion("enterprise_reservation_note is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteEqualTo(String value) {
            addCriterion("enterprise_reservation_note =", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteNotEqualTo(String value) {
            addCriterion("enterprise_reservation_note <>", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteGreaterThan(String value) {
            addCriterion("enterprise_reservation_note >", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_note >=", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteLessThan(String value) {
            addCriterion("enterprise_reservation_note <", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_note <=", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteLike(String value) {
            addCriterion("enterprise_reservation_note like", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteNotLike(String value) {
            addCriterion("enterprise_reservation_note not like", value, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteIn(List<String> values) {
            addCriterion("enterprise_reservation_note in", values, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteNotIn(List<String> values) {
            addCriterion("enterprise_reservation_note not in", values, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_note between", value1, value2, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationNoteNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_note not between", value1, value2, "enterpriseReservationNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeIsNull() {
            addCriterion("enterprise_reservation_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeIsNotNull() {
            addCriterion("enterprise_reservation_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeEqualTo(String value) {
            addCriterion("enterprise_reservation_code =", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeNotEqualTo(String value) {
            addCriterion("enterprise_reservation_code <>", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeGreaterThan(String value) {
            addCriterion("enterprise_reservation_code >", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_code >=", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeLessThan(String value) {
            addCriterion("enterprise_reservation_code <", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_code <=", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeLike(String value) {
            addCriterion("enterprise_reservation_code like", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeNotLike(String value) {
            addCriterion("enterprise_reservation_code not like", value, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeIn(List<String> values) {
            addCriterion("enterprise_reservation_code in", values, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeNotIn(List<String> values) {
            addCriterion("enterprise_reservation_code not in", values, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_code between", value1, value2, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_code not between", value1, value2, "enterpriseReservationCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeIsNull() {
            addCriterion("enterprise_reservation_input_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeIsNotNull() {
            addCriterion("enterprise_reservation_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeEqualTo(Integer value) {
            addCriterion("enterprise_reservation_input_code =", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_input_code <>", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_input_code >", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_input_code >=", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeLessThan(Integer value) {
            addCriterion("enterprise_reservation_input_code <", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_input_code <=", value, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeIn(List<Integer> values) {
            addCriterion("enterprise_reservation_input_code in", values, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_input_code not in", values, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_input_code between", value1, value2, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationInputCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_input_code not between", value1, value2, "enterpriseReservationInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderIsNull() {
            addCriterion("enterprise_reservation_order is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderIsNotNull() {
            addCriterion("enterprise_reservation_order is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderEqualTo(Integer value) {
            addCriterion("enterprise_reservation_order =", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_order <>", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_order >", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_order >=", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderLessThan(Integer value) {
            addCriterion("enterprise_reservation_order <", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_order <=", value, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderIn(List<Integer> values) {
            addCriterion("enterprise_reservation_order in", values, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_order not in", values, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_order between", value1, value2, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_order not between", value1, value2, "enterpriseReservationOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusIsNull() {
            addCriterion("enterprise_reservation_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusIsNotNull() {
            addCriterion("enterprise_reservation_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusEqualTo(Integer value) {
            addCriterion("enterprise_reservation_status =", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_status <>", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_status >", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_status >=", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusLessThan(Integer value) {
            addCriterion("enterprise_reservation_status <", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_status <=", value, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusIn(List<Integer> values) {
            addCriterion("enterprise_reservation_status in", values, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_status not in", values, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_status between", value1, value2, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_status not between", value1, value2, "enterpriseReservationStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeIsNull() {
            addCriterion("enterprise_reservation_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeIsNotNull() {
            addCriterion("enterprise_reservation_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_create_time =", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_create_time <>", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_create_time >", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_create_time >=", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_create_time <", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_create_time <=", value, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_create_time in", values, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_create_time not in", values, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_create_time between", value1, value2, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_create_time not between", value1, value2, "enterpriseReservationCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeIsNull() {
            addCriterion("enterprise_reservation_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeIsNotNull() {
            addCriterion("enterprise_reservation_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_edit_time =", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_edit_time <>", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_edit_time >", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_edit_time >=", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_edit_time <", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_edit_time <=", value, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_edit_time in", values, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_edit_time not in", values, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_edit_time between", value1, value2, "enterpriseReservationEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_edit_time not between", value1, value2, "enterpriseReservationEditTime");
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