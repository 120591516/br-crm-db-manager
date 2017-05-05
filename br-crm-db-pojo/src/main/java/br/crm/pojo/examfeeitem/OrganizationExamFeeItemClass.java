package br.crm.pojo.examfeeitem;

import java.io.Serializable;
import java.util.Date;

public class OrganizationExamFeeItemClass implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String feeItemClassName;

    private String feeItemClassNameEng;

    private String feeItemClassCode;

    private String inputCode;

    private Integer dispOrder;

    private Integer status;

    private Date createTime;

    private Date editTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFeeItemClassName() {
        return feeItemClassName;
    }

    public void setFeeItemClassName(String feeItemClassName) {
        this.feeItemClassName = feeItemClassName == null ? null : feeItemClassName.trim();
    }

    public String getFeeItemClassNameEng() {
        return feeItemClassNameEng;
    }

    public void setFeeItemClassNameEng(String feeItemClassNameEng) {
        this.feeItemClassNameEng = feeItemClassNameEng == null ? null : feeItemClassNameEng.trim();
    }

    public String getFeeItemClassCode() {
        return feeItemClassCode;
    }

    public void setFeeItemClassCode(String feeItemClassCode) {
        this.feeItemClassCode = feeItemClassCode == null ? null : feeItemClassCode.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public Integer getDispOrder() {
        return dispOrder;
    }

    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}