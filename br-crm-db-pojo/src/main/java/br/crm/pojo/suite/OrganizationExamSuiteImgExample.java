package br.crm.pojo.suite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamSuiteImgExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamSuiteImgExample() {
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

        public Criteria andOrgExamSuiteImgIdIsNull() {
            addCriterion("org_exam_suite_img_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdIsNotNull() {
            addCriterion("org_exam_suite_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdEqualTo(String value) {
            addCriterion("org_exam_suite_img_id =", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdNotEqualTo(String value) {
            addCriterion("org_exam_suite_img_id <>", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdGreaterThan(String value) {
            addCriterion("org_exam_suite_img_id >", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_img_id >=", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdLessThan(String value) {
            addCriterion("org_exam_suite_img_id <", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdLessThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_img_id <=", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdLike(String value) {
            addCriterion("org_exam_suite_img_id like", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdNotLike(String value) {
            addCriterion("org_exam_suite_img_id not like", value, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdIn(List<String> values) {
            addCriterion("org_exam_suite_img_id in", values, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdNotIn(List<String> values) {
            addCriterion("org_exam_suite_img_id not in", values, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdBetween(String value1, String value2) {
            addCriterion("org_exam_suite_img_id between", value1, value2, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgIdNotBetween(String value1, String value2) {
            addCriterion("org_exam_suite_img_id not between", value1, value2, "orgExamSuiteImgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdIsNull() {
            addCriterion("org_exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdIsNotNull() {
            addCriterion("org_exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdEqualTo(String value) {
            addCriterion("org_exam_suite_id =", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdNotEqualTo(String value) {
            addCriterion("org_exam_suite_id <>", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdGreaterThan(String value) {
            addCriterion("org_exam_suite_id >", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_id >=", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdLessThan(String value) {
            addCriterion("org_exam_suite_id <", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_id <=", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdLike(String value) {
            addCriterion("org_exam_suite_id like", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdNotLike(String value) {
            addCriterion("org_exam_suite_id not like", value, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdIn(List<String> values) {
            addCriterion("org_exam_suite_id in", values, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdNotIn(List<String> values) {
            addCriterion("org_exam_suite_id not in", values, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdBetween(String value1, String value2) {
            addCriterion("org_exam_suite_id between", value1, value2, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("org_exam_suite_id not between", value1, value2, "orgExamSuiteId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdIsNull() {
            addCriterion("dict_img_id is null");
            return (Criteria) this;
        }

        public Criteria andDictImgIdIsNotNull() {
            addCriterion("dict_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictImgIdEqualTo(Long value) {
            addCriterion("dict_img_id =", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdNotEqualTo(Long value) {
            addCriterion("dict_img_id <>", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdGreaterThan(Long value) {
            addCriterion("dict_img_id >", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_img_id >=", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdLessThan(Long value) {
            addCriterion("dict_img_id <", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_img_id <=", value, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdIn(List<Long> values) {
            addCriterion("dict_img_id in", values, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdNotIn(List<Long> values) {
            addCriterion("dict_img_id not in", values, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdBetween(Long value1, Long value2) {
            addCriterion("dict_img_id between", value1, value2, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andDictImgIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_img_id not between", value1, value2, "dictImgId");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeIsNull() {
            addCriterion("org_exam_suite_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeIsNotNull() {
            addCriterion("org_exam_suite_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeEqualTo(Date value) {
            addCriterion("org_exam_suite_create_time =", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeNotEqualTo(Date value) {
            addCriterion("org_exam_suite_create_time <>", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeGreaterThan(Date value) {
            addCriterion("org_exam_suite_create_time >", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_exam_suite_create_time >=", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeLessThan(Date value) {
            addCriterion("org_exam_suite_create_time <", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_exam_suite_create_time <=", value, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeIn(List<Date> values) {
            addCriterion("org_exam_suite_create_time in", values, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeNotIn(List<Date> values) {
            addCriterion("org_exam_suite_create_time not in", values, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_exam_suite_create_time between", value1, value2, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_exam_suite_create_time not between", value1, value2, "orgExamSuiteCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeIsNull() {
            addCriterion("org_exam_suite_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeIsNotNull() {
            addCriterion("org_exam_suite_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeEqualTo(Date value) {
            addCriterion("org_exam_suite_edit_time =", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeNotEqualTo(Date value) {
            addCriterion("org_exam_suite_edit_time <>", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeGreaterThan(Date value) {
            addCriterion("org_exam_suite_edit_time >", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_exam_suite_edit_time >=", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeLessThan(Date value) {
            addCriterion("org_exam_suite_edit_time <", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_exam_suite_edit_time <=", value, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeIn(List<Date> values) {
            addCriterion("org_exam_suite_edit_time in", values, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeNotIn(List<Date> values) {
            addCriterion("org_exam_suite_edit_time not in", values, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_exam_suite_edit_time between", value1, value2, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_exam_suite_edit_time not between", value1, value2, "orgExamSuiteEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusIsNull() {
            addCriterion("org_exam_suite_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusIsNotNull() {
            addCriterion("org_exam_suite_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusEqualTo(Integer value) {
            addCriterion("org_exam_suite_status =", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusNotEqualTo(Integer value) {
            addCriterion("org_exam_suite_status <>", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusGreaterThan(Integer value) {
            addCriterion("org_exam_suite_status >", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_exam_suite_status >=", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusLessThan(Integer value) {
            addCriterion("org_exam_suite_status <", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_exam_suite_status <=", value, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusIn(List<Integer> values) {
            addCriterion("org_exam_suite_status in", values, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusNotIn(List<Integer> values) {
            addCriterion("org_exam_suite_status not in", values, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_exam_suite_status between", value1, value2, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_exam_suite_status not between", value1, value2, "orgExamSuiteStatus");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeIsNull() {
            addCriterion("org_exam_suite_img_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeIsNotNull() {
            addCriterion("org_exam_suite_img_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeEqualTo(Integer value) {
            addCriterion("org_exam_suite_img_type =", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeNotEqualTo(Integer value) {
            addCriterion("org_exam_suite_img_type <>", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeGreaterThan(Integer value) {
            addCriterion("org_exam_suite_img_type >", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_exam_suite_img_type >=", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeLessThan(Integer value) {
            addCriterion("org_exam_suite_img_type <", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("org_exam_suite_img_type <=", value, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeIn(List<Integer> values) {
            addCriterion("org_exam_suite_img_type in", values, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeNotIn(List<Integer> values) {
            addCriterion("org_exam_suite_img_type not in", values, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeBetween(Integer value1, Integer value2) {
            addCriterion("org_exam_suite_img_type between", value1, value2, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_exam_suite_img_type not between", value1, value2, "orgExamSuiteImgType");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeIsNull() {
            addCriterion("org_exam_suite_img_node is null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeIsNotNull() {
            addCriterion("org_exam_suite_img_node is not null");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeEqualTo(String value) {
            addCriterion("org_exam_suite_img_node =", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeNotEqualTo(String value) {
            addCriterion("org_exam_suite_img_node <>", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeGreaterThan(String value) {
            addCriterion("org_exam_suite_img_node >", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_img_node >=", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeLessThan(String value) {
            addCriterion("org_exam_suite_img_node <", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeLessThanOrEqualTo(String value) {
            addCriterion("org_exam_suite_img_node <=", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeLike(String value) {
            addCriterion("org_exam_suite_img_node like", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeNotLike(String value) {
            addCriterion("org_exam_suite_img_node not like", value, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeIn(List<String> values) {
            addCriterion("org_exam_suite_img_node in", values, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeNotIn(List<String> values) {
            addCriterion("org_exam_suite_img_node not in", values, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeBetween(String value1, String value2) {
            addCriterion("org_exam_suite_img_node between", value1, value2, "orgExamSuiteImgNode");
            return (Criteria) this;
        }

        public Criteria andOrgExamSuiteImgNodeNotBetween(String value1, String value2) {
            addCriterion("org_exam_suite_img_node not between", value1, value2, "orgExamSuiteImgNode");
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