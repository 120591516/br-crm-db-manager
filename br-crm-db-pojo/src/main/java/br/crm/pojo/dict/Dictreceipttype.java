package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictreceipttype implements Serializable {
    private Long idReceipttype;

    private String receipttypeName;

    private String receipttypeCode;

    private String receipttypeOutput;

    private String inputCode;

    private String receipttypecodex;

    private String note;

    private Integer fBuiltin;

    private Date receipttypeCreatetime;

    private Date receipttypeUpdatetime;

    private Integer receipttypeStatus;

    public Long getIdReceipttype() {
        return idReceipttype;
    }

    public void setIdReceipttype(Long idReceipttype) {
        this.idReceipttype = idReceipttype;
    }

    public String getReceipttypeName() {
        return receipttypeName;
    }

    public void setReceipttypeName(String receipttypeName) {
        this.receipttypeName = receipttypeName == null ? null : receipttypeName.trim();
    }

    public String getReceipttypeCode() {
        return receipttypeCode;
    }

    public void setReceipttypeCode(String receipttypeCode) {
        this.receipttypeCode = receipttypeCode == null ? null : receipttypeCode.trim();
    }

    public String getReceipttypeOutput() {
        return receipttypeOutput;
    }

    public void setReceipttypeOutput(String receipttypeOutput) {
        this.receipttypeOutput = receipttypeOutput == null ? null : receipttypeOutput.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getReceipttypecodex() {
        return receipttypecodex;
    }

    public void setReceipttypecodex(String receipttypecodex) {
        this.receipttypecodex = receipttypecodex == null ? null : receipttypecodex.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getfBuiltin() {
        return fBuiltin;
    }

    public void setfBuiltin(Integer fBuiltin) {
        this.fBuiltin = fBuiltin;
    }

    public Date getReceipttypeCreatetime() {
        return receipttypeCreatetime;
    }

    public void setReceipttypeCreatetime(Date receipttypeCreatetime) {
        this.receipttypeCreatetime = receipttypeCreatetime;
    }

    public Date getReceipttypeUpdatetime() {
        return receipttypeUpdatetime;
    }

    public void setReceipttypeUpdatetime(Date receipttypeUpdatetime) {
        this.receipttypeUpdatetime = receipttypeUpdatetime;
    }

    public Integer getReceipttypeStatus() {
        return receipttypeStatus;
    }

    public void setReceipttypeStatus(Integer receipttypeStatus) {
        this.receipttypeStatus = receipttypeStatus;
    }
}