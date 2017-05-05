package br.crm.pojo.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrgShortNameIsNull() {
            addCriterion("org_short_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNotNull() {
            addCriterion("org_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEqualTo(String value) {
            addCriterion("org_short_name =", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotEqualTo(String value) {
            addCriterion("org_short_name <>", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThan(String value) {
            addCriterion("org_short_name >", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_short_name >=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThan(String value) {
            addCriterion("org_short_name <", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThanOrEqualTo(String value) {
            addCriterion("org_short_name <=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLike(String value) {
            addCriterion("org_short_name like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotLike(String value) {
            addCriterion("org_short_name not like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIn(List<String> values) {
            addCriterion("org_short_name in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotIn(List<String> values) {
            addCriterion("org_short_name not in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameBetween(String value1, String value2) {
            addCriterion("org_short_name between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotBetween(String value1, String value2) {
            addCriterion("org_short_name not between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameIsNull() {
            addCriterion("org_total_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameIsNotNull() {
            addCriterion("org_total_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameEqualTo(String value) {
            addCriterion("org_total_name =", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameNotEqualTo(String value) {
            addCriterion("org_total_name <>", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameGreaterThan(String value) {
            addCriterion("org_total_name >", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_total_name >=", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameLessThan(String value) {
            addCriterion("org_total_name <", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameLessThanOrEqualTo(String value) {
            addCriterion("org_total_name <=", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameLike(String value) {
            addCriterion("org_total_name like", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameNotLike(String value) {
            addCriterion("org_total_name not like", value, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameIn(List<String> values) {
            addCriterion("org_total_name in", values, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameNotIn(List<String> values) {
            addCriterion("org_total_name not in", values, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameBetween(String value1, String value2) {
            addCriterion("org_total_name between", value1, value2, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgTotalNameNotBetween(String value1, String value2) {
            addCriterion("org_total_name not between", value1, value2, "orgTotalName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIsNull() {
            addCriterion("org_nature is null");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIsNotNull() {
            addCriterion("org_nature is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNatureEqualTo(Integer value) {
            addCriterion("org_nature =", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotEqualTo(Integer value) {
            addCriterion("org_nature <>", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureGreaterThan(Integer value) {
            addCriterion("org_nature >", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_nature >=", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureLessThan(Integer value) {
            addCriterion("org_nature <", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureLessThanOrEqualTo(Integer value) {
            addCriterion("org_nature <=", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIn(List<Integer> values) {
            addCriterion("org_nature in", values, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotIn(List<Integer> values) {
            addCriterion("org_nature not in", values, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureBetween(Integer value1, Integer value2) {
            addCriterion("org_nature between", value1, value2, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("org_nature not between", value1, value2, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdIsNull() {
            addCriterion("org_level_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdIsNotNull() {
            addCriterion("org_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdEqualTo(Integer value) {
            addCriterion("org_level_id =", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotEqualTo(Integer value) {
            addCriterion("org_level_id <>", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdGreaterThan(Integer value) {
            addCriterion("org_level_id >", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_level_id >=", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdLessThan(Integer value) {
            addCriterion("org_level_id <", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_level_id <=", value, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdIn(List<Integer> values) {
            addCriterion("org_level_id in", values, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotIn(List<Integer> values) {
            addCriterion("org_level_id not in", values, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("org_level_id between", value1, value2, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_level_id not between", value1, value2, "orgLevelId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("org_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("org_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("org_address =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("org_address <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("org_address >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_address >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("org_address <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("org_address <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("org_address like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("org_address not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("org_address in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("org_address not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("org_address between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("org_address not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgSizeIsNull() {
            addCriterion("org_size is null");
            return (Criteria) this;
        }

        public Criteria andOrgSizeIsNotNull() {
            addCriterion("org_size is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSizeEqualTo(Double value) {
            addCriterion("org_size =", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeNotEqualTo(Double value) {
            addCriterion("org_size <>", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeGreaterThan(Double value) {
            addCriterion("org_size >", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("org_size >=", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLessThan(Double value) {
            addCriterion("org_size <", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeLessThanOrEqualTo(Double value) {
            addCriterion("org_size <=", value, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeIn(List<Double> values) {
            addCriterion("org_size in", values, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeNotIn(List<Double> values) {
            addCriterion("org_size not in", values, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeBetween(Double value1, Double value2) {
            addCriterion("org_size between", value1, value2, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgSizeNotBetween(Double value1, Double value2) {
            addCriterion("org_size not between", value1, value2, "orgSize");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("org_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("org_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(Integer value) {
            addCriterion("org_status =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(Integer value) {
            addCriterion("org_status <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(Integer value) {
            addCriterion("org_status >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_status >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(Integer value) {
            addCriterion("org_status <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("org_status <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<Integer> values) {
            addCriterion("org_status in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<Integer> values) {
            addCriterion("org_status not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("org_status between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("org_status not between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIsNull() {
            addCriterion("org_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIsNotNull() {
            addCriterion("org_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeEqualTo(Date value) {
            addCriterion("org_create_time =", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotEqualTo(Date value) {
            addCriterion("org_create_time <>", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeGreaterThan(Date value) {
            addCriterion("org_create_time >", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_create_time >=", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeLessThan(Date value) {
            addCriterion("org_create_time <", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_create_time <=", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIn(List<Date> values) {
            addCriterion("org_create_time in", values, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotIn(List<Date> values) {
            addCriterion("org_create_time not in", values, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_create_time between", value1, value2, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_create_time not between", value1, value2, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeIsNull() {
            addCriterion("org_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeIsNotNull() {
            addCriterion("org_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeEqualTo(Date value) {
            addCriterion("org_edit_time =", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeNotEqualTo(Date value) {
            addCriterion("org_edit_time <>", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeGreaterThan(Date value) {
            addCriterion("org_edit_time >", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_edit_time >=", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeLessThan(Date value) {
            addCriterion("org_edit_time <", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_edit_time <=", value, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeIn(List<Date> values) {
            addCriterion("org_edit_time in", values, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeNotIn(List<Date> values) {
            addCriterion("org_edit_time not in", values, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeBetween(Date value1, Date value2) {
            addCriterion("org_edit_time between", value1, value2, "orgEditTime");
            return (Criteria) this;
        }

        public Criteria andOrgEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_edit_time not between", value1, value2, "orgEditTime");
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