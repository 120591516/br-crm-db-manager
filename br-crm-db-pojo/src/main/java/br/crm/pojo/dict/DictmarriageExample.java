package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictmarriageExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictmarriageExample() {
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

        public Criteria andIdMarriageIsNull() {
            addCriterion("ID_Marriage is null");
            return (Criteria) this;
        }

        public Criteria andIdMarriageIsNotNull() {
            addCriterion("ID_Marriage is not null");
            return (Criteria) this;
        }

        public Criteria andIdMarriageEqualTo(Integer value) {
            addCriterion("ID_Marriage =", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageNotEqualTo(Integer value) {
            addCriterion("ID_Marriage <>", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageGreaterThan(Integer value) {
            addCriterion("ID_Marriage >", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Marriage >=", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageLessThan(Integer value) {
            addCriterion("ID_Marriage <", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Marriage <=", value, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageIn(List<Integer> values) {
            addCriterion("ID_Marriage in", values, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageNotIn(List<Integer> values) {
            addCriterion("ID_Marriage not in", values, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageBetween(Integer value1, Integer value2) {
            addCriterion("ID_Marriage between", value1, value2, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andIdMarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Marriage not between", value1, value2, "idMarriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIsNull() {
            addCriterion("Marriage_Name is null");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIsNotNull() {
            addCriterion("Marriage_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageNameEqualTo(String value) {
            addCriterion("Marriage_Name =", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotEqualTo(String value) {
            addCriterion("Marriage_Name <>", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameGreaterThan(String value) {
            addCriterion("Marriage_Name >", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameGreaterThanOrEqualTo(String value) {
            addCriterion("Marriage_Name >=", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLessThan(String value) {
            addCriterion("Marriage_Name <", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLessThanOrEqualTo(String value) {
            addCriterion("Marriage_Name <=", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameLike(String value) {
            addCriterion("Marriage_Name like", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotLike(String value) {
            addCriterion("Marriage_Name not like", value, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameIn(List<String> values) {
            addCriterion("Marriage_Name in", values, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotIn(List<String> values) {
            addCriterion("Marriage_Name not in", values, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameBetween(String value1, String value2) {
            addCriterion("Marriage_Name between", value1, value2, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageNameNotBetween(String value1, String value2) {
            addCriterion("Marriage_Name not between", value1, value2, "marriageName");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeIsNull() {
            addCriterion("Marriage_Code is null");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeIsNotNull() {
            addCriterion("Marriage_Code is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeEqualTo(String value) {
            addCriterion("Marriage_Code =", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeNotEqualTo(String value) {
            addCriterion("Marriage_Code <>", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeGreaterThan(String value) {
            addCriterion("Marriage_Code >", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Marriage_Code >=", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeLessThan(String value) {
            addCriterion("Marriage_Code <", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeLessThanOrEqualTo(String value) {
            addCriterion("Marriage_Code <=", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeLike(String value) {
            addCriterion("Marriage_Code like", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeNotLike(String value) {
            addCriterion("Marriage_Code not like", value, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeIn(List<String> values) {
            addCriterion("Marriage_Code in", values, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeNotIn(List<String> values) {
            addCriterion("Marriage_Code not in", values, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeBetween(String value1, String value2) {
            addCriterion("Marriage_Code between", value1, value2, "marriageCode");
            return (Criteria) this;
        }

        public Criteria andMarriageCodeNotBetween(String value1, String value2) {
            addCriterion("Marriage_Code not between", value1, value2, "marriageCode");
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

        public Criteria andMarriagecodexIsNull() {
            addCriterion("MarriageCodeX is null");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexIsNotNull() {
            addCriterion("MarriageCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexEqualTo(String value) {
            addCriterion("MarriageCodeX =", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexNotEqualTo(String value) {
            addCriterion("MarriageCodeX <>", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexGreaterThan(String value) {
            addCriterion("MarriageCodeX >", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexGreaterThanOrEqualTo(String value) {
            addCriterion("MarriageCodeX >=", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexLessThan(String value) {
            addCriterion("MarriageCodeX <", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexLessThanOrEqualTo(String value) {
            addCriterion("MarriageCodeX <=", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexLike(String value) {
            addCriterion("MarriageCodeX like", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexNotLike(String value) {
            addCriterion("MarriageCodeX not like", value, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexIn(List<String> values) {
            addCriterion("MarriageCodeX in", values, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexNotIn(List<String> values) {
            addCriterion("MarriageCodeX not in", values, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexBetween(String value1, String value2) {
            addCriterion("MarriageCodeX between", value1, value2, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andMarriagecodexNotBetween(String value1, String value2) {
            addCriterion("MarriageCodeX not between", value1, value2, "marriagecodex");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedIsNull() {
            addCriterion("F_HasMarried is null");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedIsNotNull() {
            addCriterion("F_HasMarried is not null");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedEqualTo(Boolean value) {
            addCriterion("F_HasMarried =", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedNotEqualTo(Boolean value) {
            addCriterion("F_HasMarried <>", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedGreaterThan(Boolean value) {
            addCriterion("F_HasMarried >", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_HasMarried >=", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedLessThan(Boolean value) {
            addCriterion("F_HasMarried <", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedLessThanOrEqualTo(Boolean value) {
            addCriterion("F_HasMarried <=", value, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedIn(List<Boolean> values) {
            addCriterion("F_HasMarried in", values, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedNotIn(List<Boolean> values) {
            addCriterion("F_HasMarried not in", values, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedBetween(Boolean value1, Boolean value2) {
            addCriterion("F_HasMarried between", value1, value2, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andFHasmarriedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_HasMarried not between", value1, value2, "fHasmarried");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeIsNull() {
            addCriterion("Marriage_createtime is null");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeIsNotNull() {
            addCriterion("Marriage_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeEqualTo(Date value) {
            addCriterion("Marriage_createtime =", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeNotEqualTo(Date value) {
            addCriterion("Marriage_createtime <>", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeGreaterThan(Date value) {
            addCriterion("Marriage_createtime >", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Marriage_createtime >=", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeLessThan(Date value) {
            addCriterion("Marriage_createtime <", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Marriage_createtime <=", value, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeIn(List<Date> values) {
            addCriterion("Marriage_createtime in", values, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeNotIn(List<Date> values) {
            addCriterion("Marriage_createtime not in", values, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Marriage_createtime between", value1, value2, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Marriage_createtime not between", value1, value2, "marriageCreatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeIsNull() {
            addCriterion("Marriage_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeIsNotNull() {
            addCriterion("Marriage_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeEqualTo(Date value) {
            addCriterion("Marriage_updatetime =", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeNotEqualTo(Date value) {
            addCriterion("Marriage_updatetime <>", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeGreaterThan(Date value) {
            addCriterion("Marriage_updatetime >", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Marriage_updatetime >=", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeLessThan(Date value) {
            addCriterion("Marriage_updatetime <", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Marriage_updatetime <=", value, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeIn(List<Date> values) {
            addCriterion("Marriage_updatetime in", values, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeNotIn(List<Date> values) {
            addCriterion("Marriage_updatetime not in", values, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Marriage_updatetime between", value1, value2, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Marriage_updatetime not between", value1, value2, "marriageUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNull() {
            addCriterion("Marriage_Status is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNotNull() {
            addCriterion("Marriage_Status is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusEqualTo(Integer value) {
            addCriterion("Marriage_Status =", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotEqualTo(Integer value) {
            addCriterion("Marriage_Status <>", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThan(Integer value) {
            addCriterion("Marriage_Status >", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Marriage_Status >=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThan(Integer value) {
            addCriterion("Marriage_Status <", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Marriage_Status <=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIn(List<Integer> values) {
            addCriterion("Marriage_Status in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotIn(List<Integer> values) {
            addCriterion("Marriage_Status not in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusBetween(Integer value1, Integer value2) {
            addCriterion("Marriage_Status between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Marriage_Status not between", value1, value2, "marriageStatus");
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