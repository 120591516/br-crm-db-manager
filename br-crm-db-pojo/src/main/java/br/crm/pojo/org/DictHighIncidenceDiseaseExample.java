package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictHighIncidenceDiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictHighIncidenceDiseaseExample() {
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

        public Criteria andHighIncidenceDiseaseIdIsNull() {
            addCriterion("high_incidence_disease_id is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdIsNotNull() {
            addCriterion("high_incidence_disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdEqualTo(String value) {
            addCriterion("high_incidence_disease_id =", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotEqualTo(String value) {
            addCriterion("high_incidence_disease_id <>", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdGreaterThan(String value) {
            addCriterion("high_incidence_disease_id >", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_id >=", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLessThan(String value) {
            addCriterion("high_incidence_disease_id <", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_id <=", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdLike(String value) {
            addCriterion("high_incidence_disease_id like", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotLike(String value) {
            addCriterion("high_incidence_disease_id not like", value, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdIn(List<String> values) {
            addCriterion("high_incidence_disease_id in", values, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotIn(List<String> values) {
            addCriterion("high_incidence_disease_id not in", values, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_id between", value1, value2, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseIdNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_id not between", value1, value2, "highIncidenceDiseaseId");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameIsNull() {
            addCriterion("high_incidence_disease_name is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameIsNotNull() {
            addCriterion("high_incidence_disease_name is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEqualTo(String value) {
            addCriterion("high_incidence_disease_name =", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameNotEqualTo(String value) {
            addCriterion("high_incidence_disease_name <>", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameGreaterThan(String value) {
            addCriterion("high_incidence_disease_name >", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_name >=", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameLessThan(String value) {
            addCriterion("high_incidence_disease_name <", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_name <=", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameLike(String value) {
            addCriterion("high_incidence_disease_name like", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameNotLike(String value) {
            addCriterion("high_incidence_disease_name not like", value, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameIn(List<String> values) {
            addCriterion("high_incidence_disease_name in", values, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameNotIn(List<String> values) {
            addCriterion("high_incidence_disease_name not in", values, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_name between", value1, value2, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_name not between", value1, value2, "highIncidenceDiseaseName");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngIsNull() {
            addCriterion("high_incidence_disease_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngIsNotNull() {
            addCriterion("high_incidence_disease_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngEqualTo(String value) {
            addCriterion("high_incidence_disease_name_eng =", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngNotEqualTo(String value) {
            addCriterion("high_incidence_disease_name_eng <>", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngGreaterThan(String value) {
            addCriterion("high_incidence_disease_name_eng >", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_name_eng >=", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngLessThan(String value) {
            addCriterion("high_incidence_disease_name_eng <", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_name_eng <=", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngLike(String value) {
            addCriterion("high_incidence_disease_name_eng like", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngNotLike(String value) {
            addCriterion("high_incidence_disease_name_eng not like", value, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngIn(List<String> values) {
            addCriterion("high_incidence_disease_name_eng in", values, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngNotIn(List<String> values) {
            addCriterion("high_incidence_disease_name_eng not in", values, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_name_eng between", value1, value2, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNameEngNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_name_eng not between", value1, value2, "highIncidenceDiseaseNameEng");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeIsNull() {
            addCriterion("high_incidence_disease_code is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeIsNotNull() {
            addCriterion("high_incidence_disease_code is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeEqualTo(String value) {
            addCriterion("high_incidence_disease_code =", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeNotEqualTo(String value) {
            addCriterion("high_incidence_disease_code <>", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeGreaterThan(String value) {
            addCriterion("high_incidence_disease_code >", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_code >=", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeLessThan(String value) {
            addCriterion("high_incidence_disease_code <", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_code <=", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeLike(String value) {
            addCriterion("high_incidence_disease_code like", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeNotLike(String value) {
            addCriterion("high_incidence_disease_code not like", value, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeIn(List<String> values) {
            addCriterion("high_incidence_disease_code in", values, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeNotIn(List<String> values) {
            addCriterion("high_incidence_disease_code not in", values, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_code between", value1, value2, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCodeNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_code not between", value1, value2, "highIncidenceDiseaseCode");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusIsNull() {
            addCriterion("high_incidence_disease_status is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusIsNotNull() {
            addCriterion("high_incidence_disease_status is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusEqualTo(Integer value) {
            addCriterion("high_incidence_disease_status =", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusNotEqualTo(Integer value) {
            addCriterion("high_incidence_disease_status <>", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusGreaterThan(Integer value) {
            addCriterion("high_incidence_disease_status >", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_incidence_disease_status >=", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusLessThan(Integer value) {
            addCriterion("high_incidence_disease_status <", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("high_incidence_disease_status <=", value, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusIn(List<Integer> values) {
            addCriterion("high_incidence_disease_status in", values, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusNotIn(List<Integer> values) {
            addCriterion("high_incidence_disease_status not in", values, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("high_incidence_disease_status between", value1, value2, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("high_incidence_disease_status not between", value1, value2, "highIncidenceDiseaseStatus");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteIsNull() {
            addCriterion("high_incidence_disease_note is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteIsNotNull() {
            addCriterion("high_incidence_disease_note is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteEqualTo(String value) {
            addCriterion("high_incidence_disease_note =", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteNotEqualTo(String value) {
            addCriterion("high_incidence_disease_note <>", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteGreaterThan(String value) {
            addCriterion("high_incidence_disease_note >", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_note >=", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteLessThan(String value) {
            addCriterion("high_incidence_disease_note <", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteLessThanOrEqualTo(String value) {
            addCriterion("high_incidence_disease_note <=", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteLike(String value) {
            addCriterion("high_incidence_disease_note like", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteNotLike(String value) {
            addCriterion("high_incidence_disease_note not like", value, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteIn(List<String> values) {
            addCriterion("high_incidence_disease_note in", values, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteNotIn(List<String> values) {
            addCriterion("high_incidence_disease_note not in", values, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_note between", value1, value2, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseNoteNotBetween(String value1, String value2) {
            addCriterion("high_incidence_disease_note not between", value1, value2, "highIncidenceDiseaseNote");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeIsNull() {
            addCriterion("high_incidence_disease_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeIsNotNull() {
            addCriterion("high_incidence_disease_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeEqualTo(Date value) {
            addCriterion("high_incidence_disease_create_time =", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeNotEqualTo(Date value) {
            addCriterion("high_incidence_disease_create_time <>", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeGreaterThan(Date value) {
            addCriterion("high_incidence_disease_create_time >", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("high_incidence_disease_create_time >=", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeLessThan(Date value) {
            addCriterion("high_incidence_disease_create_time <", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("high_incidence_disease_create_time <=", value, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeIn(List<Date> values) {
            addCriterion("high_incidence_disease_create_time in", values, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeNotIn(List<Date> values) {
            addCriterion("high_incidence_disease_create_time not in", values, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("high_incidence_disease_create_time between", value1, value2, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("high_incidence_disease_create_time not between", value1, value2, "highIncidenceDiseaseCreateTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeIsNull() {
            addCriterion("high_incidence_disease_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeIsNotNull() {
            addCriterion("high_incidence_disease_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeEqualTo(Date value) {
            addCriterion("high_incidence_disease_edit_time =", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeNotEqualTo(Date value) {
            addCriterion("high_incidence_disease_edit_time <>", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeGreaterThan(Date value) {
            addCriterion("high_incidence_disease_edit_time >", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("high_incidence_disease_edit_time >=", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeLessThan(Date value) {
            addCriterion("high_incidence_disease_edit_time <", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("high_incidence_disease_edit_time <=", value, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeIn(List<Date> values) {
            addCriterion("high_incidence_disease_edit_time in", values, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeNotIn(List<Date> values) {
            addCriterion("high_incidence_disease_edit_time not in", values, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeBetween(Date value1, Date value2) {
            addCriterion("high_incidence_disease_edit_time between", value1, value2, "highIncidenceDiseaseEditTime");
            return (Criteria) this;
        }

        public Criteria andHighIncidenceDiseaseEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("high_incidence_disease_edit_time not between", value1, value2, "highIncidenceDiseaseEditTime");
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