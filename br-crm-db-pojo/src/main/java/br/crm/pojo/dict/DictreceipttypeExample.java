package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictreceipttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictreceipttypeExample() {
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

        public Criteria andIdReceipttypeIsNull() {
            addCriterion("ID_ReceiptType is null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeIsNotNull() {
            addCriterion("ID_ReceiptType is not null");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeEqualTo(Long value) {
            addCriterion("ID_ReceiptType =", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotEqualTo(Long value) {
            addCriterion("ID_ReceiptType <>", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeGreaterThan(Long value) {
            addCriterion("ID_ReceiptType >", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ReceiptType >=", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeLessThan(Long value) {
            addCriterion("ID_ReceiptType <", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeLessThanOrEqualTo(Long value) {
            addCriterion("ID_ReceiptType <=", value, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeIn(List<Long> values) {
            addCriterion("ID_ReceiptType in", values, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotIn(List<Long> values) {
            addCriterion("ID_ReceiptType not in", values, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeBetween(Long value1, Long value2) {
            addCriterion("ID_ReceiptType between", value1, value2, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andIdReceipttypeNotBetween(Long value1, Long value2) {
            addCriterion("ID_ReceiptType not between", value1, value2, "idReceipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameIsNull() {
            addCriterion("ReceiptType_Name is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameIsNotNull() {
            addCriterion("ReceiptType_Name is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameEqualTo(String value) {
            addCriterion("ReceiptType_Name =", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameNotEqualTo(String value) {
            addCriterion("ReceiptType_Name <>", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameGreaterThan(String value) {
            addCriterion("ReceiptType_Name >", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Name >=", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameLessThan(String value) {
            addCriterion("ReceiptType_Name <", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameLessThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Name <=", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameLike(String value) {
            addCriterion("ReceiptType_Name like", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameNotLike(String value) {
            addCriterion("ReceiptType_Name not like", value, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameIn(List<String> values) {
            addCriterion("ReceiptType_Name in", values, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameNotIn(List<String> values) {
            addCriterion("ReceiptType_Name not in", values, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameBetween(String value1, String value2) {
            addCriterion("ReceiptType_Name between", value1, value2, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNameNotBetween(String value1, String value2) {
            addCriterion("ReceiptType_Name not between", value1, value2, "receipttypeName");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeIsNull() {
            addCriterion("ReceiptType_Code is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeIsNotNull() {
            addCriterion("ReceiptType_Code is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeEqualTo(String value) {
            addCriterion("ReceiptType_Code =", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeNotEqualTo(String value) {
            addCriterion("ReceiptType_Code <>", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeGreaterThan(String value) {
            addCriterion("ReceiptType_Code >", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Code >=", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeLessThan(String value) {
            addCriterion("ReceiptType_Code <", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeLessThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Code <=", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeLike(String value) {
            addCriterion("ReceiptType_Code like", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeNotLike(String value) {
            addCriterion("ReceiptType_Code not like", value, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeIn(List<String> values) {
            addCriterion("ReceiptType_Code in", values, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeNotIn(List<String> values) {
            addCriterion("ReceiptType_Code not in", values, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeBetween(String value1, String value2) {
            addCriterion("ReceiptType_Code between", value1, value2, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCodeNotBetween(String value1, String value2) {
            addCriterion("ReceiptType_Code not between", value1, value2, "receipttypeCode");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputIsNull() {
            addCriterion("ReceiptType_Output is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputIsNotNull() {
            addCriterion("ReceiptType_Output is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputEqualTo(String value) {
            addCriterion("ReceiptType_Output =", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputNotEqualTo(String value) {
            addCriterion("ReceiptType_Output <>", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputGreaterThan(String value) {
            addCriterion("ReceiptType_Output >", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Output >=", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputLessThan(String value) {
            addCriterion("ReceiptType_Output <", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputLessThanOrEqualTo(String value) {
            addCriterion("ReceiptType_Output <=", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputLike(String value) {
            addCriterion("ReceiptType_Output like", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputNotLike(String value) {
            addCriterion("ReceiptType_Output not like", value, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputIn(List<String> values) {
            addCriterion("ReceiptType_Output in", values, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputNotIn(List<String> values) {
            addCriterion("ReceiptType_Output not in", values, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputBetween(String value1, String value2) {
            addCriterion("ReceiptType_Output between", value1, value2, "receipttypeOutput");
            return (Criteria) this;
        }

        public Criteria andReceipttypeOutputNotBetween(String value1, String value2) {
            addCriterion("ReceiptType_Output not between", value1, value2, "receipttypeOutput");
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

        public Criteria andReceipttypecodexIsNull() {
            addCriterion("ReceiptTypeCodeX is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexIsNotNull() {
            addCriterion("ReceiptTypeCodeX is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexEqualTo(String value) {
            addCriterion("ReceiptTypeCodeX =", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexNotEqualTo(String value) {
            addCriterion("ReceiptTypeCodeX <>", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexGreaterThan(String value) {
            addCriterion("ReceiptTypeCodeX >", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiptTypeCodeX >=", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexLessThan(String value) {
            addCriterion("ReceiptTypeCodeX <", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexLessThanOrEqualTo(String value) {
            addCriterion("ReceiptTypeCodeX <=", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexLike(String value) {
            addCriterion("ReceiptTypeCodeX like", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexNotLike(String value) {
            addCriterion("ReceiptTypeCodeX not like", value, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexIn(List<String> values) {
            addCriterion("ReceiptTypeCodeX in", values, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexNotIn(List<String> values) {
            addCriterion("ReceiptTypeCodeX not in", values, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexBetween(String value1, String value2) {
            addCriterion("ReceiptTypeCodeX between", value1, value2, "receipttypecodex");
            return (Criteria) this;
        }

        public Criteria andReceipttypecodexNotBetween(String value1, String value2) {
            addCriterion("ReceiptTypeCodeX not between", value1, value2, "receipttypecodex");
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

        public Criteria andFBuiltinIsNull() {
            addCriterion("F_BuiltIn is null");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIsNotNull() {
            addCriterion("F_BuiltIn is not null");
            return (Criteria) this;
        }

        public Criteria andFBuiltinEqualTo(Integer value) {
            addCriterion("F_BuiltIn =", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotEqualTo(Integer value) {
            addCriterion("F_BuiltIn <>", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThan(Integer value) {
            addCriterion("F_BuiltIn >", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_BuiltIn >=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThan(Integer value) {
            addCriterion("F_BuiltIn <", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinLessThanOrEqualTo(Integer value) {
            addCriterion("F_BuiltIn <=", value, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinIn(List<Integer> values) {
            addCriterion("F_BuiltIn in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotIn(List<Integer> values) {
            addCriterion("F_BuiltIn not in", values, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinBetween(Integer value1, Integer value2) {
            addCriterion("F_BuiltIn between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andFBuiltinNotBetween(Integer value1, Integer value2) {
            addCriterion("F_BuiltIn not between", value1, value2, "fBuiltin");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeIsNull() {
            addCriterion("ReceiptType_createtime is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeIsNotNull() {
            addCriterion("ReceiptType_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeEqualTo(Date value) {
            addCriterion("ReceiptType_createtime =", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeNotEqualTo(Date value) {
            addCriterion("ReceiptType_createtime <>", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeGreaterThan(Date value) {
            addCriterion("ReceiptType_createtime >", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReceiptType_createtime >=", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeLessThan(Date value) {
            addCriterion("ReceiptType_createtime <", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ReceiptType_createtime <=", value, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeIn(List<Date> values) {
            addCriterion("ReceiptType_createtime in", values, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeNotIn(List<Date> values) {
            addCriterion("ReceiptType_createtime not in", values, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("ReceiptType_createtime between", value1, value2, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ReceiptType_createtime not between", value1, value2, "receipttypeCreatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeIsNull() {
            addCriterion("ReceiptType_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeIsNotNull() {
            addCriterion("ReceiptType_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeEqualTo(Date value) {
            addCriterion("ReceiptType_updatetime =", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeNotEqualTo(Date value) {
            addCriterion("ReceiptType_updatetime <>", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeGreaterThan(Date value) {
            addCriterion("ReceiptType_updatetime >", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReceiptType_updatetime >=", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeLessThan(Date value) {
            addCriterion("ReceiptType_updatetime <", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ReceiptType_updatetime <=", value, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeIn(List<Date> values) {
            addCriterion("ReceiptType_updatetime in", values, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeNotIn(List<Date> values) {
            addCriterion("ReceiptType_updatetime not in", values, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("ReceiptType_updatetime between", value1, value2, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ReceiptType_updatetime not between", value1, value2, "receipttypeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusIsNull() {
            addCriterion("ReceiptType_Status is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusIsNotNull() {
            addCriterion("ReceiptType_Status is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusEqualTo(Integer value) {
            addCriterion("ReceiptType_Status =", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusNotEqualTo(Integer value) {
            addCriterion("ReceiptType_Status <>", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusGreaterThan(Integer value) {
            addCriterion("ReceiptType_Status >", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiptType_Status >=", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusLessThan(Integer value) {
            addCriterion("ReceiptType_Status <", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiptType_Status <=", value, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusIn(List<Integer> values) {
            addCriterion("ReceiptType_Status in", values, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusNotIn(List<Integer> values) {
            addCriterion("ReceiptType_Status not in", values, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusBetween(Integer value1, Integer value2) {
            addCriterion("ReceiptType_Status between", value1, value2, "receipttypeStatus");
            return (Criteria) this;
        }

        public Criteria andReceipttypeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiptType_Status not between", value1, value2, "receipttypeStatus");
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