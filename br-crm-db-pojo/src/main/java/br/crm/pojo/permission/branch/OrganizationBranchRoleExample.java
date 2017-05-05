package br.crm.pojo.permission.branch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchRoleExample() {
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

        public Criteria andOrgBranchIdIsNull() {
            addCriterion("org_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIsNotNull() {
            addCriterion("org_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdEqualTo(String value) {
            addCriterion("org_branch_id =", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotEqualTo(String value) {
            addCriterion("org_branch_id <>", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThan(String value) {
            addCriterion("org_branch_id >", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_id >=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThan(String value) {
            addCriterion("org_branch_id <", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThanOrEqualTo(String value) {
            addCriterion("org_branch_id <=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLike(String value) {
            addCriterion("org_branch_id like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotLike(String value) {
            addCriterion("org_branch_id not like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIn(List<String> values) {
            addCriterion("org_branch_id in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotIn(List<String> values) {
            addCriterion("org_branch_id not in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdBetween(String value1, String value2) {
            addCriterion("org_branch_id between", value1, value2, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotBetween(String value1, String value2) {
            addCriterion("org_branch_id not between", value1, value2, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIsNull() {
            addCriterion("role_describe is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIsNotNull() {
            addCriterion("role_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeEqualTo(String value) {
            addCriterion("role_describe =", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotEqualTo(String value) {
            addCriterion("role_describe <>", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeGreaterThan(String value) {
            addCriterion("role_describe >", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("role_describe >=", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLessThan(String value) {
            addCriterion("role_describe <", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLessThanOrEqualTo(String value) {
            addCriterion("role_describe <=", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeLike(String value) {
            addCriterion("role_describe like", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotLike(String value) {
            addCriterion("role_describe not like", value, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeIn(List<String> values) {
            addCriterion("role_describe in", values, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotIn(List<String> values) {
            addCriterion("role_describe not in", values, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeBetween(String value1, String value2) {
            addCriterion("role_describe between", value1, value2, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleDescribeNotBetween(String value1, String value2) {
            addCriterion("role_describe not between", value1, value2, "roleDescribe");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNull() {
            addCriterion("role_status is null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNotNull() {
            addCriterion("role_status is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusEqualTo(Integer value) {
            addCriterion("role_status =", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotEqualTo(Integer value) {
            addCriterion("role_status <>", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThan(Integer value) {
            addCriterion("role_status >", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_status >=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThan(Integer value) {
            addCriterion("role_status <", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("role_status <=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIn(List<Integer> values) {
            addCriterion("role_status in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotIn(List<Integer> values) {
            addCriterion("role_status not in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusBetween(Integer value1, Integer value2) {
            addCriterion("role_status between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("role_status not between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNull() {
            addCriterion("role_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNotNull() {
            addCriterion("role_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeEqualTo(Date value) {
            addCriterion("role_create_time =", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("role_create_time <>", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThan(Date value) {
            addCriterion("role_create_time >", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_create_time >=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThan(Date value) {
            addCriterion("role_create_time <", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("role_create_time <=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIn(List<Date> values) {
            addCriterion("role_create_time in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("role_create_time not in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("role_create_time between", value1, value2, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("role_create_time not between", value1, value2, "roleCreateTime");
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