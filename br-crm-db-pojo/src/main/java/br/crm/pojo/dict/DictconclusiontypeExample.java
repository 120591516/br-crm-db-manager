package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusiontypeExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusiontypeExample() {
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

        public Criteria andIdConclusionTypeIsNull() {
            addCriterion("ID_Conclusion_Type is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeIsNotNull() {
            addCriterion("ID_Conclusion_Type is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeEqualTo(String value) {
            addCriterion("ID_Conclusion_Type =", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeNotEqualTo(String value) {
            addCriterion("ID_Conclusion_Type <>", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeGreaterThan(String value) {
            addCriterion("ID_Conclusion_Type >", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion_Type >=", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeLessThan(String value) {
            addCriterion("ID_Conclusion_Type <", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion_Type <=", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeLike(String value) {
            addCriterion("ID_Conclusion_Type like", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeNotLike(String value) {
            addCriterion("ID_Conclusion_Type not like", value, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeIn(List<String> values) {
            addCriterion("ID_Conclusion_Type in", values, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeNotIn(List<String> values) {
            addCriterion("ID_Conclusion_Type not in", values, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeBetween(String value1, String value2) {
            addCriterion("ID_Conclusion_Type between", value1, value2, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionTypeNotBetween(String value1, String value2) {
            addCriterion("ID_Conclusion_Type not between", value1, value2, "idConclusionType");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameIsNull() {
            addCriterion("Conclusion_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameIsNotNull() {
            addCriterion("Conclusion_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEqualTo(String value) {
            addCriterion("Conclusion_Type_Name =", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameNotEqualTo(String value) {
            addCriterion("Conclusion_Type_Name <>", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameGreaterThan(String value) {
            addCriterion("Conclusion_Type_Name >", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Name >=", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameLessThan(String value) {
            addCriterion("Conclusion_Type_Name <", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Name <=", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameLike(String value) {
            addCriterion("Conclusion_Type_Name like", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameNotLike(String value) {
            addCriterion("Conclusion_Type_Name not like", value, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameIn(List<String> values) {
            addCriterion("Conclusion_Type_Name in", values, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameNotIn(List<String> values) {
            addCriterion("Conclusion_Type_Name not in", values, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Name between", value1, value2, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameNotBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Name not between", value1, value2, "conclusionTypeName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngIsNull() {
            addCriterion("Conclusion_Type_Name_Eng is null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngIsNotNull() {
            addCriterion("Conclusion_Type_Name_Eng is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngEqualTo(String value) {
            addCriterion("Conclusion_Type_Name_Eng =", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngNotEqualTo(String value) {
            addCriterion("Conclusion_Type_Name_Eng <>", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngGreaterThan(String value) {
            addCriterion("Conclusion_Type_Name_Eng >", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Name_Eng >=", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngLessThan(String value) {
            addCriterion("Conclusion_Type_Name_Eng <", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Name_Eng <=", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngLike(String value) {
            addCriterion("Conclusion_Type_Name_Eng like", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngNotLike(String value) {
            addCriterion("Conclusion_Type_Name_Eng not like", value, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngIn(List<String> values) {
            addCriterion("Conclusion_Type_Name_Eng in", values, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngNotIn(List<String> values) {
            addCriterion("Conclusion_Type_Name_Eng not in", values, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Name_Eng between", value1, value2, "conclusionTypeNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeNameEngNotBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Name_Eng not between", value1, value2, "conclusionTypeNameEng");
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

        public Criteria andDisporderIsNull() {
            addCriterion("DispOrder is null");
            return (Criteria) this;
        }

        public Criteria andDisporderIsNotNull() {
            addCriterion("DispOrder is not null");
            return (Criteria) this;
        }

        public Criteria andDisporderEqualTo(String value) {
            addCriterion("DispOrder =", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderNotEqualTo(String value) {
            addCriterion("DispOrder <>", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderGreaterThan(String value) {
            addCriterion("DispOrder >", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderGreaterThanOrEqualTo(String value) {
            addCriterion("DispOrder >=", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderLessThan(String value) {
            addCriterion("DispOrder <", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderLessThanOrEqualTo(String value) {
            addCriterion("DispOrder <=", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderLike(String value) {
            addCriterion("DispOrder like", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderNotLike(String value) {
            addCriterion("DispOrder not like", value, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderIn(List<String> values) {
            addCriterion("DispOrder in", values, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderNotIn(List<String> values) {
            addCriterion("DispOrder not in", values, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderBetween(String value1, String value2) {
            addCriterion("DispOrder between", value1, value2, "disporder");
            return (Criteria) this;
        }

        public Criteria andDisporderNotBetween(String value1, String value2) {
            addCriterion("DispOrder not between", value1, value2, "disporder");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
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