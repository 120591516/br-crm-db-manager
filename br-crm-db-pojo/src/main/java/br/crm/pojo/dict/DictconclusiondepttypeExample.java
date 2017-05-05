package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusiondepttypeExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusiondepttypeExample() {
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

        public Criteria andIdConclusionDeptTypeIsNull() {
            addCriterion("ID_Conclusion_Dept_Type is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeIsNotNull() {
            addCriterion("ID_Conclusion_Dept_Type is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeEqualTo(String value) {
            addCriterion("ID_Conclusion_Dept_Type =", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeNotEqualTo(String value) {
            addCriterion("ID_Conclusion_Dept_Type <>", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeGreaterThan(String value) {
            addCriterion("ID_Conclusion_Dept_Type >", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion_Dept_Type >=", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeLessThan(String value) {
            addCriterion("ID_Conclusion_Dept_Type <", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion_Dept_Type <=", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeLike(String value) {
            addCriterion("ID_Conclusion_Dept_Type like", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeNotLike(String value) {
            addCriterion("ID_Conclusion_Dept_Type not like", value, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeIn(List<String> values) {
            addCriterion("ID_Conclusion_Dept_Type in", values, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeNotIn(List<String> values) {
            addCriterion("ID_Conclusion_Dept_Type not in", values, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeBetween(String value1, String value2) {
            addCriterion("ID_Conclusion_Dept_Type between", value1, value2, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andIdConclusionDeptTypeNotBetween(String value1, String value2) {
            addCriterion("ID_Conclusion_Dept_Type not between", value1, value2, "idConclusionDeptType");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameIsNull() {
            addCriterion("Conclusion_Type_Dept_Name is null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameIsNotNull() {
            addCriterion("Conclusion_Type_Dept_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name =", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameNotEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name <>", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameGreaterThan(String value) {
            addCriterion("Conclusion_Type_Dept_Name >", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name >=", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameLessThan(String value) {
            addCriterion("Conclusion_Type_Dept_Name <", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name <=", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameLike(String value) {
            addCriterion("Conclusion_Type_Dept_Name like", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameNotLike(String value) {
            addCriterion("Conclusion_Type_Dept_Name not like", value, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameIn(List<String> values) {
            addCriterion("Conclusion_Type_Dept_Name in", values, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameNotIn(List<String> values) {
            addCriterion("Conclusion_Type_Dept_Name not in", values, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Dept_Name between", value1, value2, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameNotBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Dept_Name not between", value1, value2, "conclusionTypeDeptName");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngIsNull() {
            addCriterion("Conclusion_Type_Dept_Name_Eng is null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngIsNotNull() {
            addCriterion("Conclusion_Type_Dept_Name_Eng is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng =", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngNotEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng <>", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngGreaterThan(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng >", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng >=", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngLessThan(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng <", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng <=", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngLike(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng like", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngNotLike(String value) {
            addCriterion("Conclusion_Type_Dept_Name_Eng not like", value, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngIn(List<String> values) {
            addCriterion("Conclusion_Type_Dept_Name_Eng in", values, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngNotIn(List<String> values) {
            addCriterion("Conclusion_Type_Dept_Name_Eng not in", values, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Dept_Name_Eng between", value1, value2, "conclusionTypeDeptNameEng");
            return (Criteria) this;
        }

        public Criteria andConclusionTypeDeptNameEngNotBetween(String value1, String value2) {
            addCriterion("Conclusion_Type_Dept_Name_Eng not between", value1, value2, "conclusionTypeDeptNameEng");
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