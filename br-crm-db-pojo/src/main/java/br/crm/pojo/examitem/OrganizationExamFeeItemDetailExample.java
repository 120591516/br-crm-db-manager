package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamFeeItemDetailExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamFeeItemDetailExample() {
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

        public Criteria andExamFeeItemDetailIdIsNull() {
            addCriterion("exam_fee_item_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdIsNotNull() {
            addCriterion("exam_fee_item_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdEqualTo(String value) {
            addCriterion("exam_fee_item_detail_id =", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_detail_id <>", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdGreaterThan(String value) {
            addCriterion("exam_fee_item_detail_id >", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_detail_id >=", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdLessThan(String value) {
            addCriterion("exam_fee_item_detail_id <", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_detail_id <=", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdLike(String value) {
            addCriterion("exam_fee_item_detail_id like", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdNotLike(String value) {
            addCriterion("exam_fee_item_detail_id not like", value, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdIn(List<String> values) {
            addCriterion("exam_fee_item_detail_id in", values, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_detail_id not in", values, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_detail_id between", value1, value2, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemDetailIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_detail_id not between", value1, value2, "examFeeItemDetailId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNull() {
            addCriterion("exam_fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIsNotNull() {
            addCriterion("exam_fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdEqualTo(String value) {
            addCriterion("exam_fee_item_id =", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotEqualTo(String value) {
            addCriterion("exam_fee_item_id <>", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThan(String value) {
            addCriterion("exam_fee_item_id >", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id >=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThan(String value) {
            addCriterion("exam_fee_item_id <", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fee_item_id <=", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdLike(String value) {
            addCriterion("exam_fee_item_id like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotLike(String value) {
            addCriterion("exam_fee_item_id not like", value, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdIn(List<String> values) {
            addCriterion("exam_fee_item_id in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotIn(List<String> values) {
            addCriterion("exam_fee_item_id not in", values, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id between", value1, value2, "examFeeItemId");
            return (Criteria) this;
        }

        public Criteria andExamFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("exam_fee_item_id not between", value1, value2, "examFeeItemId");
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

        public Criteria andOrganizationDeptIdIsNull() {
            addCriterion("organization_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdIsNotNull() {
            addCriterion("organization_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdEqualTo(String value) {
            addCriterion("organization_dept_id =", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdNotEqualTo(String value) {
            addCriterion("organization_dept_id <>", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdGreaterThan(String value) {
            addCriterion("organization_dept_id >", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_dept_id >=", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdLessThan(String value) {
            addCriterion("organization_dept_id <", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdLessThanOrEqualTo(String value) {
            addCriterion("organization_dept_id <=", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdLike(String value) {
            addCriterion("organization_dept_id like", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdNotLike(String value) {
            addCriterion("organization_dept_id not like", value, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdIn(List<String> values) {
            addCriterion("organization_dept_id in", values, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdNotIn(List<String> values) {
            addCriterion("organization_dept_id not in", values, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdBetween(String value1, String value2) {
            addCriterion("organization_dept_id between", value1, value2, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andOrganizationDeptIdNotBetween(String value1, String value2) {
            addCriterion("organization_dept_id not between", value1, value2, "organizationDeptId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdIsNull() {
            addCriterion("exam_item_user_id is null");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdIsNotNull() {
            addCriterion("exam_item_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdEqualTo(String value) {
            addCriterion("exam_item_user_id =", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdNotEqualTo(String value) {
            addCriterion("exam_item_user_id <>", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdGreaterThan(String value) {
            addCriterion("exam_item_user_id >", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_item_user_id >=", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdLessThan(String value) {
            addCriterion("exam_item_user_id <", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdLessThanOrEqualTo(String value) {
            addCriterion("exam_item_user_id <=", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdLike(String value) {
            addCriterion("exam_item_user_id like", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdNotLike(String value) {
            addCriterion("exam_item_user_id not like", value, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdIn(List<String> values) {
            addCriterion("exam_item_user_id in", values, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdNotIn(List<String> values) {
            addCriterion("exam_item_user_id not in", values, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdBetween(String value1, String value2) {
            addCriterion("exam_item_user_id between", value1, value2, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andExamItemUserIdNotBetween(String value1, String value2) {
            addCriterion("exam_item_user_id not between", value1, value2, "examItemUserId");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNull() {
            addCriterion("disp_order is null");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNotNull() {
            addCriterion("disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andDispOrderEqualTo(Integer value) {
            addCriterion("disp_order =", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotEqualTo(Integer value) {
            addCriterion("disp_order <>", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThan(Integer value) {
            addCriterion("disp_order >", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("disp_order >=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThan(Integer value) {
            addCriterion("disp_order <", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("disp_order <=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderIn(List<Integer> values) {
            addCriterion("disp_order in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotIn(List<Integer> values) {
            addCriterion("disp_order not in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("disp_order between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("disp_order not between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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