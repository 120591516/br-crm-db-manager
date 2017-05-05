package br.crm.pojo.patient.registerSheet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientRegisterSheetExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientRegisterSheetExample() {
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

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("reg_id like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("reg_id not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNull() {
            addCriterion("reg_no is null");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNotNull() {
            addCriterion("reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegNoEqualTo(String value) {
            addCriterion("reg_no =", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotEqualTo(String value) {
            addCriterion("reg_no <>", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThan(String value) {
            addCriterion("reg_no >", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("reg_no >=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThan(String value) {
            addCriterion("reg_no <", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThanOrEqualTo(String value) {
            addCriterion("reg_no <=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLike(String value) {
            addCriterion("reg_no like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotLike(String value) {
            addCriterion("reg_no not like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIn(List<String> values) {
            addCriterion("reg_no in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotIn(List<String> values) {
            addCriterion("reg_no not in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoBetween(String value1, String value2) {
            addCriterion("reg_no between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotBetween(String value1, String value2) {
            addCriterion("reg_no not between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegChainIdIsNull() {
            addCriterion("reg_chain_id is null");
            return (Criteria) this;
        }

        public Criteria andRegChainIdIsNotNull() {
            addCriterion("reg_chain_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegChainIdEqualTo(String value) {
            addCriterion("reg_chain_id =", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdNotEqualTo(String value) {
            addCriterion("reg_chain_id <>", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdGreaterThan(String value) {
            addCriterion("reg_chain_id >", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_chain_id >=", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdLessThan(String value) {
            addCriterion("reg_chain_id <", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdLessThanOrEqualTo(String value) {
            addCriterion("reg_chain_id <=", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdLike(String value) {
            addCriterion("reg_chain_id like", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdNotLike(String value) {
            addCriterion("reg_chain_id not like", value, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdIn(List<String> values) {
            addCriterion("reg_chain_id in", values, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdNotIn(List<String> values) {
            addCriterion("reg_chain_id not in", values, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdBetween(String value1, String value2) {
            addCriterion("reg_chain_id between", value1, value2, "regChainId");
            return (Criteria) this;
        }

        public Criteria andRegChainIdNotBetween(String value1, String value2) {
            addCriterion("reg_chain_id not between", value1, value2, "regChainId");
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

        public Criteria andPatientCardNoTypeIsNull() {
            addCriterion("patient_card_no_type is null");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeIsNotNull() {
            addCriterion("patient_card_no_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeEqualTo(String value) {
            addCriterion("patient_card_no_type =", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeNotEqualTo(String value) {
            addCriterion("patient_card_no_type <>", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeGreaterThan(String value) {
            addCriterion("patient_card_no_type >", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_card_no_type >=", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeLessThan(String value) {
            addCriterion("patient_card_no_type <", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeLessThanOrEqualTo(String value) {
            addCriterion("patient_card_no_type <=", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeLike(String value) {
            addCriterion("patient_card_no_type like", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeNotLike(String value) {
            addCriterion("patient_card_no_type not like", value, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeIn(List<String> values) {
            addCriterion("patient_card_no_type in", values, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeNotIn(List<String> values) {
            addCriterion("patient_card_no_type not in", values, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeBetween(String value1, String value2) {
            addCriterion("patient_card_no_type between", value1, value2, "patientCardNoType");
            return (Criteria) this;
        }

        public Criteria andPatientCardNoTypeNotBetween(String value1, String value2) {
            addCriterion("patient_card_no_type not between", value1, value2, "patientCardNoType");
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

        public Criteria andPatientNoIsNull() {
            addCriterion("patient_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientNoIsNotNull() {
            addCriterion("patient_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNoEqualTo(String value) {
            addCriterion("patient_no =", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoNotEqualTo(String value) {
            addCriterion("patient_no <>", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoGreaterThan(String value) {
            addCriterion("patient_no >", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_no >=", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoLessThan(String value) {
            addCriterion("patient_no <", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoLessThanOrEqualTo(String value) {
            addCriterion("patient_no <=", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoLike(String value) {
            addCriterion("patient_no like", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoNotLike(String value) {
            addCriterion("patient_no not like", value, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoIn(List<String> values) {
            addCriterion("patient_no in", values, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoNotIn(List<String> values) {
            addCriterion("patient_no not in", values, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoBetween(String value1, String value2) {
            addCriterion("patient_no between", value1, value2, "patientNo");
            return (Criteria) this;
        }

        public Criteria andPatientNoNotBetween(String value1, String value2) {
            addCriterion("patient_no not between", value1, value2, "patientNo");
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

        public Criteria andRegIsReturnIsNull() {
            addCriterion("reg_is_return is null");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnIsNotNull() {
            addCriterion("reg_is_return is not null");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnEqualTo(Boolean value) {
            addCriterion("reg_is_return =", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnNotEqualTo(Boolean value) {
            addCriterion("reg_is_return <>", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnGreaterThan(Boolean value) {
            addCriterion("reg_is_return >", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_is_return >=", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnLessThan(Boolean value) {
            addCriterion("reg_is_return <", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_is_return <=", value, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnIn(List<Boolean> values) {
            addCriterion("reg_is_return in", values, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnNotIn(List<Boolean> values) {
            addCriterion("reg_is_return not in", values, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_is_return between", value1, value2, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_is_return not between", value1, value2, "regIsReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnIsNull() {
            addCriterion("reg_is_whole_return is null");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnIsNotNull() {
            addCriterion("reg_is_whole_return is not null");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnEqualTo(Boolean value) {
            addCriterion("reg_is_whole_return =", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnNotEqualTo(Boolean value) {
            addCriterion("reg_is_whole_return <>", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnGreaterThan(Boolean value) {
            addCriterion("reg_is_whole_return >", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_is_whole_return >=", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnLessThan(Boolean value) {
            addCriterion("reg_is_whole_return <", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_is_whole_return <=", value, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnIn(List<Boolean> values) {
            addCriterion("reg_is_whole_return in", values, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnNotIn(List<Boolean> values) {
            addCriterion("reg_is_whole_return not in", values, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_is_whole_return between", value1, value2, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegIsWholeReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_is_whole_return not between", value1, value2, "regIsWholeReturn");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdIsNull() {
            addCriterion("reg_whole_return_id is null");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdIsNotNull() {
            addCriterion("reg_whole_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdEqualTo(String value) {
            addCriterion("reg_whole_return_id =", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdNotEqualTo(String value) {
            addCriterion("reg_whole_return_id <>", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdGreaterThan(String value) {
            addCriterion("reg_whole_return_id >", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_whole_return_id >=", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdLessThan(String value) {
            addCriterion("reg_whole_return_id <", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdLessThanOrEqualTo(String value) {
            addCriterion("reg_whole_return_id <=", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdLike(String value) {
            addCriterion("reg_whole_return_id like", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdNotLike(String value) {
            addCriterion("reg_whole_return_id not like", value, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdIn(List<String> values) {
            addCriterion("reg_whole_return_id in", values, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdNotIn(List<String> values) {
            addCriterion("reg_whole_return_id not in", values, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdBetween(String value1, String value2) {
            addCriterion("reg_whole_return_id between", value1, value2, "regWholeReturnId");
            return (Criteria) this;
        }

        public Criteria andRegWholeReturnIdNotBetween(String value1, String value2) {
            addCriterion("reg_whole_return_id not between", value1, value2, "regWholeReturnId");
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

        public Criteria andRegTransferedIsNull() {
            addCriterion("reg_transfered is null");
            return (Criteria) this;
        }

        public Criteria andRegTransferedIsNotNull() {
            addCriterion("reg_transfered is not null");
            return (Criteria) this;
        }

        public Criteria andRegTransferedEqualTo(Boolean value) {
            addCriterion("reg_transfered =", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedNotEqualTo(Boolean value) {
            addCriterion("reg_transfered <>", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedGreaterThan(Boolean value) {
            addCriterion("reg_transfered >", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_transfered >=", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedLessThan(Boolean value) {
            addCriterion("reg_transfered <", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_transfered <=", value, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedIn(List<Boolean> values) {
            addCriterion("reg_transfered in", values, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedNotIn(List<Boolean> values) {
            addCriterion("reg_transfered not in", values, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_transfered between", value1, value2, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegTransferedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_transfered not between", value1, value2, "regTransfered");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedIsNull() {
            addCriterion("reg_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedIsNotNull() {
            addCriterion("reg_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedEqualTo(Boolean value) {
            addCriterion("reg_confirmed =", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedNotEqualTo(Boolean value) {
            addCriterion("reg_confirmed <>", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedGreaterThan(Boolean value) {
            addCriterion("reg_confirmed >", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_confirmed >=", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedLessThan(Boolean value) {
            addCriterion("reg_confirmed <", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_confirmed <=", value, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedIn(List<Boolean> values) {
            addCriterion("reg_confirmed in", values, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedNotIn(List<Boolean> values) {
            addCriterion("reg_confirmed not in", values, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_confirmed between", value1, value2, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegConfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_confirmed not between", value1, value2, "regConfirmed");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedIsNull() {
            addCriterion("reg_fee_charged is null");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedIsNotNull() {
            addCriterion("reg_fee_charged is not null");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedEqualTo(Boolean value) {
            addCriterion("reg_fee_charged =", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedNotEqualTo(Boolean value) {
            addCriterion("reg_fee_charged <>", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedGreaterThan(Boolean value) {
            addCriterion("reg_fee_charged >", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_fee_charged >=", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedLessThan(Boolean value) {
            addCriterion("reg_fee_charged <", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_fee_charged <=", value, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedIn(List<Boolean> values) {
            addCriterion("reg_fee_charged in", values, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedNotIn(List<Boolean> values) {
            addCriterion("reg_fee_charged not in", values, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_fee_charged between", value1, value2, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegFeeChargedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_fee_charged not between", value1, value2, "regFeeCharged");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountIsNull() {
            addCriterion("reg_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountIsNotNull() {
            addCriterion("reg_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountEqualTo(BigDecimal value) {
            addCriterion("reg_money_amount =", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountNotEqualTo(BigDecimal value) {
            addCriterion("reg_money_amount <>", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountGreaterThan(BigDecimal value) {
            addCriterion("reg_money_amount >", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_money_amount >=", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountLessThan(BigDecimal value) {
            addCriterion("reg_money_amount <", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_money_amount <=", value, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountIn(List<BigDecimal> values) {
            addCriterion("reg_money_amount in", values, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountNotIn(List<BigDecimal> values) {
            addCriterion("reg_money_amount not in", values, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_money_amount between", value1, value2, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegMoneyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_money_amount not between", value1, value2, "regMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeIsNull() {
            addCriterion("reg_exec_depart_code is null");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeIsNotNull() {
            addCriterion("reg_exec_depart_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeEqualTo(String value) {
            addCriterion("reg_exec_depart_code =", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeNotEqualTo(String value) {
            addCriterion("reg_exec_depart_code <>", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeGreaterThan(String value) {
            addCriterion("reg_exec_depart_code >", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_exec_depart_code >=", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeLessThan(String value) {
            addCriterion("reg_exec_depart_code <", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeLessThanOrEqualTo(String value) {
            addCriterion("reg_exec_depart_code <=", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeLike(String value) {
            addCriterion("reg_exec_depart_code like", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeNotLike(String value) {
            addCriterion("reg_exec_depart_code not like", value, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeIn(List<String> values) {
            addCriterion("reg_exec_depart_code in", values, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeNotIn(List<String> values) {
            addCriterion("reg_exec_depart_code not in", values, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeBetween(String value1, String value2) {
            addCriterion("reg_exec_depart_code between", value1, value2, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegExecDepartCodeNotBetween(String value1, String value2) {
            addCriterion("reg_exec_depart_code not between", value1, value2, "regExecDepartCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeIsNull() {
            addCriterion("reg_open_doctor_code is null");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeIsNotNull() {
            addCriterion("reg_open_doctor_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeEqualTo(String value) {
            addCriterion("reg_open_doctor_code =", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeNotEqualTo(String value) {
            addCriterion("reg_open_doctor_code <>", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeGreaterThan(String value) {
            addCriterion("reg_open_doctor_code >", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_open_doctor_code >=", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeLessThan(String value) {
            addCriterion("reg_open_doctor_code <", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeLessThanOrEqualTo(String value) {
            addCriterion("reg_open_doctor_code <=", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeLike(String value) {
            addCriterion("reg_open_doctor_code like", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeNotLike(String value) {
            addCriterion("reg_open_doctor_code not like", value, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeIn(List<String> values) {
            addCriterion("reg_open_doctor_code in", values, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeNotIn(List<String> values) {
            addCriterion("reg_open_doctor_code not in", values, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeBetween(String value1, String value2) {
            addCriterion("reg_open_doctor_code between", value1, value2, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorCodeNotBetween(String value1, String value2) {
            addCriterion("reg_open_doctor_code not between", value1, value2, "regOpenDoctorCode");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameIsNull() {
            addCriterion("reg_open_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameIsNotNull() {
            addCriterion("reg_open_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameEqualTo(String value) {
            addCriterion("reg_open_doctor_name =", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameNotEqualTo(String value) {
            addCriterion("reg_open_doctor_name <>", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameGreaterThan(String value) {
            addCriterion("reg_open_doctor_name >", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("reg_open_doctor_name >=", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameLessThan(String value) {
            addCriterion("reg_open_doctor_name <", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("reg_open_doctor_name <=", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameLike(String value) {
            addCriterion("reg_open_doctor_name like", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameNotLike(String value) {
            addCriterion("reg_open_doctor_name not like", value, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameIn(List<String> values) {
            addCriterion("reg_open_doctor_name in", values, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameNotIn(List<String> values) {
            addCriterion("reg_open_doctor_name not in", values, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameBetween(String value1, String value2) {
            addCriterion("reg_open_doctor_name between", value1, value2, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOpenDoctorNameNotBetween(String value1, String value2) {
            addCriterion("reg_open_doctor_name not between", value1, value2, "regOpenDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdIsNull() {
            addCriterion("reg_oper_register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdIsNotNull() {
            addCriterion("reg_oper_register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdEqualTo(String value) {
            addCriterion("reg_oper_register_id =", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdNotEqualTo(String value) {
            addCriterion("reg_oper_register_id <>", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdGreaterThan(String value) {
            addCriterion("reg_oper_register_id >", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_oper_register_id >=", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdLessThan(String value) {
            addCriterion("reg_oper_register_id <", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("reg_oper_register_id <=", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdLike(String value) {
            addCriterion("reg_oper_register_id like", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdNotLike(String value) {
            addCriterion("reg_oper_register_id not like", value, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdIn(List<String> values) {
            addCriterion("reg_oper_register_id in", values, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdNotIn(List<String> values) {
            addCriterion("reg_oper_register_id not in", values, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdBetween(String value1, String value2) {
            addCriterion("reg_oper_register_id between", value1, value2, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterIdNotBetween(String value1, String value2) {
            addCriterion("reg_oper_register_id not between", value1, value2, "regOperRegisterId");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeIsNull() {
            addCriterion("reg_oper_register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeIsNotNull() {
            addCriterion("reg_oper_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeEqualTo(Date value) {
            addCriterion("reg_oper_register_time =", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeNotEqualTo(Date value) {
            addCriterion("reg_oper_register_time <>", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeGreaterThan(Date value) {
            addCriterion("reg_oper_register_time >", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_oper_register_time >=", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeLessThan(Date value) {
            addCriterion("reg_oper_register_time <", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_oper_register_time <=", value, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeIn(List<Date> values) {
            addCriterion("reg_oper_register_time in", values, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeNotIn(List<Date> values) {
            addCriterion("reg_oper_register_time not in", values, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("reg_oper_register_time between", value1, value2, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegOperRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_oper_register_time not between", value1, value2, "regOperRegisterTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdIsNull() {
            addCriterion("reg_charger_id is null");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdIsNotNull() {
            addCriterion("reg_charger_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdEqualTo(String value) {
            addCriterion("reg_charger_id =", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdNotEqualTo(String value) {
            addCriterion("reg_charger_id <>", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdGreaterThan(String value) {
            addCriterion("reg_charger_id >", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_charger_id >=", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdLessThan(String value) {
            addCriterion("reg_charger_id <", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdLessThanOrEqualTo(String value) {
            addCriterion("reg_charger_id <=", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdLike(String value) {
            addCriterion("reg_charger_id like", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdNotLike(String value) {
            addCriterion("reg_charger_id not like", value, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdIn(List<String> values) {
            addCriterion("reg_charger_id in", values, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdNotIn(List<String> values) {
            addCriterion("reg_charger_id not in", values, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdBetween(String value1, String value2) {
            addCriterion("reg_charger_id between", value1, value2, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerIdNotBetween(String value1, String value2) {
            addCriterion("reg_charger_id not between", value1, value2, "regChargerId");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeIsNull() {
            addCriterion("reg_charger_time is null");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeIsNotNull() {
            addCriterion("reg_charger_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeEqualTo(Date value) {
            addCriterion("reg_charger_time =", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeNotEqualTo(Date value) {
            addCriterion("reg_charger_time <>", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeGreaterThan(Date value) {
            addCriterion("reg_charger_time >", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_charger_time >=", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeLessThan(Date value) {
            addCriterion("reg_charger_time <", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_charger_time <=", value, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeIn(List<Date> values) {
            addCriterion("reg_charger_time in", values, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeNotIn(List<Date> values) {
            addCriterion("reg_charger_time not in", values, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeBetween(Date value1, Date value2) {
            addCriterion("reg_charger_time between", value1, value2, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegChargerTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_charger_time not between", value1, value2, "regChargerTime");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIsNull() {
            addCriterion("reg_work_inner_modify is null");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIsNotNull() {
            addCriterion("reg_work_inner_modify is not null");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify =", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify <>", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyGreaterThan(Boolean value) {
            addCriterion("reg_work_inner_modify >", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify >=", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyLessThan(Boolean value) {
            addCriterion("reg_work_inner_modify <", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyLessThanOrEqualTo(Boolean value) {
            addCriterion("reg_work_inner_modify <=", value, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyIn(List<Boolean> values) {
            addCriterion("reg_work_inner_modify in", values, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotIn(List<Boolean> values) {
            addCriterion("reg_work_inner_modify not in", values, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_work_inner_modify between", value1, value2, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegWorkInnerModifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg_work_inner_modify not between", value1, value2, "regWorkInnerModify");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeIsNull() {
            addCriterion("reg_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeIsNotNull() {
            addCriterion("reg_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeEqualTo(Long value) {
            addCriterion("reg_create_time =", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeNotEqualTo(Long value) {
            addCriterion("reg_create_time <>", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeGreaterThan(Long value) {
            addCriterion("reg_create_time >", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_create_time >=", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeLessThan(Long value) {
            addCriterion("reg_create_time <", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("reg_create_time <=", value, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeIn(List<Long> values) {
            addCriterion("reg_create_time in", values, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeNotIn(List<Long> values) {
            addCriterion("reg_create_time not in", values, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeBetween(Long value1, Long value2) {
            addCriterion("reg_create_time between", value1, value2, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("reg_create_time not between", value1, value2, "regCreateTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeIsNull() {
            addCriterion("reg_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeIsNotNull() {
            addCriterion("reg_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeEqualTo(Long value) {
            addCriterion("reg_edit_time =", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeNotEqualTo(Long value) {
            addCriterion("reg_edit_time <>", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeGreaterThan(Long value) {
            addCriterion("reg_edit_time >", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_edit_time >=", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeLessThan(Long value) {
            addCriterion("reg_edit_time <", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeLessThanOrEqualTo(Long value) {
            addCriterion("reg_edit_time <=", value, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeIn(List<Long> values) {
            addCriterion("reg_edit_time in", values, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeNotIn(List<Long> values) {
            addCriterion("reg_edit_time not in", values, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeBetween(Long value1, Long value2) {
            addCriterion("reg_edit_time between", value1, value2, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegEditTimeNotBetween(Long value1, Long value2) {
            addCriterion("reg_edit_time not between", value1, value2, "regEditTime");
            return (Criteria) this;
        }

        public Criteria andRegStatusIsNull() {
            addCriterion("reg_status is null");
            return (Criteria) this;
        }

        public Criteria andRegStatusIsNotNull() {
            addCriterion("reg_status is not null");
            return (Criteria) this;
        }

        public Criteria andRegStatusEqualTo(Integer value) {
            addCriterion("reg_status =", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotEqualTo(Integer value) {
            addCriterion("reg_status <>", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusGreaterThan(Integer value) {
            addCriterion("reg_status >", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_status >=", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusLessThan(Integer value) {
            addCriterion("reg_status <", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusLessThanOrEqualTo(Integer value) {
            addCriterion("reg_status <=", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusIn(List<Integer> values) {
            addCriterion("reg_status in", values, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotIn(List<Integer> values) {
            addCriterion("reg_status not in", values, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusBetween(Integer value1, Integer value2) {
            addCriterion("reg_status between", value1, value2, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_status not between", value1, value2, "regStatus");
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