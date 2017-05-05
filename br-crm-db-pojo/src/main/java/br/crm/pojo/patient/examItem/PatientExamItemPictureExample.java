package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExamItemPictureExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExamItemPictureExample() {
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

        public Criteria andPatientExamItemPictureIdIsNull() {
            addCriterion("patient_exam_item_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdIsNotNull() {
            addCriterion("patient_exam_item_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdEqualTo(String value) {
            addCriterion("patient_exam_item_picture_id =", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdNotEqualTo(String value) {
            addCriterion("patient_exam_item_picture_id <>", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdGreaterThan(String value) {
            addCriterion("patient_exam_item_picture_id >", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_id >=", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdLessThan(String value) {
            addCriterion("patient_exam_item_picture_id <", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_id <=", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdLike(String value) {
            addCriterion("patient_exam_item_picture_id like", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdNotLike(String value) {
            addCriterion("patient_exam_item_picture_id not like", value, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdIn(List<String> values) {
            addCriterion("patient_exam_item_picture_id in", values, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdNotIn(List<String> values) {
            addCriterion("patient_exam_item_picture_id not in", values, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_id between", value1, value2, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_id not between", value1, value2, "patientExamItemPictureId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIsNull() {
            addCriterion("patient_exam_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIsNotNull() {
            addCriterion("patient_exam_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdEqualTo(String value) {
            addCriterion("patient_exam_item_id =", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotEqualTo(String value) {
            addCriterion("patient_exam_item_id <>", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdGreaterThan(String value) {
            addCriterion("patient_exam_item_id >", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_id >=", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLessThan(String value) {
            addCriterion("patient_exam_item_id <", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_id <=", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdLike(String value) {
            addCriterion("patient_exam_item_id like", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotLike(String value) {
            addCriterion("patient_exam_item_id not like", value, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdIn(List<String> values) {
            addCriterion("patient_exam_item_id in", values, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotIn(List<String> values) {
            addCriterion("patient_exam_item_id not in", values, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdBetween(String value1, String value2) {
            addCriterion("patient_exam_item_id between", value1, value2, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemIdNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_id not between", value1, value2, "patientExamItemId");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathIsNull() {
            addCriterion("patient_exam_item_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathIsNotNull() {
            addCriterion("patient_exam_item_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathEqualTo(String value) {
            addCriterion("patient_exam_item_picture_path =", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathNotEqualTo(String value) {
            addCriterion("patient_exam_item_picture_path <>", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathGreaterThan(String value) {
            addCriterion("patient_exam_item_picture_path >", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_path >=", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathLessThan(String value) {
            addCriterion("patient_exam_item_picture_path <", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_path <=", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathLike(String value) {
            addCriterion("patient_exam_item_picture_path like", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathNotLike(String value) {
            addCriterion("patient_exam_item_picture_path not like", value, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathIn(List<String> values) {
            addCriterion("patient_exam_item_picture_path in", values, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathNotIn(List<String> values) {
            addCriterion("patient_exam_item_picture_path not in", values, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_path between", value1, value2, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPicturePathNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_path not between", value1, value2, "patientExamItemPicturePath");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleIsNull() {
            addCriterion("patient_exam_item_picture_title is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleIsNotNull() {
            addCriterion("patient_exam_item_picture_title is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleEqualTo(String value) {
            addCriterion("patient_exam_item_picture_title =", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleNotEqualTo(String value) {
            addCriterion("patient_exam_item_picture_title <>", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleGreaterThan(String value) {
            addCriterion("patient_exam_item_picture_title >", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_title >=", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleLessThan(String value) {
            addCriterion("patient_exam_item_picture_title <", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture_title <=", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleLike(String value) {
            addCriterion("patient_exam_item_picture_title like", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleNotLike(String value) {
            addCriterion("patient_exam_item_picture_title not like", value, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleIn(List<String> values) {
            addCriterion("patient_exam_item_picture_title in", values, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleNotIn(List<String> values) {
            addCriterion("patient_exam_item_picture_title not in", values, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_title between", value1, value2, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureTitleNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture_title not between", value1, value2, "patientExamItemPictureTitle");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIsNull() {
            addCriterion("patient_exam_item_picture is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIsNotNull() {
            addCriterion("patient_exam_item_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEqualTo(String value) {
            addCriterion("patient_exam_item_picture =", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureNotEqualTo(String value) {
            addCriterion("patient_exam_item_picture <>", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureGreaterThan(String value) {
            addCriterion("patient_exam_item_picture >", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureGreaterThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture >=", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureLessThan(String value) {
            addCriterion("patient_exam_item_picture <", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureLessThanOrEqualTo(String value) {
            addCriterion("patient_exam_item_picture <=", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureLike(String value) {
            addCriterion("patient_exam_item_picture like", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureNotLike(String value) {
            addCriterion("patient_exam_item_picture not like", value, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureIn(List<String> values) {
            addCriterion("patient_exam_item_picture in", values, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureNotIn(List<String> values) {
            addCriterion("patient_exam_item_picture not in", values, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture between", value1, value2, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureNotBetween(String value1, String value2) {
            addCriterion("patient_exam_item_picture not between", value1, value2, "patientExamItemPicture");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicIsNull() {
            addCriterion("patient_exam_item_picture_hidePic is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicIsNotNull() {
            addCriterion("patient_exam_item_picture_hidePic is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicEqualTo(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic =", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicNotEqualTo(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic <>", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicGreaterThan(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic >", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic >=", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicLessThan(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic <", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicLessThanOrEqualTo(Boolean value) {
            addCriterion("patient_exam_item_picture_hidePic <=", value, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicIn(List<Boolean> values) {
            addCriterion("patient_exam_item_picture_hidePic in", values, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicNotIn(List<Boolean> values) {
            addCriterion("patient_exam_item_picture_hidePic not in", values, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_exam_item_picture_hidePic between", value1, value2, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureHidepicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("patient_exam_item_picture_hidePic not between", value1, value2, "patientExamItemPictureHidepic");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeIsNull() {
            addCriterion("patient_exam_item_picture_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeIsNotNull() {
            addCriterion("patient_exam_item_picture_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_create_time =", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_create_time <>", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_picture_create_time >", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_create_time >=", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeLessThan(Date value) {
            addCriterion("patient_exam_item_picture_create_time <", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_create_time <=", value, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_picture_create_time in", values, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_picture_create_time not in", values, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_picture_create_time between", value1, value2, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_picture_create_time not between", value1, value2, "patientExamItemPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeIsNull() {
            addCriterion("patient_exam_item_picture_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeIsNotNull() {
            addCriterion("patient_exam_item_picture_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_edit_time =", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeNotEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_edit_time <>", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeGreaterThan(Date value) {
            addCriterion("patient_exam_item_picture_edit_time >", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_edit_time >=", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeLessThan(Date value) {
            addCriterion("patient_exam_item_picture_edit_time <", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("patient_exam_item_picture_edit_time <=", value, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeIn(List<Date> values) {
            addCriterion("patient_exam_item_picture_edit_time in", values, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeNotIn(List<Date> values) {
            addCriterion("patient_exam_item_picture_edit_time not in", values, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_picture_edit_time between", value1, value2, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("patient_exam_item_picture_edit_time not between", value1, value2, "patientExamItemPictureEditTime");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusIsNull() {
            addCriterion("patient_exam_item_picture_status is null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusIsNotNull() {
            addCriterion("patient_exam_item_picture_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusEqualTo(Integer value) {
            addCriterion("patient_exam_item_picture_status =", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusNotEqualTo(Integer value) {
            addCriterion("patient_exam_item_picture_status <>", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusGreaterThan(Integer value) {
            addCriterion("patient_exam_item_picture_status >", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_picture_status >=", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusLessThan(Integer value) {
            addCriterion("patient_exam_item_picture_status <", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patient_exam_item_picture_status <=", value, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusIn(List<Integer> values) {
            addCriterion("patient_exam_item_picture_status in", values, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusNotIn(List<Integer> values) {
            addCriterion("patient_exam_item_picture_status not in", values, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_picture_status between", value1, value2, "patientExamItemPictureStatus");
            return (Criteria) this;
        }

        public Criteria andPatientExamItemPictureStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_exam_item_picture_status not between", value1, value2, "patientExamItemPictureStatus");
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