package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictDeptTypeExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictDeptTypeExample() {
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

        public Criteria andDictDeptTypeIdIsNull() {
            addCriterion("dict_dept_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdIsNotNull() {
            addCriterion("dict_dept_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdEqualTo(String value) {
            addCriterion("dict_dept_type_id =", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdNotEqualTo(String value) {
            addCriterion("dict_dept_type_id <>", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdGreaterThan(String value) {
            addCriterion("dict_dept_type_id >", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_dept_type_id >=", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdLessThan(String value) {
            addCriterion("dict_dept_type_id <", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdLessThanOrEqualTo(String value) {
            addCriterion("dict_dept_type_id <=", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdLike(String value) {
            addCriterion("dict_dept_type_id like", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdNotLike(String value) {
            addCriterion("dict_dept_type_id not like", value, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdIn(List<String> values) {
            addCriterion("dict_dept_type_id in", values, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdNotIn(List<String> values) {
            addCriterion("dict_dept_type_id not in", values, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdBetween(String value1, String value2) {
            addCriterion("dict_dept_type_id between", value1, value2, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeIdNotBetween(String value1, String value2) {
            addCriterion("dict_dept_type_id not between", value1, value2, "dictDeptTypeId");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameIsNull() {
            addCriterion("dict_dept_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameIsNotNull() {
            addCriterion("dict_dept_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameEqualTo(String value) {
            addCriterion("dict_dept_type_name =", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameNotEqualTo(String value) {
            addCriterion("dict_dept_type_name <>", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameGreaterThan(String value) {
            addCriterion("dict_dept_type_name >", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_dept_type_name >=", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameLessThan(String value) {
            addCriterion("dict_dept_type_name <", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameLessThanOrEqualTo(String value) {
            addCriterion("dict_dept_type_name <=", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameLike(String value) {
            addCriterion("dict_dept_type_name like", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameNotLike(String value) {
            addCriterion("dict_dept_type_name not like", value, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameIn(List<String> values) {
            addCriterion("dict_dept_type_name in", values, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameNotIn(List<String> values) {
            addCriterion("dict_dept_type_name not in", values, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameBetween(String value1, String value2) {
            addCriterion("dict_dept_type_name between", value1, value2, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeNameNotBetween(String value1, String value2) {
            addCriterion("dict_dept_type_name not between", value1, value2, "dictDeptTypeName");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusIsNull() {
            addCriterion("dict_dept_type_status is null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusIsNotNull() {
            addCriterion("dict_dept_type_status is not null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusEqualTo(Integer value) {
            addCriterion("dict_dept_type_status =", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusNotEqualTo(Integer value) {
            addCriterion("dict_dept_type_status <>", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusGreaterThan(Integer value) {
            addCriterion("dict_dept_type_status >", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_dept_type_status >=", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusLessThan(Integer value) {
            addCriterion("dict_dept_type_status <", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dict_dept_type_status <=", value, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusIn(List<Integer> values) {
            addCriterion("dict_dept_type_status in", values, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusNotIn(List<Integer> values) {
            addCriterion("dict_dept_type_status not in", values, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusBetween(Integer value1, Integer value2) {
            addCriterion("dict_dept_type_status between", value1, value2, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_dept_type_status not between", value1, value2, "dictDeptTypeStatus");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeIsNull() {
            addCriterion("dict_dept_type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeIsNotNull() {
            addCriterion("dict_dept_type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeEqualTo(Date value) {
            addCriterion("dict_dept_type_create_time =", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("dict_dept_type_create_time <>", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeGreaterThan(Date value) {
            addCriterion("dict_dept_type_create_time >", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dict_dept_type_create_time >=", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeLessThan(Date value) {
            addCriterion("dict_dept_type_create_time <", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dict_dept_type_create_time <=", value, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeIn(List<Date> values) {
            addCriterion("dict_dept_type_create_time in", values, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("dict_dept_type_create_time not in", values, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dict_dept_type_create_time between", value1, value2, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dict_dept_type_create_time not between", value1, value2, "dictDeptTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeIsNull() {
            addCriterion("dict_dept_type_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeIsNotNull() {
            addCriterion("dict_dept_type_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeEqualTo(Date value) {
            addCriterion("dict_dept_type_edit_time =", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeNotEqualTo(Date value) {
            addCriterion("dict_dept_type_edit_time <>", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeGreaterThan(Date value) {
            addCriterion("dict_dept_type_edit_time >", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dict_dept_type_edit_time >=", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeLessThan(Date value) {
            addCriterion("dict_dept_type_edit_time <", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("dict_dept_type_edit_time <=", value, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeIn(List<Date> values) {
            addCriterion("dict_dept_type_edit_time in", values, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeNotIn(List<Date> values) {
            addCriterion("dict_dept_type_edit_time not in", values, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeBetween(Date value1, Date value2) {
            addCriterion("dict_dept_type_edit_time between", value1, value2, "dictDeptTypeEditTime");
            return (Criteria) this;
        }

        public Criteria andDictDeptTypeEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("dict_dept_type_edit_time not between", value1, value2, "dictDeptTypeEditTime");
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