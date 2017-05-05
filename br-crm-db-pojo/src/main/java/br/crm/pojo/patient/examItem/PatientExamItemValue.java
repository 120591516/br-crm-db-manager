package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.Date;

public class PatientExamItemValue implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientExamItemValueId;

    private String patientExamItemId;

    private String examItemValueId;

    private Integer patientExamItemValueOrder;

    private Date patientExamItemValueCreateTime;

    private Date patientExamItemValueEditTime;

    private Integer patientExamItemValueStatus;

    private String patientExamItemValueText;

    public String getPatientExamItemValueId() {
        return patientExamItemValueId;
    }

    public void setPatientExamItemValueId(String patientExamItemValueId) {
        this.patientExamItemValueId = patientExamItemValueId == null ? null : patientExamItemValueId.trim();
    }

    public String getPatientExamItemId() {
        return patientExamItemId;
    }

    public void setPatientExamItemId(String patientExamItemId) {
        this.patientExamItemId = patientExamItemId == null ? null : patientExamItemId.trim();
    }

    public String getExamItemValueId() {
        return examItemValueId;
    }

    public void setExamItemValueId(String examItemValueId) {
        this.examItemValueId = examItemValueId == null ? null : examItemValueId.trim();
    }

    public Integer getPatientExamItemValueOrder() {
        return patientExamItemValueOrder;
    }

    public void setPatientExamItemValueOrder(Integer patientExamItemValueOrder) {
        this.patientExamItemValueOrder = patientExamItemValueOrder;
    }

    public Date getPatientExamItemValueCreateTime() {
        return patientExamItemValueCreateTime;
    }

    public void setPatientExamItemValueCreateTime(Date patientExamItemValueCreateTime) {
        this.patientExamItemValueCreateTime = patientExamItemValueCreateTime;
    }

    public Date getPatientExamItemValueEditTime() {
        return patientExamItemValueEditTime;
    }

    public void setPatientExamItemValueEditTime(Date patientExamItemValueEditTime) {
        this.patientExamItemValueEditTime = patientExamItemValueEditTime;
    }

    public Integer getPatientExamItemValueStatus() {
        return patientExamItemValueStatus;
    }

    public void setPatientExamItemValueStatus(Integer patientExamItemValueStatus) {
        this.patientExamItemValueStatus = patientExamItemValueStatus;
    }

    public String getPatientExamItemValueText() {
        return patientExamItemValueText;
    }

    public void setPatientExamItemValueText(String patientExamItemValueText) {
        this.patientExamItemValueText = patientExamItemValueText == null ? null : patientExamItemValueText.trim();
    }
}