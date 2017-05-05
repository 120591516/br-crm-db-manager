package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamItemUserExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamItemUserExample() {
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

        public Criteria andOrganizationExamItemUserIdIsNull() {
            addCriterion("organization_exam_item_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdIsNotNull() {
            addCriterion("organization_exam_item_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdEqualTo(String value) {
            addCriterion("organization_exam_item_user_id =", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdNotEqualTo(String value) {
            addCriterion("organization_exam_item_user_id <>", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdGreaterThan(String value) {
            addCriterion("organization_exam_item_user_id >", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_exam_item_user_id >=", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdLessThan(String value) {
            addCriterion("organization_exam_item_user_id <", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdLessThanOrEqualTo(String value) {
            addCriterion("organization_exam_item_user_id <=", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdLike(String value) {
            addCriterion("organization_exam_item_user_id like", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdNotLike(String value) {
            addCriterion("organization_exam_item_user_id not like", value, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdIn(List<String> values) {
            addCriterion("organization_exam_item_user_id in", values, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdNotIn(List<String> values) {
            addCriterion("organization_exam_item_user_id not in", values, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdBetween(String value1, String value2) {
            addCriterion("organization_exam_item_user_id between", value1, value2, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemUserIdNotBetween(String value1, String value2) {
            addCriterion("organization_exam_item_user_id not between", value1, value2, "organizationExamItemUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdIsNull() {
            addCriterion("organization_exam_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdIsNotNull() {
            addCriterion("organization_exam_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdEqualTo(String value) {
            addCriterion("organization_exam_item_id =", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdNotEqualTo(String value) {
            addCriterion("organization_exam_item_id <>", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdGreaterThan(String value) {
            addCriterion("organization_exam_item_id >", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_exam_item_id >=", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdLessThan(String value) {
            addCriterion("organization_exam_item_id <", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdLessThanOrEqualTo(String value) {
            addCriterion("organization_exam_item_id <=", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdLike(String value) {
            addCriterion("organization_exam_item_id like", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdNotLike(String value) {
            addCriterion("organization_exam_item_id not like", value, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdIn(List<String> values) {
            addCriterion("organization_exam_item_id in", values, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdNotIn(List<String> values) {
            addCriterion("organization_exam_item_id not in", values, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdBetween(String value1, String value2) {
            addCriterion("organization_exam_item_id between", value1, value2, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemIdNotBetween(String value1, String value2) {
            addCriterion("organization_exam_item_id not between", value1, value2, "organizationExamItemId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("organization_id like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("organization_id not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIsNull() {
            addCriterion("organization_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIsNotNull() {
            addCriterion("organization_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdEqualTo(String value) {
            addCriterion("organization_branch_id =", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotEqualTo(String value) {
            addCriterion("organization_branch_id <>", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdGreaterThan(String value) {
            addCriterion("organization_branch_id >", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_branch_id >=", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLessThan(String value) {
            addCriterion("organization_branch_id <", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLessThanOrEqualTo(String value) {
            addCriterion("organization_branch_id <=", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdLike(String value) {
            addCriterion("organization_branch_id like", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotLike(String value) {
            addCriterion("organization_branch_id not like", value, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdIn(List<String> values) {
            addCriterion("organization_branch_id in", values, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotIn(List<String> values) {
            addCriterion("organization_branch_id not in", values, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdBetween(String value1, String value2) {
            addCriterion("organization_branch_id between", value1, value2, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchIdNotBetween(String value1, String value2) {
            addCriterion("organization_branch_id not between", value1, value2, "organizationBranchId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdIsNull() {
            addCriterion("organization_branch_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdIsNotNull() {
            addCriterion("organization_branch_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdEqualTo(String value) {
            addCriterion("organization_branch_dept_id =", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdNotEqualTo(String value) {
            addCriterion("organization_branch_dept_id <>", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdGreaterThan(String value) {
            addCriterion("organization_branch_dept_id >", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_branch_dept_id >=", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdLessThan(String value) {
            addCriterion("organization_branch_dept_id <", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdLessThanOrEqualTo(String value) {
            addCriterion("organization_branch_dept_id <=", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdLike(String value) {
            addCriterion("organization_branch_dept_id like", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdNotLike(String value) {
            addCriterion("organization_branch_dept_id not like", value, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdIn(List<String> values) {
            addCriterion("organization_branch_dept_id in", values, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdNotIn(List<String> values) {
            addCriterion("organization_branch_dept_id not in", values, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdBetween(String value1, String value2) {
            addCriterion("organization_branch_dept_id between", value1, value2, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationBranchDeptIdNotBetween(String value1, String value2) {
            addCriterion("organization_branch_dept_id not between", value1, value2, "organizationBranchDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdIsNull() {
            addCriterion("organization_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdIsNotNull() {
            addCriterion("organization_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdEqualTo(String value) {
            addCriterion("organization_user_id =", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdNotEqualTo(String value) {
            addCriterion("organization_user_id <>", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdGreaterThan(String value) {
            addCriterion("organization_user_id >", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_user_id >=", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdLessThan(String value) {
            addCriterion("organization_user_id <", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdLessThanOrEqualTo(String value) {
            addCriterion("organization_user_id <=", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdLike(String value) {
            addCriterion("organization_user_id like", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdNotLike(String value) {
            addCriterion("organization_user_id not like", value, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdIn(List<String> values) {
            addCriterion("organization_user_id in", values, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdNotIn(List<String> values) {
            addCriterion("organization_user_id not in", values, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdBetween(String value1, String value2) {
            addCriterion("organization_user_id between", value1, value2, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUserIdNotBetween(String value1, String value2) {
            addCriterion("organization_user_id not between", value1, value2, "organizationUserId");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusIsNull() {
            addCriterion("organization_exam_item_status is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusIsNotNull() {
            addCriterion("organization_exam_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusEqualTo(Integer value) {
            addCriterion("organization_exam_item_status =", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusNotEqualTo(Integer value) {
            addCriterion("organization_exam_item_status <>", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusGreaterThan(Integer value) {
            addCriterion("organization_exam_item_status >", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_exam_item_status >=", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusLessThan(Integer value) {
            addCriterion("organization_exam_item_status <", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("organization_exam_item_status <=", value, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusIn(List<Integer> values) {
            addCriterion("organization_exam_item_status in", values, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusNotIn(List<Integer> values) {
            addCriterion("organization_exam_item_status not in", values, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("organization_exam_item_status between", value1, value2, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_exam_item_status not between", value1, value2, "organizationExamItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeIsNull() {
            addCriterion("organization_exam_item_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeIsNotNull() {
            addCriterion("organization_exam_item_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeEqualTo(Date value) {
            addCriterion("organization_exam_item_create_time =", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeNotEqualTo(Date value) {
            addCriterion("organization_exam_item_create_time <>", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeGreaterThan(Date value) {
            addCriterion("organization_exam_item_create_time >", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("organization_exam_item_create_time >=", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeLessThan(Date value) {
            addCriterion("organization_exam_item_create_time <", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("organization_exam_item_create_time <=", value, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeIn(List<Date> values) {
            addCriterion("organization_exam_item_create_time in", values, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeNotIn(List<Date> values) {
            addCriterion("organization_exam_item_create_time not in", values, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeBetween(Date value1, Date value2) {
            addCriterion("organization_exam_item_create_time between", value1, value2, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("organization_exam_item_create_time not between", value1, value2, "organizationExamItemCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeIsNull() {
            addCriterion("organization_exam_item_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeIsNotNull() {
            addCriterion("organization_exam_item_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeEqualTo(Date value) {
            addCriterion("organization_exam_item_edit_time =", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeNotEqualTo(Date value) {
            addCriterion("organization_exam_item_edit_time <>", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeGreaterThan(Date value) {
            addCriterion("organization_exam_item_edit_time >", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("organization_exam_item_edit_time >=", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeLessThan(Date value) {
            addCriterion("organization_exam_item_edit_time <", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("organization_exam_item_edit_time <=", value, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeIn(List<Date> values) {
            addCriterion("organization_exam_item_edit_time in", values, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeNotIn(List<Date> values) {
            addCriterion("organization_exam_item_edit_time not in", values, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeBetween(Date value1, Date value2) {
            addCriterion("organization_exam_item_edit_time between", value1, value2, "organizationExamItemEditTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationExamItemEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("organization_exam_item_edit_time not between", value1, value2, "organizationExamItemEditTime");
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