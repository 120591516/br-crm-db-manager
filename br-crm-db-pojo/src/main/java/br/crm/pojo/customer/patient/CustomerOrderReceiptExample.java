package br.crm.pojo.customer.patient;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerOrderReceiptExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrderReceiptExample() {
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

        public Criteria andPatientReceiptIdIsNull() {
            addCriterion("patient_receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdIsNotNull() {
            addCriterion("patient_receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdEqualTo(String value) {
            addCriterion("patient_receipt_id =", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdNotEqualTo(String value) {
            addCriterion("patient_receipt_id <>", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdGreaterThan(String value) {
            addCriterion("patient_receipt_id >", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_receipt_id >=", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdLessThan(String value) {
            addCriterion("patient_receipt_id <", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdLessThanOrEqualTo(String value) {
            addCriterion("patient_receipt_id <=", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdLike(String value) {
            addCriterion("patient_receipt_id like", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdNotLike(String value) {
            addCriterion("patient_receipt_id not like", value, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdIn(List<String> values) {
            addCriterion("patient_receipt_id in", values, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdNotIn(List<String> values) {
            addCriterion("patient_receipt_id not in", values, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdBetween(String value1, String value2) {
            addCriterion("patient_receipt_id between", value1, value2, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptIdNotBetween(String value1, String value2) {
            addCriterion("patient_receipt_id not between", value1, value2, "patientReceiptId");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeIsNull() {
            addCriterion("ID_ReceiptType is null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeIsNotNull() {
            addCriterion("ID_ReceiptType is not null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeEqualTo(Long value) {
            addCriterion("ID_ReceiptType =", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotEqualTo(Long value) {
            addCriterion("ID_ReceiptType <>", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeGreaterThan(Long value) {
            addCriterion("ID_ReceiptType >", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ReceiptType >=", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeLessThan(Long value) {
            addCriterion("ID_ReceiptType <", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeLessThanOrEqualTo(Long value) {
            addCriterion("ID_ReceiptType <=", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeIn(List<Long> values) {
            addCriterion("ID_ReceiptType in", values, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotIn(List<Long> values) {
            addCriterion("ID_ReceiptType not in", values, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeBetween(Long value1, Long value2) {
            addCriterion("ID_ReceiptType between", value1, value2, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotBetween(Long value1, Long value2) {
            addCriterion("ID_ReceiptType not between", value1, value2, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeIsNull() {
            addCriterion("patient_receipt_type is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeIsNotNull() {
            addCriterion("patient_receipt_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeEqualTo(Integer value) {
            addCriterion("patient_receipt_type =", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeNotEqualTo(Integer value) {
            addCriterion("patient_receipt_type <>", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeGreaterThan(Integer value) {
            addCriterion("patient_receipt_type >", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_receipt_type >=", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeLessThan(Integer value) {
            addCriterion("patient_receipt_type <", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeLessThanOrEqualTo(Integer value) {
            addCriterion("patient_receipt_type <=", value, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeIn(List<Integer> values) {
            addCriterion("patient_receipt_type in", values, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeNotIn(List<Integer> values) {
            addCriterion("patient_receipt_type not in", values, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeBetween(Integer value1, Integer value2) {
            addCriterion("patient_receipt_type between", value1, value2, "patientReceiptType");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_receipt_type not between", value1, value2, "patientReceiptType");
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

        public Criteria andCustomerInfoIdIsNull() {
            addCriterion("customer_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdIsNotNull() {
            addCriterion("customer_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdEqualTo(String value) {
            addCriterion("customer_info_id =", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotEqualTo(String value) {
            addCriterion("customer_info_id <>", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdGreaterThan(String value) {
            addCriterion("customer_info_id >", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info_id >=", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLessThan(String value) {
            addCriterion("customer_info_id <", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLessThanOrEqualTo(String value) {
            addCriterion("customer_info_id <=", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdLike(String value) {
            addCriterion("customer_info_id like", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotLike(String value) {
            addCriterion("customer_info_id not like", value, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdIn(List<String> values) {
            addCriterion("customer_info_id in", values, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotIn(List<String> values) {
            addCriterion("customer_info_id not in", values, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdBetween(String value1, String value2) {
            addCriterion("customer_info_id between", value1, value2, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIdNotBetween(String value1, String value2) {
            addCriterion("customer_info_id not between", value1, value2, "customerInfoId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andPatientReceiptNameIsNull() {
            addCriterion("patient_receipt_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameIsNotNull() {
            addCriterion("patient_receipt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameEqualTo(String value) {
            addCriterion("patient_receipt_name =", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameNotEqualTo(String value) {
            addCriterion("patient_receipt_name <>", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameGreaterThan(String value) {
            addCriterion("patient_receipt_name >", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_receipt_name >=", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameLessThan(String value) {
            addCriterion("patient_receipt_name <", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("patient_receipt_name <=", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameLike(String value) {
            addCriterion("patient_receipt_name like", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameNotLike(String value) {
            addCriterion("patient_receipt_name not like", value, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameIn(List<String> values) {
            addCriterion("patient_receipt_name in", values, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameNotIn(List<String> values) {
            addCriterion("patient_receipt_name not in", values, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameBetween(String value1, String value2) {
            addCriterion("patient_receipt_name between", value1, value2, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptNameNotBetween(String value1, String value2) {
            addCriterion("patient_receipt_name not between", value1, value2, "patientReceiptName");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentIsNull() {
            addCriterion("patient_receipt_content is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentIsNotNull() {
            addCriterion("patient_receipt_content is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentEqualTo(String value) {
            addCriterion("patient_receipt_content =", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentNotEqualTo(String value) {
            addCriterion("patient_receipt_content <>", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentGreaterThan(String value) {
            addCriterion("patient_receipt_content >", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentGreaterThanOrEqualTo(String value) {
            addCriterion("patient_receipt_content >=", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentLessThan(String value) {
            addCriterion("patient_receipt_content <", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentLessThanOrEqualTo(String value) {
            addCriterion("patient_receipt_content <=", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentLike(String value) {
            addCriterion("patient_receipt_content like", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentNotLike(String value) {
            addCriterion("patient_receipt_content not like", value, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentIn(List<String> values) {
            addCriterion("patient_receipt_content in", values, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentNotIn(List<String> values) {
            addCriterion("patient_receipt_content not in", values, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentBetween(String value1, String value2) {
            addCriterion("patient_receipt_content between", value1, value2, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptContentNotBetween(String value1, String value2) {
            addCriterion("patient_receipt_content not between", value1, value2, "patientReceiptContent");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceIsNull() {
            addCriterion("patient_receipt_price is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceIsNotNull() {
            addCriterion("patient_receipt_price is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceEqualTo(BigDecimal value) {
            addCriterion("patient_receipt_price =", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceNotEqualTo(BigDecimal value) {
            addCriterion("patient_receipt_price <>", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceGreaterThan(BigDecimal value) {
            addCriterion("patient_receipt_price >", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_receipt_price >=", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceLessThan(BigDecimal value) {
            addCriterion("patient_receipt_price <", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("patient_receipt_price <=", value, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceIn(List<BigDecimal> values) {
            addCriterion("patient_receipt_price in", values, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceNotIn(List<BigDecimal> values) {
            addCriterion("patient_receipt_price not in", values, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_receipt_price between", value1, value2, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("patient_receipt_price not between", value1, value2, "patientReceiptPrice");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusIsNull() {
            addCriterion("patient_receipt_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusIsNotNull() {
            addCriterion("patient_receipt_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusEqualTo(String value) {
            addCriterion("patient_receipt_status =", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusNotEqualTo(String value) {
            addCriterion("patient_receipt_status <>", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusGreaterThan(String value) {
            addCriterion("patient_receipt_status >", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("patient_receipt_status >=", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusLessThan(String value) {
            addCriterion("patient_receipt_status <", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusLessThanOrEqualTo(String value) {
            addCriterion("patient_receipt_status <=", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusLike(String value) {
            addCriterion("patient_receipt_status like", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusNotLike(String value) {
            addCriterion("patient_receipt_status not like", value, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusIn(List<String> values) {
            addCriterion("patient_receipt_status in", values, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusNotIn(List<String> values) {
            addCriterion("patient_receipt_status not in", values, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusBetween(String value1, String value2) {
            addCriterion("patient_receipt_status between", value1, value2, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptStatusNotBetween(String value1, String value2) {
            addCriterion("patient_receipt_status not between", value1, value2, "patientReceiptStatus");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeIsNull() {
            addCriterion("patient_receipt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeIsNotNull() {
            addCriterion("patient_receipt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeEqualTo(Date value) {
            addCriterion("patient_receipt_create_time =", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_receipt_create_time <>", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeGreaterThan(Date value) {
            addCriterion("patient_receipt_create_time >", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_receipt_create_time >=", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeLessThan(Date value) {
            addCriterion("patient_receipt_create_time <", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_receipt_create_time <=", value, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeIn(List<Date> values) {
            addCriterion("patient_receipt_create_time in", values, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_receipt_create_time not in", values, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_receipt_create_time between", value1, value2, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_receipt_create_time not between", value1, value2, "patientReceiptCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeIsNull() {
            addCriterion("patient_receipt_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeIsNotNull() {
            addCriterion("patient_receipt_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeEqualTo(Date value) {
            addCriterion("patient_receipt_edit_time =", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeNotEqualTo(Date value) {
            addCriterion("patient_receipt_edit_time <>", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeGreaterThan(Date value) {
            addCriterion("patient_receipt_edit_time >", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_receipt_edit_time >=", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeLessThan(Date value) {
            addCriterion("patient_receipt_edit_time <", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_receipt_edit_time <=", value, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeIn(List<Date> values) {
            addCriterion("patient_receipt_edit_time in", values, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeNotIn(List<Date> values) {
            addCriterion("patient_receipt_edit_time not in", values, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_receipt_edit_time between", value1, value2, "patientReceiptEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientReceiptEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_receipt_edit_time not between", value1, value2, "patientReceiptEditTime");
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