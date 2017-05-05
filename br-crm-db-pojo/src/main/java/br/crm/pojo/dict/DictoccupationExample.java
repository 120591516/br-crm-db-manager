package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictoccupationExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictoccupationExample() {
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

        public Criteria andIdOccupationIsNull() {
            addCriterion("ID_Occupation is null");
            return (Criteria) this;
        }

        public Criteria andIdOccupationIsNotNull() {
            addCriterion("ID_Occupation is not null");
            return (Criteria) this;
        }

        public Criteria andIdOccupationEqualTo(Integer value) {
            addCriterion("ID_Occupation =", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationNotEqualTo(Integer value) {
            addCriterion("ID_Occupation <>", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationGreaterThan(Integer value) {
            addCriterion("ID_Occupation >", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Occupation >=", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationLessThan(Integer value) {
            addCriterion("ID_Occupation <", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Occupation <=", value, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationIn(List<Integer> values) {
            addCriterion("ID_Occupation in", values, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationNotIn(List<Integer> values) {
            addCriterion("ID_Occupation not in", values, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationBetween(Integer value1, Integer value2) {
            addCriterion("ID_Occupation between", value1, value2, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andIdOccupationNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Occupation not between", value1, value2, "idOccupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIsNull() {
            addCriterion("Occupation_Name is null");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIsNotNull() {
            addCriterion("Occupation_Name is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationNameEqualTo(String value) {
            addCriterion("Occupation_Name =", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotEqualTo(String value) {
            addCriterion("Occupation_Name <>", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameGreaterThan(String value) {
            addCriterion("Occupation_Name >", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameGreaterThanOrEqualTo(String value) {
            addCriterion("Occupation_Name >=", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLessThan(String value) {
            addCriterion("Occupation_Name <", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLessThanOrEqualTo(String value) {
            addCriterion("Occupation_Name <=", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameLike(String value) {
            addCriterion("Occupation_Name like", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotLike(String value) {
            addCriterion("Occupation_Name not like", value, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameIn(List<String> values) {
            addCriterion("Occupation_Name in", values, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotIn(List<String> values) {
            addCriterion("Occupation_Name not in", values, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameBetween(String value1, String value2) {
            addCriterion("Occupation_Name between", value1, value2, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationNameNotBetween(String value1, String value2) {
            addCriterion("Occupation_Name not between", value1, value2, "occupationName");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeIsNull() {
            addCriterion("Occupation_Code is null");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeIsNotNull() {
            addCriterion("Occupation_Code is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeEqualTo(String value) {
            addCriterion("Occupation_Code =", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeNotEqualTo(String value) {
            addCriterion("Occupation_Code <>", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeGreaterThan(String value) {
            addCriterion("Occupation_Code >", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Occupation_Code >=", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeLessThan(String value) {
            addCriterion("Occupation_Code <", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeLessThanOrEqualTo(String value) {
            addCriterion("Occupation_Code <=", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeLike(String value) {
            addCriterion("Occupation_Code like", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeNotLike(String value) {
            addCriterion("Occupation_Code not like", value, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeIn(List<String> values) {
            addCriterion("Occupation_Code in", values, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeNotIn(List<String> values) {
            addCriterion("Occupation_Code not in", values, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeBetween(String value1, String value2) {
            addCriterion("Occupation_Code between", value1, value2, "occupationCode");
            return (Criteria) this;
        }

        public Criteria andOccupationCodeNotBetween(String value1, String value2) {
            addCriterion("Occupation_Code not between", value1, value2, "occupationCode");
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

        public Criteria andOccupationcodexIsNull() {
            addCriterion("OccupationCodeX is null");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexIsNotNull() {
            addCriterion("OccupationCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexEqualTo(String value) {
            addCriterion("OccupationCodeX =", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexNotEqualTo(String value) {
            addCriterion("OccupationCodeX <>", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexGreaterThan(String value) {
            addCriterion("OccupationCodeX >", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexGreaterThanOrEqualTo(String value) {
            addCriterion("OccupationCodeX >=", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexLessThan(String value) {
            addCriterion("OccupationCodeX <", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexLessThanOrEqualTo(String value) {
            addCriterion("OccupationCodeX <=", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexLike(String value) {
            addCriterion("OccupationCodeX like", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexNotLike(String value) {
            addCriterion("OccupationCodeX not like", value, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexIn(List<String> values) {
            addCriterion("OccupationCodeX in", values, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexNotIn(List<String> values) {
            addCriterion("OccupationCodeX not in", values, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexBetween(String value1, String value2) {
            addCriterion("OccupationCodeX between", value1, value2, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationcodexNotBetween(String value1, String value2) {
            addCriterion("OccupationCodeX not between", value1, value2, "occupationcodex");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeIsNull() {
            addCriterion("Occupation_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeIsNotNull() {
            addCriterion("Occupation_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeEqualTo(Date value) {
            addCriterion("Occupation_createtime =", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeNotEqualTo(Date value) {
            addCriterion("Occupation_createtime <>", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeGreaterThan(Date value) {
            addCriterion("Occupation_createtime >", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Occupation_createtime >=", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeLessThan(Date value) {
            addCriterion("Occupation_createtime <", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Occupation_createtime <=", value, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeIn(List<Date> values) {
            addCriterion("Occupation_createtime in", values, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeNotIn(List<Date> values) {
            addCriterion("Occupation_createtime not in", values, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Occupation_createtime between", value1, value2, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Occupation_createtime not between", value1, value2, "occupationCreatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeIsNull() {
            addCriterion("Occupation_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeIsNotNull() {
            addCriterion("Occupation_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeEqualTo(Date value) {
            addCriterion("Occupation_updatetime =", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeNotEqualTo(Date value) {
            addCriterion("Occupation_updatetime <>", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeGreaterThan(Date value) {
            addCriterion("Occupation_updatetime >", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Occupation_updatetime >=", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeLessThan(Date value) {
            addCriterion("Occupation_updatetime <", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Occupation_updatetime <=", value, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeIn(List<Date> values) {
            addCriterion("Occupation_updatetime in", values, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeNotIn(List<Date> values) {
            addCriterion("Occupation_updatetime not in", values, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Occupation_updatetime between", value1, value2, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Occupation_updatetime not between", value1, value2, "occupationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusIsNull() {
            addCriterion("Occupation_Status is null");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusIsNotNull() {
            addCriterion("Occupation_Status is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusEqualTo(Integer value) {
            addCriterion("Occupation_Status =", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusNotEqualTo(Integer value) {
            addCriterion("Occupation_Status <>", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusGreaterThan(Integer value) {
            addCriterion("Occupation_Status >", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Occupation_Status >=", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusLessThan(Integer value) {
            addCriterion("Occupation_Status <", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Occupation_Status <=", value, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusIn(List<Integer> values) {
            addCriterion("Occupation_Status in", values, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusNotIn(List<Integer> values) {
            addCriterion("Occupation_Status not in", values, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusBetween(Integer value1, Integer value2) {
            addCriterion("Occupation_Status between", value1, value2, "occupationStatus");
            return (Criteria) this;
        }

        public Criteria andOccupationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Occupation_Status not between", value1, value2, "occupationStatus");
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