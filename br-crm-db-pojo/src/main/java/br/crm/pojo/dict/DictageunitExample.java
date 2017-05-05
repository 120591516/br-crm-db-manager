package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictageunitExample implements Serializable {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DictageunitExample() {
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

		public Criteria andAgeunitIdIsNull() {
			addCriterion("AgeUnit_ID is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdIsNotNull() {
			addCriterion("AgeUnit_ID is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdEqualTo(Integer value) {
			addCriterion("AgeUnit_ID =", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdNotEqualTo(Integer value) {
			addCriterion("AgeUnit_ID <>", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdGreaterThan(Integer value) {
			addCriterion("AgeUnit_ID >", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("AgeUnit_ID >=", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdLessThan(Integer value) {
			addCriterion("AgeUnit_ID <", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdLessThanOrEqualTo(Integer value) {
			addCriterion("AgeUnit_ID <=", value, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdIn(List<Integer> values) {
			addCriterion("AgeUnit_ID in", values, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdNotIn(List<Integer> values) {
			addCriterion("AgeUnit_ID not in", values, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdBetween(Integer value1, Integer value2) {
			addCriterion("AgeUnit_ID between", value1, value2, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("AgeUnit_ID not between", value1, value2, "ageunitId");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyIsNull() {
			addCriterion("AgeUnit_key is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyIsNotNull() {
			addCriterion("AgeUnit_key is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyEqualTo(String value) {
			addCriterion("AgeUnit_key =", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyNotEqualTo(String value) {
			addCriterion("AgeUnit_key <>", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyGreaterThan(String value) {
			addCriterion("AgeUnit_key >", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyGreaterThanOrEqualTo(String value) {
			addCriterion("AgeUnit_key >=", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyLessThan(String value) {
			addCriterion("AgeUnit_key <", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyLessThanOrEqualTo(String value) {
			addCriterion("AgeUnit_key <=", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyLike(String value) {
			addCriterion("AgeUnit_key like", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyNotLike(String value) {
			addCriterion("AgeUnit_key not like", value, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyIn(List<String> values) {
			addCriterion("AgeUnit_key in", values, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyNotIn(List<String> values) {
			addCriterion("AgeUnit_key not in", values, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyBetween(String value1, String value2) {
			addCriterion("AgeUnit_key between", value1, value2, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitKeyNotBetween(String value1, String value2) {
			addCriterion("AgeUnit_key not between", value1, value2, "ageunitKey");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameIsNull() {
			addCriterion("AgeUnit_Name is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameIsNotNull() {
			addCriterion("AgeUnit_Name is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameEqualTo(String value) {
			addCriterion("AgeUnit_Name =", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameNotEqualTo(String value) {
			addCriterion("AgeUnit_Name <>", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameGreaterThan(String value) {
			addCriterion("AgeUnit_Name >", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameGreaterThanOrEqualTo(String value) {
			addCriterion("AgeUnit_Name >=", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameLessThan(String value) {
			addCriterion("AgeUnit_Name <", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameLessThanOrEqualTo(String value) {
			addCriterion("AgeUnit_Name <=", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameLike(String value) {
			addCriterion("AgeUnit_Name like", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameNotLike(String value) {
			addCriterion("AgeUnit_Name not like", value, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameIn(List<String> values) {
			addCriterion("AgeUnit_Name in", values, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameNotIn(List<String> values) {
			addCriterion("AgeUnit_Name not in", values, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameBetween(String value1, String value2) {
			addCriterion("AgeUnit_Name between", value1, value2, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitNameNotBetween(String value1, String value2) {
			addCriterion("AgeUnit_Name not between", value1, value2, "ageunitName");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeIsNull() {
			addCriterion("AgeUnit_Code is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeIsNotNull() {
			addCriterion("AgeUnit_Code is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeEqualTo(String value) {
			addCriterion("AgeUnit_Code =", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeNotEqualTo(String value) {
			addCriterion("AgeUnit_Code <>", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeGreaterThan(String value) {
			addCriterion("AgeUnit_Code >", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeGreaterThanOrEqualTo(String value) {
			addCriterion("AgeUnit_Code >=", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeLessThan(String value) {
			addCriterion("AgeUnit_Code <", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeLessThanOrEqualTo(String value) {
			addCriterion("AgeUnit_Code <=", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeLike(String value) {
			addCriterion("AgeUnit_Code like", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeNotLike(String value) {
			addCriterion("AgeUnit_Code not like", value, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeIn(List<String> values) {
			addCriterion("AgeUnit_Code in", values, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeNotIn(List<String> values) {
			addCriterion("AgeUnit_Code not in", values, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeBetween(String value1, String value2) {
			addCriterion("AgeUnit_Code between", value1, value2, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andAgeunitCodeNotBetween(String value1, String value2) {
			addCriterion("AgeUnit_Code not between", value1, value2, "ageunitCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeIsNull() {
			addCriterion("Input_Code is null");
			return (Criteria) this;
		}

		public Criteria andInputCodeIsNotNull() {
			addCriterion("Input_Code is not null");
			return (Criteria) this;
		}

		public Criteria andInputCodeEqualTo(String value) {
			addCriterion("Input_Code =", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeNotEqualTo(String value) {
			addCriterion("Input_Code <>", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeGreaterThan(String value) {
			addCriterion("Input_Code >", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeGreaterThanOrEqualTo(String value) {
			addCriterion("Input_Code >=", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeLessThan(String value) {
			addCriterion("Input_Code <", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeLessThanOrEqualTo(String value) {
			addCriterion("Input_Code <=", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeLike(String value) {
			addCriterion("Input_Code like", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeNotLike(String value) {
			addCriterion("Input_Code not like", value, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeIn(List<String> values) {
			addCriterion("Input_Code in", values, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeNotIn(List<String> values) {
			addCriterion("Input_Code not in", values, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeBetween(String value1, String value2) {
			addCriterion("Input_Code between", value1, value2, "inputCode");
			return (Criteria) this;
		}

		public Criteria andInputCodeNotBetween(String value1, String value2) {
			addCriterion("Input_Code not between", value1, value2, "inputCode");
			return (Criteria) this;
		}

		public Criteria andNoteIsNull() {
			addCriterion("Note is null");
			return (Criteria) this;
		}

		public Criteria andNoteIsNotNull() {
			addCriterion("Note is not null");
			return (Criteria) this;
		}

		public Criteria andNoteEqualTo(String value) {
			addCriterion("Note =", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotEqualTo(String value) {
			addCriterion("Note <>", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteGreaterThan(String value) {
			addCriterion("Note >", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteGreaterThanOrEqualTo(String value) {
			addCriterion("Note >=", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLessThan(String value) {
			addCriterion("Note <", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLessThanOrEqualTo(String value) {
			addCriterion("Note <=", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteLike(String value) {
			addCriterion("Note like", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotLike(String value) {
			addCriterion("Note not like", value, "note");
			return (Criteria) this;
		}

		public Criteria andNoteIn(List<String> values) {
			addCriterion("Note in", values, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotIn(List<String> values) {
			addCriterion("Note not in", values, "note");
			return (Criteria) this;
		}

		public Criteria andNoteBetween(String value1, String value2) {
			addCriterion("Note between", value1, value2, "note");
			return (Criteria) this;
		}

		public Criteria andNoteNotBetween(String value1, String value2) {
			addCriterion("Note not between", value1, value2, "note");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexIsNull() {
			addCriterion("AgeUnitCodeX is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexIsNotNull() {
			addCriterion("AgeUnitCodeX is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexEqualTo(String value) {
			addCriterion("AgeUnitCodeX =", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexNotEqualTo(String value) {
			addCriterion("AgeUnitCodeX <>", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexGreaterThan(String value) {
			addCriterion("AgeUnitCodeX >", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexGreaterThanOrEqualTo(String value) {
			addCriterion("AgeUnitCodeX >=", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexLessThan(String value) {
			addCriterion("AgeUnitCodeX <", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexLessThanOrEqualTo(String value) {
			addCriterion("AgeUnitCodeX <=", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexLike(String value) {
			addCriterion("AgeUnitCodeX like", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexNotLike(String value) {
			addCriterion("AgeUnitCodeX not like", value, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexIn(List<String> values) {
			addCriterion("AgeUnitCodeX in", values, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexNotIn(List<String> values) {
			addCriterion("AgeUnitCodeX not in", values, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexBetween(String value1, String value2) {
			addCriterion("AgeUnitCodeX between", value1, value2, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitcodexNotBetween(String value1, String value2) {
			addCriterion("AgeUnitCodeX not between", value1, value2, "ageunitcodex");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeIsNull() {
			addCriterion("AgeUnit_createtime is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeIsNotNull() {
			addCriterion("AgeUnit_createtime is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeEqualTo(Date value) {
			addCriterion("AgeUnit_createtime =", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeNotEqualTo(Date value) {
			addCriterion("AgeUnit_createtime <>", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeGreaterThan(Date value) {
			addCriterion("AgeUnit_createtime >", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("AgeUnit_createtime >=", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeLessThan(Date value) {
			addCriterion("AgeUnit_createtime <", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("AgeUnit_createtime <=", value, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeIn(List<Date> values) {
			addCriterion("AgeUnit_createtime in", values, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeNotIn(List<Date> values) {
			addCriterion("AgeUnit_createtime not in", values, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeBetween(Date value1, Date value2) {
			addCriterion("AgeUnit_createtime between", value1, value2, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("AgeUnit_createtime not between", value1, value2, "ageunitCreatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeIsNull() {
			addCriterion("AgeUnit_updatetime is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeIsNotNull() {
			addCriterion("AgeUnit_updatetime is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeEqualTo(Date value) {
			addCriterion("AgeUnit_updatetime =", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeNotEqualTo(Date value) {
			addCriterion("AgeUnit_updatetime <>", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeGreaterThan(Date value) {
			addCriterion("AgeUnit_updatetime >", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("AgeUnit_updatetime >=", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeLessThan(Date value) {
			addCriterion("AgeUnit_updatetime <", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("AgeUnit_updatetime <=", value, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeIn(List<Date> values) {
			addCriterion("AgeUnit_updatetime in", values, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeNotIn(List<Date> values) {
			addCriterion("AgeUnit_updatetime not in", values, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("AgeUnit_updatetime between", value1, value2, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("AgeUnit_updatetime not between", value1, value2, "ageunitUpdatetime");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusIsNull() {
			addCriterion("AgeUnit_Status is null");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusIsNotNull() {
			addCriterion("AgeUnit_Status is not null");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusEqualTo(Integer value) {
			addCriterion("AgeUnit_Status =", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusNotEqualTo(Integer value) {
			addCriterion("AgeUnit_Status <>", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusGreaterThan(Integer value) {
			addCriterion("AgeUnit_Status >", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("AgeUnit_Status >=", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusLessThan(Integer value) {
			addCriterion("AgeUnit_Status <", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusLessThanOrEqualTo(Integer value) {
			addCriterion("AgeUnit_Status <=", value, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusIn(List<Integer> values) {
			addCriterion("AgeUnit_Status in", values, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusNotIn(List<Integer> values) {
			addCriterion("AgeUnit_Status not in", values, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusBetween(Integer value1, Integer value2) {
			addCriterion("AgeUnit_Status between", value1, value2, "ageunitStatus");
			return (Criteria) this;
		}

		public Criteria andAgeunitStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("AgeUnit_Status not between", value1, value2, "ageunitStatus");
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