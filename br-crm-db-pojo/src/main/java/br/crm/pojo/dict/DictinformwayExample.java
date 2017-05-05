package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictinformwayExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictinformwayExample() {
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

        public Criteria andIdInformwayIsNull() {
            addCriterion("ID_InformWay is null");
            return (Criteria) this;
        }

        public Criteria andIdInformwayIsNotNull() {
            addCriterion("ID_InformWay is not null");
            return (Criteria) this;
        }

        public Criteria andIdInformwayEqualTo(Integer value) {
            addCriterion("ID_InformWay =", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayNotEqualTo(Integer value) {
            addCriterion("ID_InformWay <>", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayGreaterThan(Integer value) {
            addCriterion("ID_InformWay >", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_InformWay >=", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayLessThan(Integer value) {
            addCriterion("ID_InformWay <", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayLessThanOrEqualTo(Integer value) {
            addCriterion("ID_InformWay <=", value, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayIn(List<Integer> values) {
            addCriterion("ID_InformWay in", values, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayNotIn(List<Integer> values) {
            addCriterion("ID_InformWay not in", values, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayBetween(Integer value1, Integer value2) {
            addCriterion("ID_InformWay between", value1, value2, "idInformway");
            return (Criteria) this;
        }

        public Criteria andIdInformwayNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_InformWay not between", value1, value2, "idInformway");
            return (Criteria) this;
        }

        public Criteria andInformwayNameIsNull() {
            addCriterion("InformWay_Name is null");
            return (Criteria) this;
        }

        public Criteria andInformwayNameIsNotNull() {
            addCriterion("InformWay_Name is not null");
            return (Criteria) this;
        }

        public Criteria andInformwayNameEqualTo(String value) {
            addCriterion("InformWay_Name =", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameNotEqualTo(String value) {
            addCriterion("InformWay_Name <>", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameGreaterThan(String value) {
            addCriterion("InformWay_Name >", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameGreaterThanOrEqualTo(String value) {
            addCriterion("InformWay_Name >=", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameLessThan(String value) {
            addCriterion("InformWay_Name <", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameLessThanOrEqualTo(String value) {
            addCriterion("InformWay_Name <=", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameLike(String value) {
            addCriterion("InformWay_Name like", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameNotLike(String value) {
            addCriterion("InformWay_Name not like", value, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameIn(List<String> values) {
            addCriterion("InformWay_Name in", values, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameNotIn(List<String> values) {
            addCriterion("InformWay_Name not in", values, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameBetween(String value1, String value2) {
            addCriterion("InformWay_Name between", value1, value2, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayNameNotBetween(String value1, String value2) {
            addCriterion("InformWay_Name not between", value1, value2, "informwayName");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeIsNull() {
            addCriterion("InformWay_Code is null");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeIsNotNull() {
            addCriterion("InformWay_Code is not null");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeEqualTo(String value) {
            addCriterion("InformWay_Code =", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeNotEqualTo(String value) {
            addCriterion("InformWay_Code <>", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeGreaterThan(String value) {
            addCriterion("InformWay_Code >", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("InformWay_Code >=", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeLessThan(String value) {
            addCriterion("InformWay_Code <", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeLessThanOrEqualTo(String value) {
            addCriterion("InformWay_Code <=", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeLike(String value) {
            addCriterion("InformWay_Code like", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeNotLike(String value) {
            addCriterion("InformWay_Code not like", value, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeIn(List<String> values) {
            addCriterion("InformWay_Code in", values, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeNotIn(List<String> values) {
            addCriterion("InformWay_Code not in", values, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeBetween(String value1, String value2) {
            addCriterion("InformWay_Code between", value1, value2, "informwayCode");
            return (Criteria) this;
        }

        public Criteria andInformwayCodeNotBetween(String value1, String value2) {
            addCriterion("InformWay_Code not between", value1, value2, "informwayCode");
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

        public Criteria andInformwaycodexIsNull() {
            addCriterion("InformWayCodeX is null");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexIsNotNull() {
            addCriterion("InformWayCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexEqualTo(String value) {
            addCriterion("InformWayCodeX =", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexNotEqualTo(String value) {
            addCriterion("InformWayCodeX <>", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexGreaterThan(String value) {
            addCriterion("InformWayCodeX >", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexGreaterThanOrEqualTo(String value) {
            addCriterion("InformWayCodeX >=", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexLessThan(String value) {
            addCriterion("InformWayCodeX <", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexLessThanOrEqualTo(String value) {
            addCriterion("InformWayCodeX <=", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexLike(String value) {
            addCriterion("InformWayCodeX like", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexNotLike(String value) {
            addCriterion("InformWayCodeX not like", value, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexIn(List<String> values) {
            addCriterion("InformWayCodeX in", values, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexNotIn(List<String> values) {
            addCriterion("InformWayCodeX not in", values, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexBetween(String value1, String value2) {
            addCriterion("InformWayCodeX between", value1, value2, "informwaycodex");
            return (Criteria) this;
        }

        public Criteria andInformwaycodexNotBetween(String value1, String value2) {
            addCriterion("InformWayCodeX not between", value1, value2, "informwaycodex");
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

        public Criteria andFBuiltinEqualTo(Boolean value) {
            addCriterion("F_BuiltIn =", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotEqualTo(Boolean value) {
            addCriterion("F_BuiltIn <>", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThan(Boolean value) {
            addCriterion("F_BuiltIn >", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_BuiltIn >=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThan(Boolean value) {
            addCriterion("F_BuiltIn <", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThanOrEqualTo(Boolean value) {
            addCriterion("F_BuiltIn <=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIn(List<Boolean> values) {
            addCriterion("F_BuiltIn in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotIn(List<Boolean> values) {
            addCriterion("F_BuiltIn not in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinBetween(Boolean value1, Boolean value2) {
            addCriterion("F_BuiltIn between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_BuiltIn not between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeIsNull() {
            addCriterion("InformWay_createtime is null");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeIsNotNull() {
            addCriterion("InformWay_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeEqualTo(Date value) {
            addCriterion("InformWay_createtime =", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeNotEqualTo(Date value) {
            addCriterion("InformWay_createtime <>", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeGreaterThan(Date value) {
            addCriterion("InformWay_createtime >", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InformWay_createtime >=", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeLessThan(Date value) {
            addCriterion("InformWay_createtime <", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("InformWay_createtime <=", value, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeIn(List<Date> values) {
            addCriterion("InformWay_createtime in", values, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeNotIn(List<Date> values) {
            addCriterion("InformWay_createtime not in", values, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeBetween(Date value1, Date value2) {
            addCriterion("InformWay_createtime between", value1, value2, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("InformWay_createtime not between", value1, value2, "informwayCreatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeIsNull() {
            addCriterion("InformWay_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeIsNotNull() {
            addCriterion("InformWay_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeEqualTo(Date value) {
            addCriterion("InformWay_updatetime =", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeNotEqualTo(Date value) {
            addCriterion("InformWay_updatetime <>", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeGreaterThan(Date value) {
            addCriterion("InformWay_updatetime >", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InformWay_updatetime >=", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeLessThan(Date value) {
            addCriterion("InformWay_updatetime <", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("InformWay_updatetime <=", value, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeIn(List<Date> values) {
            addCriterion("InformWay_updatetime in", values, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeNotIn(List<Date> values) {
            addCriterion("InformWay_updatetime not in", values, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("InformWay_updatetime between", value1, value2, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("InformWay_updatetime not between", value1, value2, "informwayUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusIsNull() {
            addCriterion("InformWay_Status is null");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusIsNotNull() {
            addCriterion("InformWay_Status is not null");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusEqualTo(Integer value) {
            addCriterion("InformWay_Status =", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusNotEqualTo(Integer value) {
            addCriterion("InformWay_Status <>", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusGreaterThan(Integer value) {
            addCriterion("InformWay_Status >", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("InformWay_Status >=", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusLessThan(Integer value) {
            addCriterion("InformWay_Status <", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("InformWay_Status <=", value, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusIn(List<Integer> values) {
            addCriterion("InformWay_Status in", values, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusNotIn(List<Integer> values) {
            addCriterion("InformWay_Status not in", values, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusBetween(Integer value1, Integer value2) {
            addCriterion("InformWay_Status between", value1, value2, "informwayStatus");
            return (Criteria) this;
        }

        public Criteria andInformwayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("InformWay_Status not between", value1, value2, "informwayStatus");
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