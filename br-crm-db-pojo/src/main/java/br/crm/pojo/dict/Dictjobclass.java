package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 工作类型
 *
 */
public class Dictjobclass implements Serializable {
    private Long idJobclass;

    private String jobclassName;

    private String jobclassCode;

    private String inputCode;

    private String jobclasscodex;

    private String note;

    private Date jobclassCreatetime;

    private Date jobclassUpdatetime;

    private Integer jobclassStatus;

    public Long getIdJobclass() {
        return idJobclass;
    }

    public void setIdJobclass(Long idJobclass) {
        this.idJobclass = idJobclass;
    }

    public String getJobclassName() {
        return jobclassName;
    }

    public void setJobclassName(String jobclassName) {
        this.jobclassName = jobclassName == null ? null : jobclassName.trim();
    }

    public String getJobclassCode() {
        return jobclassCode;
    }

    public void setJobclassCode(String jobclassCode) {
        this.jobclassCode = jobclassCode == null ? null : jobclassCode.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getJobclasscodex() {
        return jobclasscodex;
    }

    public void setJobclasscodex(String jobclasscodex) {
        this.jobclasscodex = jobclasscodex == null ? null : jobclasscodex.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getJobclassCreatetime() {
        return jobclassCreatetime;
    }

    public void setJobclassCreatetime(Date jobclassCreatetime) {
        this.jobclassCreatetime = jobclassCreatetime;
    }

    public Date getJobclassUpdatetime() {
        return jobclassUpdatetime;
    }

    public void setJobclassUpdatetime(Date jobclassUpdatetime) {
        this.jobclassUpdatetime = jobclassUpdatetime;
    }

    public Integer getJobclassStatus() {
        return jobclassStatus;
    }

    public void setJobclassStatus(Integer jobclassStatus) {
        this.jobclassStatus = jobclassStatus;
    }
}