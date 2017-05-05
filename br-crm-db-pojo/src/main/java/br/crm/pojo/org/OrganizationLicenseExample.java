package br.crm.pojo.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationLicenseExample() {
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

        public Criteria andOrgLicenseIdIsNull() {
            addCriterion("org_license_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdIsNotNull() {
            addCriterion("org_license_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdEqualTo(Long value) {
            addCriterion("org_license_id =", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdNotEqualTo(Long value) {
            addCriterion("org_license_id <>", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdGreaterThan(Long value) {
            addCriterion("org_license_id >", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_license_id >=", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdLessThan(Long value) {
            addCriterion("org_license_id <", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdLessThanOrEqualTo(Long value) {
            addCriterion("org_license_id <=", value, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdIn(List<Long> values) {
            addCriterion("org_license_id in", values, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdNotIn(List<Long> values) {
            addCriterion("org_license_id not in", values, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdBetween(Long value1, Long value2) {
            addCriterion("org_license_id between", value1, value2, "orgLicenseId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIdNotBetween(Long value1, Long value2) {
            addCriterion("org_license_id not between", value1, value2, "orgLicenseId");
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

        public Criteria andOrgLicenseNoIsNull() {
            addCriterion("org_license_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoIsNotNull() {
            addCriterion("org_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoEqualTo(String value) {
            addCriterion("org_license_no =", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoNotEqualTo(String value) {
            addCriterion("org_license_no <>", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoGreaterThan(String value) {
            addCriterion("org_license_no >", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_license_no >=", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoLessThan(String value) {
            addCriterion("org_license_no <", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("org_license_no <=", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoLike(String value) {
            addCriterion("org_license_no like", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoNotLike(String value) {
            addCriterion("org_license_no not like", value, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoIn(List<String> values) {
            addCriterion("org_license_no in", values, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoNotIn(List<String> values) {
            addCriterion("org_license_no not in", values, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoBetween(String value1, String value2) {
            addCriterion("org_license_no between", value1, value2, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNoNotBetween(String value1, String value2) {
            addCriterion("org_license_no not between", value1, value2, "orgLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdIsNull() {
            addCriterion("org_license_img_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdIsNotNull() {
            addCriterion("org_license_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdEqualTo(Long value) {
            addCriterion("org_license_img_id =", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdNotEqualTo(Long value) {
            addCriterion("org_license_img_id <>", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdGreaterThan(Long value) {
            addCriterion("org_license_img_id >", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_license_img_id >=", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdLessThan(Long value) {
            addCriterion("org_license_img_id <", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdLessThanOrEqualTo(Long value) {
            addCriterion("org_license_img_id <=", value, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdIn(List<Long> values) {
            addCriterion("org_license_img_id in", values, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdNotIn(List<Long> values) {
            addCriterion("org_license_img_id not in", values, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdBetween(Long value1, Long value2) {
            addCriterion("org_license_img_id between", value1, value2, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgIdNotBetween(Long value1, Long value2) {
            addCriterion("org_license_img_id not between", value1, value2, "orgLicenseImgId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlIsNull() {
            addCriterion("org_license_img_url is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlIsNotNull() {
            addCriterion("org_license_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlEqualTo(String value) {
            addCriterion("org_license_img_url =", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlNotEqualTo(String value) {
            addCriterion("org_license_img_url <>", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlGreaterThan(String value) {
            addCriterion("org_license_img_url >", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_license_img_url >=", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlLessThan(String value) {
            addCriterion("org_license_img_url <", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlLessThanOrEqualTo(String value) {
            addCriterion("org_license_img_url <=", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlLike(String value) {
            addCriterion("org_license_img_url like", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlNotLike(String value) {
            addCriterion("org_license_img_url not like", value, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlIn(List<String> values) {
            addCriterion("org_license_img_url in", values, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlNotIn(List<String> values) {
            addCriterion("org_license_img_url not in", values, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlBetween(String value1, String value2) {
            addCriterion("org_license_img_url between", value1, value2, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseImgUrlNotBetween(String value1, String value2) {
            addCriterion("org_license_img_url not between", value1, value2, "orgLicenseImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdIsNull() {
            addCriterion("org_license_open_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdIsNotNull() {
            addCriterion("org_license_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdEqualTo(Long value) {
            addCriterion("org_license_open_id =", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdNotEqualTo(Long value) {
            addCriterion("org_license_open_id <>", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdGreaterThan(Long value) {
            addCriterion("org_license_open_id >", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_license_open_id >=", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdLessThan(Long value) {
            addCriterion("org_license_open_id <", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdLessThanOrEqualTo(Long value) {
            addCriterion("org_license_open_id <=", value, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdIn(List<Long> values) {
            addCriterion("org_license_open_id in", values, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdNotIn(List<Long> values) {
            addCriterion("org_license_open_id not in", values, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdBetween(Long value1, Long value2) {
            addCriterion("org_license_open_id between", value1, value2, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenIdNotBetween(Long value1, Long value2) {
            addCriterion("org_license_open_id not between", value1, value2, "orgLicenseOpenId");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlIsNull() {
            addCriterion("org_license_open_url is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlIsNotNull() {
            addCriterion("org_license_open_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlEqualTo(String value) {
            addCriterion("org_license_open_url =", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlNotEqualTo(String value) {
            addCriterion("org_license_open_url <>", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlGreaterThan(String value) {
            addCriterion("org_license_open_url >", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_license_open_url >=", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlLessThan(String value) {
            addCriterion("org_license_open_url <", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlLessThanOrEqualTo(String value) {
            addCriterion("org_license_open_url <=", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlLike(String value) {
            addCriterion("org_license_open_url like", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlNotLike(String value) {
            addCriterion("org_license_open_url not like", value, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlIn(List<String> values) {
            addCriterion("org_license_open_url in", values, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlNotIn(List<String> values) {
            addCriterion("org_license_open_url not in", values, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlBetween(String value1, String value2) {
            addCriterion("org_license_open_url between", value1, value2, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseOpenUrlNotBetween(String value1, String value2) {
            addCriterion("org_license_open_url not between", value1, value2, "orgLicenseOpenUrl");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameIsNull() {
            addCriterion("org_license_person_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameIsNotNull() {
            addCriterion("org_license_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameEqualTo(String value) {
            addCriterion("org_license_person_name =", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameNotEqualTo(String value) {
            addCriterion("org_license_person_name <>", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameGreaterThan(String value) {
            addCriterion("org_license_person_name >", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_license_person_name >=", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameLessThan(String value) {
            addCriterion("org_license_person_name <", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameLessThanOrEqualTo(String value) {
            addCriterion("org_license_person_name <=", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameLike(String value) {
            addCriterion("org_license_person_name like", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameNotLike(String value) {
            addCriterion("org_license_person_name not like", value, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameIn(List<String> values) {
            addCriterion("org_license_person_name in", values, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameNotIn(List<String> values) {
            addCriterion("org_license_person_name not in", values, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameBetween(String value1, String value2) {
            addCriterion("org_license_person_name between", value1, value2, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicensePersonNameNotBetween(String value1, String value2) {
            addCriterion("org_license_person_name not between", value1, value2, "orgLicensePersonName");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeIsNull() {
            addCriterion("org_license_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeIsNotNull() {
            addCriterion("org_license_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeEqualTo(Date value) {
            addCriterion("org_license_create_time =", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeNotEqualTo(Date value) {
            addCriterion("org_license_create_time <>", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeGreaterThan(Date value) {
            addCriterion("org_license_create_time >", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_license_create_time >=", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeLessThan(Date value) {
            addCriterion("org_license_create_time <", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_license_create_time <=", value, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeIn(List<Date> values) {
            addCriterion("org_license_create_time in", values, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeNotIn(List<Date> values) {
            addCriterion("org_license_create_time not in", values, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_license_create_time between", value1, value2, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_license_create_time not between", value1, value2, "orgLicenseCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeIsNull() {
            addCriterion("org_license_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeIsNotNull() {
            addCriterion("org_license_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeEqualTo(Date value) {
            addCriterion("org_license_edit_time =", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeNotEqualTo(Date value) {
            addCriterion("org_license_edit_time <>", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeGreaterThan(Date value) {
            addCriterion("org_license_edit_time >", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_license_edit_time >=", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeLessThan(Date value) {
            addCriterion("org_license_edit_time <", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_license_edit_time <=", value, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeIn(List<Date> values) {
            addCriterion("org_license_edit_time in", values, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeNotIn(List<Date> values) {
            addCriterion("org_license_edit_time not in", values, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_license_edit_time between", value1, value2, "orgLicenseEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_license_edit_time not between", value1, value2, "orgLicenseEditTime");
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