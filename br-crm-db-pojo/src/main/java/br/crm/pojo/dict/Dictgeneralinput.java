package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *通用输入模板
 */
public class Dictgeneralinput implements Serializable{
    private Integer idGeneralinput;

    private String generalinputTypename;

    private String generalinputTypecode;

    private String generalinputName;

    private String inputCode;

    private Date generalinputCreatetime;

    private Date generalinputUpdatetime;

    private Integer generalinputStatus;

    private String generalinputText;

    public Integer getIdGeneralinput() {
        return idGeneralinput;
    }

    public void setIdGeneralinput(Integer idGeneralinput) {
        this.idGeneralinput = idGeneralinput;
    }

    public String getGeneralinputTypename() {
        return generalinputTypename;
    }

    public void setGeneralinputTypename(String generalinputTypename) {
        this.generalinputTypename = generalinputTypename == null ? null : generalinputTypename.trim();
    }

    public String getGeneralinputTypecode() {
        return generalinputTypecode;
    }

    public void setGeneralinputTypecode(String generalinputTypecode) {
        this.generalinputTypecode = generalinputTypecode == null ? null : generalinputTypecode.trim();
    }

    public String getGeneralinputName() {
        return generalinputName;
    }

    public void setGeneralinputName(String generalinputName) {
        this.generalinputName = generalinputName == null ? null : generalinputName.trim();
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    public Date getGeneralinputCreatetime() {
        return generalinputCreatetime;
    }

    public void setGeneralinputCreatetime(Date generalinputCreatetime) {
        this.generalinputCreatetime = generalinputCreatetime;
    }

    public Date getGeneralinputUpdatetime() {
        return generalinputUpdatetime;
    }

    public void setGeneralinputUpdatetime(Date generalinputUpdatetime) {
        this.generalinputUpdatetime = generalinputUpdatetime;
    }

    public Integer getGeneralinputStatus() {
        return generalinputStatus;
    }

    public void setGeneralinputStatus(Integer generalinputStatus) {
        this.generalinputStatus = generalinputStatus;
    }

    public String getGeneralinputText() {
        return generalinputText;
    }

    public void setGeneralinputText(String generalinputText) {
        this.generalinputText = generalinputText == null ? null : generalinputText.trim();
    }
}