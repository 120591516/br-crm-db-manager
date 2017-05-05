package br.crm.pojo.enterprise.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseOrgContractExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseOrgContractExample() {
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

        public Criteria andEnterpriseOrgContractIdIsNull() {
            addCriterion("enterprise_org_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdIsNotNull() {
            addCriterion("enterprise_org_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdEqualTo(String value) {
            addCriterion("enterprise_org_contract_id =", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdNotEqualTo(String value) {
            addCriterion("enterprise_org_contract_id <>", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdGreaterThan(String value) {
            addCriterion("enterprise_org_contract_id >", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_id >=", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdLessThan(String value) {
            addCriterion("enterprise_org_contract_id <", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_id <=", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdLike(String value) {
            addCriterion("enterprise_org_contract_id like", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdNotLike(String value) {
            addCriterion("enterprise_org_contract_id not like", value, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdIn(List<String> values) {
            addCriterion("enterprise_org_contract_id in", values, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdNotIn(List<String> values) {
            addCriterion("enterprise_org_contract_id not in", values, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_id between", value1, value2, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_id not between", value1, value2, "enterpriseOrgContractId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIsNull() {
            addCriterion("enterprise_org_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIsNotNull() {
            addCriterion("enterprise_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdEqualTo(String value) {
            addCriterion("enterprise_org_id =", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotEqualTo(String value) {
            addCriterion("enterprise_org_id <>", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdGreaterThan(String value) {
            addCriterion("enterprise_org_id >", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_id >=", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLessThan(String value) {
            addCriterion("enterprise_org_id <", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_id <=", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdLike(String value) {
            addCriterion("enterprise_org_id like", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotLike(String value) {
            addCriterion("enterprise_org_id not like", value, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdIn(List<String> values) {
            addCriterion("enterprise_org_id in", values, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotIn(List<String> values) {
            addCriterion("enterprise_org_id not in", values, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdBetween(String value1, String value2) {
            addCriterion("enterprise_org_id between", value1, value2, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_id not between", value1, value2, "enterpriseOrgId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIsNull() {
            addCriterion("enterprise_reservation_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIsNotNull() {
            addCriterion("enterprise_reservation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdEqualTo(String value) {
            addCriterion("enterprise_reservation_id =", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotEqualTo(String value) {
            addCriterion("enterprise_reservation_id <>", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdGreaterThan(String value) {
            addCriterion("enterprise_reservation_id >", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_id >=", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLessThan(String value) {
            addCriterion("enterprise_reservation_id <", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reservation_id <=", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdLike(String value) {
            addCriterion("enterprise_reservation_id like", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotLike(String value) {
            addCriterion("enterprise_reservation_id not like", value, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdIn(List<String> values) {
            addCriterion("enterprise_reservation_id in", values, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotIn(List<String> values) {
            addCriterion("enterprise_reservation_id not in", values, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_id between", value1, value2, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseReservationIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_reservation_id not between", value1, value2, "enterpriseReservationId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameIsNull() {
            addCriterion("enterprise_org_contract_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameIsNotNull() {
            addCriterion("enterprise_org_contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameEqualTo(String value) {
            addCriterion("enterprise_org_contract_name =", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameNotEqualTo(String value) {
            addCriterion("enterprise_org_contract_name <>", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameGreaterThan(String value) {
            addCriterion("enterprise_org_contract_name >", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_name >=", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameLessThan(String value) {
            addCriterion("enterprise_org_contract_name <", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_name <=", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameLike(String value) {
            addCriterion("enterprise_org_contract_name like", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameNotLike(String value) {
            addCriterion("enterprise_org_contract_name not like", value, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameIn(List<String> values) {
            addCriterion("enterprise_org_contract_name in", values, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameNotIn(List<String> values) {
            addCriterion("enterprise_org_contract_name not in", values, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_name between", value1, value2, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_name not between", value1, value2, "enterpriseOrgContractName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(String value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(String value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(String value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(String value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLike(String value) {
            addCriterion("enterprise_id like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotLike(String value) {
            addCriterion("enterprise_id not like", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<String> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<String> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(String value1, String value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameIsNull() {
            addCriterion("enterprise_full_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameIsNotNull() {
            addCriterion("enterprise_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameEqualTo(String value) {
            addCriterion("enterprise_full_name =", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotEqualTo(String value) {
            addCriterion("enterprise_full_name <>", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameGreaterThan(String value) {
            addCriterion("enterprise_full_name >", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_full_name >=", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLessThan(String value) {
            addCriterion("enterprise_full_name <", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_full_name <=", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameLike(String value) {
            addCriterion("enterprise_full_name like", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotLike(String value) {
            addCriterion("enterprise_full_name not like", value, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameIn(List<String> values) {
            addCriterion("enterprise_full_name in", values, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotIn(List<String> values) {
            addCriterion("enterprise_full_name not in", values, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameBetween(String value1, String value2) {
            addCriterion("enterprise_full_name between", value1, value2, "enterpriseFullName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFullNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_full_name not between", value1, value2, "enterpriseFullName");
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

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgIsNull() {
            addCriterion("enterprise_org_contract_img is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgIsNotNull() {
            addCriterion("enterprise_org_contract_img is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgEqualTo(String value) {
            addCriterion("enterprise_org_contract_img =", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgNotEqualTo(String value) {
            addCriterion("enterprise_org_contract_img <>", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgGreaterThan(String value) {
            addCriterion("enterprise_org_contract_img >", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_img >=", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgLessThan(String value) {
            addCriterion("enterprise_org_contract_img <", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_contract_img <=", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgLike(String value) {
            addCriterion("enterprise_org_contract_img like", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgNotLike(String value) {
            addCriterion("enterprise_org_contract_img not like", value, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgIn(List<String> values) {
            addCriterion("enterprise_org_contract_img in", values, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgNotIn(List<String> values) {
            addCriterion("enterprise_org_contract_img not in", values, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_img between", value1, value2, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractImgNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_contract_img not between", value1, value2, "enterpriseOrgContractImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeIsNull() {
            addCriterion("enterprise_org_contract_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeIsNotNull() {
            addCriterion("enterprise_org_contract_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeEqualTo(Date value) {
            addCriterion("enterprise_org_contract_start_time =", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_contract_start_time <>", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_contract_start_time >", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_start_time >=", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeLessThan(Date value) {
            addCriterion("enterprise_org_contract_start_time <", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_start_time <=", value, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeIn(List<Date> values) {
            addCriterion("enterprise_org_contract_start_time in", values, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_contract_start_time not in", values, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_start_time between", value1, value2, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_start_time not between", value1, value2, "enterpriseOrgContractStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeIsNull() {
            addCriterion("enterprise_org_contract_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeIsNotNull() {
            addCriterion("enterprise_org_contract_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeEqualTo(Date value) {
            addCriterion("enterprise_org_contract_end_time =", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_contract_end_time <>", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_contract_end_time >", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_end_time >=", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeLessThan(Date value) {
            addCriterion("enterprise_org_contract_end_time <", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_end_time <=", value, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeIn(List<Date> values) {
            addCriterion("enterprise_org_contract_end_time in", values, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_contract_end_time not in", values, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_end_time between", value1, value2, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_end_time not between", value1, value2, "enterpriseOrgContractEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusIsNull() {
            addCriterion("enterprise_org_contract_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusIsNotNull() {
            addCriterion("enterprise_org_contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusEqualTo(Integer value) {
            addCriterion("enterprise_org_contract_status =", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_org_contract_status <>", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusGreaterThan(Integer value) {
            addCriterion("enterprise_org_contract_status >", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_org_contract_status >=", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusLessThan(Integer value) {
            addCriterion("enterprise_org_contract_status <", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_org_contract_status <=", value, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusIn(List<Integer> values) {
            addCriterion("enterprise_org_contract_status in", values, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_org_contract_status not in", values, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_org_contract_status between", value1, value2, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_org_contract_status not between", value1, value2, "enterpriseOrgContractStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeIsNull() {
            addCriterion("enterprise_org_contract_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeIsNotNull() {
            addCriterion("enterprise_org_contract_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeEqualTo(Date value) {
            addCriterion("enterprise_org_contract_edit_time =", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_contract_edit_time <>", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_contract_edit_time >", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_edit_time >=", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeLessThan(Date value) {
            addCriterion("enterprise_org_contract_edit_time <", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_edit_time <=", value, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeIn(List<Date> values) {
            addCriterion("enterprise_org_contract_edit_time in", values, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_contract_edit_time not in", values, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_edit_time between", value1, value2, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_edit_time not between", value1, value2, "enterpriseOrgContractEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeIsNull() {
            addCriterion("enterprise_org_contract_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeIsNotNull() {
            addCriterion("enterprise_org_contract_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_org_contract_create_time =", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_contract_create_time <>", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_contract_create_time >", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_create_time >=", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeLessThan(Date value) {
            addCriterion("enterprise_org_contract_create_time <", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_contract_create_time <=", value, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_org_contract_create_time in", values, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_contract_create_time not in", values, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_create_time between", value1, value2, "enterpriseOrgContractCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgContractCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_contract_create_time not between", value1, value2, "enterpriseOrgContractCreateTime");
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