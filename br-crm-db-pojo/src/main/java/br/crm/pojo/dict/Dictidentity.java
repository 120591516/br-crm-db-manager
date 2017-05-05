package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *身份
 */
public class Dictidentity implements Serializable {
    private Integer idIdentity;

    private String identityName;

    private String identityCode;

    private String inputCode;

    private Boolean priorityIndicator;

    private Boolean militaryIndicator;

    private String identitycodex;

    private Date idIdentityCreatetime;

    private Date idIdentityUpdatetime;

    private Integer idIdentityStatus;

    public Integer getIdIdentity() {
        return idIdentity;
    }

    public void setIdIdentity(Integer idIdentity) {
        this.idIdentity = idIdentity;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public Boolean getPriorityIndicator() {
        return priorityIndicator;
    }

    public void setPriorityIndicator(Boolean priorityIndicator) {
        this.priorityIndicator = priorityIndicator;
    }

    public Boolean getMilitaryIndicator() {
        return militaryIndicator;
    }

    public void setMilitaryIndicator(Boolean militaryIndicator) {
        this.militaryIndicator = militaryIndicator;
    }

    public String getIdentitycodex() {
        return identitycodex;
    }

    public void setIdentitycodex(String identitycodex) {
        this.identitycodex = identitycodex == null ? null : identitycodex.trim();
    }

    public Date getIdIdentityCreatetime() {
        return idIdentityCreatetime;
    }

    public void setIdIdentityCreatetime(Date idIdentityCreatetime) {
        this.idIdentityCreatetime = idIdentityCreatetime;
    }

    public Date getIdIdentityUpdatetime() {
        return idIdentityUpdatetime;
    }

    public void setIdIdentityUpdatetime(Date idIdentityUpdatetime) {
        this.idIdentityUpdatetime = idIdentityUpdatetime;
    }

    public Integer getIdIdentityStatus() {
        return idIdentityStatus;
    }

    public void setIdIdentityStatus(Integer idIdentityStatus) {
        this.idIdentityStatus = idIdentityStatus;
    }
}