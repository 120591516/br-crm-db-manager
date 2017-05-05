package br.crm.pojo.suite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchSuiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchSuiteExample() {
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

        public Criteria andBranchSuiteIdIsNull() {
            addCriterion("branch_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdIsNotNull() {
            addCriterion("branch_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdEqualTo(String value) {
            addCriterion("branch_suite_id =", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdNotEqualTo(String value) {
            addCriterion("branch_suite_id <>", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdGreaterThan(String value) {
            addCriterion("branch_suite_id >", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_suite_id >=", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdLessThan(String value) {
            addCriterion("branch_suite_id <", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("branch_suite_id <=", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdLike(String value) {
            addCriterion("branch_suite_id like", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdNotLike(String value) {
            addCriterion("branch_suite_id not like", value, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdIn(List<String> values) {
            addCriterion("branch_suite_id in", values, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdNotIn(List<String> values) {
            addCriterion("branch_suite_id not in", values, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdBetween(String value1, String value2) {
            addCriterion("branch_suite_id between", value1, value2, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchSuiteIdNotBetween(String value1, String value2) {
            addCriterion("branch_suite_id not between", value1, value2, "branchSuiteId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("branch_id like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("branch_id not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIsNull() {
            addCriterion("suite_id is null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIsNotNull() {
            addCriterion("suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdEqualTo(String value) {
            addCriterion("suite_id =", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotEqualTo(String value) {
            addCriterion("suite_id <>", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThan(String value) {
            addCriterion("suite_id >", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("suite_id >=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThan(String value) {
            addCriterion("suite_id <", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("suite_id <=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLike(String value) {
            addCriterion("suite_id like", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotLike(String value) {
            addCriterion("suite_id not like", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIn(List<String> values) {
            addCriterion("suite_id in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotIn(List<String> values) {
            addCriterion("suite_id not in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdBetween(String value1, String value2) {
            addCriterion("suite_id between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotBetween(String value1, String value2) {
            addCriterion("suite_id not between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdIsNull() {
            addCriterion("edit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdIsNotNull() {
            addCriterion("edit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdEqualTo(Long value) {
            addCriterion("edit_person_id =", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdNotEqualTo(Long value) {
            addCriterion("edit_person_id <>", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdGreaterThan(Long value) {
            addCriterion("edit_person_id >", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("edit_person_id >=", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdLessThan(Long value) {
            addCriterion("edit_person_id <", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdLessThanOrEqualTo(Long value) {
            addCriterion("edit_person_id <=", value, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdIn(List<Long> values) {
            addCriterion("edit_person_id in", values, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdNotIn(List<Long> values) {
            addCriterion("edit_person_id not in", values, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdBetween(Long value1, Long value2) {
            addCriterion("edit_person_id between", value1, value2, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonIdNotBetween(Long value1, Long value2) {
            addCriterion("edit_person_id not between", value1, value2, "editPersonId");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameIsNull() {
            addCriterion("edit_person_name is null");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameIsNotNull() {
            addCriterion("edit_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameEqualTo(String value) {
            addCriterion("edit_person_name =", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameNotEqualTo(String value) {
            addCriterion("edit_person_name <>", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameGreaterThan(String value) {
            addCriterion("edit_person_name >", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("edit_person_name >=", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameLessThan(String value) {
            addCriterion("edit_person_name <", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameLessThanOrEqualTo(String value) {
            addCriterion("edit_person_name <=", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameLike(String value) {
            addCriterion("edit_person_name like", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameNotLike(String value) {
            addCriterion("edit_person_name not like", value, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameIn(List<String> values) {
            addCriterion("edit_person_name in", values, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameNotIn(List<String> values) {
            addCriterion("edit_person_name not in", values, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameBetween(String value1, String value2) {
            addCriterion("edit_person_name between", value1, value2, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonNameNotBetween(String value1, String value2) {
            addCriterion("edit_person_name not between", value1, value2, "editPersonName");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatIsNull() {
            addCriterion("edit_person_plat is null");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatIsNotNull() {
            addCriterion("edit_person_plat is not null");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatEqualTo(Integer value) {
            addCriterion("edit_person_plat =", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatNotEqualTo(Integer value) {
            addCriterion("edit_person_plat <>", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatGreaterThan(Integer value) {
            addCriterion("edit_person_plat >", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_person_plat >=", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatLessThan(Integer value) {
            addCriterion("edit_person_plat <", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatLessThanOrEqualTo(Integer value) {
            addCriterion("edit_person_plat <=", value, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatIn(List<Integer> values) {
            addCriterion("edit_person_plat in", values, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatNotIn(List<Integer> values) {
            addCriterion("edit_person_plat not in", values, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatBetween(Integer value1, Integer value2) {
            addCriterion("edit_person_plat between", value1, value2, "editPersonPlat");
            return (Criteria) this;
        }

        public Criteria andEditPersonPlatNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_person_plat not between", value1, value2, "editPersonPlat");
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