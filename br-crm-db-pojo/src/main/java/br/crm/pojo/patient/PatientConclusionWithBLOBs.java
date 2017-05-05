package br.crm.pojo.patient;

import java.io.Serializable;

public class PatientConclusionWithBLOBs  extends PatientConclusion implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String patientConclusionDepiction;

    private String patientConclusionSuggestion;

    private String patientConclusionAdvice;

    private String patientConclusionDietGuide;

    private String patientConclusionSportGuide;

    private String patientConclusionKnowledge;

    public String getPatientConclusionDepiction() {
        return patientConclusionDepiction;
    }

    public void setPatientConclusionDepiction(String patientConclusionDepiction) {
        this.patientConclusionDepiction = patientConclusionDepiction == null ? null : patientConclusionDepiction.trim();
    }

    public String getPatientConclusionSuggestion() {
        return patientConclusionSuggestion;
    }

    public void setPatientConclusionSuggestion(String patientConclusionSuggestion) {
        this.patientConclusionSuggestion = patientConclusionSuggestion == null ? null : patientConclusionSuggestion.trim();
    }

    public String getPatientConclusionAdvice() {
        return patientConclusionAdvice;
    }

    public void setPatientConclusionAdvice(String patientConclusionAdvice) {
        this.patientConclusionAdvice = patientConclusionAdvice == null ? null : patientConclusionAdvice.trim();
    }

    public String getPatientConclusionDietGuide() {
        return patientConclusionDietGuide;
    }

    public void setPatientConclusionDietGuide(String patientConclusionDietGuide) {
        this.patientConclusionDietGuide = patientConclusionDietGuide == null ? null : patientConclusionDietGuide.trim();
    }

    public String getPatientConclusionSportGuide() {
        return patientConclusionSportGuide;
    }

    public void setPatientConclusionSportGuide(String patientConclusionSportGuide) {
        this.patientConclusionSportGuide = patientConclusionSportGuide == null ? null : patientConclusionSportGuide.trim();
    }

    public String getPatientConclusionKnowledge() {
        return patientConclusionKnowledge;
    }

    public void setPatientConclusionKnowledge(String patientConclusionKnowledge) {
        this.patientConclusionKnowledge = patientConclusionKnowledge == null ? null : patientConclusionKnowledge.trim();
    }
}