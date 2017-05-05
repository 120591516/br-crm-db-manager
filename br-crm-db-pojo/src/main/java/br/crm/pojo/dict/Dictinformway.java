package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *通知方式
 */
public class Dictinformway implements Serializable {
    private Integer idInformway;

    private String informwayName;

    private String informwayCode;

    private String inputCode;

    private String informwaycodex;

    private Boolean fBuiltin;

    private Date informwayCreatetime;

    private Date informwayUpdatetime;

    private Integer informwayStatus;

    public Integer getIdInformway() {
        return idInformway;
    }

    public void setIdInformway(Integer idInformway) {
        this.idInformway = idInformway;
    }

    public String getInformwayName() {
        return informwayName;
    }

    public void setInformwayName(String informwayName) {
        this.informwayName = informwayName == null ? null : informwayName.trim();
    }

    public String getInformwayCode() {
        return informwayCode;
    }

    public void setInformwayCode(String informwayCode) {
        this.informwayCode = informwayCode == null ? null : informwayCode.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public String getInformwaycodex() {
        return informwaycodex;
    }

    public void setInformwaycodex(String informwaycodex) {
        this.informwaycodex = informwaycodex == null ? null : informwaycodex.trim();
    }

    public Boolean getfBuiltin() {
        return fBuiltin;
    }

    public void setfBuiltin(Boolean fBuiltin) {
        this.fBuiltin = fBuiltin;
    }

    public Date getInformwayCreatetime() {
        return informwayCreatetime;
    }

    public void setInformwayCreatetime(Date informwayCreatetime) {
        this.informwayCreatetime = informwayCreatetime;
    }

    public Date getInformwayUpdatetime() {
        return informwayUpdatetime;
    }

    public void setInformwayUpdatetime(Date informwayUpdatetime) {
        this.informwayUpdatetime = informwayUpdatetime;
    }

    public Integer getInformwayStatus() {
        return informwayStatus;
    }

    public void setInformwayStatus(Integer informwayStatus) {
        this.informwayStatus = informwayStatus;
    }
}