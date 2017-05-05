package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.Date;

public class PatientExamItem implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientExamItemId;

    private String patientExamDepartId;

    private String patientFeeItemId;

    private String examFeeItemId;

    private String examItemId;

    private String examItemName;

    private String examItemCode;

    private Integer bodyPartId;

    private String bodyPartName;

    private String examItemValueId;

    private Integer severeDegreeId;

    private String patientExamItemRefRange;

    private String examItemValuesShort;

    private Float examItemValuesNumber;

    private String patientExamItemLabitemFlag;

    private Boolean patientExamItemLabitemNormal;

    private Float examItemValuesNumber2;

    private Float examItemValuesNumber3;

    private String patientExamItemOrder;

    private Date patientExamItemCreateTime;

    private Date patientExamItemEditTime;

    private Integer patientExamItemStatus;

    public String getPatientExamItemId() {
        return patientExamItemId;
    }

    public void setPatientExamItemId(String patientExamItemId) {
        this.patientExamItemId = patientExamItemId == null ? null : patientExamItemId.trim();
    }

    public String getPatientExamDepartId() {
        return patientExamDepartId;
    }

    public void setPatientExamDepartId(String patientExamDepartId) {
        this.patientExamDepartId = patientExamDepartId == null ? null : patientExamDepartId.trim();
    }

    public String getPatientFeeItemId() {
        return patientFeeItemId;
    }

    public void setPatientFeeItemId(String patientFeeItemId) {
        this.patientFeeItemId = patientFeeItemId == null ? null : patientFeeItemId.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
    }

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName == null ? null : examItemName.trim();
    }

    public String getExamItemCode() {
        return examItemCode;
    }

    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode == null ? null : examItemCode.trim();
    }

    public Integer getBodyPartId() {
        return bodyPartId;
    }

    public void setBodyPartId(Integer bodyPartId) {
        this.bodyPartId = bodyPartId;
    }

    public String getBodyPartName() {
        return bodyPartName;
    }

    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName == null ? null : bodyPartName.trim();
    }

    public String getExamItemValueId() {
        return examItemValueId;
    }

    public void setExamItemValueId(String examItemValueId) {
        this.examItemValueId = examItemValueId == null ? null : examItemValueId.trim();
    }

    public Integer getSevereDegreeId() {
        return severeDegreeId;
    }

    public void setSevereDegreeId(Integer severeDegreeId) {
        this.severeDegreeId = severeDegreeId;
    }

    public String getPatientExamItemRefRange() {
        return patientExamItemRefRange;
    }

    public void setPatientExamItemRefRange(String patientExamItemRefRange) {
        this.patientExamItemRefRange = patientExamItemRefRange == null ? null : patientExamItemRefRange.trim();
    }

    public String getExamItemValuesShort() {
        return examItemValuesShort;
    }

    public void setExamItemValuesShort(String examItemValuesShort) {
        this.examItemValuesShort = examItemValuesShort == null ? null : examItemValuesShort.trim();
    }

    public Float getExamItemValuesNumber() {
        return examItemValuesNumber;
    }

    public void setExamItemValuesNumber(Float examItemValuesNumber) {
        this.examItemValuesNumber = examItemValuesNumber;
    }

    public String getPatientExamItemLabitemFlag() {
        return patientExamItemLabitemFlag;
    }

    public void setPatientExamItemLabitemFlag(String patientExamItemLabitemFlag) {
        this.patientExamItemLabitemFlag = patientExamItemLabitemFlag == null ? null : patientExamItemLabitemFlag.trim();
    }

    public Boolean getPatientExamItemLabitemNormal() {
        return patientExamItemLabitemNormal;
    }

    public void setPatientExamItemLabitemNormal(Boolean patientExamItemLabitemNormal) {
        this.patientExamItemLabitemNormal = patientExamItemLabitemNormal;
    }

    public Float getExamItemValuesNumber2() {
        return examItemValuesNumber2;
    }

    public void setExamItemValuesNumber2(Float examItemValuesNumber2) {
        this.examItemValuesNumber2 = examItemValuesNumber2;
    }

    public Float getExamItemValuesNumber3() {
        return examItemValuesNumber3;
    }

    public void setExamItemValuesNumber3(Float examItemValuesNumber3) {
        this.examItemValuesNumber3 = examItemValuesNumber3;
    }

    public String getPatientExamItemOrder() {
        return patientExamItemOrder;
    }

    public void setPatientExamItemOrder(String patientExamItemOrder) {
        this.patientExamItemOrder = patientExamItemOrder == null ? null : patientExamItemOrder.trim();
    }

    public Date getPatientExamItemCreateTime() {
        return patientExamItemCreateTime;
    }

    public void setPatientExamItemCreateTime(Date patientExamItemCreateTime) {
        this.patientExamItemCreateTime = patientExamItemCreateTime;
    }

    public Date getPatientExamItemEditTime() {
        return patientExamItemEditTime;
    }

    public void setPatientExamItemEditTime(Date patientExamItemEditTime) {
        this.patientExamItemEditTime = patientExamItemEditTime;
    }

    public Integer getPatientExamItemStatus() {
        return patientExamItemStatus;
    }

    public void setPatientExamItemStatus(Integer patientExamItemStatus) {
        this.patientExamItemStatus = patientExamItemStatus;
    }
}