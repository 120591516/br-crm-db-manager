package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusiongroupdepartExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusiongroupdepartExample() {
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

        public Criteria andIdConclusiongroupdepartIsNull() {
            addCriterion("ID_ConclusionGroupDepart is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartIsNotNull() {
            addCriterion("ID_ConclusionGroupDepart is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartEqualTo(String value) {
            addCriterion("ID_ConclusionGroupDepart =", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartNotEqualTo(String value) {
            addCriterion("ID_ConclusionGroupDepart <>", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartGreaterThan(String value) {
            addCriterion("ID_ConclusionGroupDepart >", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionGroupDepart >=", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartLessThan(String value) {
            addCriterion("ID_ConclusionGroupDepart <", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartLessThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionGroupDepart <=", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartLike(String value) {
            addCriterion("ID_ConclusionGroupDepart like", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartNotLike(String value) {
            addCriterion("ID_ConclusionGroupDepart not like", value, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartIn(List<String> values) {
            addCriterion("ID_ConclusionGroupDepart in", values, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartNotIn(List<String> values) {
            addCriterion("ID_ConclusionGroupDepart not in", values, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartBetween(String value1, String value2) {
            addCriterion("ID_ConclusionGroupDepart between", value1, value2, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andIdConclusiongroupdepartNotBetween(String value1, String value2) {
            addCriterion("ID_ConclusionGroupDepart not between", value1, value2, "idConclusiongroupdepart");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidIsNull() {
            addCriterion("KeyConclusionGroupId is null");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidIsNotNull() {
            addCriterion("KeyConclusionGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidEqualTo(String value) {
            addCriterion("KeyConclusionGroupId =", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotEqualTo(String value) {
            addCriterion("KeyConclusionGroupId <>", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidGreaterThan(String value) {
            addCriterion("KeyConclusionGroupId >", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidGreaterThanOrEqualTo(String value) {
            addCriterion("KeyConclusionGroupId >=", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLessThan(String value) {
            addCriterion("KeyConclusionGroupId <", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLessThanOrEqualTo(String value) {
            addCriterion("KeyConclusionGroupId <=", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLike(String value) {
            addCriterion("KeyConclusionGroupId like", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotLike(String value) {
            addCriterion("KeyConclusionGroupId not like", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidIn(List<String> values) {
            addCriterion("KeyConclusionGroupId in", values, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotIn(List<String> values) {
            addCriterion("KeyConclusionGroupId not in", values, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidBetween(String value1, String value2) {
            addCriterion("KeyConclusionGroupId between", value1, value2, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotBetween(String value1, String value2) {
            addCriterion("KeyConclusionGroupId not between", value1, value2, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdIsNull() {
            addCriterion("org_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdIsNotNull() {
            addCriterion("org_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdEqualTo(String value) {
            addCriterion("org_dept_id =", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotEqualTo(String value) {
            addCriterion("org_dept_id <>", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdGreaterThan(String value) {
            addCriterion("org_dept_id >", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_dept_id >=", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLessThan(String value) {
            addCriterion("org_dept_id <", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLessThanOrEqualTo(String value) {
            addCriterion("org_dept_id <=", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdLike(String value) {
            addCriterion("org_dept_id like", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotLike(String value) {
            addCriterion("org_dept_id not like", value, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdIn(List<String> values) {
            addCriterion("org_dept_id in", values, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotIn(List<String> values) {
            addCriterion("org_dept_id not in", values, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdBetween(String value1, String value2) {
            addCriterion("org_dept_id between", value1, value2, "orgDeptId");
            return (Criteria) this;
        }

        public Criteria andOrgDeptIdNotBetween(String value1, String value2) {
            addCriterion("org_dept_id not between", value1, value2, "orgDeptId");
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