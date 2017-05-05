package br.crm.pojo.group;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseGroupSuite implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseGroupSuiteId;

    private String enterpriseGroupId;

    private String examSuiteId;

    private String examSuiteName;

    private String enterpriseGroupSuiteHazardFactor;

    private Integer enterpriseGroupSuiteStatus;

    private Date enterpriseGroupSuiteEditTime;

    private Date enterpriseGroupSuiteCreateTime;

    public String getEnterpriseGroupSuiteId() {
        return enterpriseGroupSuiteId;
    }

    public void setEnterpriseGroupSuiteId(String enterpriseGroupSuiteId) {
        this.enterpriseGroupSuiteId = enterpriseGroupSuiteId == null ? null : enterpriseGroupSuiteId.trim();
    }

    public String getEnterpriseGroupId() {
        return enterpriseGroupId;
    }

    public void setEnterpriseGroupId(String enterpriseGroupId) {
        this.enterpriseGroupId = enterpriseGroupId == null ? null : enterpriseGroupId.trim();
    }

    public String getExamSuiteId() {
        return examSuiteId;
    }

    public void setExamSuiteId(String examSuiteId) {
        this.examSuiteId = examSuiteId == null ? null : examSuiteId.trim();
    }

    public String getExamSuiteName() {
        return examSuiteName;
    }

    public void setExamSuiteName(String examSuiteName) {
        this.examSuiteName = examSuiteName == null ? null : examSuiteName.trim();
    }

    public String getEnterpriseGroupSuiteHazardFactor() {
        return enterpriseGroupSuiteHazardFactor;
    }

    public void setEnterpriseGroupSuiteHazardFactor(String enterpriseGroupSuiteHazardFactor) {
        this.enterpriseGroupSuiteHazardFactor = enterpriseGroupSuiteHazardFactor == null ? null : enterpriseGroupSuiteHazardFactor.trim();
    }

    public Integer getEnterpriseGroupSuiteStatus() {
        return enterpriseGroupSuiteStatus;
    }

    public void setEnterpriseGroupSuiteStatus(Integer enterpriseGroupSuiteStatus) {
        this.enterpriseGroupSuiteStatus = enterpriseGroupSuiteStatus;
    }

    public Date getEnterpriseGroupSuiteEditTime() {
        return enterpriseGroupSuiteEditTime;
    }

    public void setEnterpriseGroupSuiteEditTime(Date enterpriseGroupSuiteEditTime) {
        this.enterpriseGroupSuiteEditTime = enterpriseGroupSuiteEditTime;
    }

    public Date getEnterpriseGroupSuiteCreateTime() {
        return enterpriseGroupSuiteCreateTime;
    }

    public void setEnterpriseGroupSuiteCreateTime(Date enterpriseGroupSuiteCreateTime) {
        this.enterpriseGroupSuiteCreateTime = enterpriseGroupSuiteCreateTime;
    }
}