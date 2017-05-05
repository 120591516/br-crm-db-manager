package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusionsuggestionExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusionsuggestionExample() {
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

        public Criteria andIdConclusionsuggestionIsNull() {
            addCriterion("ID_ConclusionSuggestion is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionIsNotNull() {
            addCriterion("ID_ConclusionSuggestion is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionEqualTo(String value) {
            addCriterion("ID_ConclusionSuggestion =", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionNotEqualTo(String value) {
            addCriterion("ID_ConclusionSuggestion <>", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionGreaterThan(String value) {
            addCriterion("ID_ConclusionSuggestion >", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionSuggestion >=", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionLessThan(String value) {
            addCriterion("ID_ConclusionSuggestion <", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionLessThanOrEqualTo(String value) {
            addCriterion("ID_ConclusionSuggestion <=", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionLike(String value) {
            addCriterion("ID_ConclusionSuggestion like", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionNotLike(String value) {
            addCriterion("ID_ConclusionSuggestion not like", value, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionIn(List<String> values) {
            addCriterion("ID_ConclusionSuggestion in", values, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionNotIn(List<String> values) {
            addCriterion("ID_ConclusionSuggestion not in", values, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionBetween(String value1, String value2) {
            addCriterion("ID_ConclusionSuggestion between", value1, value2, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionsuggestionNotBetween(String value1, String value2) {
            addCriterion("ID_ConclusionSuggestion not between", value1, value2, "idConclusionsuggestion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionIsNull() {
            addCriterion("ID_Conclusion is null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionIsNotNull() {
            addCriterion("ID_Conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andIdConclusionEqualTo(String value) {
            addCriterion("ID_Conclusion =", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionNotEqualTo(String value) {
            addCriterion("ID_Conclusion <>", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionGreaterThan(String value) {
            addCriterion("ID_Conclusion >", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion >=", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionLessThan(String value) {
            addCriterion("ID_Conclusion <", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionLessThanOrEqualTo(String value) {
            addCriterion("ID_Conclusion <=", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionLike(String value) {
            addCriterion("ID_Conclusion like", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionNotLike(String value) {
            addCriterion("ID_Conclusion not like", value, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionIn(List<String> values) {
            addCriterion("ID_Conclusion in", values, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionNotIn(List<String> values) {
            addCriterion("ID_Conclusion not in", values, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionBetween(String value1, String value2) {
            addCriterion("ID_Conclusion between", value1, value2, "idConclusion");
            return (Criteria) this;
        }

        public Criteria andIdConclusionNotBetween(String value1, String value2) {
            addCriterion("ID_Conclusion not between", value1, value2, "idConclusion");
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

        public Criteria andConclusionsuggestionTextIsNull() {
            addCriterion("ConclusionSuggestion_Text is null");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextIsNotNull() {
            addCriterion("ConclusionSuggestion_Text is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextEqualTo(String value) {
            addCriterion("ConclusionSuggestion_Text =", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextNotEqualTo(String value) {
            addCriterion("ConclusionSuggestion_Text <>", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextGreaterThan(String value) {
            addCriterion("ConclusionSuggestion_Text >", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextGreaterThanOrEqualTo(String value) {
            addCriterion("ConclusionSuggestion_Text >=", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextLessThan(String value) {
            addCriterion("ConclusionSuggestion_Text <", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextLessThanOrEqualTo(String value) {
            addCriterion("ConclusionSuggestion_Text <=", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextLike(String value) {
            addCriterion("ConclusionSuggestion_Text like", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextNotLike(String value) {
            addCriterion("ConclusionSuggestion_Text not like", value, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextIn(List<String> values) {
            addCriterion("ConclusionSuggestion_Text in", values, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextNotIn(List<String> values) {
            addCriterion("ConclusionSuggestion_Text not in", values, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextBetween(String value1, String value2) {
            addCriterion("ConclusionSuggestion_Text between", value1, value2, "conclusionsuggestionText");
            return (Criteria) this;
        }

        public Criteria andConclusionsuggestionTextNotBetween(String value1, String value2) {
            addCriterion("ConclusionSuggestion_Text not between", value1, value2, "conclusionsuggestionText");
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