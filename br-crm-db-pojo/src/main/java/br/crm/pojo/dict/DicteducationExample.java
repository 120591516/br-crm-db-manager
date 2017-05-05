package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DicteducationExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicteducationExample() {
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

        public Criteria andIdEducationIsNull() {
            addCriterion("ID_Education is null");
            return (Criteria) this;
        }

        public Criteria andIdEducationIsNotNull() {
            addCriterion("ID_Education is not null");
            return (Criteria) this;
        }

        public Criteria andIdEducationEqualTo(Integer value) {
            addCriterion("ID_Education =", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationNotEqualTo(Integer value) {
            addCriterion("ID_Education <>", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationGreaterThan(Integer value) {
            addCriterion("ID_Education >", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Education >=", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationLessThan(Integer value) {
            addCriterion("ID_Education <", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Education <=", value, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationIn(List<Integer> values) {
            addCriterion("ID_Education in", values, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationNotIn(List<Integer> values) {
            addCriterion("ID_Education not in", values, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationBetween(Integer value1, Integer value2) {
            addCriterion("ID_Education between", value1, value2, "idEducation");
            return (Criteria) this;
        }

        public Criteria andIdEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Education not between", value1, value2, "idEducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationIsNull() {
            addCriterion("KeyEducation is null");
            return (Criteria) this;
        }

        public Criteria andKeyeducationIsNotNull() {
            addCriterion("KeyEducation is not null");
            return (Criteria) this;
        }

        public Criteria andKeyeducationEqualTo(String value) {
            addCriterion("KeyEducation =", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationNotEqualTo(String value) {
            addCriterion("KeyEducation <>", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationGreaterThan(String value) {
            addCriterion("KeyEducation >", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationGreaterThanOrEqualTo(String value) {
            addCriterion("KeyEducation >=", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationLessThan(String value) {
            addCriterion("KeyEducation <", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationLessThanOrEqualTo(String value) {
            addCriterion("KeyEducation <=", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationLike(String value) {
            addCriterion("KeyEducation like", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationNotLike(String value) {
            addCriterion("KeyEducation not like", value, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationIn(List<String> values) {
            addCriterion("KeyEducation in", values, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationNotIn(List<String> values) {
            addCriterion("KeyEducation not in", values, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationBetween(String value1, String value2) {
            addCriterion("KeyEducation between", value1, value2, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andKeyeducationNotBetween(String value1, String value2) {
            addCriterion("KeyEducation not between", value1, value2, "keyeducation");
            return (Criteria) this;
        }

        public Criteria andEducationNameIsNull() {
            addCriterion("Education_Name is null");
            return (Criteria) this;
        }

        public Criteria andEducationNameIsNotNull() {
            addCriterion("Education_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEducationNameEqualTo(String value) {
            addCriterion("Education_Name =", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotEqualTo(String value) {
            addCriterion("Education_Name <>", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameGreaterThan(String value) {
            addCriterion("Education_Name >", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameGreaterThanOrEqualTo(String value) {
            addCriterion("Education_Name >=", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLessThan(String value) {
            addCriterion("Education_Name <", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLessThanOrEqualTo(String value) {
            addCriterion("Education_Name <=", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameLike(String value) {
            addCriterion("Education_Name like", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotLike(String value) {
            addCriterion("Education_Name not like", value, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameIn(List<String> values) {
            addCriterion("Education_Name in", values, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotIn(List<String> values) {
            addCriterion("Education_Name not in", values, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameBetween(String value1, String value2) {
            addCriterion("Education_Name between", value1, value2, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationNameNotBetween(String value1, String value2) {
            addCriterion("Education_Name not between", value1, value2, "educationName");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIsNull() {
            addCriterion("Education_Code is null");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIsNotNull() {
            addCriterion("Education_Code is not null");
            return (Criteria) this;
        }

        public Criteria andEducationCodeEqualTo(String value) {
            addCriterion("Education_Code =", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotEqualTo(String value) {
            addCriterion("Education_Code <>", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeGreaterThan(String value) {
            addCriterion("Education_Code >", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Education_Code >=", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLessThan(String value) {
            addCriterion("Education_Code <", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLessThanOrEqualTo(String value) {
            addCriterion("Education_Code <=", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLike(String value) {
            addCriterion("Education_Code like", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotLike(String value) {
            addCriterion("Education_Code not like", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIn(List<String> values) {
            addCriterion("Education_Code in", values, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotIn(List<String> values) {
            addCriterion("Education_Code not in", values, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeBetween(String value1, String value2) {
            addCriterion("Education_Code between", value1, value2, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotBetween(String value1, String value2) {
            addCriterion("Education_Code not between", value1, value2, "educationCode");
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

        public Criteria andEducationcodexIsNull() {
            addCriterion("EducationCodeX is null");
            return (Criteria) this;
        }

        public Criteria andEducationcodexIsNotNull() {
            addCriterion("EducationCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andEducationcodexEqualTo(String value) {
            addCriterion("EducationCodeX =", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexNotEqualTo(String value) {
            addCriterion("EducationCodeX <>", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexGreaterThan(String value) {
            addCriterion("EducationCodeX >", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexGreaterThanOrEqualTo(String value) {
            addCriterion("EducationCodeX >=", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexLessThan(String value) {
            addCriterion("EducationCodeX <", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexLessThanOrEqualTo(String value) {
            addCriterion("EducationCodeX <=", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexLike(String value) {
            addCriterion("EducationCodeX like", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexNotLike(String value) {
            addCriterion("EducationCodeX not like", value, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexIn(List<String> values) {
            addCriterion("EducationCodeX in", values, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexNotIn(List<String> values) {
            addCriterion("EducationCodeX not in", values, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexBetween(String value1, String value2) {
            addCriterion("EducationCodeX between", value1, value2, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationcodexNotBetween(String value1, String value2) {
            addCriterion("EducationCodeX not between", value1, value2, "educationcodex");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeIsNull() {
            addCriterion("Education_createtime is null");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeIsNotNull() {
            addCriterion("Education_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeEqualTo(Date value) {
            addCriterion("Education_createtime =", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeNotEqualTo(Date value) {
            addCriterion("Education_createtime <>", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeGreaterThan(Date value) {
            addCriterion("Education_createtime >", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Education_createtime >=", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeLessThan(Date value) {
            addCriterion("Education_createtime <", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Education_createtime <=", value, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeIn(List<Date> values) {
            addCriterion("Education_createtime in", values, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeNotIn(List<Date> values) {
            addCriterion("Education_createtime not in", values, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Education_createtime between", value1, value2, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Education_createtime not between", value1, value2, "educationCreatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeIsNull() {
            addCriterion("Education_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeIsNotNull() {
            addCriterion("Education_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeEqualTo(Date value) {
            addCriterion("Education_updatetime =", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeNotEqualTo(Date value) {
            addCriterion("Education_updatetime <>", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeGreaterThan(Date value) {
            addCriterion("Education_updatetime >", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Education_updatetime >=", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeLessThan(Date value) {
            addCriterion("Education_updatetime <", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Education_updatetime <=", value, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeIn(List<Date> values) {
            addCriterion("Education_updatetime in", values, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeNotIn(List<Date> values) {
            addCriterion("Education_updatetime not in", values, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Education_updatetime between", value1, value2, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Education_updatetime not between", value1, value2, "educationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIsNull() {
            addCriterion("Education_Status is null");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIsNotNull() {
            addCriterion("Education_Status is not null");
            return (Criteria) this;
        }

        public Criteria andEducationStatusEqualTo(Integer value) {
            addCriterion("Education_Status =", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotEqualTo(Integer value) {
            addCriterion("Education_Status <>", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusGreaterThan(Integer value) {
            addCriterion("Education_Status >", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Education_Status >=", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusLessThan(Integer value) {
            addCriterion("Education_Status <", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Education_Status <=", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIn(List<Integer> values) {
            addCriterion("Education_Status in", values, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotIn(List<Integer> values) {
            addCriterion("Education_Status not in", values, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusBetween(Integer value1, Integer value2) {
            addCriterion("Education_Status between", value1, value2, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Education_Status not between", value1, value2, "educationStatus");
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