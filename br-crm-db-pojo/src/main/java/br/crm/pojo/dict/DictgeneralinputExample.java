package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictgeneralinputExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictgeneralinputExample() {
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

        public Criteria andIdGeneralinputIsNull() {
            addCriterion("ID_GeneralInput is null");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputIsNotNull() {
            addCriterion("ID_GeneralInput is not null");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputEqualTo(Integer value) {
            addCriterion("ID_GeneralInput =", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputNotEqualTo(Integer value) {
            addCriterion("ID_GeneralInput <>", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputGreaterThan(Integer value) {
            addCriterion("ID_GeneralInput >", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_GeneralInput >=", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputLessThan(Integer value) {
            addCriterion("ID_GeneralInput <", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputLessThanOrEqualTo(Integer value) {
            addCriterion("ID_GeneralInput <=", value, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputIn(List<Integer> values) {
            addCriterion("ID_GeneralInput in", values, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputNotIn(List<Integer> values) {
            addCriterion("ID_GeneralInput not in", values, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputBetween(Integer value1, Integer value2) {
            addCriterion("ID_GeneralInput between", value1, value2, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andIdGeneralinputNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_GeneralInput not between", value1, value2, "idGeneralinput");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameIsNull() {
            addCriterion("GeneralInput_TypeName is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameIsNotNull() {
            addCriterion("GeneralInput_TypeName is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameEqualTo(String value) {
            addCriterion("GeneralInput_TypeName =", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameNotEqualTo(String value) {
            addCriterion("GeneralInput_TypeName <>", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameGreaterThan(String value) {
            addCriterion("GeneralInput_TypeName >", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("GeneralInput_TypeName >=", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameLessThan(String value) {
            addCriterion("GeneralInput_TypeName <", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameLessThanOrEqualTo(String value) {
            addCriterion("GeneralInput_TypeName <=", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameLike(String value) {
            addCriterion("GeneralInput_TypeName like", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameNotLike(String value) {
            addCriterion("GeneralInput_TypeName not like", value, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameIn(List<String> values) {
            addCriterion("GeneralInput_TypeName in", values, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameNotIn(List<String> values) {
            addCriterion("GeneralInput_TypeName not in", values, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameBetween(String value1, String value2) {
            addCriterion("GeneralInput_TypeName between", value1, value2, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypenameNotBetween(String value1, String value2) {
            addCriterion("GeneralInput_TypeName not between", value1, value2, "generalinputTypename");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeIsNull() {
            addCriterion("GeneralInput_TypeCode is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeIsNotNull() {
            addCriterion("GeneralInput_TypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeEqualTo(String value) {
            addCriterion("GeneralInput_TypeCode =", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeNotEqualTo(String value) {
            addCriterion("GeneralInput_TypeCode <>", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeGreaterThan(String value) {
            addCriterion("GeneralInput_TypeCode >", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("GeneralInput_TypeCode >=", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeLessThan(String value) {
            addCriterion("GeneralInput_TypeCode <", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeLessThanOrEqualTo(String value) {
            addCriterion("GeneralInput_TypeCode <=", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeLike(String value) {
            addCriterion("GeneralInput_TypeCode like", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeNotLike(String value) {
            addCriterion("GeneralInput_TypeCode not like", value, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeIn(List<String> values) {
            addCriterion("GeneralInput_TypeCode in", values, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeNotIn(List<String> values) {
            addCriterion("GeneralInput_TypeCode not in", values, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeBetween(String value1, String value2) {
            addCriterion("GeneralInput_TypeCode between", value1, value2, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputTypecodeNotBetween(String value1, String value2) {
            addCriterion("GeneralInput_TypeCode not between", value1, value2, "generalinputTypecode");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameIsNull() {
            addCriterion("GeneralInput_Name is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameIsNotNull() {
            addCriterion("GeneralInput_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameEqualTo(String value) {
            addCriterion("GeneralInput_Name =", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameNotEqualTo(String value) {
            addCriterion("GeneralInput_Name <>", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameGreaterThan(String value) {
            addCriterion("GeneralInput_Name >", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameGreaterThanOrEqualTo(String value) {
            addCriterion("GeneralInput_Name >=", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameLessThan(String value) {
            addCriterion("GeneralInput_Name <", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameLessThanOrEqualTo(String value) {
            addCriterion("GeneralInput_Name <=", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameLike(String value) {
            addCriterion("GeneralInput_Name like", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameNotLike(String value) {
            addCriterion("GeneralInput_Name not like", value, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameIn(List<String> values) {
            addCriterion("GeneralInput_Name in", values, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameNotIn(List<String> values) {
            addCriterion("GeneralInput_Name not in", values, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameBetween(String value1, String value2) {
            addCriterion("GeneralInput_Name between", value1, value2, "generalinputName");
            return (Criteria) this;
        }

        public Criteria andGeneralinputNameNotBetween(String value1, String value2) {
            addCriterion("GeneralInput_Name not between", value1, value2, "generalinputName");
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

        public Criteria andGeneralinputCreatetimeIsNull() {
            addCriterion("GeneralInput_createtime is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeIsNotNull() {
            addCriterion("GeneralInput_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeEqualTo(Date value) {
            addCriterion("GeneralInput_createtime =", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeNotEqualTo(Date value) {
            addCriterion("GeneralInput_createtime <>", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeGreaterThan(Date value) {
            addCriterion("GeneralInput_createtime >", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GeneralInput_createtime >=", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeLessThan(Date value) {
            addCriterion("GeneralInput_createtime <", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("GeneralInput_createtime <=", value, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeIn(List<Date> values) {
            addCriterion("GeneralInput_createtime in", values, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeNotIn(List<Date> values) {
            addCriterion("GeneralInput_createtime not in", values, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeBetween(Date value1, Date value2) {
            addCriterion("GeneralInput_createtime between", value1, value2, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("GeneralInput_createtime not between", value1, value2, "generalinputCreatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeIsNull() {
            addCriterion("GeneralInput_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeIsNotNull() {
            addCriterion("GeneralInput_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeEqualTo(Date value) {
            addCriterion("GeneralInput_updatetime =", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeNotEqualTo(Date value) {
            addCriterion("GeneralInput_updatetime <>", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeGreaterThan(Date value) {
            addCriterion("GeneralInput_updatetime >", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GeneralInput_updatetime >=", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeLessThan(Date value) {
            addCriterion("GeneralInput_updatetime <", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("GeneralInput_updatetime <=", value, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeIn(List<Date> values) {
            addCriterion("GeneralInput_updatetime in", values, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeNotIn(List<Date> values) {
            addCriterion("GeneralInput_updatetime not in", values, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("GeneralInput_updatetime between", value1, value2, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("GeneralInput_updatetime not between", value1, value2, "generalinputUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusIsNull() {
            addCriterion("GeneralInput_Status is null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusIsNotNull() {
            addCriterion("GeneralInput_Status is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusEqualTo(Integer value) {
            addCriterion("GeneralInput_Status =", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusNotEqualTo(Integer value) {
            addCriterion("GeneralInput_Status <>", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusGreaterThan(Integer value) {
            addCriterion("GeneralInput_Status >", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("GeneralInput_Status >=", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusLessThan(Integer value) {
            addCriterion("GeneralInput_Status <", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusLessThanOrEqualTo(Integer value) {
            addCriterion("GeneralInput_Status <=", value, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusIn(List<Integer> values) {
            addCriterion("GeneralInput_Status in", values, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusNotIn(List<Integer> values) {
            addCriterion("GeneralInput_Status not in", values, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusBetween(Integer value1, Integer value2) {
            addCriterion("GeneralInput_Status between", value1, value2, "generalinputStatus");
            return (Criteria) this;
        }

        public Criteria andGeneralinputStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("GeneralInput_Status not between", value1, value2, "generalinputStatus");
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