package br.crm.pojo.patient.examItem;

import java.io.Serializable;

public class PatientExamItemWithBLOBs extends PatientExamItem implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String examItemValues;

    private String examItemValuesText;

    public String getExamItemValues() {
        return examItemValues;
    }

    public void setExamItemValues(String examItemValues) {
        this.examItemValues = examItemValues == null ? null : examItemValues.trim();
    }

    public String getExamItemValuesText() {
        return examItemValuesText;
    }

    public void setExamItemValuesText(String examItemValuesText) {
        this.examItemValuesText = examItemValuesText == null ? null : examItemValuesText.trim();
    }
}