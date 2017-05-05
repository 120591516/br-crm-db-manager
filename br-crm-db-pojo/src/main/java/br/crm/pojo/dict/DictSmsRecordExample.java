package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictSmsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictSmsRecordExample() {
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

        public Criteria andSmsIdIsNull() {
            addCriterion("SMS_id is null");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNotNull() {
            addCriterion("SMS_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmsIdEqualTo(Long value) {
            addCriterion("SMS_id =", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotEqualTo(Long value) {
            addCriterion("SMS_id <>", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThan(Long value) {
            addCriterion("SMS_id >", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SMS_id >=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThan(Long value) {
            addCriterion("SMS_id <", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThanOrEqualTo(Long value) {
            addCriterion("SMS_id <=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIn(List<Long> values) {
            addCriterion("SMS_id in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotIn(List<Long> values) {
            addCriterion("SMS_id not in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdBetween(Long value1, Long value2) {
            addCriterion("SMS_id between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotBetween(Long value1, Long value2) {
            addCriterion("SMS_id not between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneIsNull() {
            addCriterion("SMS_phone is null");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneIsNotNull() {
            addCriterion("SMS_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneEqualTo(String value) {
            addCriterion("SMS_phone =", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneNotEqualTo(String value) {
            addCriterion("SMS_phone <>", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneGreaterThan(String value) {
            addCriterion("SMS_phone >", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_phone >=", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneLessThan(String value) {
            addCriterion("SMS_phone <", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneLessThanOrEqualTo(String value) {
            addCriterion("SMS_phone <=", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneLike(String value) {
            addCriterion("SMS_phone like", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneNotLike(String value) {
            addCriterion("SMS_phone not like", value, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneIn(List<String> values) {
            addCriterion("SMS_phone in", values, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneNotIn(List<String> values) {
            addCriterion("SMS_phone not in", values, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneBetween(String value1, String value2) {
            addCriterion("SMS_phone between", value1, value2, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsPhoneNotBetween(String value1, String value2) {
            addCriterion("SMS_phone not between", value1, value2, "smsPhone");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNull() {
            addCriterion("SMS_content is null");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNotNull() {
            addCriterion("SMS_content is not null");
            return (Criteria) this;
        }

        public Criteria andSmsContentEqualTo(String value) {
            addCriterion("SMS_content =", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotEqualTo(String value) {
            addCriterion("SMS_content <>", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThan(String value) {
            addCriterion("SMS_content >", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_content >=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThan(String value) {
            addCriterion("SMS_content <", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThanOrEqualTo(String value) {
            addCriterion("SMS_content <=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLike(String value) {
            addCriterion("SMS_content like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotLike(String value) {
            addCriterion("SMS_content not like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentIn(List<String> values) {
            addCriterion("SMS_content in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotIn(List<String> values) {
            addCriterion("SMS_content not in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentBetween(String value1, String value2) {
            addCriterion("SMS_content between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotBetween(String value1, String value2) {
            addCriterion("SMS_content not between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIsNull() {
            addCriterion("SMS_Status is null");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIsNotNull() {
            addCriterion("SMS_Status is not null");
            return (Criteria) this;
        }

        public Criteria andSmsStatusEqualTo(Integer value) {
            addCriterion("SMS_Status =", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotEqualTo(Integer value) {
            addCriterion("SMS_Status <>", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusGreaterThan(Integer value) {
            addCriterion("SMS_Status >", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SMS_Status >=", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusLessThan(Integer value) {
            addCriterion("SMS_Status <", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SMS_Status <=", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIn(List<Integer> values) {
            addCriterion("SMS_Status in", values, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotIn(List<Integer> values) {
            addCriterion("SMS_Status not in", values, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusBetween(Integer value1, Integer value2) {
            addCriterion("SMS_Status between", value1, value2, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SMS_Status not between", value1, value2, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsCreateIsNull() {
            addCriterion("SMS_create is null");
            return (Criteria) this;
        }

        public Criteria andSmsCreateIsNotNull() {
            addCriterion("SMS_create is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCreateEqualTo(Date value) {
            addCriterion("SMS_create =", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateNotEqualTo(Date value) {
            addCriterion("SMS_create <>", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateGreaterThan(Date value) {
            addCriterion("SMS_create >", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("SMS_create >=", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateLessThan(Date value) {
            addCriterion("SMS_create <", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateLessThanOrEqualTo(Date value) {
            addCriterion("SMS_create <=", value, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateIn(List<Date> values) {
            addCriterion("SMS_create in", values, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateNotIn(List<Date> values) {
            addCriterion("SMS_create not in", values, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateBetween(Date value1, Date value2) {
            addCriterion("SMS_create between", value1, value2, "smsCreate");
            return (Criteria) this;
        }

        public Criteria andSmsCreateNotBetween(Date value1, Date value2) {
            addCriterion("SMS_create not between", value1, value2, "smsCreate");
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