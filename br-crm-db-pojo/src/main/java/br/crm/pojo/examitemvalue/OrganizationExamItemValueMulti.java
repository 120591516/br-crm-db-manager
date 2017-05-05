package br.crm.pojo.examitemvalue;

import java.io.Serializable;

public class OrganizationExamItemValueMulti implements Serializable{
    private String examItemValueMultiId;

    private String examItemValueId;

    private String dictBodypartId;

    private Integer examItemValueMultiDegree;

    private String dictConclusionId;

    public String getExamItemValueMultiId() {
        return examItemValueMultiId;
    }

    public void setExamItemValueMultiId(String examItemValueMultiId) {
        this.examItemValueMultiId = examItemValueMultiId == null ? null : examItemValueMultiId.trim();
    }

    public String getExamItemValueId() {
        return examItemValueId;
    }

    public void setExamItemValueId(String examItemValueId) {
        this.examItemValueId = examItemValueId == null ? null : examItemValueId.trim();
    }

    public String getDictBodypartId() {
        return dictBodypartId;
    }

    public void setDictBodypartId(String dictBodypartId) {
        this.dictBodypartId = dictBodypartId == null ? null : dictBodypartId.trim();
    }

    public Integer getExamItemValueMultiDegree() {
        return examItemValueMultiDegree;
    }

    public void setExamItemValueMultiDegree(Integer examItemValueMultiDegree) {
        this.examItemValueMultiDegree = examItemValueMultiDegree;
    }

    public String getDictConclusionId() {
        return dictConclusionId;
    }

    public void setDictConclusionId(String dictConclusionId) {
        this.dictConclusionId = dictConclusionId == null ? null : dictConclusionId.trim();
    }
}