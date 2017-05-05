package br.crm.pojo.group;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseGroupExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseGroupExample() {
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

        public Criteria andEnterpriseGroupIdIsNull() {
            addCriterion("enterprise_group_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdIsNotNull() {
            addCriterion("enterprise_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdEqualTo(String value) {
            addCriterion("enterprise_group_id =", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotEqualTo(String value) {
            addCriterion("enterprise_group_id <>", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdGreaterThan(String value) {
            addCriterion("enterprise_group_id >", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_id >=", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLessThan(String value) {
            addCriterion("enterprise_group_id <", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_id <=", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdLike(String value) {
            addCriterion("enterprise_group_id like", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotLike(String value) {
            addCriterion("enterprise_group_id not like", value, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdIn(List<String> values) {
            addCriterion("enterprise_group_id in", values, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotIn(List<String> values) {
            addCriterion("enterprise_group_id not in", values, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdBetween(String value1, String value2) {
            addCriterion("enterprise_group_id between", value1, value2, "enterpriseGroupId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_id not between", value1, value2, "enterpriseGroupId");
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

        public Criteria andEnterpriseGroupTypeIdIsNull() {
            addCriterion("enterprise_group_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdIsNotNull() {
            addCriterion("enterprise_group_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdEqualTo(String value) {
            addCriterion("enterprise_group_type_id =", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdNotEqualTo(String value) {
            addCriterion("enterprise_group_type_id <>", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdGreaterThan(String value) {
            addCriterion("enterprise_group_type_id >", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_type_id >=", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdLessThan(String value) {
            addCriterion("enterprise_group_type_id <", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_type_id <=", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdLike(String value) {
            addCriterion("enterprise_group_type_id like", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdNotLike(String value) {
            addCriterion("enterprise_group_type_id not like", value, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdIn(List<String> values) {
            addCriterion("enterprise_group_type_id in", values, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdNotIn(List<String> values) {
            addCriterion("enterprise_group_type_id not in", values, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdBetween(String value1, String value2) {
            addCriterion("enterprise_group_type_id between", value1, value2, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupTypeIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_type_id not between", value1, value2, "enterpriseGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameIsNull() {
            addCriterion("enterprise_group_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameIsNotNull() {
            addCriterion("enterprise_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameEqualTo(String value) {
            addCriterion("enterprise_group_name =", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameNotEqualTo(String value) {
            addCriterion("enterprise_group_name <>", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameGreaterThan(String value) {
            addCriterion("enterprise_group_name >", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_name >=", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameLessThan(String value) {
            addCriterion("enterprise_group_name <", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_name <=", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameLike(String value) {
            addCriterion("enterprise_group_name like", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameNotLike(String value) {
            addCriterion("enterprise_group_name not like", value, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameIn(List<String> values) {
            addCriterion("enterprise_group_name in", values, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameNotIn(List<String> values) {
            addCriterion("enterprise_group_name not in", values, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameBetween(String value1, String value2) {
            addCriterion("enterprise_group_name between", value1, value2, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_name not between", value1, value2, "enterpriseGroupName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeIsNull() {
            addCriterion("enterprise_group_planned_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeIsNotNull() {
            addCriterion("enterprise_group_planned_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeEqualTo(Date value) {
            addCriterion("enterprise_group_planned_time =", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeNotEqualTo(Date value) {
            addCriterion("enterprise_group_planned_time <>", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeGreaterThan(Date value) {
            addCriterion("enterprise_group_planned_time >", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_planned_time >=", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeLessThan(Date value) {
            addCriterion("enterprise_group_planned_time <", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_planned_time <=", value, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeIn(List<Date> values) {
            addCriterion("enterprise_group_planned_time in", values, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeNotIn(List<Date> values) {
            addCriterion("enterprise_group_planned_time not in", values, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_planned_time between", value1, value2, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPlannedTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_planned_time not between", value1, value2, "enterpriseGroupPlannedTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionIsNull() {
            addCriterion("enterprise_group_instruction is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionIsNotNull() {
            addCriterion("enterprise_group_instruction is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionEqualTo(String value) {
            addCriterion("enterprise_group_instruction =", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionNotEqualTo(String value) {
            addCriterion("enterprise_group_instruction <>", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionGreaterThan(String value) {
            addCriterion("enterprise_group_instruction >", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_instruction >=", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionLessThan(String value) {
            addCriterion("enterprise_group_instruction <", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_instruction <=", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionLike(String value) {
            addCriterion("enterprise_group_instruction like", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionNotLike(String value) {
            addCriterion("enterprise_group_instruction not like", value, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionIn(List<String> values) {
            addCriterion("enterprise_group_instruction in", values, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionNotIn(List<String> values) {
            addCriterion("enterprise_group_instruction not in", values, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionBetween(String value1, String value2) {
            addCriterion("enterprise_group_instruction between", value1, value2, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInstructionNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_instruction not between", value1, value2, "enterpriseGroupInstruction");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdIsNull() {
            addCriterion("patient_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdIsNotNull() {
            addCriterion("patient_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdEqualTo(String value) {
            addCriterion("patient_class_id =", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotEqualTo(String value) {
            addCriterion("patient_class_id <>", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdGreaterThan(String value) {
            addCriterion("patient_class_id >", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_class_id >=", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLessThan(String value) {
            addCriterion("patient_class_id <", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLessThanOrEqualTo(String value) {
            addCriterion("patient_class_id <=", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdLike(String value) {
            addCriterion("patient_class_id like", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotLike(String value) {
            addCriterion("patient_class_id not like", value, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdIn(List<String> values) {
            addCriterion("patient_class_id in", values, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotIn(List<String> values) {
            addCriterion("patient_class_id not in", values, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdBetween(String value1, String value2) {
            addCriterion("patient_class_id between", value1, value2, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andPatientClassIdNotBetween(String value1, String value2) {
            addCriterion("patient_class_id not between", value1, value2, "patientClassId");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNull() {
            addCriterion("sex_id is null");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNotNull() {
            addCriterion("sex_id is not null");
            return (Criteria) this;
        }

        public Criteria andSexIdEqualTo(Integer value) {
            addCriterion("sex_id =", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotEqualTo(Integer value) {
            addCriterion("sex_id <>", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThan(Integer value) {
            addCriterion("sex_id >", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex_id >=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThan(Integer value) {
            addCriterion("sex_id <", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThanOrEqualTo(Integer value) {
            addCriterion("sex_id <=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdIn(List<Integer> values) {
            addCriterion("sex_id in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotIn(List<Integer> values) {
            addCriterion("sex_id not in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdBetween(Integer value1, Integer value2) {
            addCriterion("sex_id between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sex_id not between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeIsNull() {
            addCriterion("enterprise_group_min_age is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeIsNotNull() {
            addCriterion("enterprise_group_min_age is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeEqualTo(Integer value) {
            addCriterion("enterprise_group_min_age =", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeNotEqualTo(Integer value) {
            addCriterion("enterprise_group_min_age <>", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeGreaterThan(Integer value) {
            addCriterion("enterprise_group_min_age >", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_min_age >=", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeLessThan(Integer value) {
            addCriterion("enterprise_group_min_age <", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_min_age <=", value, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeIn(List<Integer> values) {
            addCriterion("enterprise_group_min_age in", values, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeNotIn(List<Integer> values) {
            addCriterion("enterprise_group_min_age not in", values, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_min_age between", value1, value2, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMinAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_min_age not between", value1, value2, "enterpriseGroupMinAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeIsNull() {
            addCriterion("enterprise_group_max_age is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeIsNotNull() {
            addCriterion("enterprise_group_max_age is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeEqualTo(Integer value) {
            addCriterion("enterprise_group_max_age =", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeNotEqualTo(Integer value) {
            addCriterion("enterprise_group_max_age <>", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeGreaterThan(Integer value) {
            addCriterion("enterprise_group_max_age >", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_max_age >=", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeLessThan(Integer value) {
            addCriterion("enterprise_group_max_age <", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_max_age <=", value, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeIn(List<Integer> values) {
            addCriterion("enterprise_group_max_age in", values, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeNotIn(List<Integer> values) {
            addCriterion("enterprise_group_max_age not in", values, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_max_age between", value1, value2, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupMaxAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_max_age not between", value1, value2, "enterpriseGroupMaxAge");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerIsNull() {
            addCriterion("enterprise_group_count_customer is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerIsNotNull() {
            addCriterion("enterprise_group_count_customer is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerEqualTo(Integer value) {
            addCriterion("enterprise_group_count_customer =", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerNotEqualTo(Integer value) {
            addCriterion("enterprise_group_count_customer <>", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerGreaterThan(Integer value) {
            addCriterion("enterprise_group_count_customer >", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_count_customer >=", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerLessThan(Integer value) {
            addCriterion("enterprise_group_count_customer <", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_count_customer <=", value, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerIn(List<Integer> values) {
            addCriterion("enterprise_group_count_customer in", values, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerNotIn(List<Integer> values) {
            addCriterion("enterprise_group_count_customer not in", values, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_count_customer between", value1, value2, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCountCustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_count_customer not between", value1, value2, "enterpriseGroupCountCustomer");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNull() {
            addCriterion("pay_way_id is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIsNotNull() {
            addCriterion("pay_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayIdEqualTo(Integer value) {
            addCriterion("pay_way_id =", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotEqualTo(Integer value) {
            addCriterion("pay_way_id <>", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThan(Integer value) {
            addCriterion("pay_way_id >", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way_id >=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThan(Integer value) {
            addCriterion("pay_way_id <", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way_id <=", value, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdIn(List<Integer> values) {
            addCriterion("pay_way_id in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotIn(List<Integer> values) {
            addCriterion("pay_way_id not in", values, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_way_id between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way_id not between", value1, value2, "payWayId");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNull() {
            addCriterion("pay_way_name is null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNotNull() {
            addCriterion("pay_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameEqualTo(String value) {
            addCriterion("pay_way_name =", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotEqualTo(String value) {
            addCriterion("pay_way_name <>", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThan(String value) {
            addCriterion("pay_way_name >", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_name >=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThan(String value) {
            addCriterion("pay_way_name <", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_way_name <=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLike(String value) {
            addCriterion("pay_way_name like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotLike(String value) {
            addCriterion("pay_way_name not like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIn(List<String> values) {
            addCriterion("pay_way_name in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotIn(List<String> values) {
            addCriterion("pay_way_name not in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameBetween(String value1, String value2) {
            addCriterion("pay_way_name between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotBetween(String value1, String value2) {
            addCriterion("pay_way_name not between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentIsNull() {
            addCriterion("enterprise_group_off_percent is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentIsNotNull() {
            addCriterion("enterprise_group_off_percent is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentEqualTo(Integer value) {
            addCriterion("enterprise_group_off_percent =", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentNotEqualTo(Integer value) {
            addCriterion("enterprise_group_off_percent <>", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentGreaterThan(Integer value) {
            addCriterion("enterprise_group_off_percent >", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_off_percent >=", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentLessThan(Integer value) {
            addCriterion("enterprise_group_off_percent <", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_off_percent <=", value, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentIn(List<Integer> values) {
            addCriterion("enterprise_group_off_percent in", values, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentNotIn(List<Integer> values) {
            addCriterion("enterprise_group_off_percent not in", values, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_off_percent between", value1, value2, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOffPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_off_percent not between", value1, value2, "enterpriseGroupOffPercent");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitIsNull() {
            addCriterion("enterprise_group_price_limit is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitIsNotNull() {
            addCriterion("enterprise_group_price_limit is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitEqualTo(BigDecimal value) {
            addCriterion("enterprise_group_price_limit =", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_group_price_limit <>", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitGreaterThan(BigDecimal value) {
            addCriterion("enterprise_group_price_limit >", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_group_price_limit >=", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitLessThan(BigDecimal value) {
            addCriterion("enterprise_group_price_limit <", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_group_price_limit <=", value, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitIn(List<BigDecimal> values) {
            addCriterion("enterprise_group_price_limit in", values, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_group_price_limit not in", values, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_group_price_limit between", value1, value2, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupPriceLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_group_price_limit not between", value1, value2, "enterpriseGroupPriceLimit");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIsNull() {
            addCriterion("confidential_level_id is null");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIsNotNull() {
            addCriterion("confidential_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdEqualTo(Integer value) {
            addCriterion("confidential_level_id =", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotEqualTo(Integer value) {
            addCriterion("confidential_level_id <>", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdGreaterThan(Integer value) {
            addCriterion("confidential_level_id >", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("confidential_level_id >=", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdLessThan(Integer value) {
            addCriterion("confidential_level_id <", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("confidential_level_id <=", value, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdIn(List<Integer> values) {
            addCriterion("confidential_level_id in", values, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotIn(List<Integer> values) {
            addCriterion("confidential_level_id not in", values, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("confidential_level_id between", value1, value2, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentialLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("confidential_level_id not between", value1, value2, "confidentialLevelId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteIsNull() {
            addCriterion("enterprise_group_note is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteIsNotNull() {
            addCriterion("enterprise_group_note is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteEqualTo(String value) {
            addCriterion("enterprise_group_note =", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteNotEqualTo(String value) {
            addCriterion("enterprise_group_note <>", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteGreaterThan(String value) {
            addCriterion("enterprise_group_note >", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_note >=", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteLessThan(String value) {
            addCriterion("enterprise_group_note <", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_note <=", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteLike(String value) {
            addCriterion("enterprise_group_note like", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteNotLike(String value) {
            addCriterion("enterprise_group_note not like", value, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteIn(List<String> values) {
            addCriterion("enterprise_group_note in", values, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteNotIn(List<String> values) {
            addCriterion("enterprise_group_note not in", values, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteBetween(String value1, String value2) {
            addCriterion("enterprise_group_note between", value1, value2, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupNoteNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_note not between", value1, value2, "enterpriseGroupNote");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeIsNull() {
            addCriterion("enterprise_group_input_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeIsNotNull() {
            addCriterion("enterprise_group_input_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeEqualTo(String value) {
            addCriterion("enterprise_group_input_code =", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeNotEqualTo(String value) {
            addCriterion("enterprise_group_input_code <>", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeGreaterThan(String value) {
            addCriterion("enterprise_group_input_code >", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_group_input_code >=", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeLessThan(String value) {
            addCriterion("enterprise_group_input_code <", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_group_input_code <=", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeLike(String value) {
            addCriterion("enterprise_group_input_code like", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeNotLike(String value) {
            addCriterion("enterprise_group_input_code not like", value, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeIn(List<String> values) {
            addCriterion("enterprise_group_input_code in", values, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeNotIn(List<String> values) {
            addCriterion("enterprise_group_input_code not in", values, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeBetween(String value1, String value2) {
            addCriterion("enterprise_group_input_code between", value1, value2, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupInputCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_group_input_code not between", value1, value2, "enterpriseGroupInputCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderIsNull() {
            addCriterion("enterprise_group_order is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderIsNotNull() {
            addCriterion("enterprise_group_order is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderEqualTo(Integer value) {
            addCriterion("enterprise_group_order =", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderNotEqualTo(Integer value) {
            addCriterion("enterprise_group_order <>", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderGreaterThan(Integer value) {
            addCriterion("enterprise_group_order >", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_order >=", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderLessThan(Integer value) {
            addCriterion("enterprise_group_order <", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_order <=", value, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderIn(List<Integer> values) {
            addCriterion("enterprise_group_order in", values, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderNotIn(List<Integer> values) {
            addCriterion("enterprise_group_order not in", values, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_order between", value1, value2, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_order not between", value1, value2, "enterpriseGroupOrder");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusIsNull() {
            addCriterion("enterprise_group_status is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusIsNotNull() {
            addCriterion("enterprise_group_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusEqualTo(Integer value) {
            addCriterion("enterprise_group_status =", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusNotEqualTo(Integer value) {
            addCriterion("enterprise_group_status <>", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusGreaterThan(Integer value) {
            addCriterion("enterprise_group_status >", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_status >=", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusLessThan(Integer value) {
            addCriterion("enterprise_group_status <", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_group_status <=", value, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusIn(List<Integer> values) {
            addCriterion("enterprise_group_status in", values, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusNotIn(List<Integer> values) {
            addCriterion("enterprise_group_status not in", values, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_status between", value1, value2, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_group_status not between", value1, value2, "enterpriseGroupStatus");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeIsNull() {
            addCriterion("enterprise_group_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeIsNotNull() {
            addCriterion("enterprise_group_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeEqualTo(Date value) {
            addCriterion("enterprise_group_edit_time =", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeNotEqualTo(Date value) {
            addCriterion("enterprise_group_edit_time <>", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeGreaterThan(Date value) {
            addCriterion("enterprise_group_edit_time >", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_edit_time >=", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeLessThan(Date value) {
            addCriterion("enterprise_group_edit_time <", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_edit_time <=", value, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeIn(List<Date> values) {
            addCriterion("enterprise_group_edit_time in", values, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeNotIn(List<Date> values) {
            addCriterion("enterprise_group_edit_time not in", values, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_edit_time between", value1, value2, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_edit_time not between", value1, value2, "enterpriseGroupEditTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeIsNull() {
            addCriterion("enterprise_group_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeIsNotNull() {
            addCriterion("enterprise_group_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeEqualTo(Date value) {
            addCriterion("enterprise_group_create_time =", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeNotEqualTo(Date value) {
            addCriterion("enterprise_group_create_time <>", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeGreaterThan(Date value) {
            addCriterion("enterprise_group_create_time >", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_create_time >=", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeLessThan(Date value) {
            addCriterion("enterprise_group_create_time <", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_group_create_time <=", value, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeIn(List<Date> values) {
            addCriterion("enterprise_group_create_time in", values, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeNotIn(List<Date> values) {
            addCriterion("enterprise_group_create_time not in", values, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_create_time between", value1, value2, "enterpriseGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGroupCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_group_create_time not between", value1, value2, "enterpriseGroupCreateTime");
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