package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationWebExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationWebExample() {
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

        public Criteria andOrgWebIdIsNull() {
            addCriterion("org_web_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdIsNotNull() {
            addCriterion("org_web_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdEqualTo(Long value) {
            addCriterion("org_web_id =", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdNotEqualTo(Long value) {
            addCriterion("org_web_id <>", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdGreaterThan(Long value) {
            addCriterion("org_web_id >", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_web_id >=", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdLessThan(Long value) {
            addCriterion("org_web_id <", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdLessThanOrEqualTo(Long value) {
            addCriterion("org_web_id <=", value, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdIn(List<Long> values) {
            addCriterion("org_web_id in", values, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdNotIn(List<Long> values) {
            addCriterion("org_web_id not in", values, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdBetween(Long value1, Long value2) {
            addCriterion("org_web_id between", value1, value2, "orgWebId");
            return (Criteria) this;
        }

        public Criteria andOrgWebIdNotBetween(Long value1, Long value2) {
            addCriterion("org_web_id not between", value1, value2, "orgWebId");
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

        public Criteria andOrgWebWechatIsNull() {
            addCriterion("org_web_wechat is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatIsNotNull() {
            addCriterion("org_web_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatEqualTo(Integer value) {
            addCriterion("org_web_wechat =", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatNotEqualTo(Integer value) {
            addCriterion("org_web_wechat <>", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatGreaterThan(Integer value) {
            addCriterion("org_web_wechat >", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_web_wechat >=", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatLessThan(Integer value) {
            addCriterion("org_web_wechat <", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatLessThanOrEqualTo(Integer value) {
            addCriterion("org_web_wechat <=", value, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatIn(List<Integer> values) {
            addCriterion("org_web_wechat in", values, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatNotIn(List<Integer> values) {
            addCriterion("org_web_wechat not in", values, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatBetween(Integer value1, Integer value2) {
            addCriterion("org_web_wechat between", value1, value2, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWechatNotBetween(Integer value1, Integer value2) {
            addCriterion("org_web_wechat not between", value1, value2, "orgWebWechat");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteIsNull() {
            addCriterion("org_web_website is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteIsNotNull() {
            addCriterion("org_web_website is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteEqualTo(Integer value) {
            addCriterion("org_web_website =", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteNotEqualTo(Integer value) {
            addCriterion("org_web_website <>", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteGreaterThan(Integer value) {
            addCriterion("org_web_website >", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_web_website >=", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteLessThan(Integer value) {
            addCriterion("org_web_website <", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteLessThanOrEqualTo(Integer value) {
            addCriterion("org_web_website <=", value, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteIn(List<Integer> values) {
            addCriterion("org_web_website in", values, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteNotIn(List<Integer> values) {
            addCriterion("org_web_website not in", values, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteBetween(Integer value1, Integer value2) {
            addCriterion("org_web_website between", value1, value2, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebWebsiteNotBetween(Integer value1, Integer value2) {
            addCriterion("org_web_website not between", value1, value2, "orgWebWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppIsNull() {
            addCriterion("org_web_app is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppIsNotNull() {
            addCriterion("org_web_app is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppEqualTo(Integer value) {
            addCriterion("org_web_app =", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppNotEqualTo(Integer value) {
            addCriterion("org_web_app <>", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppGreaterThan(Integer value) {
            addCriterion("org_web_app >", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_web_app >=", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppLessThan(Integer value) {
            addCriterion("org_web_app <", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppLessThanOrEqualTo(Integer value) {
            addCriterion("org_web_app <=", value, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppIn(List<Integer> values) {
            addCriterion("org_web_app in", values, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppNotIn(List<Integer> values) {
            addCriterion("org_web_app not in", values, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppBetween(Integer value1, Integer value2) {
            addCriterion("org_web_app between", value1, value2, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebAppNotBetween(Integer value1, Integer value2) {
            addCriterion("org_web_app not between", value1, value2, "orgWebApp");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeIsNull() {
            addCriterion("org_web_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeIsNotNull() {
            addCriterion("org_web_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeEqualTo(Date value) {
            addCriterion("org_web_create_time =", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeNotEqualTo(Date value) {
            addCriterion("org_web_create_time <>", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeGreaterThan(Date value) {
            addCriterion("org_web_create_time >", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_web_create_time >=", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeLessThan(Date value) {
            addCriterion("org_web_create_time <", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_web_create_time <=", value, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeIn(List<Date> values) {
            addCriterion("org_web_create_time in", values, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeNotIn(List<Date> values) {
            addCriterion("org_web_create_time not in", values, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_web_create_time between", value1, value2, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_web_create_time not between", value1, value2, "orgWebCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeIsNull() {
            addCriterion("org_web_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeIsNotNull() {
            addCriterion("org_web_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeEqualTo(Date value) {
            addCriterion("org_web_edit_time =", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeNotEqualTo(Date value) {
            addCriterion("org_web_edit_time <>", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeGreaterThan(Date value) {
            addCriterion("org_web_edit_time >", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_web_edit_time >=", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeLessThan(Date value) {
            addCriterion("org_web_edit_time <", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_web_edit_time <=", value, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeIn(List<Date> values) {
            addCriterion("org_web_edit_time in", values, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeNotIn(List<Date> values) {
            addCriterion("org_web_edit_time not in", values, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_web_edit_time between", value1, value2, "orgWebEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgWebEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_web_edit_time not between", value1, value2, "orgWebEditTime");
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