package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictsectionExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictsectionExample() {
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

        public Criteria andIdSectionIsNull() {
            addCriterion("ID_Section is null");
            return (Criteria) this;
        }

        public Criteria andIdSectionIsNotNull() {
            addCriterion("ID_Section is not null");
            return (Criteria) this;
        }

        public Criteria andIdSectionEqualTo(Integer value) {
            addCriterion("ID_Section =", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionNotEqualTo(Integer value) {
            addCriterion("ID_Section <>", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionGreaterThan(Integer value) {
            addCriterion("ID_Section >", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_Section >=", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionLessThan(Integer value) {
            addCriterion("ID_Section <", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionLessThanOrEqualTo(Integer value) {
            addCriterion("ID_Section <=", value, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionIn(List<Integer> values) {
            addCriterion("ID_Section in", values, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionNotIn(List<Integer> values) {
            addCriterion("ID_Section not in", values, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionBetween(Integer value1, Integer value2) {
            addCriterion("ID_Section between", value1, value2, "idSection");
            return (Criteria) this;
        }

        public Criteria andIdSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_Section not between", value1, value2, "idSection");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNull() {
            addCriterion("Section_Name is null");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNotNull() {
            addCriterion("Section_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNameEqualTo(String value) {
            addCriterion("Section_Name =", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotEqualTo(String value) {
            addCriterion("Section_Name <>", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThan(String value) {
            addCriterion("Section_Name >", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("Section_Name >=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThan(String value) {
            addCriterion("Section_Name <", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThanOrEqualTo(String value) {
            addCriterion("Section_Name <=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLike(String value) {
            addCriterion("Section_Name like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotLike(String value) {
            addCriterion("Section_Name not like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameIn(List<String> values) {
            addCriterion("Section_Name in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotIn(List<String> values) {
            addCriterion("Section_Name not in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameBetween(String value1, String value2) {
            addCriterion("Section_Name between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotBetween(String value1, String value2) {
            addCriterion("Section_Name not between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIsNull() {
            addCriterion("Section_Code is null");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIsNotNull() {
            addCriterion("Section_Code is not null");
            return (Criteria) this;
        }

        public Criteria andSectionCodeEqualTo(String value) {
            addCriterion("Section_Code =", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotEqualTo(String value) {
            addCriterion("Section_Code <>", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeGreaterThan(String value) {
            addCriterion("Section_Code >", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Section_Code >=", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLessThan(String value) {
            addCriterion("Section_Code <", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLessThanOrEqualTo(String value) {
            addCriterion("Section_Code <=", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeLike(String value) {
            addCriterion("Section_Code like", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotLike(String value) {
            addCriterion("Section_Code not like", value, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeIn(List<String> values) {
            addCriterion("Section_Code in", values, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotIn(List<String> values) {
            addCriterion("Section_Code not in", values, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeBetween(String value1, String value2) {
            addCriterion("Section_Code between", value1, value2, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionCodeNotBetween(String value1, String value2) {
            addCriterion("Section_Code not between", value1, value2, "sectionCode");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIsNull() {
            addCriterion("Section_Type is null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIsNotNull() {
            addCriterion("Section_Type is not null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeEqualTo(String value) {
            addCriterion("Section_Type =", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotEqualTo(String value) {
            addCriterion("Section_Type <>", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThan(String value) {
            addCriterion("Section_Type >", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Section_Type >=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThan(String value) {
            addCriterion("Section_Type <", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThanOrEqualTo(String value) {
            addCriterion("Section_Type <=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLike(String value) {
            addCriterion("Section_Type like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotLike(String value) {
            addCriterion("Section_Type not like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIn(List<String> values) {
            addCriterion("Section_Type in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotIn(List<String> values) {
            addCriterion("Section_Type not in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeBetween(String value1, String value2) {
            addCriterion("Section_Type between", value1, value2, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotBetween(String value1, String value2) {
            addCriterion("Section_Type not between", value1, value2, "sectionType");
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

        public Criteria andSectioncodexIsNull() {
            addCriterion("SectionCodeX is null");
            return (Criteria) this;
        }

        public Criteria andSectioncodexIsNotNull() {
            addCriterion("SectionCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andSectioncodexEqualTo(String value) {
            addCriterion("SectionCodeX =", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexNotEqualTo(String value) {
            addCriterion("SectionCodeX <>", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexGreaterThan(String value) {
            addCriterion("SectionCodeX >", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexGreaterThanOrEqualTo(String value) {
            addCriterion("SectionCodeX >=", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexLessThan(String value) {
            addCriterion("SectionCodeX <", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexLessThanOrEqualTo(String value) {
            addCriterion("SectionCodeX <=", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexLike(String value) {
            addCriterion("SectionCodeX like", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexNotLike(String value) {
            addCriterion("SectionCodeX not like", value, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexIn(List<String> values) {
            addCriterion("SectionCodeX in", values, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexNotIn(List<String> values) {
            addCriterion("SectionCodeX not in", values, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexBetween(String value1, String value2) {
            addCriterion("SectionCodeX between", value1, value2, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectioncodexNotBetween(String value1, String value2) {
            addCriterion("SectionCodeX not between", value1, value2, "sectioncodex");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeIsNull() {
            addCriterion("Section_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeIsNotNull() {
            addCriterion("Section_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeEqualTo(Date value) {
            addCriterion("Section_createtime =", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeNotEqualTo(Date value) {
            addCriterion("Section_createtime <>", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeGreaterThan(Date value) {
            addCriterion("Section_createtime >", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Section_createtime >=", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeLessThan(Date value) {
            addCriterion("Section_createtime <", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Section_createtime <=", value, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeIn(List<Date> values) {
            addCriterion("Section_createtime in", values, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeNotIn(List<Date> values) {
            addCriterion("Section_createtime not in", values, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeBetween(Date value1, Date value2) {
            addCriterion("Section_createtime between", value1, value2, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Section_createtime not between", value1, value2, "sectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeIsNull() {
            addCriterion("Section_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeIsNotNull() {
            addCriterion("Section_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeEqualTo(Date value) {
            addCriterion("Section_updatetime =", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeNotEqualTo(Date value) {
            addCriterion("Section_updatetime <>", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeGreaterThan(Date value) {
            addCriterion("Section_updatetime >", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Section_updatetime >=", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeLessThan(Date value) {
            addCriterion("Section_updatetime <", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Section_updatetime <=", value, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeIn(List<Date> values) {
            addCriterion("Section_updatetime in", values, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeNotIn(List<Date> values) {
            addCriterion("Section_updatetime not in", values, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Section_updatetime between", value1, value2, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Section_updatetime not between", value1, value2, "sectionUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSectionStatusIsNull() {
            addCriterion("Section_Status is null");
            return (Criteria) this;
        }

        public Criteria andSectionStatusIsNotNull() {
            addCriterion("Section_Status is not null");
            return (Criteria) this;
        }

        public Criteria andSectionStatusEqualTo(Integer value) {
            addCriterion("Section_Status =", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusNotEqualTo(Integer value) {
            addCriterion("Section_Status <>", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusGreaterThan(Integer value) {
            addCriterion("Section_Status >", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Section_Status >=", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusLessThan(Integer value) {
            addCriterion("Section_Status <", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Section_Status <=", value, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusIn(List<Integer> values) {
            addCriterion("Section_Status in", values, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusNotIn(List<Integer> values) {
            addCriterion("Section_Status not in", values, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("Section_Status between", value1, value2, "sectionStatus");
            return (Criteria) this;
        }

        public Criteria andSectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Section_Status not between", value1, value2, "sectionStatus");
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