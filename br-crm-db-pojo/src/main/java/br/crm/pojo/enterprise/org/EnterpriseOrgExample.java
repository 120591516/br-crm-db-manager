package br.crm.pojo.enterprise.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseOrgExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseOrgExample() {
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

        public Criteria andOrgLinkmanIsNull() {
            addCriterion("org_linkman is null");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanIsNotNull() {
            addCriterion("org_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanEqualTo(String value) {
            addCriterion("org_linkman =", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanNotEqualTo(String value) {
            addCriterion("org_linkman <>", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanGreaterThan(String value) {
            addCriterion("org_linkman >", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("org_linkman >=", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanLessThan(String value) {
            addCriterion("org_linkman <", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanLessThanOrEqualTo(String value) {
            addCriterion("org_linkman <=", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanLike(String value) {
            addCriterion("org_linkman like", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanNotLike(String value) {
            addCriterion("org_linkman not like", value, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanIn(List<String> values) {
            addCriterion("org_linkman in", values, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanNotIn(List<String> values) {
            addCriterion("org_linkman not in", values, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanBetween(String value1, String value2) {
            addCriterion("org_linkman between", value1, value2, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgLinkmanNotBetween(String value1, String value2) {
            addCriterion("org_linkman not between", value1, value2, "orgLinkman");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIsNull() {
            addCriterion("org_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIsNotNull() {
            addCriterion("org_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneEqualTo(String value) {
            addCriterion("org_phone =", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotEqualTo(String value) {
            addCriterion("org_phone <>", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneGreaterThan(String value) {
            addCriterion("org_phone >", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_phone >=", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLessThan(String value) {
            addCriterion("org_phone <", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLessThanOrEqualTo(String value) {
            addCriterion("org_phone <=", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLike(String value) {
            addCriterion("org_phone like", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotLike(String value) {
            addCriterion("org_phone not like", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIn(List<String> values) {
            addCriterion("org_phone in", values, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotIn(List<String> values) {
            addCriterion("org_phone not in", values, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneBetween(String value1, String value2) {
            addCriterion("org_phone between", value1, value2, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotBetween(String value1, String value2) {
            addCriterion("org_phone not between", value1, value2, "orgPhone");
            return (Criteria) this;
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

        public Criteria andEnterpriseOrgStatusIsNull() {
            addCriterion("enterprise_org_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusIsNotNull() {
            addCriterion("enterprise_org_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusEqualTo(Integer value) {
            addCriterion("enterprise_org_status =", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_org_status <>", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusGreaterThan(Integer value) {
            addCriterion("enterprise_org_status >", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_org_status >=", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusLessThan(Integer value) {
            addCriterion("enterprise_org_status <", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_org_status <=", value, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusIn(List<Integer> values) {
            addCriterion("enterprise_org_status in", values, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_org_status not in", values, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_org_status between", value1, value2, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_org_status not between", value1, value2, "enterpriseOrgStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeIsNull() {
            addCriterion("enterprise_org_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeIsNotNull() {
            addCriterion("enterprise_org_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeEqualTo(Date value) {
            addCriterion("enterprise_org_edit_time =", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_edit_time <>", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_edit_time >", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_edit_time >=", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeLessThan(Date value) {
            addCriterion("enterprise_org_edit_time <", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_edit_time <=", value, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeIn(List<Date> values) {
            addCriterion("enterprise_org_edit_time in", values, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_edit_time not in", values, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_edit_time between", value1, value2, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_edit_time not between", value1, value2, "enterpriseOrgEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeIsNull() {
            addCriterion("enterprise_org_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeIsNotNull() {
            addCriterion("enterprise_org_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_org_create_time =", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_org_create_time <>", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_org_create_time >", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_create_time >=", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeLessThan(Date value) {
            addCriterion("enterprise_org_create_time <", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_org_create_time <=", value, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_org_create_time in", values, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_org_create_time not in", values, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_create_time between", value1, value2, "enterpriseOrgCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_org_create_time not between", value1, value2, "enterpriseOrgCreateTime");
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