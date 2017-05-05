package br.crm.pojo.examfeeitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExamFeeItemClassExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExamFeeItemClassExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameIsNull() {
            addCriterion("fee_item_class_name is null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameIsNotNull() {
            addCriterion("fee_item_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEqualTo(String value) {
            addCriterion("fee_item_class_name =", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameNotEqualTo(String value) {
            addCriterion("fee_item_class_name <>", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameGreaterThan(String value) {
            addCriterion("fee_item_class_name >", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("fee_item_class_name >=", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameLessThan(String value) {
            addCriterion("fee_item_class_name <", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameLessThanOrEqualTo(String value) {
            addCriterion("fee_item_class_name <=", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameLike(String value) {
            addCriterion("fee_item_class_name like", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameNotLike(String value) {
            addCriterion("fee_item_class_name not like", value, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameIn(List<String> values) {
            addCriterion("fee_item_class_name in", values, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameNotIn(List<String> values) {
            addCriterion("fee_item_class_name not in", values, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameBetween(String value1, String value2) {
            addCriterion("fee_item_class_name between", value1, value2, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameNotBetween(String value1, String value2) {
            addCriterion("fee_item_class_name not between", value1, value2, "feeItemClassName");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngIsNull() {
            addCriterion("fee_item_class_name_eng is null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngIsNotNull() {
            addCriterion("fee_item_class_name_eng is not null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngEqualTo(String value) {
            addCriterion("fee_item_class_name_eng =", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngNotEqualTo(String value) {
            addCriterion("fee_item_class_name_eng <>", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngGreaterThan(String value) {
            addCriterion("fee_item_class_name_eng >", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("fee_item_class_name_eng >=", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngLessThan(String value) {
            addCriterion("fee_item_class_name_eng <", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngLessThanOrEqualTo(String value) {
            addCriterion("fee_item_class_name_eng <=", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngLike(String value) {
            addCriterion("fee_item_class_name_eng like", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngNotLike(String value) {
            addCriterion("fee_item_class_name_eng not like", value, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngIn(List<String> values) {
            addCriterion("fee_item_class_name_eng in", values, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngNotIn(List<String> values) {
            addCriterion("fee_item_class_name_eng not in", values, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngBetween(String value1, String value2) {
            addCriterion("fee_item_class_name_eng between", value1, value2, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassNameEngNotBetween(String value1, String value2) {
            addCriterion("fee_item_class_name_eng not between", value1, value2, "feeItemClassNameEng");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeIsNull() {
            addCriterion("fee_item_class_code is null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeIsNotNull() {
            addCriterion("fee_item_class_code is not null");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeEqualTo(String value) {
            addCriterion("fee_item_class_code =", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeNotEqualTo(String value) {
            addCriterion("fee_item_class_code <>", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeGreaterThan(String value) {
            addCriterion("fee_item_class_code >", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_item_class_code >=", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeLessThan(String value) {
            addCriterion("fee_item_class_code <", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeLessThanOrEqualTo(String value) {
            addCriterion("fee_item_class_code <=", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeLike(String value) {
            addCriterion("fee_item_class_code like", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeNotLike(String value) {
            addCriterion("fee_item_class_code not like", value, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeIn(List<String> values) {
            addCriterion("fee_item_class_code in", values, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeNotIn(List<String> values) {
            addCriterion("fee_item_class_code not in", values, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeBetween(String value1, String value2) {
            addCriterion("fee_item_class_code between", value1, value2, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andFeeItemClassCodeNotBetween(String value1, String value2) {
            addCriterion("fee_item_class_code not between", value1, value2, "feeItemClassCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNull() {
            addCriterion("input_code is null");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNotNull() {
            addCriterion("input_code is not null");
            return (Criteria) this;
        }

        public Criteria andInputCodeEqualTo(String value) {
            addCriterion("input_code =", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotEqualTo(String value) {
            addCriterion("input_code <>", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThan(String value) {
            addCriterion("input_code >", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("input_code >=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThan(String value) {
            addCriterion("input_code <", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThanOrEqualTo(String value) {
            addCriterion("input_code <=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLike(String value) {
            addCriterion("input_code like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotLike(String value) {
            addCriterion("input_code not like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIn(List<String> values) {
            addCriterion("input_code in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotIn(List<String> values) {
            addCriterion("input_code not in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeBetween(String value1, String value2) {
            addCriterion("input_code between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotBetween(String value1, String value2) {
            addCriterion("input_code not between", value1, value2, "inputCode");
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