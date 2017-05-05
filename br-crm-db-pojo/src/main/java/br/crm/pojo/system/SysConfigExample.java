package br.crm.pojo.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysConfigExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysConfigExample() {
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

        public Criteria andSysConfigIdIsNull() {
            addCriterion("sys_config_id is null");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdIsNotNull() {
            addCriterion("sys_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdEqualTo(String value) {
            addCriterion("sys_config_id =", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdNotEqualTo(String value) {
            addCriterion("sys_config_id <>", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdGreaterThan(String value) {
            addCriterion("sys_config_id >", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_config_id >=", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdLessThan(String value) {
            addCriterion("sys_config_id <", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdLessThanOrEqualTo(String value) {
            addCriterion("sys_config_id <=", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdLike(String value) {
            addCriterion("sys_config_id like", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdNotLike(String value) {
            addCriterion("sys_config_id not like", value, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdIn(List<String> values) {
            addCriterion("sys_config_id in", values, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdNotIn(List<String> values) {
            addCriterion("sys_config_id not in", values, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdBetween(String value1, String value2) {
            addCriterion("sys_config_id between", value1, value2, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigIdNotBetween(String value1, String value2) {
            addCriterion("sys_config_id not between", value1, value2, "sysConfigId");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisIsNull() {
            addCriterion("sys_config_redis is null");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisIsNotNull() {
            addCriterion("sys_config_redis is not null");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisEqualTo(String value) {
            addCriterion("sys_config_redis =", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisNotEqualTo(String value) {
            addCriterion("sys_config_redis <>", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisGreaterThan(String value) {
            addCriterion("sys_config_redis >", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisGreaterThanOrEqualTo(String value) {
            addCriterion("sys_config_redis >=", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisLessThan(String value) {
            addCriterion("sys_config_redis <", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisLessThanOrEqualTo(String value) {
            addCriterion("sys_config_redis <=", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisLike(String value) {
            addCriterion("sys_config_redis like", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisNotLike(String value) {
            addCriterion("sys_config_redis not like", value, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisIn(List<String> values) {
            addCriterion("sys_config_redis in", values, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisNotIn(List<String> values) {
            addCriterion("sys_config_redis not in", values, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisBetween(String value1, String value2) {
            addCriterion("sys_config_redis between", value1, value2, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigRedisNotBetween(String value1, String value2) {
            addCriterion("sys_config_redis not between", value1, value2, "sysConfigRedis");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchIsNull() {
            addCriterion("sys_config_search is null");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchIsNotNull() {
            addCriterion("sys_config_search is not null");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchEqualTo(String value) {
            addCriterion("sys_config_search =", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchNotEqualTo(String value) {
            addCriterion("sys_config_search <>", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchGreaterThan(String value) {
            addCriterion("sys_config_search >", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchGreaterThanOrEqualTo(String value) {
            addCriterion("sys_config_search >=", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchLessThan(String value) {
            addCriterion("sys_config_search <", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchLessThanOrEqualTo(String value) {
            addCriterion("sys_config_search <=", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchLike(String value) {
            addCriterion("sys_config_search like", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchNotLike(String value) {
            addCriterion("sys_config_search not like", value, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchIn(List<String> values) {
            addCriterion("sys_config_search in", values, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchNotIn(List<String> values) {
            addCriterion("sys_config_search not in", values, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchBetween(String value1, String value2) {
            addCriterion("sys_config_search between", value1, value2, "sysConfigSearch");
            return (Criteria) this;
        }

        public Criteria andSysConfigSearchNotBetween(String value1, String value2) {
            addCriterion("sys_config_search not between", value1, value2, "sysConfigSearch");
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