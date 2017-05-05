package br.crm.pojo.enterprise.reservation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EnterpriseReservationDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseReservationDetailId;

    private String enterpriseReservationId;

    private Integer enterpriseReservationCountCustomer;

    private Integer enterpriseReservationCountRegistered;

    private Integer enterpriseReservationFullFinished;

    private Integer enterpriseReservationPartFinished;

    private BigDecimal enterpriseReservationMoneyAmount;

    private BigDecimal enterpriseReservationSettledMoneyAmount;

    private BigDecimal enterpriseReservationPaid;

    private Date enterpriseReservationFinalSettledTime;

    private Boolean enterpriseReservationFinishedPaid;

    private Boolean enterpriseReservationFinished;

    private Integer enterpriseReservationDetailStatus;

    private Date enterpriseReservationDetailCreateTime;

    private Date enterpriseReservationDetailEditTime;

    public String getEnterpriseReservationDetailId() {
        return enterpriseReservationDetailId;
    }

    public void setEnterpriseReservationDetailId(String enterpriseReservationDetailId) {
        this.enterpriseReservationDetailId = enterpriseReservationDetailId == null ? null : enterpriseReservationDetailId.trim();
    }

    public String getEnterpriseReservationId() {
        return enterpriseReservationId;
    }

    public void setEnterpriseReservationId(String enterpriseReservationId) {
        this.enterpriseReservationId = enterpriseReservationId == null ? null : enterpriseReservationId.trim();
    }

    public Integer getEnterpriseReservationCountCustomer() {
        return enterpriseReservationCountCustomer;
    }

    public void setEnterpriseReservationCountCustomer(Integer enterpriseReservationCountCustomer) {
        this.enterpriseReservationCountCustomer = enterpriseReservationCountCustomer;
    }

    public Integer getEnterpriseReservationCountRegistered() {
        return enterpriseReservationCountRegistered;
    }

    public void setEnterpriseReservationCountRegistered(Integer enterpriseReservationCountRegistered) {
        this.enterpriseReservationCountRegistered = enterpriseReservationCountRegistered;
    }

    public Integer getEnterpriseReservationFullFinished() {
        return enterpriseReservationFullFinished;
    }

    public void setEnterpriseReservationFullFinished(Integer enterpriseReservationFullFinished) {
        this.enterpriseReservationFullFinished = enterpriseReservationFullFinished;
    }

    public Integer getEnterpriseReservationPartFinished() {
        return enterpriseReservationPartFinished;
    }

    public void setEnterpriseReservationPartFinished(Integer enterpriseReservationPartFinished) {
        this.enterpriseReservationPartFinished = enterpriseReservationPartFinished;
    }

    public BigDecimal getEnterpriseReservationMoneyAmount() {
        return enterpriseReservationMoneyAmount;
    }

    public void setEnterpriseReservationMoneyAmount(BigDecimal enterpriseReservationMoneyAmount) {
        this.enterpriseReservationMoneyAmount = enterpriseReservationMoneyAmount;
    }

    public BigDecimal getEnterpriseReservationSettledMoneyAmount() {
        return enterpriseReservationSettledMoneyAmount;
    }

    public void setEnterpriseReservationSettledMoneyAmount(BigDecimal enterpriseReservationSettledMoneyAmount) {
        this.enterpriseReservationSettledMoneyAmount = enterpriseReservationSettledMoneyAmount;
    }

    public BigDecimal getEnterpriseReservationPaid() {
        return enterpriseReservationPaid;
    }

    public void setEnterpriseReservationPaid(BigDecimal enterpriseReservationPaid) {
        this.enterpriseReservationPaid = enterpriseReservationPaid;
    }

    public Date getEnterpriseReservationFinalSettledTime() {
        return enterpriseReservationFinalSettledTime;
    }

    public void setEnterpriseReservationFinalSettledTime(Date enterpriseReservationFinalSettledTime) {
        this.enterpriseReservationFinalSettledTime = enterpriseReservationFinalSettledTime;
    }

    public Boolean getEnterpriseReservationFinishedPaid() {
        return enterpriseReservationFinishedPaid;
    }

    public void setEnterpriseReservationFinishedPaid(Boolean enterpriseReservationFinishedPaid) {
        this.enterpriseReservationFinishedPaid = enterpriseReservationFinishedPaid;
    }

    public Boolean getEnterpriseReservationFinished() {
        return enterpriseReservationFinished;
    }

    public void setEnterpriseReservationFinished(Boolean enterpriseReservationFinished) {
        this.enterpriseReservationFinished = enterpriseReservationFinished;
    }

    public Integer getEnterpriseReservationDetailStatus() {
        return enterpriseReservationDetailStatus;
    }

    public void setEnterpriseReservationDetailStatus(Integer enterpriseReservationDetailStatus) {
        this.enterpriseReservationDetailStatus = enterpriseReservationDetailStatus;
    }

    public Date getEnterpriseReservationDetailCreateTime() {
        return enterpriseReservationDetailCreateTime;
    }

    public void setEnterpriseReservationDetailCreateTime(Date enterpriseReservationDetailCreateTime) {
        this.enterpriseReservationDetailCreateTime = enterpriseReservationDetailCreateTime;
    }

    public Date getEnterpriseReservationDetailEditTime() {
        return enterpriseReservationDetailEditTime;
    }

    public void setEnterpriseReservationDetailEditTime(Date enterpriseReservationDetailEditTime) {
        this.enterpriseReservationDetailEditTime = enterpriseReservationDetailEditTime;
    }
}