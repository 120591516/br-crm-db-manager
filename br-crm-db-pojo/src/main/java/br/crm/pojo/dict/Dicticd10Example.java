package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dicticd10Example implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Dicticd10Example() {
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

        public Criteria andDicticd10IdIsNull() {
            addCriterion("DictICD10_ID is null");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdIsNotNull() {
            addCriterion("DictICD10_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdEqualTo(Long value) {
            addCriterion("DictICD10_ID =", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdNotEqualTo(Long value) {
            addCriterion("DictICD10_ID <>", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdGreaterThan(Long value) {
            addCriterion("DictICD10_ID >", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdGreaterThanOrEqualTo(Long value) {
            addCriterion("DictICD10_ID >=", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdLessThan(Long value) {
            addCriterion("DictICD10_ID <", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdLessThanOrEqualTo(Long value) {
            addCriterion("DictICD10_ID <=", value, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdIn(List<Long> values) {
            addCriterion("DictICD10_ID in", values, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdNotIn(List<Long> values) {
            addCriterion("DictICD10_ID not in", values, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdBetween(Long value1, Long value2) {
            addCriterion("DictICD10_ID between", value1, value2, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andDicticd10IdNotBetween(Long value1, Long value2) {
            addCriterion("DictICD10_ID not between", value1, value2, "dicticd10Id");
            return (Criteria) this;
        }

        public Criteria andIdtodepartIsNull() {
            addCriterion("idtodepart is null");
            return (Criteria) this;
        }

        public Criteria andIdtodepartIsNotNull() {
            addCriterion("idtodepart is not null");
            return (Criteria) this;
        }

        public Criteria andIdtodepartEqualTo(String value) {
            addCriterion("idtodepart =", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartNotEqualTo(String value) {
            addCriterion("idtodepart <>", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartGreaterThan(String value) {
            addCriterion("idtodepart >", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartGreaterThanOrEqualTo(String value) {
            addCriterion("idtodepart >=", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartLessThan(String value) {
            addCriterion("idtodepart <", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartLessThanOrEqualTo(String value) {
            addCriterion("idtodepart <=", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartLike(String value) {
            addCriterion("idtodepart like", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartNotLike(String value) {
            addCriterion("idtodepart not like", value, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartIn(List<String> values) {
            addCriterion("idtodepart in", values, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartNotIn(List<String> values) {
            addCriterion("idtodepart not in", values, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartBetween(String value1, String value2) {
            addCriterion("idtodepart between", value1, value2, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdtodepartNotBetween(String value1, String value2) {
            addCriterion("idtodepart not between", value1, value2, "idtodepart");
            return (Criteria) this;
        }

        public Criteria andIdupdateIsNull() {
            addCriterion("idupdate is null");
            return (Criteria) this;
        }

        public Criteria andIdupdateIsNotNull() {
            addCriterion("idupdate is not null");
            return (Criteria) this;
        }

        public Criteria andIdupdateEqualTo(String value) {
            addCriterion("idupdate =", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateNotEqualTo(String value) {
            addCriterion("idupdate <>", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateGreaterThan(String value) {
            addCriterion("idupdate >", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateGreaterThanOrEqualTo(String value) {
            addCriterion("idupdate >=", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateLessThan(String value) {
            addCriterion("idupdate <", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateLessThanOrEqualTo(String value) {
            addCriterion("idupdate <=", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateLike(String value) {
            addCriterion("idupdate like", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateNotLike(String value) {
            addCriterion("idupdate not like", value, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateIn(List<String> values) {
            addCriterion("idupdate in", values, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateNotIn(List<String> values) {
            addCriterion("idupdate not in", values, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateBetween(String value1, String value2) {
            addCriterion("idupdate between", value1, value2, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIdupdateNotBetween(String value1, String value2) {
            addCriterion("idupdate not between", value1, value2, "idupdate");
            return (Criteria) this;
        }

        public Criteria andIcdclassIsNull() {
            addCriterion("icdclass is null");
            return (Criteria) this;
        }

        public Criteria andIcdclassIsNotNull() {
            addCriterion("icdclass is not null");
            return (Criteria) this;
        }

        public Criteria andIcdclassEqualTo(String value) {
            addCriterion("icdclass =", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassNotEqualTo(String value) {
            addCriterion("icdclass <>", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassGreaterThan(String value) {
            addCriterion("icdclass >", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassGreaterThanOrEqualTo(String value) {
            addCriterion("icdclass >=", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassLessThan(String value) {
            addCriterion("icdclass <", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassLessThanOrEqualTo(String value) {
            addCriterion("icdclass <=", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassLike(String value) {
            addCriterion("icdclass like", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassNotLike(String value) {
            addCriterion("icdclass not like", value, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassIn(List<String> values) {
            addCriterion("icdclass in", values, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassNotIn(List<String> values) {
            addCriterion("icdclass not in", values, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassBetween(String value1, String value2) {
            addCriterion("icdclass between", value1, value2, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdclassNotBetween(String value1, String value2) {
            addCriterion("icdclass not between", value1, value2, "icdclass");
            return (Criteria) this;
        }

        public Criteria andIcdcodeIsNull() {
            addCriterion("icdcode is null");
            return (Criteria) this;
        }

        public Criteria andIcdcodeIsNotNull() {
            addCriterion("icdcode is not null");
            return (Criteria) this;
        }

        public Criteria andIcdcodeEqualTo(String value) {
            addCriterion("icdcode =", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeNotEqualTo(String value) {
            addCriterion("icdcode <>", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeGreaterThan(String value) {
            addCriterion("icdcode >", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("icdcode >=", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeLessThan(String value) {
            addCriterion("icdcode <", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeLessThanOrEqualTo(String value) {
            addCriterion("icdcode <=", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeLike(String value) {
            addCriterion("icdcode like", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeNotLike(String value) {
            addCriterion("icdcode not like", value, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeIn(List<String> values) {
            addCriterion("icdcode in", values, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeNotIn(List<String> values) {
            addCriterion("icdcode not in", values, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeBetween(String value1, String value2) {
            addCriterion("icdcode between", value1, value2, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeNotBetween(String value1, String value2) {
            addCriterion("icdcode not between", value1, value2, "icdcode");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaIsNull() {
            addCriterion("icdcodea is null");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaIsNotNull() {
            addCriterion("icdcodea is not null");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaEqualTo(String value) {
            addCriterion("icdcodea =", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaNotEqualTo(String value) {
            addCriterion("icdcodea <>", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaGreaterThan(String value) {
            addCriterion("icdcodea >", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaGreaterThanOrEqualTo(String value) {
            addCriterion("icdcodea >=", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaLessThan(String value) {
            addCriterion("icdcodea <", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaLessThanOrEqualTo(String value) {
            addCriterion("icdcodea <=", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaLike(String value) {
            addCriterion("icdcodea like", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaNotLike(String value) {
            addCriterion("icdcodea not like", value, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaIn(List<String> values) {
            addCriterion("icdcodea in", values, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaNotIn(List<String> values) {
            addCriterion("icdcodea not in", values, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaBetween(String value1, String value2) {
            addCriterion("icdcodea between", value1, value2, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcodeaNotBetween(String value1, String value2) {
            addCriterion("icdcodea not between", value1, value2, "icdcodea");
            return (Criteria) this;
        }

        public Criteria andIcdcnameIsNull() {
            addCriterion("icdcname is null");
            return (Criteria) this;
        }

        public Criteria andIcdcnameIsNotNull() {
            addCriterion("icdcname is not null");
            return (Criteria) this;
        }

        public Criteria andIcdcnameEqualTo(String value) {
            addCriterion("icdcname =", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameNotEqualTo(String value) {
            addCriterion("icdcname <>", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameGreaterThan(String value) {
            addCriterion("icdcname >", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameGreaterThanOrEqualTo(String value) {
            addCriterion("icdcname >=", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameLessThan(String value) {
            addCriterion("icdcname <", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameLessThanOrEqualTo(String value) {
            addCriterion("icdcname <=", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameLike(String value) {
            addCriterion("icdcname like", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameNotLike(String value) {
            addCriterion("icdcname not like", value, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameIn(List<String> values) {
            addCriterion("icdcname in", values, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameNotIn(List<String> values) {
            addCriterion("icdcname not in", values, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameBetween(String value1, String value2) {
            addCriterion("icdcname between", value1, value2, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdcnameNotBetween(String value1, String value2) {
            addCriterion("icdcname not between", value1, value2, "icdcname");
            return (Criteria) this;
        }

        public Criteria andIcdenameIsNull() {
            addCriterion("icdename is null");
            return (Criteria) this;
        }

        public Criteria andIcdenameIsNotNull() {
            addCriterion("icdename is not null");
            return (Criteria) this;
        }

        public Criteria andIcdenameEqualTo(String value) {
            addCriterion("icdename =", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameNotEqualTo(String value) {
            addCriterion("icdename <>", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameGreaterThan(String value) {
            addCriterion("icdename >", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameGreaterThanOrEqualTo(String value) {
            addCriterion("icdename >=", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameLessThan(String value) {
            addCriterion("icdename <", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameLessThanOrEqualTo(String value) {
            addCriterion("icdename <=", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameLike(String value) {
            addCriterion("icdename like", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameNotLike(String value) {
            addCriterion("icdename not like", value, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameIn(List<String> values) {
            addCriterion("icdename in", values, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameNotIn(List<String> values) {
            addCriterion("icdename not in", values, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameBetween(String value1, String value2) {
            addCriterion("icdename between", value1, value2, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdenameNotBetween(String value1, String value2) {
            addCriterion("icdename not between", value1, value2, "icdename");
            return (Criteria) this;
        }

        public Criteria andIcdpytIsNull() {
            addCriterion("icdpyt is null");
            return (Criteria) this;
        }

        public Criteria andIcdpytIsNotNull() {
            addCriterion("icdpyt is not null");
            return (Criteria) this;
        }

        public Criteria andIcdpytEqualTo(String value) {
            addCriterion("icdpyt =", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytNotEqualTo(String value) {
            addCriterion("icdpyt <>", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytGreaterThan(String value) {
            addCriterion("icdpyt >", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytGreaterThanOrEqualTo(String value) {
            addCriterion("icdpyt >=", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytLessThan(String value) {
            addCriterion("icdpyt <", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytLessThanOrEqualTo(String value) {
            addCriterion("icdpyt <=", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytLike(String value) {
            addCriterion("icdpyt like", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytNotLike(String value) {
            addCriterion("icdpyt not like", value, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytIn(List<String> values) {
            addCriterion("icdpyt in", values, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytNotIn(List<String> values) {
            addCriterion("icdpyt not in", values, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytBetween(String value1, String value2) {
            addCriterion("icdpyt between", value1, value2, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdpytNotBetween(String value1, String value2) {
            addCriterion("icdpyt not between", value1, value2, "icdpyt");
            return (Criteria) this;
        }

        public Criteria andIcdotherIsNull() {
            addCriterion("icdother is null");
            return (Criteria) this;
        }

        public Criteria andIcdotherIsNotNull() {
            addCriterion("icdother is not null");
            return (Criteria) this;
        }

        public Criteria andIcdotherEqualTo(String value) {
            addCriterion("icdother =", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherNotEqualTo(String value) {
            addCriterion("icdother <>", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherGreaterThan(String value) {
            addCriterion("icdother >", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherGreaterThanOrEqualTo(String value) {
            addCriterion("icdother >=", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherLessThan(String value) {
            addCriterion("icdother <", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherLessThanOrEqualTo(String value) {
            addCriterion("icdother <=", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherLike(String value) {
            addCriterion("icdother like", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherNotLike(String value) {
            addCriterion("icdother not like", value, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherIn(List<String> values) {
            addCriterion("icdother in", values, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherNotIn(List<String> values) {
            addCriterion("icdother not in", values, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherBetween(String value1, String value2) {
            addCriterion("icdother between", value1, value2, "icdother");
            return (Criteria) this;
        }

        public Criteria andIcdotherNotBetween(String value1, String value2) {
            addCriterion("icdother not between", value1, value2, "icdother");
            return (Criteria) this;
        }

        public Criteria andUpdateoperIsNull() {
            addCriterion("updateoper is null");
            return (Criteria) this;
        }

        public Criteria andUpdateoperIsNotNull() {
            addCriterion("updateoper is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateoperEqualTo(String value) {
            addCriterion("updateoper =", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperNotEqualTo(String value) {
            addCriterion("updateoper <>", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperGreaterThan(String value) {
            addCriterion("updateoper >", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperGreaterThanOrEqualTo(String value) {
            addCriterion("updateoper >=", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperLessThan(String value) {
            addCriterion("updateoper <", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperLessThanOrEqualTo(String value) {
            addCriterion("updateoper <=", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperLike(String value) {
            addCriterion("updateoper like", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperNotLike(String value) {
            addCriterion("updateoper not like", value, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperIn(List<String> values) {
            addCriterion("updateoper in", values, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperNotIn(List<String> values) {
            addCriterion("updateoper not in", values, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperBetween(String value1, String value2) {
            addCriterion("updateoper between", value1, value2, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdateoperNotBetween(String value1, String value2) {
            addCriterion("updateoper not between", value1, value2, "updateoper");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIcdnoteIsNull() {
            addCriterion("icdnote is null");
            return (Criteria) this;
        }

        public Criteria andIcdnoteIsNotNull() {
            addCriterion("icdnote is not null");
            return (Criteria) this;
        }

        public Criteria andIcdnoteEqualTo(String value) {
            addCriterion("icdnote =", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteNotEqualTo(String value) {
            addCriterion("icdnote <>", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteGreaterThan(String value) {
            addCriterion("icdnote >", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteGreaterThanOrEqualTo(String value) {
            addCriterion("icdnote >=", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteLessThan(String value) {
            addCriterion("icdnote <", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteLessThanOrEqualTo(String value) {
            addCriterion("icdnote <=", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteLike(String value) {
            addCriterion("icdnote like", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteNotLike(String value) {
            addCriterion("icdnote not like", value, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteIn(List<String> values) {
            addCriterion("icdnote in", values, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteNotIn(List<String> values) {
            addCriterion("icdnote not in", values, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteBetween(String value1, String value2) {
            addCriterion("icdnote between", value1, value2, "icdnote");
            return (Criteria) this;
        }

        public Criteria andIcdnoteNotBetween(String value1, String value2) {
            addCriterion("icdnote not between", value1, value2, "icdnote");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
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

        public Criteria andDicticd10CreatetimeIsNull() {
            addCriterion("DictICD10_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeIsNotNull() {
            addCriterion("DictICD10_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeEqualTo(Date value) {
            addCriterion("DictICD10_createtime =", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeNotEqualTo(Date value) {
            addCriterion("DictICD10_createtime <>", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeGreaterThan(Date value) {
            addCriterion("DictICD10_createtime >", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DictICD10_createtime >=", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeLessThan(Date value) {
            addCriterion("DictICD10_createtime <", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DictICD10_createtime <=", value, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeIn(List<Date> values) {
            addCriterion("DictICD10_createtime in", values, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeNotIn(List<Date> values) {
            addCriterion("DictICD10_createtime not in", values, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeBetween(Date value1, Date value2) {
            addCriterion("DictICD10_createtime between", value1, value2, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10CreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DictICD10_createtime not between", value1, value2, "dicticd10Createtime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeIsNull() {
            addCriterion("DictICD10_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeIsNotNull() {
            addCriterion("DictICD10_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeEqualTo(Date value) {
            addCriterion("DictICD10_updatetime =", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeNotEqualTo(Date value) {
            addCriterion("DictICD10_updatetime <>", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeGreaterThan(Date value) {
            addCriterion("DictICD10_updatetime >", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DictICD10_updatetime >=", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeLessThan(Date value) {
            addCriterion("DictICD10_updatetime <", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DictICD10_updatetime <=", value, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeIn(List<Date> values) {
            addCriterion("DictICD10_updatetime in", values, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeNotIn(List<Date> values) {
            addCriterion("DictICD10_updatetime not in", values, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeBetween(Date value1, Date value2) {
            addCriterion("DictICD10_updatetime between", value1, value2, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10UpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DictICD10_updatetime not between", value1, value2, "dicticd10Updatetime");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusIsNull() {
            addCriterion("DictICD10_Status is null");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusIsNotNull() {
            addCriterion("DictICD10_Status is not null");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusEqualTo(Integer value) {
            addCriterion("DictICD10_Status =", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusNotEqualTo(Integer value) {
            addCriterion("DictICD10_Status <>", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusGreaterThan(Integer value) {
            addCriterion("DictICD10_Status >", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DictICD10_Status >=", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusLessThan(Integer value) {
            addCriterion("DictICD10_Status <", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusLessThanOrEqualTo(Integer value) {
            addCriterion("DictICD10_Status <=", value, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusIn(List<Integer> values) {
            addCriterion("DictICD10_Status in", values, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusNotIn(List<Integer> values) {
            addCriterion("DictICD10_Status not in", values, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusBetween(Integer value1, Integer value2) {
            addCriterion("DictICD10_Status between", value1, value2, "dicticd10Status");
            return (Criteria) this;
        }

        public Criteria andDicticd10StatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DictICD10_Status not between", value1, value2, "dicticd10Status");
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