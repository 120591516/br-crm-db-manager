package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationSaleExample() {
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

        public Criteria andOrgSaleIdIsNull() {
            addCriterion("org_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdIsNotNull() {
            addCriterion("org_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdEqualTo(Long value) {
            addCriterion("org_sale_id =", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdNotEqualTo(Long value) {
            addCriterion("org_sale_id <>", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdGreaterThan(Long value) {
            addCriterion("org_sale_id >", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_sale_id >=", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdLessThan(Long value) {
            addCriterion("org_sale_id <", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdLessThanOrEqualTo(Long value) {
            addCriterion("org_sale_id <=", value, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdIn(List<Long> values) {
            addCriterion("org_sale_id in", values, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdNotIn(List<Long> values) {
            addCriterion("org_sale_id not in", values, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdBetween(Long value1, Long value2) {
            addCriterion("org_sale_id between", value1, value2, "orgSaleId");
            return (Criteria) this;
        }

        public Criteria andOrgSaleIdNotBetween(Long value1, Long value2) {
            addCriterion("org_sale_id not between", value1, value2, "orgSaleId");
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

        public Criteria andOrgSalePersonIdIsNull() {
            addCriterion("org_sale_person_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdIsNotNull() {
            addCriterion("org_sale_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdEqualTo(Long value) {
            addCriterion("org_sale_person_id =", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdNotEqualTo(Long value) {
            addCriterion("org_sale_person_id <>", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdGreaterThan(Long value) {
            addCriterion("org_sale_person_id >", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_sale_person_id >=", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdLessThan(Long value) {
            addCriterion("org_sale_person_id <", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdLessThanOrEqualTo(Long value) {
            addCriterion("org_sale_person_id <=", value, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdIn(List<Long> values) {
            addCriterion("org_sale_person_id in", values, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdNotIn(List<Long> values) {
            addCriterion("org_sale_person_id not in", values, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdBetween(Long value1, Long value2) {
            addCriterion("org_sale_person_id between", value1, value2, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonIdNotBetween(Long value1, Long value2) {
            addCriterion("org_sale_person_id not between", value1, value2, "orgSalePersonId");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameIsNull() {
            addCriterion("org_sale_person_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameIsNotNull() {
            addCriterion("org_sale_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameEqualTo(String value) {
            addCriterion("org_sale_person_name =", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameNotEqualTo(String value) {
            addCriterion("org_sale_person_name <>", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameGreaterThan(String value) {
            addCriterion("org_sale_person_name >", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_sale_person_name >=", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameLessThan(String value) {
            addCriterion("org_sale_person_name <", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameLessThanOrEqualTo(String value) {
            addCriterion("org_sale_person_name <=", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameLike(String value) {
            addCriterion("org_sale_person_name like", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameNotLike(String value) {
            addCriterion("org_sale_person_name not like", value, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameIn(List<String> values) {
            addCriterion("org_sale_person_name in", values, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameNotIn(List<String> values) {
            addCriterion("org_sale_person_name not in", values, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameBetween(String value1, String value2) {
            addCriterion("org_sale_person_name between", value1, value2, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSalePersonNameNotBetween(String value1, String value2) {
            addCriterion("org_sale_person_name not between", value1, value2, "orgSalePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusIsNull() {
            addCriterion("org_sale_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusIsNotNull() {
            addCriterion("org_sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusEqualTo(Integer value) {
            addCriterion("org_sale_status =", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusNotEqualTo(Integer value) {
            addCriterion("org_sale_status <>", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusGreaterThan(Integer value) {
            addCriterion("org_sale_status >", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_sale_status >=", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusLessThan(Integer value) {
            addCriterion("org_sale_status <", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_sale_status <=", value, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusIn(List<Integer> values) {
            addCriterion("org_sale_status in", values, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusNotIn(List<Integer> values) {
            addCriterion("org_sale_status not in", values, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_sale_status between", value1, value2, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_sale_status not between", value1, value2, "orgSaleStatus");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeIsNull() {
            addCriterion("org_sale_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeIsNotNull() {
            addCriterion("org_sale_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeEqualTo(Date value) {
            addCriterion("org_sale_create_time =", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeNotEqualTo(Date value) {
            addCriterion("org_sale_create_time <>", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeGreaterThan(Date value) {
            addCriterion("org_sale_create_time >", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_sale_create_time >=", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeLessThan(Date value) {
            addCriterion("org_sale_create_time <", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_sale_create_time <=", value, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeIn(List<Date> values) {
            addCriterion("org_sale_create_time in", values, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeNotIn(List<Date> values) {
            addCriterion("org_sale_create_time not in", values, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_sale_create_time between", value1, value2, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_sale_create_time not between", value1, value2, "orgSaleCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeIsNull() {
            addCriterion("org_sale_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeIsNotNull() {
            addCriterion("org_sale_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeEqualTo(Date value) {
            addCriterion("org_sale_edit_time =", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeNotEqualTo(Date value) {
            addCriterion("org_sale_edit_time <>", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeGreaterThan(Date value) {
            addCriterion("org_sale_edit_time >", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_sale_edit_time >=", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeLessThan(Date value) {
            addCriterion("org_sale_edit_time <", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_sale_edit_time <=", value, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeIn(List<Date> values) {
            addCriterion("org_sale_edit_time in", values, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeNotIn(List<Date> values) {
            addCriterion("org_sale_edit_time not in", values, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_sale_edit_time between", value1, value2, "orgSaleEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSaleEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_sale_edit_time not between", value1, value2, "orgSaleEditTime");
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