package br.crm.pojo.suite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamSuiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamSuiteExample() {
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

        public Criteria andExamSuiteIdIsNull() {
            addCriterion("exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNotNull() {
            addCriterion("exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdEqualTo(String value) {
            addCriterion("exam_suite_id =", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotEqualTo(String value) {
            addCriterion("exam_suite_id <>", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThan(String value) {
            addCriterion("exam_suite_id >", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_id >=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThan(String value) {
            addCriterion("exam_suite_id <", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_id <=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLike(String value) {
            addCriterion("exam_suite_id like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotLike(String value) {
            addCriterion("exam_suite_id not like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIn(List<String> values) {
            addCriterion("exam_suite_id in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotIn(List<String> values) {
            addCriterion("exam_suite_id not in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdBetween(String value1, String value2) {
            addCriterion("exam_suite_id between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_id not between", value1, value2, "examSuiteId");
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

        public Criteria andExamSuiteNameIsNull() {
            addCriterion("exam_suite_name is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIsNotNull() {
            addCriterion("exam_suite_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEqualTo(String value) {
            addCriterion("exam_suite_name =", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotEqualTo(String value) {
            addCriterion("exam_suite_name <>", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThan(String value) {
            addCriterion("exam_suite_name >", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_name >=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThan(String value) {
            addCriterion("exam_suite_name <", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_name <=", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameLike(String value) {
            addCriterion("exam_suite_name like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotLike(String value) {
            addCriterion("exam_suite_name not like", value, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameIn(List<String> values) {
            addCriterion("exam_suite_name in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotIn(List<String> values) {
            addCriterion("exam_suite_name not in", values, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameBetween(String value1, String value2) {
            addCriterion("exam_suite_name between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameNotBetween(String value1, String value2) {
            addCriterion("exam_suite_name not between", value1, value2, "examSuiteName");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngIsNull() {
            addCriterion("exam_suite_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngIsNotNull() {
            addCriterion("exam_suite_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngEqualTo(String value) {
            addCriterion("exam_suite_name_eng =", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngNotEqualTo(String value) {
            addCriterion("exam_suite_name_eng <>", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngGreaterThan(String value) {
            addCriterion("exam_suite_name_eng >", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_name_eng >=", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngLessThan(String value) {
            addCriterion("exam_suite_name_eng <", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_name_eng <=", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngLike(String value) {
            addCriterion("exam_suite_name_eng like", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngNotLike(String value) {
            addCriterion("exam_suite_name_eng not like", value, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngIn(List<String> values) {
            addCriterion("exam_suite_name_eng in", values, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngNotIn(List<String> values) {
            addCriterion("exam_suite_name_eng not in", values, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngBetween(String value1, String value2) {
            addCriterion("exam_suite_name_eng between", value1, value2, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNameEngNotBetween(String value1, String value2) {
            addCriterion("exam_suite_name_eng not between", value1, value2, "examSuiteNameEng");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeIsNull() {
            addCriterion("exam_suite_code is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeIsNotNull() {
            addCriterion("exam_suite_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeEqualTo(String value) {
            addCriterion("exam_suite_code =", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeNotEqualTo(String value) {
            addCriterion("exam_suite_code <>", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeGreaterThan(String value) {
            addCriterion("exam_suite_code >", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_code >=", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeLessThan(String value) {
            addCriterion("exam_suite_code <", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_code <=", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeLike(String value) {
            addCriterion("exam_suite_code like", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeNotLike(String value) {
            addCriterion("exam_suite_code not like", value, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeIn(List<String> values) {
            addCriterion("exam_suite_code in", values, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeNotIn(List<String> values) {
            addCriterion("exam_suite_code not in", values, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeBetween(String value1, String value2) {
            addCriterion("exam_suite_code between", value1, value2, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCodeNotBetween(String value1, String value2) {
            addCriterion("exam_suite_code not between", value1, value2, "examSuiteCode");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIsNull() {
            addCriterion("exam_suite_price is null");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIsNotNull() {
            addCriterion("exam_suite_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price =", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price <>", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_price >", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price >=", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceLessThan(BigDecimal value) {
            addCriterion("exam_suite_price <", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_price <=", value, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceIn(List<BigDecimal> values) {
            addCriterion("exam_suite_price in", values, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_price not in", values, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_price between", value1, value2, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuitePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_price not between", value1, value2, "examSuitePrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIsNull() {
            addCriterion("exam_suite_discount_price is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIsNotNull() {
            addCriterion("exam_suite_discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price =", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price <>", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_discount_price >", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price >=", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceLessThan(BigDecimal value) {
            addCriterion("exam_suite_discount_price <", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_discount_price <=", value, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("exam_suite_discount_price in", values, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_discount_price not in", values, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_discount_price between", value1, value2, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_discount_price not between", value1, value2, "examSuiteDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceIsNull() {
            addCriterion("exam_suite_in_price is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceIsNotNull() {
            addCriterion("exam_suite_in_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceEqualTo(BigDecimal value) {
            addCriterion("exam_suite_in_price =", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_in_price <>", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_in_price >", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_in_price >=", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceLessThan(BigDecimal value) {
            addCriterion("exam_suite_in_price <", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_in_price <=", value, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceIn(List<BigDecimal> values) {
            addCriterion("exam_suite_in_price in", values, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_in_price not in", values, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_in_price between", value1, value2, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_in_price not between", value1, value2, "examSuiteInPrice");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleIsNull() {
            addCriterion("exam_suite_male is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleIsNotNull() {
            addCriterion("exam_suite_male is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleEqualTo(Integer value) {
            addCriterion("exam_suite_male =", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleNotEqualTo(Integer value) {
            addCriterion("exam_suite_male <>", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleGreaterThan(Integer value) {
            addCriterion("exam_suite_male >", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_male >=", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleLessThan(Integer value) {
            addCriterion("exam_suite_male <", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_male <=", value, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleIn(List<Integer> values) {
            addCriterion("exam_suite_male in", values, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleNotIn(List<Integer> values) {
            addCriterion("exam_suite_male not in", values, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_male between", value1, value2, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteMaleNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_male not between", value1, value2, "examSuiteMale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleIsNull() {
            addCriterion("exam_suite_female is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleIsNotNull() {
            addCriterion("exam_suite_female is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleEqualTo(Integer value) {
            addCriterion("exam_suite_female =", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleNotEqualTo(Integer value) {
            addCriterion("exam_suite_female <>", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleGreaterThan(Integer value) {
            addCriterion("exam_suite_female >", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_female >=", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleLessThan(Integer value) {
            addCriterion("exam_suite_female <", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_female <=", value, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleIn(List<Integer> values) {
            addCriterion("exam_suite_female in", values, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleNotIn(List<Integer> values) {
            addCriterion("exam_suite_female not in", values, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_female between", value1, value2, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteFemaleNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_female not between", value1, value2, "examSuiteFemale");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleIsNull() {
            addCriterion("exam_suite_warn_people is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleIsNotNull() {
            addCriterion("exam_suite_warn_people is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleEqualTo(Integer value) {
            addCriterion("exam_suite_warn_people =", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleNotEqualTo(Integer value) {
            addCriterion("exam_suite_warn_people <>", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleGreaterThan(Integer value) {
            addCriterion("exam_suite_warn_people >", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_warn_people >=", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleLessThan(Integer value) {
            addCriterion("exam_suite_warn_people <", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_warn_people <=", value, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleIn(List<Integer> values) {
            addCriterion("exam_suite_warn_people in", values, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleNotIn(List<Integer> values) {
            addCriterion("exam_suite_warn_people not in", values, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_warn_people between", value1, value2, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_warn_people not between", value1, value2, "examSuiteWarnPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleIsNull() {
            addCriterion("exam_suite_limit_people is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleIsNotNull() {
            addCriterion("exam_suite_limit_people is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleEqualTo(Integer value) {
            addCriterion("exam_suite_limit_people =", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleNotEqualTo(Integer value) {
            addCriterion("exam_suite_limit_people <>", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleGreaterThan(Integer value) {
            addCriterion("exam_suite_limit_people >", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_limit_people >=", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleLessThan(Integer value) {
            addCriterion("exam_suite_limit_people <", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_limit_people <=", value, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleIn(List<Integer> values) {
            addCriterion("exam_suite_limit_people in", values, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleNotIn(List<Integer> values) {
            addCriterion("exam_suite_limit_people not in", values, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_limit_people between", value1, value2, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_limit_people not between", value1, value2, "examSuiteLimitPeople");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountIsNull() {
            addCriterion("exam_suite_warn_amount is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountIsNotNull() {
            addCriterion("exam_suite_warn_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountEqualTo(BigDecimal value) {
            addCriterion("exam_suite_warn_amount =", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_warn_amount <>", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_warn_amount >", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_warn_amount >=", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountLessThan(BigDecimal value) {
            addCriterion("exam_suite_warn_amount <", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_warn_amount <=", value, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountIn(List<BigDecimal> values) {
            addCriterion("exam_suite_warn_amount in", values, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_warn_amount not in", values, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_warn_amount between", value1, value2, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteWarnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_warn_amount not between", value1, value2, "examSuiteWarnAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountIsNull() {
            addCriterion("exam_suite_limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountIsNotNull() {
            addCriterion("exam_suite_limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountEqualTo(BigDecimal value) {
            addCriterion("exam_suite_limit_amount =", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("exam_suite_limit_amount <>", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("exam_suite_limit_amount >", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_limit_amount >=", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountLessThan(BigDecimal value) {
            addCriterion("exam_suite_limit_amount <", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_suite_limit_amount <=", value, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountIn(List<BigDecimal> values) {
            addCriterion("exam_suite_limit_amount in", values, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("exam_suite_limit_amount not in", values, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_limit_amount between", value1, value2, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_suite_limit_amount not between", value1, value2, "examSuiteLimitAmount");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlIsNull() {
            addCriterion("exam_suite_img_url is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlIsNotNull() {
            addCriterion("exam_suite_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlEqualTo(String value) {
            addCriterion("exam_suite_img_url =", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlNotEqualTo(String value) {
            addCriterion("exam_suite_img_url <>", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlGreaterThan(String value) {
            addCriterion("exam_suite_img_url >", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_img_url >=", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlLessThan(String value) {
            addCriterion("exam_suite_img_url <", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_img_url <=", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlLike(String value) {
            addCriterion("exam_suite_img_url like", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlNotLike(String value) {
            addCriterion("exam_suite_img_url not like", value, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlIn(List<String> values) {
            addCriterion("exam_suite_img_url in", values, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlNotIn(List<String> values) {
            addCriterion("exam_suite_img_url not in", values, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlBetween(String value1, String value2) {
            addCriterion("exam_suite_img_url between", value1, value2, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteImgUrlNotBetween(String value1, String value2) {
            addCriterion("exam_suite_img_url not between", value1, value2, "examSuiteImgUrl");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeIsNull() {
            addCriterion("exam_suite_input_code is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeIsNotNull() {
            addCriterion("exam_suite_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeEqualTo(String value) {
            addCriterion("exam_suite_input_code =", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeNotEqualTo(String value) {
            addCriterion("exam_suite_input_code <>", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeGreaterThan(String value) {
            addCriterion("exam_suite_input_code >", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_input_code >=", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeLessThan(String value) {
            addCriterion("exam_suite_input_code <", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_input_code <=", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeLike(String value) {
            addCriterion("exam_suite_input_code like", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeNotLike(String value) {
            addCriterion("exam_suite_input_code not like", value, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeIn(List<String> values) {
            addCriterion("exam_suite_input_code in", values, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeNotIn(List<String> values) {
            addCriterion("exam_suite_input_code not in", values, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeBetween(String value1, String value2) {
            addCriterion("exam_suite_input_code between", value1, value2, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteInputCodeNotBetween(String value1, String value2) {
            addCriterion("exam_suite_input_code not between", value1, value2, "examSuiteInputCode");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderIsNull() {
            addCriterion("exam_suite_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderIsNotNull() {
            addCriterion("exam_suite_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderEqualTo(Integer value) {
            addCriterion("exam_suite_disp_order =", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderNotEqualTo(Integer value) {
            addCriterion("exam_suite_disp_order <>", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderGreaterThan(Integer value) {
            addCriterion("exam_suite_disp_order >", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_disp_order >=", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderLessThan(Integer value) {
            addCriterion("exam_suite_disp_order <", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_disp_order <=", value, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderIn(List<Integer> values) {
            addCriterion("exam_suite_disp_order in", values, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderNotIn(List<Integer> values) {
            addCriterion("exam_suite_disp_order not in", values, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_disp_order between", value1, value2, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_disp_order not between", value1, value2, "examSuiteDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteIsNull() {
            addCriterion("exam_suite_note is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteIsNotNull() {
            addCriterion("exam_suite_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteEqualTo(String value) {
            addCriterion("exam_suite_note =", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteNotEqualTo(String value) {
            addCriterion("exam_suite_note <>", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteGreaterThan(String value) {
            addCriterion("exam_suite_note >", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_note >=", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteLessThan(String value) {
            addCriterion("exam_suite_note <", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_note <=", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteLike(String value) {
            addCriterion("exam_suite_note like", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteNotLike(String value) {
            addCriterion("exam_suite_note not like", value, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteIn(List<String> values) {
            addCriterion("exam_suite_note in", values, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteNotIn(List<String> values) {
            addCriterion("exam_suite_note not in", values, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteBetween(String value1, String value2) {
            addCriterion("exam_suite_note between", value1, value2, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteNoteNotBetween(String value1, String value2) {
            addCriterion("exam_suite_note not between", value1, value2, "examSuiteNote");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusIsNull() {
            addCriterion("exam_suite_status is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusIsNotNull() {
            addCriterion("exam_suite_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusEqualTo(Integer value) {
            addCriterion("exam_suite_status =", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusNotEqualTo(Integer value) {
            addCriterion("exam_suite_status <>", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusGreaterThan(Integer value) {
            addCriterion("exam_suite_status >", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_status >=", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusLessThan(Integer value) {
            addCriterion("exam_suite_status <", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_suite_status <=", value, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusIn(List<Integer> values) {
            addCriterion("exam_suite_status in", values, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusNotIn(List<Integer> values) {
            addCriterion("exam_suite_status not in", values, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_status between", value1, value2, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_suite_status not between", value1, value2, "examSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeIsNull() {
            addCriterion("exam_suite_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeIsNotNull() {
            addCriterion("exam_suite_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeEqualTo(Date value) {
            addCriterion("exam_suite_create_time =", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_suite_create_time <>", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeGreaterThan(Date value) {
            addCriterion("exam_suite_create_time >", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_suite_create_time >=", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeLessThan(Date value) {
            addCriterion("exam_suite_create_time <", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_suite_create_time <=", value, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeIn(List<Date> values) {
            addCriterion("exam_suite_create_time in", values, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_suite_create_time not in", values, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_suite_create_time between", value1, value2, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_suite_create_time not between", value1, value2, "examSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeIsNull() {
            addCriterion("exam_suite_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeIsNotNull() {
            addCriterion("exam_suite_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeEqualTo(Date value) {
            addCriterion("exam_suite_edit_time =", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeNotEqualTo(Date value) {
            addCriterion("exam_suite_edit_time <>", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeGreaterThan(Date value) {
            addCriterion("exam_suite_edit_time >", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_suite_edit_time >=", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeLessThan(Date value) {
            addCriterion("exam_suite_edit_time <", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_suite_edit_time <=", value, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeIn(List<Date> values) {
            addCriterion("exam_suite_edit_time in", values, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeNotIn(List<Date> values) {
            addCriterion("exam_suite_edit_time not in", values, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_suite_edit_time between", value1, value2, "examSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andExamSuiteEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_suite_edit_time not between", value1, value2, "examSuiteEditTime");
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