package br.crm.pojo.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchUserExample implements Serializable {
    /**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchUserExample() {
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

        public Criteria andOrgBranchUserIdIsNull() {
            addCriterion("org_branch_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdIsNotNull() {
            addCriterion("org_branch_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdEqualTo(String value) {
            addCriterion("org_branch_user_id =", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdNotEqualTo(String value) {
            addCriterion("org_branch_user_id <>", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdGreaterThan(String value) {
            addCriterion("org_branch_user_id >", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_user_id >=", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdLessThan(String value) {
            addCriterion("org_branch_user_id <", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdLessThanOrEqualTo(String value) {
            addCriterion("org_branch_user_id <=", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdLike(String value) {
            addCriterion("org_branch_user_id like", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdNotLike(String value) {
            addCriterion("org_branch_user_id not like", value, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdIn(List<String> values) {
            addCriterion("org_branch_user_id in", values, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdNotIn(List<String> values) {
            addCriterion("org_branch_user_id not in", values, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdBetween(String value1, String value2) {
            addCriterion("org_branch_user_id between", value1, value2, "orgBranchUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserIdNotBetween(String value1, String value2) {
            addCriterion("org_branch_user_id not between", value1, value2, "orgBranchUserId");
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

        public Criteria andOrgUserIdIsNull() {
            addCriterion("org_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdIsNotNull() {
            addCriterion("org_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdEqualTo(String value) {
            addCriterion("org_user_id =", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdNotEqualTo(String value) {
            addCriterion("org_user_id <>", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdGreaterThan(String value) {
            addCriterion("org_user_id >", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_user_id >=", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdLessThan(String value) {
            addCriterion("org_user_id <", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdLessThanOrEqualTo(String value) {
            addCriterion("org_user_id <=", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdLike(String value) {
            addCriterion("org_user_id like", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdNotLike(String value) {
            addCriterion("org_user_id not like", value, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdIn(List<String> values) {
            addCriterion("org_user_id in", values, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdNotIn(List<String> values) {
            addCriterion("org_user_id not in", values, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdBetween(String value1, String value2) {
            addCriterion("org_user_id between", value1, value2, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgUserIdNotBetween(String value1, String value2) {
            addCriterion("org_user_id not between", value1, value2, "orgUserId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusIsNull() {
            addCriterion("org_branch_user_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusIsNotNull() {
            addCriterion("org_branch_user_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusEqualTo(Integer value) {
            addCriterion("org_branch_user_status =", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusNotEqualTo(Integer value) {
            addCriterion("org_branch_user_status <>", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusGreaterThan(Integer value) {
            addCriterion("org_branch_user_status >", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_branch_user_status >=", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusLessThan(Integer value) {
            addCriterion("org_branch_user_status <", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_branch_user_status <=", value, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusIn(List<Integer> values) {
            addCriterion("org_branch_user_status in", values, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusNotIn(List<Integer> values) {
            addCriterion("org_branch_user_status not in", values, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_branch_user_status between", value1, value2, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_branch_user_status not between", value1, value2, "orgBranchUserStatus");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeIsNull() {
            addCriterion("org_branch_user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeIsNotNull() {
            addCriterion("org_branch_user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeEqualTo(Date value) {
            addCriterion("org_branch_user_create_time =", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeNotEqualTo(Date value) {
            addCriterion("org_branch_user_create_time <>", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeGreaterThan(Date value) {
            addCriterion("org_branch_user_create_time >", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_branch_user_create_time >=", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeLessThan(Date value) {
            addCriterion("org_branch_user_create_time <", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_branch_user_create_time <=", value, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeIn(List<Date> values) {
            addCriterion("org_branch_user_create_time in", values, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeNotIn(List<Date> values) {
            addCriterion("org_branch_user_create_time not in", values, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_branch_user_create_time between", value1, value2, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_branch_user_create_time not between", value1, value2, "orgBranchUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeIsNull() {
            addCriterion("org_branch_user_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeIsNotNull() {
            addCriterion("org_branch_user_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeEqualTo(Date value) {
            addCriterion("org_branch_user_edit_time =", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeNotEqualTo(Date value) {
            addCriterion("org_branch_user_edit_time <>", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeGreaterThan(Date value) {
            addCriterion("org_branch_user_edit_time >", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_branch_user_edit_time >=", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeLessThan(Date value) {
            addCriterion("org_branch_user_edit_time <", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_branch_user_edit_time <=", value, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeIn(List<Date> values) {
            addCriterion("org_branch_user_edit_time in", values, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeNotIn(List<Date> values) {
            addCriterion("org_branch_user_edit_time not in", values, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_branch_user_edit_time between", value1, value2, "orgBranchUserEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchUserEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_branch_user_edit_time not between", value1, value2, "orgBranchUserEditTime");
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