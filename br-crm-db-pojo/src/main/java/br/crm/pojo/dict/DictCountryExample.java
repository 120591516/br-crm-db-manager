package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictCountryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictCountryExample() {
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Long value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Long value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Long value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Long value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Long> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Long> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Long value1, Long value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryKeysIsNull() {
            addCriterion("country_keys is null");
            return (Criteria) this;
        }

        public Criteria andCountryKeysIsNotNull() {
            addCriterion("country_keys is not null");
            return (Criteria) this;
        }

        public Criteria andCountryKeysEqualTo(String value) {
            addCriterion("country_keys =", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysNotEqualTo(String value) {
            addCriterion("country_keys <>", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysGreaterThan(String value) {
            addCriterion("country_keys >", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysGreaterThanOrEqualTo(String value) {
            addCriterion("country_keys >=", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysLessThan(String value) {
            addCriterion("country_keys <", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysLessThanOrEqualTo(String value) {
            addCriterion("country_keys <=", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysLike(String value) {
            addCriterion("country_keys like", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysNotLike(String value) {
            addCriterion("country_keys not like", value, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysIn(List<String> values) {
            addCriterion("country_keys in", values, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysNotIn(List<String> values) {
            addCriterion("country_keys not in", values, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysBetween(String value1, String value2) {
            addCriterion("country_keys between", value1, value2, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryKeysNotBetween(String value1, String value2) {
            addCriterion("country_keys not between", value1, value2, "countryKeys");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeIsNull() {
            addCriterion("country_input_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeIsNotNull() {
            addCriterion("country_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeEqualTo(String value) {
            addCriterion("country_input_code =", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeNotEqualTo(String value) {
            addCriterion("country_input_code <>", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeGreaterThan(String value) {
            addCriterion("country_input_code >", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_input_code >=", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeLessThan(String value) {
            addCriterion("country_input_code <", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeLessThanOrEqualTo(String value) {
            addCriterion("country_input_code <=", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeLike(String value) {
            addCriterion("country_input_code like", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeNotLike(String value) {
            addCriterion("country_input_code not like", value, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeIn(List<String> values) {
            addCriterion("country_input_code in", values, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeNotIn(List<String> values) {
            addCriterion("country_input_code not in", values, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeBetween(String value1, String value2) {
            addCriterion("country_input_code between", value1, value2, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryInputCodeNotBetween(String value1, String value2) {
            addCriterion("country_input_code not between", value1, value2, "countryInputCode");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderIsNull() {
            addCriterion("country_line_order is null");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderIsNotNull() {
            addCriterion("country_line_order is not null");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderEqualTo(String value) {
            addCriterion("country_line_order =", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderNotEqualTo(String value) {
            addCriterion("country_line_order <>", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderGreaterThan(String value) {
            addCriterion("country_line_order >", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderGreaterThanOrEqualTo(String value) {
            addCriterion("country_line_order >=", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderLessThan(String value) {
            addCriterion("country_line_order <", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderLessThanOrEqualTo(String value) {
            addCriterion("country_line_order <=", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderLike(String value) {
            addCriterion("country_line_order like", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderNotLike(String value) {
            addCriterion("country_line_order not like", value, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderIn(List<String> values) {
            addCriterion("country_line_order in", values, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderNotIn(List<String> values) {
            addCriterion("country_line_order not in", values, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderBetween(String value1, String value2) {
            addCriterion("country_line_order between", value1, value2, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryLineOrderNotBetween(String value1, String value2) {
            addCriterion("country_line_order not between", value1, value2, "countryLineOrder");
            return (Criteria) this;
        }

        public Criteria andCountryStatusIsNull() {
            addCriterion("country_status is null");
            return (Criteria) this;
        }

        public Criteria andCountryStatusIsNotNull() {
            addCriterion("country_status is not null");
            return (Criteria) this;
        }

        public Criteria andCountryStatusEqualTo(Integer value) {
            addCriterion("country_status =", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusNotEqualTo(Integer value) {
            addCriterion("country_status <>", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusGreaterThan(Integer value) {
            addCriterion("country_status >", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_status >=", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusLessThan(Integer value) {
            addCriterion("country_status <", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("country_status <=", value, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusIn(List<Integer> values) {
            addCriterion("country_status in", values, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusNotIn(List<Integer> values) {
            addCriterion("country_status not in", values, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusBetween(Integer value1, Integer value2) {
            addCriterion("country_status between", value1, value2, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("country_status not between", value1, value2, "countryStatus");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeIsNull() {
            addCriterion("country_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeIsNotNull() {
            addCriterion("country_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeEqualTo(Date value) {
            addCriterion("country_create_time =", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeNotEqualTo(Date value) {
            addCriterion("country_create_time <>", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeGreaterThan(Date value) {
            addCriterion("country_create_time >", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("country_create_time >=", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeLessThan(Date value) {
            addCriterion("country_create_time <", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("country_create_time <=", value, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeIn(List<Date> values) {
            addCriterion("country_create_time in", values, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeNotIn(List<Date> values) {
            addCriterion("country_create_time not in", values, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeBetween(Date value1, Date value2) {
            addCriterion("country_create_time between", value1, value2, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("country_create_time not between", value1, value2, "countryCreateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeIsNull() {
            addCriterion("country_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeIsNotNull() {
            addCriterion("country_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeEqualTo(Date value) {
            addCriterion("country_update_time =", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeNotEqualTo(Date value) {
            addCriterion("country_update_time <>", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeGreaterThan(Date value) {
            addCriterion("country_update_time >", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("country_update_time >=", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeLessThan(Date value) {
            addCriterion("country_update_time <", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("country_update_time <=", value, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeIn(List<Date> values) {
            addCriterion("country_update_time in", values, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeNotIn(List<Date> values) {
            addCriterion("country_update_time not in", values, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("country_update_time between", value1, value2, "countryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCountryUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("country_update_time not between", value1, value2, "countryUpdateTime");
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