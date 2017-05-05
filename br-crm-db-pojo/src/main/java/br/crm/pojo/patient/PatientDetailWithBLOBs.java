package br.crm.pojo.patient;

import java.io.Serializable;

public class PatientDetailWithBLOBs extends PatientDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientGuidanceNote;

    private String patientPatientConclusion;

    private String patientConclusionSummary;

    private String patientSuggestion;

    private String patientConclusionRich;

    private String patientAdvice;

    private String patientDietGuide;

    private String patientSportGuide;

    private String patientKnowledge;

    private String patientMessage;

    private String patientPositiveSummary;

    private String patientResultCompare;

    public String getPatientGuidanceNote() {
        return patientGuidanceNote;
    }

    public void setPatientGuidanceNote(String patientGuidanceNote) {
        this.patientGuidanceNote = patientGuidanceNote == null ? null : patientGuidanceNote.trim();
    }

    public String getPatientPatientConclusion() {
        return patientPatientConclusion;
    }

    public void setPatientPatientConclusion(String patientPatientConclusion) {
        this.patientPatientConclusion = patientPatientConclusion == null ? null : patientPatientConclusion.trim();
    }

    public String getPatientConclusionSummary() {
        return patientConclusionSummary;
    }

    public void setPatientConclusionSummary(String patientConclusionSummary) {
        this.patientConclusionSummary = patientConclusionSummary == null ? null : patientConclusionSummary.trim();
    }

    public String getPatientSuggestion() {
        return patientSuggestion;
    }

    public void setPatientSuggestion(String patientSuggestion) {
        this.patientSuggestion = patientSuggestion == null ? null : patientSuggestion.trim();
    }

    public String getPatientConclusionRich() {
        return patientConclusionRich;
    }

    public void setPatientConclusionRich(String patientConclusionRich) {
        this.patientConclusionRich = patientConclusionRich == null ? null : patientConclusionRich.trim();
    }

    public String getPatientAdvice() {
        return patientAdvice;
    }

    public void setPatientAdvice(String patientAdvice) {
        this.patientAdvice = patientAdvice == null ? null : patientAdvice.trim();
    }

    public String getPatientDietGuide() {
        return patientDietGuide;
    }

    public void setPatientDietGuide(String patientDietGuide) {
        this.patientDietGuide = patientDietGuide == null ? null : patientDietGuide.trim();
    }

    public String getPatientSportGuide() {
        return patientSportGuide;
    }

    public void setPatientSportGuide(String patientSportGuide) {
        this.patientSportGuide = patientSportGuide == null ? null : patientSportGuide.trim();
    }

    public String getPatientKnowledge() {
        return patientKnowledge;
    }

    public void setPatientKnowledge(String patientKnowledge) {
        this.patientKnowledge = patientKnowledge == null ? null : patientKnowledge.trim();
    }

    public String getPatientMessage() {
        return patientMessage;
    }

    public void setPatientMessage(String patientMessage) {
        this.patientMessage = patientMessage == null ? null : patientMessage.trim();
    }

    public String getPatientPositiveSummary() {
        return patientPositiveSummary;
    }

    public void setPatientPositiveSummary(String patientPositiveSummary) {
        this.patientPositiveSummary = patientPositiveSummary == null ? null : patientPositiveSummary.trim();
    }

    public String getPatientResultCompare() {
        return patientResultCompare;
    }

    public void setPatientResultCompare(String patientResultCompare) {
        this.patientResultCompare = patientResultCompare == null ? null : patientResultCompare.trim();
    }
}