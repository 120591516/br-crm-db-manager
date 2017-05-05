package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationUserRoleExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationUserRoleExample() {
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

        public Criteria andUserRoleIdIsNull() {
            addCriterion("user_role_id is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNotNull() {
            addCriterion("user_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdEqualTo(Long value) {
            addCriterion("user_role_id =", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotEqualTo(Long value) {
            addCriterion("user_role_id <>", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThan(Long value) {
            addCriterion("user_role_id >", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_role_id >=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThan(Long value) {
            addCriterion("user_role_id <", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("user_role_id <=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIn(List<Long> values) {
            addCriterion("user_role_id in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotIn(List<Long> values) {
            addCriterion("user_role_id not in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdBetween(Long value1, Long value2) {
            addCriterion("user_role_id between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("user_role_id not between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusIsNull() {
            addCriterion("user_role_status is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusIsNotNull() {
            addCriterion("user_role_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusEqualTo(Integer value) {
            addCriterion("user_role_status =", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusNotEqualTo(Integer value) {
            addCriterion("user_role_status <>", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusGreaterThan(Integer value) {
            addCriterion("user_role_status >", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role_status >=", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusLessThan(Integer value) {
            addCriterion("user_role_status <", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_role_status <=", value, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusIn(List<Integer> values) {
            addCriterion("user_role_status in", values, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusNotIn(List<Integer> values) {
            addCriterion("user_role_status not in", values, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_role_status between", value1, value2, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role_status not between", value1, value2, "userRoleStatus");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeIsNull() {
            addCriterion("user_role_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeIsNotNull() {
            addCriterion("user_role_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeEqualTo(Date value) {
            addCriterion("user_role_create_time =", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("user_role_create_time <>", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeGreaterThan(Date value) {
            addCriterion("user_role_create_time >", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_role_create_time >=", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeLessThan(Date value) {
            addCriterion("user_role_create_time <", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_role_create_time <=", value, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeIn(List<Date> values) {
            addCriterion("user_role_create_time in", values, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("user_role_create_time not in", values, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_role_create_time between", value1, value2, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_role_create_time not between", value1, value2, "userRoleCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeIsNull() {
            addCriterion("user_role_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeIsNotNull() {
            addCriterion("user_role_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeEqualTo(Date value) {
            addCriterion("user_role_edit_time =", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeNotEqualTo(Date value) {
            addCriterion("user_role_edit_time <>", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeGreaterThan(Date value) {
            addCriterion("user_role_edit_time >", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_role_edit_time >=", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeLessThan(Date value) {
            addCriterion("user_role_edit_time <", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_role_edit_time <=", value, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeIn(List<Date> values) {
            addCriterion("user_role_edit_time in", values, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeNotIn(List<Date> values) {
            addCriterion("user_role_edit_time not in", values, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeBetween(Date value1, Date value2) {
            addCriterion("user_role_edit_time between", value1, value2, "userRoleEditTime");
            return (Criteria) this;
        }

        public Criteria andUserRoleEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_role_edit_time not between", value1, value2, "userRoleEditTime");
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