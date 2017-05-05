package br.crm.pojo.firstshow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FirstimgshowExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstimgshowExample() {
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

        public Criteria andFirstimgshowIdIsNull() {
            addCriterion("firstimgshow_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdIsNotNull() {
            addCriterion("firstimgshow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdEqualTo(String value) {
            addCriterion("firstimgshow_id =", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdNotEqualTo(String value) {
            addCriterion("firstimgshow_id <>", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdGreaterThan(String value) {
            addCriterion("firstimgshow_id >", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_id >=", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdLessThan(String value) {
            addCriterion("firstimgshow_id <", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_id <=", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdLike(String value) {
            addCriterion("firstimgshow_id like", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdNotLike(String value) {
            addCriterion("firstimgshow_id not like", value, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdIn(List<String> values) {
            addCriterion("firstimgshow_id in", values, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdNotIn(List<String> values) {
            addCriterion("firstimgshow_id not in", values, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdBetween(String value1, String value2) {
            addCriterion("firstimgshow_id between", value1, value2, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIdNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_id not between", value1, value2, "firstimgshowId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleIsNull() {
            addCriterion("firstimgshow_title is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleIsNotNull() {
            addCriterion("firstimgshow_title is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleEqualTo(String value) {
            addCriterion("firstimgshow_title =", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleNotEqualTo(String value) {
            addCriterion("firstimgshow_title <>", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleGreaterThan(String value) {
            addCriterion("firstimgshow_title >", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_title >=", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleLessThan(String value) {
            addCriterion("firstimgshow_title <", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_title <=", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleLike(String value) {
            addCriterion("firstimgshow_title like", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleNotLike(String value) {
            addCriterion("firstimgshow_title not like", value, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleIn(List<String> values) {
            addCriterion("firstimgshow_title in", values, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleNotIn(List<String> values) {
            addCriterion("firstimgshow_title not in", values, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleBetween(String value1, String value2) {
            addCriterion("firstimgshow_title between", value1, value2, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_title not between", value1, value2, "firstimgshowTitle");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescIsNull() {
            addCriterion("firstimgshow_title_desc is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescIsNotNull() {
            addCriterion("firstimgshow_title_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescEqualTo(String value) {
            addCriterion("firstimgshow_title_desc =", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescNotEqualTo(String value) {
            addCriterion("firstimgshow_title_desc <>", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescGreaterThan(String value) {
            addCriterion("firstimgshow_title_desc >", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_title_desc >=", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescLessThan(String value) {
            addCriterion("firstimgshow_title_desc <", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_title_desc <=", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescLike(String value) {
            addCriterion("firstimgshow_title_desc like", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescNotLike(String value) {
            addCriterion("firstimgshow_title_desc not like", value, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescIn(List<String> values) {
            addCriterion("firstimgshow_title_desc in", values, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescNotIn(List<String> values) {
            addCriterion("firstimgshow_title_desc not in", values, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescBetween(String value1, String value2) {
            addCriterion("firstimgshow_title_desc between", value1, value2, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowTitleDescNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_title_desc not between", value1, value2, "firstimgshowTitleDesc");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdIsNull() {
            addCriterion("firstimgshow_img_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdIsNotNull() {
            addCriterion("firstimgshow_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdEqualTo(String value) {
            addCriterion("firstimgshow_img_id =", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdNotEqualTo(String value) {
            addCriterion("firstimgshow_img_id <>", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdGreaterThan(String value) {
            addCriterion("firstimgshow_img_id >", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_img_id >=", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdLessThan(String value) {
            addCriterion("firstimgshow_img_id <", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_img_id <=", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdLike(String value) {
            addCriterion("firstimgshow_img_id like", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdNotLike(String value) {
            addCriterion("firstimgshow_img_id not like", value, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdIn(List<String> values) {
            addCriterion("firstimgshow_img_id in", values, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdNotIn(List<String> values) {
            addCriterion("firstimgshow_img_id not in", values, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdBetween(String value1, String value2) {
            addCriterion("firstimgshow_img_id between", value1, value2, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgIdNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_img_id not between", value1, value2, "firstimgshowImgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlIsNull() {
            addCriterion("firstimgshow_img_url is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlIsNotNull() {
            addCriterion("firstimgshow_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlEqualTo(String value) {
            addCriterion("firstimgshow_img_url =", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlNotEqualTo(String value) {
            addCriterion("firstimgshow_img_url <>", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlGreaterThan(String value) {
            addCriterion("firstimgshow_img_url >", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_img_url >=", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlLessThan(String value) {
            addCriterion("firstimgshow_img_url <", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_img_url <=", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlLike(String value) {
            addCriterion("firstimgshow_img_url like", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlNotLike(String value) {
            addCriterion("firstimgshow_img_url not like", value, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlIn(List<String> values) {
            addCriterion("firstimgshow_img_url in", values, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlNotIn(List<String> values) {
            addCriterion("firstimgshow_img_url not in", values, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlBetween(String value1, String value2) {
            addCriterion("firstimgshow_img_url between", value1, value2, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowImgUrlNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_img_url not between", value1, value2, "firstimgshowImgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdIsNull() {
            addCriterion("firstimgshow_data_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdIsNotNull() {
            addCriterion("firstimgshow_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdEqualTo(String value) {
            addCriterion("firstimgshow_data_id =", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdNotEqualTo(String value) {
            addCriterion("firstimgshow_data_id <>", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdGreaterThan(String value) {
            addCriterion("firstimgshow_data_id >", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_data_id >=", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdLessThan(String value) {
            addCriterion("firstimgshow_data_id <", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_data_id <=", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdLike(String value) {
            addCriterion("firstimgshow_data_id like", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdNotLike(String value) {
            addCriterion("firstimgshow_data_id not like", value, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdIn(List<String> values) {
            addCriterion("firstimgshow_data_id in", values, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdNotIn(List<String> values) {
            addCriterion("firstimgshow_data_id not in", values, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdBetween(String value1, String value2) {
            addCriterion("firstimgshow_data_id between", value1, value2, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataIdNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_data_id not between", value1, value2, "firstimgshowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeIsNull() {
            addCriterion("firstimgshow_data_type is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeIsNotNull() {
            addCriterion("firstimgshow_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeEqualTo(Integer value) {
            addCriterion("firstimgshow_data_type =", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeNotEqualTo(Integer value) {
            addCriterion("firstimgshow_data_type <>", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeGreaterThan(Integer value) {
            addCriterion("firstimgshow_data_type >", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_data_type >=", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeLessThan(Integer value) {
            addCriterion("firstimgshow_data_type <", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_data_type <=", value, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeIn(List<Integer> values) {
            addCriterion("firstimgshow_data_type in", values, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeNotIn(List<Integer> values) {
            addCriterion("firstimgshow_data_type not in", values, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_data_type between", value1, value2, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_data_type not between", value1, value2, "firstimgshowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdIsNull() {
            addCriterion("firstimgshow_data_org_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdIsNotNull() {
            addCriterion("firstimgshow_data_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdEqualTo(String value) {
            addCriterion("firstimgshow_data_org_id =", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdNotEqualTo(String value) {
            addCriterion("firstimgshow_data_org_id <>", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdGreaterThan(String value) {
            addCriterion("firstimgshow_data_org_id >", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstimgshow_data_org_id >=", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdLessThan(String value) {
            addCriterion("firstimgshow_data_org_id <", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdLessThanOrEqualTo(String value) {
            addCriterion("firstimgshow_data_org_id <=", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdLike(String value) {
            addCriterion("firstimgshow_data_org_id like", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdNotLike(String value) {
            addCriterion("firstimgshow_data_org_id not like", value, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdIn(List<String> values) {
            addCriterion("firstimgshow_data_org_id in", values, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdNotIn(List<String> values) {
            addCriterion("firstimgshow_data_org_id not in", values, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdBetween(String value1, String value2) {
            addCriterion("firstimgshow_data_org_id between", value1, value2, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowDataOrgIdNotBetween(String value1, String value2) {
            addCriterion("firstimgshow_data_org_id not between", value1, value2, "firstimgshowDataOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexIsNull() {
            addCriterion("firstimgshow_index is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexIsNotNull() {
            addCriterion("firstimgshow_index is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexEqualTo(Integer value) {
            addCriterion("firstimgshow_index =", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexNotEqualTo(Integer value) {
            addCriterion("firstimgshow_index <>", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexGreaterThan(Integer value) {
            addCriterion("firstimgshow_index >", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_index >=", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexLessThan(Integer value) {
            addCriterion("firstimgshow_index <", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexLessThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_index <=", value, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexIn(List<Integer> values) {
            addCriterion("firstimgshow_index in", values, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexNotIn(List<Integer> values) {
            addCriterion("firstimgshow_index not in", values, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_index between", value1, value2, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_index not between", value1, value2, "firstimgshowIndex");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusIsNull() {
            addCriterion("firstimgshow_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusIsNotNull() {
            addCriterion("firstimgshow_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusEqualTo(Integer value) {
            addCriterion("firstimgshow_status =", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusNotEqualTo(Integer value) {
            addCriterion("firstimgshow_status <>", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusGreaterThan(Integer value) {
            addCriterion("firstimgshow_status >", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_status >=", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusLessThan(Integer value) {
            addCriterion("firstimgshow_status <", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusLessThanOrEqualTo(Integer value) {
            addCriterion("firstimgshow_status <=", value, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusIn(List<Integer> values) {
            addCriterion("firstimgshow_status in", values, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusNotIn(List<Integer> values) {
            addCriterion("firstimgshow_status not in", values, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_status between", value1, value2, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("firstimgshow_status not between", value1, value2, "firstimgshowStatus");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedIsNull() {
            addCriterion("firstimgshow_created is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedIsNotNull() {
            addCriterion("firstimgshow_created is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedEqualTo(Date value) {
            addCriterion("firstimgshow_created =", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedNotEqualTo(Date value) {
            addCriterion("firstimgshow_created <>", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedGreaterThan(Date value) {
            addCriterion("firstimgshow_created >", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("firstimgshow_created >=", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedLessThan(Date value) {
            addCriterion("firstimgshow_created <", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedLessThanOrEqualTo(Date value) {
            addCriterion("firstimgshow_created <=", value, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedIn(List<Date> values) {
            addCriterion("firstimgshow_created in", values, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedNotIn(List<Date> values) {
            addCriterion("firstimgshow_created not in", values, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedBetween(Date value1, Date value2) {
            addCriterion("firstimgshow_created between", value1, value2, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowCreatedNotBetween(Date value1, Date value2) {
            addCriterion("firstimgshow_created not between", value1, value2, "firstimgshowCreated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedIsNull() {
            addCriterion("firstimgshow_updated is null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedIsNotNull() {
            addCriterion("firstimgshow_updated is not null");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedEqualTo(Date value) {
            addCriterion("firstimgshow_updated =", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedNotEqualTo(Date value) {
            addCriterion("firstimgshow_updated <>", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedGreaterThan(Date value) {
            addCriterion("firstimgshow_updated >", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("firstimgshow_updated >=", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedLessThan(Date value) {
            addCriterion("firstimgshow_updated <", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("firstimgshow_updated <=", value, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedIn(List<Date> values) {
            addCriterion("firstimgshow_updated in", values, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedNotIn(List<Date> values) {
            addCriterion("firstimgshow_updated not in", values, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedBetween(Date value1, Date value2) {
            addCriterion("firstimgshow_updated between", value1, value2, "firstimgshowUpdated");
            return (Criteria) this;
        }

        public Criteria andFirstimgshowUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("firstimgshow_updated not between", value1, value2, "firstimgshowUpdated");
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