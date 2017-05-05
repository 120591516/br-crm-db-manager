package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictpayway implements Serializable {
    private Long idPayway;

    private String paywayName;

    private String paywayCode;

    private String keypayway;

    private String paywaycodex;

    private Integer fIscash;

    private Integer fIsoffline;

    private Integer fApplytoaccountonly;

    private Integer fApplytoOutp;

    private Integer fApplytoInp;

    private Integer fApplytoOrg;

    private Integer fApplytoPerson;

    private Integer fReturntocash;

    private Integer fBuiltin;

    private Integer fDisabled;

    private String inputCode;

    private String note;

    private Integer idReceipttypeOrg;

    private Integer idReceipttypePerson;

    private Integer status;

    private Date createTime;

    private Date editTime;

    public Long getIdPayway() {
        return idPayway;
    }

    public void setIdPayway(Long idPayway) {
        this.idPayway = idPayway;
    }

    public String getPaywayName() {
        return paywayName;
    }

    public void setPaywayName(String paywayName) {
        this.paywayName = paywayName == null ? null : paywayName.trim();
    }

    public String getPaywayCode() {
        return paywayCode;
    }

    public void setPaywayCode(String paywayCode) {
        this.paywayCode = paywayCode == null ? null : paywayCode.trim();
    }

    public String getKeypayway() {
        return keypayway;
    }

    public void setKeypayway(String keypayway) {
        this.keypayway = keypayway == null ? null : keypayway.trim();
    }

    public String getPaywaycodex() {
        return paywaycodex;
    }

    public void setPaywaycodex(String paywaycodex) {
        this.paywaycodex = paywaycodex == null ? null : paywaycodex.trim();
    }

    public Integer getfIscash() {
        return fIscash;
    }

    public void setfIscash(Integer fIscash) {
        this.fIscash = fIscash;
    }

    public Integer getfIsoffline() {
        return fIsoffline;
    }

    public void setfIsoffline(Integer fIsoffline) {
        this.fIsoffline = fIsoffline;
    }

    public Integer getfApplytoaccountonly() {
        return fApplytoaccountonly;
    }

    public void setfApplytoaccountonly(Integer fApplytoaccountonly) {
        this.fApplytoaccountonly = fApplytoaccountonly;
    }

    public Integer getfApplytoOutp() {
        return fApplytoOutp;
    }

    public void setfApplytoOutp(Integer fApplytoOutp) {
        this.fApplytoOutp = fApplytoOutp;
    }

    public Integer getfApplytoInp() {
        return fApplytoInp;
    }

    public void setfApplytoInp(Integer fApplytoInp) {
        this.fApplytoInp = fApplytoInp;
    }

    public Integer getfApplytoOrg() {
        return fApplytoOrg;
    }

    public void setfApplytoOrg(Integer fApplytoOrg) {
        this.fApplytoOrg = fApplytoOrg;
    }

    public Integer getfApplytoPerson() {
        return fApplytoPerson;
    }

    public void setfApplytoPerson(Integer fApplytoPerson) {
        this.fApplytoPerson = fApplytoPerson;
    }

    public Integer getfReturntocash() {
        return fReturntocash;
    }

    public void setfReturntocash(Integer fReturntocash) {
        this.fReturntocash = fReturntocash;
    }

    public Integer getfBuiltin() {
        return fBuiltin;
    }

    public void setfBuiltin(Integer fBuiltin) {
        this.fBuiltin = fBuiltin;
    }

    public Integer getfDisabled() {
        return fDisabled;
    }

    public void setfDisabled(Integer fDisabled) {
        this.fDisabled = fDisabled;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getIdReceipttypeOrg() {
        return idReceipttypeOrg;
    }

    public void setIdReceipttypeOrg(Integer idReceipttypeOrg) {
        this.idReceipttypeOrg = idReceipttypeOrg;
    }

    public Integer getIdReceipttypePerson() {
        return idReceipttypePerson;
    }

    public void setIdReceipttypePerson(Integer idReceipttypePerson) {
        this.idReceipttypePerson = idReceipttypePerson;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}