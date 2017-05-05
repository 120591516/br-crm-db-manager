package br.crm.pojo.patient;

import java.io.Serializable;
import java.util.Date;

public class PatientConclusion implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientConclusionId;

    private String patientId;

    private String departId;

    private String patientConclusion;

    private String patientConclusionName;

    private String patientConclusionBySummary;

    private String patientConclusionInvisible;

    private String patientConclusionType;

    private Integer patientConclusionOrder;

    private Date patientConclusionCreateTime;

    private Date patientConclusionEditTime;

    private Integer patientConclusionStatus;

    public String getPatientConclusionId() {
        return patientConclusionId;
    }

    public void setPatientConclusionId(String patientConclusionId) {
        this.patientConclusionId = patientConclusionId == null ? null : patientConclusionId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getPatientConclusion() {
        return patientConclusion;
    }

    public void setPatientConclusion(String patientConclusion) {
        this.patientConclusion = patientConclusion == null ? null : patientConclusion.trim();
    }

    public String getPatientConclusionName() {
        return patientConclusionName;
    }

    public void setPatientConclusionName(String patientConclusionName) {
        this.patientConclusionName = patientConclusionName == null ? null : patientConclusionName.trim();
    }

    public String getPatientConclusionBySummary() {
        return patientConclusionBySummary;
    }

    public void setPatientConclusionBySummary(String patientConclusionBySummary) {
        this.patientConclusionBySummary = patientConclusionBySummary == null ? null : patientConclusionBySummary.trim();
    }

    public String getPatientConclusionInvisible() {
        return patientConclusionInvisible;
    }

    public void setPatientConclusionInvisible(String patientConclusionInvisible) {
        this.patientConclusionInvisible = patientConclusionInvisible == null ? null : patientConclusionInvisible.trim();
    }

    public String getPatientConclusionType() {
        return patientConclusionType;
    }

    public void setPatientConclusionType(String patientConclusionType) {
        this.patientConclusionType = patientConclusionType == null ? null : patientConclusionType.trim();
    }

    public Integer getPatientConclusionOrder() {
        return patientConclusionOrder;
    }

    public void setPatientConclusionOrder(Integer patientConclusionOrder) {
        this.patientConclusionOrder = patientConclusionOrder;
    }

    public Date getPatientConclusionCreateTime() {
        return patientConclusionCreateTime;
    }

    public void setPatientConclusionCreateTime(Date patientConclusionCreateTime) {
        this.patientConclusionCreateTime = patientConclusionCreateTime;
    }

    public Date getPatientConclusionEditTime() {
        return patientConclusionEditTime;
    }

    public void setPatientConclusionEditTime(Date patientConclusionEditTime) {
        this.patientConclusionEditTime = patientConclusionEditTime;
    }

    public Integer getPatientConclusionStatus() {
        return patientConclusionStatus;
    }

    public void setPatientConclusionStatus(Integer patientConclusionStatus) {
        this.patientConclusionStatus = patientConclusionStatus;
    }
}