package br.crm.pojo.patient.exam.depart;

import java.io.Serializable;

public class PatientExamDepartWithBLOBs extends PatientExamDepart implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String departSummary;

    private String finalMessage;

    private String positiveSummary;

    public String getDepartSummary() {
        return departSummary;
    }

    public void setDepartSummary(String departSummary) {
        this.departSummary = departSummary == null ? null : departSummary.trim();
    }

    public String getFinalMessage() {
        return finalMessage;
    }

    public void setFinalMessage(String finalMessage) {
        this.finalMessage = finalMessage == null ? null : finalMessage.trim();
    }

    public String getPositiveSummary() {
        return positiveSummary;
    }

    public void setPositiveSummary(String positiveSummary) {
        this.positiveSummary = positiveSummary == null ? null : positiveSummary.trim();
    }
}