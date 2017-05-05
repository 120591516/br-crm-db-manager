package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andCustomerOrderIdIsNull() {
            addCriterion("customer_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdIsNotNull() {
            addCriterion("customer_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdEqualTo(String value) {
            addCriterion("customer_order_id =", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotEqualTo(String value) {
            addCriterion("customer_order_id <>", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdGreaterThan(String value) {
            addCriterion("customer_order_id >", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_id >=", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLessThan(String value) {
            addCriterion("customer_order_id <", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_id <=", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdLike(String value) {
            addCriterion("customer_order_id like", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotLike(String value) {
            addCriterion("customer_order_id not like", value, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdIn(List<String> values) {
            addCriterion("customer_order_id in", values, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotIn(List<String> values) {
            addCriterion("customer_order_id not in", values, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdBetween(String value1, String value2) {
            addCriterion("customer_order_id between", value1, value2, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_id not between", value1, value2, "customerOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdIsNull() {
            addCriterion("customer_order_curt_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdIsNotNull() {
            addCriterion("customer_order_curt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdEqualTo(String value) {
            addCriterion("customer_order_curt_id =", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdNotEqualTo(String value) {
            addCriterion("customer_order_curt_id <>", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdGreaterThan(String value) {
            addCriterion("customer_order_curt_id >", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_curt_id >=", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdLessThan(String value) {
            addCriterion("customer_order_curt_id <", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdLessThanOrEqualTo(String value) {
            addCriterion("customer_order_curt_id <=", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdLike(String value) {
            addCriterion("customer_order_curt_id like", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdNotLike(String value) {
            addCriterion("customer_order_curt_id not like", value, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdIn(List<String> values) {
            addCriterion("customer_order_curt_id in", values, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdNotIn(List<String> values) {
            addCriterion("customer_order_curt_id not in", values, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdBetween(String value1, String value2) {
            addCriterion("customer_order_curt_id between", value1, value2, "customerOrderCurtId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderCurtIdNotBetween(String value1, String value2) {
            addCriterion("customer_order_curt_id not between", value1, value2, "customerOrderCurtId");
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

        public Criteria andPatientArchiveCodeIsNull() {
            addCriterion("patient_archive_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeIsNotNull() {
            addCriterion("patient_archive_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeEqualTo(String value) {
            addCriterion("patient_archive_code =", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeNotEqualTo(String value) {
            addCriterion("patient_archive_code <>", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeGreaterThan(String value) {
            addCriterion("patient_archive_code >", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_archive_code >=", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeLessThan(String value) {
            addCriterion("patient_archive_code <", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_archive_code <=", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeLike(String value) {
            addCriterion("patient_archive_code like", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeNotLike(String value) {
            addCriterion("patient_archive_code not like", value, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeIn(List<String> values) {
            addCriterion("patient_archive_code in", values, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeNotIn(List<String> values) {
            addCriterion("patient_archive_code not in", values, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeBetween(String value1, String value2) {
            addCriterion("patient_archive_code between", value1, value2, "patientArchiveCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCodeNotBetween(String value1, String value2) {
            addCriterion("patient_archive_code not between", value1, value2, "patientArchiveCode");
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

        public Criteria andPatientCodePrnIsNull() {
            addCriterion("patient_code_prn is null");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnIsNotNull() {
            addCriterion("patient_code_prn is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnEqualTo(String value) {
            addCriterion("patient_code_prn =", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnNotEqualTo(String value) {
            addCriterion("patient_code_prn <>", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnGreaterThan(String value) {
            addCriterion("patient_code_prn >", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnGreaterThanOrEqualTo(String value) {
            addCriterion("patient_code_prn >=", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnLessThan(String value) {
            addCriterion("patient_code_prn <", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnLessThanOrEqualTo(String value) {
            addCriterion("patient_code_prn <=", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnLike(String value) {
            addCriterion("patient_code_prn like", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnNotLike(String value) {
            addCriterion("patient_code_prn not like", value, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnIn(List<String> values) {
            addCriterion("patient_code_prn in", values, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnNotIn(List<String> values) {
            addCriterion("patient_code_prn not in", values, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnBetween(String value1, String value2) {
            addCriterion("patient_code_prn between", value1, value2, "patientCodePrn");
            return (Criteria) this;
        }

        public Criteria andPatientCodePrnNotBetween(String value1, String value2) {
            addCriterion("patient_code_prn not between", value1, value2, "patientCodePrn");
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

        public Criteria andPatientBizNoIsNull() {
            addCriterion("patient_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoIsNotNull() {
            addCriterion("patient_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoEqualTo(String value) {
            addCriterion("patient_biz_no =", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoNotEqualTo(String value) {
            addCriterion("patient_biz_no <>", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoGreaterThan(String value) {
            addCriterion("patient_biz_no >", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_biz_no >=", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoLessThan(String value) {
            addCriterion("patient_biz_no <", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoLessThanOrEqualTo(String value) {
            addCriterion("patient_biz_no <=", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoLike(String value) {
            addCriterion("patient_biz_no like", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoNotLike(String value) {
            addCriterion("patient_biz_no not like", value, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoIn(List<String> values) {
            addCriterion("patient_biz_no in", values, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoNotIn(List<String> values) {
            addCriterion("patient_biz_no not in", values, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoBetween(String value1, String value2) {
            addCriterion("patient_biz_no between", value1, value2, "patientBizNo");
            return (Criteria) this;
        }

        public Criteria andPatientBizNoNotBetween(String value1, String value2) {
            addCriterion("patient_biz_no not between", value1, value2, "patientBizNo");
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

        public Criteria andPatientEnterNumIsNull() {
            addCriterion("patient_enter_num is null");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumIsNotNull() {
            addCriterion("patient_enter_num is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumEqualTo(Integer value) {
            addCriterion("patient_enter_num =", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumNotEqualTo(Integer value) {
            addCriterion("patient_enter_num <>", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumGreaterThan(Integer value) {
            addCriterion("patient_enter_num >", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_enter_num >=", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumLessThan(Integer value) {
            addCriterion("patient_enter_num <", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumLessThanOrEqualTo(Integer value) {
            addCriterion("patient_enter_num <=", value, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumIn(List<Integer> values) {
            addCriterion("patient_enter_num in", values, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumNotIn(List<Integer> values) {
            addCriterion("patient_enter_num not in", values, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumBetween(Integer value1, Integer value2) {
            addCriterion("patient_enter_num between", value1, value2, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientEnterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_enter_num not between", value1, value2, "patientEnterNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumIsNull() {
            addCriterion("patient_resv_num is null");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumIsNotNull() {
            addCriterion("patient_resv_num is not null");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumEqualTo(Integer value) {
            addCriterion("patient_resv_num =", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumNotEqualTo(Integer value) {
            addCriterion("patient_resv_num <>", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumGreaterThan(Integer value) {
            addCriterion("patient_resv_num >", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_resv_num >=", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumLessThan(Integer value) {
            addCriterion("patient_resv_num <", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumLessThanOrEqualTo(Integer value) {
            addCriterion("patient_resv_num <=", value, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumIn(List<Integer> values) {
            addCriterion("patient_resv_num in", values, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumNotIn(List<Integer> values) {
            addCriterion("patient_resv_num not in", values, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumBetween(Integer value1, Integer value2) {
            addCriterion("patient_resv_num between", value1, value2, "patientResvNum");
            return (Criteria) this;
        }

        public Criteria andPatientResvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_resv_num not between", value1, value2, "patientResvNum");
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

        public Criteria andEnterpriseDepNameIsNull() {
            addCriterion("enterprise_dep_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameIsNotNull() {
            addCriterion("enterprise_dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameEqualTo(String value) {
            addCriterion("enterprise_dep_name =", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotEqualTo(String value) {
            addCriterion("enterprise_dep_name <>", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameGreaterThan(String value) {
            addCriterion("enterprise_dep_name >", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_name >=", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLessThan(String value) {
            addCriterion("enterprise_dep_name <", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dep_name <=", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameLike(String value) {
            addCriterion("enterprise_dep_name like", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotLike(String value) {
            addCriterion("enterprise_dep_name not like", value, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameIn(List<String> values) {
            addCriterion("enterprise_dep_name in", values, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotIn(List<String> values) {
            addCriterion("enterprise_dep_name not in", values, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameBetween(String value1, String value2) {
            addCriterion("enterprise_dep_name between", value1, value2, "enterpriseDepName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDepNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_dep_name not between", value1, value2, "enterpriseDepName");
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

        public Criteria andPatientInputCodeIsNull() {
            addCriterion("patient_input_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeIsNotNull() {
            addCriterion("patient_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeEqualTo(String value) {
            addCriterion("patient_input_code =", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeNotEqualTo(String value) {
            addCriterion("patient_input_code <>", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeGreaterThan(String value) {
            addCriterion("patient_input_code >", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_input_code >=", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeLessThan(String value) {
            addCriterion("patient_input_code <", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_input_code <=", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeLike(String value) {
            addCriterion("patient_input_code like", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeNotLike(String value) {
            addCriterion("patient_input_code not like", value, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeIn(List<String> values) {
            addCriterion("patient_input_code in", values, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeNotIn(List<String> values) {
            addCriterion("patient_input_code not in", values, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeBetween(String value1, String value2) {
            addCriterion("patient_input_code between", value1, value2, "patientInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientInputCodeNotBetween(String value1, String value2) {
            addCriterion("patient_input_code not between", value1, value2, "patientInputCode");
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

        public Criteria andPositionBirthDateIsNull() {
            addCriterion("position_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateIsNotNull() {
            addCriterion("position_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateEqualTo(Date value) {
            addCriterion("position_birth_date =", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateNotEqualTo(Date value) {
            addCriterion("position_birth_date <>", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateGreaterThan(Date value) {
            addCriterion("position_birth_date >", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("position_birth_date >=", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateLessThan(Date value) {
            addCriterion("position_birth_date <", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("position_birth_date <=", value, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateIn(List<Date> values) {
            addCriterion("position_birth_date in", values, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateNotIn(List<Date> values) {
            addCriterion("position_birth_date not in", values, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateBetween(Date value1, Date value2) {
            addCriterion("position_birth_date between", value1, value2, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("position_birth_date not between", value1, value2, "positionBirthDate");
            return (Criteria) this;
        }

        public Criteria andPositionAgeIsNull() {
            addCriterion("position_age is null");
            return (Criteria) this;
        }

        public Criteria andPositionAgeIsNotNull() {
            addCriterion("position_age is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAgeEqualTo(Integer value) {
            addCriterion("position_age =", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeNotEqualTo(Integer value) {
            addCriterion("position_age <>", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeGreaterThan(Integer value) {
            addCriterion("position_age >", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_age >=", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeLessThan(Integer value) {
            addCriterion("position_age <", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeLessThanOrEqualTo(Integer value) {
            addCriterion("position_age <=", value, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeIn(List<Integer> values) {
            addCriterion("position_age in", values, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeNotIn(List<Integer> values) {
            addCriterion("position_age not in", values, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeBetween(Integer value1, Integer value2) {
            addCriterion("position_age between", value1, value2, "positionAge");
            return (Criteria) this;
        }

        public Criteria andPositionAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("position_age not between", value1, value2, "positionAge");
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

        public Criteria andAgeUnitNameIsNull() {
            addCriterion("age_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameIsNotNull() {
            addCriterion("age_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameEqualTo(String value) {
            addCriterion("age_unit_name =", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameNotEqualTo(String value) {
            addCriterion("age_unit_name <>", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameGreaterThan(String value) {
            addCriterion("age_unit_name >", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("age_unit_name >=", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameLessThan(String value) {
            addCriterion("age_unit_name <", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameLessThanOrEqualTo(String value) {
            addCriterion("age_unit_name <=", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameLike(String value) {
            addCriterion("age_unit_name like", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameNotLike(String value) {
            addCriterion("age_unit_name not like", value, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameIn(List<String> values) {
            addCriterion("age_unit_name in", values, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameNotIn(List<String> values) {
            addCriterion("age_unit_name not in", values, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameBetween(String value1, String value2) {
            addCriterion("age_unit_name between", value1, value2, "ageUnitName");
            return (Criteria) this;
        }

        public Criteria andAgeUnitNameNotBetween(String value1, String value2) {
            addCriterion("age_unit_name not between", value1, value2, "ageUnitName");
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

        public Criteria andNationIdEqualTo(Integer value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Integer value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Integer value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Integer value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Integer> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Integer> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Integer value1, Integer value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPositionAddressIsNull() {
            addCriterion("position_address is null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNotNull() {
            addCriterion("position_address is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressEqualTo(String value) {
            addCriterion("position_address =", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotEqualTo(String value) {
            addCriterion("position_address <>", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThan(String value) {
            addCriterion("position_address >", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("position_address >=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThan(String value) {
            addCriterion("position_address <", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThanOrEqualTo(String value) {
            addCriterion("position_address <=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLike(String value) {
            addCriterion("position_address like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotLike(String value) {
            addCriterion("position_address not like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIn(List<String> values) {
            addCriterion("position_address in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotIn(List<String> values) {
            addCriterion("position_address not in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressBetween(String value1, String value2) {
            addCriterion("position_address between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotBetween(String value1, String value2) {
            addCriterion("position_address not between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneIsNull() {
            addCriterion("position_phone is null");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneIsNotNull() {
            addCriterion("position_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneEqualTo(String value) {
            addCriterion("position_phone =", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneNotEqualTo(String value) {
            addCriterion("position_phone <>", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneGreaterThan(String value) {
            addCriterion("position_phone >", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("position_phone >=", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneLessThan(String value) {
            addCriterion("position_phone <", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneLessThanOrEqualTo(String value) {
            addCriterion("position_phone <=", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneLike(String value) {
            addCriterion("position_phone like", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneNotLike(String value) {
            addCriterion("position_phone not like", value, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneIn(List<String> values) {
            addCriterion("position_phone in", values, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneNotIn(List<String> values) {
            addCriterion("position_phone not in", values, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneBetween(String value1, String value2) {
            addCriterion("position_phone between", value1, value2, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionPhoneNotBetween(String value1, String value2) {
            addCriterion("position_phone not between", value1, value2, "positionPhone");
            return (Criteria) this;
        }

        public Criteria andPositionEmailIsNull() {
            addCriterion("position_email is null");
            return (Criteria) this;
        }

        public Criteria andPositionEmailIsNotNull() {
            addCriterion("position_email is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEmailEqualTo(String value) {
            addCriterion("position_email =", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailNotEqualTo(String value) {
            addCriterion("position_email <>", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailGreaterThan(String value) {
            addCriterion("position_email >", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailGreaterThanOrEqualTo(String value) {
            addCriterion("position_email >=", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailLessThan(String value) {
            addCriterion("position_email <", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailLessThanOrEqualTo(String value) {
            addCriterion("position_email <=", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailLike(String value) {
            addCriterion("position_email like", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailNotLike(String value) {
            addCriterion("position_email not like", value, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailIn(List<String> values) {
            addCriterion("position_email in", values, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailNotIn(List<String> values) {
            addCriterion("position_email not in", values, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailBetween(String value1, String value2) {
            addCriterion("position_email between", value1, value2, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andPositionEmailNotBetween(String value1, String value2) {
            addCriterion("position_email not between", value1, value2, "positionEmail");
            return (Criteria) this;
        }

        public Criteria andInformWayIdIsNull() {
            addCriterion("inform_way_id is null");
            return (Criteria) this;
        }

        public Criteria andInformWayIdIsNotNull() {
            addCriterion("inform_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformWayIdEqualTo(Integer value) {
            addCriterion("inform_way_id =", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdNotEqualTo(Integer value) {
            addCriterion("inform_way_id <>", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdGreaterThan(Integer value) {
            addCriterion("inform_way_id >", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inform_way_id >=", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdLessThan(Integer value) {
            addCriterion("inform_way_id <", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("inform_way_id <=", value, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdIn(List<Integer> values) {
            addCriterion("inform_way_id in", values, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdNotIn(List<Integer> values) {
            addCriterion("inform_way_id not in", values, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdBetween(Integer value1, Integer value2) {
            addCriterion("inform_way_id between", value1, value2, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inform_way_id not between", value1, value2, "informWayId");
            return (Criteria) this;
        }

        public Criteria andInformWayNameIsNull() {
            addCriterion("inform_way_name is null");
            return (Criteria) this;
        }

        public Criteria andInformWayNameIsNotNull() {
            addCriterion("inform_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andInformWayNameEqualTo(String value) {
            addCriterion("inform_way_name =", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameNotEqualTo(String value) {
            addCriterion("inform_way_name <>", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameGreaterThan(String value) {
            addCriterion("inform_way_name >", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("inform_way_name >=", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameLessThan(String value) {
            addCriterion("inform_way_name <", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameLessThanOrEqualTo(String value) {
            addCriterion("inform_way_name <=", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameLike(String value) {
            addCriterion("inform_way_name like", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameNotLike(String value) {
            addCriterion("inform_way_name not like", value, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameIn(List<String> values) {
            addCriterion("inform_way_name in", values, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameNotIn(List<String> values) {
            addCriterion("inform_way_name not in", values, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameBetween(String value1, String value2) {
            addCriterion("inform_way_name between", value1, value2, "informWayName");
            return (Criteria) this;
        }

        public Criteria andInformWayNameNotBetween(String value1, String value2) {
            addCriterion("inform_way_name not between", value1, value2, "informWayName");
            return (Criteria) this;
        }

        public Criteria andPositionPictureIsNull() {
            addCriterion("position_picture is null");
            return (Criteria) this;
        }

        public Criteria andPositionPictureIsNotNull() {
            addCriterion("position_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPositionPictureEqualTo(String value) {
            addCriterion("position_picture =", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureNotEqualTo(String value) {
            addCriterion("position_picture <>", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureGreaterThan(String value) {
            addCriterion("position_picture >", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureGreaterThanOrEqualTo(String value) {
            addCriterion("position_picture >=", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureLessThan(String value) {
            addCriterion("position_picture <", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureLessThanOrEqualTo(String value) {
            addCriterion("position_picture <=", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureLike(String value) {
            addCriterion("position_picture like", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureNotLike(String value) {
            addCriterion("position_picture not like", value, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureIn(List<String> values) {
            addCriterion("position_picture in", values, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureNotIn(List<String> values) {
            addCriterion("position_picture not in", values, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureBetween(String value1, String value2) {
            addCriterion("position_picture between", value1, value2, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionPictureNotBetween(String value1, String value2) {
            addCriterion("position_picture not between", value1, value2, "positionPicture");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureIsNull() {
            addCriterion("position_signature is null");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureIsNotNull() {
            addCriterion("position_signature is not null");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureEqualTo(String value) {
            addCriterion("position_signature =", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureNotEqualTo(String value) {
            addCriterion("position_signature <>", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureGreaterThan(String value) {
            addCriterion("position_signature >", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("position_signature >=", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureLessThan(String value) {
            addCriterion("position_signature <", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureLessThanOrEqualTo(String value) {
            addCriterion("position_signature <=", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureLike(String value) {
            addCriterion("position_signature like", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureNotLike(String value) {
            addCriterion("position_signature not like", value, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureIn(List<String> values) {
            addCriterion("position_signature in", values, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureNotIn(List<String> values) {
            addCriterion("position_signature not in", values, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureBetween(String value1, String value2) {
            addCriterion("position_signature between", value1, value2, "positionSignature");
            return (Criteria) this;
        }

        public Criteria andPositionSignatureNotBetween(String value1, String value2) {
            addCriterion("position_signature not between", value1, value2, "positionSignature");
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

        public Criteria andOccupationIdEqualTo(Integer value) {
            addCriterion("occupation_id =", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotEqualTo(Integer value) {
            addCriterion("occupation_id <>", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThan(Integer value) {
            addCriterion("occupation_id >", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupation_id >=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThan(Integer value) {
            addCriterion("occupation_id <", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThanOrEqualTo(Integer value) {
            addCriterion("occupation_id <=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIn(List<Integer> values) {
            addCriterion("occupation_id in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotIn(List<Integer> values) {
            addCriterion("occupation_id not in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdBetween(Integer value1, Integer value2) {
            addCriterion("occupation_id between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPositionInEnterpriseTimeIsNull() {
            addCriterion("position_in_enterprise_time is null");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeIsNotNull() {
            addCriterion("position_in_enterprise_time is not null");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeEqualTo(Date value) {
            addCriterion("position_in_enterprise_time =", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeNotEqualTo(Date value) {
            addCriterion("position_in_enterprise_time <>", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeGreaterThan(Date value) {
            addCriterion("position_in_enterprise_time >", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("position_in_enterprise_time >=", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeLessThan(Date value) {
            addCriterion("position_in_enterprise_time <", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeLessThanOrEqualTo(Date value) {
            addCriterion("position_in_enterprise_time <=", value, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeIn(List<Date> values) {
            addCriterion("position_in_enterprise_time in", values, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeNotIn(List<Date> values) {
            addCriterion("position_in_enterprise_time not in", values, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeBetween(Date value1, Date value2) {
            addCriterion("position_in_enterprise_time between", value1, value2, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionInEnterpriseTimeNotBetween(Date value1, Date value2) {
            addCriterion("position_in_enterprise_time not between", value1, value2, "positionInEnterpriseTime");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareIsNull() {
            addCriterion("position_is_for_prepare is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareIsNotNull() {
            addCriterion("position_is_for_prepare is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareEqualTo(Boolean value) {
            addCriterion("position_is_for_prepare =", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareNotEqualTo(Boolean value) {
            addCriterion("position_is_for_prepare <>", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareGreaterThan(Boolean value) {
            addCriterion("position_is_for_prepare >", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareGreaterThanOrEqualTo(Boolean value) {
            addCriterion("position_is_for_prepare >=", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareLessThan(Boolean value) {
            addCriterion("position_is_for_prepare <", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareLessThanOrEqualTo(Boolean value) {
            addCriterion("position_is_for_prepare <=", value, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareIn(List<Boolean> values) {
            addCriterion("position_is_for_prepare in", values, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareNotIn(List<Boolean> values) {
            addCriterion("position_is_for_prepare not in", values, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_for_prepare between", value1, value2, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForPrepareNotBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_for_prepare not between", value1, value2, "positionIsForPrepare");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveIsNull() {
            addCriterion("position_is_for_reserve is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveIsNotNull() {
            addCriterion("position_is_for_reserve is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveEqualTo(Boolean value) {
            addCriterion("position_is_for_reserve =", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveNotEqualTo(Boolean value) {
            addCriterion("position_is_for_reserve <>", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveGreaterThan(Boolean value) {
            addCriterion("position_is_for_reserve >", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("position_is_for_reserve >=", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveLessThan(Boolean value) {
            addCriterion("position_is_for_reserve <", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveLessThanOrEqualTo(Boolean value) {
            addCriterion("position_is_for_reserve <=", value, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveIn(List<Boolean> values) {
            addCriterion("position_is_for_reserve in", values, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveNotIn(List<Boolean> values) {
            addCriterion("position_is_for_reserve not in", values, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_for_reserve between", value1, value2, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsForReserveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_for_reserve not between", value1, value2, "positionIsForReserve");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredIsNull() {
            addCriterion("position_is_registered is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredIsNotNull() {
            addCriterion("position_is_registered is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredEqualTo(Boolean value) {
            addCriterion("position_is_registered =", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredNotEqualTo(Boolean value) {
            addCriterion("position_is_registered <>", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredGreaterThan(Boolean value) {
            addCriterion("position_is_registered >", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("position_is_registered >=", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredLessThan(Boolean value) {
            addCriterion("position_is_registered <", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredLessThanOrEqualTo(Boolean value) {
            addCriterion("position_is_registered <=", value, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredIn(List<Boolean> values) {
            addCriterion("position_is_registered in", values, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredNotIn(List<Boolean> values) {
            addCriterion("position_is_registered not in", values, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_registered between", value1, value2, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionIsRegisteredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("position_is_registered not between", value1, value2, "positionIsRegistered");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeIsNull() {
            addCriterion("position_register_time is null");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeIsNotNull() {
            addCriterion("position_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeEqualTo(Date value) {
            addCriterion("position_register_time =", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeNotEqualTo(Date value) {
            addCriterion("position_register_time <>", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeGreaterThan(Date value) {
            addCriterion("position_register_time >", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("position_register_time >=", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeLessThan(Date value) {
            addCriterion("position_register_time <", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("position_register_time <=", value, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeIn(List<Date> values) {
            addCriterion("position_register_time in", values, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeNotIn(List<Date> values) {
            addCriterion("position_register_time not in", values, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("position_register_time between", value1, value2, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("position_register_time not between", value1, value2, "positionRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeIsNull() {
            addCriterion("position_position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeIsNotNull() {
            addCriterion("position_position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeEqualTo(String value) {
            addCriterion("position_position_code =", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeNotEqualTo(String value) {
            addCriterion("position_position_code <>", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeGreaterThan(String value) {
            addCriterion("position_position_code >", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_position_code >=", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeLessThan(String value) {
            addCriterion("position_position_code <", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_position_code <=", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeLike(String value) {
            addCriterion("position_position_code like", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeNotLike(String value) {
            addCriterion("position_position_code not like", value, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeIn(List<String> values) {
            addCriterion("position_position_code in", values, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeNotIn(List<String> values) {
            addCriterion("position_position_code not in", values, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeBetween(String value1, String value2) {
            addCriterion("position_position_code between", value1, value2, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_position_code not between", value1, value2, "positionPositionCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeIsNull() {
            addCriterion("position_job_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeIsNotNull() {
            addCriterion("position_job_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeEqualTo(String value) {
            addCriterion("position_job_type_code =", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeNotEqualTo(String value) {
            addCriterion("position_job_type_code <>", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeGreaterThan(String value) {
            addCriterion("position_job_type_code >", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_job_type_code >=", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeLessThan(String value) {
            addCriterion("position_job_type_code <", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("position_job_type_code <=", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeLike(String value) {
            addCriterion("position_job_type_code like", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeNotLike(String value) {
            addCriterion("position_job_type_code not like", value, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeIn(List<String> values) {
            addCriterion("position_job_type_code in", values, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeNotIn(List<String> values) {
            addCriterion("position_job_type_code not in", values, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeBetween(String value1, String value2) {
            addCriterion("position_job_type_code between", value1, value2, "positionJobTypeCode");
            return (Criteria) this;
        }

        public Criteria andPositionJobTypeCodeNotBetween(String value1, String value2) {
            addCriterion("position_job_type_code not between", value1, value2, "positionJobTypeCode");
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

        public Criteria andPatientNoteIsNull() {
            addCriterion("patient_note is null");
            return (Criteria) this;
        }

        public Criteria andPatientNoteIsNotNull() {
            addCriterion("patient_note is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNoteEqualTo(String value) {
            addCriterion("patient_note =", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteNotEqualTo(String value) {
            addCriterion("patient_note <>", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteGreaterThan(String value) {
            addCriterion("patient_note >", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteGreaterThanOrEqualTo(String value) {
            addCriterion("patient_note >=", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteLessThan(String value) {
            addCriterion("patient_note <", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteLessThanOrEqualTo(String value) {
            addCriterion("patient_note <=", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteLike(String value) {
            addCriterion("patient_note like", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteNotLike(String value) {
            addCriterion("patient_note not like", value, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteIn(List<String> values) {
            addCriterion("patient_note in", values, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteNotIn(List<String> values) {
            addCriterion("patient_note not in", values, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteBetween(String value1, String value2) {
            addCriterion("patient_note between", value1, value2, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientNoteNotBetween(String value1, String value2) {
            addCriterion("patient_note not between", value1, value2, "patientNote");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeIsNull() {
            addCriterion("patient_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeIsNotNull() {
            addCriterion("patient_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeEqualTo(Date value) {
            addCriterion("patient_create_time =", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_create_time <>", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeGreaterThan(Date value) {
            addCriterion("patient_create_time >", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_create_time >=", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeLessThan(Date value) {
            addCriterion("patient_create_time <", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_create_time <=", value, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeIn(List<Date> values) {
            addCriterion("patient_create_time in", values, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_create_time not in", values, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_create_time between", value1, value2, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_create_time not between", value1, value2, "patientCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeIsNull() {
            addCriterion("patient_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeIsNotNull() {
            addCriterion("patient_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeEqualTo(Date value) {
            addCriterion("patient_edit_time =", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeNotEqualTo(Date value) {
            addCriterion("patient_edit_time <>", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeGreaterThan(Date value) {
            addCriterion("patient_edit_time >", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_edit_time >=", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeLessThan(Date value) {
            addCriterion("patient_edit_time <", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_edit_time <=", value, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeIn(List<Date> values) {
            addCriterion("patient_edit_time in", values, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeNotIn(List<Date> values) {
            addCriterion("patient_edit_time not in", values, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_edit_time between", value1, value2, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_edit_time not between", value1, value2, "patientEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIsNull() {
            addCriterion("patient_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIsNotNull() {
            addCriterion("patient_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientStatusEqualTo(Integer value) {
            addCriterion("patient_status =", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotEqualTo(Integer value) {
            addCriterion("patient_status <>", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusGreaterThan(Integer value) {
            addCriterion("patient_status >", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_status >=", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusLessThan(Integer value) {
            addCriterion("patient_status <", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_status <=", value, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusIn(List<Integer> values) {
            addCriterion("patient_status in", values, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotIn(List<Integer> values) {
            addCriterion("patient_status not in", values, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_status between", value1, value2, "patientStatus");
            return (Criteria) this;
        }

        public Criteria andPatientStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_status not between", value1, value2, "patientStatus");
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