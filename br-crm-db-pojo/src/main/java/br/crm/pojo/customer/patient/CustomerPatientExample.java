package br.crm.pojo.customer.patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerPatientExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerPatientExample() {
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

        public Criteria andCustomerPatientIdIsNull() {
            addCriterion("customer_patient_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdIsNotNull() {
            addCriterion("customer_patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdEqualTo(String value) {
            addCriterion("customer_patient_id =", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdNotEqualTo(String value) {
            addCriterion("customer_patient_id <>", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdGreaterThan(String value) {
            addCriterion("customer_patient_id >", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_patient_id >=", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdLessThan(String value) {
            addCriterion("customer_patient_id <", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdLessThanOrEqualTo(String value) {
            addCriterion("customer_patient_id <=", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdLike(String value) {
            addCriterion("customer_patient_id like", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdNotLike(String value) {
            addCriterion("customer_patient_id not like", value, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdIn(List<String> values) {
            addCriterion("customer_patient_id in", values, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdNotIn(List<String> values) {
            addCriterion("customer_patient_id not in", values, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdBetween(String value1, String value2) {
            addCriterion("customer_patient_id between", value1, value2, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdNotBetween(String value1, String value2) {
            addCriterion("customer_patient_id not between", value1, value2, "customerPatientId");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(String value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(String value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(String value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(String value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(String value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLike(String value) {
            addCriterion("cart_id like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotLike(String value) {
            addCriterion("cart_id not like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<String> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<String> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(String value1, String value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(String value1, String value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
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

        public Criteria andCustomerPatientNameIsNull() {
            addCriterion("customer_patient_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameIsNotNull() {
            addCriterion("customer_patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameEqualTo(String value) {
            addCriterion("customer_patient_name =", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameNotEqualTo(String value) {
            addCriterion("customer_patient_name <>", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameGreaterThan(String value) {
            addCriterion("customer_patient_name >", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_patient_name >=", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameLessThan(String value) {
            addCriterion("customer_patient_name <", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameLessThanOrEqualTo(String value) {
            addCriterion("customer_patient_name <=", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameLike(String value) {
            addCriterion("customer_patient_name like", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameNotLike(String value) {
            addCriterion("customer_patient_name not like", value, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameIn(List<String> values) {
            addCriterion("customer_patient_name in", values, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameNotIn(List<String> values) {
            addCriterion("customer_patient_name not in", values, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameBetween(String value1, String value2) {
            addCriterion("customer_patient_name between", value1, value2, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientNameNotBetween(String value1, String value2) {
            addCriterion("customer_patient_name not between", value1, value2, "customerPatientName");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneIsNull() {
            addCriterion("customer_patient_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneIsNotNull() {
            addCriterion("customer_patient_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneEqualTo(String value) {
            addCriterion("customer_patient_phone =", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneNotEqualTo(String value) {
            addCriterion("customer_patient_phone <>", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneGreaterThan(String value) {
            addCriterion("customer_patient_phone >", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_patient_phone >=", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneLessThan(String value) {
            addCriterion("customer_patient_phone <", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_patient_phone <=", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneLike(String value) {
            addCriterion("customer_patient_phone like", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneNotLike(String value) {
            addCriterion("customer_patient_phone not like", value, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneIn(List<String> values) {
            addCriterion("customer_patient_phone in", values, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneNotIn(List<String> values) {
            addCriterion("customer_patient_phone not in", values, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneBetween(String value1, String value2) {
            addCriterion("customer_patient_phone between", value1, value2, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_patient_phone not between", value1, value2, "customerPatientPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeIsNull() {
            addCriterion("customer_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeIsNotNull() {
            addCriterion("customer_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeEqualTo(Integer value) {
            addCriterion("customer_certificate_type =", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeNotEqualTo(Integer value) {
            addCriterion("customer_certificate_type <>", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeGreaterThan(Integer value) {
            addCriterion("customer_certificate_type >", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_certificate_type >=", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeLessThan(Integer value) {
            addCriterion("customer_certificate_type <", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("customer_certificate_type <=", value, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeIn(List<Integer> values) {
            addCriterion("customer_certificate_type in", values, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeNotIn(List<Integer> values) {
            addCriterion("customer_certificate_type not in", values, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeBetween(Integer value1, Integer value2) {
            addCriterion("customer_certificate_type between", value1, value2, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerCertificateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_certificate_type not between", value1, value2, "customerCertificateType");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardIsNull() {
            addCriterion("customer_patient_id_card is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardIsNotNull() {
            addCriterion("customer_patient_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardEqualTo(String value) {
            addCriterion("customer_patient_id_card =", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardNotEqualTo(String value) {
            addCriterion("customer_patient_id_card <>", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardGreaterThan(String value) {
            addCriterion("customer_patient_id_card >", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("customer_patient_id_card >=", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardLessThan(String value) {
            addCriterion("customer_patient_id_card <", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardLessThanOrEqualTo(String value) {
            addCriterion("customer_patient_id_card <=", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardLike(String value) {
            addCriterion("customer_patient_id_card like", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardNotLike(String value) {
            addCriterion("customer_patient_id_card not like", value, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardIn(List<String> values) {
            addCriterion("customer_patient_id_card in", values, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardNotIn(List<String> values) {
            addCriterion("customer_patient_id_card not in", values, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardBetween(String value1, String value2) {
            addCriterion("customer_patient_id_card between", value1, value2, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientIdCardNotBetween(String value1, String value2) {
            addCriterion("customer_patient_id_card not between", value1, value2, "customerPatientIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeIsNull() {
            addCriterion("customer_patient_exam_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeIsNotNull() {
            addCriterion("customer_patient_exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeEqualTo(Date value) {
            addCriterion("customer_patient_exam_time =", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeNotEqualTo(Date value) {
            addCriterion("customer_patient_exam_time <>", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeGreaterThan(Date value) {
            addCriterion("customer_patient_exam_time >", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_patient_exam_time >=", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeLessThan(Date value) {
            addCriterion("customer_patient_exam_time <", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_patient_exam_time <=", value, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeIn(List<Date> values) {
            addCriterion("customer_patient_exam_time in", values, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeNotIn(List<Date> values) {
            addCriterion("customer_patient_exam_time not in", values, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeBetween(Date value1, Date value2) {
            addCriterion("customer_patient_exam_time between", value1, value2, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientExamTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_patient_exam_time not between", value1, value2, "customerPatientExamTime");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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

        public Criteria andCustomerPatientStatusIsNull() {
            addCriterion("customer_patient_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusIsNotNull() {
            addCriterion("customer_patient_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusEqualTo(Integer value) {
            addCriterion("customer_patient_status =", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusNotEqualTo(Integer value) {
            addCriterion("customer_patient_status <>", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusGreaterThan(Integer value) {
            addCriterion("customer_patient_status >", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_patient_status >=", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusLessThan(Integer value) {
            addCriterion("customer_patient_status <", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_patient_status <=", value, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusIn(List<Integer> values) {
            addCriterion("customer_patient_status in", values, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusNotIn(List<Integer> values) {
            addCriterion("customer_patient_status not in", values, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_patient_status between", value1, value2, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_patient_status not between", value1, value2, "customerPatientStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeIsNull() {
            addCriterion("customer_patient_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeIsNotNull() {
            addCriterion("customer_patient_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeEqualTo(Date value) {
            addCriterion("customer_patient_create_time =", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_patient_create_time <>", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeGreaterThan(Date value) {
            addCriterion("customer_patient_create_time >", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_patient_create_time >=", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeLessThan(Date value) {
            addCriterion("customer_patient_create_time <", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_patient_create_time <=", value, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeIn(List<Date> values) {
            addCriterion("customer_patient_create_time in", values, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_patient_create_time not in", values, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_patient_create_time between", value1, value2, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_patient_create_time not between", value1, value2, "customerPatientCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeIsNull() {
            addCriterion("customer_patient_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeIsNotNull() {
            addCriterion("customer_patient_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeEqualTo(Date value) {
            addCriterion("customer_patient_edit_time =", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeNotEqualTo(Date value) {
            addCriterion("customer_patient_edit_time <>", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeGreaterThan(Date value) {
            addCriterion("customer_patient_edit_time >", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_patient_edit_time >=", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeLessThan(Date value) {
            addCriterion("customer_patient_edit_time <", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_patient_edit_time <=", value, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeIn(List<Date> values) {
            addCriterion("customer_patient_edit_time in", values, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeNotIn(List<Date> values) {
            addCriterion("customer_patient_edit_time not in", values, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeBetween(Date value1, Date value2) {
            addCriterion("customer_patient_edit_time between", value1, value2, "customerPatientEditTime");
            return (Criteria) this;
        }

        public Criteria andCustomerPatientEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_patient_edit_time not between", value1, value2, "customerPatientEditTime");
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