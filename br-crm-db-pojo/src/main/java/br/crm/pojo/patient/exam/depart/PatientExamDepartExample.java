package br.crm.pojo.patient.exam.depart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExamDepartExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExamDepartExample() {
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

        public Criteria andPatientExamDepartIdIsNull() {
            addCriterion("patient_exam_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdIsNotNull() {
            addCriterion("patient_exam_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdEqualTo(String value) {
            addCriterion("patient_exam_depart_id =", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotEqualTo(String value) {
            addCriterion("patient_exam_depart_id <>", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdGreaterThan(String value) {
            addCriterion("patient_exam_depart_id >", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_depart_id >=", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLessThan(String value) {
            addCriterion("patient_exam_depart_id <", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_depart_id <=", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdLike(String value) {
            addCriterion("patient_exam_depart_id like", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotLike(String value) {
            addCriterion("patient_exam_depart_id not like", value, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdIn(List<String> values) {
            addCriterion("patient_exam_depart_id in", values, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotIn(List<String> values) {
            addCriterion("patient_exam_depart_id not in", values, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdBetween(String value1, String value2) {
            addCriterion("patient_exam_depart_id between", value1, value2, "patientExamDepartId");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_depart_id not between", value1, value2, "patientExamDepartId");
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

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("depart_id like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("depart_id not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeIsNull() {
            addCriterion("depart_daily_no_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeIsNotNull() {
            addCriterion("depart_daily_no_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeEqualTo(Date value) {
            addCriterion("depart_daily_no_time =", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeNotEqualTo(Date value) {
            addCriterion("depart_daily_no_time <>", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeGreaterThan(Date value) {
            addCriterion("depart_daily_no_time >", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("depart_daily_no_time >=", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeLessThan(Date value) {
            addCriterion("depart_daily_no_time <", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeLessThanOrEqualTo(Date value) {
            addCriterion("depart_daily_no_time <=", value, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeIn(List<Date> values) {
            addCriterion("depart_daily_no_time in", values, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeNotIn(List<Date> values) {
            addCriterion("depart_daily_no_time not in", values, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeBetween(Date value1, Date value2) {
            addCriterion("depart_daily_no_time between", value1, value2, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoTimeNotBetween(Date value1, Date value2) {
            addCriterion("depart_daily_no_time not between", value1, value2, "departDailyNoTime");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoIsNull() {
            addCriterion("depart_daily_no is null");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoIsNotNull() {
            addCriterion("depart_daily_no is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoEqualTo(Integer value) {
            addCriterion("depart_daily_no =", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoNotEqualTo(Integer value) {
            addCriterion("depart_daily_no <>", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoGreaterThan(Integer value) {
            addCriterion("depart_daily_no >", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("depart_daily_no >=", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoLessThan(Integer value) {
            addCriterion("depart_daily_no <", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoLessThanOrEqualTo(Integer value) {
            addCriterion("depart_daily_no <=", value, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoIn(List<Integer> values) {
            addCriterion("depart_daily_no in", values, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoNotIn(List<Integer> values) {
            addCriterion("depart_daily_no not in", values, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoBetween(Integer value1, Integer value2) {
            addCriterion("depart_daily_no between", value1, value2, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartDailyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("depart_daily_no not between", value1, value2, "departDailyNo");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingIsNull() {
            addCriterion("depart_summary_naming is null");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingIsNotNull() {
            addCriterion("depart_summary_naming is not null");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingEqualTo(String value) {
            addCriterion("depart_summary_naming =", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingNotEqualTo(String value) {
            addCriterion("depart_summary_naming <>", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingGreaterThan(String value) {
            addCriterion("depart_summary_naming >", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingGreaterThanOrEqualTo(String value) {
            addCriterion("depart_summary_naming >=", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingLessThan(String value) {
            addCriterion("depart_summary_naming <", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingLessThanOrEqualTo(String value) {
            addCriterion("depart_summary_naming <=", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingLike(String value) {
            addCriterion("depart_summary_naming like", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingNotLike(String value) {
            addCriterion("depart_summary_naming not like", value, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingIn(List<String> values) {
            addCriterion("depart_summary_naming in", values, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingNotIn(List<String> values) {
            addCriterion("depart_summary_naming not in", values, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingBetween(String value1, String value2) {
            addCriterion("depart_summary_naming between", value1, value2, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartSummaryNamingNotBetween(String value1, String value2) {
            addCriterion("depart_summary_naming not between", value1, value2, "departSummaryNaming");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdIsNull() {
            addCriterion("depart_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdIsNotNull() {
            addCriterion("depart_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdEqualTo(String value) {
            addCriterion("depart_doctor_id =", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdNotEqualTo(String value) {
            addCriterion("depart_doctor_id <>", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdGreaterThan(String value) {
            addCriterion("depart_doctor_id >", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_doctor_id >=", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdLessThan(String value) {
            addCriterion("depart_doctor_id <", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("depart_doctor_id <=", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdLike(String value) {
            addCriterion("depart_doctor_id like", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdNotLike(String value) {
            addCriterion("depart_doctor_id not like", value, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdIn(List<String> values) {
            addCriterion("depart_doctor_id in", values, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdNotIn(List<String> values) {
            addCriterion("depart_doctor_id not in", values, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdBetween(String value1, String value2) {
            addCriterion("depart_doctor_id between", value1, value2, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorIdNotBetween(String value1, String value2) {
            addCriterion("depart_doctor_id not between", value1, value2, "departDoctorId");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameIsNull() {
            addCriterion("depart_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameIsNotNull() {
            addCriterion("depart_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameEqualTo(String value) {
            addCriterion("depart_doctor_name =", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameNotEqualTo(String value) {
            addCriterion("depart_doctor_name <>", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameGreaterThan(String value) {
            addCriterion("depart_doctor_name >", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_doctor_name >=", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameLessThan(String value) {
            addCriterion("depart_doctor_name <", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("depart_doctor_name <=", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameLike(String value) {
            addCriterion("depart_doctor_name like", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameNotLike(String value) {
            addCriterion("depart_doctor_name not like", value, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameIn(List<String> values) {
            addCriterion("depart_doctor_name in", values, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameNotIn(List<String> values) {
            addCriterion("depart_doctor_name not in", values, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameBetween(String value1, String value2) {
            addCriterion("depart_doctor_name between", value1, value2, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andDepartDoctorNameNotBetween(String value1, String value2) {
            addCriterion("depart_doctor_name not between", value1, value2, "departDoctorName");
            return (Criteria) this;
        }

        public Criteria andTypistIsNull() {
            addCriterion("typist is null");
            return (Criteria) this;
        }

        public Criteria andTypistIsNotNull() {
            addCriterion("typist is not null");
            return (Criteria) this;
        }

        public Criteria andTypistEqualTo(String value) {
            addCriterion("typist =", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistNotEqualTo(String value) {
            addCriterion("typist <>", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistGreaterThan(String value) {
            addCriterion("typist >", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistGreaterThanOrEqualTo(String value) {
            addCriterion("typist >=", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistLessThan(String value) {
            addCriterion("typist <", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistLessThanOrEqualTo(String value) {
            addCriterion("typist <=", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistLike(String value) {
            addCriterion("typist like", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistNotLike(String value) {
            addCriterion("typist not like", value, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistIn(List<String> values) {
            addCriterion("typist in", values, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistNotIn(List<String> values) {
            addCriterion("typist not in", values, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistBetween(String value1, String value2) {
            addCriterion("typist between", value1, value2, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistNotBetween(String value1, String value2) {
            addCriterion("typist not between", value1, value2, "typist");
            return (Criteria) this;
        }

        public Criteria andTypistNameIsNull() {
            addCriterion("typist_name is null");
            return (Criteria) this;
        }

        public Criteria andTypistNameIsNotNull() {
            addCriterion("typist_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypistNameEqualTo(String value) {
            addCriterion("typist_name =", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameNotEqualTo(String value) {
            addCriterion("typist_name <>", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameGreaterThan(String value) {
            addCriterion("typist_name >", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameGreaterThanOrEqualTo(String value) {
            addCriterion("typist_name >=", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameLessThan(String value) {
            addCriterion("typist_name <", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameLessThanOrEqualTo(String value) {
            addCriterion("typist_name <=", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameLike(String value) {
            addCriterion("typist_name like", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameNotLike(String value) {
            addCriterion("typist_name not like", value, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameIn(List<String> values) {
            addCriterion("typist_name in", values, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameNotIn(List<String> values) {
            addCriterion("typist_name not in", values, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameBetween(String value1, String value2) {
            addCriterion("typist_name between", value1, value2, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistNameNotBetween(String value1, String value2) {
            addCriterion("typist_name not between", value1, value2, "typistName");
            return (Criteria) this;
        }

        public Criteria andTypistTimeIsNull() {
            addCriterion("typist_time is null");
            return (Criteria) this;
        }

        public Criteria andTypistTimeIsNotNull() {
            addCriterion("typist_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypistTimeEqualTo(Date value) {
            addCriterion("typist_time =", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeNotEqualTo(Date value) {
            addCriterion("typist_time <>", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeGreaterThan(Date value) {
            addCriterion("typist_time >", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("typist_time >=", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeLessThan(Date value) {
            addCriterion("typist_time <", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeLessThanOrEqualTo(Date value) {
            addCriterion("typist_time <=", value, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeIn(List<Date> values) {
            addCriterion("typist_time in", values, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeNotIn(List<Date> values) {
            addCriterion("typist_time not in", values, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeBetween(Date value1, Date value2) {
            addCriterion("typist_time between", value1, value2, "typistTime");
            return (Criteria) this;
        }

        public Criteria andTypistTimeNotBetween(Date value1, Date value2) {
            addCriterion("typist_time not between", value1, value2, "typistTime");
            return (Criteria) this;
        }

        public Criteria andGiveUpIsNull() {
            addCriterion("give_up is null");
            return (Criteria) this;
        }

        public Criteria andGiveUpIsNotNull() {
            addCriterion("give_up is not null");
            return (Criteria) this;
        }

        public Criteria andGiveUpEqualTo(Boolean value) {
            addCriterion("give_up =", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpNotEqualTo(Boolean value) {
            addCriterion("give_up <>", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpGreaterThan(Boolean value) {
            addCriterion("give_up >", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("give_up >=", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpLessThan(Boolean value) {
            addCriterion("give_up <", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpLessThanOrEqualTo(Boolean value) {
            addCriterion("give_up <=", value, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpIn(List<Boolean> values) {
            addCriterion("give_up in", values, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpNotIn(List<Boolean> values) {
            addCriterion("give_up not in", values, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpBetween(Boolean value1, Boolean value2) {
            addCriterion("give_up between", value1, value2, "giveUp");
            return (Criteria) this;
        }

        public Criteria andGiveUpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("give_up not between", value1, value2, "giveUp");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNull() {
            addCriterion("approved is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNotNull() {
            addCriterion("approved is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedEqualTo(Boolean value) {
            addCriterion("approved =", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotEqualTo(Boolean value) {
            addCriterion("approved <>", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThan(Boolean value) {
            addCriterion("approved >", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("approved >=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThan(Boolean value) {
            addCriterion("approved <", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThanOrEqualTo(Boolean value) {
            addCriterion("approved <=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedIn(List<Boolean> values) {
            addCriterion("approved in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotIn(List<Boolean> values) {
            addCriterion("approved not in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedBetween(Boolean value1, Boolean value2) {
            addCriterion("approved between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("approved not between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdIsNull() {
            addCriterion("depart_approved_by_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdIsNotNull() {
            addCriterion("depart_approved_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdEqualTo(String value) {
            addCriterion("depart_approved_by_id =", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdNotEqualTo(String value) {
            addCriterion("depart_approved_by_id <>", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdGreaterThan(String value) {
            addCriterion("depart_approved_by_id >", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_approved_by_id >=", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdLessThan(String value) {
            addCriterion("depart_approved_by_id <", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdLessThanOrEqualTo(String value) {
            addCriterion("depart_approved_by_id <=", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdLike(String value) {
            addCriterion("depart_approved_by_id like", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdNotLike(String value) {
            addCriterion("depart_approved_by_id not like", value, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdIn(List<String> values) {
            addCriterion("depart_approved_by_id in", values, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdNotIn(List<String> values) {
            addCriterion("depart_approved_by_id not in", values, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdBetween(String value1, String value2) {
            addCriterion("depart_approved_by_id between", value1, value2, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByIdNotBetween(String value1, String value2) {
            addCriterion("depart_approved_by_id not between", value1, value2, "departApprovedById");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameIsNull() {
            addCriterion("depart_approved_by_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameIsNotNull() {
            addCriterion("depart_approved_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameEqualTo(String value) {
            addCriterion("depart_approved_by_name =", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameNotEqualTo(String value) {
            addCriterion("depart_approved_by_name <>", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameGreaterThan(String value) {
            addCriterion("depart_approved_by_name >", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_approved_by_name >=", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameLessThan(String value) {
            addCriterion("depart_approved_by_name <", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameLessThanOrEqualTo(String value) {
            addCriterion("depart_approved_by_name <=", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameLike(String value) {
            addCriterion("depart_approved_by_name like", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameNotLike(String value) {
            addCriterion("depart_approved_by_name not like", value, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameIn(List<String> values) {
            addCriterion("depart_approved_by_name in", values, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameNotIn(List<String> values) {
            addCriterion("depart_approved_by_name not in", values, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameBetween(String value1, String value2) {
            addCriterion("depart_approved_by_name between", value1, value2, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByNameNotBetween(String value1, String value2) {
            addCriterion("depart_approved_by_name not between", value1, value2, "departApprovedByName");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeIsNull() {
            addCriterion("depart_approved_by_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeIsNotNull() {
            addCriterion("depart_approved_by_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeEqualTo(Date value) {
            addCriterion("depart_approved_by_time =", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeNotEqualTo(Date value) {
            addCriterion("depart_approved_by_time <>", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeGreaterThan(Date value) {
            addCriterion("depart_approved_by_time >", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("depart_approved_by_time >=", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeLessThan(Date value) {
            addCriterion("depart_approved_by_time <", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeLessThanOrEqualTo(Date value) {
            addCriterion("depart_approved_by_time <=", value, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeIn(List<Date> values) {
            addCriterion("depart_approved_by_time in", values, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeNotIn(List<Date> values) {
            addCriterion("depart_approved_by_time not in", values, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeBetween(Date value1, Date value2) {
            addCriterion("depart_approved_by_time between", value1, value2, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andDepartApprovedByTimeNotBetween(Date value1, Date value2) {
            addCriterion("depart_approved_by_time not between", value1, value2, "departApprovedByTime");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdIsNull() {
            addCriterion("consult_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdIsNotNull() {
            addCriterion("consult_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdEqualTo(String value) {
            addCriterion("consult_doctor_id =", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdNotEqualTo(String value) {
            addCriterion("consult_doctor_id <>", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdGreaterThan(String value) {
            addCriterion("consult_doctor_id >", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("consult_doctor_id >=", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdLessThan(String value) {
            addCriterion("consult_doctor_id <", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("consult_doctor_id <=", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdLike(String value) {
            addCriterion("consult_doctor_id like", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdNotLike(String value) {
            addCriterion("consult_doctor_id not like", value, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdIn(List<String> values) {
            addCriterion("consult_doctor_id in", values, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdNotIn(List<String> values) {
            addCriterion("consult_doctor_id not in", values, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdBetween(String value1, String value2) {
            addCriterion("consult_doctor_id between", value1, value2, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorIdNotBetween(String value1, String value2) {
            addCriterion("consult_doctor_id not between", value1, value2, "consultDoctorId");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameIsNull() {
            addCriterion("consult_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameIsNotNull() {
            addCriterion("consult_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameEqualTo(String value) {
            addCriterion("consult_doctor_name =", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameNotEqualTo(String value) {
            addCriterion("consult_doctor_name <>", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameGreaterThan(String value) {
            addCriterion("consult_doctor_name >", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("consult_doctor_name >=", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameLessThan(String value) {
            addCriterion("consult_doctor_name <", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("consult_doctor_name <=", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameLike(String value) {
            addCriterion("consult_doctor_name like", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameNotLike(String value) {
            addCriterion("consult_doctor_name not like", value, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameIn(List<String> values) {
            addCriterion("consult_doctor_name in", values, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameNotIn(List<String> values) {
            addCriterion("consult_doctor_name not in", values, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameBetween(String value1, String value2) {
            addCriterion("consult_doctor_name between", value1, value2, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andConsultDoctorNameNotBetween(String value1, String value2) {
            addCriterion("consult_doctor_name not between", value1, value2, "consultDoctorName");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdIsNull() {
            addCriterion("severe_degree_id is null");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdIsNotNull() {
            addCriterion("severe_degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdEqualTo(Integer value) {
            addCriterion("severe_degree_id =", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotEqualTo(Integer value) {
            addCriterion("severe_degree_id <>", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdGreaterThan(Integer value) {
            addCriterion("severe_degree_id >", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("severe_degree_id >=", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdLessThan(Integer value) {
            addCriterion("severe_degree_id <", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("severe_degree_id <=", value, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdIn(List<Integer> values) {
            addCriterion("severe_degree_id in", values, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotIn(List<Integer> values) {
            addCriterion("severe_degree_id not in", values, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdBetween(Integer value1, Integer value2) {
            addCriterion("severe_degree_id between", value1, value2, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andSevereDegreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("severe_degree_id not between", value1, value2, "severeDegreeId");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxIsNull() {
            addCriterion("approved_aux is null");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxIsNotNull() {
            addCriterion("approved_aux is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxEqualTo(Boolean value) {
            addCriterion("approved_aux =", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxNotEqualTo(Boolean value) {
            addCriterion("approved_aux <>", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxGreaterThan(Boolean value) {
            addCriterion("approved_aux >", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("approved_aux >=", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxLessThan(Boolean value) {
            addCriterion("approved_aux <", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxLessThanOrEqualTo(Boolean value) {
            addCriterion("approved_aux <=", value, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxIn(List<Boolean> values) {
            addCriterion("approved_aux in", values, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxNotIn(List<Boolean> values) {
            addCriterion("approved_aux not in", values, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxBetween(Boolean value1, Boolean value2) {
            addCriterion("approved_aux between", value1, value2, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andApprovedAuxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("approved_aux not between", value1, value2, "approvedAux");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeIsNull() {
            addCriterion("patient_exam_depart_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeIsNotNull() {
            addCriterion("patient_exam_depart_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeEqualTo(Date value) {
            addCriterion("patient_exam_depart_create_time =", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_depart_create_time <>", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeGreaterThan(Date value) {
            addCriterion("patient_exam_depart_create_time >", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_depart_create_time >=", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeLessThan(Date value) {
            addCriterion("patient_exam_depart_create_time <", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_depart_create_time <=", value, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeIn(List<Date> values) {
            addCriterion("patient_exam_depart_create_time in", values, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_depart_create_time not in", values, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_depart_create_time between", value1, value2, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_depart_create_time not between", value1, value2, "patientExamDepartCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeIsNull() {
            addCriterion("patient_exam_depart_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeIsNotNull() {
            addCriterion("patient_exam_depart_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeEqualTo(Date value) {
            addCriterion("patient_exam_depart_edit_time =", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_depart_edit_time <>", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeGreaterThan(Date value) {
            addCriterion("patient_exam_depart_edit_time >", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_depart_edit_time >=", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeLessThan(Date value) {
            addCriterion("patient_exam_depart_edit_time <", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_depart_edit_time <=", value, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeIn(List<Date> values) {
            addCriterion("patient_exam_depart_edit_time in", values, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_depart_edit_time not in", values, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_depart_edit_time between", value1, value2, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_depart_edit_time not between", value1, value2, "patientExamDepartEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusIsNull() {
            addCriterion("patient_exam_depart_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusIsNotNull() {
            addCriterion("patient_exam_depart_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusEqualTo(Integer value) {
            addCriterion("patient_exam_depart_status =", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusNotEqualTo(Integer value) {
            addCriterion("patient_exam_depart_status <>", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusGreaterThan(Integer value) {
            addCriterion("patient_exam_depart_status >", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_depart_status >=", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusLessThan(Integer value) {
            addCriterion("patient_exam_depart_status <", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_depart_status <=", value, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusIn(List<Integer> values) {
            addCriterion("patient_exam_depart_status in", values, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusNotIn(List<Integer> values) {
            addCriterion("patient_exam_depart_status not in", values, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_depart_status between", value1, value2, "patientExamDepartStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamDepartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_depart_status not between", value1, value2, "patientExamDepartStatus");
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