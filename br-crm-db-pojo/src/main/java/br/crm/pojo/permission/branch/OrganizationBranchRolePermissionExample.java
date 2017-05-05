package br.crm.pojo.permission.branch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchRolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchRolePermissionExample() {
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

        public Criteria andRolePermissionIdIsNull() {
            addCriterion("role_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdIsNotNull() {
            addCriterion("role_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdEqualTo(Long value) {
            addCriterion("role_permission_id =", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotEqualTo(Long value) {
            addCriterion("role_permission_id <>", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdGreaterThan(Long value) {
            addCriterion("role_permission_id >", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_permission_id >=", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdLessThan(Long value) {
            addCriterion("role_permission_id <", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("role_permission_id <=", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdIn(List<Long> values) {
            addCriterion("role_permission_id in", values, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotIn(List<Long> values) {
            addCriterion("role_permission_id not in", values, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdBetween(Long value1, Long value2) {
            addCriterion("role_permission_id between", value1, value2, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("role_permission_id not between", value1, value2, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdIsNull() {
            addCriterion("branch_role_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdIsNotNull() {
            addCriterion("branch_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdEqualTo(Long value) {
            addCriterion("branch_role_id =", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdNotEqualTo(Long value) {
            addCriterion("branch_role_id <>", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdGreaterThan(Long value) {
            addCriterion("branch_role_id >", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("branch_role_id >=", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdLessThan(Long value) {
            addCriterion("branch_role_id <", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("branch_role_id <=", value, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdIn(List<Long> values) {
            addCriterion("branch_role_id in", values, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdNotIn(List<Long> values) {
            addCriterion("branch_role_id not in", values, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdBetween(Long value1, Long value2) {
            addCriterion("branch_role_id between", value1, value2, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("branch_role_id not between", value1, value2, "branchRoleId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdIsNull() {
            addCriterion("branch_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdIsNotNull() {
            addCriterion("branch_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdEqualTo(Long value) {
            addCriterion("branch_permission_id =", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdNotEqualTo(Long value) {
            addCriterion("branch_permission_id <>", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdGreaterThan(Long value) {
            addCriterion("branch_permission_id >", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("branch_permission_id >=", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdLessThan(Long value) {
            addCriterion("branch_permission_id <", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("branch_permission_id <=", value, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdIn(List<Long> values) {
            addCriterion("branch_permission_id in", values, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdNotIn(List<Long> values) {
            addCriterion("branch_permission_id not in", values, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdBetween(Long value1, Long value2) {
            addCriterion("branch_permission_id between", value1, value2, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andBranchPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("branch_permission_id not between", value1, value2, "branchPermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusIsNull() {
            addCriterion("role_permission_status is null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusIsNotNull() {
            addCriterion("role_permission_status is not null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusEqualTo(Integer value) {
            addCriterion("role_permission_status =", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusNotEqualTo(Integer value) {
            addCriterion("role_permission_status <>", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusGreaterThan(Integer value) {
            addCriterion("role_permission_status >", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_permission_status >=", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusLessThan(Integer value) {
            addCriterion("role_permission_status <", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("role_permission_status <=", value, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusIn(List<Integer> values) {
            addCriterion("role_permission_status in", values, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusNotIn(List<Integer> values) {
            addCriterion("role_permission_status not in", values, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusBetween(Integer value1, Integer value2) {
            addCriterion("role_permission_status between", value1, value2, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("role_permission_status not between", value1, value2, "rolePermissionStatus");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeIsNull() {
            addCriterion("role_permission_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeIsNotNull() {
            addCriterion("role_permission_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeEqualTo(Date value) {
            addCriterion("role_permission_create_time =", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeNotEqualTo(Date value) {
            addCriterion("role_permission_create_time <>", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeGreaterThan(Date value) {
            addCriterion("role_permission_create_time >", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_permission_create_time >=", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeLessThan(Date value) {
            addCriterion("role_permission_create_time <", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("role_permission_create_time <=", value, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeIn(List<Date> values) {
            addCriterion("role_permission_create_time in", values, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeNotIn(List<Date> values) {
            addCriterion("role_permission_create_time not in", values, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("role_permission_create_time between", value1, value2, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("role_permission_create_time not between", value1, value2, "rolePermissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeIsNull() {
            addCriterion("role_permission_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeIsNotNull() {
            addCriterion("role_permission_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeEqualTo(Date value) {
            addCriterion("role_permission_edit_time =", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeNotEqualTo(Date value) {
            addCriterion("role_permission_edit_time <>", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeGreaterThan(Date value) {
            addCriterion("role_permission_edit_time >", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_permission_edit_time >=", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeLessThan(Date value) {
            addCriterion("role_permission_edit_time <", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("role_permission_edit_time <=", value, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeIn(List<Date> values) {
            addCriterion("role_permission_edit_time in", values, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeNotIn(List<Date> values) {
            addCriterion("role_permission_edit_time not in", values, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeBetween(Date value1, Date value2) {
            addCriterion("role_permission_edit_time between", value1, value2, "rolePermissionEditTime");
            return (Criteria) this;
        }

        public Criteria andRolePermissionEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("role_permission_edit_time not between", value1, value2, "rolePermissionEditTime");
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