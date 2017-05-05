package br.crm.pojo.suite;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamSuiteFeeItemExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamSuiteFeeItemExample() {
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

        public Criteria andExamFisIdIsNull() {
            addCriterion("exam_fis_id is null");
            return (Criteria) this;
        }

        public Criteria andExamFisIdIsNotNull() {
            addCriterion("exam_fis_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisIdEqualTo(String value) {
            addCriterion("exam_fis_id =", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdNotEqualTo(String value) {
            addCriterion("exam_fis_id <>", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdGreaterThan(String value) {
            addCriterion("exam_fis_id >", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fis_id >=", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdLessThan(String value) {
            addCriterion("exam_fis_id <", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdLessThanOrEqualTo(String value) {
            addCriterion("exam_fis_id <=", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdLike(String value) {
            addCriterion("exam_fis_id like", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdNotLike(String value) {
            addCriterion("exam_fis_id not like", value, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdIn(List<String> values) {
            addCriterion("exam_fis_id in", values, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdNotIn(List<String> values) {
            addCriterion("exam_fis_id not in", values, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdBetween(String value1, String value2) {
            addCriterion("exam_fis_id between", value1, value2, "examFisId");
            return (Criteria) this;
        }

        public Criteria andExamFisIdNotBetween(String value1, String value2) {
            addCriterion("exam_fis_id not between", value1, value2, "examFisId");
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

        public Criteria andExamSuiteIdIsNull() {
            addCriterion("exam_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIsNotNull() {
            addCriterion("exam_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdEqualTo(String value) {
            addCriterion("exam_suite_id =", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotEqualTo(String value) {
            addCriterion("exam_suite_id <>", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThan(String value) {
            addCriterion("exam_suite_id >", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_suite_id >=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThan(String value) {
            addCriterion("exam_suite_id <", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLessThanOrEqualTo(String value) {
            addCriterion("exam_suite_id <=", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdLike(String value) {
            addCriterion("exam_suite_id like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotLike(String value) {
            addCriterion("exam_suite_id not like", value, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdIn(List<String> values) {
            addCriterion("exam_suite_id in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotIn(List<String> values) {
            addCriterion("exam_suite_id not in", values, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdBetween(String value1, String value2) {
            addCriterion("exam_suite_id between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamSuiteIdNotBetween(String value1, String value2) {
            addCriterion("exam_suite_id not between", value1, value2, "examSuiteId");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceIsNull() {
            addCriterion("exam_fis_price is null");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceIsNotNull() {
            addCriterion("exam_fis_price is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceEqualTo(BigDecimal value) {
            addCriterion("exam_fis_price =", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceNotEqualTo(BigDecimal value) {
            addCriterion("exam_fis_price <>", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceGreaterThan(BigDecimal value) {
            addCriterion("exam_fis_price >", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fis_price >=", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceLessThan(BigDecimal value) {
            addCriterion("exam_fis_price <", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_fis_price <=", value, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceIn(List<BigDecimal> values) {
            addCriterion("exam_fis_price in", values, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceNotIn(List<BigDecimal> values) {
            addCriterion("exam_fis_price not in", values, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fis_price between", value1, value2, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_fis_price not between", value1, value2, "examFisPrice");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderIsNull() {
            addCriterion("exam_fis_disp_order is null");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderIsNotNull() {
            addCriterion("exam_fis_disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderEqualTo(Integer value) {
            addCriterion("exam_fis_disp_order =", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderNotEqualTo(Integer value) {
            addCriterion("exam_fis_disp_order <>", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderGreaterThan(Integer value) {
            addCriterion("exam_fis_disp_order >", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_fis_disp_order >=", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderLessThan(Integer value) {
            addCriterion("exam_fis_disp_order <", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exam_fis_disp_order <=", value, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderIn(List<Integer> values) {
            addCriterion("exam_fis_disp_order in", values, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderNotIn(List<Integer> values) {
            addCriterion("exam_fis_disp_order not in", values, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("exam_fis_disp_order between", value1, value2, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_fis_disp_order not between", value1, value2, "examFisDispOrder");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteIsNull() {
            addCriterion("exam_fis_note is null");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteIsNotNull() {
            addCriterion("exam_fis_note is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteEqualTo(String value) {
            addCriterion("exam_fis_note =", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteNotEqualTo(String value) {
            addCriterion("exam_fis_note <>", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteGreaterThan(String value) {
            addCriterion("exam_fis_note >", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteGreaterThanOrEqualTo(String value) {
            addCriterion("exam_fis_note >=", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteLessThan(String value) {
            addCriterion("exam_fis_note <", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteLessThanOrEqualTo(String value) {
            addCriterion("exam_fis_note <=", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteLike(String value) {
            addCriterion("exam_fis_note like", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteNotLike(String value) {
            addCriterion("exam_fis_note not like", value, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteIn(List<String> values) {
            addCriterion("exam_fis_note in", values, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteNotIn(List<String> values) {
            addCriterion("exam_fis_note not in", values, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteBetween(String value1, String value2) {
            addCriterion("exam_fis_note between", value1, value2, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisNoteNotBetween(String value1, String value2) {
            addCriterion("exam_fis_note not between", value1, value2, "examFisNote");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusIsNull() {
            addCriterion("exam_fis_status is null");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusIsNotNull() {
            addCriterion("exam_fis_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusEqualTo(Integer value) {
            addCriterion("exam_fis_status =", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusNotEqualTo(Integer value) {
            addCriterion("exam_fis_status <>", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusGreaterThan(Integer value) {
            addCriterion("exam_fis_status >", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_fis_status >=", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusLessThan(Integer value) {
            addCriterion("exam_fis_status <", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_fis_status <=", value, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusIn(List<Integer> values) {
            addCriterion("exam_fis_status in", values, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusNotIn(List<Integer> values) {
            addCriterion("exam_fis_status not in", values, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_fis_status between", value1, value2, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_fis_status not between", value1, value2, "examFisStatus");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeIsNull() {
            addCriterion("exam_fis_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeIsNotNull() {
            addCriterion("exam_fis_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeEqualTo(Date value) {
            addCriterion("exam_fis_create_time =", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_fis_create_time <>", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeGreaterThan(Date value) {
            addCriterion("exam_fis_create_time >", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_fis_create_time >=", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeLessThan(Date value) {
            addCriterion("exam_fis_create_time <", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_fis_create_time <=", value, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeIn(List<Date> values) {
            addCriterion("exam_fis_create_time in", values, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_fis_create_time not in", values, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_fis_create_time between", value1, value2, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_fis_create_time not between", value1, value2, "examFisCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeIsNull() {
            addCriterion("exam_fis_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeIsNotNull() {
            addCriterion("exam_fis_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeEqualTo(Date value) {
            addCriterion("exam_fis_edit_time =", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeNotEqualTo(Date value) {
            addCriterion("exam_fis_edit_time <>", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeGreaterThan(Date value) {
            addCriterion("exam_fis_edit_time >", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_fis_edit_time >=", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeLessThan(Date value) {
            addCriterion("exam_fis_edit_time <", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_fis_edit_time <=", value, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeIn(List<Date> values) {
            addCriterion("exam_fis_edit_time in", values, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeNotIn(List<Date> values) {
            addCriterion("exam_fis_edit_time not in", values, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeBetween(Date value1, Date value2) {
            addCriterion("exam_fis_edit_time between", value1, value2, "examFisEditTime");
            return (Criteria) this;
        }

        public Criteria andExamFisEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_fis_edit_time not between", value1, value2, "examFisEditTime");
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