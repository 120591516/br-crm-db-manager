package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 结论ICD10
 *
 */
public class Dicticd10 implements Serializable {
    private Long dicticd10Id;

    private String idtodepart;

    private String idupdate;

    private String icdclass;

    private String icdcode;

    private String icdcodea;

    private String icdcname;

    private String icdename;

    private String icdpyt;

    private String icdother;

    private String updateoper;

    private Date updatetime;

    private String icdnote;

    private String code;

    private String tag;

    private String inputCode;

    private Date dicticd10Createtime;

    private Date dicticd10Updatetime;

    private Integer dicticd10Status;

    public Long getDicticd10Id() {
        return dicticd10Id;
    }

    public void setDicticd10Id(Long dicticd10Id) {
        this.dicticd10Id = dicticd10Id;
    }

    public String getIdtodepart() {
        return idtodepart;
    }

    public void setIdtodepart(String idtodepart) {
        this.idtodepart = idtodepart == null ? null : idtodepart.trim();
    }

    public String getIdupdate() {
        return idupdate;
    }

    public void setIdupdate(String idupdate) {
        this.idupdate = idupdate == null ? null : idupdate.trim();
    }

    public String getIcdclass() {
        return icdclass;
    }

    public void setIcdclass(String icdclass) {
        this.icdclass = icdclass == null ? null : icdclass.trim();
    }

    public String getIcdcode() {
        return icdcode;
    }

    public void setIcdcode(String icdcode) {
        this.icdcode = icdcode == null ? null : icdcode.trim();
    }

    public String getIcdcodea() {
        return icdcodea;
    }

    public void setIcdcodea(String icdcodea) {
        this.icdcodea = icdcodea == null ? null : icdcodea.trim();
    }

    public String getIcdcname() {
        return icdcname;
    }

    public void setIcdcname(String icdcname) {
        this.icdcname = icdcname == null ? null : icdcname.trim();
    }

    public String getIcdename() {
        return icdename;
    }

    public void setIcdename(String icdename) {
        this.icdename = icdename == null ? null : icdename.trim();
    }

    public String getIcdpyt() {
        return icdpyt;
    }

    public void setIcdpyt(String icdpyt) {
        this.icdpyt = icdpyt == null ? null : icdpyt.trim();
    }

    public String getIcdother() {
        return icdother;
    }

    public void setIcdother(String icdother) {
        this.icdother = icdother == null ? null : icdother.trim();
    }

    public String getUpdateoper() {
        return updateoper;
    }

    public void setUpdateoper(String updateoper) {
        this.updateoper = updateoper == null ? null : updateoper.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getIcdnote() {
        return icdnote;
    }

    public void setIcdnote(String icdnote) {
        this.icdnote = icdnote == null ? null : icdnote.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public Date getDicticd10Createtime() {
        return dicticd10Createtime;
    }

    public void setDicticd10Createtime(Date dicticd10Createtime) {
        this.dicticd10Createtime = dicticd10Createtime;
    }

    public Date getDicticd10Updatetime() {
        return dicticd10Updatetime;
    }

    public void setDicticd10Updatetime(Date dicticd10Updatetime) {
        this.dicticd10Updatetime = dicticd10Updatetime;
    }

    public Integer getDicticd10Status() {
        return dicticd10Status;
    }

    public void setDicticd10Status(Integer dicticd10Status) {
        this.dicticd10Status = dicticd10Status;
    }
}