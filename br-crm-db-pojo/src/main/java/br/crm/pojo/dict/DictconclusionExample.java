package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictconclusionExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictconclusionExample() {
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

        public Criteria andConclusionNameIsNull() {
            addCriterion("Conclusion_Name is null");
            return (Criteria) this;
        }

        public Criteria andConclusionNameIsNotNull() {
            addCriterion("Conclusion_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionNameEqualTo(String value) {
            addCriterion("Conclusion_Name =", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameNotEqualTo(String value) {
            addCriterion("Conclusion_Name <>", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameGreaterThan(String value) {
            addCriterion("Conclusion_Name >", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_Name >=", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameLessThan(String value) {
            addCriterion("Conclusion_Name <", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_Name <=", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameLike(String value) {
            addCriterion("Conclusion_Name like", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameNotLike(String value) {
            addCriterion("Conclusion_Name not like", value, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameIn(List<String> values) {
            addCriterion("Conclusion_Name in", values, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameNotIn(List<String> values) {
            addCriterion("Conclusion_Name not in", values, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameBetween(String value1, String value2) {
            addCriterion("Conclusion_Name between", value1, value2, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameNotBetween(String value1, String value2) {
            addCriterion("Conclusion_Name not between", value1, value2, "conclusionName");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengIsNull() {
            addCriterion("Conclusion_NameEng is null");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengIsNotNull() {
            addCriterion("Conclusion_NameEng is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengEqualTo(String value) {
            addCriterion("Conclusion_NameEng =", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengNotEqualTo(String value) {
            addCriterion("Conclusion_NameEng <>", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengGreaterThan(String value) {
            addCriterion("Conclusion_NameEng >", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengGreaterThanOrEqualTo(String value) {
            addCriterion("Conclusion_NameEng >=", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengLessThan(String value) {
            addCriterion("Conclusion_NameEng <", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengLessThanOrEqualTo(String value) {
            addCriterion("Conclusion_NameEng <=", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengLike(String value) {
            addCriterion("Conclusion_NameEng like", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengNotLike(String value) {
            addCriterion("Conclusion_NameEng not like", value, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengIn(List<String> values) {
            addCriterion("Conclusion_NameEng in", values, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengNotIn(List<String> values) {
            addCriterion("Conclusion_NameEng not in", values, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengBetween(String value1, String value2) {
            addCriterion("Conclusion_NameEng between", value1, value2, "conclusionNameeng");
            return (Criteria) this;
        }

        public Criteria andConclusionNameengNotBetween(String value1, String value2) {
            addCriterion("Conclusion_NameEng not between", value1, value2, "conclusionNameeng");
            return (Criteria) this;
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

        public Criteria andKeyconclusiongroupidIsNull() {
            addCriterion("KeyConclusionGroupId is null");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidIsNotNull() {
            addCriterion("KeyConclusionGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidEqualTo(String value) {
            addCriterion("KeyConclusionGroupId =", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotEqualTo(String value) {
            addCriterion("KeyConclusionGroupId <>", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidGreaterThan(String value) {
            addCriterion("KeyConclusionGroupId >", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidGreaterThanOrEqualTo(String value) {
            addCriterion("KeyConclusionGroupId >=", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLessThan(String value) {
            addCriterion("KeyConclusionGroupId <", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLessThanOrEqualTo(String value) {
            addCriterion("KeyConclusionGroupId <=", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidLike(String value) {
            addCriterion("KeyConclusionGroupId like", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotLike(String value) {
            addCriterion("KeyConclusionGroupId not like", value, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidIn(List<String> values) {
            addCriterion("KeyConclusionGroupId in", values, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotIn(List<String> values) {
            addCriterion("KeyConclusionGroupId not in", values, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidBetween(String value1, String value2) {
            addCriterion("KeyConclusionGroupId between", value1, value2, "keyconclusiongroupid");
            return (Criteria) this;
        }

        public Criteria andKeyconclusiongroupidNotBetween(String value1, String value2) {
            addCriterion("KeyConclusionGroupId not between", value1, value2, "keyconclusiongroupid");
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

        public Criteria andFMalediseaseIsNull() {
            addCriterion("F_MaleDisease is null");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseIsNotNull() {
            addCriterion("F_MaleDisease is not null");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseEqualTo(Integer value) {
            addCriterion("F_MaleDisease =", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseNotEqualTo(Integer value) {
            addCriterion("F_MaleDisease <>", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseGreaterThan(Integer value) {
            addCriterion("F_MaleDisease >", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_MaleDisease >=", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseLessThan(Integer value) {
            addCriterion("F_MaleDisease <", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseLessThanOrEqualTo(Integer value) {
            addCriterion("F_MaleDisease <=", value, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseIn(List<Integer> values) {
            addCriterion("F_MaleDisease in", values, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseNotIn(List<Integer> values) {
            addCriterion("F_MaleDisease not in", values, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseBetween(Integer value1, Integer value2) {
            addCriterion("F_MaleDisease between", value1, value2, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFMalediseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("F_MaleDisease not between", value1, value2, "fMaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseIsNull() {
            addCriterion("F_FemaleDisease is null");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseIsNotNull() {
            addCriterion("F_FemaleDisease is not null");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseEqualTo(Integer value) {
            addCriterion("F_FemaleDisease =", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseNotEqualTo(Integer value) {
            addCriterion("F_FemaleDisease <>", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseGreaterThan(Integer value) {
            addCriterion("F_FemaleDisease >", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_FemaleDisease >=", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseLessThan(Integer value) {
            addCriterion("F_FemaleDisease <", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseLessThanOrEqualTo(Integer value) {
            addCriterion("F_FemaleDisease <=", value, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseIn(List<Integer> values) {
            addCriterion("F_FemaleDisease in", values, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseNotIn(List<Integer> values) {
            addCriterion("F_FemaleDisease not in", values, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseBetween(Integer value1, Integer value2) {
            addCriterion("F_FemaleDisease between", value1, value2, "fFemaledisease");
            return (Criteria) this;
        }

        public Criteria andFFemalediseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("F_FemaleDisease not between", value1, value2, "fFemaledisease");
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