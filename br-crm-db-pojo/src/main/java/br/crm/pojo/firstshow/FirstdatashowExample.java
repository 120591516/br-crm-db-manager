package br.crm.pojo.firstshow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FirstdatashowExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstdatashowExample() {
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

        public Criteria andFirstdatashowIdIsNull() {
            addCriterion("firstdatashow_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdIsNotNull() {
            addCriterion("firstdatashow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdEqualTo(String value) {
            addCriterion("firstdatashow_id =", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdNotEqualTo(String value) {
            addCriterion("firstdatashow_id <>", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdGreaterThan(String value) {
            addCriterion("firstdatashow_id >", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstdatashow_id >=", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdLessThan(String value) {
            addCriterion("firstdatashow_id <", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdLessThanOrEqualTo(String value) {
            addCriterion("firstdatashow_id <=", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdLike(String value) {
            addCriterion("firstdatashow_id like", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdNotLike(String value) {
            addCriterion("firstdatashow_id not like", value, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdIn(List<String> values) {
            addCriterion("firstdatashow_id in", values, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdNotIn(List<String> values) {
            addCriterion("firstdatashow_id not in", values, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdBetween(String value1, String value2) {
            addCriterion("firstdatashow_id between", value1, value2, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowIdNotBetween(String value1, String value2) {
            addCriterion("firstdatashow_id not between", value1, value2, "firstdatashowId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeIsNull() {
            addCriterion("firstdatashow_data_type is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeIsNotNull() {
            addCriterion("firstdatashow_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeEqualTo(Integer value) {
            addCriterion("firstdatashow_data_type =", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeNotEqualTo(Integer value) {
            addCriterion("firstdatashow_data_type <>", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeGreaterThan(Integer value) {
            addCriterion("firstdatashow_data_type >", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstdatashow_data_type >=", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeLessThan(Integer value) {
            addCriterion("firstdatashow_data_type <", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("firstdatashow_data_type <=", value, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeIn(List<Integer> values) {
            addCriterion("firstdatashow_data_type in", values, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeNotIn(List<Integer> values) {
            addCriterion("firstdatashow_data_type not in", values, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("firstdatashow_data_type between", value1, value2, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("firstdatashow_data_type not between", value1, value2, "firstdatashowDataType");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdIsNull() {
            addCriterion("firstdatashow_data_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdIsNotNull() {
            addCriterion("firstdatashow_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdEqualTo(String value) {
            addCriterion("firstdatashow_data_id =", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdNotEqualTo(String value) {
            addCriterion("firstdatashow_data_id <>", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdGreaterThan(String value) {
            addCriterion("firstdatashow_data_id >", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_id >=", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdLessThan(String value) {
            addCriterion("firstdatashow_data_id <", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdLessThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_id <=", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdLike(String value) {
            addCriterion("firstdatashow_data_id like", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdNotLike(String value) {
            addCriterion("firstdatashow_data_id not like", value, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdIn(List<String> values) {
            addCriterion("firstdatashow_data_id in", values, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdNotIn(List<String> values) {
            addCriterion("firstdatashow_data_id not in", values, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_id between", value1, value2, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataIdNotBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_id not between", value1, value2, "firstdatashowDataId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdIsNull() {
            addCriterion("firstdatashow_data_image_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdIsNotNull() {
            addCriterion("firstdatashow_data_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdEqualTo(Long value) {
            addCriterion("firstdatashow_data_image_id =", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdNotEqualTo(Long value) {
            addCriterion("firstdatashow_data_image_id <>", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdGreaterThan(Long value) {
            addCriterion("firstdatashow_data_image_id >", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("firstdatashow_data_image_id >=", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdLessThan(Long value) {
            addCriterion("firstdatashow_data_image_id <", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdLessThanOrEqualTo(Long value) {
            addCriterion("firstdatashow_data_image_id <=", value, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdIn(List<Long> values) {
            addCriterion("firstdatashow_data_image_id in", values, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdNotIn(List<Long> values) {
            addCriterion("firstdatashow_data_image_id not in", values, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdBetween(Long value1, Long value2) {
            addCriterion("firstdatashow_data_image_id between", value1, value2, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataImageIdNotBetween(Long value1, Long value2) {
            addCriterion("firstdatashow_data_image_id not between", value1, value2, "firstdatashowDataImageId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameIsNull() {
            addCriterion("firstdatashow_data_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameIsNotNull() {
            addCriterion("firstdatashow_data_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameEqualTo(String value) {
            addCriterion("firstdatashow_data_name =", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameNotEqualTo(String value) {
            addCriterion("firstdatashow_data_name <>", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameGreaterThan(String value) {
            addCriterion("firstdatashow_data_name >", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_name >=", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameLessThan(String value) {
            addCriterion("firstdatashow_data_name <", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameLessThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_name <=", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameLike(String value) {
            addCriterion("firstdatashow_data_name like", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameNotLike(String value) {
            addCriterion("firstdatashow_data_name not like", value, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameIn(List<String> values) {
            addCriterion("firstdatashow_data_name in", values, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameNotIn(List<String> values) {
            addCriterion("firstdatashow_data_name not in", values, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_name between", value1, value2, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataNameNotBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_name not between", value1, value2, "firstdatashowDataName");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeIsNull() {
            addCriterion("firstdatashow_data_describe is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeIsNotNull() {
            addCriterion("firstdatashow_data_describe is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeEqualTo(String value) {
            addCriterion("firstdatashow_data_describe =", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeNotEqualTo(String value) {
            addCriterion("firstdatashow_data_describe <>", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeGreaterThan(String value) {
            addCriterion("firstdatashow_data_describe >", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_describe >=", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeLessThan(String value) {
            addCriterion("firstdatashow_data_describe <", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeLessThanOrEqualTo(String value) {
            addCriterion("firstdatashow_data_describe <=", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeLike(String value) {
            addCriterion("firstdatashow_data_describe like", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeNotLike(String value) {
            addCriterion("firstdatashow_data_describe not like", value, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeIn(List<String> values) {
            addCriterion("firstdatashow_data_describe in", values, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeNotIn(List<String> values) {
            addCriterion("firstdatashow_data_describe not in", values, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_describe between", value1, value2, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataDescribeNotBetween(String value1, String value2) {
            addCriterion("firstdatashow_data_describe not between", value1, value2, "firstdatashowDataDescribe");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusIsNull() {
            addCriterion("firstdatashow_data_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusIsNotNull() {
            addCriterion("firstdatashow_data_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusEqualTo(Integer value) {
            addCriterion("firstdatashow_data_status =", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusNotEqualTo(Integer value) {
            addCriterion("firstdatashow_data_status <>", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusGreaterThan(Integer value) {
            addCriterion("firstdatashow_data_status >", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstdatashow_data_status >=", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusLessThan(Integer value) {
            addCriterion("firstdatashow_data_status <", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("firstdatashow_data_status <=", value, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusIn(List<Integer> values) {
            addCriterion("firstdatashow_data_status in", values, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusNotIn(List<Integer> values) {
            addCriterion("firstdatashow_data_status not in", values, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("firstdatashow_data_status between", value1, value2, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("firstdatashow_data_status not between", value1, value2, "firstdatashowDataStatus");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeIsNull() {
            addCriterion("firstdatashow_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeIsNotNull() {
            addCriterion("firstdatashow_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeEqualTo(Date value) {
            addCriterion("firstdatashow_create_time =", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeNotEqualTo(Date value) {
            addCriterion("firstdatashow_create_time <>", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeGreaterThan(Date value) {
            addCriterion("firstdatashow_create_time >", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstdatashow_create_time >=", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeLessThan(Date value) {
            addCriterion("firstdatashow_create_time <", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("firstdatashow_create_time <=", value, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeIn(List<Date> values) {
            addCriterion("firstdatashow_create_time in", values, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeNotIn(List<Date> values) {
            addCriterion("firstdatashow_create_time not in", values, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeBetween(Date value1, Date value2) {
            addCriterion("firstdatashow_create_time between", value1, value2, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("firstdatashow_create_time not between", value1, value2, "firstdatashowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeIsNull() {
            addCriterion("firstdatashow_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeIsNotNull() {
            addCriterion("firstdatashow_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeEqualTo(Date value) {
            addCriterion("firstdatashow_edit_time =", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeNotEqualTo(Date value) {
            addCriterion("firstdatashow_edit_time <>", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeGreaterThan(Date value) {
            addCriterion("firstdatashow_edit_time >", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstdatashow_edit_time >=", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeLessThan(Date value) {
            addCriterion("firstdatashow_edit_time <", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("firstdatashow_edit_time <=", value, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeIn(List<Date> values) {
            addCriterion("firstdatashow_edit_time in", values, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeNotIn(List<Date> values) {
            addCriterion("firstdatashow_edit_time not in", values, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeBetween(Date value1, Date value2) {
            addCriterion("firstdatashow_edit_time between", value1, value2, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("firstdatashow_edit_time not between", value1, value2, "firstdatashowEditTime");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdIsNull() {
            addCriterion("firstdatashow_org_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdIsNotNull() {
            addCriterion("firstdatashow_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdEqualTo(String value) {
            addCriterion("firstdatashow_org_id =", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdNotEqualTo(String value) {
            addCriterion("firstdatashow_org_id <>", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdGreaterThan(String value) {
            addCriterion("firstdatashow_org_id >", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("firstdatashow_org_id >=", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdLessThan(String value) {
            addCriterion("firstdatashow_org_id <", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdLessThanOrEqualTo(String value) {
            addCriterion("firstdatashow_org_id <=", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdLike(String value) {
            addCriterion("firstdatashow_org_id like", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdNotLike(String value) {
            addCriterion("firstdatashow_org_id not like", value, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdIn(List<String> values) {
            addCriterion("firstdatashow_org_id in", values, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdNotIn(List<String> values) {
            addCriterion("firstdatashow_org_id not in", values, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdBetween(String value1, String value2) {
            addCriterion("firstdatashow_org_id between", value1, value2, "firstdatashowOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstdatashowOrgIdNotBetween(String value1, String value2) {
            addCriterion("firstdatashow_org_id not between", value1, value2, "firstdatashowOrgId");
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