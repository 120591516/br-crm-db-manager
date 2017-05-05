package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseReservationPatientExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseReservationPatientExample() {
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

        public Criteria andEnterpriseReservationPatientIdIsNull() {
            addCriterion("enterprise_reservation_patient_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdIsNotNull() {
            addCriterion("enterprise_reservation_patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_id =", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdNotEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_id <>", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdGreaterThan(String value) {
            addCriterion("enterprise_reservation_patient_id >", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_id >=", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdLessThan(String value) {
            addCriterion("enterprise_reservation_patient_id <", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_id <=", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdLike(String value) {
            addCriterion("enterprise_reservation_patient_id like", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdNotLike(String value) {
            addCriterion("enterprise_reservation_patient_id not like", value, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_id in", values, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdNotIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_id not in", values, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_id between", value1, value2, "enterpriseReservationPatientId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_id not between", value1, value2, "enterpriseReservationPatientId");
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

        public Criteria andEnterpriseGroupIdIsNull() {
            addCriterion("enterprise_group_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdIsNotNull() {
            addCriterion("enterprise_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdEqualTo(String value) {
            addCriterion("enterprise_group_id =", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotEqualTo(String value) {
            addCriterion("enterprise_group_id <>", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdGreaterThan(String value) {
            addCriterion("enterprise_group_id >", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_id >=", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLessThan(String value) {
            addCriterion("enterprise_group_id <", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_id <=", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLike(String value) {
            addCriterion("enterprise_group_id like", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotLike(String value) {
            addCriterion("enterprise_group_id not like", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdIn(List<String> values) {
            addCriterion("enterprise_group_id in", values, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotIn(List<String> values) {
            addCriterion("enterprise_group_id not in", values, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdBetween(String value1, String value2) {
            addCriterion("enterprise_group_id between", value1, value2, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_id not between", value1, value2, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIsNull() {
            addCriterion("enterprise_dep is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIsNotNull() {
            addCriterion("enterprise_dep is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepEqualTo(String value) {
            addCriterion("enterprise_dep =", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNotEqualTo(String value) {
            addCriterion("enterprise_dep <>", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepGreaterThan(String value) {
            addCriterion("enterprise_dep >", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep >=", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLessThan(String value) {
            addCriterion("enterprise_dep <", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep <=", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepLike(String value) {
            addCriterion("enterprise_dep like", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNotLike(String value) {
            addCriterion("enterprise_dep not like", value, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepIn(List<String> values) {
            addCriterion("enterprise_dep in", values, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNotIn(List<String> values) {
            addCriterion("enterprise_dep not in", values, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepBetween(String value1, String value2) {
            addCriterion("enterprise_dep between", value1, value2, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep not between", value1, value2, "enterpriseDep");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdIsNull() {
            addCriterion("patient_archive_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdIsNotNull() {
            addCriterion("patient_archive_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdEqualTo(String value) {
            addCriterion("patient_archive_id =", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdNotEqualTo(String value) {
            addCriterion("patient_archive_id <>", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdGreaterThan(String value) {
            addCriterion("patient_archive_id >", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_archive_id >=", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdLessThan(String value) {
            addCriterion("patient_archive_id <", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdLessThanOrEqualTo(String value) {
            addCriterion("patient_archive_id <=", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdLike(String value) {
            addCriterion("patient_archive_id like", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdNotLike(String value) {
            addCriterion("patient_archive_id not like", value, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdIn(List<String> values) {
            addCriterion("patient_archive_id in", values, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdNotIn(List<String> values) {
            addCriterion("patient_archive_id not in", values, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdBetween(String value1, String value2) {
            addCriterion("patient_archive_id between", value1, value2, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveIdNotBetween(String value1, String value2) {
            addCriterion("patient_archive_id not between", value1, value2, "patientArchiveId");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoIsNull() {
            addCriterion("patient_archive_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoIsNotNull() {
            addCriterion("patient_archive_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoEqualTo(String value) {
            addCriterion("patient_archive_no =", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoNotEqualTo(String value) {
            addCriterion("patient_archive_no <>", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoGreaterThan(String value) {
            addCriterion("patient_archive_no >", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_archive_no >=", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoLessThan(String value) {
            addCriterion("patient_archive_no <", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoLessThanOrEqualTo(String value) {
            addCriterion("patient_archive_no <=", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoLike(String value) {
            addCriterion("patient_archive_no like", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoNotLike(String value) {
            addCriterion("patient_archive_no not like", value, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoIn(List<String> values) {
            addCriterion("patient_archive_no in", values, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoNotIn(List<String> values) {
            addCriterion("patient_archive_no not in", values, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoBetween(String value1, String value2) {
            addCriterion("patient_archive_no between", value1, value2, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoNotBetween(String value1, String value2) {
            addCriterion("patient_archive_no not between", value1, value2, "patientArchiveNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoIsNull() {
            addCriterion("patient_card_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoIsNotNull() {
            addCriterion("patient_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoEqualTo(String value) {
            addCriterion("patient_card_no =", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoNotEqualTo(String value) {
            addCriterion("patient_card_no <>", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoGreaterThan(String value) {
            addCriterion("patient_card_no >", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_card_no >=", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoLessThan(String value) {
            addCriterion("patient_card_no <", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoLessThanOrEqualTo(String value) {
            addCriterion("patient_card_no <=", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoLike(String value) {
            addCriterion("patient_card_no like", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoNotLike(String value) {
            addCriterion("patient_card_no not like", value, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoIn(List<String> values) {
            addCriterion("patient_card_no in", values, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoNotIn(List<String> values) {
            addCriterion("patient_card_no not in", values, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoBetween(String value1, String value2) {
            addCriterion("patient_card_no between", value1, value2, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoNotBetween(String value1, String value2) {
            addCriterion("patient_card_no not between", value1, value2, "patientCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoIsNull() {
            addCriterion("patient_id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoIsNotNull() {
            addCriterion("patient_id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoEqualTo(String value) {
            addCriterion("patient_id_card_no =", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoNotEqualTo(String value) {
            addCriterion("patient_id_card_no <>", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoGreaterThan(String value) {
            addCriterion("patient_id_card_no >", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id_card_no >=", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoLessThan(String value) {
            addCriterion("patient_id_card_no <", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("patient_id_card_no <=", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoLike(String value) {
            addCriterion("patient_id_card_no like", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoNotLike(String value) {
            addCriterion("patient_id_card_no not like", value, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoIn(List<String> values) {
            addCriterion("patient_id_card_no in", values, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoNotIn(List<String> values) {
            addCriterion("patient_id_card_no not in", values, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoBetween(String value1, String value2) {
            addCriterion("patient_id_card_no between", value1, value2, "patientIdCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdCardNoNotBetween(String value1, String value2) {
            addCriterion("patient_id_card_no not between", value1, value2, "patientIdCardNo");
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

        public Criteria andPatientCodeIsNull() {
            addCriterion("patient_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientCodeIsNotNull() {
            addCriterion("patient_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCodeEqualTo(String value) {
            addCriterion("patient_code =", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotEqualTo(String value) {
            addCriterion("patient_code <>", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeGreaterThan(String value) {
            addCriterion("patient_code >", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_code >=", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLessThan(String value) {
            addCriterion("patient_code <", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_code <=", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLike(String value) {
            addCriterion("patient_code like", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotLike(String value) {
            addCriterion("patient_code not like", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeIn(List<String> values) {
            addCriterion("patient_code in", values, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotIn(List<String> values) {
            addCriterion("patient_code not in", values, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeBetween(String value1, String value2) {
            addCriterion("patient_code between", value1, value2, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotBetween(String value1, String value2) {
            addCriterion("patient_code not between", value1, value2, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeIsNull() {
            addCriterion("enterprise_reservation_patient_input_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeIsNotNull() {
            addCriterion("enterprise_reservation_patient_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_input_code =", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeNotEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_input_code <>", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeGreaterThan(String value) {
            addCriterion("enterprise_reservation_patient_input_code >", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_input_code >=", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeLessThan(String value) {
            addCriterion("enterprise_reservation_patient_input_code <", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_input_code <=", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeLike(String value) {
            addCriterion("enterprise_reservation_patient_input_code like", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeNotLike(String value) {
            addCriterion("enterprise_reservation_patient_input_code not like", value, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_input_code in", values, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeNotIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_input_code not in", values, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_input_code between", value1, value2, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientInputCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_input_code not between", value1, value2, "enterpriseReservationPatientInputCode");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNull() {
            addCriterion("sex_id is null");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNotNull() {
            addCriterion("sex_id is not null");
            return (Criteria) this;
        }

        public Criteria andSexIdEqualTo(Integer value) {
            addCriterion("sex_id =", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotEqualTo(Integer value) {
            addCriterion("sex_id <>", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThan(Integer value) {
            addCriterion("sex_id >", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex_id >=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThan(Integer value) {
            addCriterion("sex_id <", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThanOrEqualTo(Integer value) {
            addCriterion("sex_id <=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdIn(List<Integer> values) {
            addCriterion("sex_id in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotIn(List<Integer> values) {
            addCriterion("sex_id not in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdBetween(Integer value1, Integer value2) {
            addCriterion("sex_id between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sex_id not between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNull() {
            addCriterion("sex_name is null");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNotNull() {
            addCriterion("sex_name is not null");
            return (Criteria) this;
        }

        public Criteria andSexNameEqualTo(String value) {
            addCriterion("sex_name =", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotEqualTo(String value) {
            addCriterion("sex_name <>", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThan(String value) {
            addCriterion("sex_name >", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThanOrEqualTo(String value) {
            addCriterion("sex_name >=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThan(String value) {
            addCriterion("sex_name <", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThanOrEqualTo(String value) {
            addCriterion("sex_name <=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLike(String value) {
            addCriterion("sex_name like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotLike(String value) {
            addCriterion("sex_name not like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameIn(List<String> values) {
            addCriterion("sex_name in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotIn(List<String> values) {
            addCriterion("sex_name not in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameBetween(String value1, String value2) {
            addCriterion("sex_name between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotBetween(String value1, String value2) {
            addCriterion("sex_name not between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNull() {
            addCriterion("patient_phone is null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNotNull() {
            addCriterion("patient_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneEqualTo(String value) {
            addCriterion("patient_phone =", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotEqualTo(String value) {
            addCriterion("patient_phone <>", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThan(String value) {
            addCriterion("patient_phone >", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("patient_phone >=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThan(String value) {
            addCriterion("patient_phone <", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThanOrEqualTo(String value) {
            addCriterion("patient_phone <=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLike(String value) {
            addCriterion("patient_phone like", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotLike(String value) {
            addCriterion("patient_phone not like", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIn(List<String> values) {
            addCriterion("patient_phone in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotIn(List<String> values) {
            addCriterion("patient_phone not in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneBetween(String value1, String value2) {
            addCriterion("patient_phone between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotBetween(String value1, String value2) {
            addCriterion("patient_phone not between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNull() {
            addCriterion("patient_address is null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNotNull() {
            addCriterion("patient_address is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressEqualTo(String value) {
            addCriterion("patient_address =", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotEqualTo(String value) {
            addCriterion("patient_address <>", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThan(String value) {
            addCriterion("patient_address >", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("patient_address >=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThan(String value) {
            addCriterion("patient_address <", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThanOrEqualTo(String value) {
            addCriterion("patient_address <=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLike(String value) {
            addCriterion("patient_address like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotLike(String value) {
            addCriterion("patient_address not like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIn(List<String> values) {
            addCriterion("patient_address in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotIn(List<String> values) {
            addCriterion("patient_address not in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressBetween(String value1, String value2) {
            addCriterion("patient_address between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotBetween(String value1, String value2) {
            addCriterion("patient_address not between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("patient_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patient_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Integer value) {
            addCriterion("patient_age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Integer value) {
            addCriterion("patient_age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Integer value) {
            addCriterion("patient_age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Integer value) {
            addCriterion("patient_age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Integer value) {
            addCriterion("patient_age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Integer> values) {
            addCriterion("patient_age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Integer> values) {
            addCriterion("patient_age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Integer value1, Integer value2) {
            addCriterion("patient_age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdIsNull() {
            addCriterion("age_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdIsNotNull() {
            addCriterion("age_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdEqualTo(Integer value) {
            addCriterion("age_unit_id =", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdNotEqualTo(Integer value) {
            addCriterion("age_unit_id <>", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdGreaterThan(Integer value) {
            addCriterion("age_unit_id >", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_unit_id >=", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdLessThan(Integer value) {
            addCriterion("age_unit_id <", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("age_unit_id <=", value, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdIn(List<Integer> values) {
            addCriterion("age_unit_id in", values, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdNotIn(List<Integer> values) {
            addCriterion("age_unit_id not in", values, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("age_unit_id between", value1, value2, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("age_unit_id not between", value1, value2, "ageUnitId");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealIsNull() {
            addCriterion("age_of_real is null");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealIsNotNull() {
            addCriterion("age_of_real is not null");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealEqualTo(BigDecimal value) {
            addCriterion("age_of_real =", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealNotEqualTo(BigDecimal value) {
            addCriterion("age_of_real <>", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealGreaterThan(BigDecimal value) {
            addCriterion("age_of_real >", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("age_of_real >=", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealLessThan(BigDecimal value) {
            addCriterion("age_of_real <", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealLessThanOrEqualTo(BigDecimal value) {
            addCriterion("age_of_real <=", value, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealIn(List<BigDecimal> values) {
            addCriterion("age_of_real in", values, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealNotIn(List<BigDecimal> values) {
            addCriterion("age_of_real not in", values, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("age_of_real between", value1, value2, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andAgeOfRealNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("age_of_real not between", value1, value2, "ageOfReal");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(String value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(String value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(String value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(String value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLike(String value) {
            addCriterion("group_type like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotLike(String value) {
            addCriterion("group_type not like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<String> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<String> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(String value1, String value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(String value1, String value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeIsNull() {
            addCriterion("patient_age_base_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeIsNotNull() {
            addCriterion("patient_age_base_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeEqualTo(Date value) {
            addCriterion("patient_age_base_time =", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeNotEqualTo(Date value) {
            addCriterion("patient_age_base_time <>", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeGreaterThan(Date value) {
            addCriterion("patient_age_base_time >", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_age_base_time >=", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeLessThan(Date value) {
            addCriterion("patient_age_base_time <", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_age_base_time <=", value, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeIn(List<Date> values) {
            addCriterion("patient_age_base_time in", values, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeNotIn(List<Date> values) {
            addCriterion("patient_age_base_time not in", values, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeBetween(Date value1, Date value2) {
            addCriterion("patient_age_base_time between", value1, value2, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_age_base_time not between", value1, value2, "patientAgeBaseTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeIsNull() {
            addCriterion("patient_birth_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeIsNotNull() {
            addCriterion("patient_birth_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeEqualTo(Date value) {
            addCriterion("patient_birth_time =", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeNotEqualTo(Date value) {
            addCriterion("patient_birth_time <>", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeGreaterThan(Date value) {
            addCriterion("patient_birth_time >", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_birth_time >=", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeLessThan(Date value) {
            addCriterion("patient_birth_time <", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_birth_time <=", value, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeIn(List<Date> values) {
            addCriterion("patient_birth_time in", values, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeNotIn(List<Date> values) {
            addCriterion("patient_birth_time not in", values, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeBetween(Date value1, Date value2) {
            addCriterion("patient_birth_time between", value1, value2, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andPatientBirthTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_birth_time not between", value1, value2, "patientBirthTime");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIsNull() {
            addCriterion("marriage_id is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIsNotNull() {
            addCriterion("marriage_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageIdEqualTo(Integer value) {
            addCriterion("marriage_id =", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotEqualTo(Integer value) {
            addCriterion("marriage_id <>", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdGreaterThan(Integer value) {
            addCriterion("marriage_id >", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage_id >=", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdLessThan(Integer value) {
            addCriterion("marriage_id <", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdLessThanOrEqualTo(Integer value) {
            addCriterion("marriage_id <=", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIn(List<Integer> values) {
            addCriterion("marriage_id in", values, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotIn(List<Integer> values) {
            addCriterion("marriage_id not in", values, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdBetween(Integer value1, Integer value2) {
            addCriterion("marriage_id between", value1, value2, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage_id not between", value1, value2, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIsNull() {
            addCriterion("marriage_name is null");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIsNotNull() {
            addCriterion("marriage_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageNameEqualTo(String value) {
            addCriterion("marriage_name =", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotEqualTo(String value) {
            addCriterion("marriage_name <>", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameGreaterThan(String value) {
            addCriterion("marriage_name >", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_name >=", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLessThan(String value) {
            addCriterion("marriage_name <", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLessThanOrEqualTo(String value) {
            addCriterion("marriage_name <=", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLike(String value) {
            addCriterion("marriage_name like", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotLike(String value) {
            addCriterion("marriage_name not like", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIn(List<String> values) {
            addCriterion("marriage_name in", values, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotIn(List<String> values) {
            addCriterion("marriage_name not in", values, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameBetween(String value1, String value2) {
            addCriterion("marriage_name between", value1, value2, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotBetween(String value1, String value2) {
            addCriterion("marriage_name not between", value1, value2, "marriageName");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(String value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(String value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(String value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(String value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(String value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(String value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLike(String value) {
            addCriterion("nation_id like", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotLike(String value) {
            addCriterion("nation_id not like", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<String> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<String> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(String value1, String value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(String value1, String value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationNameIsNull() {
            addCriterion("nation_name is null");
            return (Criteria) this;
        }

        public Criteria andNationNameIsNotNull() {
            addCriterion("nation_name is not null");
            return (Criteria) this;
        }

        public Criteria andNationNameEqualTo(String value) {
            addCriterion("nation_name =", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotEqualTo(String value) {
            addCriterion("nation_name <>", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameGreaterThan(String value) {
            addCriterion("nation_name >", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameGreaterThanOrEqualTo(String value) {
            addCriterion("nation_name >=", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLessThan(String value) {
            addCriterion("nation_name <", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLessThanOrEqualTo(String value) {
            addCriterion("nation_name <=", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameLike(String value) {
            addCriterion("nation_name like", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotLike(String value) {
            addCriterion("nation_name not like", value, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameIn(List<String> values) {
            addCriterion("nation_name in", values, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotIn(List<String> values) {
            addCriterion("nation_name not in", values, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameBetween(String value1, String value2) {
            addCriterion("nation_name between", value1, value2, "nationName");
            return (Criteria) this;
        }

        public Criteria andNationNameNotBetween(String value1, String value2) {
            addCriterion("nation_name not between", value1, value2, "nationName");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Integer value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Integer value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Integer value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Integer value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Integer value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Integer> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Integer> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Integer value1, Integer value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationNameIsNull() {
            addCriterion("education_name is null");
            return (Criteria) this;
        }

        public Criteria andEducationNameIsNotNull() {
            addCriterion("education_name is not null");
            return (Criteria) this;
        }

        public Criteria andEducationNameEqualTo(String value) {
            addCriterion("education_name =", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotEqualTo(String value) {
            addCriterion("education_name <>", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameGreaterThan(String value) {
            addCriterion("education_name >", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameGreaterThanOrEqualTo(String value) {
            addCriterion("education_name >=", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLessThan(String value) {
            addCriterion("education_name <", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLessThanOrEqualTo(String value) {
            addCriterion("education_name <=", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLike(String value) {
            addCriterion("education_name like", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotLike(String value) {
            addCriterion("education_name not like", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameIn(List<String> values) {
            addCriterion("education_name in", values, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotIn(List<String> values) {
            addCriterion("education_name not in", values, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameBetween(String value1, String value2) {
            addCriterion("education_name between", value1, value2, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotBetween(String value1, String value2) {
            addCriterion("education_name not between", value1, value2, "educationName");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIsNull() {
            addCriterion("occupation_id is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIsNotNull() {
            addCriterion("occupation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdEqualTo(String value) {
            addCriterion("occupation_id =", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotEqualTo(String value) {
            addCriterion("occupation_id <>", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThan(String value) {
            addCriterion("occupation_id >", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThanOrEqualTo(String value) {
            addCriterion("occupation_id >=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThan(String value) {
            addCriterion("occupation_id <", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThanOrEqualTo(String value) {
            addCriterion("occupation_id <=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLike(String value) {
            addCriterion("occupation_id like", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotLike(String value) {
            addCriterion("occupation_id not like", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIn(List<String> values) {
            addCriterion("occupation_id in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotIn(List<String> values) {
            addCriterion("occupation_id not in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdBetween(String value1, String value2) {
            addCriterion("occupation_id between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotBetween(String value1, String value2) {
            addCriterion("occupation_id not between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIsNull() {
            addCriterion("occupation_name is null");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIsNotNull() {
            addCriterion("occupation_name is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationNameEqualTo(String value) {
            addCriterion("occupation_name =", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotEqualTo(String value) {
            addCriterion("occupation_name <>", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameGreaterThan(String value) {
            addCriterion("occupation_name >", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameGreaterThanOrEqualTo(String value) {
            addCriterion("occupation_name >=", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLessThan(String value) {
            addCriterion("occupation_name <", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLessThanOrEqualTo(String value) {
            addCriterion("occupation_name <=", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLike(String value) {
            addCriterion("occupation_name like", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotLike(String value) {
            addCriterion("occupation_name not like", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIn(List<String> values) {
            addCriterion("occupation_name in", values, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotIn(List<String> values) {
            addCriterion("occupation_name not in", values, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameBetween(String value1, String value2) {
            addCriterion("occupation_name between", value1, value2, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotBetween(String value1, String value2) {
            addCriterion("occupation_name not between", value1, value2, "occupationName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedIsNull() {
            addCriterion("enterprise_reservation_patient_prepared is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedIsNotNull() {
            addCriterion("enterprise_reservation_patient_prepared is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedEqualTo(Long value) {
            addCriterion("enterprise_reservation_patient_prepared =", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedNotEqualTo(Long value) {
            addCriterion("enterprise_reservation_patient_prepared <>", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedGreaterThan(Long value) {
            addCriterion("enterprise_reservation_patient_prepared >", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedGreaterThanOrEqualTo(Long value) {
            addCriterion("enterprise_reservation_patient_prepared >=", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedLessThan(Long value) {
            addCriterion("enterprise_reservation_patient_prepared <", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedLessThanOrEqualTo(Long value) {
            addCriterion("enterprise_reservation_patient_prepared <=", value, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedIn(List<Long> values) {
            addCriterion("enterprise_reservation_patient_prepared in", values, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedNotIn(List<Long> values) {
            addCriterion("enterprise_reservation_patient_prepared not in", values, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedBetween(Long value1, Long value2) {
            addCriterion("enterprise_reservation_patient_prepared between", value1, value2, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientPreparedNotBetween(Long value1, Long value2) {
            addCriterion("enterprise_reservation_patient_prepared not between", value1, value2, "enterpriseReservationPatientPrepared");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteIsNull() {
            addCriterion("enterprise_reservation_patient_note is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteIsNotNull() {
            addCriterion("enterprise_reservation_patient_note is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_note =", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteNotEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_note <>", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteGreaterThan(String value) {
            addCriterion("enterprise_reservation_patient_note >", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_note >=", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteLessThan(String value) {
            addCriterion("enterprise_reservation_patient_note <", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_patient_note <=", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteLike(String value) {
            addCriterion("enterprise_reservation_patient_note like", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteNotLike(String value) {
            addCriterion("enterprise_reservation_patient_note not like", value, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_note in", values, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteNotIn(List<String> values) {
            addCriterion("enterprise_reservation_patient_note not in", values, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_note between", value1, value2, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientNoteNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_patient_note not between", value1, value2, "enterpriseReservationPatientNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeIsNull() {
            addCriterion("enterprise_reservation_patient_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeIsNotNull() {
            addCriterion("enterprise_reservation_patient_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_create_time =", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_create_time <>", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_patient_create_time >", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_create_time >=", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_patient_create_time <", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_create_time <=", value, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_patient_create_time in", values, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_patient_create_time not in", values, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_patient_create_time between", value1, value2, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_patient_create_time not between", value1, value2, "enterpriseReservationPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeIsNull() {
            addCriterion("enterprise_reservation_patient_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeIsNotNull() {
            addCriterion("enterprise_reservation_patient_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time =", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time <>", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time >", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time >=", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeLessThan(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time <", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_reservation_patient_edit_time <=", value, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeIn(List<Date> values) {
            addCriterion("enterprise_reservation_patient_edit_time in", values, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_reservation_patient_edit_time not in", values, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_patient_edit_time between", value1, value2, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_reservation_patient_edit_time not between", value1, value2, "enterpriseReservationPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusIsNull() {
            addCriterion("enterprise_reservation_patient_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusIsNotNull() {
            addCriterion("enterprise_reservation_patient_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusEqualTo(Integer value) {
            addCriterion("enterprise_reservation_patient_status =", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_reservation_patient_status <>", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusGreaterThan(Integer value) {
            addCriterion("enterprise_reservation_patient_status >", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_patient_status >=", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusLessThan(Integer value) {
            addCriterion("enterprise_reservation_patient_status <", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_reservation_patient_status <=", value, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusIn(List<Integer> values) {
            addCriterion("enterprise_reservation_patient_status in", values, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_reservation_patient_status not in", values, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_patient_status between", value1, value2, "enterpriseReservationPatientStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationPatientStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_reservation_patient_status not between", value1, value2, "enterpriseReservationPatientStatus");
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