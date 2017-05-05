package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictsexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictsexExample() {
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

        public Criteria andIdSexIsNull() {
            addCriterion("ID_Sex is null");
            return (Criteria) this;
        }

        public Criteria andIdSexIsNotNull() {
            addCriterion("ID_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andIdSexEqualTo(Integer value) {
            addCriterion("ID_Sex =", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexNotEqualTo(Integer value) {
            addCriterion("ID_Sex <>", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexGreaterThan(Integer value) {
            addCriterion("ID_Sex >", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Sex >=", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexLessThan(Integer value) {
            addCriterion("ID_Sex <", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Sex <=", value, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexIn(List<Integer> values) {
            addCriterion("ID_Sex in", values, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexNotIn(List<Integer> values) {
            addCriterion("ID_Sex not in", values, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexBetween(Integer value1, Integer value2) {
            addCriterion("ID_Sex between", value1, value2, "idSex");
            return (Criteria) this;
        }

        public Criteria andIdSexNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Sex not between", value1, value2, "idSex");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNull() {
            addCriterion("Sex_Name is null");
            return (Criteria) this;
        }

        public Criteria andSexNameIsNotNull() {
            addCriterion("Sex_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSexNameEqualTo(String value) {
            addCriterion("Sex_Name =", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotEqualTo(String value) {
            addCriterion("Sex_Name <>", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThan(String value) {
            addCriterion("Sex_Name >", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameGreaterThanOrEqualTo(String value) {
            addCriterion("Sex_Name >=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThan(String value) {
            addCriterion("Sex_Name <", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLessThanOrEqualTo(String value) {
            addCriterion("Sex_Name <=", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameLike(String value) {
            addCriterion("Sex_Name like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotLike(String value) {
            addCriterion("Sex_Name not like", value, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameIn(List<String> values) {
            addCriterion("Sex_Name in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotIn(List<String> values) {
            addCriterion("Sex_Name not in", values, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameBetween(String value1, String value2) {
            addCriterion("Sex_Name between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexNameNotBetween(String value1, String value2) {
            addCriterion("Sex_Name not between", value1, value2, "sexName");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNull() {
            addCriterion("Sex_Code is null");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNotNull() {
            addCriterion("Sex_Code is not null");
            return (Criteria) this;
        }

        public Criteria andSexCodeEqualTo(String value) {
            addCriterion("Sex_Code =", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotEqualTo(String value) {
            addCriterion("Sex_Code <>", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThan(String value) {
            addCriterion("Sex_Code >", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Sex_Code >=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThan(String value) {
            addCriterion("Sex_Code <", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThanOrEqualTo(String value) {
            addCriterion("Sex_Code <=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLike(String value) {
            addCriterion("Sex_Code like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotLike(String value) {
            addCriterion("Sex_Code not like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeIn(List<String> values) {
            addCriterion("Sex_Code in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotIn(List<String> values) {
            addCriterion("Sex_Code not in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeBetween(String value1, String value2) {
            addCriterion("Sex_Code between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotBetween(String value1, String value2) {
            addCriterion("Sex_Code not between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexcodexIsNull() {
            addCriterion("SexCodeX is null");
            return (Criteria) this;
        }

        public Criteria andSexcodexIsNotNull() {
            addCriterion("SexCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andSexcodexEqualTo(String value) {
            addCriterion("SexCodeX =", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexNotEqualTo(String value) {
            addCriterion("SexCodeX <>", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexGreaterThan(String value) {
            addCriterion("SexCodeX >", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexGreaterThanOrEqualTo(String value) {
            addCriterion("SexCodeX >=", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexLessThan(String value) {
            addCriterion("SexCodeX <", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexLessThanOrEqualTo(String value) {
            addCriterion("SexCodeX <=", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexLike(String value) {
            addCriterion("SexCodeX like", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexNotLike(String value) {
            addCriterion("SexCodeX not like", value, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexIn(List<String> values) {
            addCriterion("SexCodeX in", values, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexNotIn(List<String> values) {
            addCriterion("SexCodeX not in", values, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexBetween(String value1, String value2) {
            addCriterion("SexCodeX between", value1, value2, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSexcodexNotBetween(String value1, String value2) {
            addCriterion("SexCodeX not between", value1, value2, "sexcodex");
            return (Criteria) this;
        }

        public Criteria andSextypeIsNull() {
            addCriterion("SexType is null");
            return (Criteria) this;
        }

        public Criteria andSextypeIsNotNull() {
            addCriterion("SexType is not null");
            return (Criteria) this;
        }

        public Criteria andSextypeEqualTo(Integer value) {
            addCriterion("SexType =", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeNotEqualTo(Integer value) {
            addCriterion("SexType <>", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeGreaterThan(Integer value) {
            addCriterion("SexType >", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SexType >=", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeLessThan(Integer value) {
            addCriterion("SexType <", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeLessThanOrEqualTo(Integer value) {
            addCriterion("SexType <=", value, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeIn(List<Integer> values) {
            addCriterion("SexType in", values, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeNotIn(List<Integer> values) {
            addCriterion("SexType not in", values, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeBetween(Integer value1, Integer value2) {
            addCriterion("SexType between", value1, value2, "sextype");
            return (Criteria) this;
        }

        public Criteria andSextypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SexType not between", value1, value2, "sextype");
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

        public Criteria andSexCreatetimeIsNull() {
            addCriterion("Sex_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeIsNotNull() {
            addCriterion("Sex_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeEqualTo(Date value) {
            addCriterion("Sex_createtime =", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeNotEqualTo(Date value) {
            addCriterion("Sex_createtime <>", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeGreaterThan(Date value) {
            addCriterion("Sex_createtime >", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Sex_createtime >=", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeLessThan(Date value) {
            addCriterion("Sex_createtime <", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Sex_createtime <=", value, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeIn(List<Date> values) {
            addCriterion("Sex_createtime in", values, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeNotIn(List<Date> values) {
            addCriterion("Sex_createtime not in", values, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Sex_createtime between", value1, value2, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Sex_createtime not between", value1, value2, "sexCreatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeIsNull() {
            addCriterion("Sex_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeIsNotNull() {
            addCriterion("Sex_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeEqualTo(Date value) {
            addCriterion("Sex_updatetime =", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeNotEqualTo(Date value) {
            addCriterion("Sex_updatetime <>", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeGreaterThan(Date value) {
            addCriterion("Sex_updatetime >", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Sex_updatetime >=", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeLessThan(Date value) {
            addCriterion("Sex_updatetime <", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Sex_updatetime <=", value, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeIn(List<Date> values) {
            addCriterion("Sex_updatetime in", values, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeNotIn(List<Date> values) {
            addCriterion("Sex_updatetime not in", values, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Sex_updatetime between", value1, value2, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Sex_updatetime not between", value1, value2, "sexUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSexStatusIsNull() {
            addCriterion("Sex_Status is null");
            return (Criteria) this;
        }

        public Criteria andSexStatusIsNotNull() {
            addCriterion("Sex_Status is not null");
            return (Criteria) this;
        }

        public Criteria andSexStatusEqualTo(Integer value) {
            addCriterion("Sex_Status =", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusNotEqualTo(Integer value) {
            addCriterion("Sex_Status <>", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusGreaterThan(Integer value) {
            addCriterion("Sex_Status >", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sex_Status >=", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusLessThan(Integer value) {
            addCriterion("Sex_Status <", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Sex_Status <=", value, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusIn(List<Integer> values) {
            addCriterion("Sex_Status in", values, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusNotIn(List<Integer> values) {
            addCriterion("Sex_Status not in", values, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusBetween(Integer value1, Integer value2) {
            addCriterion("Sex_Status between", value1, value2, "sexStatus");
            return (Criteria) this;
        }

        public Criteria andSexStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Sex_Status not between", value1, value2, "sexStatus");
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