package br.crm.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictImgExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Long value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Long value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Long value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Long value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Long value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Long> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Long> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Long value1, Long value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Long value1, Long value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNull() {
            addCriterion("img_name is null");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNotNull() {
            addCriterion("img_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameEqualTo(String value) {
            addCriterion("img_name =", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("img_name <>", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("img_name >", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_name >=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThan(String value) {
            addCriterion("img_name <", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("img_name <=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLike(String value) {
            addCriterion("img_name like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotLike(String value) {
            addCriterion("img_name not like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameIn(List<String> values) {
            addCriterion("img_name in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("img_name not in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("img_name between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("img_name not between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNull() {
            addCriterion("img_size is null");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNotNull() {
            addCriterion("img_size is not null");
            return (Criteria) this;
        }

        public Criteria andImgSizeEqualTo(Long value) {
            addCriterion("img_size =", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotEqualTo(Long value) {
            addCriterion("img_size <>", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThan(Long value) {
            addCriterion("img_size >", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("img_size >=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThan(Long value) {
            addCriterion("img_size <", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThanOrEqualTo(Long value) {
            addCriterion("img_size <=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeIn(List<Long> values) {
            addCriterion("img_size in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotIn(List<Long> values) {
            addCriterion("img_size not in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeBetween(Long value1, Long value2) {
            addCriterion("img_size between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotBetween(Long value1, Long value2) {
            addCriterion("img_size not between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgLocationIsNull() {
            addCriterion("img_location is null");
            return (Criteria) this;
        }

        public Criteria andImgLocationIsNotNull() {
            addCriterion("img_location is not null");
            return (Criteria) this;
        }

        public Criteria andImgLocationEqualTo(String value) {
            addCriterion("img_location =", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotEqualTo(String value) {
            addCriterion("img_location <>", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationGreaterThan(String value) {
            addCriterion("img_location >", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationGreaterThanOrEqualTo(String value) {
            addCriterion("img_location >=", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLessThan(String value) {
            addCriterion("img_location <", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLessThanOrEqualTo(String value) {
            addCriterion("img_location <=", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLike(String value) {
            addCriterion("img_location like", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotLike(String value) {
            addCriterion("img_location not like", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationIn(List<String> values) {
            addCriterion("img_location in", values, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotIn(List<String> values) {
            addCriterion("img_location not in", values, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationBetween(String value1, String value2) {
            addCriterion("img_location between", value1, value2, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotBetween(String value1, String value2) {
            addCriterion("img_location not between", value1, value2, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNull() {
            addCriterion("img_type is null");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNotNull() {
            addCriterion("img_type is not null");
            return (Criteria) this;
        }

        public Criteria andImgTypeEqualTo(String value) {
            addCriterion("img_type =", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotEqualTo(String value) {
            addCriterion("img_type <>", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThan(String value) {
            addCriterion("img_type >", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("img_type >=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThan(String value) {
            addCriterion("img_type <", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThanOrEqualTo(String value) {
            addCriterion("img_type <=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLike(String value) {
            addCriterion("img_type like", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotLike(String value) {
            addCriterion("img_type not like", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeIn(List<String> values) {
            addCriterion("img_type in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotIn(List<String> values) {
            addCriterion("img_type not in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeBetween(String value1, String value2) {
            addCriterion("img_type between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotBetween(String value1, String value2) {
            addCriterion("img_type not between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgNoteIsNull() {
            addCriterion("img_note is null");
            return (Criteria) this;
        }

        public Criteria andImgNoteIsNotNull() {
            addCriterion("img_note is not null");
            return (Criteria) this;
        }

        public Criteria andImgNoteEqualTo(String value) {
            addCriterion("img_note =", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteNotEqualTo(String value) {
            addCriterion("img_note <>", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteGreaterThan(String value) {
            addCriterion("img_note >", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteGreaterThanOrEqualTo(String value) {
            addCriterion("img_note >=", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteLessThan(String value) {
            addCriterion("img_note <", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteLessThanOrEqualTo(String value) {
            addCriterion("img_note <=", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteLike(String value) {
            addCriterion("img_note like", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteNotLike(String value) {
            addCriterion("img_note not like", value, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteIn(List<String> values) {
            addCriterion("img_note in", values, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteNotIn(List<String> values) {
            addCriterion("img_note not in", values, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteBetween(String value1, String value2) {
            addCriterion("img_note between", value1, value2, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgNoteNotBetween(String value1, String value2) {
            addCriterion("img_note not between", value1, value2, "imgNote");
            return (Criteria) this;
        }

        public Criteria andImgStatusIsNull() {
            addCriterion("img_status is null");
            return (Criteria) this;
        }

        public Criteria andImgStatusIsNotNull() {
            addCriterion("img_status is not null");
            return (Criteria) this;
        }

        public Criteria andImgStatusEqualTo(Integer value) {
            addCriterion("img_status =", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotEqualTo(Integer value) {
            addCriterion("img_status <>", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusGreaterThan(Integer value) {
            addCriterion("img_status >", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_status >=", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusLessThan(Integer value) {
            addCriterion("img_status <", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("img_status <=", value, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusIn(List<Integer> values) {
            addCriterion("img_status in", values, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotIn(List<Integer> values) {
            addCriterion("img_status not in", values, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusBetween(Integer value1, Integer value2) {
            addCriterion("img_status between", value1, value2, "imgStatus");
            return (Criteria) this;
        }

        public Criteria andImgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("img_status not between", value1, value2, "imgStatus");
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