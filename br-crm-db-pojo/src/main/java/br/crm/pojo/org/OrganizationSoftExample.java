package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationSoftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationSoftExample() {
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

        public Criteria andOrgSoftIdIsNull() {
            addCriterion("org_soft_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdIsNotNull() {
            addCriterion("org_soft_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdEqualTo(Long value) {
            addCriterion("org_soft_id =", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdNotEqualTo(Long value) {
            addCriterion("org_soft_id <>", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdGreaterThan(Long value) {
            addCriterion("org_soft_id >", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_soft_id >=", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdLessThan(Long value) {
            addCriterion("org_soft_id <", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdLessThanOrEqualTo(Long value) {
            addCriterion("org_soft_id <=", value, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdIn(List<Long> values) {
            addCriterion("org_soft_id in", values, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdNotIn(List<Long> values) {
            addCriterion("org_soft_id not in", values, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdBetween(Long value1, Long value2) {
            addCriterion("org_soft_id between", value1, value2, "orgSoftId");
            return (Criteria) this;
        }

        public Criteria andOrgSoftIdNotBetween(Long value1, Long value2) {
            addCriterion("org_soft_id not between", value1, value2, "orgSoftId");
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

        public Criteria andOrgSoftNameIsNull() {
            addCriterion("org_soft_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameIsNotNull() {
            addCriterion("org_soft_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameEqualTo(String value) {
            addCriterion("org_soft_name =", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameNotEqualTo(String value) {
            addCriterion("org_soft_name <>", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameGreaterThan(String value) {
            addCriterion("org_soft_name >", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_soft_name >=", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameLessThan(String value) {
            addCriterion("org_soft_name <", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameLessThanOrEqualTo(String value) {
            addCriterion("org_soft_name <=", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameLike(String value) {
            addCriterion("org_soft_name like", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameNotLike(String value) {
            addCriterion("org_soft_name not like", value, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameIn(List<String> values) {
            addCriterion("org_soft_name in", values, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameNotIn(List<String> values) {
            addCriterion("org_soft_name not in", values, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameBetween(String value1, String value2) {
            addCriterion("org_soft_name between", value1, value2, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftNameNotBetween(String value1, String value2) {
            addCriterion("org_soft_name not between", value1, value2, "orgSoftName");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceIsNull() {
            addCriterion("org_soft_price is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceIsNotNull() {
            addCriterion("org_soft_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceEqualTo(Double value) {
            addCriterion("org_soft_price =", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceNotEqualTo(Double value) {
            addCriterion("org_soft_price <>", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceGreaterThan(Double value) {
            addCriterion("org_soft_price >", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("org_soft_price >=", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceLessThan(Double value) {
            addCriterion("org_soft_price <", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceLessThanOrEqualTo(Double value) {
            addCriterion("org_soft_price <=", value, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceIn(List<Double> values) {
            addCriterion("org_soft_price in", values, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceNotIn(List<Double> values) {
            addCriterion("org_soft_price not in", values, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceBetween(Double value1, Double value2) {
            addCriterion("org_soft_price between", value1, value2, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftPriceNotBetween(Double value1, Double value2) {
            addCriterion("org_soft_price not between", value1, value2, "orgSoftPrice");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyIsNull() {
            addCriterion("org_soft_company is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyIsNotNull() {
            addCriterion("org_soft_company is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyEqualTo(String value) {
            addCriterion("org_soft_company =", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyNotEqualTo(String value) {
            addCriterion("org_soft_company <>", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyGreaterThan(String value) {
            addCriterion("org_soft_company >", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("org_soft_company >=", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyLessThan(String value) {
            addCriterion("org_soft_company <", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyLessThanOrEqualTo(String value) {
            addCriterion("org_soft_company <=", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyLike(String value) {
            addCriterion("org_soft_company like", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyNotLike(String value) {
            addCriterion("org_soft_company not like", value, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyIn(List<String> values) {
            addCriterion("org_soft_company in", values, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyNotIn(List<String> values) {
            addCriterion("org_soft_company not in", values, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyBetween(String value1, String value2) {
            addCriterion("org_soft_company between", value1, value2, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCompanyNotBetween(String value1, String value2) {
            addCriterion("org_soft_company not between", value1, value2, "orgSoftCompany");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncIsNull() {
            addCriterion("org_soft_func is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncIsNotNull() {
            addCriterion("org_soft_func is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncEqualTo(String value) {
            addCriterion("org_soft_func =", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncNotEqualTo(String value) {
            addCriterion("org_soft_func <>", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncGreaterThan(String value) {
            addCriterion("org_soft_func >", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncGreaterThanOrEqualTo(String value) {
            addCriterion("org_soft_func >=", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncLessThan(String value) {
            addCriterion("org_soft_func <", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncLessThanOrEqualTo(String value) {
            addCriterion("org_soft_func <=", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncLike(String value) {
            addCriterion("org_soft_func like", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncNotLike(String value) {
            addCriterion("org_soft_func not like", value, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncIn(List<String> values) {
            addCriterion("org_soft_func in", values, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncNotIn(List<String> values) {
            addCriterion("org_soft_func not in", values, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncBetween(String value1, String value2) {
            addCriterion("org_soft_func between", value1, value2, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftFuncNotBetween(String value1, String value2) {
            addCriterion("org_soft_func not between", value1, value2, "orgSoftFunc");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusIsNull() {
            addCriterion("org_softstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusIsNotNull() {
            addCriterion("org_softstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusEqualTo(Integer value) {
            addCriterion("org_softstatus =", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusNotEqualTo(Integer value) {
            addCriterion("org_softstatus <>", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusGreaterThan(Integer value) {
            addCriterion("org_softstatus >", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_softstatus >=", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusLessThan(Integer value) {
            addCriterion("org_softstatus <", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_softstatus <=", value, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusIn(List<Integer> values) {
            addCriterion("org_softstatus in", values, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusNotIn(List<Integer> values) {
            addCriterion("org_softstatus not in", values, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusBetween(Integer value1, Integer value2) {
            addCriterion("org_softstatus between", value1, value2, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_softstatus not between", value1, value2, "orgSoftstatus");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeIsNull() {
            addCriterion("org_soft_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeIsNotNull() {
            addCriterion("org_soft_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeEqualTo(Date value) {
            addCriterion("org_soft_create_time =", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeNotEqualTo(Date value) {
            addCriterion("org_soft_create_time <>", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeGreaterThan(Date value) {
            addCriterion("org_soft_create_time >", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_soft_create_time >=", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeLessThan(Date value) {
            addCriterion("org_soft_create_time <", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_soft_create_time <=", value, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeIn(List<Date> values) {
            addCriterion("org_soft_create_time in", values, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeNotIn(List<Date> values) {
            addCriterion("org_soft_create_time not in", values, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_soft_create_time between", value1, value2, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_soft_create_time not between", value1, value2, "orgSoftCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeIsNull() {
            addCriterion("org_soft_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeIsNotNull() {
            addCriterion("org_soft_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeEqualTo(Date value) {
            addCriterion("org_soft_edit_time =", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeNotEqualTo(Date value) {
            addCriterion("org_soft_edit_time <>", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeGreaterThan(Date value) {
            addCriterion("org_soft_edit_time >", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_soft_edit_time >=", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeLessThan(Date value) {
            addCriterion("org_soft_edit_time <", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_soft_edit_time <=", value, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeIn(List<Date> values) {
            addCriterion("org_soft_edit_time in", values, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeNotIn(List<Date> values) {
            addCriterion("org_soft_edit_time not in", values, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_soft_edit_time between", value1, value2, "orgSoftEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgSoftEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_soft_edit_time not between", value1, value2, "orgSoftEditTime");
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