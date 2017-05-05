package br.crm.pojo.branch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationBranchImgExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationBranchImgExample() {
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

        public Criteria andOrgBranchImgIdIsNull() {
            addCriterion("org_branch_img_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdIsNotNull() {
            addCriterion("org_branch_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdEqualTo(String value) {
            addCriterion("org_branch_img_id =", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdNotEqualTo(String value) {
            addCriterion("org_branch_img_id <>", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdGreaterThan(String value) {
            addCriterion("org_branch_img_id >", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_img_id >=", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdLessThan(String value) {
            addCriterion("org_branch_img_id <", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdLessThanOrEqualTo(String value) {
            addCriterion("org_branch_img_id <=", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdLike(String value) {
            addCriterion("org_branch_img_id like", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdNotLike(String value) {
            addCriterion("org_branch_img_id not like", value, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdIn(List<String> values) {
            addCriterion("org_branch_img_id in", values, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdNotIn(List<String> values) {
            addCriterion("org_branch_img_id not in", values, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdBetween(String value1, String value2) {
            addCriterion("org_branch_img_id between", value1, value2, "orgBranchImgId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgIdNotBetween(String value1, String value2) {
            addCriterion("org_branch_img_id not between", value1, value2, "orgBranchImgId");
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

        public Criteria andOrgBranchIdIsNull() {
            addCriterion("org_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIsNotNull() {
            addCriterion("org_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdEqualTo(String value) {
            addCriterion("org_branch_id =", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotEqualTo(String value) {
            addCriterion("org_branch_id <>", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThan(String value) {
            addCriterion("org_branch_id >", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_id >=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThan(String value) {
            addCriterion("org_branch_id <", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLessThanOrEqualTo(String value) {
            addCriterion("org_branch_id <=", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdLike(String value) {
            addCriterion("org_branch_id like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotLike(String value) {
            addCriterion("org_branch_id not like", value, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdIn(List<String> values) {
            addCriterion("org_branch_id in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotIn(List<String> values) {
            addCriterion("org_branch_id not in", values, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdBetween(String value1, String value2) {
            addCriterion("org_branch_id between", value1, value2, "orgBranchId");
            return (Criteria) this;
        }

        public Criteria andOrgBranchIdNotBetween(String value1, String value2) {
            addCriterion("org_branch_id not between", value1, value2, "orgBranchId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeIsNull() {
            addCriterion("org_branch_img_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeIsNotNull() {
            addCriterion("org_branch_img_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeEqualTo(Integer value) {
            addCriterion("org_branch_img_type =", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeNotEqualTo(Integer value) {
            addCriterion("org_branch_img_type <>", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeGreaterThan(Integer value) {
            addCriterion("org_branch_img_type >", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_branch_img_type >=", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeLessThan(Integer value) {
            addCriterion("org_branch_img_type <", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("org_branch_img_type <=", value, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeIn(List<Integer> values) {
            addCriterion("org_branch_img_type in", values, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeNotIn(List<Integer> values) {
            addCriterion("org_branch_img_type not in", values, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeBetween(Integer value1, Integer value2) {
            addCriterion("org_branch_img_type between", value1, value2, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_branch_img_type not between", value1, value2, "orgBranchImgType");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteIsNull() {
            addCriterion("org_branch_img_note is null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteIsNotNull() {
            addCriterion("org_branch_img_note is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteEqualTo(String value) {
            addCriterion("org_branch_img_note =", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteNotEqualTo(String value) {
            addCriterion("org_branch_img_note <>", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteGreaterThan(String value) {
            addCriterion("org_branch_img_note >", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteGreaterThanOrEqualTo(String value) {
            addCriterion("org_branch_img_note >=", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteLessThan(String value) {
            addCriterion("org_branch_img_note <", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteLessThanOrEqualTo(String value) {
            addCriterion("org_branch_img_note <=", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteLike(String value) {
            addCriterion("org_branch_img_note like", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteNotLike(String value) {
            addCriterion("org_branch_img_note not like", value, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteIn(List<String> values) {
            addCriterion("org_branch_img_note in", values, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteNotIn(List<String> values) {
            addCriterion("org_branch_img_note not in", values, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteBetween(String value1, String value2) {
            addCriterion("org_branch_img_note between", value1, value2, "orgBranchImgNote");
            return (Criteria) this;
        }

        public Criteria andOrgBranchImgNoteNotBetween(String value1, String value2) {
            addCriterion("org_branch_img_note not between", value1, value2, "orgBranchImgNote");
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