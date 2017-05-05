package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictjobclassExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictjobclassExample() {
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

        public Criteria andIdJobclassIsNull() {
            addCriterion("ID_JobClass is null");
            return (Criteria) this;
        }

        public Criteria andIdJobclassIsNotNull() {
            addCriterion("ID_JobClass is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobclassEqualTo(Long value) {
            addCriterion("ID_JobClass =", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassNotEqualTo(Long value) {
            addCriterion("ID_JobClass <>", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassGreaterThan(Long value) {
            addCriterion("ID_JobClass >", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JobClass >=", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassLessThan(Long value) {
            addCriterion("ID_JobClass <", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassLessThanOrEqualTo(Long value) {
            addCriterion("ID_JobClass <=", value, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassIn(List<Long> values) {
            addCriterion("ID_JobClass in", values, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassNotIn(List<Long> values) {
            addCriterion("ID_JobClass not in", values, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassBetween(Long value1, Long value2) {
            addCriterion("ID_JobClass between", value1, value2, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andIdJobclassNotBetween(Long value1, Long value2) {
            addCriterion("ID_JobClass not between", value1, value2, "idJobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNameIsNull() {
            addCriterion("JobClass_Name is null");
            return (Criteria) this;
        }

        public Criteria andJobclassNameIsNotNull() {
            addCriterion("JobClass_Name is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassNameEqualTo(String value) {
            addCriterion("JobClass_Name =", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameNotEqualTo(String value) {
            addCriterion("JobClass_Name <>", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameGreaterThan(String value) {
            addCriterion("JobClass_Name >", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("JobClass_Name >=", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameLessThan(String value) {
            addCriterion("JobClass_Name <", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameLessThanOrEqualTo(String value) {
            addCriterion("JobClass_Name <=", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameLike(String value) {
            addCriterion("JobClass_Name like", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameNotLike(String value) {
            addCriterion("JobClass_Name not like", value, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameIn(List<String> values) {
            addCriterion("JobClass_Name in", values, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameNotIn(List<String> values) {
            addCriterion("JobClass_Name not in", values, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameBetween(String value1, String value2) {
            addCriterion("JobClass_Name between", value1, value2, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassNameNotBetween(String value1, String value2) {
            addCriterion("JobClass_Name not between", value1, value2, "jobclassName");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeIsNull() {
            addCriterion("JobClass_Code is null");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeIsNotNull() {
            addCriterion("JobClass_Code is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeEqualTo(String value) {
            addCriterion("JobClass_Code =", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeNotEqualTo(String value) {
            addCriterion("JobClass_Code <>", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeGreaterThan(String value) {
            addCriterion("JobClass_Code >", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("JobClass_Code >=", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeLessThan(String value) {
            addCriterion("JobClass_Code <", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeLessThanOrEqualTo(String value) {
            addCriterion("JobClass_Code <=", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeLike(String value) {
            addCriterion("JobClass_Code like", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeNotLike(String value) {
            addCriterion("JobClass_Code not like", value, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeIn(List<String> values) {
            addCriterion("JobClass_Code in", values, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeNotIn(List<String> values) {
            addCriterion("JobClass_Code not in", values, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeBetween(String value1, String value2) {
            addCriterion("JobClass_Code between", value1, value2, "jobclassCode");
            return (Criteria) this;
        }

        public Criteria andJobclassCodeNotBetween(String value1, String value2) {
            addCriterion("JobClass_Code not between", value1, value2, "jobclassCode");
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

        public Criteria andJobclasscodexIsNull() {
            addCriterion("JobClassCodeX is null");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexIsNotNull() {
            addCriterion("JobClassCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexEqualTo(String value) {
            addCriterion("JobClassCodeX =", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexNotEqualTo(String value) {
            addCriterion("JobClassCodeX <>", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexGreaterThan(String value) {
            addCriterion("JobClassCodeX >", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexGreaterThanOrEqualTo(String value) {
            addCriterion("JobClassCodeX >=", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexLessThan(String value) {
            addCriterion("JobClassCodeX <", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexLessThanOrEqualTo(String value) {
            addCriterion("JobClassCodeX <=", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexLike(String value) {
            addCriterion("JobClassCodeX like", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexNotLike(String value) {
            addCriterion("JobClassCodeX not like", value, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexIn(List<String> values) {
            addCriterion("JobClassCodeX in", values, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexNotIn(List<String> values) {
            addCriterion("JobClassCodeX not in", values, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexBetween(String value1, String value2) {
            addCriterion("JobClassCodeX between", value1, value2, "jobclasscodex");
            return (Criteria) this;
        }

        public Criteria andJobclasscodexNotBetween(String value1, String value2) {
            addCriterion("JobClassCodeX not between", value1, value2, "jobclasscodex");
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

        public Criteria andJobclassCreatetimeIsNull() {
            addCriterion("JobClass_createtime is null");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeIsNotNull() {
            addCriterion("JobClass_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeEqualTo(Date value) {
            addCriterion("JobClass_createtime =", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeNotEqualTo(Date value) {
            addCriterion("JobClass_createtime <>", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeGreaterThan(Date value) {
            addCriterion("JobClass_createtime >", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JobClass_createtime >=", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeLessThan(Date value) {
            addCriterion("JobClass_createtime <", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("JobClass_createtime <=", value, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeIn(List<Date> values) {
            addCriterion("JobClass_createtime in", values, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeNotIn(List<Date> values) {
            addCriterion("JobClass_createtime not in", values, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeBetween(Date value1, Date value2) {
            addCriterion("JobClass_createtime between", value1, value2, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("JobClass_createtime not between", value1, value2, "jobclassCreatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeIsNull() {
            addCriterion("JobClass_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeIsNotNull() {
            addCriterion("JobClass_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeEqualTo(Date value) {
            addCriterion("JobClass_updatetime =", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeNotEqualTo(Date value) {
            addCriterion("JobClass_updatetime <>", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeGreaterThan(Date value) {
            addCriterion("JobClass_updatetime >", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JobClass_updatetime >=", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeLessThan(Date value) {
            addCriterion("JobClass_updatetime <", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("JobClass_updatetime <=", value, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeIn(List<Date> values) {
            addCriterion("JobClass_updatetime in", values, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeNotIn(List<Date> values) {
            addCriterion("JobClass_updatetime not in", values, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("JobClass_updatetime between", value1, value2, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("JobClass_updatetime not between", value1, value2, "jobclassUpdatetime");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusIsNull() {
            addCriterion("JobClass_Status is null");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusIsNotNull() {
            addCriterion("JobClass_Status is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusEqualTo(Integer value) {
            addCriterion("JobClass_Status =", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusNotEqualTo(Integer value) {
            addCriterion("JobClass_Status <>", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusGreaterThan(Integer value) {
            addCriterion("JobClass_Status >", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobClass_Status >=", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusLessThan(Integer value) {
            addCriterion("JobClass_Status <", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusLessThanOrEqualTo(Integer value) {
            addCriterion("JobClass_Status <=", value, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusIn(List<Integer> values) {
            addCriterion("JobClass_Status in", values, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusNotIn(List<Integer> values) {
            addCriterion("JobClass_Status not in", values, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusBetween(Integer value1, Integer value2) {
            addCriterion("JobClass_Status between", value1, value2, "jobclassStatus");
            return (Criteria) this;
        }

        public Criteria andJobclassStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("JobClass_Status not between", value1, value2, "jobclassStatus");
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