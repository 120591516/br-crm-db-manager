package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientArchiveExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientArchiveExample() {
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

        public Criteria andPatientArchiveInputCodeIsNull() {
            addCriterion("patient_archive_input_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeIsNotNull() {
            addCriterion("patient_archive_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeEqualTo(String value) {
            addCriterion("patient_archive_input_code =", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeNotEqualTo(String value) {
            addCriterion("patient_archive_input_code <>", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeGreaterThan(String value) {
            addCriterion("patient_archive_input_code >", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_archive_input_code >=", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeLessThan(String value) {
            addCriterion("patient_archive_input_code <", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_archive_input_code <=", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeLike(String value) {
            addCriterion("patient_archive_input_code like", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeNotLike(String value) {
            addCriterion("patient_archive_input_code not like", value, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeIn(List<String> values) {
            addCriterion("patient_archive_input_code in", values, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeNotIn(List<String> values) {
            addCriterion("patient_archive_input_code not in", values, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeBetween(String value1, String value2) {
            addCriterion("patient_archive_input_code between", value1, value2, "patientArchiveInputCode");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveInputCodeNotBetween(String value1, String value2) {
            addCriterion("patient_archive_input_code not between", value1, value2, "patientArchiveInputCode");
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

        public Criteria andPatientArchiveNoteIsNull() {
            addCriterion("patient_archive_note is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteIsNotNull() {
            addCriterion("patient_archive_note is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteEqualTo(String value) {
            addCriterion("patient_archive_note =", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteNotEqualTo(String value) {
            addCriterion("patient_archive_note <>", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteGreaterThan(String value) {
            addCriterion("patient_archive_note >", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteGreaterThanOrEqualTo(String value) {
            addCriterion("patient_archive_note >=", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteLessThan(String value) {
            addCriterion("patient_archive_note <", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteLessThanOrEqualTo(String value) {
            addCriterion("patient_archive_note <=", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteLike(String value) {
            addCriterion("patient_archive_note like", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteNotLike(String value) {
            addCriterion("patient_archive_note not like", value, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteIn(List<String> values) {
            addCriterion("patient_archive_note in", values, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteNotIn(List<String> values) {
            addCriterion("patient_archive_note not in", values, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteBetween(String value1, String value2) {
            addCriterion("patient_archive_note between", value1, value2, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveNoteNotBetween(String value1, String value2) {
            addCriterion("patient_archive_note not between", value1, value2, "patientArchiveNote");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeIsNull() {
            addCriterion("patient_archive_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeIsNotNull() {
            addCriterion("patient_archive_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeEqualTo(Date value) {
            addCriterion("patient_archive_create_time =", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_archive_create_time <>", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeGreaterThan(Date value) {
            addCriterion("patient_archive_create_time >", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_archive_create_time >=", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeLessThan(Date value) {
            addCriterion("patient_archive_create_time <", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_archive_create_time <=", value, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeIn(List<Date> values) {
            addCriterion("patient_archive_create_time in", values, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_archive_create_time not in", values, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_archive_create_time between", value1, value2, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_archive_create_time not between", value1, value2, "patientArchiveCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeIsNull() {
            addCriterion("patient_archive_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeIsNotNull() {
            addCriterion("patient_archive_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeEqualTo(Date value) {
            addCriterion("patient_archive_edit_time =", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeNotEqualTo(Date value) {
            addCriterion("patient_archive_edit_time <>", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeGreaterThan(Date value) {
            addCriterion("patient_archive_edit_time >", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_archive_edit_time >=", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeLessThan(Date value) {
            addCriterion("patient_archive_edit_time <", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_archive_edit_time <=", value, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeIn(List<Date> values) {
            addCriterion("patient_archive_edit_time in", values, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeNotIn(List<Date> values) {
            addCriterion("patient_archive_edit_time not in", values, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_archive_edit_time between", value1, value2, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_archive_edit_time not between", value1, value2, "patientArchiveEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusIsNull() {
            addCriterion("patient_archive_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusIsNotNull() {
            addCriterion("patient_archive_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusEqualTo(Integer value) {
            addCriterion("patient_archive_status =", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusNotEqualTo(Integer value) {
            addCriterion("patient_archive_status <>", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusGreaterThan(Integer value) {
            addCriterion("patient_archive_status >", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_archive_status >=", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusLessThan(Integer value) {
            addCriterion("patient_archive_status <", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_archive_status <=", value, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusIn(List<Integer> values) {
            addCriterion("patient_archive_status in", values, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusNotIn(List<Integer> values) {
            addCriterion("patient_archive_status not in", values, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_archive_status between", value1, value2, "patientArchiveStatus");
            return (Criteria) this;
        }

        public Criteria andPatientArchiveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_archive_status not between", value1, value2, "patientArchiveStatus");
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