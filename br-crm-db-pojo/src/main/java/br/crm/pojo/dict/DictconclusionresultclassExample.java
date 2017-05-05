package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusionresultclassExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusionresultclassExample() {
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

        public Criteria andIdConclusionresultclassIsNull() {
            addCriterion("ID_ConclusionResultClass is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassIsNotNull() {
            addCriterion("ID_ConclusionResultClass is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassEqualTo(String value) {
            addCriterion("ID_ConclusionResultClass =", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassNotEqualTo(String value) {
            addCriterion("ID_ConclusionResultClass <>", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassGreaterThan(String value) {
            addCriterion("ID_ConclusionResultClass >", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionResultClass >=", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassLessThan(String value) {
            addCriterion("ID_ConclusionResultClass <", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassLessThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionResultClass <=", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassLike(String value) {
            addCriterion("ID_ConclusionResultClass like", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassNotLike(String value) {
            addCriterion("ID_ConclusionResultClass not like", value, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassIn(List<String> values) {
            addCriterion("ID_ConclusionResultClass in", values, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassNotIn(List<String> values) {
            addCriterion("ID_ConclusionResultClass not in", values, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassBetween(String value1, String value2) {
            addCriterion("ID_ConclusionResultClass between", value1, value2, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andIdConclusionresultclassNotBetween(String value1, String value2) {
            addCriterion("ID_ConclusionResultClass not between", value1, value2, "idConclusionresultclass");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameIsNull() {
            addCriterion("ConclusionResultClass_Name is null");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameIsNotNull() {
            addCriterion("ConclusionResultClass_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name =", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameNotEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name <>", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameGreaterThan(String value) {
            addCriterion("ConclusionResultClass_Name >", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name >=", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameLessThan(String value) {
            addCriterion("ConclusionResultClass_Name <", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameLessThanOrEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name <=", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameLike(String value) {
            addCriterion("ConclusionResultClass_Name like", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameNotLike(String value) {
            addCriterion("ConclusionResultClass_Name not like", value, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameIn(List<String> values) {
            addCriterion("ConclusionResultClass_Name in", values, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameNotIn(List<String> values) {
            addCriterion("ConclusionResultClass_Name not in", values, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameBetween(String value1, String value2) {
            addCriterion("ConclusionResultClass_Name between", value1, value2, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameNotBetween(String value1, String value2) {
            addCriterion("ConclusionResultClass_Name not between", value1, value2, "conclusionresultclassName");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngIsNull() {
            addCriterion("ConclusionResultClass_Name_Eng is null");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngIsNotNull() {
            addCriterion("ConclusionResultClass_Name_Eng is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name_Eng =", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngNotEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name_Eng <>", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngGreaterThan(String value) {
            addCriterion("ConclusionResultClass_Name_Eng >", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name_Eng >=", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngLessThan(String value) {
            addCriterion("ConclusionResultClass_Name_Eng <", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngLessThanOrEqualTo(String value) {
            addCriterion("ConclusionResultClass_Name_Eng <=", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngLike(String value) {
            addCriterion("ConclusionResultClass_Name_Eng like", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngNotLike(String value) {
            addCriterion("ConclusionResultClass_Name_Eng not like", value, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngIn(List<String> values) {
            addCriterion("ConclusionResultClass_Name_Eng in", values, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngNotIn(List<String> values) {
            addCriterion("ConclusionResultClass_Name_Eng not in", values, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngBetween(String value1, String value2) {
            addCriterion("ConclusionResultClass_Name_Eng between", value1, value2, "conclusionresultclassNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionresultclassNameEngNotBetween(String value1, String value2) {
            addCriterion("ConclusionResultClass_Name_Eng not between", value1, value2, "conclusionresultclassNameEng");
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