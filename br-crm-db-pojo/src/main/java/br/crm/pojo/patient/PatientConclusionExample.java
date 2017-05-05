package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientConclusionExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientConclusionExample() {
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

        public Criteria andPatientConclusionIdIsNull() {
            addCriterion("patient_conclusion_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdIsNotNull() {
            addCriterion("patient_conclusion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdEqualTo(String value) {
            addCriterion("patient_conclusion_id =", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdNotEqualTo(String value) {
            addCriterion("patient_conclusion_id <>", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdGreaterThan(String value) {
            addCriterion("patient_conclusion_id >", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_id >=", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdLessThan(String value) {
            addCriterion("patient_conclusion_id <", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_id <=", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdLike(String value) {
            addCriterion("patient_conclusion_id like", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdNotLike(String value) {
            addCriterion("patient_conclusion_id not like", value, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdIn(List<String> values) {
            addCriterion("patient_conclusion_id in", values, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdNotIn(List<String> values) {
            addCriterion("patient_conclusion_id not in", values, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdBetween(String value1, String value2) {
            addCriterion("patient_conclusion_id between", value1, value2, "patientConclusionId");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIdNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion_id not between", value1, value2, "patientConclusionId");
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

        public Criteria andPatientConclusionIsNull() {
            addCriterion("patient_conclusion is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIsNotNull() {
            addCriterion("patient_conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEqualTo(String value) {
            addCriterion("patient_conclusion =", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNotEqualTo(String value) {
            addCriterion("patient_conclusion <>", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionGreaterThan(String value) {
            addCriterion("patient_conclusion >", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion >=", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionLessThan(String value) {
            addCriterion("patient_conclusion <", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion <=", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionLike(String value) {
            addCriterion("patient_conclusion like", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNotLike(String value) {
            addCriterion("patient_conclusion not like", value, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionIn(List<String> values) {
            addCriterion("patient_conclusion in", values, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNotIn(List<String> values) {
            addCriterion("patient_conclusion not in", values, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBetween(String value1, String value2) {
            addCriterion("patient_conclusion between", value1, value2, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion not between", value1, value2, "patientConclusion");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameIsNull() {
            addCriterion("patient_conclusion_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameIsNotNull() {
            addCriterion("patient_conclusion_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameEqualTo(String value) {
            addCriterion("patient_conclusion_name =", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameNotEqualTo(String value) {
            addCriterion("patient_conclusion_name <>", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameGreaterThan(String value) {
            addCriterion("patient_conclusion_name >", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_name >=", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameLessThan(String value) {
            addCriterion("patient_conclusion_name <", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_name <=", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameLike(String value) {
            addCriterion("patient_conclusion_name like", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameNotLike(String value) {
            addCriterion("patient_conclusion_name not like", value, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameIn(List<String> values) {
            addCriterion("patient_conclusion_name in", values, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameNotIn(List<String> values) {
            addCriterion("patient_conclusion_name not in", values, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameBetween(String value1, String value2) {
            addCriterion("patient_conclusion_name between", value1, value2, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionNameNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion_name not between", value1, value2, "patientConclusionName");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryIsNull() {
            addCriterion("patient_conclusion_by_summary is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryIsNotNull() {
            addCriterion("patient_conclusion_by_summary is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryEqualTo(String value) {
            addCriterion("patient_conclusion_by_summary =", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryNotEqualTo(String value) {
            addCriterion("patient_conclusion_by_summary <>", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryGreaterThan(String value) {
            addCriterion("patient_conclusion_by_summary >", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_by_summary >=", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryLessThan(String value) {
            addCriterion("patient_conclusion_by_summary <", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_by_summary <=", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryLike(String value) {
            addCriterion("patient_conclusion_by_summary like", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryNotLike(String value) {
            addCriterion("patient_conclusion_by_summary not like", value, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryIn(List<String> values) {
            addCriterion("patient_conclusion_by_summary in", values, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryNotIn(List<String> values) {
            addCriterion("patient_conclusion_by_summary not in", values, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryBetween(String value1, String value2) {
            addCriterion("patient_conclusion_by_summary between", value1, value2, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionBySummaryNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion_by_summary not between", value1, value2, "patientConclusionBySummary");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleIsNull() {
            addCriterion("patient_conclusion_Invisible is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleIsNotNull() {
            addCriterion("patient_conclusion_Invisible is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleEqualTo(String value) {
            addCriterion("patient_conclusion_Invisible =", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleNotEqualTo(String value) {
            addCriterion("patient_conclusion_Invisible <>", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleGreaterThan(String value) {
            addCriterion("patient_conclusion_Invisible >", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_Invisible >=", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleLessThan(String value) {
            addCriterion("patient_conclusion_Invisible <", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_Invisible <=", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleLike(String value) {
            addCriterion("patient_conclusion_Invisible like", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleNotLike(String value) {
            addCriterion("patient_conclusion_Invisible not like", value, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleIn(List<String> values) {
            addCriterion("patient_conclusion_Invisible in", values, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleNotIn(List<String> values) {
            addCriterion("patient_conclusion_Invisible not in", values, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleBetween(String value1, String value2) {
            addCriterion("patient_conclusion_Invisible between", value1, value2, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionInvisibleNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion_Invisible not between", value1, value2, "patientConclusionInvisible");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeIsNull() {
            addCriterion("patient_conclusion_type is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeIsNotNull() {
            addCriterion("patient_conclusion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeEqualTo(String value) {
            addCriterion("patient_conclusion_type =", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeNotEqualTo(String value) {
            addCriterion("patient_conclusion_type <>", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeGreaterThan(String value) {
            addCriterion("patient_conclusion_type >", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_type >=", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeLessThan(String value) {
            addCriterion("patient_conclusion_type <", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeLessThanOrEqualTo(String value) {
            addCriterion("patient_conclusion_type <=", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeLike(String value) {
            addCriterion("patient_conclusion_type like", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeNotLike(String value) {
            addCriterion("patient_conclusion_type not like", value, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeIn(List<String> values) {
            addCriterion("patient_conclusion_type in", values, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeNotIn(List<String> values) {
            addCriterion("patient_conclusion_type not in", values, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeBetween(String value1, String value2) {
            addCriterion("patient_conclusion_type between", value1, value2, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionTypeNotBetween(String value1, String value2) {
            addCriterion("patient_conclusion_type not between", value1, value2, "patientConclusionType");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderIsNull() {
            addCriterion("patient_conclusion_order is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderIsNotNull() {
            addCriterion("patient_conclusion_order is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderEqualTo(Integer value) {
            addCriterion("patient_conclusion_order =", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderNotEqualTo(Integer value) {
            addCriterion("patient_conclusion_order <>", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderGreaterThan(Integer value) {
            addCriterion("patient_conclusion_order >", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_conclusion_order >=", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderLessThan(Integer value) {
            addCriterion("patient_conclusion_order <", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderLessThanOrEqualTo(Integer value) {
            addCriterion("patient_conclusion_order <=", value, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderIn(List<Integer> values) {
            addCriterion("patient_conclusion_order in", values, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderNotIn(List<Integer> values) {
            addCriterion("patient_conclusion_order not in", values, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderBetween(Integer value1, Integer value2) {
            addCriterion("patient_conclusion_order between", value1, value2, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_conclusion_order not between", value1, value2, "patientConclusionOrder");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeIsNull() {
            addCriterion("patient_conclusion_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeIsNotNull() {
            addCriterion("patient_conclusion_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeEqualTo(Date value) {
            addCriterion("patient_conclusion_create_time =", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_conclusion_create_time <>", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeGreaterThan(Date value) {
            addCriterion("patient_conclusion_create_time >", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_conclusion_create_time >=", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeLessThan(Date value) {
            addCriterion("patient_conclusion_create_time <", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_conclusion_create_time <=", value, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeIn(List<Date> values) {
            addCriterion("patient_conclusion_create_time in", values, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_conclusion_create_time not in", values, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_conclusion_create_time between", value1, value2, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_conclusion_create_time not between", value1, value2, "patientConclusionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeIsNull() {
            addCriterion("patient_conclusion_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeIsNotNull() {
            addCriterion("patient_conclusion_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeEqualTo(Date value) {
            addCriterion("patient_conclusion_edit_time =", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeNotEqualTo(Date value) {
            addCriterion("patient_conclusion_edit_time <>", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeGreaterThan(Date value) {
            addCriterion("patient_conclusion_edit_time >", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_conclusion_edit_time >=", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeLessThan(Date value) {
            addCriterion("patient_conclusion_edit_time <", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_conclusion_edit_time <=", value, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeIn(List<Date> values) {
            addCriterion("patient_conclusion_edit_time in", values, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeNotIn(List<Date> values) {
            addCriterion("patient_conclusion_edit_time not in", values, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_conclusion_edit_time between", value1, value2, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_conclusion_edit_time not between", value1, value2, "patientConclusionEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusIsNull() {
            addCriterion("patient_conclusion_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusIsNotNull() {
            addCriterion("patient_conclusion_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusEqualTo(Integer value) {
            addCriterion("patient_conclusion_status =", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusNotEqualTo(Integer value) {
            addCriterion("patient_conclusion_status <>", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusGreaterThan(Integer value) {
            addCriterion("patient_conclusion_status >", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_conclusion_status >=", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusLessThan(Integer value) {
            addCriterion("patient_conclusion_status <", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_conclusion_status <=", value, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusIn(List<Integer> values) {
            addCriterion("patient_conclusion_status in", values, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusNotIn(List<Integer> values) {
            addCriterion("patient_conclusion_status not in", values, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_conclusion_status between", value1, value2, "patientConclusionStatus");
            return (Criteria) this;
        }

        public Criteria andPatientConclusionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_conclusion_status not between", value1, value2, "patientConclusionStatus");
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