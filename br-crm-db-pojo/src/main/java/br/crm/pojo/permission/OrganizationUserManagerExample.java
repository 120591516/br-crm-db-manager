package br.crm.pojo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationUserManagerExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationUserManagerExample() {
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

        public Criteria andUserManagerIdIsNull() {
            addCriterion("user_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdIsNotNull() {
            addCriterion("user_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdEqualTo(String value) {
            addCriterion("user_manager_id =", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdNotEqualTo(String value) {
            addCriterion("user_manager_id <>", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdGreaterThan(String value) {
            addCriterion("user_manager_id >", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_manager_id >=", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdLessThan(String value) {
            addCriterion("user_manager_id <", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdLessThanOrEqualTo(String value) {
            addCriterion("user_manager_id <=", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdLike(String value) {
            addCriterion("user_manager_id like", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdNotLike(String value) {
            addCriterion("user_manager_id not like", value, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdIn(List<String> values) {
            addCriterion("user_manager_id in", values, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdNotIn(List<String> values) {
            addCriterion("user_manager_id not in", values, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdBetween(String value1, String value2) {
            addCriterion("user_manager_id between", value1, value2, "userManagerId");
            return (Criteria) this;
        }

        public Criteria andUserManagerIdNotBetween(String value1, String value2) {
            addCriterion("user_manager_id not between", value1, value2, "userManagerId");
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

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("branch_id like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("branch_id not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdIsNull() {
            addCriterion("user_manager_obj_id is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdIsNotNull() {
            addCriterion("user_manager_obj_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdEqualTo(String value) {
            addCriterion("user_manager_obj_id =", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdNotEqualTo(String value) {
            addCriterion("user_manager_obj_id <>", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdGreaterThan(String value) {
            addCriterion("user_manager_obj_id >", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_manager_obj_id >=", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdLessThan(String value) {
            addCriterion("user_manager_obj_id <", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdLessThanOrEqualTo(String value) {
            addCriterion("user_manager_obj_id <=", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdLike(String value) {
            addCriterion("user_manager_obj_id like", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdNotLike(String value) {
            addCriterion("user_manager_obj_id not like", value, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdIn(List<String> values) {
            addCriterion("user_manager_obj_id in", values, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdNotIn(List<String> values) {
            addCriterion("user_manager_obj_id not in", values, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdBetween(String value1, String value2) {
            addCriterion("user_manager_obj_id between", value1, value2, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjIdNotBetween(String value1, String value2) {
            addCriterion("user_manager_obj_id not between", value1, value2, "userManagerObjId");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameIsNull() {
            addCriterion("user_manager_obj_name is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameIsNotNull() {
            addCriterion("user_manager_obj_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameEqualTo(String value) {
            addCriterion("user_manager_obj_name =", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameNotEqualTo(String value) {
            addCriterion("user_manager_obj_name <>", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameGreaterThan(String value) {
            addCriterion("user_manager_obj_name >", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_manager_obj_name >=", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameLessThan(String value) {
            addCriterion("user_manager_obj_name <", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameLessThanOrEqualTo(String value) {
            addCriterion("user_manager_obj_name <=", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameLike(String value) {
            addCriterion("user_manager_obj_name like", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameNotLike(String value) {
            addCriterion("user_manager_obj_name not like", value, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameIn(List<String> values) {
            addCriterion("user_manager_obj_name in", values, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameNotIn(List<String> values) {
            addCriterion("user_manager_obj_name not in", values, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameBetween(String value1, String value2) {
            addCriterion("user_manager_obj_name between", value1, value2, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerObjNameNotBetween(String value1, String value2) {
            addCriterion("user_manager_obj_name not between", value1, value2, "userManagerObjName");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeIsNull() {
            addCriterion("user_manager_type is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeIsNotNull() {
            addCriterion("user_manager_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeEqualTo(Integer value) {
            addCriterion("user_manager_type =", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeNotEqualTo(Integer value) {
            addCriterion("user_manager_type <>", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeGreaterThan(Integer value) {
            addCriterion("user_manager_type >", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_manager_type >=", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeLessThan(Integer value) {
            addCriterion("user_manager_type <", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_manager_type <=", value, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeIn(List<Integer> values) {
            addCriterion("user_manager_type in", values, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeNotIn(List<Integer> values) {
            addCriterion("user_manager_type not in", values, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_type between", value1, value2, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_type not between", value1, value2, "userManagerType");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusIsNull() {
            addCriterion("user_manager_status is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusIsNotNull() {
            addCriterion("user_manager_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusEqualTo(Integer value) {
            addCriterion("user_manager_status =", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusNotEqualTo(Integer value) {
            addCriterion("user_manager_status <>", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusGreaterThan(Integer value) {
            addCriterion("user_manager_status >", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_manager_status >=", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusLessThan(Integer value) {
            addCriterion("user_manager_status <", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_manager_status <=", value, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusIn(List<Integer> values) {
            addCriterion("user_manager_status in", values, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusNotIn(List<Integer> values) {
            addCriterion("user_manager_status not in", values, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_status between", value1, value2, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_status not between", value1, value2, "userManagerStatus");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeIsNull() {
            addCriterion("user_manager_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeIsNotNull() {
            addCriterion("user_manager_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeEqualTo(Date value) {
            addCriterion("user_manager_create_time =", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeNotEqualTo(Date value) {
            addCriterion("user_manager_create_time <>", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeGreaterThan(Date value) {
            addCriterion("user_manager_create_time >", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_manager_create_time >=", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeLessThan(Date value) {
            addCriterion("user_manager_create_time <", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_manager_create_time <=", value, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeIn(List<Date> values) {
            addCriterion("user_manager_create_time in", values, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeNotIn(List<Date> values) {
            addCriterion("user_manager_create_time not in", values, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_manager_create_time between", value1, value2, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_manager_create_time not between", value1, value2, "userManagerCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeIsNull() {
            addCriterion("user_manager_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeIsNotNull() {
            addCriterion("user_manager_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeEqualTo(Date value) {
            addCriterion("user_manager_edit_time =", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeNotEqualTo(Date value) {
            addCriterion("user_manager_edit_time <>", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeGreaterThan(Date value) {
            addCriterion("user_manager_edit_time >", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_manager_edit_time >=", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeLessThan(Date value) {
            addCriterion("user_manager_edit_time <", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_manager_edit_time <=", value, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeIn(List<Date> values) {
            addCriterion("user_manager_edit_time in", values, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeNotIn(List<Date> values) {
            addCriterion("user_manager_edit_time not in", values, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeBetween(Date value1, Date value2) {
            addCriterion("user_manager_edit_time between", value1, value2, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_manager_edit_time not between", value1, value2, "userManagerEditTime");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatIsNull() {
            addCriterion("user_manager_edit_plat is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatIsNotNull() {
            addCriterion("user_manager_edit_plat is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatEqualTo(Integer value) {
            addCriterion("user_manager_edit_plat =", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatNotEqualTo(Integer value) {
            addCriterion("user_manager_edit_plat <>", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatGreaterThan(Integer value) {
            addCriterion("user_manager_edit_plat >", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_manager_edit_plat >=", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatLessThan(Integer value) {
            addCriterion("user_manager_edit_plat <", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatLessThanOrEqualTo(Integer value) {
            addCriterion("user_manager_edit_plat <=", value, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatIn(List<Integer> values) {
            addCriterion("user_manager_edit_plat in", values, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatNotIn(List<Integer> values) {
            addCriterion("user_manager_edit_plat not in", values, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_edit_plat between", value1, value2, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPlatNotBetween(Integer value1, Integer value2) {
            addCriterion("user_manager_edit_plat not between", value1, value2, "userManagerEditPlat");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdIsNull() {
            addCriterion("user_manager_edit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdIsNotNull() {
            addCriterion("user_manager_edit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdEqualTo(String value) {
            addCriterion("user_manager_edit_person_id =", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdNotEqualTo(String value) {
            addCriterion("user_manager_edit_person_id <>", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdGreaterThan(String value) {
            addCriterion("user_manager_edit_person_id >", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_manager_edit_person_id >=", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdLessThan(String value) {
            addCriterion("user_manager_edit_person_id <", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdLessThanOrEqualTo(String value) {
            addCriterion("user_manager_edit_person_id <=", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdLike(String value) {
            addCriterion("user_manager_edit_person_id like", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdNotLike(String value) {
            addCriterion("user_manager_edit_person_id not like", value, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdIn(List<String> values) {
            addCriterion("user_manager_edit_person_id in", values, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdNotIn(List<String> values) {
            addCriterion("user_manager_edit_person_id not in", values, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdBetween(String value1, String value2) {
            addCriterion("user_manager_edit_person_id between", value1, value2, "userManagerEditPersonId");
            return (Criteria) this;
        }

        public Criteria andUserManagerEditPersonIdNotBetween(String value1, String value2) {
            addCriterion("user_manager_edit_person_id not between", value1, value2, "userManagerEditPersonId");
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