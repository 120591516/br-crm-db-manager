package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *职业
 */
public class Dictoccupation implements Serializable{
    private Integer idOccupation;

    private String occupationName;

    private String occupationCode;

    private String inputCode;

    private String note;

    private String occupationcodex;

    private Date occupationCreatetime;

    private Date occupationUpdatetime;

    private Integer occupationStatus;

    public Integer getIdOccupation() {
        return idOccupation;
    }

    public void setIdOccupation(Integer idOccupation) {
        this.idOccupation = idOccupation;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName == null ? null : occupationName.trim();
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
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

    public String getOccupationcodex() {
        return occupationcodex;
    }

    public void setOccupationcodex(String occupationcodex) {
        this.occupationcodex = occupationcodex == null ? null : occupationcodex.trim();
    }

    public Date getOccupationCreatetime() {
        return occupationCreatetime;
    }

    public void setOccupationCreatetime(Date occupationCreatetime) {
        this.occupationCreatetime = occupationCreatetime;
    }

    public Date getOccupationUpdatetime() {
        return occupationUpdatetime;
    }

    public void setOccupationUpdatetime(Date occupationUpdatetime) {
        this.occupationUpdatetime = occupationUpdatetime;
    }

    public Integer getOccupationStatus() {
        return occupationStatus;
    }

    public void setOccupationStatus(Integer occupationStatus) {
        this.occupationStatus = occupationStatus;
    }
}