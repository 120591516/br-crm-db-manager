package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictEmailRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictEmailRecordExample() {
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

        public Criteria andDictEmailIdIsNull() {
            addCriterion("dict_email_id is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdIsNotNull() {
            addCriterion("dict_email_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdEqualTo(Long value) {
            addCriterion("dict_email_id =", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotEqualTo(Long value) {
            addCriterion("dict_email_id <>", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdGreaterThan(Long value) {
            addCriterion("dict_email_id >", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_email_id >=", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdLessThan(Long value) {
            addCriterion("dict_email_id <", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_email_id <=", value, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdIn(List<Long> values) {
            addCriterion("dict_email_id in", values, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotIn(List<Long> values) {
            addCriterion("dict_email_id not in", values, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdBetween(Long value1, Long value2) {
            addCriterion("dict_email_id between", value1, value2, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_email_id not between", value1, value2, "dictEmailId");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleIsNull() {
            addCriterion("dict_email_title is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleIsNotNull() {
            addCriterion("dict_email_title is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleEqualTo(String value) {
            addCriterion("dict_email_title =", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleNotEqualTo(String value) {
            addCriterion("dict_email_title <>", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleGreaterThan(String value) {
            addCriterion("dict_email_title >", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dict_email_title >=", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleLessThan(String value) {
            addCriterion("dict_email_title <", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("dict_email_title <=", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleLike(String value) {
            addCriterion("dict_email_title like", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleNotLike(String value) {
            addCriterion("dict_email_title not like", value, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleIn(List<String> values) {
            addCriterion("dict_email_title in", values, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleNotIn(List<String> values) {
            addCriterion("dict_email_title not in", values, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleBetween(String value1, String value2) {
            addCriterion("dict_email_title between", value1, value2, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailTitleNotBetween(String value1, String value2) {
            addCriterion("dict_email_title not between", value1, value2, "dictEmailTitle");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentIsNull() {
            addCriterion("dict_email_content is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentIsNotNull() {
            addCriterion("dict_email_content is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentEqualTo(String value) {
            addCriterion("dict_email_content =", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentNotEqualTo(String value) {
            addCriterion("dict_email_content <>", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentGreaterThan(String value) {
            addCriterion("dict_email_content >", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentGreaterThanOrEqualTo(String value) {
            addCriterion("dict_email_content >=", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentLessThan(String value) {
            addCriterion("dict_email_content <", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentLessThanOrEqualTo(String value) {
            addCriterion("dict_email_content <=", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentLike(String value) {
            addCriterion("dict_email_content like", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentNotLike(String value) {
            addCriterion("dict_email_content not like", value, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentIn(List<String> values) {
            addCriterion("dict_email_content in", values, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentNotIn(List<String> values) {
            addCriterion("dict_email_content not in", values, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentBetween(String value1, String value2) {
            addCriterion("dict_email_content between", value1, value2, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailContentNotBetween(String value1, String value2) {
            addCriterion("dict_email_content not between", value1, value2, "dictEmailContent");
            return (Criteria) this;
        }

        public Criteria andDictEmailToIsNull() {
            addCriterion("dict_email_to is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailToIsNotNull() {
            addCriterion("dict_email_to is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailToEqualTo(String value) {
            addCriterion("dict_email_to =", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToNotEqualTo(String value) {
            addCriterion("dict_email_to <>", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToGreaterThan(String value) {
            addCriterion("dict_email_to >", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToGreaterThanOrEqualTo(String value) {
            addCriterion("dict_email_to >=", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToLessThan(String value) {
            addCriterion("dict_email_to <", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToLessThanOrEqualTo(String value) {
            addCriterion("dict_email_to <=", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToLike(String value) {
            addCriterion("dict_email_to like", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToNotLike(String value) {
            addCriterion("dict_email_to not like", value, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToIn(List<String> values) {
            addCriterion("dict_email_to in", values, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToNotIn(List<String> values) {
            addCriterion("dict_email_to not in", values, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToBetween(String value1, String value2) {
            addCriterion("dict_email_to between", value1, value2, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailToNotBetween(String value1, String value2) {
            addCriterion("dict_email_to not between", value1, value2, "dictEmailTo");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentIsNull() {
            addCriterion("dict_email_attachment is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentIsNotNull() {
            addCriterion("dict_email_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentEqualTo(String value) {
            addCriterion("dict_email_attachment =", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentNotEqualTo(String value) {
            addCriterion("dict_email_attachment <>", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentGreaterThan(String value) {
            addCriterion("dict_email_attachment >", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("dict_email_attachment >=", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentLessThan(String value) {
            addCriterion("dict_email_attachment <", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentLessThanOrEqualTo(String value) {
            addCriterion("dict_email_attachment <=", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentLike(String value) {
            addCriterion("dict_email_attachment like", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentNotLike(String value) {
            addCriterion("dict_email_attachment not like", value, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentIn(List<String> values) {
            addCriterion("dict_email_attachment in", values, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentNotIn(List<String> values) {
            addCriterion("dict_email_attachment not in", values, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentBetween(String value1, String value2) {
            addCriterion("dict_email_attachment between", value1, value2, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailAttachmentNotBetween(String value1, String value2) {
            addCriterion("dict_email_attachment not between", value1, value2, "dictEmailAttachment");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeIsNull() {
            addCriterion("dict_email_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeIsNotNull() {
            addCriterion("dict_email_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeEqualTo(Date value) {
            addCriterion("dict_email_create_time =", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeNotEqualTo(Date value) {
            addCriterion("dict_email_create_time <>", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeGreaterThan(Date value) {
            addCriterion("dict_email_create_time >", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dict_email_create_time >=", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeLessThan(Date value) {
            addCriterion("dict_email_create_time <", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dict_email_create_time <=", value, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeIn(List<Date> values) {
            addCriterion("dict_email_create_time in", values, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeNotIn(List<Date> values) {
            addCriterion("dict_email_create_time not in", values, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dict_email_create_time between", value1, value2, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dict_email_create_time not between", value1, value2, "dictEmailCreateTime");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusIsNull() {
            addCriterion("dict_email_status is null");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusIsNotNull() {
            addCriterion("dict_email_status is not null");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusEqualTo(Integer value) {
            addCriterion("dict_email_status =", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusNotEqualTo(Integer value) {
            addCriterion("dict_email_status <>", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusGreaterThan(Integer value) {
            addCriterion("dict_email_status >", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_email_status >=", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusLessThan(Integer value) {
            addCriterion("dict_email_status <", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dict_email_status <=", value, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusIn(List<Integer> values) {
            addCriterion("dict_email_status in", values, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusNotIn(List<Integer> values) {
            addCriterion("dict_email_status not in", values, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusBetween(Integer value1, Integer value2) {
            addCriterion("dict_email_status between", value1, value2, "dictEmailStatus");
            return (Criteria) this;
        }

        public Criteria andDictEmailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_email_status not between", value1, value2, "dictEmailStatus");
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