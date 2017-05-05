package br.crm.pojo.examfeeitem;

import java.io.Serializable;

public class OrganizationExamFeeItemSubject implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String examFeeItemSubjectId;

    private String examFeeItemId;

    private String examFeeItemSubId;

    private Integer examFeeItemSubjectDispOrder;

    private String examFeeItemSubjectNote;

    public String getExamFeeItemSubjectId() {
        return examFeeItemSubjectId;
    }

    public void setExamFeeItemSubjectId(String examFeeItemSubjectId) {
        this.examFeeItemSubjectId = examFeeItemSubjectId == null ? null : examFeeItemSubjectId.trim();
    }

    public String getExamFeeItemId() {
        return examFeeItemId;
    }

    public void setExamFeeItemId(String examFeeItemId) {
        this.examFeeItemId = examFeeItemId == null ? null : examFeeItemId.trim();
    }

    public String getExamFeeItemSubId() {
        return examFeeItemSubId;
    }

    public void setExamFeeItemSubId(String examFeeItemSubId) {
        this.examFeeItemSubId = examFeeItemSubId == null ? null : examFeeItemSubId.trim();
    }

    public Integer getExamFeeItemSubjectDispOrder() {
        return examFeeItemSubjectDispOrder;
    }

    public void setExamFeeItemSubjectDispOrder(Integer examFeeItemSubjectDispOrder) {
        this.examFeeItemSubjectDispOrder = examFeeItemSubjectDispOrder;
    }

    public String getExamFeeItemSubjectNote() {
        return examFeeItemSubjectNote;
    }

    public void setExamFeeItemSubjectNote(String examFeeItemSubjectNote) {
        this.examFeeItemSubjectNote = examFeeItemSubjectNote == null ? null : examFeeItemSubjectNote.trim();
    }
}