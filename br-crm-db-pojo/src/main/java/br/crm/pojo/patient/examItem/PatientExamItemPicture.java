package br.crm.pojo.patient.examItem;

import java.io.Serializable;
import java.util.Date;

public class PatientExamItemPicture implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientExamItemPictureId;

    private String patientExamItemId;

    private String patientExamItemPicturePath;

    private String patientExamItemPictureTitle;

    private String patientExamItemPicture;

    private Boolean patientExamItemPictureHidepic;

    private Date patientExamItemPictureCreateTime;

    private Date patientExamItemPictureEditTime;

    private Integer patientExamItemPictureStatus;

    private String patientExamItemPictureDescription;

    public String getPatientExamItemPictureId() {
        return patientExamItemPictureId;
    }

    public void setPatientExamItemPictureId(String patientExamItemPictureId) {
        this.patientExamItemPictureId = patientExamItemPictureId == null ? null : patientExamItemPictureId.trim();
    }

    public String getPatientExamItemId() {
        return patientExamItemId;
    }

    public void setPatientExamItemId(String patientExamItemId) {
        this.patientExamItemId = patientExamItemId == null ? null : patientExamItemId.trim();
    }

    public String getPatientExamItemPicturePath() {
        return patientExamItemPicturePath;
    }

    public void setPatientExamItemPicturePath(String patientExamItemPicturePath) {
        this.patientExamItemPicturePath = patientExamItemPicturePath == null ? null : patientExamItemPicturePath.trim();
    }

    public String getPatientExamItemPictureTitle() {
        return patientExamItemPictureTitle;
    }

    public void setPatientExamItemPictureTitle(String patientExamItemPictureTitle) {
        this.patientExamItemPictureTitle = patientExamItemPictureTitle == null ? null : patientExamItemPictureTitle.trim();
    }

    public String getPatientExamItemPicture() {
        return patientExamItemPicture;
    }

    public void setPatientExamItemPicture(String patientExamItemPicture) {
        this.patientExamItemPicture = patientExamItemPicture == null ? null : patientExamItemPicture.trim();
    }

    public Boolean getPatientExamItemPictureHidepic() {
        return patientExamItemPictureHidepic;
    }

    public void setPatientExamItemPictureHidepic(Boolean patientExamItemPictureHidepic) {
        this.patientExamItemPictureHidepic = patientExamItemPictureHidepic;
    }

    public Date getPatientExamItemPictureCreateTime() {
        return patientExamItemPictureCreateTime;
    }

    public void setPatientExamItemPictureCreateTime(Date patientExamItemPictureCreateTime) {
        this.patientExamItemPictureCreateTime = patientExamItemPictureCreateTime;
    }

    public Date getPatientExamItemPictureEditTime() {
        return patientExamItemPictureEditTime;
    }

    public void setPatientExamItemPictureEditTime(Date patientExamItemPictureEditTime) {
        this.patientExamItemPictureEditTime = patientExamItemPictureEditTime;
    }

    public Integer getPatientExamItemPictureStatus() {
        return patientExamItemPictureStatus;
    }

    public void setPatientExamItemPictureStatus(Integer patientExamItemPictureStatus) {
        this.patientExamItemPictureStatus = patientExamItemPictureStatus;
    }

    public String getPatientExamItemPictureDescription() {
        return patientExamItemPictureDescription;
    }

    public void setPatientExamItemPictureDescription(String patientExamItemPictureDescription) {
        this.patientExamItemPictureDescription = patientExamItemPictureDescription == null ? null : patientExamItemPictureDescription.trim();
    }
}