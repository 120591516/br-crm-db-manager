package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictbloodtypeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictbloodtypeExample() {
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

        public Criteria andIdBloodtypeIsNull() {
            addCriterion("ID_BloodType is null");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeIsNotNull() {
            addCriterion("ID_BloodType is not null");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeEqualTo(Integer value) {
            addCriterion("ID_BloodType =", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeNotEqualTo(Integer value) {
            addCriterion("ID_BloodType <>", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeGreaterThan(Integer value) {
            addCriterion("ID_BloodType >", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_BloodType >=", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeLessThan(Integer value) {
            addCriterion("ID_BloodType <", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_BloodType <=", value, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeIn(List<Integer> values) {
            addCriterion("ID_BloodType in", values, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeNotIn(List<Integer> values) {
            addCriterion("ID_BloodType not in", values, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_BloodType between", value1, value2, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andIdBloodtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_BloodType not between", value1, value2, "idBloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeIsNull() {
            addCriterion("KeyBloodType is null");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeIsNotNull() {
            addCriterion("KeyBloodType is not null");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeEqualTo(String value) {
            addCriterion("KeyBloodType =", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeNotEqualTo(String value) {
            addCriterion("KeyBloodType <>", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeGreaterThan(String value) {
            addCriterion("KeyBloodType >", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("KeyBloodType >=", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeLessThan(String value) {
            addCriterion("KeyBloodType <", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeLessThanOrEqualTo(String value) {
            addCriterion("KeyBloodType <=", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeLike(String value) {
            addCriterion("KeyBloodType like", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeNotLike(String value) {
            addCriterion("KeyBloodType not like", value, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeIn(List<String> values) {
            addCriterion("KeyBloodType in", values, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeNotIn(List<String> values) {
            addCriterion("KeyBloodType not in", values, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeBetween(String value1, String value2) {
            addCriterion("KeyBloodType between", value1, value2, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andKeybloodtypeNotBetween(String value1, String value2) {
            addCriterion("KeyBloodType not between", value1, value2, "keybloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameIsNull() {
            addCriterion("BloodType_Name is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameIsNotNull() {
            addCriterion("BloodType_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameEqualTo(String value) {
            addCriterion("BloodType_Name =", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameNotEqualTo(String value) {
            addCriterion("BloodType_Name <>", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameGreaterThan(String value) {
            addCriterion("BloodType_Name >", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("BloodType_Name >=", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameLessThan(String value) {
            addCriterion("BloodType_Name <", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameLessThanOrEqualTo(String value) {
            addCriterion("BloodType_Name <=", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameLike(String value) {
            addCriterion("BloodType_Name like", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameNotLike(String value) {
            addCriterion("BloodType_Name not like", value, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameIn(List<String> values) {
            addCriterion("BloodType_Name in", values, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameNotIn(List<String> values) {
            addCriterion("BloodType_Name not in", values, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameBetween(String value1, String value2) {
            addCriterion("BloodType_Name between", value1, value2, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNameNotBetween(String value1, String value2) {
            addCriterion("BloodType_Name not between", value1, value2, "bloodtypeName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeIsNull() {
            addCriterion("BloodType_Code is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeIsNotNull() {
            addCriterion("BloodType_Code is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeEqualTo(String value) {
            addCriterion("BloodType_Code =", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeNotEqualTo(String value) {
            addCriterion("BloodType_Code <>", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeGreaterThan(String value) {
            addCriterion("BloodType_Code >", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BloodType_Code >=", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeLessThan(String value) {
            addCriterion("BloodType_Code <", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeLessThanOrEqualTo(String value) {
            addCriterion("BloodType_Code <=", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeLike(String value) {
            addCriterion("BloodType_Code like", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeNotLike(String value) {
            addCriterion("BloodType_Code not like", value, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeIn(List<String> values) {
            addCriterion("BloodType_Code in", values, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeNotIn(List<String> values) {
            addCriterion("BloodType_Code not in", values, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeBetween(String value1, String value2) {
            addCriterion("BloodType_Code between", value1, value2, "bloodtypeCode");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCodeNotBetween(String value1, String value2) {
            addCriterion("BloodType_Code not between", value1, value2, "bloodtypeCode");
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

        public Criteria andBloodtypecodexIsNull() {
            addCriterion("BloodTypeCodeX is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexIsNotNull() {
            addCriterion("BloodTypeCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexEqualTo(String value) {
            addCriterion("BloodTypeCodeX =", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexNotEqualTo(String value) {
            addCriterion("BloodTypeCodeX <>", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexGreaterThan(String value) {
            addCriterion("BloodTypeCodeX >", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexGreaterThanOrEqualTo(String value) {
            addCriterion("BloodTypeCodeX >=", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexLessThan(String value) {
            addCriterion("BloodTypeCodeX <", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexLessThanOrEqualTo(String value) {
            addCriterion("BloodTypeCodeX <=", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexLike(String value) {
            addCriterion("BloodTypeCodeX like", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexNotLike(String value) {
            addCriterion("BloodTypeCodeX not like", value, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexIn(List<String> values) {
            addCriterion("BloodTypeCodeX in", values, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexNotIn(List<String> values) {
            addCriterion("BloodTypeCodeX not in", values, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexBetween(String value1, String value2) {
            addCriterion("BloodTypeCodeX between", value1, value2, "bloodtypecodex");
            return (Criteria) this;
        }

        public Criteria andBloodtypecodexNotBetween(String value1, String value2) {
            addCriterion("BloodTypeCodeX not between", value1, value2, "bloodtypecodex");
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

        public Criteria andBloodtypeCreatetimeIsNull() {
            addCriterion("BloodType_createtime is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeIsNotNull() {
            addCriterion("BloodType_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeEqualTo(Date value) {
            addCriterion("BloodType_createtime =", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeNotEqualTo(Date value) {
            addCriterion("BloodType_createtime <>", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeGreaterThan(Date value) {
            addCriterion("BloodType_createtime >", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BloodType_createtime >=", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeLessThan(Date value) {
            addCriterion("BloodType_createtime <", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("BloodType_createtime <=", value, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeIn(List<Date> values) {
            addCriterion("BloodType_createtime in", values, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeNotIn(List<Date> values) {
            addCriterion("BloodType_createtime not in", values, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("BloodType_createtime between", value1, value2, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("BloodType_createtime not between", value1, value2, "bloodtypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeIsNull() {
            addCriterion("BloodType_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeIsNotNull() {
            addCriterion("BloodType_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeEqualTo(Date value) {
            addCriterion("BloodType_updatetime =", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeNotEqualTo(Date value) {
            addCriterion("BloodType_updatetime <>", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeGreaterThan(Date value) {
            addCriterion("BloodType_updatetime >", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BloodType_updatetime >=", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeLessThan(Date value) {
            addCriterion("BloodType_updatetime <", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("BloodType_updatetime <=", value, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeIn(List<Date> values) {
            addCriterion("BloodType_updatetime in", values, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeNotIn(List<Date> values) {
            addCriterion("BloodType_updatetime not in", values, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("BloodType_updatetime between", value1, value2, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("BloodType_updatetime not between", value1, value2, "bloodtypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusIsNull() {
            addCriterion("BloodType_Status is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusIsNotNull() {
            addCriterion("BloodType_Status is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusEqualTo(Integer value) {
            addCriterion("BloodType_Status =", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusNotEqualTo(Integer value) {
            addCriterion("BloodType_Status <>", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusGreaterThan(Integer value) {
            addCriterion("BloodType_Status >", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BloodType_Status >=", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusLessThan(Integer value) {
            addCriterion("BloodType_Status <", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("BloodType_Status <=", value, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusIn(List<Integer> values) {
            addCriterion("BloodType_Status in", values, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusNotIn(List<Integer> values) {
            addCriterion("BloodType_Status not in", values, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusBetween(Integer value1, Integer value2) {
            addCriterion("BloodType_Status between", value1, value2, "bloodtypeStatus");
            return (Criteria) this;
        }

        public Criteria andBloodtypeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BloodType_Status not between", value1, value2, "bloodtypeStatus");
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