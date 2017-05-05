package br.crm.pojo.group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseGroupSuiteExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseGroupSuiteExample() {
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

        public Criteria andEnterpriseGroupSuiteIdIsNull() {
            addCriterion("enterprise_group_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdIsNotNull() {
            addCriterion("enterprise_group_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdEqualTo(String value) {
            addCriterion("enterprise_group_suite_id =", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdNotEqualTo(String value) {
            addCriterion("enterprise_group_suite_id <>", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdGreaterThan(String value) {
            addCriterion("enterprise_group_suite_id >", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_suite_id >=", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdLessThan(String value) {
            addCriterion("enterprise_group_suite_id <", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_suite_id <=", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdLike(String value) {
            addCriterion("enterprise_group_suite_id like", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdNotLike(String value) {
            addCriterion("enterprise_group_suite_id not like", value, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdIn(List<String> values) {
            addCriterion("enterprise_group_suite_id in", values, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdNotIn(List<String> values) {
            addCriterion("enterprise_group_suite_id not in", values, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdBetween(String value1, String value2) {
            addCriterion("enterprise_group_suite_id between", value1, value2, "enterpriseGroupSuiteId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_suite_id not between", value1, value2, "enterpriseGroupSuiteId");
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

        public Criteria andExamSuiteNameIsNull() {
            addCriterion("exam_suite_name is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNotNull() {
            addCriterion("exam_suite_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEqualTo(String value) {
            addCriterion("exam_suite_name =", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotEqualTo(String value) {
            addCriterion("exam_suite_name <>", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThan(String value) {
            addCriterion("exam_suite_name >", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_name >=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThan(String value) {
            addCriterion("exam_suite_name <", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_name <=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLike(String value) {
            addCriterion("exam_suite_name like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotLike(String value) {
            addCriterion("exam_suite_name not like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIn(List<String> values) {
            addCriterion("exam_suite_name in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotIn(List<String> values) {
            addCriterion("exam_suite_name not in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameBetween(String value1, String value2) {
            addCriterion("exam_suite_name between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotBetween(String value1, String value2) {
            addCriterion("exam_suite_name not between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorIsNull() {
            addCriterion("enterprise_group_suite_hazard_factor is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorIsNotNull() {
            addCriterion("enterprise_group_suite_hazard_factor is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorEqualTo(String value) {
            addCriterion("enterprise_group_suite_hazard_factor =", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorNotEqualTo(String value) {
            addCriterion("enterprise_group_suite_hazard_factor <>", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorGreaterThan(String value) {
            addCriterion("enterprise_group_suite_hazard_factor >", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_suite_hazard_factor >=", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorLessThan(String value) {
            addCriterion("enterprise_group_suite_hazard_factor <", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_suite_hazard_factor <=", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorLike(String value) {
            addCriterion("enterprise_group_suite_hazard_factor like", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorNotLike(String value) {
            addCriterion("enterprise_group_suite_hazard_factor not like", value, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorIn(List<String> values) {
            addCriterion("enterprise_group_suite_hazard_factor in", values, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorNotIn(List<String> values) {
            addCriterion("enterprise_group_suite_hazard_factor not in", values, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorBetween(String value1, String value2) {
            addCriterion("enterprise_group_suite_hazard_factor between", value1, value2, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteHazardFactorNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_suite_hazard_factor not between", value1, value2, "enterpriseGroupSuiteHazardFactor");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusIsNull() {
            addCriterion("enterprise_group_suite_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusIsNotNull() {
            addCriterion("enterprise_group_suite_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusEqualTo(Integer value) {
            addCriterion("enterprise_group_suite_status =", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_group_suite_status <>", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusGreaterThan(Integer value) {
            addCriterion("enterprise_group_suite_status >", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_suite_status >=", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusLessThan(Integer value) {
            addCriterion("enterprise_group_suite_status <", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_suite_status <=", value, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusIn(List<Integer> values) {
            addCriterion("enterprise_group_suite_status in", values, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_group_suite_status not in", values, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_suite_status between", value1, value2, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_suite_status not between", value1, value2, "enterpriseGroupSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeIsNull() {
            addCriterion("enterprise_group_suite_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeIsNotNull() {
            addCriterion("enterprise_group_suite_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeEqualTo(Date value) {
            addCriterion("enterprise_group_suite_edit_time =", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_group_suite_edit_time <>", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_group_suite_edit_time >", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_suite_edit_time >=", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeLessThan(Date value) {
            addCriterion("enterprise_group_suite_edit_time <", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_suite_edit_time <=", value, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeIn(List<Date> values) {
            addCriterion("enterprise_group_suite_edit_time in", values, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_group_suite_edit_time not in", values, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_suite_edit_time between", value1, value2, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_suite_edit_time not between", value1, value2, "enterpriseGroupSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeIsNull() {
            addCriterion("enterprise_group_suite_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeIsNotNull() {
            addCriterion("enterprise_group_suite_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_group_suite_create_time =", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_group_suite_create_time <>", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_group_suite_create_time >", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_suite_create_time >=", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeLessThan(Date value) {
            addCriterion("enterprise_group_suite_create_time <", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_suite_create_time <=", value, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_group_suite_create_time in", values, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_group_suite_create_time not in", values, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_suite_create_time between", value1, value2, "enterpriseGroupSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupSuiteCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_suite_create_time not between", value1, value2, "enterpriseGroupSuiteCreateTime");
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