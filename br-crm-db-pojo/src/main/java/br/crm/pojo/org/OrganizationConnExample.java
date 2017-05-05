package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationConnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationConnExample() {
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

        public Criteria andOrgConnIdIsNull() {
            addCriterion("org_conn_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdIsNotNull() {
            addCriterion("org_conn_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdEqualTo(Long value) {
            addCriterion("org_conn_id =", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdNotEqualTo(Long value) {
            addCriterion("org_conn_id <>", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdGreaterThan(Long value) {
            addCriterion("org_conn_id >", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_conn_id >=", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdLessThan(Long value) {
            addCriterion("org_conn_id <", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdLessThanOrEqualTo(Long value) {
            addCriterion("org_conn_id <=", value, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdIn(List<Long> values) {
            addCriterion("org_conn_id in", values, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdNotIn(List<Long> values) {
            addCriterion("org_conn_id not in", values, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdBetween(Long value1, Long value2) {
            addCriterion("org_conn_id between", value1, value2, "orgConnId");
            return (Criteria) this;
        }

        public Criteria andOrgConnIdNotBetween(Long value1, Long value2) {
            addCriterion("org_conn_id not between", value1, value2, "orgConnId");
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

        public Criteria andOrgConnNameIsNull() {
            addCriterion("org_conn_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameIsNotNull() {
            addCriterion("org_conn_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameEqualTo(String value) {
            addCriterion("org_conn_name =", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameNotEqualTo(String value) {
            addCriterion("org_conn_name <>", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameGreaterThan(String value) {
            addCriterion("org_conn_name >", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_conn_name >=", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameLessThan(String value) {
            addCriterion("org_conn_name <", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameLessThanOrEqualTo(String value) {
            addCriterion("org_conn_name <=", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameLike(String value) {
            addCriterion("org_conn_name like", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameNotLike(String value) {
            addCriterion("org_conn_name not like", value, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameIn(List<String> values) {
            addCriterion("org_conn_name in", values, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameNotIn(List<String> values) {
            addCriterion("org_conn_name not in", values, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameBetween(String value1, String value2) {
            addCriterion("org_conn_name between", value1, value2, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnNameNotBetween(String value1, String value2) {
            addCriterion("org_conn_name not between", value1, value2, "orgConnName");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostIsNull() {
            addCriterion("org_conn_post is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostIsNotNull() {
            addCriterion("org_conn_post is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostEqualTo(String value) {
            addCriterion("org_conn_post =", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostNotEqualTo(String value) {
            addCriterion("org_conn_post <>", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostGreaterThan(String value) {
            addCriterion("org_conn_post >", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostGreaterThanOrEqualTo(String value) {
            addCriterion("org_conn_post >=", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostLessThan(String value) {
            addCriterion("org_conn_post <", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostLessThanOrEqualTo(String value) {
            addCriterion("org_conn_post <=", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostLike(String value) {
            addCriterion("org_conn_post like", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostNotLike(String value) {
            addCriterion("org_conn_post not like", value, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostIn(List<String> values) {
            addCriterion("org_conn_post in", values, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostNotIn(List<String> values) {
            addCriterion("org_conn_post not in", values, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostBetween(String value1, String value2) {
            addCriterion("org_conn_post between", value1, value2, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPostNotBetween(String value1, String value2) {
            addCriterion("org_conn_post not between", value1, value2, "orgConnPost");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneIsNull() {
            addCriterion("org_conn_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneIsNotNull() {
            addCriterion("org_conn_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneEqualTo(String value) {
            addCriterion("org_conn_phone =", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneNotEqualTo(String value) {
            addCriterion("org_conn_phone <>", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneGreaterThan(String value) {
            addCriterion("org_conn_phone >", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_conn_phone >=", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneLessThan(String value) {
            addCriterion("org_conn_phone <", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneLessThanOrEqualTo(String value) {
            addCriterion("org_conn_phone <=", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneLike(String value) {
            addCriterion("org_conn_phone like", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneNotLike(String value) {
            addCriterion("org_conn_phone not like", value, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneIn(List<String> values) {
            addCriterion("org_conn_phone in", values, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneNotIn(List<String> values) {
            addCriterion("org_conn_phone not in", values, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneBetween(String value1, String value2) {
            addCriterion("org_conn_phone between", value1, value2, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnPhoneNotBetween(String value1, String value2) {
            addCriterion("org_conn_phone not between", value1, value2, "orgConnPhone");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailIsNull() {
            addCriterion("org_conn_email is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailIsNotNull() {
            addCriterion("org_conn_email is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailEqualTo(String value) {
            addCriterion("org_conn_email =", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailNotEqualTo(String value) {
            addCriterion("org_conn_email <>", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailGreaterThan(String value) {
            addCriterion("org_conn_email >", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailGreaterThanOrEqualTo(String value) {
            addCriterion("org_conn_email >=", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailLessThan(String value) {
            addCriterion("org_conn_email <", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailLessThanOrEqualTo(String value) {
            addCriterion("org_conn_email <=", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailLike(String value) {
            addCriterion("org_conn_email like", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailNotLike(String value) {
            addCriterion("org_conn_email not like", value, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailIn(List<String> values) {
            addCriterion("org_conn_email in", values, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailNotIn(List<String> values) {
            addCriterion("org_conn_email not in", values, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailBetween(String value1, String value2) {
            addCriterion("org_conn_email between", value1, value2, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnEmailNotBetween(String value1, String value2) {
            addCriterion("org_conn_email not between", value1, value2, "orgConnEmail");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallIsNull() {
            addCriterion("org_conn_call is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallIsNotNull() {
            addCriterion("org_conn_call is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallEqualTo(String value) {
            addCriterion("org_conn_call =", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallNotEqualTo(String value) {
            addCriterion("org_conn_call <>", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallGreaterThan(String value) {
            addCriterion("org_conn_call >", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallGreaterThanOrEqualTo(String value) {
            addCriterion("org_conn_call >=", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallLessThan(String value) {
            addCriterion("org_conn_call <", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallLessThanOrEqualTo(String value) {
            addCriterion("org_conn_call <=", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallLike(String value) {
            addCriterion("org_conn_call like", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallNotLike(String value) {
            addCriterion("org_conn_call not like", value, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallIn(List<String> values) {
            addCriterion("org_conn_call in", values, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallNotIn(List<String> values) {
            addCriterion("org_conn_call not in", values, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallBetween(String value1, String value2) {
            addCriterion("org_conn_call between", value1, value2, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnCallNotBetween(String value1, String value2) {
            addCriterion("org_conn_call not between", value1, value2, "orgConnCall");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusIsNull() {
            addCriterion("org_conn_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusIsNotNull() {
            addCriterion("org_conn_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusEqualTo(Integer value) {
            addCriterion("org_conn_status =", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusNotEqualTo(Integer value) {
            addCriterion("org_conn_status <>", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusGreaterThan(Integer value) {
            addCriterion("org_conn_status >", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_conn_status >=", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusLessThan(Integer value) {
            addCriterion("org_conn_status <", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_conn_status <=", value, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusIn(List<Integer> values) {
            addCriterion("org_conn_status in", values, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusNotIn(List<Integer> values) {
            addCriterion("org_conn_status not in", values, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_conn_status between", value1, value2, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_conn_status not between", value1, value2, "orgConnStatus");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeIsNull() {
            addCriterion("org_conn_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeIsNotNull() {
            addCriterion("org_conn_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeEqualTo(Date value) {
            addCriterion("org_conn_create_time =", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeNotEqualTo(Date value) {
            addCriterion("org_conn_create_time <>", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeGreaterThan(Date value) {
            addCriterion("org_conn_create_time >", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_conn_create_time >=", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeLessThan(Date value) {
            addCriterion("org_conn_create_time <", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_conn_create_time <=", value, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeIn(List<Date> values) {
            addCriterion("org_conn_create_time in", values, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeNotIn(List<Date> values) {
            addCriterion("org_conn_create_time not in", values, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_conn_create_time between", value1, value2, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_conn_create_time not between", value1, value2, "orgConnCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeIsNull() {
            addCriterion("org_conn_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeIsNotNull() {
            addCriterion("org_conn_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeEqualTo(Date value) {
            addCriterion("org_conn_edit_time =", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeNotEqualTo(Date value) {
            addCriterion("org_conn_edit_time <>", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeGreaterThan(Date value) {
            addCriterion("org_conn_edit_time >", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_conn_edit_time >=", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeLessThan(Date value) {
            addCriterion("org_conn_edit_time <", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_conn_edit_time <=", value, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeIn(List<Date> values) {
            addCriterion("org_conn_edit_time in", values, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeNotIn(List<Date> values) {
            addCriterion("org_conn_edit_time not in", values, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_conn_edit_time between", value1, value2, "orgConnEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgConnEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_conn_edit_time not between", value1, value2, "orgConnEditTime");
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