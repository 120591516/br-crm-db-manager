package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBodyPartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBodyPartExample() {
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

        public Criteria andBodyPartIdIsNull() {
            addCriterion("body_part_id is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIsNotNull() {
            addCriterion("body_part_id is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdEqualTo(String value) {
            addCriterion("body_part_id =", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotEqualTo(String value) {
            addCriterion("body_part_id <>", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThan(String value) {
            addCriterion("body_part_id >", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("body_part_id >=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThan(String value) {
            addCriterion("body_part_id <", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLessThanOrEqualTo(String value) {
            addCriterion("body_part_id <=", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdLike(String value) {
            addCriterion("body_part_id like", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotLike(String value) {
            addCriterion("body_part_id not like", value, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdIn(List<String> values) {
            addCriterion("body_part_id in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotIn(List<String> values) {
            addCriterion("body_part_id not in", values, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdBetween(String value1, String value2) {
            addCriterion("body_part_id between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartIdNotBetween(String value1, String value2) {
            addCriterion("body_part_id not between", value1, value2, "bodyPartId");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIsNull() {
            addCriterion("body_part_name is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIsNotNull() {
            addCriterion("body_part_name is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameEqualTo(String value) {
            addCriterion("body_part_name =", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotEqualTo(String value) {
            addCriterion("body_part_name <>", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameGreaterThan(String value) {
            addCriterion("body_part_name >", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("body_part_name >=", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLessThan(String value) {
            addCriterion("body_part_name <", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLessThanOrEqualTo(String value) {
            addCriterion("body_part_name <=", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameLike(String value) {
            addCriterion("body_part_name like", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotLike(String value) {
            addCriterion("body_part_name not like", value, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameIn(List<String> values) {
            addCriterion("body_part_name in", values, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotIn(List<String> values) {
            addCriterion("body_part_name not in", values, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameBetween(String value1, String value2) {
            addCriterion("body_part_name between", value1, value2, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartNameNotBetween(String value1, String value2) {
            addCriterion("body_part_name not between", value1, value2, "bodyPartName");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeIsNull() {
            addCriterion("body_part_code is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeIsNotNull() {
            addCriterion("body_part_code is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeEqualTo(String value) {
            addCriterion("body_part_code =", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeNotEqualTo(String value) {
            addCriterion("body_part_code <>", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeGreaterThan(String value) {
            addCriterion("body_part_code >", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("body_part_code >=", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeLessThan(String value) {
            addCriterion("body_part_code <", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeLessThanOrEqualTo(String value) {
            addCriterion("body_part_code <=", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeLike(String value) {
            addCriterion("body_part_code like", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeNotLike(String value) {
            addCriterion("body_part_code not like", value, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeIn(List<String> values) {
            addCriterion("body_part_code in", values, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeNotIn(List<String> values) {
            addCriterion("body_part_code not in", values, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeBetween(String value1, String value2) {
            addCriterion("body_part_code between", value1, value2, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartCodeNotBetween(String value1, String value2) {
            addCriterion("body_part_code not between", value1, value2, "bodyPartCode");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderIsNull() {
            addCriterion("body_part_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderIsNotNull() {
            addCriterion("body_part_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderEqualTo(Integer value) {
            addCriterion("body_part_disp_order =", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderNotEqualTo(Integer value) {
            addCriterion("body_part_disp_order <>", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderGreaterThan(Integer value) {
            addCriterion("body_part_disp_order >", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("body_part_disp_order >=", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderLessThan(Integer value) {
            addCriterion("body_part_disp_order <", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("body_part_disp_order <=", value, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderIn(List<Integer> values) {
            addCriterion("body_part_disp_order in", values, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderNotIn(List<Integer> values) {
            addCriterion("body_part_disp_order not in", values, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("body_part_disp_order between", value1, value2, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("body_part_disp_order not between", value1, value2, "bodyPartDispOrder");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusIsNull() {
            addCriterion("body_part_status is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusIsNotNull() {
            addCriterion("body_part_status is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusEqualTo(Integer value) {
            addCriterion("body_part_status =", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusNotEqualTo(Integer value) {
            addCriterion("body_part_status <>", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusGreaterThan(Integer value) {
            addCriterion("body_part_status >", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("body_part_status >=", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusLessThan(Integer value) {
            addCriterion("body_part_status <", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("body_part_status <=", value, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusIn(List<Integer> values) {
            addCriterion("body_part_status in", values, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusNotIn(List<Integer> values) {
            addCriterion("body_part_status not in", values, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusBetween(Integer value1, Integer value2) {
            addCriterion("body_part_status between", value1, value2, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("body_part_status not between", value1, value2, "bodyPartStatus");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeIsNull() {
            addCriterion("body_part_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeIsNotNull() {
            addCriterion("body_part_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeEqualTo(Date value) {
            addCriterion("body_part_create_time =", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeNotEqualTo(Date value) {
            addCriterion("body_part_create_time <>", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeGreaterThan(Date value) {
            addCriterion("body_part_create_time >", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("body_part_create_time >=", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeLessThan(Date value) {
            addCriterion("body_part_create_time <", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("body_part_create_time <=", value, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeIn(List<Date> values) {
            addCriterion("body_part_create_time in", values, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeNotIn(List<Date> values) {
            addCriterion("body_part_create_time not in", values, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeBetween(Date value1, Date value2) {
            addCriterion("body_part_create_time between", value1, value2, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("body_part_create_time not between", value1, value2, "bodyPartCreateTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeIsNull() {
            addCriterion("body_part_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeIsNotNull() {
            addCriterion("body_part_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeEqualTo(Date value) {
            addCriterion("body_part_edit_time =", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeNotEqualTo(Date value) {
            addCriterion("body_part_edit_time <>", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeGreaterThan(Date value) {
            addCriterion("body_part_edit_time >", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("body_part_edit_time >=", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeLessThan(Date value) {
            addCriterion("body_part_edit_time <", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("body_part_edit_time <=", value, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeIn(List<Date> values) {
            addCriterion("body_part_edit_time in", values, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeNotIn(List<Date> values) {
            addCriterion("body_part_edit_time not in", values, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeBetween(Date value1, Date value2) {
            addCriterion("body_part_edit_time between", value1, value2, "bodyPartEditTime");
            return (Criteria) this;
        }

        public Criteria andBodyPartEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("body_part_edit_time not between", value1, value2, "bodyPartEditTime");
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