package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictpaywayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictpaywayExample() {
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

        public Criteria andIdPaywayIsNull() {
            addCriterion("ID_PayWay is null");
            return (Criteria) this;
        }

        public Criteria andIdPaywayIsNotNull() {
            addCriterion("ID_PayWay is not null");
            return (Criteria) this;
        }

        public Criteria andIdPaywayEqualTo(Long value) {
            addCriterion("ID_PayWay =", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayNotEqualTo(Long value) {
            addCriterion("ID_PayWay <>", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayGreaterThan(Long value) {
            addCriterion("ID_PayWay >", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_PayWay >=", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayLessThan(Long value) {
            addCriterion("ID_PayWay <", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayLessThanOrEqualTo(Long value) {
            addCriterion("ID_PayWay <=", value, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayIn(List<Long> values) {
            addCriterion("ID_PayWay in", values, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayNotIn(List<Long> values) {
            addCriterion("ID_PayWay not in", values, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayBetween(Long value1, Long value2) {
            addCriterion("ID_PayWay between", value1, value2, "idPayway");
            return (Criteria) this;
        }

        public Criteria andIdPaywayNotBetween(Long value1, Long value2) {
            addCriterion("ID_PayWay not between", value1, value2, "idPayway");
            return (Criteria) this;
        }

        public Criteria andPaywayNameIsNull() {
            addCriterion("PayWay_Name is null");
            return (Criteria) this;
        }

        public Criteria andPaywayNameIsNotNull() {
            addCriterion("PayWay_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayNameEqualTo(String value) {
            addCriterion("PayWay_Name =", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameNotEqualTo(String value) {
            addCriterion("PayWay_Name <>", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameGreaterThan(String value) {
            addCriterion("PayWay_Name >", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameGreaterThanOrEqualTo(String value) {
            addCriterion("PayWay_Name >=", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameLessThan(String value) {
            addCriterion("PayWay_Name <", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameLessThanOrEqualTo(String value) {
            addCriterion("PayWay_Name <=", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameLike(String value) {
            addCriterion("PayWay_Name like", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameNotLike(String value) {
            addCriterion("PayWay_Name not like", value, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameIn(List<String> values) {
            addCriterion("PayWay_Name in", values, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameNotIn(List<String> values) {
            addCriterion("PayWay_Name not in", values, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameBetween(String value1, String value2) {
            addCriterion("PayWay_Name between", value1, value2, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayNameNotBetween(String value1, String value2) {
            addCriterion("PayWay_Name not between", value1, value2, "paywayName");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeIsNull() {
            addCriterion("PayWay_Code is null");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeIsNotNull() {
            addCriterion("PayWay_Code is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeEqualTo(String value) {
            addCriterion("PayWay_Code =", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeNotEqualTo(String value) {
            addCriterion("PayWay_Code <>", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeGreaterThan(String value) {
            addCriterion("PayWay_Code >", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PayWay_Code >=", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeLessThan(String value) {
            addCriterion("PayWay_Code <", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeLessThanOrEqualTo(String value) {
            addCriterion("PayWay_Code <=", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeLike(String value) {
            addCriterion("PayWay_Code like", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeNotLike(String value) {
            addCriterion("PayWay_Code not like", value, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeIn(List<String> values) {
            addCriterion("PayWay_Code in", values, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeNotIn(List<String> values) {
            addCriterion("PayWay_Code not in", values, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeBetween(String value1, String value2) {
            addCriterion("PayWay_Code between", value1, value2, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andPaywayCodeNotBetween(String value1, String value2) {
            addCriterion("PayWay_Code not between", value1, value2, "paywayCode");
            return (Criteria) this;
        }

        public Criteria andKeypaywayIsNull() {
            addCriterion("KeyPayWay is null");
            return (Criteria) this;
        }

        public Criteria andKeypaywayIsNotNull() {
            addCriterion("KeyPayWay is not null");
            return (Criteria) this;
        }

        public Criteria andKeypaywayEqualTo(String value) {
            addCriterion("KeyPayWay =", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayNotEqualTo(String value) {
            addCriterion("KeyPayWay <>", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayGreaterThan(String value) {
            addCriterion("KeyPayWay >", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayGreaterThanOrEqualTo(String value) {
            addCriterion("KeyPayWay >=", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayLessThan(String value) {
            addCriterion("KeyPayWay <", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayLessThanOrEqualTo(String value) {
            addCriterion("KeyPayWay <=", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayLike(String value) {
            addCriterion("KeyPayWay like", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayNotLike(String value) {
            addCriterion("KeyPayWay not like", value, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayIn(List<String> values) {
            addCriterion("KeyPayWay in", values, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayNotIn(List<String> values) {
            addCriterion("KeyPayWay not in", values, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayBetween(String value1, String value2) {
            addCriterion("KeyPayWay between", value1, value2, "keypayway");
            return (Criteria) this;
        }

        public Criteria andKeypaywayNotBetween(String value1, String value2) {
            addCriterion("KeyPayWay not between", value1, value2, "keypayway");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexIsNull() {
            addCriterion("PayWayCodeX is null");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexIsNotNull() {
            addCriterion("PayWayCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexEqualTo(String value) {
            addCriterion("PayWayCodeX =", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexNotEqualTo(String value) {
            addCriterion("PayWayCodeX <>", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexGreaterThan(String value) {
            addCriterion("PayWayCodeX >", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexGreaterThanOrEqualTo(String value) {
            addCriterion("PayWayCodeX >=", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexLessThan(String value) {
            addCriterion("PayWayCodeX <", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexLessThanOrEqualTo(String value) {
            addCriterion("PayWayCodeX <=", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexLike(String value) {
            addCriterion("PayWayCodeX like", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexNotLike(String value) {
            addCriterion("PayWayCodeX not like", value, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexIn(List<String> values) {
            addCriterion("PayWayCodeX in", values, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexNotIn(List<String> values) {
            addCriterion("PayWayCodeX not in", values, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexBetween(String value1, String value2) {
            addCriterion("PayWayCodeX between", value1, value2, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andPaywaycodexNotBetween(String value1, String value2) {
            addCriterion("PayWayCodeX not between", value1, value2, "paywaycodex");
            return (Criteria) this;
        }

        public Criteria andFIscashIsNull() {
            addCriterion("F_IsCash is null");
            return (Criteria) this;
        }

        public Criteria andFIscashIsNotNull() {
            addCriterion("F_IsCash is not null");
            return (Criteria) this;
        }

        public Criteria andFIscashEqualTo(Integer value) {
            addCriterion("F_IsCash =", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashNotEqualTo(Integer value) {
            addCriterion("F_IsCash <>", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashGreaterThan(Integer value) {
            addCriterion("F_IsCash >", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_IsCash >=", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashLessThan(Integer value) {
            addCriterion("F_IsCash <", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashLessThanOrEqualTo(Integer value) {
            addCriterion("F_IsCash <=", value, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashIn(List<Integer> values) {
            addCriterion("F_IsCash in", values, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashNotIn(List<Integer> values) {
            addCriterion("F_IsCash not in", values, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashBetween(Integer value1, Integer value2) {
            addCriterion("F_IsCash between", value1, value2, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIscashNotBetween(Integer value1, Integer value2) {
            addCriterion("F_IsCash not between", value1, value2, "fIscash");
            return (Criteria) this;
        }

        public Criteria andFIsofflineIsNull() {
            addCriterion("F_IsOffLine is null");
            return (Criteria) this;
        }

        public Criteria andFIsofflineIsNotNull() {
            addCriterion("F_IsOffLine is not null");
            return (Criteria) this;
        }

        public Criteria andFIsofflineEqualTo(Integer value) {
            addCriterion("F_IsOffLine =", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineNotEqualTo(Integer value) {
            addCriterion("F_IsOffLine <>", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineGreaterThan(Integer value) {
            addCriterion("F_IsOffLine >", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_IsOffLine >=", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineLessThan(Integer value) {
            addCriterion("F_IsOffLine <", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineLessThanOrEqualTo(Integer value) {
            addCriterion("F_IsOffLine <=", value, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineIn(List<Integer> values) {
            addCriterion("F_IsOffLine in", values, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineNotIn(List<Integer> values) {
            addCriterion("F_IsOffLine not in", values, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineBetween(Integer value1, Integer value2) {
            addCriterion("F_IsOffLine between", value1, value2, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFIsofflineNotBetween(Integer value1, Integer value2) {
            addCriterion("F_IsOffLine not between", value1, value2, "fIsoffline");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyIsNull() {
            addCriterion("F_ApplyToAccountOnly is null");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyIsNotNull() {
            addCriterion("F_ApplyToAccountOnly is not null");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyEqualTo(Integer value) {
            addCriterion("F_ApplyToAccountOnly =", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyNotEqualTo(Integer value) {
            addCriterion("F_ApplyToAccountOnly <>", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyGreaterThan(Integer value) {
            addCriterion("F_ApplyToAccountOnly >", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyToAccountOnly >=", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyLessThan(Integer value) {
            addCriterion("F_ApplyToAccountOnly <", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyLessThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyToAccountOnly <=", value, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyIn(List<Integer> values) {
            addCriterion("F_ApplyToAccountOnly in", values, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyNotIn(List<Integer> values) {
            addCriterion("F_ApplyToAccountOnly not in", values, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyToAccountOnly between", value1, value2, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoaccountonlyNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyToAccountOnly not between", value1, value2, "fApplytoaccountonly");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpIsNull() {
            addCriterion("F_ApplyTo_Outp is null");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpIsNotNull() {
            addCriterion("F_ApplyTo_Outp is not null");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Outp =", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpNotEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Outp <>", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpGreaterThan(Integer value) {
            addCriterion("F_ApplyTo_Outp >", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Outp >=", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpLessThan(Integer value) {
            addCriterion("F_ApplyTo_Outp <", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpLessThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Outp <=", value, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Outp in", values, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpNotIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Outp not in", values, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Outp between", value1, value2, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOutpNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Outp not between", value1, value2, "fApplytoOutp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpIsNull() {
            addCriterion("F_ApplyTo_Inp is null");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpIsNotNull() {
            addCriterion("F_ApplyTo_Inp is not null");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Inp =", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpNotEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Inp <>", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpGreaterThan(Integer value) {
            addCriterion("F_ApplyTo_Inp >", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Inp >=", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpLessThan(Integer value) {
            addCriterion("F_ApplyTo_Inp <", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpLessThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Inp <=", value, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Inp in", values, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpNotIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Inp not in", values, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Inp between", value1, value2, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoInpNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Inp not between", value1, value2, "fApplytoInp");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgIsNull() {
            addCriterion("F_ApplyTo_Org is null");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgIsNotNull() {
            addCriterion("F_ApplyTo_Org is not null");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Org =", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgNotEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Org <>", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgGreaterThan(Integer value) {
            addCriterion("F_ApplyTo_Org >", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Org >=", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgLessThan(Integer value) {
            addCriterion("F_ApplyTo_Org <", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgLessThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Org <=", value, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Org in", values, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgNotIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Org not in", values, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Org between", value1, value2, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Org not between", value1, value2, "fApplytoOrg");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonIsNull() {
            addCriterion("F_ApplyTo_Person is null");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonIsNotNull() {
            addCriterion("F_ApplyTo_Person is not null");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Person =", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonNotEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Person <>", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonGreaterThan(Integer value) {
            addCriterion("F_ApplyTo_Person >", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Person >=", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonLessThan(Integer value) {
            addCriterion("F_ApplyTo_Person <", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonLessThanOrEqualTo(Integer value) {
            addCriterion("F_ApplyTo_Person <=", value, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Person in", values, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonNotIn(List<Integer> values) {
            addCriterion("F_ApplyTo_Person not in", values, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Person between", value1, value2, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFApplytoPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ApplyTo_Person not between", value1, value2, "fApplytoPerson");
            return (Criteria) this;
        }

        public Criteria andFReturntocashIsNull() {
            addCriterion("F_ReturnToCash is null");
            return (Criteria) this;
        }

        public Criteria andFReturntocashIsNotNull() {
            addCriterion("F_ReturnToCash is not null");
            return (Criteria) this;
        }

        public Criteria andFReturntocashEqualTo(Integer value) {
            addCriterion("F_ReturnToCash =", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashNotEqualTo(Integer value) {
            addCriterion("F_ReturnToCash <>", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashGreaterThan(Integer value) {
            addCriterion("F_ReturnToCash >", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ReturnToCash >=", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashLessThan(Integer value) {
            addCriterion("F_ReturnToCash <", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashLessThanOrEqualTo(Integer value) {
            addCriterion("F_ReturnToCash <=", value, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashIn(List<Integer> values) {
            addCriterion("F_ReturnToCash in", values, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashNotIn(List<Integer> values) {
            addCriterion("F_ReturnToCash not in", values, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashBetween(Integer value1, Integer value2) {
            addCriterion("F_ReturnToCash between", value1, value2, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFReturntocashNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ReturnToCash not between", value1, value2, "fReturntocash");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIsNull() {
            addCriterion("F_BuiltIn is null");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIsNotNull() {
            addCriterion("F_BuiltIn is not null");
            return (Criteria) this;
        }

        public Criteria andFBuiltinEqualTo(Integer value) {
            addCriterion("F_BuiltIn =", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotEqualTo(Integer value) {
            addCriterion("F_BuiltIn <>", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThan(Integer value) {
            addCriterion("F_BuiltIn >", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_BuiltIn >=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThan(Integer value) {
            addCriterion("F_BuiltIn <", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThanOrEqualTo(Integer value) {
            addCriterion("F_BuiltIn <=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIn(List<Integer> values) {
            addCriterion("F_BuiltIn in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotIn(List<Integer> values) {
            addCriterion("F_BuiltIn not in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinBetween(Integer value1, Integer value2) {
            addCriterion("F_BuiltIn between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotBetween(Integer value1, Integer value2) {
            addCriterion("F_BuiltIn not between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFDisabledIsNull() {
            addCriterion("F_Disabled is null");
            return (Criteria) this;
        }

        public Criteria andFDisabledIsNotNull() {
            addCriterion("F_Disabled is not null");
            return (Criteria) this;
        }

        public Criteria andFDisabledEqualTo(Integer value) {
            addCriterion("F_Disabled =", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledNotEqualTo(Integer value) {
            addCriterion("F_Disabled <>", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledGreaterThan(Integer value) {
            addCriterion("F_Disabled >", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_Disabled >=", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledLessThan(Integer value) {
            addCriterion("F_Disabled <", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("F_Disabled <=", value, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledIn(List<Integer> values) {
            addCriterion("F_Disabled in", values, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledNotIn(List<Integer> values) {
            addCriterion("F_Disabled not in", values, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledBetween(Integer value1, Integer value2) {
            addCriterion("F_Disabled between", value1, value2, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andFDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("F_Disabled not between", value1, value2, "fDisabled");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNull() {
            addCriterion("Input_Code is null");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNotNull() {
            addCriterion("Input_Code is not null");
            return (Criteria) this;
        }

        public Criteria andInputCodeEqualTo(String value) {
            addCriterion("Input_Code =", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotEqualTo(String value) {
            addCriterion("Input_Code <>", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThan(String value) {
            addCriterion("Input_Code >", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Input_Code >=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThan(String value) {
            addCriterion("Input_Code <", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThanOrEqualTo(String value) {
            addCriterion("Input_Code <=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLike(String value) {
            addCriterion("Input_Code like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotLike(String value) {
            addCriterion("Input_Code not like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIn(List<String> values) {
            addCriterion("Input_Code in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotIn(List<String> values) {
            addCriterion("Input_Code not in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeBetween(String value1, String value2) {
            addCriterion("Input_Code between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotBetween(String value1, String value2) {
            addCriterion("Input_Code not between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgIsNull() {
            addCriterion("ID_ReceiptType_Org is null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgIsNotNull() {
            addCriterion("ID_ReceiptType_Org is not null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Org =", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgNotEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Org <>", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgGreaterThan(Integer value) {
            addCriterion("ID_ReceiptType_Org >", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Org >=", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgLessThan(Integer value) {
            addCriterion("ID_ReceiptType_Org <", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Org <=", value, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgIn(List<Integer> values) {
            addCriterion("ID_ReceiptType_Org in", values, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgNotIn(List<Integer> values) {
            addCriterion("ID_ReceiptType_Org not in", values, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgBetween(Integer value1, Integer value2) {
            addCriterion("ID_ReceiptType_Org between", value1, value2, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ReceiptType_Org not between", value1, value2, "idReceipttypeOrg");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonIsNull() {
            addCriterion("ID_ReceiptType_Person is null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonIsNotNull() {
            addCriterion("ID_ReceiptType_Person is not null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Person =", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonNotEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Person <>", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonGreaterThan(Integer value) {
            addCriterion("ID_ReceiptType_Person >", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Person >=", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonLessThan(Integer value) {
            addCriterion("ID_ReceiptType_Person <", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ReceiptType_Person <=", value, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonIn(List<Integer> values) {
            addCriterion("ID_ReceiptType_Person in", values, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonNotIn(List<Integer> values) {
            addCriterion("ID_ReceiptType_Person not in", values, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonBetween(Integer value1, Integer value2) {
            addCriterion("ID_ReceiptType_Person between", value1, value2, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ReceiptType_Person not between", value1, value2, "idReceipttypePerson");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
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