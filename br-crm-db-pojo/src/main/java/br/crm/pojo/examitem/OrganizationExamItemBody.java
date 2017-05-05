package br.crm.pojo.examitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamItemBody implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String examItemBodyId;

    private String examItemId;

    private String bodyPartId;

    private Integer examItemBodyIsdefault;

    private Integer examItemBodyStatus;

    private Date examItemBodyCreateTime;

    private Date examItemBodyEditTime;

    public String getExamItemBodyId() {
        return examItemBodyId;
    }

    public void setExamItemBodyId(String examItemBodyId) {
        this.examItemBodyId = examItemBodyId == null ? null : examItemBodyId.trim();
    }

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getBodyPartId() {
        return bodyPartId;
    }

    public void setBodyPartId(String bodyPartId) {
        this.bodyPartId = bodyPartId == null ? null : bodyPartId.trim();
    }

    public Integer getExamItemBodyIsdefault() {
        return examItemBodyIsdefault;
    }

    public void setExamItemBodyIsdefault(Integer examItemBodyIsdefault) {
        this.examItemBodyIsdefault = examItemBodyIsdefault;
    }

    public Integer getExamItemBodyStatus() {
        return examItemBodyStatus;
    }

    public void setExamItemBodyStatus(Integer examItemBodyStatus) {
        this.examItemBodyStatus = examItemBodyStatus;
    }

    public Date getExamItemBodyCreateTime() {
        return examItemBodyCreateTime;
    }

    public void setExamItemBodyCreateTime(Date examItemBodyCreateTime) {
        this.examItemBodyCreateTime = examItemBodyCreateTime;
    }

    public Date getExamItemBodyEditTime() {
        return examItemBodyEditTime;
    }

    public void setExamItemBodyEditTime(Date examItemBodyEditTime) {
        this.examItemBodyEditTime = examItemBodyEditTime;
    }
}