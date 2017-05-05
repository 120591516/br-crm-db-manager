package br.crm.pojo.dict;

import java.io.Serializable;

public class DictconclusionWithBLOBs extends Dictconclusion implements Serializable{
    private String depiction;

    private String suggestion;

    private String advice;

    private String dietguide;

    private String sportguide;

    private String suggestiongroup;

    public String getDepiction() {
        return depiction;
    }

    public void setDepiction(String depiction) {
        this.depiction = depiction == null ? null : depiction.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public String getDietguide() {
        return dietguide;
    }

    public void setDietguide(String dietguide) {
        this.dietguide = dietguide == null ? null : dietguide.trim();
    }

    public String getSportguide() {
        return sportguide;
    }

    public void setSportguide(String sportguide) {
        this.sportguide = sportguide == null ? null : sportguide.trim();
    }

    public String getSuggestiongroup() {
        return suggestiongroup;
    }

    public void setSuggestiongroup(String suggestiongroup) {
        this.suggestiongroup = suggestiongroup == null ? null : suggestiongroup.trim();
    }
}